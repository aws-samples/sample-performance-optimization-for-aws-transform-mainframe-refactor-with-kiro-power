package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryIntegerType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Randomin.
 * 
 * <p>About 'randomin' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Randomin extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary randomin = new Elementary(root,new BinaryIntegerType(4, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Randomin with a default record.
	 * @param configuration the configuration
	 */
	public Randomin(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Randomin bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Randomin(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute randomin.
	 * @return the randomin attribute reference
	 */
	public ElementaryRangeReference getRandominReference() {
		return randomin.getReference();
	}

	/**
	 * Getter for randomin attribute.
	 * @return randomin attribute
	 */
	public int getRandomin() {
		return randomin.getValue();
	}

	/**
	 * Setter for randomin attribute.
	 * @param randomin the new value of randomin
	 */
	public void setRandomin(int randomin) {
		this.randomin.setValue(randomin);
	}
}
