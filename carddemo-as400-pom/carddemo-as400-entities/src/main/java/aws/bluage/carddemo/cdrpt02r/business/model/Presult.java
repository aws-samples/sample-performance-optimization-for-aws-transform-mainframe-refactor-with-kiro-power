package aws.bluage.carddemo.cdrpt02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Presult.
 * 
 * <p>About 'presult' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Presult extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary presult = new Elementary(root,new AlphanumericType(10));
	
	/**
	 * Instantiate a new Presult with a default record.
	 * @param configuration the configuration
	 */
	public Presult(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Presult bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Presult(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute presult.
	 * @return the presult attribute reference
	 */
	public ElementaryRangeReference getPresultReference() {
		return presult.getReference();
	}

	/**
	 * Getter for presult attribute.
	 * @return presult attribute
	 */
	public String getPresult() {
		return presult.getValue();
	}

	/**
	 * Setter for presult attribute.
	 * @param presult the new value of presult
	 */
	public void setPresult(String presult) {
		this.presult.setValue(presult);
	}
}
