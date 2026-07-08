package aws.bluage.carddemo.cdutl001m.business.IsCurNum;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Wteststring2.
 * 
 * <p>About 'wteststring2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wteststring2 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wteststring2 = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2),"");
	
	/**
	 * Instantiate a new Wteststring2 with a default record.
	 * @param configuration the configuration
	 */
	public Wteststring2(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wteststring2 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wteststring2(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wteststring2.
	 * @return the wteststring2 attribute reference
	 */
	public ElementaryRangeReference getWteststring2Reference() {
		return wteststring2.getReference();
	}

	/**
	 * Getter for wteststring2 attribute.
	 * @return wteststring2 attribute
	 */
	public String getWteststring2() {
		return wteststring2.getValue();
	}

	/**
	 * Setter for wteststring2 attribute.
	 * @param wteststring2 the new value of wteststring2
	 */
	public void setWteststring2(String wteststring2) {
		this.wteststring2.setValue(wteststring2);
	}
}
