package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity SHOWMESSAGEParam0.
 * 
 * <p>About 'sHOWMESSAGEParam0' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class SHOWMESSAGEParam0 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary sHOWMESSAGEParam0 = new Elementary(root,new AlphanumericType(8));
	
	/**
	 * Instantiate a new SHOWMESSAGEParam0 with a default record.
	 * @param configuration the configuration
	 */
	public SHOWMESSAGEParam0(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new SHOWMESSAGEParam0 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public SHOWMESSAGEParam0(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute sHOWMESSAGEParam0.
	 * @return the sHOWMESSAGEParam0 attribute reference
	 */
	public ElementaryRangeReference getSHOWMESSAGEParam0Reference() {
		return sHOWMESSAGEParam0.getReference();
	}

	/**
	 * Getter for sHOWMESSAGEParam0 attribute.
	 * @return sHOWMESSAGEParam0 attribute
	 */
	public String getSHOWMESSAGEParam0() {
		return sHOWMESSAGEParam0.getValue();
	}

	/**
	 * Setter for sHOWMESSAGEParam0 attribute.
	 * @param sHOWMESSAGEParam0 the new value of sHOWMESSAGEParam0
	 */
	public void setSHOWMESSAGEParam0(String sHOWMESSAGEParam0) {
		this.sHOWMESSAGEParam0.setValue(sHOWMESSAGEParam0);
	}
}
