package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Filterwin.
 * 
 * <p>About 'custfltr' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Filterwin extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary custfltr = new Elementary(root,new AlphanumericType(9)," ");
	
	/**
	 * Instantiate a new Filterwin with a default record.
	 * @param configuration the configuration
	 */
	public Filterwin(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Filterwin bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Filterwin(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute custfltr.
	 * @return the custfltr attribute reference
	 */
	public ElementaryRangeReference getCustfltrReference() {
		return custfltr.getReference();
	}

	/**
	 * Getter for custfltr attribute.
	 * @return custfltr attribute
	 */
	public String getCustfltr() {
		return custfltr.getValue();
	}

	/**
	 * Setter for custfltr attribute.
	 * @param custfltr the new value of custfltr
	 */
	public void setCustfltr(String custfltr) {
		this.custfltr.setValue(custfltr);
	}
}
