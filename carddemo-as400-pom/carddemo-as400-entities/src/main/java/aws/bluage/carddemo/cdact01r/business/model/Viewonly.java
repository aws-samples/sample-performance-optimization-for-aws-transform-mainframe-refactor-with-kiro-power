package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Viewonly.
 * 
 * <p>About 'viewonly' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Viewonly extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary viewonly = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Viewonly with a default record.
	 * @param configuration the configuration
	 */
	public Viewonly(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Viewonly bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Viewonly(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute viewonly.
	 * @return the viewonly attribute reference
	 */
	public ElementaryRangeReference getViewonlyReference() {
		return viewonly.getReference();
	}

	/**
	 * Getter for viewonly attribute.
	 * @return viewonly attribute
	 */
	public String getViewonly() {
		return viewonly.getValue();
	}

	/**
	 * Setter for viewonly attribute.
	 * @param viewonly the new value of viewonly
	 */
	public void setViewonly(String viewonly) {
		this.viewonly.setValue(viewonly);
	}
}
