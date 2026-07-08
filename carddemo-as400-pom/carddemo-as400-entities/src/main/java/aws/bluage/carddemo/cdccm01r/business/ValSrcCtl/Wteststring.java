package aws.bluage.carddemo.cdccm01r.business.ValSrcCtl;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Wteststring.
 * 
 * <p>About 'wteststring' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wteststring extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wteststring = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2),"");
	
	/**
	 * Instantiate a new Wteststring with a default record.
	 * @param configuration the configuration
	 */
	public Wteststring(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wteststring bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wteststring(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wteststring.
	 * @return the wteststring attribute reference
	 */
	public ElementaryRangeReference getWteststringReference() {
		return wteststring.getReference();
	}

	/**
	 * Getter for wteststring attribute.
	 * @return wteststring attribute
	 */
	public String getWteststring() {
		return wteststring.getValue();
	}

	/**
	 * Setter for wteststring attribute.
	 * @param wteststring the new value of wteststring
	 */
	public void setWteststring(String wteststring) {
		this.wteststring.setValue(wteststring);
	}
}
