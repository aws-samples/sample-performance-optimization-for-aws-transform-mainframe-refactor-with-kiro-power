package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Ptrnid.
 * 
 * <p>About 'ptrnid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ptrnid extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ptrnid = new Elementary(root,new PackedType(15, 0, true),"");
	
	/**
	 * Instantiate a new Ptrnid with a default record.
	 * @param configuration the configuration
	 */
	public Ptrnid(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Ptrnid bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Ptrnid(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ptrnid.
	 * @return the ptrnid attribute reference
	 */
	public ElementaryRangeReference getPtrnidReference() {
		return ptrnid.getReference();
	}

	/**
	 * Getter for ptrnid attribute.
	 * @return ptrnid attribute
	 */
	public long getPtrnid() {
		return ptrnid.getValue();
	}

	/**
	 * Setter for ptrnid attribute.
	 * @param ptrnid the new value of ptrnid
	 */
	public void setPtrnid(long ptrnid) {
		this.ptrnid.setValue(ptrnid);
	}
}
