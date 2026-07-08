package aws.bluage.carddemo.cdcus02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Statechanged.
 * 
 * <p>About 'statechanged' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Statechanged extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary statechanged = new Elementary(root,new AlphanumericType(1),"0");
	
	/**
	 * Instantiate a new Statechanged with a default record.
	 * @param configuration the configuration
	 */
	public Statechanged(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Statechanged bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Statechanged(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute statechanged.
	 * @return the statechanged attribute reference
	 */
	public ElementaryRangeReference getStatechangedReference() {
		return statechanged.getReference();
	}

	/**
	 * Getter for statechanged attribute.
	 * @return statechanged attribute
	 */
	public String getStatechanged() {
		return statechanged.getValue();
	}

	/**
	 * Setter for statechanged attribute.
	 * @param statechanged the new value of statechanged
	 */
	public void setStatechanged(String statechanged) {
		this.statechanged.setValue(statechanged);
	}
}
