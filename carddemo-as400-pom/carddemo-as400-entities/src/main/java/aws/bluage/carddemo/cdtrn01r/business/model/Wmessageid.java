package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wmessageid.
 * 
 * <p>About 'wmessageid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wmessageid extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wmessageid = new Elementary(root,new AlphanumericType(7),"CPF9898");
	
	/**
	 * Instantiate a new Wmessageid with a default record.
	 * @param configuration the configuration
	 */
	public Wmessageid(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wmessageid bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wmessageid(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wmessageid.
	 * @return the wmessageid attribute reference
	 */
	public ElementaryRangeReference getWmessageidReference() {
		return wmessageid.getReference();
	}

	/**
	 * Getter for wmessageid attribute.
	 * @return wmessageid attribute
	 */
	public String getWmessageid() {
		return wmessageid.getValue();
	}

	/**
	 * Setter for wmessageid attribute.
	 * @param wmessageid the new value of wmessageid
	 */
	public void setWmessageid(String wmessageid) {
		this.wmessageid.setValue(wmessageid);
	}
}
