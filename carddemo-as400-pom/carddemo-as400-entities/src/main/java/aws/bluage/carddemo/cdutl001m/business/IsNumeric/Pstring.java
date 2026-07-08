package aws.bluage.carddemo.cdutl001m.business.IsNumeric;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Pstring.
 * 
 * <p>About 'pstring' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pstring extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pstring = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2));
	
	/**
	 * Instantiate a new Pstring with a default record.
	 * @param configuration the configuration
	 */
	public Pstring(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pstring bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pstring(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pstring.
	 * @return the pstring attribute reference
	 */
	public ElementaryRangeReference getPstringReference() {
		return pstring.getReference();
	}

	/**
	 * Getter for pstring attribute.
	 * @return pstring attribute
	 */
	public String getPstring() {
		return pstring.getValue();
	}

	/**
	 * Setter for pstring attribute.
	 * @param pstring the new value of pstring
	 */
	public void setPstring(String pstring) {
		this.pstring.setValue(pstring);
	}
}
