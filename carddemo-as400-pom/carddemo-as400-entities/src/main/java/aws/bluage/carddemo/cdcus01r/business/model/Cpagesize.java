package aws.bluage.carddemo.cdcus01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Cpagesize.
 * 
 * <p>About 'cpagesize' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cpagesize extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cpagesize = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("13"));
	
	/**
	 * Instantiate a new Cpagesize with a default record.
	 * @param configuration the configuration
	 */
	public Cpagesize(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cpagesize bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cpagesize(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cpagesize.
	 * @return the cpagesize attribute reference
	 */
	public ElementaryRangeReference getCpagesizeReference() {
		return cpagesize.getReference();
	}

	/**
	 * Getter for cpagesize attribute.
	 * @return cpagesize attribute
	 */
	public int getCpagesize() {
		return cpagesize.getValue();
	}

	/**
	 * Setter for cpagesize attribute.
	 * @param cpagesize the new value of cpagesize
	 */
	public void setCpagesize(int cpagesize) {
		this.cpagesize.setValue(cpagesize);
	}
}
