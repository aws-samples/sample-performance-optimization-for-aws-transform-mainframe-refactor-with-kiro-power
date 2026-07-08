package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Csflsize.
 * 
 * <p>About 'csflsize' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Csflsize extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary csflsize = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("13"));
	
	/**
	 * Instantiate a new Csflsize with a default record.
	 * @param configuration the configuration
	 */
	public Csflsize(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Csflsize bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Csflsize(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute csflsize.
	 * @return the csflsize attribute reference
	 */
	public ElementaryRangeReference getCsflsizeReference() {
		return csflsize.getReference();
	}

	/**
	 * Getter for csflsize attribute.
	 * @return csflsize attribute
	 */
	public int getCsflsize() {
		return csflsize.getValue();
	}

	/**
	 * Setter for csflsize attribute.
	 * @param csflsize the new value of csflsize
	 */
	public void setCsflsize(int csflsize) {
		this.csflsize.setValue(csflsize);
	}
}
