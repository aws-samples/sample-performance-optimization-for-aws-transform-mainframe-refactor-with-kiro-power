package aws.bluage.carddemo.cdcus02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Pviewonly.
 * 
 * <p>About 'pviewonly' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pviewonly extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pviewonly = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Instantiate a new Pviewonly with a default record.
	 * @param configuration the configuration
	 */
	public Pviewonly(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pviewonly bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pviewonly(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pviewonly.
	 * @return the pviewonly attribute reference
	 */
	public ElementaryRangeReference getPviewonlyReference() {
		return pviewonly.getReference();
	}

	/**
	 * Getter for pviewonly attribute.
	 * @return pviewonly attribute
	 */
	public String getPviewonly() {
		return pviewonly.getValue();
	}

	/**
	 * Setter for pviewonly attribute.
	 * @param pviewonly the new value of pviewonly
	 */
	public void setPviewonly(String pviewonly) {
		this.pviewonly.setValue(pviewonly);
	}
}
