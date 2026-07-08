package aws.bluage.carddemo.cdrpt02r.business.context;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration.LegacySystem;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration.ZonedMode;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.ConfigurationBuilder;
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * Creates Datasimplifier configuration for the Cdrpt02rContext context.
 */
@org.springframework.context.annotation.Configuration
@Lazy
public class Cdrpt02rConfiguration {

	
	@Bean(name = "Cdrpt02rContextConfiguration")
	public Configuration configuration() {
		return new ConfigurationBuilder()
				.encoding(Charset.forName("CP1047"))
				.zonedMode(ZonedMode.AS400)
				.legacySystem(LegacySystem.AS400)
				.build();
	}

}
