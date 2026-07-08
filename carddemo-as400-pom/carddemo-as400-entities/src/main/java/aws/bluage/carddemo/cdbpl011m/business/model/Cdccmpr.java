package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Cdccmpr.
 * 
 * <p>About 'ccm_cardnum' field, <br>
 * </p>
 * 
 * <p>About 'ccm_custid' field, <br>
 * </p>
 * 
 * <p>About 'ccm_acctnum' field, <br>
 * </p>
 * 
 * <p>About 'ccm_primarysec' field, <br>
 * </p>
 * 
 * <p>About 'ccm_name' field, <br>
 * </p>
 * 
 * <p>About 'ccm_expirymo' field, <br>
 * </p>
 * 
 * <p>About 'ccm_expiryyr' field, <br>
 * </p>
 * 
 * <p>About 'ccm_cvv' field, <br>
 * </p>
 * 
 * <p>About 'ccm_status' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmcrtdt' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmcrttm' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmcrtusr' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmcrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmchgdt' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmchgtm' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmchgusr' field, <br>
 * </p>
 * 
 * <p>About 'ccm_ccmchgpgm' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cdccmpr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ccm_cardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	private final Elementary ccm_custid = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary ccm_acctnum = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	private final Elementary ccm_primarysec = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary ccm_name = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary ccm_expirymo = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("0"));
	private final Elementary ccm_expiryyr = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("0"));
	private final Elementary ccm_cvv = new Elementary(root,new ZonedType(3, 0, true),Short.valueOf("0"));
	private final Elementary ccm_status = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary ccm_ccmcrtdt = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary ccm_ccmcrttm = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary ccm_ccmcrtusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ccm_ccmcrtpgm = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ccm_ccmchgdt = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary ccm_ccmchgtm = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary ccm_ccmchgusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ccm_ccmchgpgm = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Cdccmpr with a default record.
	 * @param configuration the configuration
	 */
	public Cdccmpr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cdccmpr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cdccmpr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ccm_cardnum.
	 * @return the ccm_cardnum attribute reference
	 */
	public ElementaryRangeReference getCcm_cardnumReference() {
		return ccm_cardnum.getReference();
	}

	/**
	 * Getter for ccm_cardnum attribute.
	 * @return ccm_cardnum attribute
	 */
	public long getCcm_cardnum() {
		return ccm_cardnum.getValue();
	}

	/**
	 * Setter for ccm_cardnum attribute.
	 * @param ccm_cardnum the new value of ccm_cardnum
	 */
	public void setCcm_cardnum(long ccm_cardnum) {
		this.ccm_cardnum.setValue(ccm_cardnum);
	}
	/**
	 * Gets the reference for attribute ccm_custid.
	 * @return the ccm_custid attribute reference
	 */
	public ElementaryRangeReference getCcm_custidReference() {
		return ccm_custid.getReference();
	}

	/**
	 * Getter for ccm_custid attribute.
	 * @return ccm_custid attribute
	 */
	public int getCcm_custid() {
		return ccm_custid.getValue();
	}

	/**
	 * Setter for ccm_custid attribute.
	 * @param ccm_custid the new value of ccm_custid
	 */
	public void setCcm_custid(int ccm_custid) {
		this.ccm_custid.setValue(ccm_custid);
	}
	/**
	 * Gets the reference for attribute ccm_acctnum.
	 * @return the ccm_acctnum attribute reference
	 */
	public ElementaryRangeReference getCcm_acctnumReference() {
		return ccm_acctnum.getReference();
	}

	/**
	 * Getter for ccm_acctnum attribute.
	 * @return ccm_acctnum attribute
	 */
	public long getCcm_acctnum() {
		return ccm_acctnum.getValue();
	}

	/**
	 * Setter for ccm_acctnum attribute.
	 * @param ccm_acctnum the new value of ccm_acctnum
	 */
	public void setCcm_acctnum(long ccm_acctnum) {
		this.ccm_acctnum.setValue(ccm_acctnum);
	}
	/**
	 * Gets the reference for attribute ccm_primarysec.
	 * @return the ccm_primarysec attribute reference
	 */
	public ElementaryRangeReference getCcm_primarysecReference() {
		return ccm_primarysec.getReference();
	}

	/**
	 * Getter for ccm_primarysec attribute.
	 * @return ccm_primarysec attribute
	 */
	public String getCcm_primarysec() {
		return ccm_primarysec.getValue();
	}

	/**
	 * Setter for ccm_primarysec attribute.
	 * @param ccm_primarysec the new value of ccm_primarysec
	 */
	public void setCcm_primarysec(String ccm_primarysec) {
		this.ccm_primarysec.setValue(ccm_primarysec);
	}
	/**
	 * Gets the reference for attribute ccm_name.
	 * @return the ccm_name attribute reference
	 */
	public ElementaryRangeReference getCcm_nameReference() {
		return ccm_name.getReference();
	}

	/**
	 * Getter for ccm_name attribute.
	 * @return ccm_name attribute
	 */
	public String getCcm_name() {
		return ccm_name.getValue();
	}

	/**
	 * Setter for ccm_name attribute.
	 * @param ccm_name the new value of ccm_name
	 */
	public void setCcm_name(String ccm_name) {
		this.ccm_name.setValue(ccm_name);
	}
	/**
	 * Gets the reference for attribute ccm_expirymo.
	 * @return the ccm_expirymo attribute reference
	 */
	public ElementaryRangeReference getCcm_expirymoReference() {
		return ccm_expirymo.getReference();
	}

	/**
	 * Getter for ccm_expirymo attribute.
	 * @return ccm_expirymo attribute
	 */
	public int getCcm_expirymo() {
		return ccm_expirymo.getValue();
	}

	/**
	 * Setter for ccm_expirymo attribute.
	 * @param ccm_expirymo the new value of ccm_expirymo
	 */
	public void setCcm_expirymo(int ccm_expirymo) {
		this.ccm_expirymo.setValue(ccm_expirymo);
	}
	/**
	 * Gets the reference for attribute ccm_expiryyr.
	 * @return the ccm_expiryyr attribute reference
	 */
	public ElementaryRangeReference getCcm_expiryyrReference() {
		return ccm_expiryyr.getReference();
	}

	/**
	 * Getter for ccm_expiryyr attribute.
	 * @return ccm_expiryyr attribute
	 */
	public int getCcm_expiryyr() {
		return ccm_expiryyr.getValue();
	}

	/**
	 * Setter for ccm_expiryyr attribute.
	 * @param ccm_expiryyr the new value of ccm_expiryyr
	 */
	public void setCcm_expiryyr(int ccm_expiryyr) {
		this.ccm_expiryyr.setValue(ccm_expiryyr);
	}
	/**
	 * Gets the reference for attribute ccm_cvv.
	 * @return the ccm_cvv attribute reference
	 */
	public ElementaryRangeReference getCcm_cvvReference() {
		return ccm_cvv.getReference();
	}

	/**
	 * Getter for ccm_cvv attribute.
	 * @return ccm_cvv attribute
	 */
	public int getCcm_cvv() {
		return ccm_cvv.getValue();
	}

	/**
	 * Setter for ccm_cvv attribute.
	 * @param ccm_cvv the new value of ccm_cvv
	 */
	public void setCcm_cvv(int ccm_cvv) {
		this.ccm_cvv.setValue(ccm_cvv);
	}
	/**
	 * Gets the reference for attribute ccm_status.
	 * @return the ccm_status attribute reference
	 */
	public ElementaryRangeReference getCcm_statusReference() {
		return ccm_status.getReference();
	}

	/**
	 * Getter for ccm_status attribute.
	 * @return ccm_status attribute
	 */
	public String getCcm_status() {
		return ccm_status.getValue();
	}

	/**
	 * Setter for ccm_status attribute.
	 * @param ccm_status the new value of ccm_status
	 */
	public void setCcm_status(String ccm_status) {
		this.ccm_status.setValue(ccm_status);
	}
	/**
	 * Gets the reference for attribute ccm_ccmcrtdt.
	 * @return the ccm_ccmcrtdt attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmcrtdtReference() {
		return ccm_ccmcrtdt.getReference();
	}

	/**
	 * Getter for ccm_ccmcrtdt attribute.
	 * @return ccm_ccmcrtdt attribute
	 */
	public int getCcm_ccmcrtdt() {
		return ccm_ccmcrtdt.getValue();
	}

	/**
	 * Setter for ccm_ccmcrtdt attribute.
	 * @param ccm_ccmcrtdt the new value of ccm_ccmcrtdt
	 */
	public void setCcm_ccmcrtdt(int ccm_ccmcrtdt) {
		this.ccm_ccmcrtdt.setValue(ccm_ccmcrtdt);
	}
	/**
	 * Gets the reference for attribute ccm_ccmcrttm.
	 * @return the ccm_ccmcrttm attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmcrttmReference() {
		return ccm_ccmcrttm.getReference();
	}

	/**
	 * Getter for ccm_ccmcrttm attribute.
	 * @return ccm_ccmcrttm attribute
	 */
	public int getCcm_ccmcrttm() {
		return ccm_ccmcrttm.getValue();
	}

	/**
	 * Setter for ccm_ccmcrttm attribute.
	 * @param ccm_ccmcrttm the new value of ccm_ccmcrttm
	 */
	public void setCcm_ccmcrttm(int ccm_ccmcrttm) {
		this.ccm_ccmcrttm.setValue(ccm_ccmcrttm);
	}
	/**
	 * Gets the reference for attribute ccm_ccmcrtusr.
	 * @return the ccm_ccmcrtusr attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmcrtusrReference() {
		return ccm_ccmcrtusr.getReference();
	}

	/**
	 * Getter for ccm_ccmcrtusr attribute.
	 * @return ccm_ccmcrtusr attribute
	 */
	public String getCcm_ccmcrtusr() {
		return ccm_ccmcrtusr.getValue();
	}

	/**
	 * Setter for ccm_ccmcrtusr attribute.
	 * @param ccm_ccmcrtusr the new value of ccm_ccmcrtusr
	 */
	public void setCcm_ccmcrtusr(String ccm_ccmcrtusr) {
		this.ccm_ccmcrtusr.setValue(ccm_ccmcrtusr);
	}
	/**
	 * Gets the reference for attribute ccm_ccmcrtpgm.
	 * @return the ccm_ccmcrtpgm attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmcrtpgmReference() {
		return ccm_ccmcrtpgm.getReference();
	}

	/**
	 * Getter for ccm_ccmcrtpgm attribute.
	 * @return ccm_ccmcrtpgm attribute
	 */
	public String getCcm_ccmcrtpgm() {
		return ccm_ccmcrtpgm.getValue();
	}

	/**
	 * Setter for ccm_ccmcrtpgm attribute.
	 * @param ccm_ccmcrtpgm the new value of ccm_ccmcrtpgm
	 */
	public void setCcm_ccmcrtpgm(String ccm_ccmcrtpgm) {
		this.ccm_ccmcrtpgm.setValue(ccm_ccmcrtpgm);
	}
	/**
	 * Gets the reference for attribute ccm_ccmchgdt.
	 * @return the ccm_ccmchgdt attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmchgdtReference() {
		return ccm_ccmchgdt.getReference();
	}

	/**
	 * Getter for ccm_ccmchgdt attribute.
	 * @return ccm_ccmchgdt attribute
	 */
	public int getCcm_ccmchgdt() {
		return ccm_ccmchgdt.getValue();
	}

	/**
	 * Setter for ccm_ccmchgdt attribute.
	 * @param ccm_ccmchgdt the new value of ccm_ccmchgdt
	 */
	public void setCcm_ccmchgdt(int ccm_ccmchgdt) {
		this.ccm_ccmchgdt.setValue(ccm_ccmchgdt);
	}
	/**
	 * Gets the reference for attribute ccm_ccmchgtm.
	 * @return the ccm_ccmchgtm attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmchgtmReference() {
		return ccm_ccmchgtm.getReference();
	}

	/**
	 * Getter for ccm_ccmchgtm attribute.
	 * @return ccm_ccmchgtm attribute
	 */
	public int getCcm_ccmchgtm() {
		return ccm_ccmchgtm.getValue();
	}

	/**
	 * Setter for ccm_ccmchgtm attribute.
	 * @param ccm_ccmchgtm the new value of ccm_ccmchgtm
	 */
	public void setCcm_ccmchgtm(int ccm_ccmchgtm) {
		this.ccm_ccmchgtm.setValue(ccm_ccmchgtm);
	}
	/**
	 * Gets the reference for attribute ccm_ccmchgusr.
	 * @return the ccm_ccmchgusr attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmchgusrReference() {
		return ccm_ccmchgusr.getReference();
	}

	/**
	 * Getter for ccm_ccmchgusr attribute.
	 * @return ccm_ccmchgusr attribute
	 */
	public String getCcm_ccmchgusr() {
		return ccm_ccmchgusr.getValue();
	}

	/**
	 * Setter for ccm_ccmchgusr attribute.
	 * @param ccm_ccmchgusr the new value of ccm_ccmchgusr
	 */
	public void setCcm_ccmchgusr(String ccm_ccmchgusr) {
		this.ccm_ccmchgusr.setValue(ccm_ccmchgusr);
	}
	/**
	 * Gets the reference for attribute ccm_ccmchgpgm.
	 * @return the ccm_ccmchgpgm attribute reference
	 */
	public ElementaryRangeReference getCcm_ccmchgpgmReference() {
		return ccm_ccmchgpgm.getReference();
	}

	/**
	 * Getter for ccm_ccmchgpgm attribute.
	 * @return ccm_ccmchgpgm attribute
	 */
	public String getCcm_ccmchgpgm() {
		return ccm_ccmchgpgm.getValue();
	}

	/**
	 * Setter for ccm_ccmchgpgm attribute.
	 * @param ccm_ccmchgpgm the new value of ccm_ccmchgpgm
	 */
	public void setCcm_ccmchgpgm(String ccm_ccmchgpgm) {
		this.ccm_ccmchgpgm.setValue(ccm_ccmchgpgm);
	}
}
