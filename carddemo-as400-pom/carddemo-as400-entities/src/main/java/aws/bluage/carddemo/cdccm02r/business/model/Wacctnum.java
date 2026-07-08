package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wacctnum.
 * 
 * <p>About 'wacctnum' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wacctnum extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wacctnum = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wacctnum with a default record.
	 * @param configuration the configuration
	 */
	public Wacctnum(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wacctnum bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wacctnum(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wacctnum.
	 * @return the wacctnum attribute reference
	 */
	public ElementaryRangeReference getWacctnumReference() {
		return wacctnum.getReference();
	}

	/**
	 * Getter for wacctnum attribute.
	 * @return wacctnum attribute
	 */
	public long getWacctnum() {
		return wacctnum.getValue();
	}

	/**
	 * Setter for wacctnum attribute.
	 * @param wacctnum the new value of wacctnum
	 */
	public void setWacctnum(long wacctnum) {
		this.wacctnum.setValue(wacctnum);
	}
}
