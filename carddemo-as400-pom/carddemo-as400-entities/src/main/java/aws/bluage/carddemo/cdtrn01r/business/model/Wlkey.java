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
 * Data simplifier entity Wlkey.
 * 
 * <p>About 'wlkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wlkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wlkey = new Elementary(root,new PackedType(15, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wlkey with a default record.
	 * @param configuration the configuration
	 */
	public Wlkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wlkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wlkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wlkey.
	 * @return the wlkey attribute reference
	 */
	public ElementaryRangeReference getWlkeyReference() {
		return wlkey.getReference();
	}

	/**
	 * Getter for wlkey attribute.
	 * @return wlkey attribute
	 */
	public long getWlkey() {
		return wlkey.getValue();
	}

	/**
	 * Setter for wlkey attribute.
	 * @param wlkey the new value of wlkey
	 */
	public void setWlkey(long wlkey) {
		this.wlkey.setValue(wlkey);
	}
}
