package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wcntr.
 * 
 * <p>About 'wcntr' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcntr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcntr = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Wcntr with a default record.
	 * @param configuration the configuration
	 */
	public Wcntr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcntr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcntr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcntr.
	 * @return the wcntr attribute reference
	 */
	public ElementaryRangeReference getWcntrReference() {
		return wcntr.getReference();
	}

	/**
	 * Getter for wcntr attribute.
	 * @return wcntr attribute
	 */
	public int getWcntr() {
		return wcntr.getValue();
	}

	/**
	 * Setter for wcntr attribute.
	 * @param wcntr the new value of wcntr
	 */
	public void setWcntr(int wcntr) {
		this.wcntr.setValue(wcntr);
	}
}
