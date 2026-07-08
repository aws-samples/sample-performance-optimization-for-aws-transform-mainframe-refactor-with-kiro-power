package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Firstkey.
 * 
 * <p>About 'firstkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Firstkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary firstkey = new Elementary(root,new PackedType(12, 0, true));
	
	/**
	 * Instantiate a new Firstkey with a default record.
	 * @param configuration the configuration
	 */
	public Firstkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Firstkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Firstkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute firstkey.
	 * @return the firstkey attribute reference
	 */
	public ElementaryRangeReference getFirstkeyReference() {
		return firstkey.getReference();
	}

	/**
	 * Getter for firstkey attribute.
	 * @return firstkey attribute
	 */
	public long getFirstkey() {
		return firstkey.getValue();
	}

	/**
	 * Setter for firstkey attribute.
	 * @param firstkey the new value of firstkey
	 */
	public void setFirstkey(long firstkey) {
		this.firstkey.setValue(firstkey);
	}
}
