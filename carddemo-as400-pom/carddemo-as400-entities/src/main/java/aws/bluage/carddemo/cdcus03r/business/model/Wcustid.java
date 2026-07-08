package aws.bluage.carddemo.cdcus03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wcustid.
 * 
 * <p>About 'wcustid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcustid extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcustid = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	
	/**
	 * Instantiate a new Wcustid with a default record.
	 * @param configuration the configuration
	 */
	public Wcustid(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcustid bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcustid(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcustid.
	 * @return the wcustid attribute reference
	 */
	public ElementaryRangeReference getWcustidReference() {
		return wcustid.getReference();
	}

	/**
	 * Getter for wcustid attribute.
	 * @return wcustid attribute
	 */
	public int getWcustid() {
		return wcustid.getValue();
	}

	/**
	 * Setter for wcustid attribute.
	 * @param wcustid the new value of wcustid
	 */
	public void setWcustid(int wcustid) {
		this.wcustid.setValue(wcustid);
	}
}
