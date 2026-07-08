package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Delwin.
 * 
 * <p>About 'actid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Delwin extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary actid = new Elementary(root,new AlphanumericType(12));
	
	/**
	 * Instantiate a new Delwin with a default record.
	 * @param configuration the configuration
	 */
	public Delwin(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Delwin bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Delwin(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute actid.
	 * @return the actid attribute reference
	 */
	public ElementaryRangeReference getActidReference() {
		return actid.getReference();
	}

	/**
	 * Getter for actid attribute.
	 * @return actid attribute
	 */
	public String getActid() {
		return actid.getValue();
	}

	/**
	 * Setter for actid attribute.
	 * @param actid the new value of actid
	 */
	public void setActid(String actid) {
		this.actid.setValue(actid);
	}
}
