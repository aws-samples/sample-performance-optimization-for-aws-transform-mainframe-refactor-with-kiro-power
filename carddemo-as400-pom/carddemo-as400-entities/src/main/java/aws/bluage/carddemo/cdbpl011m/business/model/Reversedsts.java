package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Reversedsts.
 * 
 * <p>About 'reversedsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Reversedsts extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary reversedsts = new Elementary(root,new AlphanumericType(1),"X");
	
	/**
	 * Instantiate a new Reversedsts with a default record.
	 * @param configuration the configuration
	 */
	public Reversedsts(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Reversedsts bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Reversedsts(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute reversedsts.
	 * @return the reversedsts attribute reference
	 */
	public ElementaryRangeReference getReversedstsReference() {
		return reversedsts.getReference();
	}

	/**
	 * Getter for reversedsts attribute.
	 * @return reversedsts attribute
	 */
	public String getReversedsts() {
		return reversedsts.getValue();
	}

	/**
	 * Setter for reversedsts attribute.
	 * @param reversedsts the new value of reversedsts
	 */
	public void setReversedsts(String reversedsts) {
		this.reversedsts.setValue(reversedsts);
	}
}
