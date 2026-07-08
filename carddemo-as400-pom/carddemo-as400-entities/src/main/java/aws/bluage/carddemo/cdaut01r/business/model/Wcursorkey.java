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
 * Data simplifier entity Wcursorkey.
 * 
 * <p>About 'wcursorkey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcursorkey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcursorkey = new Elementary(root,new PackedType(18, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wcursorkey with a default record.
	 * @param configuration the configuration
	 */
	public Wcursorkey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcursorkey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcursorkey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcursorkey.
	 * @return the wcursorkey attribute reference
	 */
	public ElementaryRangeReference getWcursorkeyReference() {
		return wcursorkey.getReference();
	}

	/**
	 * Getter for wcursorkey attribute.
	 * @return wcursorkey attribute
	 */
	public long getWcursorkey() {
		return wcursorkey.getValue();
	}

	/**
	 * Setter for wcursorkey attribute.
	 * @param wcursorkey the new value of wcursorkey
	 */
	public void setWcursorkey(long wcursorkey) {
		this.wcursorkey.setValue(wcursorkey);
	}
}
