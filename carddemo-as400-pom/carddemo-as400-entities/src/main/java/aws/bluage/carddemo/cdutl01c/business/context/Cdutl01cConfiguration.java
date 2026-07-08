package aws.bluage.carddemo.cdutl01c.business.context;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.ConfigurationBuilder;
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * Creates Datasimplifier configuration for the Cdutl01cContext context.
 */
@org.springframework.context.annotation.Configuration
@Lazy
public class Cdutl01cConfiguration {

	
	@Bean(name = "Cdutl01cContextConfiguration")
	public Configuration configuration() {
		return new ConfigurationBuilder()
				.encoding(Charset.forName("CP1047"))
				.build();
	}

}
