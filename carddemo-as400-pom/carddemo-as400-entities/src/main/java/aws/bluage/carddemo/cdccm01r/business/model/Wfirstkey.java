package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wfirstkey.
 * 
 * <p>About 'wfirstkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wfirstkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wfirstkey = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wfirstkey with a default record.
	 * @param configuration the configuration
	 */
	public Wfirstkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wfirstkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wfirstkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wfirstkey.
	 * @return the wfirstkey attribute reference
	 */
	public ElementaryRangeReference getWfirstkeyReference() {
		return wfirstkey.getReference();
	}

	/**
	 * Getter for wfirstkey attribute.
	 * @return wfirstkey attribute
	 */
	public long getWfirstkey() {
		return wfirstkey.getValue();
	}

	/**
	 * Setter for wfirstkey attribute.
	 * @param wfirstkey the new value of wfirstkey
	 */
	public void setWfirstkey(long wfirstkey) {
		this.wfirstkey.setValue(wfirstkey);
	}
}
