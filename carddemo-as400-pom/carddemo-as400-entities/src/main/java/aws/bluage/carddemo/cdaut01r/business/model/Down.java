package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Down.
 * 
 * <p>About 'down' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Down extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary down = new Elementary(root,new AlphanumericType(1),"D");
	
	/**
	 * Instantiate a new Down with a default record.
	 * @param configuration the configuration
	 */
	public Down(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Down bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Down(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute down.
	 * @return the down attribute reference
	 */
	public ElementaryRangeReference getDownReference() {
		return down.getReference();
	}

	/**
	 * Getter for down attribute.
	 * @return down attribute
	 */
	public String getDown() {
		return down.getValue();
	}

	/**
	 * Setter for down attribute.
	 * @param down the new value of down
	 */
	public void setDown(String down) {
		this.down.setValue(down);
	}
}
