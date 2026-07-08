package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Poskey.
 * 
 * <p>About 'poskey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Poskey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary poskey = new Elementary(root,new PackedType(12, 0, true));
	
	/**
	 * Instantiate a new Poskey with a default record.
	 * @param configuration the configuration
	 */
	public Poskey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Poskey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Poskey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute poskey.
	 * @return the poskey attribute reference
	 */
	public ElementaryRangeReference getPoskeyReference() {
		return poskey.getReference();
	}

	/**
	 * Getter for poskey attribute.
	 * @return poskey attribute
	 */
	public long getPoskey() {
		return poskey.getValue();
	}

	/**
	 * Setter for poskey attribute.
	 * @param poskey the new value of poskey
	 */
	public void setPoskey(long poskey) {
		this.poskey.setValue(poskey);
	}
}
