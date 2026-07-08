package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wccmseccust.
 * 
 * <p>About 'wccmseccust' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wccmseccust extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wccmseccust = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	
	/**
	 * Instantiate a new Wccmseccust with a default record.
	 * @param configuration the configuration
	 */
	public Wccmseccust(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wccmseccust bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wccmseccust(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wccmseccust.
	 * @return the wccmseccust attribute reference
	 */
	public ElementaryRangeReference getWccmseccustReference() {
		return wccmseccust.getReference();
	}

	/**
	 * Getter for wccmseccust attribute.
	 * @return wccmseccust attribute
	 */
	public int getWccmseccust() {
		return wccmseccust.getValue();
	}

	/**
	 * Setter for wccmseccust attribute.
	 * @param wccmseccust the new value of wccmseccust
	 */
	public void setWccmseccust(int wccmseccust) {
		this.wccmseccust.setValue(wccmseccust);
	}
}
