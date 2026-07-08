package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wmessage.
 * 
 * <p>About 'wmessage' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wmessage extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wmessage = new Elementary(root,new AlphanumericType(256)," ");
	
	/**
	 * Instantiate a new Wmessage with a default record.
	 * @param configuration the configuration
	 */
	public Wmessage(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wmessage bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wmessage(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wmessage.
	 * @return the wmessage attribute reference
	 */
	public ElementaryRangeReference getWmessageReference() {
		return wmessage.getReference();
	}

	/**
	 * Getter for wmessage attribute.
	 * @return wmessage attribute
	 */
	public String getWmessage() {
		return wmessage.getValue();
	}

	/**
	 * Setter for wmessage attribute.
	 * @param wmessage the new value of wmessage
	 */
	public void setWmessage(String wmessage) {
		this.wmessage.setValue(wmessage);
	}
}
