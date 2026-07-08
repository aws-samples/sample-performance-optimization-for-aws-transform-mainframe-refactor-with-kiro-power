package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wmessagekey.
 * 
 * <p>About 'wmessagekey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wmessagekey extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wmessagekey = new Elementary(root,new AlphanumericType(4)," ");
	
	/**
	 * Instantiate a new Wmessagekey with a default record.
	 * @param configuration the configuration
	 */
	public Wmessagekey(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wmessagekey bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wmessagekey(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wmessagekey.
	 * @return the wmessagekey attribute reference
	 */
	public ElementaryRangeReference getWmessagekeyReference() {
		return wmessagekey.getReference();
	}

	/**
	 * Getter for wmessagekey attribute.
	 * @return wmessagekey attribute
	 */
	public String getWmessagekey() {
		return wmessagekey.getValue();
	}

	/**
	 * Setter for wmessagekey attribute.
	 * @param wmessagekey the new value of wmessagekey
	 */
	public void setWmessagekey(String wmessagekey) {
		this.wmessagekey.setValue(wmessagekey);
	}
}
