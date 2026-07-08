package aws.bluage.carddemo.cdcus02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Changecomplete.
 * 
 * <p>About 'changecomplete' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Changecomplete extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary changecomplete = new Elementary(root,new AlphanumericType(1),"0");
	
	/**
	 * Instantiate a new Changecomplete with a default record.
	 * @param configuration the configuration
	 */
	public Changecomplete(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Changecomplete bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Changecomplete(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute changecomplete.
	 * @return the changecomplete attribute reference
	 */
	public ElementaryRangeReference getChangecompleteReference() {
		return changecomplete.getReference();
	}

	/**
	 * Getter for changecomplete attribute.
	 * @return changecomplete attribute
	 */
	public String getChangecomplete() {
		return changecomplete.getValue();
	}

	/**
	 * Setter for changecomplete attribute.
	 * @param changecomplete the new value of changecomplete
	 */
	public void setChangecomplete(String changecomplete) {
		this.changecomplete.setValue(changecomplete);
	}
}
