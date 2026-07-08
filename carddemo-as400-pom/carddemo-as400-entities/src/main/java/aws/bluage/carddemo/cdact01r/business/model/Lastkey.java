package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Lastkey.
 * 
 * <p>About 'lastkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Lastkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary lastkey = new Elementary(root,new PackedType(12, 0, true));
	
	/**
	 * Instantiate a new Lastkey with a default record.
	 * @param configuration the configuration
	 */
	public Lastkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Lastkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Lastkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute lastkey.
	 * @return the lastkey attribute reference
	 */
	public ElementaryRangeReference getLastkeyReference() {
		return lastkey.getReference();
	}

	/**
	 * Getter for lastkey attribute.
	 * @return lastkey attribute
	 */
	public long getLastkey() {
		return lastkey.getValue();
	}

	/**
	 * Setter for lastkey attribute.
	 * @param lastkey the new value of lastkey
	 */
	public void setLastkey(long lastkey) {
		this.lastkey.setValue(lastkey);
	}
}
