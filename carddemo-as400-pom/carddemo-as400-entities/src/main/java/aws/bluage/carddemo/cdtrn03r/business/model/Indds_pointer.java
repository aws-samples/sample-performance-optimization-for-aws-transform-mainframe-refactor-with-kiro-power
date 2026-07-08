package aws.bluage.carddemo.cdtrn03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PointerType;
/**
 * Data simplifier entity Indds_pointer.
 * 
 * <p>About 'indds_pointer' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indds_pointer extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary indds_pointer = new Elementary(root,new PointerType(getConfiguration()),"");
	
	/**
	 * Instantiate a new Indds_pointer with a default record.
	 * @param configuration the configuration
	 */
	public Indds_pointer(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indds_pointer bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indds_pointer(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute indds_pointer.
	 * @return the indds_pointer attribute reference
	 */
	public ElementaryRangeReference getIndds_pointerReference() {
		return indds_pointer.getReference();
	}

	/**
	 * Getter for indds_pointer attribute.
	 * @return indds_pointer attribute
	 */
	public Integer getIndds_pointer() {
		return indds_pointer.getValue();
	}

	/**
	 * Setter for indds_pointer attribute.
	 * @param indds_pointer the new value of indds_pointer
	 */
	public void setIndds_pointer(Integer indds_pointer) {
		this.indds_pointer.setValue(indds_pointer);
	}
}
