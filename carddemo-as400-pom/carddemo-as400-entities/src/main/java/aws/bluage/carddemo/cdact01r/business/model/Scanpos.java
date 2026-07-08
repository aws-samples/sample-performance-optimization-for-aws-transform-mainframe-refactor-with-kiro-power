package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Scanpos.
 * 
 * <p>About 'scanpos' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Scanpos extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary scanpos = new Elementary(root,new PackedType(3, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Scanpos with a default record.
	 * @param configuration the configuration
	 */
	public Scanpos(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Scanpos bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Scanpos(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute scanpos.
	 * @return the scanpos attribute reference
	 */
	public ElementaryRangeReference getScanposReference() {
		return scanpos.getReference();
	}

	/**
	 * Getter for scanpos attribute.
	 * @return scanpos attribute
	 */
	public int getScanpos() {
		return scanpos.getValue();
	}

	/**
	 * Setter for scanpos attribute.
	 * @param scanpos the new value of scanpos
	 */
	public void setScanpos(int scanpos) {
		this.scanpos.setValue(scanpos);
	}
}
