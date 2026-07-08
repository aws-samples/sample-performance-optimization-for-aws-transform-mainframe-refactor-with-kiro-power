package aws.bluage.carddemo.program;

import aws.bluage.carddemo.SpringBootLauncher;
import aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rContext;
import aws.bluage.carddemo.cdcus02r.service.Cdcus02rProcess;
import com.netfective.bluage.gapwalk.rt.blu4iv.program.Blu4IvProgram;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.context.ActivationGroupManager;
import com.netfective.bluage.gapwalk.rt.context.Context;
import com.netfective.bluage.gapwalk.rt.context.ProgramContextStore;
import com.netfective.bluage.gapwalk.rt.shared.ExecutionContext;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.sql.DataSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Reference the spring application of program CDCUS02R.
 *  Provides an access to the contained program for the run unit.
 */
@Component
@Import({
	aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rConfiguration.class,
	aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rContext.class,
	aws.bluage.carddemo.cdcus02r.service.impl.Cdcus02rProcessImpl.class
})
@Lazy
public class Cdcus02r extends Blu4IvProgram {
	/**
	 * Unique identifiers for the contained program.
	 */
	private static final Set<String> programIdentifiers = Collections.unmodifiableSet(Stream.of("CDCUS02R").collect(Collectors.toSet()));

	/**
	 * Main program identifier for the contained program.
	 */
	private static final String programIdentifier = "CDCUS02R";
	@Autowired
	PlatformTransactionManager transactionManager;
	
	@Autowired
	Map<String, DataSource> datasources;
	@Autowired
	BeanFactory beanFactory;
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigurableApplicationContext getSpringApplication() {
		return SpringBootLauncher.getCac();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void updateExecutionContext(ExecutionContext executionContext) {
		executionContext.setDatasources(datasources);
		executionContext.setDatabaseSupport(ExecutionContext.DatabaseSupport.POSTGRE);
		executionContext.setSqlcaVersion(ExecutionContext.SqlcaVersion.getEnum("ansi-comp5"));
		executionContext.setTransactionManager(transactionManager);
		executionContext.setUseSQLDateNewParadigm(true);
		executionContext.setUseSQLTrimStringType(false);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<String> getProgramIdentifiers() {
		return programIdentifiers;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getProgramMainIdentifier() {
		return programIdentifier;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public Context getContext() {
		return ProgramContextStore.getOrCreate(
		getProgramMainIdentifier(),
		aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rContext.class,
		beanFactory);
	}
	
	/**
	 * Service used by the program runner.
	 */
	@Autowired
	@Qualifier("aws.bluage.carddemo.cdcus02r.service.Cdcus02rProcess")
	private Cdcus02rProcess instanceCdcus02rProcess;
	
	@Override
	public void run(ExecutionController ctrl) {
		instanceCdcus02rProcess.main((Cdcus02rContext) getContext(), ctrl);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getProgramActivationGroup() {
		return ActivationGroupManager.CALLER_ACTIVATION;
	}

}
