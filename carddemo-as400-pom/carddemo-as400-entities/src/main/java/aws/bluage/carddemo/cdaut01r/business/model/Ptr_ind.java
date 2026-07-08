package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PointerType;
/**
 * Data simplifier entity Ptr_ind.
 * 
 * <p>About 'ptr_ind' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ptr_ind extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ptr_ind = new Elementary(root,new PointerType(getConfiguration()),"");
	
	/**
	 * Instantiate a new Ptr_ind with a default record.
	 * @param configuration the configuration
	 */
	public Ptr_ind(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Ptr_ind bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Ptr_ind(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ptr_ind.
	 * @return the ptr_ind attribute reference
	 */
	public ElementaryRangeReference getPtr_indReference() {
		return ptr_ind.getReference();
	}

	/**
	 * Getter for ptr_ind attribute.
	 * @return ptr_ind attribute
	 */
	public Integer getPtr_ind() {
		return ptr_ind.getValue();
	}

	/**
	 * Setter for ptr_ind attribute.
	 * @param ptr_ind the new value of ptr_ind
	 */
	public void setPtr_ind(Integer ptr_ind) {
		this.ptr_ind.setValue(ptr_ind);
	}
}
