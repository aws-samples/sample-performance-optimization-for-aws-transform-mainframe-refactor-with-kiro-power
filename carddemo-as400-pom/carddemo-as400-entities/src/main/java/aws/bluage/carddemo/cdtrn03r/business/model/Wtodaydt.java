package aws.bluage.carddemo.cdtrn03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wtodaydt.
 * 
 * <p>About 'wtodaydt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wtodaydt extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wtodaydt = new Elementary(root,new AlphanumericType(10),"*sys");
	
	/**
	 * Instantiate a new Wtodaydt with a default record.
	 * @param configuration the configuration
	 */
	public Wtodaydt(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wtodaydt bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wtodaydt(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wtodaydt.
	 * @return the wtodaydt attribute reference
	 */
	public ElementaryRangeReference getWtodaydtReference() {
		return wtodaydt.getReference();
	}

	/**
	 * Getter for wtodaydt attribute.
	 * @return wtodaydt attribute
	 */
	public String getWtodaydt() {
		return wtodaydt.getValue();
	}

	/**
	 * Setter for wtodaydt attribute.
	 * @param wtodaydt the new value of wtodaydt
	 */
	public void setWtodaydt(String wtodaydt) {
		this.wtodaydt.setValue(wtodaydt);
	}
}
