package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Footer.
 * 
 * <p>About 'dashes' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Footer extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dashes = new Elementary(root,new AlphanumericType(130)," ");
	
	/**
	 * Instantiate a new Footer with a default record.
	 * @param configuration the configuration
	 */
	public Footer(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Footer bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Footer(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dashes.
	 * @return the dashes attribute reference
	 */
	public ElementaryRangeReference getDashesReference() {
		return dashes.getReference();
	}

	/**
	 * Getter for dashes attribute.
	 * @return dashes attribute
	 */
	public String getDashes() {
		return dashes.getValue();
	}

	/**
	 * Setter for dashes attribute.
	 * @param dashes the new value of dashes
	 */
	public void setDashes(String dashes) {
		this.dashes.setValue(dashes);
	}
}
