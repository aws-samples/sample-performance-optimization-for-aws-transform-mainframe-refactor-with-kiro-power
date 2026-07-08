package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Dly.
 * 
 * <p>About 'dly' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dly extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dly = new Elementary(root,new SizePrefixedAlphanumericType(3000, 2),"");
	
	/**
	 * Instantiate a new Dly with a default record.
	 * @param configuration the configuration
	 */
	public Dly(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Dly bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dly(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dly.
	 * @return the dly attribute reference
	 */
	public ElementaryRangeReference getDlyReference() {
		return dly.getReference();
	}

	/**
	 * Getter for dly attribute.
	 * @return dly attribute
	 */
	public String getDly() {
		return dly.getValue();
	}

	/**
	 * Setter for dly attribute.
	 * @param dly the new value of dly
	 */
	public void setDly(String dly) {
		this.dly.setValue(dly);
	}
}
