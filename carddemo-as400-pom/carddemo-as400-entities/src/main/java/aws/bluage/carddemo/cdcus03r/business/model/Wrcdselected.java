package aws.bluage.carddemo.cdcus03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wrcdselected.
 * 
 * <p>About 'wrcdselected' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wrcdselected extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wrcdselected = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Wrcdselected with a default record.
	 * @param configuration the configuration
	 */
	public Wrcdselected(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wrcdselected bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wrcdselected(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wrcdselected.
	 * @return the wrcdselected attribute reference
	 */
	public ElementaryRangeReference getWrcdselectedReference() {
		return wrcdselected.getReference();
	}

	/**
	 * Getter for wrcdselected attribute.
	 * @return wrcdselected attribute
	 */
	public String getWrcdselected() {
		return wrcdselected.getValue();
	}

	/**
	 * Setter for wrcdselected attribute.
	 * @param wrcdselected the new value of wrcdselected
	 */
	public void setWrcdselected(String wrcdselected) {
		this.wrcdselected.setValue(wrcdselected);
	}
}
