package aws.bluage.carddemo.cdact01r.business.model;

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
 * <p>About 'acctnum' field, <br>
 * </p>
 * 
 * <p>About 'opendate' field, <br>
 * </p>
 * 
 * <p>About 'actid' field, <br>
 * </p>
 * 
 * <p>About 'pgmq' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class SharedRecordFields extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary acctnum = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	private final Elementary opendate = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary actid = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary pgmq = new Elementary(root,new AlphanumericType(10)," ");
	
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
	 * Gets the reference for attribute acctnum.
	 * @return the acctnum attribute reference
	 */
	public ElementaryRangeReference getAcctnumReference() {
		return acctnum.getReference();
	}

	/**
	 * Getter for acctnum attribute.
	 * @return acctnum attribute
	 */
	public long getAcctnum() {
		return acctnum.getValue();
	}

	/**
	 * Setter for acctnum attribute.
	 * @param acctnum the new value of acctnum
	 */
	public void setAcctnum(long acctnum) {
		this.acctnum.setValue(acctnum);
	}
	/**
	 * Gets the reference for attribute opendate.
	 * @return the opendate attribute reference
	 */
	public ElementaryRangeReference getOpendateReference() {
		return opendate.getReference();
	}

	/**
	 * Getter for opendate attribute.
	 * @return opendate attribute
	 */
	public String getOpendate() {
		return opendate.getValue();
	}

	/**
	 * Setter for opendate attribute.
	 * @param opendate the new value of opendate
	 */
	public void setOpendate(String opendate) {
		this.opendate.setValue(opendate);
	}
	/**
	 * Gets the reference for attribute actid.
	 * @return the actid attribute reference
	 */
	public ElementaryRangeReference getActidReference() {
		return actid.getReference();
	}

	/**
	 * Getter for actid attribute.
	 * @return actid attribute
	 */
	public String getActid() {
		return actid.getValue();
	}

	/**
	 * Setter for actid attribute.
	 * @param actid the new value of actid
	 */
	public void setActid(String actid) {
		this.actid.setValue(actid);
	}
	/**
	 * Gets the reference for attribute pgmq.
	 * @return the pgmq attribute reference
	 */
	public ElementaryRangeReference getPgmqReference() {
		return pgmq.getReference();
	}

	/**
	 * Getter for pgmq attribute.
	 * @return pgmq attribute
	 */
	public String getPgmq() {
		return pgmq.getValue();
	}

	/**
	 * Setter for pgmq attribute.
	 * @param pgmq the new value of pgmq
	 */
	public void setPgmq(String pgmq) {
		this.pgmq.setValue(pgmq);
	}
}
