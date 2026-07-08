package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wcvv.
 * 
 * <p>About 'wcvv' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcvv extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcvv = new Elementary(root,new PackedType(3, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Wcvv with a default record.
	 * @param configuration the configuration
	 */
	public Wcvv(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcvv bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcvv(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcvv.
	 * @return the wcvv attribute reference
	 */
	public ElementaryRangeReference getWcvvReference() {
		return wcvv.getReference();
	}

	/**
	 * Getter for wcvv attribute.
	 * @return wcvv attribute
	 */
	public int getWcvv() {
		return wcvv.getValue();
	}

	/**
	 * Setter for wcvv attribute.
	 * @param wcvv the new value of wcvv
	 */
	public void setWcvv(int wcvv) {
		this.wcvv.setValue(wcvv);
	}
}
