package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Applyfltr.
 * 
 * <p>About 'applyfltr' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Applyfltr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary applyfltr = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Applyfltr with a default record.
	 * @param configuration the configuration
	 */
	public Applyfltr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Applyfltr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Applyfltr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute applyfltr.
	 * @return the applyfltr attribute reference
	 */
	public ElementaryRangeReference getApplyfltrReference() {
		return applyfltr.getReference();
	}

	/**
	 * Getter for applyfltr attribute.
	 * @return applyfltr attribute
	 */
	public String getApplyfltr() {
		return applyfltr.getValue();
	}

	/**
	 * Setter for applyfltr attribute.
	 * @param applyfltr the new value of applyfltr
	 */
	public void setApplyfltr(String applyfltr) {
		this.applyfltr.setValue(applyfltr);
	}
}
