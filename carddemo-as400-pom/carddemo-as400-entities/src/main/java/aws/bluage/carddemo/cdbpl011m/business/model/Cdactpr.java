package aws.bluage.carddemo.cdbpl011m.business.model;

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
 * Data simplifier entity Cdactpr.
 * 
 * <p>About 'act_acctnum' field, <br>
 * </p>
 * 
 * <p>About 'act_active' field, <br>
 * </p>
 * 
 * <p>About 'act_opendate' field, <br>
 * </p>
 * 
 * <p>About 'act_expirydate' field, <br>
 * </p>
 * 
 * <p>About 'act_credlimit' field, <br>
 * </p>
 * 
 * <p>About 'act_cashlimit' field, <br>
 * </p>
 * 
 * <p>About 'act_balance' field, <br>
 * </p>
 * 
 * <p>About 'act_curcredit' field, <br>
 * </p>
 * 
 * <p>About 'act_curdebit' field, <br>
 * </p>
 * 
 * <p>About 'act_acctgrp' field, <br>
 * </p>
 * 
 * <p>About 'act_pricustid' field, <br>
 * </p>
 * 
 * <p>About 'act_seccustid' field, <br>
 * </p>
 * 
 * <p>About 'act_actcrtdt' field, <br>
 * </p>
 * 
 * <p>About 'act_actcrttm' field, <br>
 * </p>
 * 
 * <p>About 'act_actcrtusr' field, <br>
 * </p>
 * 
 * <p>About 'act_actcrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'act_actchgdt' field, <br>
 * </p>
 * 
 * <p>About 'act_actchgtm' field, <br>
 * </p>
 * 
 * <p>About 'act_actchgusr' field, <br>
 * </p>
 * 
 * <p>About 'act_actchgpgm' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cdactpr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary act_acctnum = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	private final Elementary act_active = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary act_opendate = new Elementary(root,new AlphanumericType(10),"0001-01-01");
	private final Elementary act_expirydate = new Elementary(root,new AlphanumericType(10),"0001-01-01");
	private final Elementary act_credlimit = new Elementary(root,new PackedType(7, 2, true),new BigDecimal("0"));
	private final Elementary act_cashlimit = new Elementary(root,new PackedType(7, 2, true),new BigDecimal("0"));
	private final Elementary act_balance = new Elementary(root,new PackedType(7, 2, true),new BigDecimal("0"));
	private final Elementary act_curcredit = new Elementary(root,new PackedType(7, 2, true),new BigDecimal("0"));
	private final Elementary act_curdebit = new Elementary(root,new PackedType(7, 2, true),new BigDecimal("0"));
	private final Elementary act_acctgrp = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary act_pricustid = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary act_seccustid = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary act_actcrtdt = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary act_actcrttm = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary act_actcrtusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary act_actcrtpgm = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary act_actchgdt = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary act_actchgtm = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary act_actchgusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary act_actchgpgm = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Cdactpr with a default record.
	 * @param configuration the configuration
	 */
	public Cdactpr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cdactpr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cdactpr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute act_acctnum.
	 * @return the act_acctnum attribute reference
	 */
	public ElementaryRangeReference getAct_acctnumReference() {
		return act_acctnum.getReference();
	}

	/**
	 * Getter for act_acctnum attribute.
	 * @return act_acctnum attribute
	 */
	public long getAct_acctnum() {
		return act_acctnum.getValue();
	}

	/**
	 * Setter for act_acctnum attribute.
	 * @param act_acctnum the new value of act_acctnum
	 */
	public void setAct_acctnum(long act_acctnum) {
		this.act_acctnum.setValue(act_acctnum);
	}
	/**
	 * Gets the reference for attribute act_active.
	 * @return the act_active attribute reference
	 */
	public ElementaryRangeReference getAct_activeReference() {
		return act_active.getReference();
	}

	/**
	 * Getter for act_active attribute.
	 * @return act_active attribute
	 */
	public String getAct_active() {
		return act_active.getValue();
	}

	/**
	 * Setter for act_active attribute.
	 * @param act_active the new value of act_active
	 */
	public void setAct_active(String act_active) {
		this.act_active.setValue(act_active);
	}
	/**
	 * Gets the reference for attribute act_opendate.
	 * @return the act_opendate attribute reference
	 */
	public ElementaryRangeReference getAct_opendateReference() {
		return act_opendate.getReference();
	}

	/**
	 * Getter for act_opendate attribute.
	 * @return act_opendate attribute
	 */
	public String getAct_opendate() {
		return act_opendate.getValue();
	}

	/**
	 * Setter for act_opendate attribute.
	 * @param act_opendate the new value of act_opendate
	 */
	public void setAct_opendate(String act_opendate) {
		this.act_opendate.setValue(act_opendate);
	}
	/**
	 * Gets the reference for attribute act_expirydate.
	 * @return the act_expirydate attribute reference
	 */
	public ElementaryRangeReference getAct_expirydateReference() {
		return act_expirydate.getReference();
	}

	/**
	 * Getter for act_expirydate attribute.
	 * @return act_expirydate attribute
	 */
	public String getAct_expirydate() {
		return act_expirydate.getValue();
	}

	/**
	 * Setter for act_expirydate attribute.
	 * @param act_expirydate the new value of act_expirydate
	 */
	public void setAct_expirydate(String act_expirydate) {
		this.act_expirydate.setValue(act_expirydate);
	}
	/**
	 * Gets the reference for attribute act_credlimit.
	 * @return the act_credlimit attribute reference
	 */
	public ElementaryRangeReference getAct_credlimitReference() {
		return act_credlimit.getReference();
	}

	/**
	 * Getter for act_credlimit attribute.
	 * @return act_credlimit attribute
	 */
	public BigDecimal getAct_credlimit() {
		return act_credlimit.getValue();
	}

	/**
	 * Setter for act_credlimit attribute.
	 * @param act_credlimit the new value of act_credlimit
	 */
	public void setAct_credlimit(BigDecimal act_credlimit) {
		this.act_credlimit.setValue(act_credlimit);
	}
	/**
	 * Gets the reference for attribute act_cashlimit.
	 * @return the act_cashlimit attribute reference
	 */
	public ElementaryRangeReference getAct_cashlimitReference() {
		return act_cashlimit.getReference();
	}

	/**
	 * Getter for act_cashlimit attribute.
	 * @return act_cashlimit attribute
	 */
	public BigDecimal getAct_cashlimit() {
		return act_cashlimit.getValue();
	}

	/**
	 * Setter for act_cashlimit attribute.
	 * @param act_cashlimit the new value of act_cashlimit
	 */
	public void setAct_cashlimit(BigDecimal act_cashlimit) {
		this.act_cashlimit.setValue(act_cashlimit);
	}
	/**
	 * Gets the reference for attribute act_balance.
	 * @return the act_balance attribute reference
	 */
	public ElementaryRangeReference getAct_balanceReference() {
		return act_balance.getReference();
	}

	/**
	 * Getter for act_balance attribute.
	 * @return act_balance attribute
	 */
	public BigDecimal getAct_balance() {
		return act_balance.getValue();
	}

	/**
	 * Setter for act_balance attribute.
	 * @param act_balance the new value of act_balance
	 */
	public void setAct_balance(BigDecimal act_balance) {
		this.act_balance.setValue(act_balance);
	}
	/**
	 * Gets the reference for attribute act_curcredit.
	 * @return the act_curcredit attribute reference
	 */
	public ElementaryRangeReference getAct_curcreditReference() {
		return act_curcredit.getReference();
	}

	/**
	 * Getter for act_curcredit attribute.
	 * @return act_curcredit attribute
	 */
	public BigDecimal getAct_curcredit() {
		return act_curcredit.getValue();
	}

	/**
	 * Setter for act_curcredit attribute.
	 * @param act_curcredit the new value of act_curcredit
	 */
	public void setAct_curcredit(BigDecimal act_curcredit) {
		this.act_curcredit.setValue(act_curcredit);
	}
	/**
	 * Gets the reference for attribute act_curdebit.
	 * @return the act_curdebit attribute reference
	 */
	public ElementaryRangeReference getAct_curdebitReference() {
		return act_curdebit.getReference();
	}

	/**
	 * Getter for act_curdebit attribute.
	 * @return act_curdebit attribute
	 */
	public BigDecimal getAct_curdebit() {
		return act_curdebit.getValue();
	}

	/**
	 * Setter for act_curdebit attribute.
	 * @param act_curdebit the new value of act_curdebit
	 */
	public void setAct_curdebit(BigDecimal act_curdebit) {
		this.act_curdebit.setValue(act_curdebit);
	}
	/**
	 * Gets the reference for attribute act_acctgrp.
	 * @return the act_acctgrp attribute reference
	 */
	public ElementaryRangeReference getAct_acctgrpReference() {
		return act_acctgrp.getReference();
	}

	/**
	 * Getter for act_acctgrp attribute.
	 * @return act_acctgrp attribute
	 */
	public String getAct_acctgrp() {
		return act_acctgrp.getValue();
	}

	/**
	 * Setter for act_acctgrp attribute.
	 * @param act_acctgrp the new value of act_acctgrp
	 */
	public void setAct_acctgrp(String act_acctgrp) {
		this.act_acctgrp.setValue(act_acctgrp);
	}
	/**
	 * Gets the reference for attribute act_pricustid.
	 * @return the act_pricustid attribute reference
	 */
	public ElementaryRangeReference getAct_pricustidReference() {
		return act_pricustid.getReference();
	}

	/**
	 * Getter for act_pricustid attribute.
	 * @return act_pricustid attribute
	 */
	public int getAct_pricustid() {
		return act_pricustid.getValue();
	}

	/**
	 * Setter for act_pricustid attribute.
	 * @param act_pricustid the new value of act_pricustid
	 */
	public void setAct_pricustid(int act_pricustid) {
		this.act_pricustid.setValue(act_pricustid);
	}
	/**
	 * Gets the reference for attribute act_seccustid.
	 * @return the act_seccustid attribute reference
	 */
	public ElementaryRangeReference getAct_seccustidReference() {
		return act_seccustid.getReference();
	}

	/**
	 * Getter for act_seccustid attribute.
	 * @return act_seccustid attribute
	 */
	public int getAct_seccustid() {
		return act_seccustid.getValue();
	}

	/**
	 * Setter for act_seccustid attribute.
	 * @param act_seccustid the new value of act_seccustid
	 */
	public void setAct_seccustid(int act_seccustid) {
		this.act_seccustid.setValue(act_seccustid);
	}
	/**
	 * Gets the reference for attribute act_actcrtdt.
	 * @return the act_actcrtdt attribute reference
	 */
	public ElementaryRangeReference getAct_actcrtdtReference() {
		return act_actcrtdt.getReference();
	}

	/**
	 * Getter for act_actcrtdt attribute.
	 * @return act_actcrtdt attribute
	 */
	public int getAct_actcrtdt() {
		return act_actcrtdt.getValue();
	}

	/**
	 * Setter for act_actcrtdt attribute.
	 * @param act_actcrtdt the new value of act_actcrtdt
	 */
	public void setAct_actcrtdt(int act_actcrtdt) {
		this.act_actcrtdt.setValue(act_actcrtdt);
	}
	/**
	 * Gets the reference for attribute act_actcrttm.
	 * @return the act_actcrttm attribute reference
	 */
	public ElementaryRangeReference getAct_actcrttmReference() {
		return act_actcrttm.getReference();
	}

	/**
	 * Getter for act_actcrttm attribute.
	 * @return act_actcrttm attribute
	 */
	public int getAct_actcrttm() {
		return act_actcrttm.getValue();
	}

	/**
	 * Setter for act_actcrttm attribute.
	 * @param act_actcrttm the new value of act_actcrttm
	 */
	public void setAct_actcrttm(int act_actcrttm) {
		this.act_actcrttm.setValue(act_actcrttm);
	}
	/**
	 * Gets the reference for attribute act_actcrtusr.
	 * @return the act_actcrtusr attribute reference
	 */
	public ElementaryRangeReference getAct_actcrtusrReference() {
		return act_actcrtusr.getReference();
	}

	/**
	 * Getter for act_actcrtusr attribute.
	 * @return act_actcrtusr attribute
	 */
	public String getAct_actcrtusr() {
		return act_actcrtusr.getValue();
	}

	/**
	 * Setter for act_actcrtusr attribute.
	 * @param act_actcrtusr the new value of act_actcrtusr
	 */
	public void setAct_actcrtusr(String act_actcrtusr) {
		this.act_actcrtusr.setValue(act_actcrtusr);
	}
	/**
	 * Gets the reference for attribute act_actcrtpgm.
	 * @return the act_actcrtpgm attribute reference
	 */
	public ElementaryRangeReference getAct_actcrtpgmReference() {
		return act_actcrtpgm.getReference();
	}

	/**
	 * Getter for act_actcrtpgm attribute.
	 * @return act_actcrtpgm attribute
	 */
	public String getAct_actcrtpgm() {
		return act_actcrtpgm.getValue();
	}

	/**
	 * Setter for act_actcrtpgm attribute.
	 * @param act_actcrtpgm the new value of act_actcrtpgm
	 */
	public void setAct_actcrtpgm(String act_actcrtpgm) {
		this.act_actcrtpgm.setValue(act_actcrtpgm);
	}
	/**
	 * Gets the reference for attribute act_actchgdt.
	 * @return the act_actchgdt attribute reference
	 */
	public ElementaryRangeReference getAct_actchgdtReference() {
		return act_actchgdt.getReference();
	}

	/**
	 * Getter for act_actchgdt attribute.
	 * @return act_actchgdt attribute
	 */
	public int getAct_actchgdt() {
		return act_actchgdt.getValue();
	}

	/**
	 * Setter for act_actchgdt attribute.
	 * @param act_actchgdt the new value of act_actchgdt
	 */
	public void setAct_actchgdt(int act_actchgdt) {
		this.act_actchgdt.setValue(act_actchgdt);
	}
	/**
	 * Gets the reference for attribute act_actchgtm.
	 * @return the act_actchgtm attribute reference
	 */
	public ElementaryRangeReference getAct_actchgtmReference() {
		return act_actchgtm.getReference();
	}

	/**
	 * Getter for act_actchgtm attribute.
	 * @return act_actchgtm attribute
	 */
	public int getAct_actchgtm() {
		return act_actchgtm.getValue();
	}

	/**
	 * Setter for act_actchgtm attribute.
	 * @param act_actchgtm the new value of act_actchgtm
	 */
	public void setAct_actchgtm(int act_actchgtm) {
		this.act_actchgtm.setValue(act_actchgtm);
	}
	/**
	 * Gets the reference for attribute act_actchgusr.
	 * @return the act_actchgusr attribute reference
	 */
	public ElementaryRangeReference getAct_actchgusrReference() {
		return act_actchgusr.getReference();
	}

	/**
	 * Getter for act_actchgusr attribute.
	 * @return act_actchgusr attribute
	 */
	public String getAct_actchgusr() {
		return act_actchgusr.getValue();
	}

	/**
	 * Setter for act_actchgusr attribute.
	 * @param act_actchgusr the new value of act_actchgusr
	 */
	public void setAct_actchgusr(String act_actchgusr) {
		this.act_actchgusr.setValue(act_actchgusr);
	}
	/**
	 * Gets the reference for attribute act_actchgpgm.
	 * @return the act_actchgpgm attribute reference
	 */
	public ElementaryRangeReference getAct_actchgpgmReference() {
		return act_actchgpgm.getReference();
	}

	/**
	 * Getter for act_actchgpgm attribute.
	 * @return act_actchgpgm attribute
	 */
	public String getAct_actchgpgm() {
		return act_actchgpgm.getValue();
	}

	/**
	 * Setter for act_actchgpgm attribute.
	 * @param act_actchgpgm the new value of act_actchgpgm
	 */
	public void setAct_actchgpgm(String act_actchgpgm) {
		this.act_actchgpgm.setValue(act_actchgpgm);
	}
}
