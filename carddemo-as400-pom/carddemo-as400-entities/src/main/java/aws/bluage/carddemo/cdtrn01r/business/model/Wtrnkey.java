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
 * Data simplifier entity Wtrnkey.
 * 
 * <p>About 'wtrnkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wtrnkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wtrnkey = new Elementary(root,new PackedType(15, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wtrnkey with a default record.
	 * @param configuration the configuration
	 */
	public Wtrnkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wtrnkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wtrnkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wtrnkey.
	 * @return the wtrnkey attribute reference
	 */
	public ElementaryRangeReference getWtrnkeyReference() {
		return wtrnkey.getReference();
	}

	/**
	 * Getter for wtrnkey attribute.
	 * @return wtrnkey attribute
	 */
	public long getWtrnkey() {
		return wtrnkey.getValue();
	}

	/**
	 * Setter for wtrnkey attribute.
	 * @param wtrnkey the new value of wtrnkey
	 */
	public void setWtrnkey(long wtrnkey) {
		this.wtrnkey.setValue(wtrnkey);
	}
}
