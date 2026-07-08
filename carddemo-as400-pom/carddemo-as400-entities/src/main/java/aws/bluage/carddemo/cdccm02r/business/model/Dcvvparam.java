package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Dcvvparam.
 * 
 * <p>About 'dcvvparam' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dcvvparam extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dcvvparam = new Elementary(root,new PackedType(3, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Dcvvparam with a default record.
	 * @param configuration the configuration
	 */
	public Dcvvparam(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Dcvvparam bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dcvvparam(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dcvvparam.
	 * @return the dcvvparam attribute reference
	 */
	public ElementaryRangeReference getDcvvparamReference() {
		return dcvvparam.getReference();
	}

	/**
	 * Getter for dcvvparam attribute.
	 * @return dcvvparam attribute
	 */
	public int getDcvvparam() {
		return dcvvparam.getValue();
	}

	/**
	 * Setter for dcvvparam attribute.
	 * @param dcvvparam the new value of dcvvparam
	 */
	public void setDcvvparam(int dcvvparam) {
		this.dcvvparam.setValue(dcvvparam);
	}
}
