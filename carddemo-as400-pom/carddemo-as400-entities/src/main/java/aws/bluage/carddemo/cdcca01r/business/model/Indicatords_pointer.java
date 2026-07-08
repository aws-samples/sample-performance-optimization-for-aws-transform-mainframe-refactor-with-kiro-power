package aws.bluage.carddemo.cdcca01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PointerType;
/**
 * Data simplifier entity Indicatords_pointer.
 * 
 * <p>About 'indicatords_pointer' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indicatords_pointer extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary indicatords_pointer = new Elementary(root,new PointerType(getConfiguration()),"");
	
	/**
	 * Instantiate a new Indicatords_pointer with a default record.
	 * @param configuration the configuration
	 */
	public Indicatords_pointer(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indicatords_pointer bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indicatords_pointer(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute indicatords_pointer.
	 * @return the indicatords_pointer attribute reference
	 */
	public ElementaryRangeReference getIndicatords_pointerReference() {
		return indicatords_pointer.getReference();
	}

	/**
	 * Getter for indicatords_pointer attribute.
	 * @return indicatords_pointer attribute
	 */
	public Integer getIndicatords_pointer() {
		return indicatords_pointer.getValue();
	}

	/**
	 * Setter for indicatords_pointer attribute.
	 * @param indicatords_pointer the new value of indicatords_pointer
	 */
	public void setIndicatords_pointer(Integer indicatords_pointer) {
		this.indicatords_pointer.setValue(indicatords_pointer);
	}
}
