package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Rejectedsts.
 * 
 * <p>About 'rejectedsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Rejectedsts extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary rejectedsts = new Elementary(root,new AlphanumericType(1),"R");
	
	/**
	 * Instantiate a new Rejectedsts with a default record.
	 * @param configuration the configuration
	 */
	public Rejectedsts(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Rejectedsts bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Rejectedsts(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute rejectedsts.
	 * @return the rejectedsts attribute reference
	 */
	public ElementaryRangeReference getRejectedstsReference() {
		return rejectedsts.getReference();
	}

	/**
	 * Getter for rejectedsts attribute.
	 * @return rejectedsts attribute
	 */
	public String getRejectedsts() {
		return rejectedsts.getValue();
	}

	/**
	 * Setter for rejectedsts attribute.
	 * @param rejectedsts the new value of rejectedsts
	 */
	public void setRejectedsts(String rejectedsts) {
		this.rejectedsts.setValue(rejectedsts);
	}
}
