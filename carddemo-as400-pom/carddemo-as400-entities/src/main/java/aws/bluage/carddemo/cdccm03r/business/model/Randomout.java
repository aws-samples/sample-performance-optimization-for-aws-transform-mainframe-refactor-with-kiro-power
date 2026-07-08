package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.DoubleFloatingPointType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Randomout.
 * 
 * <p>About 'randomout' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Randomout extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary randomout = new Elementary(root,new DoubleFloatingPointType(),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Randomout with a default record.
	 * @param configuration the configuration
	 */
	public Randomout(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Randomout bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Randomout(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute randomout.
	 * @return the randomout attribute reference
	 */
	public ElementaryRangeReference getRandomoutReference() {
		return randomout.getReference();
	}

	/**
	 * Getter for randomout attribute.
	 * @return randomout attribute
	 */
	public double getRandomout() {
		return randomout.getValue();
	}

	/**
	 * Setter for randomout attribute.
	 * @param randomout the new value of randomout
	 */
	public void setRandomout(double randomout) {
		this.randomout.setValue(randomout);
	}
}
