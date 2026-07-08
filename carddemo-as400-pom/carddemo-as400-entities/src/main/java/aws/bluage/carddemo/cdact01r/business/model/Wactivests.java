package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wactivests.
 * 
 * <p>About 'wactivests' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wactivests extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wactivests = new Elementary(root,new AlphanumericType(1),"A");
	
	/**
	 * Instantiate a new Wactivests with a default record.
	 * @param configuration the configuration
	 */
	public Wactivests(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wactivests bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wactivests(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wactivests.
	 * @return the wactivests attribute reference
	 */
	public ElementaryRangeReference getWactivestsReference() {
		return wactivests.getReference();
	}

	/**
	 * Getter for wactivests attribute.
	 * @return wactivests attribute
	 */
	public String getWactivests() {
		return wactivests.getValue();
	}

	/**
	 * Setter for wactivests attribute.
	 * @param wactivests the new value of wactivests
	 */
	public void setWactivests(String wactivests) {
		this.wactivests.setValue(wactivests);
	}
}
