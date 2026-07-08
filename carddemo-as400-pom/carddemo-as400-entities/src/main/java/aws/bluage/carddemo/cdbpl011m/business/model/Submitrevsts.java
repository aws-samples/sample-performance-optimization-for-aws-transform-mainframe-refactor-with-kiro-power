package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Submitrevsts.
 * 
 * <p>About 'submitrevsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Submitrevsts extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary submitrevsts = new Elementary(root,new AlphanumericType(1),"a");
	
	/**
	 * Instantiate a new Submitrevsts with a default record.
	 * @param configuration the configuration
	 */
	public Submitrevsts(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Submitrevsts bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Submitrevsts(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute submitrevsts.
	 * @return the submitrevsts attribute reference
	 */
	public ElementaryRangeReference getSubmitrevstsReference() {
		return submitrevsts.getReference();
	}

	/**
	 * Getter for submitrevsts attribute.
	 * @return submitrevsts attribute
	 */
	public String getSubmitrevsts() {
		return submitrevsts.getValue();
	}

	/**
	 * Setter for submitrevsts attribute.
	 * @param submitrevsts the new value of submitrevsts
	 */
	public void setSubmitrevsts(String submitrevsts) {
		this.submitrevsts.setValue(submitrevsts);
	}
}
