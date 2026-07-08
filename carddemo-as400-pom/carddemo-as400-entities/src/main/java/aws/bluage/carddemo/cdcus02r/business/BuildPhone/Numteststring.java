package aws.bluage.carddemo.cdcus02r.business.BuildPhone;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Numteststring.
 * 
 * <p>About 'numteststring' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Numteststring extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary numteststring = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2),"");
	
	/**
	 * Instantiate a new Numteststring with a default record.
	 * @param configuration the configuration
	 */
	public Numteststring(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Numteststring bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Numteststring(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute numteststring.
	 * @return the numteststring attribute reference
	 */
	public ElementaryRangeReference getNumteststringReference() {
		return numteststring.getReference();
	}

	/**
	 * Getter for numteststring attribute.
	 * @return numteststring attribute
	 */
	public String getNumteststring() {
		return numteststring.getValue();
	}

	/**
	 * Setter for numteststring attribute.
	 * @param numteststring the new value of numteststring
	 */
	public void setNumteststring(String numteststring) {
		this.numteststring.setValue(numteststring);
	}
}
