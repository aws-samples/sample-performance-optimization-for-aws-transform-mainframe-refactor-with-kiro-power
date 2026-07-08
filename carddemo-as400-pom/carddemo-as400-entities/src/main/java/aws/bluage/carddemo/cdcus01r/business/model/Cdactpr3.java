package aws.bluage.carddemo.cdcus01r.business.model;

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
 * Data simplifier entity Cdactpr3.
 * 
 * <p>About 'acctnum' field, <br>
 * </p>
 * 
 * <p>About 'active' field, <br>
 * </p>
 * 
 * <p>About 'opendate' field, <br>
 * </p>
 * 
 * <p>About 'expirydate' field, <br>
 * </p>
 * 
 * <p>About 'credlimit' field, <br>
 * </p>
 * 
 * <p>About 'cashlimit' field, <br>
 * </p>
 * 
 * <p>About 'balance' field, <br>
 * </p>
 * 
 * <p>About 'curcredit' field, <br>
 * </p>
 * 
 * <p>About 'curdebit' field, <br>
 * </p>
 * 
 * <p>About 'acctgrp' field, <br>
 * </p>
 * 
 * <p>About 'pricustid' field, <br>
 * </p>
 * 
 * <p>About 'seccustid' field, <br>
 * </p>
 * 
 * <p>About 'actcrtdt' field, <br>
 * </p>
 * 
 * <p>About 'actcrttm' field, <br>
 * </p>
 * 
 * <p>About 'actcrtusr' field, <br>
 * </p>
 * 
 * <p>About 'actcrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'actchgdt' field, <br>
 * </p>
 * 
 * <p>About 'actchgtm' field, <br>
 * </p>
 * 
 * <p>About 'actchgusr' field, <br>
 * </p>
 * 
 * <p>About 'actchgpgm' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cdactpr3 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary acctnum = new Elementary(root,new PackedType(12, 0, true));
	private final Elementary active = new Elementary(root,new AlphanumericType(1));
	private final Elementary opendate = new Elementary(root,new AlphanumericType(10));
	private final Elementary expirydate = new Elementary(root,new AlphanumericType(10));
	private final Elementary credlimit = new Elementary(root,new PackedType(7, 2, true));
	private final Elementary cashlimit = new Elementary(root,new PackedType(7, 2, true));
	private final Elementary balance = new Elementary(root,new PackedType(7, 2, true));
	private final Elementary curcredit = new Elementary(root,new PackedType(7, 2, true));
	private final Elementary curdebit = new Elementary(root,new PackedType(7, 2, true));
	private final Elementary acctgrp = new Elementary(root,new AlphanumericType(10));
	private final Elementary pricustid = new Elementary(root,new PackedType(9, 0, true));
	private final Elementary seccustid = new Elementary(root,new PackedType(9, 0, true));
	private final Elementary actcrtdt = new Elementary(root,new PackedType(7, 0, true));
	private final Elementary actcrttm = new Elementary(root,new PackedType(6, 0, true));
	private final Elementary actcrtusr = new Elementary(root,new AlphanumericType(10));
	private final Elementary actcrtpgm = new Elementary(root,new AlphanumericType(10));
	private final Elementary actchgdt = new Elementary(root,new PackedType(7, 0, true));
	private final Elementary actchgtm = new Elementary(root,new PackedType(6, 0, true));
	private final Elementary actchgusr = new Elementary(root,new AlphanumericType(10));
	private final Elementary actchgpgm = new Elementary(root,new AlphanumericType(10));
	
	/**
	 * Instantiate a new Cdactpr3 with a default record.
	 * @param configuration the configuration
	 */
	public Cdactpr3(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cdactpr3 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cdactpr3(Configuration configuration, RecordAdaptable record) {
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
	 * Gets the reference for attribute active.
	 * @return the active attribute reference
	 */
	public ElementaryRangeReference getActiveReference() {
		return active.getReference();
	}

	/**
	 * Getter for active attribute.
	 * @return active attribute
	 */
	public String getActive() {
		return active.getValue();
	}

	/**
	 * Setter for active attribute.
	 * @param active the new value of active
	 */
	public void setActive(String active) {
		this.active.setValue(active);
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
	 * Gets the reference for attribute expirydate.
	 * @return the expirydate attribute reference
	 */
	public ElementaryRangeReference getExpirydateReference() {
		return expirydate.getReference();
	}

	/**
	 * Getter for expirydate attribute.
	 * @return expirydate attribute
	 */
	public String getExpirydate() {
		return expirydate.getValue();
	}

	/**
	 * Setter for expirydate attribute.
	 * @param expirydate the new value of expirydate
	 */
	public void setExpirydate(String expirydate) {
		this.expirydate.setValue(expirydate);
	}
	/**
	 * Gets the reference for attribute credlimit.
	 * @return the credlimit attribute reference
	 */
	public ElementaryRangeReference getCredlimitReference() {
		return credlimit.getReference();
	}

	/**
	 * Getter for credlimit attribute.
	 * @return credlimit attribute
	 */
	public BigDecimal getCredlimit() {
		return credlimit.getValue();
	}

	/**
	 * Setter for credlimit attribute.
	 * @param credlimit the new value of credlimit
	 */
	public void setCredlimit(BigDecimal credlimit) {
		this.credlimit.setValue(credlimit);
	}
	/**
	 * Gets the reference for attribute cashlimit.
	 * @return the cashlimit attribute reference
	 */
	public ElementaryRangeReference getCashlimitReference() {
		return cashlimit.getReference();
	}

	/**
	 * Getter for cashlimit attribute.
	 * @return cashlimit attribute
	 */
	public BigDecimal getCashlimit() {
		return cashlimit.getValue();
	}

	/**
	 * Setter for cashlimit attribute.
	 * @param cashlimit the new value of cashlimit
	 */
	public void setCashlimit(BigDecimal cashlimit) {
		this.cashlimit.setValue(cashlimit);
	}
	/**
	 * Gets the reference for attribute balance.
	 * @return the balance attribute reference
	 */
	public ElementaryRangeReference getBalanceReference() {
		return balance.getReference();
	}

	/**
	 * Getter for balance attribute.
	 * @return balance attribute
	 */
	public BigDecimal getBalance() {
		return balance.getValue();
	}

	/**
	 * Setter for balance attribute.
	 * @param balance the new value of balance
	 */
	public void setBalance(BigDecimal balance) {
		this.balance.setValue(balance);
	}
	/**
	 * Gets the reference for attribute curcredit.
	 * @return the curcredit attribute reference
	 */
	public ElementaryRangeReference getCurcreditReference() {
		return curcredit.getReference();
	}

	/**
	 * Getter for curcredit attribute.
	 * @return curcredit attribute
	 */
	public BigDecimal getCurcredit() {
		return curcredit.getValue();
	}

	/**
	 * Setter for curcredit attribute.
	 * @param curcredit the new value of curcredit
	 */
	public void setCurcredit(BigDecimal curcredit) {
		this.curcredit.setValue(curcredit);
	}
	/**
	 * Gets the reference for attribute curdebit.
	 * @return the curdebit attribute reference
	 */
	public ElementaryRangeReference getCurdebitReference() {
		return curdebit.getReference();
	}

	/**
	 * Getter for curdebit attribute.
	 * @return curdebit attribute
	 */
	public BigDecimal getCurdebit() {
		return curdebit.getValue();
	}

	/**
	 * Setter for curdebit attribute.
	 * @param curdebit the new value of curdebit
	 */
	public void setCurdebit(BigDecimal curdebit) {
		this.curdebit.setValue(curdebit);
	}
	/**
	 * Gets the reference for attribute acctgrp.
	 * @return the acctgrp attribute reference
	 */
	public ElementaryRangeReference getAcctgrpReference() {
		return acctgrp.getReference();
	}

	/**
	 * Getter for acctgrp attribute.
	 * @return acctgrp attribute
	 */
	public String getAcctgrp() {
		return acctgrp.getValue();
	}

	/**
	 * Setter for acctgrp attribute.
	 * @param acctgrp the new value of acctgrp
	 */
	public void setAcctgrp(String acctgrp) {
		this.acctgrp.setValue(acctgrp);
	}
	/**
	 * Gets the reference for attribute pricustid.
	 * @return the pricustid attribute reference
	 */
	public ElementaryRangeReference getPricustidReference() {
		return pricustid.getReference();
	}

	/**
	 * Getter for pricustid attribute.
	 * @return pricustid attribute
	 */
	public int getPricustid() {
		return pricustid.getValue();
	}

	/**
	 * Setter for pricustid attribute.
	 * @param pricustid the new value of pricustid
	 */
	public void setPricustid(int pricustid) {
		this.pricustid.setValue(pricustid);
	}
	/**
	 * Gets the reference for attribute seccustid.
	 * @return the seccustid attribute reference
	 */
	public ElementaryRangeReference getSeccustidReference() {
		return seccustid.getReference();
	}

	/**
	 * Getter for seccustid attribute.
	 * @return seccustid attribute
	 */
	public int getSeccustid() {
		return seccustid.getValue();
	}

	/**
	 * Setter for seccustid attribute.
	 * @param seccustid the new value of seccustid
	 */
	public void setSeccustid(int seccustid) {
		this.seccustid.setValue(seccustid);
	}
	/**
	 * Gets the reference for attribute actcrtdt.
	 * @return the actcrtdt attribute reference
	 */
	public ElementaryRangeReference getActcrtdtReference() {
		return actcrtdt.getReference();
	}

	/**
	 * Getter for actcrtdt attribute.
	 * @return actcrtdt attribute
	 */
	public int getActcrtdt() {
		return actcrtdt.getValue();
	}

	/**
	 * Setter for actcrtdt attribute.
	 * @param actcrtdt the new value of actcrtdt
	 */
	public void setActcrtdt(int actcrtdt) {
		this.actcrtdt.setValue(actcrtdt);
	}
	/**
	 * Gets the reference for attribute actcrttm.
	 * @return the actcrttm attribute reference
	 */
	public ElementaryRangeReference getActcrttmReference() {
		return actcrttm.getReference();
	}

	/**
	 * Getter for actcrttm attribute.
	 * @return actcrttm attribute
	 */
	public int getActcrttm() {
		return actcrttm.getValue();
	}

	/**
	 * Setter for actcrttm attribute.
	 * @param actcrttm the new value of actcrttm
	 */
	public void setActcrttm(int actcrttm) {
		this.actcrttm.setValue(actcrttm);
	}
	/**
	 * Gets the reference for attribute actcrtusr.
	 * @return the actcrtusr attribute reference
	 */
	public ElementaryRangeReference getActcrtusrReference() {
		return actcrtusr.getReference();
	}

	/**
	 * Getter for actcrtusr attribute.
	 * @return actcrtusr attribute
	 */
	public String getActcrtusr() {
		return actcrtusr.getValue();
	}

	/**
	 * Setter for actcrtusr attribute.
	 * @param actcrtusr the new value of actcrtusr
	 */
	public void setActcrtusr(String actcrtusr) {
		this.actcrtusr.setValue(actcrtusr);
	}
	/**
	 * Gets the reference for attribute actcrtpgm.
	 * @return the actcrtpgm attribute reference
	 */
	public ElementaryRangeReference getActcrtpgmReference() {
		return actcrtpgm.getReference();
	}

	/**
	 * Getter for actcrtpgm attribute.
	 * @return actcrtpgm attribute
	 */
	public String getActcrtpgm() {
		return actcrtpgm.getValue();
	}

	/**
	 * Setter for actcrtpgm attribute.
	 * @param actcrtpgm the new value of actcrtpgm
	 */
	public void setActcrtpgm(String actcrtpgm) {
		this.actcrtpgm.setValue(actcrtpgm);
	}
	/**
	 * Gets the reference for attribute actchgdt.
	 * @return the actchgdt attribute reference
	 */
	public ElementaryRangeReference getActchgdtReference() {
		return actchgdt.getReference();
	}

	/**
	 * Getter for actchgdt attribute.
	 * @return actchgdt attribute
	 */
	public int getActchgdt() {
		return actchgdt.getValue();
	}

	/**
	 * Setter for actchgdt attribute.
	 * @param actchgdt the new value of actchgdt
	 */
	public void setActchgdt(int actchgdt) {
		this.actchgdt.setValue(actchgdt);
	}
	/**
	 * Gets the reference for attribute actchgtm.
	 * @return the actchgtm attribute reference
	 */
	public ElementaryRangeReference getActchgtmReference() {
		return actchgtm.getReference();
	}

	/**
	 * Getter for actchgtm attribute.
	 * @return actchgtm attribute
	 */
	public int getActchgtm() {
		return actchgtm.getValue();
	}

	/**
	 * Setter for actchgtm attribute.
	 * @param actchgtm the new value of actchgtm
	 */
	public void setActchgtm(int actchgtm) {
		this.actchgtm.setValue(actchgtm);
	}
	/**
	 * Gets the reference for attribute actchgusr.
	 * @return the actchgusr attribute reference
	 */
	public ElementaryRangeReference getActchgusrReference() {
		return actchgusr.getReference();
	}

	/**
	 * Getter for actchgusr attribute.
	 * @return actchgusr attribute
	 */
	public String getActchgusr() {
		return actchgusr.getValue();
	}

	/**
	 * Setter for actchgusr attribute.
	 * @param actchgusr the new value of actchgusr
	 */
	public void setActchgusr(String actchgusr) {
		this.actchgusr.setValue(actchgusr);
	}
	/**
	 * Gets the reference for attribute actchgpgm.
	 * @return the actchgpgm attribute reference
	 */
	public ElementaryRangeReference getActchgpgmReference() {
		return actchgpgm.getReference();
	}

	/**
	 * Getter for actchgpgm attribute.
	 * @return actchgpgm attribute
	 */
	public String getActchgpgm() {
		return actchgpgm.getValue();
	}

	/**
	 * Setter for actchgpgm attribute.
	 * @param actchgpgm the new value of actchgpgm
	 */
	public void setActchgpgm(String actchgpgm) {
		this.actchgpgm.setValue(actchgpgm);
	}
}
