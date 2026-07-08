package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Msgid.
 * 
 * <p>About 'msgid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Msgid extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary msgid = new Elementary(root,new AlphanumericType(8)," ");
	
	/**
	 * Instantiate a new Msgid with a default record.
	 * @param configuration the configuration
	 */
	public Msgid(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Msgid bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Msgid(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute msgid.
	 * @return the msgid attribute reference
	 */
	public ElementaryRangeReference getMsgidReference() {
		return msgid.getReference();
	}

	/**
	 * Getter for msgid attribute.
	 * @return msgid attribute
	 */
	public String getMsgid() {
		return msgid.getValue();
	}

	/**
	 * Setter for msgid attribute.
	 * @param msgid the new value of msgid
	 */
	public void setMsgid(String msgid) {
		this.msgid.setValue(msgid);
	}
}
