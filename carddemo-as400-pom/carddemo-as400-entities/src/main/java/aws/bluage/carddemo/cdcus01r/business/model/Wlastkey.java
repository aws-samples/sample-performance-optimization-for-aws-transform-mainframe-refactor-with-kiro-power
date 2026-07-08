package aws.bluage.carddemo.cdcus01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wlastkey.
 * 
 * <p>About 'wlastkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wlastkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wlastkey = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	
	/**
	 * Instantiate a new Wlastkey with a default record.
	 * @param configuration the configuration
	 */
	public Wlastkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wlastkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wlastkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wlastkey.
	 * @return the wlastkey attribute reference
	 */
	public ElementaryRangeReference getWlastkeyReference() {
		return wlastkey.getReference();
	}

	/**
	 * Getter for wlastkey attribute.
	 * @return wlastkey attribute
	 */
	public int getWlastkey() {
		return wlastkey.getValue();
	}

	/**
	 * Setter for wlastkey attribute.
	 * @param wlastkey the new value of wlastkey
	 */
	public void setWlastkey(int wlastkey) {
		this.wlastkey.setValue(wlastkey);
	}
}
