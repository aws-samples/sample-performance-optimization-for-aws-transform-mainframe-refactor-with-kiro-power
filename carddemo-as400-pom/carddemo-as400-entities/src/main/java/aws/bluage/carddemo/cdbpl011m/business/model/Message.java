package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Message.
 * 
 * <p>About 'message' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Message extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary message = new Elementary(root,new AlphanumericType(4)," ");
	
	/**
	 * Instantiate a new Message with a default record.
	 * @param configuration the configuration
	 */
	public Message(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Message bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Message(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute message.
	 * @return the message attribute reference
	 */
	public ElementaryRangeReference getMessageReference() {
		return message.getReference();
	}

	/**
	 * Getter for message attribute.
	 * @return message attribute
	 */
	public String getMessage() {
		return message.getValue();
	}

	/**
	 * Setter for message attribute.
	 * @param message the new value of message
	 */
	public void setMessage(String message) {
		this.message.setValue(message);
	}
}
