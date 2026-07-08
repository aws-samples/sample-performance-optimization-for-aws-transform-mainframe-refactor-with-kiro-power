package aws.bluage.carddemo.cdccm02r.business.model;

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
 * <p>About 'dcardnum' field, <br>
 * </p>
 * 
 * <p>About 'dcustid' field, <br>
 * </p>
 * 
 * <p>About 'dacctnum' field, <br>
 * </p>
 * 
 * <p>About 'dname' field, <br>
 * </p>
 * 
 * <p>About 'dprimarysec' field, <br>
 * </p>
 * 
 * <p>About 'dstatus' field, <br>
 * </p>
 * 
 * <p>About 'dstatusdess' field, <br>
 * </p>
 * 
 * <p>About 'dexpirymo' field, <br>
 * </p>
 * 
 * <p>About 'dexpiryyr' field, <br>
 * </p>
 * 
 * <p>About 'dcvv' field, <br>
 * </p>
 * 
 * <p>About 'dccmcrtusr' field, <br>
 * </p>
 * 
 * <p>About 'dccmcrtdt' field, <br>
 * </p>
 * 
 * <p>About 'dccmcrttm' field, <br>
 * </p>
 * 
 * <p>About 'dccmcrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'dccmchgusr' field, <br>
 * </p>
 * 
 * <p>About 'dccmchgdt' field, <br>
 * </p>
 * 
 * <p>About 'dccmchgtm' field, <br>
 * </p>
 * 
 * <p>About 'dccmchgpgm' field, <br>
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
	private final Elementary dcardnum = new Elementary(root,new ZonedType(16, 0, true),new BigDecimal("0"));
	private final Elementary dcustid = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary dacctnum = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary dname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary dprimarysec = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary dstatus = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary dstatusdess = new Elementary(root,new AlphanumericType(15)," ");
	private final Elementary dexpirymo = new Elementary(root,new AlphanumericType(2)," ");
	private final Elementary dexpiryyr = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary dcvv = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary dccmcrtusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dccmcrtdt = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dccmcrttm = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dccmcrtpgm = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dccmchgusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dccmchgdt = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dccmchgtm = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dccmchgpgm = new Elementary(root,new AlphanumericType(10)," ");
	
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
	 * Gets the reference for attribute dname.
	 * @return the dname attribute reference
	 */
	public ElementaryRangeReference getDnameReference() {
		return dname.getReference();
	}

	/**
	 * Getter for dname attribute.
	 * @return dname attribute
	 */
	public String getDname() {
		return dname.getValue();
	}

	/**
	 * Setter for dname attribute.
	 * @param dname the new value of dname
	 */
	public void setDname(String dname) {
		this.dname.setValue(dname);
	}
	/**
	 * Gets the reference for attribute dprimarysec.
	 * @return the dprimarysec attribute reference
	 */
	public ElementaryRangeReference getDprimarysecReference() {
		return dprimarysec.getReference();
	}

	/**
	 * Getter for dprimarysec attribute.
	 * @return dprimarysec attribute
	 */
	public String getDprimarysec() {
		return dprimarysec.getValue();
	}

	/**
	 * Setter for dprimarysec attribute.
	 * @param dprimarysec the new value of dprimarysec
	 */
	public void setDprimarysec(String dprimarysec) {
		this.dprimarysec.setValue(dprimarysec);
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
	 * Gets the reference for attribute dstatusdess.
	 * @return the dstatusdess attribute reference
	 */
	public ElementaryRangeReference getDstatusdessReference() {
		return dstatusdess.getReference();
	}

	/**
	 * Getter for dstatusdess attribute.
	 * @return dstatusdess attribute
	 */
	public String getDstatusdess() {
		return dstatusdess.getValue();
	}

	/**
	 * Setter for dstatusdess attribute.
	 * @param dstatusdess the new value of dstatusdess
	 */
	public void setDstatusdess(String dstatusdess) {
		this.dstatusdess.setValue(dstatusdess);
	}
	/**
	 * Gets the reference for attribute dexpirymo.
	 * @return the dexpirymo attribute reference
	 */
	public ElementaryRangeReference getDexpirymoReference() {
		return dexpirymo.getReference();
	}

	/**
	 * Getter for dexpirymo attribute.
	 * @return dexpirymo attribute
	 */
	public String getDexpirymo() {
		return dexpirymo.getValue();
	}

	/**
	 * Setter for dexpirymo attribute.
	 * @param dexpirymo the new value of dexpirymo
	 */
	public void setDexpirymo(String dexpirymo) {
		this.dexpirymo.setValue(dexpirymo);
	}
	/**
	 * Gets the reference for attribute dexpiryyr.
	 * @return the dexpiryyr attribute reference
	 */
	public ElementaryRangeReference getDexpiryyrReference() {
		return dexpiryyr.getReference();
	}

	/**
	 * Getter for dexpiryyr attribute.
	 * @return dexpiryyr attribute
	 */
	public String getDexpiryyr() {
		return dexpiryyr.getValue();
	}

	/**
	 * Setter for dexpiryyr attribute.
	 * @param dexpiryyr the new value of dexpiryyr
	 */
	public void setDexpiryyr(String dexpiryyr) {
		this.dexpiryyr.setValue(dexpiryyr);
	}
	/**
	 * Gets the reference for attribute dcvv.
	 * @return the dcvv attribute reference
	 */
	public ElementaryRangeReference getDcvvReference() {
		return dcvv.getReference();
	}

	/**
	 * Getter for dcvv attribute.
	 * @return dcvv attribute
	 */
	public String getDcvv() {
		return dcvv.getValue();
	}

	/**
	 * Setter for dcvv attribute.
	 * @param dcvv the new value of dcvv
	 */
	public void setDcvv(String dcvv) {
		this.dcvv.setValue(dcvv);
	}
	/**
	 * Gets the reference for attribute dccmcrtusr.
	 * @return the dccmcrtusr attribute reference
	 */
	public ElementaryRangeReference getDccmcrtusrReference() {
		return dccmcrtusr.getReference();
	}

	/**
	 * Getter for dccmcrtusr attribute.
	 * @return dccmcrtusr attribute
	 */
	public String getDccmcrtusr() {
		return dccmcrtusr.getValue();
	}

	/**
	 * Setter for dccmcrtusr attribute.
	 * @param dccmcrtusr the new value of dccmcrtusr
	 */
	public void setDccmcrtusr(String dccmcrtusr) {
		this.dccmcrtusr.setValue(dccmcrtusr);
	}
	/**
	 * Gets the reference for attribute dccmcrtdt.
	 * @return the dccmcrtdt attribute reference
	 */
	public ElementaryRangeReference getDccmcrtdtReference() {
		return dccmcrtdt.getReference();
	}

	/**
	 * Getter for dccmcrtdt attribute.
	 * @return dccmcrtdt attribute
	 */
	public int getDccmcrtdt() {
		return dccmcrtdt.getValue();
	}

	/**
	 * Setter for dccmcrtdt attribute.
	 * @param dccmcrtdt the new value of dccmcrtdt
	 */
	public void setDccmcrtdt(int dccmcrtdt) {
		this.dccmcrtdt.setValue(dccmcrtdt);
	}
	/**
	 * Gets the reference for attribute dccmcrttm.
	 * @return the dccmcrttm attribute reference
	 */
	public ElementaryRangeReference getDccmcrttmReference() {
		return dccmcrttm.getReference();
	}

	/**
	 * Getter for dccmcrttm attribute.
	 * @return dccmcrttm attribute
	 */
	public int getDccmcrttm() {
		return dccmcrttm.getValue();
	}

	/**
	 * Setter for dccmcrttm attribute.
	 * @param dccmcrttm the new value of dccmcrttm
	 */
	public void setDccmcrttm(int dccmcrttm) {
		this.dccmcrttm.setValue(dccmcrttm);
	}
	/**
	 * Gets the reference for attribute dccmcrtpgm.
	 * @return the dccmcrtpgm attribute reference
	 */
	public ElementaryRangeReference getDccmcrtpgmReference() {
		return dccmcrtpgm.getReference();
	}

	/**
	 * Getter for dccmcrtpgm attribute.
	 * @return dccmcrtpgm attribute
	 */
	public String getDccmcrtpgm() {
		return dccmcrtpgm.getValue();
	}

	/**
	 * Setter for dccmcrtpgm attribute.
	 * @param dccmcrtpgm the new value of dccmcrtpgm
	 */
	public void setDccmcrtpgm(String dccmcrtpgm) {
		this.dccmcrtpgm.setValue(dccmcrtpgm);
	}
	/**
	 * Gets the reference for attribute dccmchgusr.
	 * @return the dccmchgusr attribute reference
	 */
	public ElementaryRangeReference getDccmchgusrReference() {
		return dccmchgusr.getReference();
	}

	/**
	 * Getter for dccmchgusr attribute.
	 * @return dccmchgusr attribute
	 */
	public String getDccmchgusr() {
		return dccmchgusr.getValue();
	}

	/**
	 * Setter for dccmchgusr attribute.
	 * @param dccmchgusr the new value of dccmchgusr
	 */
	public void setDccmchgusr(String dccmchgusr) {
		this.dccmchgusr.setValue(dccmchgusr);
	}
	/**
	 * Gets the reference for attribute dccmchgdt.
	 * @return the dccmchgdt attribute reference
	 */
	public ElementaryRangeReference getDccmchgdtReference() {
		return dccmchgdt.getReference();
	}

	/**
	 * Getter for dccmchgdt attribute.
	 * @return dccmchgdt attribute
	 */
	public int getDccmchgdt() {
		return dccmchgdt.getValue();
	}

	/**
	 * Setter for dccmchgdt attribute.
	 * @param dccmchgdt the new value of dccmchgdt
	 */
	public void setDccmchgdt(int dccmchgdt) {
		this.dccmchgdt.setValue(dccmchgdt);
	}
	/**
	 * Gets the reference for attribute dccmchgtm.
	 * @return the dccmchgtm attribute reference
	 */
	public ElementaryRangeReference getDccmchgtmReference() {
		return dccmchgtm.getReference();
	}

	/**
	 * Getter for dccmchgtm attribute.
	 * @return dccmchgtm attribute
	 */
	public int getDccmchgtm() {
		return dccmchgtm.getValue();
	}

	/**
	 * Setter for dccmchgtm attribute.
	 * @param dccmchgtm the new value of dccmchgtm
	 */
	public void setDccmchgtm(int dccmchgtm) {
		this.dccmchgtm.setValue(dccmchgtm);
	}
	/**
	 * Gets the reference for attribute dccmchgpgm.
	 * @return the dccmchgpgm attribute reference
	 */
	public ElementaryRangeReference getDccmchgpgmReference() {
		return dccmchgpgm.getReference();
	}

	/**
	 * Getter for dccmchgpgm attribute.
	 * @return dccmchgpgm attribute
	 */
	public String getDccmchgpgm() {
		return dccmchgpgm.getValue();
	}

	/**
	 * Setter for dccmchgpgm attribute.
	 * @param dccmchgpgm the new value of dccmchgpgm
	 */
	public void setDccmchgpgm(String dccmchgpgm) {
		this.dccmchgpgm.setValue(dccmchgpgm);
	}
}
