package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PointerType;
/**
 * Data simplifier entity Dsshindds_pointer.
 * 
 * <p>About 'dsshindds_pointer' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dsshindds_pointer extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dsshindds_pointer = new Elementary(root,new PointerType(getConfiguration()),"");
	
	/**
	 * Instantiate a new Dsshindds_pointer with a default record.
	 * @param configuration the configuration
	 */
	public Dsshindds_pointer(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Dsshindds_pointer bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dsshindds_pointer(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dsshindds_pointer.
	 * @return the dsshindds_pointer attribute reference
	 */
	public ElementaryRangeReference getDsshindds_pointerReference() {
		return dsshindds_pointer.getReference();
	}

	/**
	 * Getter for dsshindds_pointer attribute.
	 * @return dsshindds_pointer attribute
	 */
	public Integer getDsshindds_pointer() {
		return dsshindds_pointer.getValue();
	}

	/**
	 * Setter for dsshindds_pointer attribute.
	 * @param dsshindds_pointer the new value of dsshindds_pointer
	 */
	public void setDsshindds_pointer(Integer dsshindds_pointer) {
		this.dsshindds_pointer.setValue(dsshindds_pointer);
	}
}
