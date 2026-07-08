package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wtopkey.
 * 
 * <p>About 'wtopkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wtopkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wtopkey = new Elementary(root,new PackedType(18, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wtopkey with a default record.
	 * @param configuration the configuration
	 */
	public Wtopkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wtopkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wtopkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wtopkey.
	 * @return the wtopkey attribute reference
	 */
	public ElementaryRangeReference getWtopkeyReference() {
		return wtopkey.getReference();
	}

	/**
	 * Getter for wtopkey attribute.
	 * @return wtopkey attribute
	 */
	public long getWtopkey() {
		return wtopkey.getValue();
	}

	/**
	 * Setter for wtopkey attribute.
	 * @param wtopkey the new value of wtopkey
	 */
	public void setWtopkey(long wtopkey) {
		this.wtopkey.setValue(wtopkey);
	}
}
