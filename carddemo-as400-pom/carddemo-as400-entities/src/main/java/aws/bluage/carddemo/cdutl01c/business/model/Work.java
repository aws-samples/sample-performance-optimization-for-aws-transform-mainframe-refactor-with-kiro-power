package aws.bluage.carddemo.cdutl01c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
/**
 * Data simplifier entity Work.
 * @see RecordEntity
 */
public class Work extends RecordEntity {

	private final Group root = new Group(getData()); 
	
	/**
	 * Instantiate a new Work with a default record.
	 * @param configuration the configuration
	 */
	public Work(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Work bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Work(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

}
