package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Up.
 * 
 * <p>About 'up' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Up extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary up = new Elementary(root,new AlphanumericType(1),"U");
	
	/**
	 * Instantiate a new Up with a default record.
	 * @param configuration the configuration
	 */
	public Up(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Up bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Up(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute up.
	 * @return the up attribute reference
	 */
	public ElementaryRangeReference getUpReference() {
		return up.getReference();
	}

	/**
	 * Getter for up attribute.
	 * @return up attribute
	 */
	public String getUp() {
		return up.getValue();
	}

	/**
	 * Setter for up attribute.
	 * @param up the new value of up
	 */
	public void setUp(String up) {
		this.up.setValue(up);
	}
}
