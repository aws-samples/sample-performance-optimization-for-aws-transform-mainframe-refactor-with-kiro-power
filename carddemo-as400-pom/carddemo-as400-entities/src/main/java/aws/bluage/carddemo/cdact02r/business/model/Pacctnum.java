package aws.bluage.carddemo.cdact02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Pacctnum.
 * 
 * <p>About 'pacctnum' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pacctnum extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pacctnum = new Elementary(root,new PackedType(12, 0, true));
	
	/**
	 * Instantiate a new Pacctnum with a default record.
	 * @param configuration the configuration
	 */
	public Pacctnum(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pacctnum bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pacctnum(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pacctnum.
	 * @return the pacctnum attribute reference
	 */
	public ElementaryRangeReference getPacctnumReference() {
		return pacctnum.getReference();
	}

	/**
	 * Getter for pacctnum attribute.
	 * @return pacctnum attribute
	 */
	public long getPacctnum() {
		return pacctnum.getValue();
	}

	/**
	 * Setter for pacctnum attribute.
	 * @param pacctnum the new value of pacctnum
	 */
	public void setPacctnum(long pacctnum) {
		this.pacctnum.setValue(pacctnum);
	}
}
