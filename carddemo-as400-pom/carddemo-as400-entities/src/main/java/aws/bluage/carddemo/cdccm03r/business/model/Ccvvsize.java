package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Ccvvsize.
 * 
 * <p>About 'ccvvsize' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ccvvsize extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ccvvsize = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("1000"));
	
	/**
	 * Instantiate a new Ccvvsize with a default record.
	 * @param configuration the configuration
	 */
	public Ccvvsize(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Ccvvsize bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Ccvvsize(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ccvvsize.
	 * @return the ccvvsize attribute reference
	 */
	public ElementaryRangeReference getCcvvsizeReference() {
		return ccvvsize.getReference();
	}

	/**
	 * Getter for ccvvsize attribute.
	 * @return ccvvsize attribute
	 */
	public int getCcvvsize() {
		return ccvvsize.getValue();
	}

	/**
	 * Setter for ccvvsize attribute.
	 * @param ccvvsize the new value of ccvvsize
	 */
	public void setCcvvsize(int ccvvsize) {
		this.ccvvsize.setValue(ccvvsize);
	}
}
