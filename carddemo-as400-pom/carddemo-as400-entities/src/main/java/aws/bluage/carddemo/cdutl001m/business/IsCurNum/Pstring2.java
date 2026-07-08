package aws.bluage.carddemo.cdutl001m.business.IsCurNum;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Pstring2.
 * 
 * <p>About 'pstring2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pstring2 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pstring2 = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2));
	
	/**
	 * Instantiate a new Pstring2 with a default record.
	 * @param configuration the configuration
	 */
	public Pstring2(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pstring2 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pstring2(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pstring2.
	 * @return the pstring2 attribute reference
	 */
	public ElementaryRangeReference getPstring2Reference() {
		return pstring2.getReference();
	}

	/**
	 * Getter for pstring2 attribute.
	 * @return pstring2 attribute
	 */
	public String getPstring2() {
		return pstring2.getValue();
	}

	/**
	 * Setter for pstring2 attribute.
	 * @param pstring2 the new value of pstring2
	 */
	public void setPstring2(String pstring2) {
		this.pstring2.setValue(pstring2);
	}
}
