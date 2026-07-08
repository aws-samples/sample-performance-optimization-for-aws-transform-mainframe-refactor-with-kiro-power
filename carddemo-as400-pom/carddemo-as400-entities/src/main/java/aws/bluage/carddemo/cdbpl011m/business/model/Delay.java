package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Delay.
 * 
 * <p>About 'delay' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Delay extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary delay = new Elementary(root,new AlphanumericType(2),"01");
	
	/**
	 * Instantiate a new Delay with a default record.
	 * @param configuration the configuration
	 */
	public Delay(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Delay bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Delay(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute delay.
	 * @return the delay attribute reference
	 */
	public ElementaryRangeReference getDelayReference() {
		return delay.getReference();
	}

	/**
	 * Getter for delay attribute.
	 * @return delay attribute
	 */
	public String getDelay() {
		return delay.getValue();
	}

	/**
	 * Setter for delay attribute.
	 * @param delay the new value of delay
	 */
	public void setDelay(String delay) {
		this.delay.setValue(delay);
	}
}
