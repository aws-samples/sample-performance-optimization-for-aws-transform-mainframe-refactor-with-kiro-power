package aws.bluage.carddemo.cdutl001m.business.IsCurrency;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Pstring1.
 * 
 * <p>About 'pstring1' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pstring1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pstring1 = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2));
	
	/**
	 * Instantiate a new Pstring1 with a default record.
	 * @param configuration the configuration
	 */
	public Pstring1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pstring1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pstring1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pstring1.
	 * @return the pstring1 attribute reference
	 */
	public ElementaryRangeReference getPstring1Reference() {
		return pstring1.getReference();
	}

	/**
	 * Getter for pstring1 attribute.
	 * @return pstring1 attribute
	 */
	public String getPstring1() {
		return pstring1.getValue();
	}

	/**
	 * Setter for pstring1 attribute.
	 * @param pstring1 the new value of pstring1
	 */
	public void setPstring1(String pstring1) {
		this.pstring1.setValue(pstring1);
	}
}
