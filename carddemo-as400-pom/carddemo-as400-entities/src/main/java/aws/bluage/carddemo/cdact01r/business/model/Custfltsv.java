package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Custfltsv.
 * 
 * <p>About 'custfltsv' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Custfltsv extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary custfltsv = new Elementary(root,new AlphanumericType(9));
	
	/**
	 * Instantiate a new Custfltsv with a default record.
	 * @param configuration the configuration
	 */
	public Custfltsv(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Custfltsv bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Custfltsv(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute custfltsv.
	 * @return the custfltsv attribute reference
	 */
	public ElementaryRangeReference getCustfltsvReference() {
		return custfltsv.getReference();
	}

	/**
	 * Getter for custfltsv attribute.
	 * @return custfltsv attribute
	 */
	public String getCustfltsv() {
		return custfltsv.getValue();
	}

	/**
	 * Setter for custfltsv attribute.
	 * @param custfltsv the new value of custfltsv
	 */
	public void setCustfltsv(String custfltsv) {
		this.custfltsv.setValue(custfltsv);
	}
}
