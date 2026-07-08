package aws.bluage.carddemo.cdutl001m.business.IsCurrency;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Wteststring1.
 * 
 * <p>About 'wteststring1' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wteststring1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wteststring1 = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2),"");
	
	/**
	 * Instantiate a new Wteststring1 with a default record.
	 * @param configuration the configuration
	 */
	public Wteststring1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wteststring1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wteststring1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wteststring1.
	 * @return the wteststring1 attribute reference
	 */
	public ElementaryRangeReference getWteststring1Reference() {
		return wteststring1.getReference();
	}

	/**
	 * Getter for wteststring1 attribute.
	 * @return wteststring1 attribute
	 */
	public String getWteststring1() {
		return wteststring1.getValue();
	}

	/**
	 * Setter for wteststring1 attribute.
	 * @param wteststring1 the new value of wteststring1
	 */
	public void setWteststring1(String wteststring1) {
		this.wteststring1.setValue(wteststring1);
	}
}
