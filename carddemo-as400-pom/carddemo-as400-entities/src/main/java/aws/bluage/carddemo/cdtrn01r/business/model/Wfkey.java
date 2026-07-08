package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wfkey.
 * 
 * <p>About 'wfkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wfkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wfkey = new Elementary(root,new PackedType(15, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wfkey with a default record.
	 * @param configuration the configuration
	 */
	public Wfkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wfkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wfkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wfkey.
	 * @return the wfkey attribute reference
	 */
	public ElementaryRangeReference getWfkeyReference() {
		return wfkey.getReference();
	}

	/**
	 * Getter for wfkey attribute.
	 * @return wfkey attribute
	 */
	public long getWfkey() {
		return wfkey.getValue();
	}

	/**
	 * Setter for wfkey attribute.
	 * @param wfkey the new value of wfkey
	 */
	public void setWfkey(long wfkey) {
		this.wfkey.setValue(wfkey);
	}
}
