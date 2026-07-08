package aws.bluage.carddemo.cdact01r.business.context;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration.LegacySystem;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration.ZonedMode;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.ConfigurationBuilder;
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * Creates Datasimplifier configuration for the Cdact01rContext context.
 */
@org.springframework.context.annotation.Configuration
@Lazy
public class Cdact01rConfiguration {

	
	@Bean(name = "Cdact01rContextConfiguration")
	public Configuration configuration() {
		return new ConfigurationBuilder()
				.encoding(Charset.forName("CP1047"))
				.zonedMode(ZonedMode.AS400)
				.legacySystem(LegacySystem.AS400)
				.build();
	}

}
