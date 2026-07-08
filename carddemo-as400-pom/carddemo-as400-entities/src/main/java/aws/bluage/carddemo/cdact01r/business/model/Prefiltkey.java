package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Prefiltkey.
 * 
 * <p>About 'prefiltkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Prefiltkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary prefiltkey = new Elementary(root,new PackedType(12, 0, true));
	
	/**
	 * Instantiate a new Prefiltkey with a default record.
	 * @param configuration the configuration
	 */
	public Prefiltkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Prefiltkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Prefiltkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute prefiltkey.
	 * @return the prefiltkey attribute reference
	 */
	public ElementaryRangeReference getPrefiltkeyReference() {
		return prefiltkey.getReference();
	}

	/**
	 * Getter for prefiltkey attribute.
	 * @return prefiltkey attribute
	 */
	public long getPrefiltkey() {
		return prefiltkey.getValue();
	}

	/**
	 * Setter for prefiltkey attribute.
	 * @param prefiltkey the new value of prefiltkey
	 */
	public void setPrefiltkey(long prefiltkey) {
		this.prefiltkey.setValue(prefiltkey);
	}
}
