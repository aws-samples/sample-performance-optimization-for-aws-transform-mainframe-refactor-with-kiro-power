package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Pcardnumber.
 * 
 * <p>About 'pcardnumber' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pcardnumber extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pcardnumber = new Elementary(root,new PackedType(16, 0, true));
	
	/**
	 * Instantiate a new Pcardnumber with a default record.
	 * @param configuration the configuration
	 */
	public Pcardnumber(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pcardnumber bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pcardnumber(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pcardnumber.
	 * @return the pcardnumber attribute reference
	 */
	public ElementaryRangeReference getPcardnumberReference() {
		return pcardnumber.getReference();
	}

	/**
	 * Getter for pcardnumber attribute.
	 * @return pcardnumber attribute
	 */
	public long getPcardnumber() {
		return pcardnumber.getValue();
	}

	/**
	 * Setter for pcardnumber attribute.
	 * @param pcardnumber the new value of pcardnumber
	 */
	public void setPcardnumber(long pcardnumber) {
		this.pcardnumber.setValue(pcardnumber);
	}
}
