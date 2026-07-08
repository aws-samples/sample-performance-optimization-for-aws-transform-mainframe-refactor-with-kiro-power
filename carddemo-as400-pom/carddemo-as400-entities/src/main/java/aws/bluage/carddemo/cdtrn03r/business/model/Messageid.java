package aws.bluage.carddemo.cdtrn03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Messageid.
 * 
 * <p>About 'messageid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Messageid extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary messageid = new Elementary(root,new AlphanumericType(8)," ");
	
	/**
	 * Instantiate a new Messageid with a default record.
	 * @param configuration the configuration
	 */
	public Messageid(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Messageid bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Messageid(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute messageid.
	 * @return the messageid attribute reference
	 */
	public ElementaryRangeReference getMessageidReference() {
		return messageid.getReference();
	}

	/**
	 * Getter for messageid attribute.
	 * @return messageid attribute
	 */
	public String getMessageid() {
		return messageid.getValue();
	}

	/**
	 * Setter for messageid attribute.
	 * @param messageid the new value of messageid
	 */
	public void setMessageid(String messageid) {
		this.messageid.setValue(messageid);
	}
}
