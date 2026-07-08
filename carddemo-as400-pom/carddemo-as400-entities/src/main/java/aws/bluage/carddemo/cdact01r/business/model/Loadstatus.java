package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Loadstatus.
 * 
 * <p>About 'loadstatus' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Loadstatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary loadstatus = new Elementary(root,new AlphanumericType(6)," ");
	
	/**
	 * Instantiate a new Loadstatus with a default record.
	 * @param configuration the configuration
	 */
	public Loadstatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Loadstatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Loadstatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute loadstatus.
	 * @return the loadstatus attribute reference
	 */
	public ElementaryRangeReference getLoadstatusReference() {
		return loadstatus.getReference();
	}

	/**
	 * Getter for loadstatus attribute.
	 * @return loadstatus attribute
	 */
	public String getLoadstatus() {
		return loadstatus.getValue();
	}

	/**
	 * Setter for loadstatus attribute.
	 * @param loadstatus the new value of loadstatus
	 */
	public void setLoadstatus(String loadstatus) {
		this.loadstatus.setValue(loadstatus);
	}
}
