package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Applyfltsv.
 * 
 * <p>About 'applyfltsv' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Applyfltsv extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary applyfltsv = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Applyfltsv with a default record.
	 * @param configuration the configuration
	 */
	public Applyfltsv(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Applyfltsv bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Applyfltsv(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute applyfltsv.
	 * @return the applyfltsv attribute reference
	 */
	public ElementaryRangeReference getApplyfltsvReference() {
		return applyfltsv.getReference();
	}

	/**
	 * Getter for applyfltsv attribute.
	 * @return applyfltsv attribute
	 */
	public String getApplyfltsv() {
		return applyfltsv.getValue();
	}

	/**
	 * Setter for applyfltsv attribute.
	 * @param applyfltsv the new value of applyfltsv
	 */
	public void setApplyfltsv(String applyfltsv) {
		this.applyfltsv.setValue(applyfltsv);
	}
}
