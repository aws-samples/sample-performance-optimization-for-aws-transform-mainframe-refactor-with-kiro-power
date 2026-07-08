package aws.bluage.carddemo.cdact02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Itemschanged.
 * 
 * <p>About 'itemschanged' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Itemschanged extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary itemschanged = new Elementary(root,new AlphanumericType(1),"0");
	
	/**
	 * Instantiate a new Itemschanged with a default record.
	 * @param configuration the configuration
	 */
	public Itemschanged(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Itemschanged bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Itemschanged(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute itemschanged.
	 * @return the itemschanged attribute reference
	 */
	public ElementaryRangeReference getItemschangedReference() {
		return itemschanged.getReference();
	}

	/**
	 * Getter for itemschanged attribute.
	 * @return itemschanged attribute
	 */
	public String getItemschanged() {
		return itemschanged.getValue();
	}

	/**
	 * Setter for itemschanged attribute.
	 * @param itemschanged the new value of itemschanged
	 */
	public void setItemschanged(String itemschanged) {
		this.itemschanged.setValue(itemschanged);
	}
}
