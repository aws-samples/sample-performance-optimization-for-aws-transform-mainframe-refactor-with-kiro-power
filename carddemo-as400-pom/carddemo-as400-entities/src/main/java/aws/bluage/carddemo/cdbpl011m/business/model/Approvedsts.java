package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Approvedsts.
 * 
 * <p>About 'approvedsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Approvedsts extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary approvedsts = new Elementary(root,new AlphanumericType(1),"A");
	
	/**
	 * Instantiate a new Approvedsts with a default record.
	 * @param configuration the configuration
	 */
	public Approvedsts(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Approvedsts bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Approvedsts(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute approvedsts.
	 * @return the approvedsts attribute reference
	 */
	public ElementaryRangeReference getApprovedstsReference() {
		return approvedsts.getReference();
	}

	/**
	 * Getter for approvedsts attribute.
	 * @return approvedsts attribute
	 */
	public String getApprovedsts() {
		return approvedsts.getValue();
	}

	/**
	 * Setter for approvedsts attribute.
	 * @param approvedsts the new value of approvedsts
	 */
	public void setApprovedsts(String approvedsts) {
		this.approvedsts.setValue(approvedsts);
	}
}
