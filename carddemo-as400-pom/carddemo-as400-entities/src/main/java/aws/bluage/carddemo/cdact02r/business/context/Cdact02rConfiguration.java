package aws.bluage.carddemo.cdact02r.business.context;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration.LegacySystem;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration.ZonedMode;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.ConfigurationBuilder;
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * Creates Datasimplifier configuration for the Cdact02rContext context.
 */
@org.springframework.context.annotation.Configuration
@Lazy
public class Cdact02rConfiguration {

	
	@Bean(name = "Cdact02rContextConfiguration")
	public Configuration configuration() {
		return new ConfigurationBuilder()
				.encoding(Charset.forName("CP1047"))
				.zonedMode(ZonedMode.AS400)
				.legacySystem(LegacySystem.AS400)
				.build();
	}

}
