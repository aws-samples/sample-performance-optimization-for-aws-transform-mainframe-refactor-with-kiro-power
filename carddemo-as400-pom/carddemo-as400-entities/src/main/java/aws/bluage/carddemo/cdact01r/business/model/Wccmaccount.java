package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wccmaccount.
 * 
 * <p>About 'wccmaccount' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wccmaccount extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wccmaccount = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wccmaccount with a default record.
	 * @param configuration the configuration
	 */
	public Wccmaccount(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wccmaccount bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wccmaccount(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wccmaccount.
	 * @return the wccmaccount attribute reference
	 */
	public ElementaryRangeReference getWccmaccountReference() {
		return wccmaccount.getReference();
	}

	/**
	 * Getter for wccmaccount attribute.
	 * @return wccmaccount attribute
	 */
	public long getWccmaccount() {
		return wccmaccount.getValue();
	}

	/**
	 * Setter for wccmaccount attribute.
	 * @param wccmaccount the new value of wccmaccount
	 */
	public void setWccmaccount(long wccmaccount) {
		this.wccmaccount.setValue(wccmaccount);
	}
}
