package aws.bluage.carddemo.cdact02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Scrn1.
 * 
 * <p>About 'dcsrrec' field, <br>
 * </p>
 * 
 * <p>About 'dcsrfld' field, <br>
 * </p>
 * 
 * <p>About 'dcsrpos' field, <br>
 * </p>
 * 
 * <p>About 'dpgmname' field, <br>
 * </p>
 * 
 * <p>About 'dacctnum' field, <br>
 * </p>
 * 
 * <p>About 'dopendate' field, <br>
 * </p>
 * 
 * <p>About 'dexpirydate' field, <br>
 * </p>
 * 
 * <p>About 'dpricustid' field, <br>
 * </p>
 * 
 * <p>About 'dseccustid' field, <br>
 * </p>
 * 
 * <p>About 'dacctgrp' field, <br>
 * </p>
 * 
 * <p>About 'dcredlimit' field, <br>
 * </p>
 * 
 * <p>About 'dcashlimit' field, <br>
 * </p>
 * 
 * <p>About 'dbalance' field, <br>
 * </p>
 * 
 * <p>About 'dcurcredit' field, <br>
 * </p>
 * 
 * <p>About 'dcurdebit' field, <br>
 * </p>
 * 
 * <p>About 'dactcrtusr' field, <br>
 * </p>
 * 
 * <p>About 'dactcrtdt' field, <br>
 * </p>
 * 
 * <p>About 'dactcrttm' field, <br>
 * </p>
 * 
 * <p>About 'dactcrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'dactchgusr' field, <br>
 * </p>
 * 
 * <p>About 'dactchgdt' field, <br>
 * </p>
 * 
 * <p>About 'dactchgtm' field, <br>
 * </p>
 * 
 * <p>About 'dactchgpgm' field, <br>
 * </p>
 * 
 * <p>About 'dstatus' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Scrn1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dcsrrec = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcsrfld = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcsrpos = new Elementary(root,new ZonedType(4, 0, true),Short.valueOf("0"));
	private final Elementary dpgmname = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dacctnum = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary dopendate = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dexpirydate = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dpricustid = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary dseccustid = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary dacctgrp = new Elementary(root,new AlphanumericType(15)," ");
	private final Elementary dcredlimit = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcashlimit = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dbalance = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcurcredit = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcurdebit = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dactcrtusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dactcrtdt = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dactcrttm = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dactcrtpgm = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dactchgusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dactchgdt = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dactchgtm = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dactchgpgm = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dstatus = new Elementary(root,new AlphanumericType(8)," ");
	
	/**
	 * Instantiate a new Scrn1 with a default record.
	 * @param configuration the configuration
	 */
	public Scrn1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Scrn1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Scrn1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dcsrrec.
	 * @return the dcsrrec attribute reference
	 */
	public ElementaryRangeReference getDcsrrecReference() {
		return dcsrrec.getReference();
	}

	/**
	 * Getter for dcsrrec attribute.
	 * @return dcsrrec attribute
	 */
	public String getDcsrrec() {
		return dcsrrec.getValue();
	}

	/**
	 * Setter for dcsrrec attribute.
	 * @param dcsrrec the new value of dcsrrec
	 */
	public void setDcsrrec(String dcsrrec) {
		this.dcsrrec.setValue(dcsrrec);
	}
	/**
	 * Gets the reference for attribute dcsrfld.
	 * @return the dcsrfld attribute reference
	 */
	public ElementaryRangeReference getDcsrfldReference() {
		return dcsrfld.getReference();
	}

	/**
	 * Getter for dcsrfld attribute.
	 * @return dcsrfld attribute
	 */
	public String getDcsrfld() {
		return dcsrfld.getValue();
	}

	/**
	 * Setter for dcsrfld attribute.
	 * @param dcsrfld the new value of dcsrfld
	 */
	public void setDcsrfld(String dcsrfld) {
		this.dcsrfld.setValue(dcsrfld);
	}
	/**
	 * Gets the reference for attribute dcsrpos.
	 * @return the dcsrpos attribute reference
	 */
	public ElementaryRangeReference getDcsrposReference() {
		return dcsrpos.getReference();
	}

	/**
	 * Getter for dcsrpos attribute.
	 * @return dcsrpos attribute
	 */
	public int getDcsrpos() {
		return dcsrpos.getValue();
	}

	/**
	 * Setter for dcsrpos attribute.
	 * @param dcsrpos the new value of dcsrpos
	 */
	public void setDcsrpos(int dcsrpos) {
		this.dcsrpos.setValue(dcsrpos);
	}
	/**
	 * Gets the reference for attribute dpgmname.
	 * @return the dpgmname attribute reference
	 */
	public ElementaryRangeReference getDpgmnameReference() {
		return dpgmname.getReference();
	}

	/**
	 * Getter for dpgmname attribute.
	 * @return dpgmname attribute
	 */
	public String getDpgmname() {
		return dpgmname.getValue();
	}

	/**
	 * Setter for dpgmname attribute.
	 * @param dpgmname the new value of dpgmname
	 */
	public void setDpgmname(String dpgmname) {
		this.dpgmname.setValue(dpgmname);
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
	 * Gets the reference for attribute dopendate.
	 * @return the dopendate attribute reference
	 */
	public ElementaryRangeReference getDopendateReference() {
		return dopendate.getReference();
	}

	/**
	 * Getter for dopendate attribute.
	 * @return dopendate attribute
	 */
	public String getDopendate() {
		return dopendate.getValue();
	}

	/**
	 * Setter for dopendate attribute.
	 * @param dopendate the new value of dopendate
	 */
	public void setDopendate(String dopendate) {
		this.dopendate.setValue(dopendate);
	}
	/**
	 * Gets the reference for attribute dexpirydate.
	 * @return the dexpirydate attribute reference
	 */
	public ElementaryRangeReference getDexpirydateReference() {
		return dexpirydate.getReference();
	}

	/**
	 * Getter for dexpirydate attribute.
	 * @return dexpirydate attribute
	 */
	public String getDexpirydate() {
		return dexpirydate.getValue();
	}

	/**
	 * Setter for dexpirydate attribute.
	 * @param dexpirydate the new value of dexpirydate
	 */
	public void setDexpirydate(String dexpirydate) {
		this.dexpirydate.setValue(dexpirydate);
	}
	/**
	 * Gets the reference for attribute dpricustid.
	 * @return the dpricustid attribute reference
	 */
	public ElementaryRangeReference getDpricustidReference() {
		return dpricustid.getReference();
	}

	/**
	 * Getter for dpricustid attribute.
	 * @return dpricustid attribute
	 */
	public String getDpricustid() {
		return dpricustid.getValue();
	}

	/**
	 * Setter for dpricustid attribute.
	 * @param dpricustid the new value of dpricustid
	 */
	public void setDpricustid(String dpricustid) {
		this.dpricustid.setValue(dpricustid);
	}
	/**
	 * Gets the reference for attribute dseccustid.
	 * @return the dseccustid attribute reference
	 */
	public ElementaryRangeReference getDseccustidReference() {
		return dseccustid.getReference();
	}

	/**
	 * Getter for dseccustid attribute.
	 * @return dseccustid attribute
	 */
	public String getDseccustid() {
		return dseccustid.getValue();
	}

	/**
	 * Setter for dseccustid attribute.
	 * @param dseccustid the new value of dseccustid
	 */
	public void setDseccustid(String dseccustid) {
		this.dseccustid.setValue(dseccustid);
	}
	/**
	 * Gets the reference for attribute dacctgrp.
	 * @return the dacctgrp attribute reference
	 */
	public ElementaryRangeReference getDacctgrpReference() {
		return dacctgrp.getReference();
	}

	/**
	 * Getter for dacctgrp attribute.
	 * @return dacctgrp attribute
	 */
	public String getDacctgrp() {
		return dacctgrp.getValue();
	}

	/**
	 * Setter for dacctgrp attribute.
	 * @param dacctgrp the new value of dacctgrp
	 */
	public void setDacctgrp(String dacctgrp) {
		this.dacctgrp.setValue(dacctgrp);
	}
	/**
	 * Gets the reference for attribute dcredlimit.
	 * @return the dcredlimit attribute reference
	 */
	public ElementaryRangeReference getDcredlimitReference() {
		return dcredlimit.getReference();
	}

	/**
	 * Getter for dcredlimit attribute.
	 * @return dcredlimit attribute
	 */
	public String getDcredlimit() {
		return dcredlimit.getValue();
	}

	/**
	 * Setter for dcredlimit attribute.
	 * @param dcredlimit the new value of dcredlimit
	 */
	public void setDcredlimit(String dcredlimit) {
		this.dcredlimit.setValue(dcredlimit);
	}
	/**
	 * Gets the reference for attribute dcashlimit.
	 * @return the dcashlimit attribute reference
	 */
	public ElementaryRangeReference getDcashlimitReference() {
		return dcashlimit.getReference();
	}

	/**
	 * Getter for dcashlimit attribute.
	 * @return dcashlimit attribute
	 */
	public String getDcashlimit() {
		return dcashlimit.getValue();
	}

	/**
	 * Setter for dcashlimit attribute.
	 * @param dcashlimit the new value of dcashlimit
	 */
	public void setDcashlimit(String dcashlimit) {
		this.dcashlimit.setValue(dcashlimit);
	}
	/**
	 * Gets the reference for attribute dbalance.
	 * @return the dbalance attribute reference
	 */
	public ElementaryRangeReference getDbalanceReference() {
		return dbalance.getReference();
	}

	/**
	 * Getter for dbalance attribute.
	 * @return dbalance attribute
	 */
	public String getDbalance() {
		return dbalance.getValue();
	}

	/**
	 * Setter for dbalance attribute.
	 * @param dbalance the new value of dbalance
	 */
	public void setDbalance(String dbalance) {
		this.dbalance.setValue(dbalance);
	}
	/**
	 * Gets the reference for attribute dcurcredit.
	 * @return the dcurcredit attribute reference
	 */
	public ElementaryRangeReference getDcurcreditReference() {
		return dcurcredit.getReference();
	}

	/**
	 * Getter for dcurcredit attribute.
	 * @return dcurcredit attribute
	 */
	public String getDcurcredit() {
		return dcurcredit.getValue();
	}

	/**
	 * Setter for dcurcredit attribute.
	 * @param dcurcredit the new value of dcurcredit
	 */
	public void setDcurcredit(String dcurcredit) {
		this.dcurcredit.setValue(dcurcredit);
	}
	/**
	 * Gets the reference for attribute dcurdebit.
	 * @return the dcurdebit attribute reference
	 */
	public ElementaryRangeReference getDcurdebitReference() {
		return dcurdebit.getReference();
	}

	/**
	 * Getter for dcurdebit attribute.
	 * @return dcurdebit attribute
	 */
	public String getDcurdebit() {
		return dcurdebit.getValue();
	}

	/**
	 * Setter for dcurdebit attribute.
	 * @param dcurdebit the new value of dcurdebit
	 */
	public void setDcurdebit(String dcurdebit) {
		this.dcurdebit.setValue(dcurdebit);
	}
	/**
	 * Gets the reference for attribute dactcrtusr.
	 * @return the dactcrtusr attribute reference
	 */
	public ElementaryRangeReference getDactcrtusrReference() {
		return dactcrtusr.getReference();
	}

	/**
	 * Getter for dactcrtusr attribute.
	 * @return dactcrtusr attribute
	 */
	public String getDactcrtusr() {
		return dactcrtusr.getValue();
	}

	/**
	 * Setter for dactcrtusr attribute.
	 * @param dactcrtusr the new value of dactcrtusr
	 */
	public void setDactcrtusr(String dactcrtusr) {
		this.dactcrtusr.setValue(dactcrtusr);
	}
	/**
	 * Gets the reference for attribute dactcrtdt.
	 * @return the dactcrtdt attribute reference
	 */
	public ElementaryRangeReference getDactcrtdtReference() {
		return dactcrtdt.getReference();
	}

	/**
	 * Getter for dactcrtdt attribute.
	 * @return dactcrtdt attribute
	 */
	public int getDactcrtdt() {
		return dactcrtdt.getValue();
	}

	/**
	 * Setter for dactcrtdt attribute.
	 * @param dactcrtdt the new value of dactcrtdt
	 */
	public void setDactcrtdt(int dactcrtdt) {
		this.dactcrtdt.setValue(dactcrtdt);
	}
	/**
	 * Gets the reference for attribute dactcrttm.
	 * @return the dactcrttm attribute reference
	 */
	public ElementaryRangeReference getDactcrttmReference() {
		return dactcrttm.getReference();
	}

	/**
	 * Getter for dactcrttm attribute.
	 * @return dactcrttm attribute
	 */
	public int getDactcrttm() {
		return dactcrttm.getValue();
	}

	/**
	 * Setter for dactcrttm attribute.
	 * @param dactcrttm the new value of dactcrttm
	 */
	public void setDactcrttm(int dactcrttm) {
		this.dactcrttm.setValue(dactcrttm);
	}
	/**
	 * Gets the reference for attribute dactcrtpgm.
	 * @return the dactcrtpgm attribute reference
	 */
	public ElementaryRangeReference getDactcrtpgmReference() {
		return dactcrtpgm.getReference();
	}

	/**
	 * Getter for dactcrtpgm attribute.
	 * @return dactcrtpgm attribute
	 */
	public String getDactcrtpgm() {
		return dactcrtpgm.getValue();
	}

	/**
	 * Setter for dactcrtpgm attribute.
	 * @param dactcrtpgm the new value of dactcrtpgm
	 */
	public void setDactcrtpgm(String dactcrtpgm) {
		this.dactcrtpgm.setValue(dactcrtpgm);
	}
	/**
	 * Gets the reference for attribute dactchgusr.
	 * @return the dactchgusr attribute reference
	 */
	public ElementaryRangeReference getDactchgusrReference() {
		return dactchgusr.getReference();
	}

	/**
	 * Getter for dactchgusr attribute.
	 * @return dactchgusr attribute
	 */
	public String getDactchgusr() {
		return dactchgusr.getValue();
	}

	/**
	 * Setter for dactchgusr attribute.
	 * @param dactchgusr the new value of dactchgusr
	 */
	public void setDactchgusr(String dactchgusr) {
		this.dactchgusr.setValue(dactchgusr);
	}
	/**
	 * Gets the reference for attribute dactchgdt.
	 * @return the dactchgdt attribute reference
	 */
	public ElementaryRangeReference getDactchgdtReference() {
		return dactchgdt.getReference();
	}

	/**
	 * Getter for dactchgdt attribute.
	 * @return dactchgdt attribute
	 */
	public int getDactchgdt() {
		return dactchgdt.getValue();
	}

	/**
	 * Setter for dactchgdt attribute.
	 * @param dactchgdt the new value of dactchgdt
	 */
	public void setDactchgdt(int dactchgdt) {
		this.dactchgdt.setValue(dactchgdt);
	}
	/**
	 * Gets the reference for attribute dactchgtm.
	 * @return the dactchgtm attribute reference
	 */
	public ElementaryRangeReference getDactchgtmReference() {
		return dactchgtm.getReference();
	}

	/**
	 * Getter for dactchgtm attribute.
	 * @return dactchgtm attribute
	 */
	public int getDactchgtm() {
		return dactchgtm.getValue();
	}

	/**
	 * Setter for dactchgtm attribute.
	 * @param dactchgtm the new value of dactchgtm
	 */
	public void setDactchgtm(int dactchgtm) {
		this.dactchgtm.setValue(dactchgtm);
	}
	/**
	 * Gets the reference for attribute dactchgpgm.
	 * @return the dactchgpgm attribute reference
	 */
	public ElementaryRangeReference getDactchgpgmReference() {
		return dactchgpgm.getReference();
	}

	/**
	 * Getter for dactchgpgm attribute.
	 * @return dactchgpgm attribute
	 */
	public String getDactchgpgm() {
		return dactchgpgm.getValue();
	}

	/**
	 * Setter for dactchgpgm attribute.
	 * @param dactchgpgm the new value of dactchgpgm
	 */
	public void setDactchgpgm(String dactchgpgm) {
		this.dactchgpgm.setValue(dactchgpgm);
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
}
