package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Submitsts.
 * 
 * <p>About 'submitsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Submitsts extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary submitsts = new Elementary(root,new AlphanumericType(1),"s");
	
	/**
	 * Instantiate a new Submitsts with a default record.
	 * @param configuration the configuration
	 */
	public Submitsts(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Submitsts bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Submitsts(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute submitsts.
	 * @return the submitsts attribute reference
	 */
	public ElementaryRangeReference getSubmitstsReference() {
		return submitsts.getReference();
	}

	/**
	 * Getter for submitsts attribute.
	 * @return submitsts attribute
	 */
	public String getSubmitsts() {
		return submitsts.getValue();
	}

	/**
	 * Setter for submitsts attribute.
	 * @param submitsts the new value of submitsts
	 */
	public void setSubmitsts(String submitsts) {
		this.submitsts.setValue(submitsts);
	}
}
