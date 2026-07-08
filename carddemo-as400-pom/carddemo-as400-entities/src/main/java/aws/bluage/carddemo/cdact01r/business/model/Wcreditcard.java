package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wcreditcard.
 * 
 * <p>About 'wcreditcard' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcreditcard extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcreditcard = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Wcreditcard with a default record.
	 * @param configuration the configuration
	 */
	public Wcreditcard(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcreditcard bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcreditcard(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcreditcard.
	 * @return the wcreditcard attribute reference
	 */
	public ElementaryRangeReference getWcreditcardReference() {
		return wcreditcard.getReference();
	}

	/**
	 * Getter for wcreditcard attribute.
	 * @return wcreditcard attribute
	 */
	public String getWcreditcard() {
		return wcreditcard.getValue();
	}

	/**
	 * Setter for wcreditcard attribute.
	 * @param wcreditcard the new value of wcreditcard
	 */
	public void setWcreditcard(String wcreditcard) {
		this.wcreditcard.setValue(wcreditcard);
	}
}
