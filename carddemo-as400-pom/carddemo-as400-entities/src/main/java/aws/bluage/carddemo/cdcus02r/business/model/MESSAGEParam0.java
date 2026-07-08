package aws.bluage.carddemo.cdcus02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity MESSAGEParam0.
 * 
 * <p>About 'mESSAGEParam0' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class MESSAGEParam0 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary mESSAGEParam0 = new Elementary(root,new AlphanumericType(8));
	
	/**
	 * Instantiate a new MESSAGEParam0 with a default record.
	 * @param configuration the configuration
	 */
	public MESSAGEParam0(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new MESSAGEParam0 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public MESSAGEParam0(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute mESSAGEParam0.
	 * @return the mESSAGEParam0 attribute reference
	 */
	public ElementaryRangeReference getMESSAGEParam0Reference() {
		return mESSAGEParam0.getReference();
	}

	/**
	 * Getter for mESSAGEParam0 attribute.
	 * @return mESSAGEParam0 attribute
	 */
	public String getMESSAGEParam0() {
		return mESSAGEParam0.getValue();
	}

	/**
	 * Setter for mESSAGEParam0 attribute.
	 * @param mESSAGEParam0 the new value of mESSAGEParam0
	 */
	public void setMESSAGEParam0(String mESSAGEParam0) {
		this.mESSAGEParam0.setValue(mESSAGEParam0);
	}
}
