package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Waccount.
 * 
 * <p>About 'waccount' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Waccount extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary waccount = new Elementary(root,new PackedType(12, 0, true));
	
	/**
	 * Instantiate a new Waccount with a default record.
	 * @param configuration the configuration
	 */
	public Waccount(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Waccount bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Waccount(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute waccount.
	 * @return the waccount attribute reference
	 */
	public ElementaryRangeReference getWaccountReference() {
		return waccount.getReference();
	}

	/**
	 * Getter for waccount attribute.
	 * @return waccount attribute
	 */
	public long getWaccount() {
		return waccount.getValue();
	}

	/**
	 * Setter for waccount attribute.
	 * @param waccount the new value of waccount
	 */
	public void setWaccount(long waccount) {
		this.waccount.setValue(waccount);
	}
}
