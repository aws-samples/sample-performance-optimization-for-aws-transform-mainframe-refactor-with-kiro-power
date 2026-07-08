package aws.bluage.carddemo.program.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netfective.bluage.gapwalk.rt.blu4iv.DatabaseObjectRegistry;
import com.netfective.bluage.gapwalk.rt.blu4iv.model.DatabaseInfo;
import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Load the JSON representation of the Database info.
 */
@Component
public class DatabaseInfoRegistrable extends ResourceRegistrable {

	/**
	 * The Constant logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseInfoRegistrable.class);
	
	/**
	 * Instantiates a new database info loader.
	 */
	public DatabaseInfoRegistrable() {
		super("dbinfo", "Database info file", "/dbinfo/**/*.json");
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		// Nothing to do
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		try {
			DatabaseInfo dbInfo = new ObjectMapper().readValue(file, DatabaseInfo.class);
			// Add to registry
			DatabaseObjectRegistry.registerObjects(dbInfo);
		} catch (IOException e) {
			LOGGER.error("Error when trying to register the resource {}", identifier, e);
		}
	}
}
