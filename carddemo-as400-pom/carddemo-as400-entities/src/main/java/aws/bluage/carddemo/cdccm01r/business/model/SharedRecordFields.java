package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity SharedRecordFields.
 * 
 * <p>About 'dcardnum' field, <br>
 * </p>
 * 
 * <p>About 'dcustid' field, <br>
 * </p>
 * 
 * <p>About 'dacctnum' field, <br>
 * </p>
 * 
 * <p>About 'dstatus' field, <br>
 * </p>
 * 
 * <p>About 'dpgmq' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class SharedRecordFields extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dcardnum = new Elementary(root,new ZonedType(16, 0, true),new BigDecimal("0"));
	private final Elementary dcustid = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary dacctnum = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary dstatus = new Elementary(root,new AlphanumericType(1)," ");
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
	 * Gets the reference for attribute dcardnum.
	 * @return the dcardnum attribute reference
	 */
	public ElementaryRangeReference getDcardnumReference() {
		return dcardnum.getReference();
	}

	/**
	 * Getter for dcardnum attribute.
	 * @return dcardnum attribute
	 */
	public long getDcardnum() {
		return dcardnum.getValue();
	}

	/**
	 * Setter for dcardnum attribute.
	 * @param dcardnum the new value of dcardnum
	 */
	public void setDcardnum(long dcardnum) {
		this.dcardnum.setValue(dcardnum);
	}
	/**
	 * Gets the reference for attribute dcustid.
	 * @return the dcustid attribute reference
	 */
	public ElementaryRangeReference getDcustidReference() {
		return dcustid.getReference();
	}

	/**
	 * Getter for dcustid attribute.
	 * @return dcustid attribute
	 */
	public String getDcustid() {
		return dcustid.getValue();
	}

	/**
	 * Setter for dcustid attribute.
	 * @param dcustid the new value of dcustid
	 */
	public void setDcustid(String dcustid) {
		this.dcustid.setValue(dcustid);
	}
	/**
	 * Gets the reference for attribute dacctnum.
	 * @return the dacctnum attribute reference
	 */
	public ElementaryRangeReference getDacctnumReference() {
		return dacctnum.getReference();
	}

	/**
	 * Getter for dacctnum attribute.
	 * @return dacctnum attribute
	 */
	public String getDacctnum() {
		return dacctnum.getValue();
	}

	/**
	 * Setter for dacctnum attribute.
	 * @param dacctnum the new value of dacctnum
	 */
	public void setDacctnum(String dacctnum) {
		this.dacctnum.setValue(dacctnum);
	}
	/**
	 * Gets the reference for attribute dstatus.
	 * @return the dstatus attribute reference
	 */
	public ElementaryRangeReference getDstatusReference() {
		return dstatus.getReference();
	}

	/**
	 * Getter for dstatus attribute.
	 * @return dstatus attribute
	 */
	public String getDstatus() {
		return dstatus.getValue();
	}

	/**
	 * Setter for dstatus attribute.
	 * @param dstatus the new value of dstatus
	 */
	public void setDstatus(String dstatus) {
		this.dstatus.setValue(dstatus);
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
