package aws.bluage.carddemo.cdccm02r.business.model;

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
 * <p>About 'custid' field, <br>
 * </p>
 * 
 * <p>About 'acctnum' field, <br>
 * </p>
 * 
 * <p>About 'dpgmq' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class SharedRecordFields extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary custid = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary acctnum = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	private final Elementary dpgmq = new Elementary(root,new AlphanumericType(10)," ");
	
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
	 * Gets the reference for attribute custid.
	 * @return the custid attribute reference
	 */
	public ElementaryRangeReference getCustidReference() {
		return custid.getReference();
	}

	/**
	 * Getter for custid attribute.
	 * @return custid attribute
	 */
	public int getCustid() {
		return custid.getValue();
	}

	/**
	 * Setter for custid attribute.
	 * @param custid the new value of custid
	 */
	public void setCustid(int custid) {
		this.custid.setValue(custid);
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
	 * Gets the reference for attribute dpgmq.
	 * @return the dpgmq attribute reference
	 */
	public ElementaryRangeReference getDpgmqReference() {
		return dpgmq.getReference();
	}

	/**
	 * Getter for dpgmq attribute.
	 * @return dpgmq attribute
	 */
	public String getDpgmq() {
		return dpgmq.getValue();
	}

	/**
	 * Setter for dpgmq attribute.
	 * @param dpgmq the new value of dpgmq
	 */
	public void setDpgmq(String dpgmq) {
		this.dpgmq.setValue(dpgmq);
	}
}
