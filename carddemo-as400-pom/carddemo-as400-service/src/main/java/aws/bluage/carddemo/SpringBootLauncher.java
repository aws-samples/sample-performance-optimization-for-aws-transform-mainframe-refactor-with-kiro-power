package aws.bluage.carddemo;

import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.core.helper.ConfigurationHelper;
import aws.bluage.carddemo.program.utils.SpringBootApplicationBanner;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import com.netfective.bluage.gapwalk.io.support.FileConfigurationUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.call.internal.UserDefinedParameters;
import com.netfective.bluage.gapwalk.rt.context.ApplicationContextRegistry;
import com.netfective.bluage.gapwalk.rt.context.ProgramContextStore;
import com.netfective.bluage.gapwalk.rt.io.support.FileConfiguration;
import com.netfective.bluage.gapwalk.rt.provider.CustomComponentsURLRegistry;
import com.netfective.bluage.gapwalk.rt.provider.LogicalProgramRegistry;
import com.netfective.bluage.gapwalk.rt.provider.ProgramContainer;
import com.netfective.bluage.gapwalk.rt.provider.ProgramRegistry;
import com.netfective.bluage.gapwalk.rt.provider.ServiceContainer;
import com.netfective.bluage.gapwalk.rt.provider.ServiceRegistry;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJndi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
/**
 * SpringBoot web application launcher.
 * Entry point for Tomcat deployment and programs/services/scripts registration.
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"aws.bluage.carddemo.program", "aws.bluage.carddemo.core","com.netfective.bluage.gapwalk.io.support"
,"aws.bluage.carddemo.common.business.database","com.netfective.bluage.gapwalk.rt.blu4iv", "com.netfective.bluage.gapwalk.dataarea.support", "com.netfective.bluage.gapwalk.userspace.support"},
excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com\\.netfective\\.bluage\\.gapwalk\\.rt\\.blu4iv\\.lock\\..*") })
@EntityScan(basePackages = {"aws.bluage.carddemo.common.business.database", "com.netfective.bluage.gapwalk.dataarea.support.entity", "com.netfective.bluage.gapwalk.userspace.support.entity"})
@EnableTransactionManagement
@EnableJpaAuditing
@EnableConfigurationProperties
public class SpringBootLauncher extends SpringBootServletInitializer implements WebApplicationInitializer {
	// Logger declaration.
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLauncher.class );

	/**
	 * The spring web application context. The parent context of all sub programs.
	 */
	private static ConfigurableApplicationContext applicationContext;

	@Autowired
	BeanFactory beanFactory;
	
	/**
	 * Flag to enable warmup of the pre construct of contexts.
	 */
	@Value("${context.warmup.enabled:false}")
	private boolean contextWarmupEnabled;

	/**
	 * How to treat sign nibble of packed data
	 * 
	 * False uses value of 0x0c
	 * True uses value of 0x0f
	 */
	@Value("${runtime.blu4ivPackedNibbleMode:true}")
	private boolean blu4ivPackedNibbleMode;
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.banner(new SpringBootApplicationBanner("carddemo-as400")).profiles("carddemo-as400").sources(SpringBootLauncher.class);
	}

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		applicationContext = application.run();
		return (WebApplicationContext) applicationContext;
	}
	
	/**
	 * Get spring web application context.
	 * @return the spring web application context
	 */
	public static ConfigurableApplicationContext getCac() {
		return applicationContext;
	}
	
	/**
	 * Setup default file configurations.
	 * @param configurationHelper the configuration helper
	 * @return file configurations
	 */
	@Bean
	public Map<String, FileConfiguration> fileConfigurations(ConfigurationHelper configurationHelper) {
		return new FileConfigurationUtils().createFileConfigurationFromMap(configurationHelper.getFilesConfiguration()).getFileConfigurations();
	}	
	
	/**
	 * Setup a JNDI datasource.
	 * Will be shared with sub programs and used by modernized ExecSQL statements.
	 * @return a datasource
	 */
	@ConditionalOnJndi(value = "java:comp/env/jdbc/blu4iv")
	@Bean(name = "primaryDataSource")
	@Primary
	public DataSource primaryJndiDataSource() {
		return (new JndiDataSourceLookup()).getDataSource("java:comp/env/jdbc/blu4iv");
	}
	
	/**
	 * Build a data source properties.
	 * @return a DataSourceProperties
	 */
	@ConditionalOnMissingBean(name = "primaryDataSource")
	@Bean(destroyMethod = "")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.primary")
	public DataSourceProperties primaryDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	/**
	 * Setup a datasource.
	 * Will be shared with sub programs and used by modernized ExecSQL statements.
	 * @return a datasource
	 */
	@DependsOn("primaryDataSourceProperties")
	@ConditionalOnMissingBean(name = "primaryDataSource")
	@Bean(name = "primaryDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.primary")
	public DataSource primaryDataSource() {
		return primaryDataSourceProperties().initializeDataSourceBuilder().build();
	}
	
		
	

	/**
	 * Initialization method called when the spring application is ready.
	 * Register all programs and services to the gapwalk shared context.
	 * @param event the application ready event
	 */
	@EventListener
	public void initialize(ApplicationReadyEvent event) {
	    UserDefinedParameters.setAddressingMode(31);
		Map<String, ProgramContainer> programContainers = event.getApplicationContext().getBeansOfType(ProgramContainer.class);
		programContainers.values().forEach(ProgramRegistry::registerProgram);
		LogicalProgramRegistry.setAppContext(event.getApplicationContext());
		LogicalProgramRegistry.getLogicalPrograms().forEach(ProgramRegistry::registerLogicalProgram);
		Map<String, ServiceContainer> serviceContainers = event.getApplicationContext().getBeansOfType(ServiceContainer.class);
		serviceContainers.values().forEach(ServiceRegistry::registerService);
		
		if (contextWarmupEnabled) {
			ProgramContextStore.preloadAllContexts(event.getApplicationContext(), beanFactory);
		}
		
		enlistCustomJars(event);
		
		// register the current context
		ApplicationContext context = event.getApplicationContext();
		ApplicationContextRegistry.registerContext(ApplicationContextRegistry.SERVICE, context);
		
		PackedType.setBlu4ivSignMode(blu4ivPackedNibbleMode);

		// set flag for blu4iv applications
		UserDefinedParameters.setBlu4ivApp();
		
		
	}
	
	@ConditionalOnJndi(value={"java:comp/env/jdbc/blu4iv","jdbc/blu4iv"})
	@Bean
	public DataSource blu4ivDataSource(){
		JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
		// This will try with and without the java:comp/env prefix
		return dataSourceLookup.getDataSource("jdbc/blu4iv");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan("aws.bluage.carddemo.common.business.database","com.netfective.bluage.gapwalk.dataarea.support.entity", "com.netfective.bluage.gapwalk.userspace.support.entity");
		factory.setDataSource(blu4ivDataSource());

		//factory.getJpaPropertyMap().put(Environment.SHOW_SQL, "true");
		return factory;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void storeDaos() {
		DAOManager.registerDAO(FileIds.CDACTP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdactp.CdactpCdactprDao.class));
		DAOManager.registerDAO(FileIds.CDACTR01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdactr01.Cdactr01CdactprDao.class));
		DAOManager.registerDAO(FileIds.CDACTR02, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdactr02.Cdactr02CdactprDao.class));
		DAOManager.registerDAO(FileIds.CDACTR03, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdactr03.Cdactr03CdactprDao.class));
		DAOManager.registerDAO(FileIds.CDACTR04, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdactr04.Cdactr04CdactprDao.class));
		DAOManager.registerDAO(FileIds.CDACTU01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdactu01.Cdactu01CdactprDao.class));
		DAOManager.registerDAO(FileIds.CDAUTP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdautp.CdautpCdautprDao.class));
		DAOManager.registerDAO(FileIds.CDAUTR01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdautr01.Cdautr01CdautprDao.class));
		DAOManager.registerDAO(FileIds.CDAUTR02, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdautr02.Cdautr02CdautprDao.class));
		DAOManager.registerDAO(FileIds.CDAUTR03, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdautr03.Cdautr03CdautprDao.class));
		DAOManager.registerDAO(FileIds.CDAUTU01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdautu01.Cdautu01CdautprDao.class));
		DAOManager.registerDAO(FileIds.CDBALP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdbalp.CdbalpCdbalprDao.class));
		DAOManager.registerDAO(FileIds.CDCCAP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdccap.CdccapCdccaprDao.class));
		DAOManager.registerDAO(FileIds.CDCCAR01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdccar01.Cdccar01CdccaprDao.class));
		DAOManager.registerDAO(FileIds.CDCCAU01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdccau01.Cdccau01CdccaprDao.class));
		DAOManager.registerDAO(FileIds.CDCCMP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdccmp.CdccmpCdccmprDao.class));
		DAOManager.registerDAO(FileIds.CDCCMR01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdccmr01.Cdccmr01CdccmprDao.class));
		DAOManager.registerDAO(FileIds.CDCCMR02, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdccmr02.Cdccmr02CdccmprDao.class));
		DAOManager.registerDAO(FileIds.CDCCMU01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdccmu01.Cdccmu01CdccmprDao.class));
		DAOManager.registerDAO(FileIds.CDCUSP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdcusp.CdcuspCdcusprDao.class));
		DAOManager.registerDAO(FileIds.CDCUSR01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdcusr01.Cdcusr01CdcusprDao.class));
		DAOManager.registerDAO(FileIds.CDCUSU01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdcusu01.Cdcusu01CdcusprDao.class));
		DAOManager.registerDAO(FileIds.CDMMF001P, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdmmf001p.Cdmmf001pCdmmf001pDao.class));
		DAOManager.registerDAO(FileIds.CDSTCP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdstcp.CdstcpCdstaprDao.class));
		DAOManager.registerDAO(FileIds.CDTRNP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdtrnp.CdtrnpCdtrnprDao.class));
		DAOManager.registerDAO(FileIds.CDTRNR01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdtrnr01.Cdtrnr01CdtrnprDao.class));
		DAOManager.registerDAO(FileIds.CDTRNR02, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdtrnr02.Cdtrnr02CdtrnprDao.class));
		DAOManager.registerDAO(FileIds.CDTRNR03, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdtrnr03.Cdtrnr03CdtrnprDao.class));
		DAOManager.registerDAO(FileIds.CDTRNU01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdtrnu01.Cdtrnu01CdtrnprDao.class));
		DAOManager.registerDAO(FileIds.CDUSRP, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdusrp.CdusrpCdusrprDao.class));
		DAOManager.registerDAO(FileIds.CDUSRR01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdusrr01.Cdusrr01CdusrprDao.class));
		DAOManager.registerDAO(FileIds.CDUSRR02, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdusrr02.Cdusrr02CdusrprDao.class));
		DAOManager.registerDAO(FileIds.CDUSRU01, () -> beanFactory.getBean(aws.bluage.carddemo.common.business.database.cdusru01.Cdusru01CdusrprDao.class));
	}
	
	private void enlistCustomJars(ApplicationReadyEvent event) {
		try {
			File folder = event.getApplicationContext().getResource("/WEB-INF/lib").getFile();
			File[] customJars = folder.listFiles(j -> j.getName().endsWith(".jar"));
			if(customJars != null && customJars.length > 0) {
				for (File customJar : customJars) {
					LOGGER.info("Adding {} to groovy classpath", customJar.toURI().toURL());
					CustomComponentsURLRegistry.addURL(customJar.toURI().toURL());
				}
			}
		} catch (IOException ioe) {
			LOGGER.error("Unable to enlist custom jars", ioe);
		}
	}
}
