package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Filterstring.
 * 
 * <p>About 'filterstring' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Filterstring extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary filterstring = new Elementary(root,new SizePrefixedAlphanumericType(10, 2),"");
	
	/**
	 * Instantiate a new Filterstring with a default record.
	 * @param configuration the configuration
	 */
	public Filterstring(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Filterstring bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Filterstring(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute filterstring.
	 * @return the filterstring attribute reference
	 */
	public ElementaryRangeReference getFilterstringReference() {
		return filterstring.getReference();
	}

	/**
	 * Getter for filterstring attribute.
	 * @return filterstring attribute
	 */
	public String getFilterstring() {
		return filterstring.getValue();
	}

	/**
	 * Setter for filterstring attribute.
	 * @param filterstring the new value of filterstring
	 */
	public void setFilterstring(String filterstring) {
		this.filterstring.setValue(filterstring);
	}
}
