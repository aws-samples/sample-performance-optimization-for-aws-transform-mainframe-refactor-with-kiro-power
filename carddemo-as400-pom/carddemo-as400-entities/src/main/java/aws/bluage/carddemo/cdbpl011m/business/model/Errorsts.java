package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Errorsts.
 * 
 * <p>About 'errorsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Errorsts extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary errorsts = new Elementary(root,new AlphanumericType(1),"$");
	
	/**
	 * Instantiate a new Errorsts with a default record.
	 * @param configuration the configuration
	 */
	public Errorsts(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Errorsts bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Errorsts(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute errorsts.
	 * @return the errorsts attribute reference
	 */
	public ElementaryRangeReference getErrorstsReference() {
		return errorsts.getReference();
	}

	/**
	 * Getter for errorsts attribute.
	 * @return errorsts attribute
	 */
	public String getErrorsts() {
		return errorsts.getValue();
	}

	/**
	 * Setter for errorsts attribute.
	 * @param errorsts the new value of errorsts
	 */
	public void setErrorsts(String errorsts) {
		this.errorsts.setValue(errorsts);
	}
}
