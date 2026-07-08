package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Pcvv.
 * 
 * <p>About 'pcvv' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pcvv extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pcvv = new Elementary(root,new PackedType(3, 0, true));
	
	/**
	 * Instantiate a new Pcvv with a default record.
	 * @param configuration the configuration
	 */
	public Pcvv(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pcvv bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pcvv(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pcvv.
	 * @return the pcvv attribute reference
	 */
	public ElementaryRangeReference getPcvvReference() {
		return pcvv.getReference();
	}

	/**
	 * Getter for pcvv attribute.
	 * @return pcvv attribute
	 */
	public int getPcvv() {
		return pcvv.getValue();
	}

	/**
	 * Setter for pcvv attribute.
	 * @param pcvv the new value of pcvv
	 */
	public void setPcvv(int pcvv) {
		this.pcvv.setValue(pcvv);
	}
}
