package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Unique.
 * 
 * <p>About 'unique' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Unique extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary unique = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Unique with a default record.
	 * @param configuration the configuration
	 */
	public Unique(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Unique bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Unique(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute unique.
	 * @return the unique attribute reference
	 */
	public ElementaryRangeReference getUniqueReference() {
		return unique.getReference();
	}

	/**
	 * Getter for unique attribute.
	 * @return unique attribute
	 */
	public String getUnique() {
		return unique.getValue();
	}

	/**
	 * Setter for unique attribute.
	 * @param unique the new value of unique
	 */
	public void setUnique(String unique) {
		this.unique.setValue(unique);
	}
}
