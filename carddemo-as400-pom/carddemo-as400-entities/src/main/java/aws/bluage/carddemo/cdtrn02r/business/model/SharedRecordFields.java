package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity SharedRecordFields.
 * 
 * <p>About 'trnid' field, <br>
 * </p>
 * 
 * <p>About 'cardnum' field, <br>
 * </p>
 * 
 * <p>About 'spgmq' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class SharedRecordFields extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary trnid = new Elementary(root,new PackedType(15, 0, true),new BigDecimal("0"));
	private final Elementary cardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	private final Elementary spgmq = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new SharedRecordFields with a default record.
	 * @param configuration the configuration
	 */
	public SharedRecordFields(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new SharedRecordFields bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public SharedRecordFields(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute trnid.
	 * @return the trnid attribute reference
	 */
	public ElementaryRangeReference getTrnidReference() {
		return trnid.getReference();
	}

	/**
	 * Getter for trnid attribute.
	 * @return trnid attribute
	 */
	public long getTrnid() {
		return trnid.getValue();
	}

	/**
	 * Setter for trnid attribute.
	 * @param trnid the new value of trnid
	 */
	public void setTrnid(long trnid) {
		this.trnid.setValue(trnid);
	}
	/**
	 * Gets the reference for attribute cardnum.
	 * @return the cardnum attribute reference
	 */
	public ElementaryRangeReference getCardnumReference() {
		return cardnum.getReference();
	}

	/**
	 * Getter for cardnum attribute.
	 * @return cardnum attribute
	 */
	public long getCardnum() {
		return cardnum.getValue();
	}

	/**
	 * Setter for cardnum attribute.
	 * @param cardnum the new value of cardnum
	 */
	public void setCardnum(long cardnum) {
		this.cardnum.setValue(cardnum);
	}
	/**
	 * Gets the reference for attribute spgmq.
	 * @return the spgmq attribute reference
	 */
	public ElementaryRangeReference getSpgmqReference() {
		return spgmq.getReference();
	}

	/**
	 * Getter for spgmq attribute.
	 * @return spgmq attribute
	 */
	public String getSpgmq() {
		return spgmq.getValue();
	}

	/**
	 * Setter for spgmq attribute.
	 * @param spgmq the new value of spgmq
	 */
	public void setSpgmq(String spgmq) {
		this.spgmq.setValue(spgmq);
	}
}
