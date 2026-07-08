package aws.bluage.carddemo.cdcus02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PointerType;
/**
 * Data simplifier entity Indicators_pointer.
 * 
 * <p>About 'indicators_pointer' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indicators_pointer extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary indicators_pointer = new Elementary(root,new PointerType(getConfiguration()),"");
	
	/**
	 * Instantiate a new Indicators_pointer with a default record.
	 * @param configuration the configuration
	 */
	public Indicators_pointer(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indicators_pointer bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indicators_pointer(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute indicators_pointer.
	 * @return the indicators_pointer attribute reference
	 */
	public ElementaryRangeReference getIndicators_pointerReference() {
		return indicators_pointer.getReference();
	}

	/**
	 * Getter for indicators_pointer attribute.
	 * @return indicators_pointer attribute
	 */
	public Integer getIndicators_pointer() {
		return indicators_pointer.getValue();
	}

	/**
	 * Setter for indicators_pointer attribute.
	 * @param indicators_pointer the new value of indicators_pointer
	 */
	public void setIndicators_pointer(Integer indicators_pointer) {
		this.indicators_pointer.setValue(indicators_pointer);
	}
}
