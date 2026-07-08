package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wqualmsgf.
 * 
 * <p>About 'wqualmsgf' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wqualmsgf extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wqualmsgf = new Elementary(root,new AlphanumericType(20),"QCPFMSG   *LIBL");
	
	/**
	 * Instantiate a new Wqualmsgf with a default record.
	 * @param configuration the configuration
	 */
	public Wqualmsgf(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wqualmsgf bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wqualmsgf(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wqualmsgf.
	 * @return the wqualmsgf attribute reference
	 */
	public ElementaryRangeReference getWqualmsgfReference() {
		return wqualmsgf.getReference();
	}

	/**
	 * Getter for wqualmsgf attribute.
	 * @return wqualmsgf attribute
	 */
	public String getWqualmsgf() {
		return wqualmsgf.getValue();
	}

	/**
	 * Setter for wqualmsgf attribute.
	 * @param wqualmsgf the new value of wqualmsgf
	 */
	public void setWqualmsgf(String wqualmsgf) {
		this.wqualmsgf.setValue(wqualmsgf);
	}
}
