package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Rrn.
 * 
 * <p>About 'rrn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Rrn extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary rrn = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Rrn with a default record.
	 * @param configuration the configuration
	 */
	public Rrn(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Rrn bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Rrn(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute rrn.
	 * @return the rrn attribute reference
	 */
	public ElementaryRangeReference getRrnReference() {
		return rrn.getReference();
	}

	/**
	 * Getter for rrn attribute.
	 * @return rrn attribute
	 */
	public int getRrn() {
		return rrn.getValue();
	}

	/**
	 * Setter for rrn attribute.
	 * @param rrn the new value of rrn
	 */
	public void setRrn(int rrn) {
		this.rrn.setValue(rrn);
	}
}
