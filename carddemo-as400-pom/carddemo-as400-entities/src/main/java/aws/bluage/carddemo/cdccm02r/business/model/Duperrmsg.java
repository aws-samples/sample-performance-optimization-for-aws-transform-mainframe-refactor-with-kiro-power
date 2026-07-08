package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Duperrmsg.
 * 
 * <p>About 'duperrmsg' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Duperrmsg extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary duperrmsg = new Elementary(root,new AlphanumericType(100)," ");
	
	/**
	 * Instantiate a new Duperrmsg with a default record.
	 * @param configuration the configuration
	 */
	public Duperrmsg(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Duperrmsg bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Duperrmsg(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute duperrmsg.
	 * @return the duperrmsg attribute reference
	 */
	public ElementaryRangeReference getDuperrmsgReference() {
		return duperrmsg.getReference();
	}

	/**
	 * Getter for duperrmsg attribute.
	 * @return duperrmsg attribute
	 */
	public String getDuperrmsg() {
		return duperrmsg.getValue();
	}

	/**
	 * Setter for duperrmsg attribute.
	 * @param duperrmsg the new value of duperrmsg
	 */
	public void setDuperrmsg(String duperrmsg) {
		this.duperrmsg.setValue(duperrmsg);
	}
}
