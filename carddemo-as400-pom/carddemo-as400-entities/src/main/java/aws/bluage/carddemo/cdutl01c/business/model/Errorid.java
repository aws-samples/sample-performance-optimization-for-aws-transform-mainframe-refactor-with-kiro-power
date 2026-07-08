package aws.bluage.carddemo.cdutl01c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Errorid.
 * 
 * <p>About 'errorid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Errorid extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary errorid = new Elementary(root,new AlphanumericType(8),"        ");
	
	/**
	 * Instantiate a new Errorid with a default record.
	 * @param configuration the configuration
	 */
	public Errorid(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Errorid bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Errorid(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute errorid.
	 * @return the errorid attribute reference
	 */
	public ElementaryRangeReference getErroridReference() {
		return errorid.getReference();
	}

	/**
	 * Getter for errorid attribute.
	 * @return errorid attribute
	 */
	public String getErrorid() {
		return errorid.getValue();
	}

	/**
	 * Setter for errorid attribute.
	 * @param errorid the new value of errorid
	 */
	public void setErrorid(String errorid) {
		this.errorid.setValue(errorid);
	}
}
