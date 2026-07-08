package aws.bluage.carddemo.cdcca01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Pcardnum.
 * 
 * <p>About 'pcardnum' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pcardnum extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pcardnum = new Elementary(root,new PackedType(16, 0, true),"");
	
	/**
	 * Instantiate a new Pcardnum with a default record.
	 * @param configuration the configuration
	 */
	public Pcardnum(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pcardnum bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pcardnum(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pcardnum.
	 * @return the pcardnum attribute reference
	 */
	public ElementaryRangeReference getPcardnumReference() {
		return pcardnum.getReference();
	}

	/**
	 * Getter for pcardnum attribute.
	 * @return pcardnum attribute
	 */
	public long getPcardnum() {
		return pcardnum.getValue();
	}

	/**
	 * Setter for pcardnum attribute.
	 * @param pcardnum the new value of pcardnum
	 */
	public void setPcardnum(long pcardnum) {
		this.pcardnum.setValue(pcardnum);
	}
}
