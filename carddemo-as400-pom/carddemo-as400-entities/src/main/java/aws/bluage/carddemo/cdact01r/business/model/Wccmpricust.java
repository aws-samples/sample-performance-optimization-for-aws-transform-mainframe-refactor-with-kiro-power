package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wccmpricust.
 * 
 * <p>About 'wccmpricust' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wccmpricust extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wccmpricust = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	
	/**
	 * Instantiate a new Wccmpricust with a default record.
	 * @param configuration the configuration
	 */
	public Wccmpricust(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wccmpricust bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wccmpricust(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wccmpricust.
	 * @return the wccmpricust attribute reference
	 */
	public ElementaryRangeReference getWccmpricustReference() {
		return wccmpricust.getReference();
	}

	/**
	 * Getter for wccmpricust attribute.
	 * @return wccmpricust attribute
	 */
	public int getWccmpricust() {
		return wccmpricust.getValue();
	}

	/**
	 * Setter for wccmpricust attribute.
	 * @param wccmpricust the new value of wccmpricust
	 */
	public void setWccmpricust(int wccmpricust) {
		this.wccmpricust.setValue(wccmpricust);
	}
}
