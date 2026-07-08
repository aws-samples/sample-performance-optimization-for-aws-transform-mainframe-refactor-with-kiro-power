package aws.bluage.carddemo.cdcus02r.business.CheckInput;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Wnumteststring.
 * 
 * <p>About 'wnumteststring' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wnumteststring extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wnumteststring = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2),"");
	
	/**
	 * Instantiate a new Wnumteststring with a default record.
	 * @param configuration the configuration
	 */
	public Wnumteststring(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wnumteststring bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wnumteststring(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wnumteststring.
	 * @return the wnumteststring attribute reference
	 */
	public ElementaryRangeReference getWnumteststringReference() {
		return wnumteststring.getReference();
	}

	/**
	 * Getter for wnumteststring attribute.
	 * @return wnumteststring attribute
	 */
	public String getWnumteststring() {
		return wnumteststring.getValue();
	}

	/**
	 * Setter for wnumteststring attribute.
	 * @param wnumteststring the new value of wnumteststring
	 */
	public void setWnumteststring(String wnumteststring) {
		this.wnumteststring.setValue(wnumteststring);
	}
}
