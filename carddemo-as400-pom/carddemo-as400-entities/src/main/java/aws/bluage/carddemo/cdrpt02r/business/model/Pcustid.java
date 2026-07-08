package aws.bluage.carddemo.cdrpt02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Pcustid.
 * 
 * <p>About 'pcustid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pcustid extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pcustid = new Elementary(root,new PackedType(9, 0, true));
	
	/**
	 * Instantiate a new Pcustid with a default record.
	 * @param configuration the configuration
	 */
	public Pcustid(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pcustid bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pcustid(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pcustid.
	 * @return the pcustid attribute reference
	 */
	public ElementaryRangeReference getPcustidReference() {
		return pcustid.getReference();
	}

	/**
	 * Getter for pcustid attribute.
	 * @return pcustid attribute
	 */
	public int getPcustid() {
		return pcustid.getValue();
	}

	/**
	 * Setter for pcustid attribute.
	 * @param pcustid the new value of pcustid
	 */
	public void setPcustid(int pcustid) {
		this.pcustid.setValue(pcustid);
	}
}
