package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wposition.
 * 
 * <p>About 'wposition' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wposition extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wposition = new Elementary(root,new AlphanumericType(19)," ");
	
	/**
	 * Instantiate a new Wposition with a default record.
	 * @param configuration the configuration
	 */
	public Wposition(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wposition bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wposition(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wposition.
	 * @return the wposition attribute reference
	 */
	public ElementaryRangeReference getWpositionReference() {
		return wposition.getReference();
	}

	/**
	 * Getter for wposition attribute.
	 * @return wposition attribute
	 */
	public String getWposition() {
		return wposition.getValue();
	}

	/**
	 * Setter for wposition attribute.
	 * @param wposition the new value of wposition
	 */
	public void setWposition(String wposition) {
		this.wposition.setValue(wposition);
	}
}
