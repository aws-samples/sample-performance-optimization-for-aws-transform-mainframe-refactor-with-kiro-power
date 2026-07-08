package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Randomseed.
 * 
 * <p>About 'randomseed' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Randomseed extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary randomseed = new Elementary(root,new ZonedType(9, 0, true),Integer.valueOf("0"));
	
	/**
	 * Instantiate a new Randomseed with a default record.
	 * @param configuration the configuration
	 */
	public Randomseed(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Randomseed bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Randomseed(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute randomseed.
	 * @return the randomseed attribute reference
	 */
	public ElementaryRangeReference getRandomseedReference() {
		return randomseed.getReference();
	}

	/**
	 * Getter for randomseed attribute.
	 * @return randomseed attribute
	 */
	public int getRandomseed() {
		return randomseed.getValue();
	}

	/**
	 * Setter for randomseed attribute.
	 * @param randomseed the new value of randomseed
	 */
	public void setRandomseed(int randomseed) {
		this.randomseed.setValue(randomseed);
	}
}
