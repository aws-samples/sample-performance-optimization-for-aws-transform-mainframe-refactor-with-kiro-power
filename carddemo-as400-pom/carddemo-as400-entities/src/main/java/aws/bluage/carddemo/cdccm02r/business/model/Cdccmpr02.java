package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Cdccmpr02.
 * 
 * <p>About 'cardnum' field, <br>
 * </p>
 * 
 * <p>About 'custid' field, <br>
 * </p>
 * 
 * <p>About 'acctnum' field, <br>
 * </p>
 * 
 * <p>About 'primarysec' field, <br>
 * </p>
 * 
 * <p>About 'name' field, <br>
 * </p>
 * 
 * <p>About 'expirymo' field, <br>
 * </p>
 * 
 * <p>About 'expiryyr' field, <br>
 * </p>
 * 
 * <p>About 'cvv' field, <br>
 * </p>
 * 
 * <p>About 'status' field, <br>
 * </p>
 * 
 * <p>About 'ccmcrtdt' field, <br>
 * </p>
 * 
 * <p>About 'ccmcrttm' field, <br>
 * </p>
 * 
 * <p>About 'ccmcrtusr' field, <br>
 * </p>
 * 
 * <p>About 'ccmcrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'ccmchgdt' field, <br>
 * </p>
 * 
 * <p>About 'ccmchgtm' field, <br>
 * </p>
 * 
 * <p>About 'ccmchgusr' field, <br>
 * </p>
 * 
 * <p>About 'ccmchgpgm' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cdccmpr02 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cardnum = new Elementary(root,new PackedType(16, 0, true));
	private final Elementary custid = new Elementary(root,new PackedType(9, 0, true));
	private final Elementary acctnum = new Elementary(root,new PackedType(12, 0, true));
	private final Elementary primarysec = new Elementary(root,new AlphanumericType(1));
	private final Elementary name = new Elementary(root,new AlphanumericType(25));
	private final Elementary expirymo = new Elementary(root,new PackedType(2, 0, true));
	private final Elementary expiryyr = new Elementary(root,new PackedType(4, 0, true));
	private final Elementary cvv = new Elementary(root,new ZonedType(3, 0, true));
	private final Elementary status = new Elementary(root,new AlphanumericType(1));
	private final Elementary ccmcrtdt = new Elementary(root,new PackedType(7, 0, true));
	private final Elementary ccmcrttm = new Elementary(root,new PackedType(6, 0, true));
	private final Elementary ccmcrtusr = new Elementary(root,new AlphanumericType(10));
	private final Elementary ccmcrtpgm = new Elementary(root,new AlphanumericType(10));
	private final Elementary ccmchgdt = new Elementary(root,new PackedType(7, 0, true));
	private final Elementary ccmchgtm = new Elementary(root,new PackedType(6, 0, true));
	private final Elementary ccmchgusr = new Elementary(root,new AlphanumericType(10));
	private final Elementary ccmchgpgm = new Elementary(root,new AlphanumericType(10));
	
	/**
	 * Instantiate a new Cdccmpr02 with a default record.
	 * @param configuration the configuration
	 */
	public Cdccmpr02(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cdccmpr02 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cdccmpr02(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
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
	 * Gets the reference for attribute primarysec.
	 * @return the primarysec attribute reference
	 */
	public ElementaryRangeReference getPrimarysecReference() {
		return primarysec.getReference();
	}

	/**
	 * Getter for primarysec attribute.
	 * @return primarysec attribute
	 */
	public String getPrimarysec() {
		return primarysec.getValue();
	}

	/**
	 * Setter for primarysec attribute.
	 * @param primarysec the new value of primarysec
	 */
	public void setPrimarysec(String primarysec) {
		this.primarysec.setValue(primarysec);
	}
	/**
	 * Gets the reference for attribute name.
	 * @return the name attribute reference
	 */
	public ElementaryRangeReference getNameReference() {
		return name.getReference();
	}

	/**
	 * Getter for name attribute.
	 * @return name attribute
	 */
	public String getName() {
		return name.getValue();
	}

	/**
	 * Setter for name attribute.
	 * @param name the new value of name
	 */
	public void setName(String name) {
		this.name.setValue(name);
	}
	/**
	 * Gets the reference for attribute expirymo.
	 * @return the expirymo attribute reference
	 */
	public ElementaryRangeReference getExpirymoReference() {
		return expirymo.getReference();
	}

	/**
	 * Getter for expirymo attribute.
	 * @return expirymo attribute
	 */
	public int getExpirymo() {
		return expirymo.getValue();
	}

	/**
	 * Setter for expirymo attribute.
	 * @param expirymo the new value of expirymo
	 */
	public void setExpirymo(int expirymo) {
		this.expirymo.setValue(expirymo);
	}
	/**
	 * Gets the reference for attribute expiryyr.
	 * @return the expiryyr attribute reference
	 */
	public ElementaryRangeReference getExpiryyrReference() {
		return expiryyr.getReference();
	}

	/**
	 * Getter for expiryyr attribute.
	 * @return expiryyr attribute
	 */
	public int getExpiryyr() {
		return expiryyr.getValue();
	}

	/**
	 * Setter for expiryyr attribute.
	 * @param expiryyr the new value of expiryyr
	 */
	public void setExpiryyr(int expiryyr) {
		this.expiryyr.setValue(expiryyr);
	}
	/**
	 * Gets the reference for attribute cvv.
	 * @return the cvv attribute reference
	 */
	public ElementaryRangeReference getCvvReference() {
		return cvv.getReference();
	}

	/**
	 * Getter for cvv attribute.
	 * @return cvv attribute
	 */
	public int getCvv() {
		return cvv.getValue();
	}

	/**
	 * Setter for cvv attribute.
	 * @param cvv the new value of cvv
	 */
	public void setCvv(int cvv) {
		this.cvv.setValue(cvv);
	}
	/**
	 * Gets the reference for attribute status.
	 * @return the status attribute reference
	 */
	public ElementaryRangeReference getStatusReference() {
		return status.getReference();
	}

	/**
	 * Getter for status attribute.
	 * @return status attribute
	 */
	public String getStatus() {
		return status.getValue();
	}

	/**
	 * Setter for status attribute.
	 * @param status the new value of status
	 */
	public void setStatus(String status) {
		this.status.setValue(status);
	}
	/**
	 * Gets the reference for attribute ccmcrtdt.
	 * @return the ccmcrtdt attribute reference
	 */
	public ElementaryRangeReference getCcmcrtdtReference() {
		return ccmcrtdt.getReference();
	}

	/**
	 * Getter for ccmcrtdt attribute.
	 * @return ccmcrtdt attribute
	 */
	public int getCcmcrtdt() {
		return ccmcrtdt.getValue();
	}

	/**
	 * Setter for ccmcrtdt attribute.
	 * @param ccmcrtdt the new value of ccmcrtdt
	 */
	public void setCcmcrtdt(int ccmcrtdt) {
		this.ccmcrtdt.setValue(ccmcrtdt);
	}
	/**
	 * Gets the reference for attribute ccmcrttm.
	 * @return the ccmcrttm attribute reference
	 */
	public ElementaryRangeReference getCcmcrttmReference() {
		return ccmcrttm.getReference();
	}

	/**
	 * Getter for ccmcrttm attribute.
	 * @return ccmcrttm attribute
	 */
	public int getCcmcrttm() {
		return ccmcrttm.getValue();
	}

	/**
	 * Setter for ccmcrttm attribute.
	 * @param ccmcrttm the new value of ccmcrttm
	 */
	public void setCcmcrttm(int ccmcrttm) {
		this.ccmcrttm.setValue(ccmcrttm);
	}
	/**
	 * Gets the reference for attribute ccmcrtusr.
	 * @return the ccmcrtusr attribute reference
	 */
	public ElementaryRangeReference getCcmcrtusrReference() {
		return ccmcrtusr.getReference();
	}

	/**
	 * Getter for ccmcrtusr attribute.
	 * @return ccmcrtusr attribute
	 */
	public String getCcmcrtusr() {
		return ccmcrtusr.getValue();
	}

	/**
	 * Setter for ccmcrtusr attribute.
	 * @param ccmcrtusr the new value of ccmcrtusr
	 */
	public void setCcmcrtusr(String ccmcrtusr) {
		this.ccmcrtusr.setValue(ccmcrtusr);
	}
	/**
	 * Gets the reference for attribute ccmcrtpgm.
	 * @return the ccmcrtpgm attribute reference
	 */
	public ElementaryRangeReference getCcmcrtpgmReference() {
		return ccmcrtpgm.getReference();
	}

	/**
	 * Getter for ccmcrtpgm attribute.
	 * @return ccmcrtpgm attribute
	 */
	public String getCcmcrtpgm() {
		return ccmcrtpgm.getValue();
	}

	/**
	 * Setter for ccmcrtpgm attribute.
	 * @param ccmcrtpgm the new value of ccmcrtpgm
	 */
	public void setCcmcrtpgm(String ccmcrtpgm) {
		this.ccmcrtpgm.setValue(ccmcrtpgm);
	}
	/**
	 * Gets the reference for attribute ccmchgdt.
	 * @return the ccmchgdt attribute reference
	 */
	public ElementaryRangeReference getCcmchgdtReference() {
		return ccmchgdt.getReference();
	}

	/**
	 * Getter for ccmchgdt attribute.
	 * @return ccmchgdt attribute
	 */
	public int getCcmchgdt() {
		return ccmchgdt.getValue();
	}

	/**
	 * Setter for ccmchgdt attribute.
	 * @param ccmchgdt the new value of ccmchgdt
	 */
	public void setCcmchgdt(int ccmchgdt) {
		this.ccmchgdt.setValue(ccmchgdt);
	}
	/**
	 * Gets the reference for attribute ccmchgtm.
	 * @return the ccmchgtm attribute reference
	 */
	public ElementaryRangeReference getCcmchgtmReference() {
		return ccmchgtm.getReference();
	}

	/**
	 * Getter for ccmchgtm attribute.
	 * @return ccmchgtm attribute
	 */
	public int getCcmchgtm() {
		return ccmchgtm.getValue();
	}

	/**
	 * Setter for ccmchgtm attribute.
	 * @param ccmchgtm the new value of ccmchgtm
	 */
	public void setCcmchgtm(int ccmchgtm) {
		this.ccmchgtm.setValue(ccmchgtm);
	}
	/**
	 * Gets the reference for attribute ccmchgusr.
	 * @return the ccmchgusr attribute reference
	 */
	public ElementaryRangeReference getCcmchgusrReference() {
		return ccmchgusr.getReference();
	}

	/**
	 * Getter for ccmchgusr attribute.
	 * @return ccmchgusr attribute
	 */
	public String getCcmchgusr() {
		return ccmchgusr.getValue();
	}

	/**
	 * Setter for ccmchgusr attribute.
	 * @param ccmchgusr the new value of ccmchgusr
	 */
	public void setCcmchgusr(String ccmchgusr) {
		this.ccmchgusr.setValue(ccmchgusr);
	}
	/**
	 * Gets the reference for attribute ccmchgpgm.
	 * @return the ccmchgpgm attribute reference
	 */
	public ElementaryRangeReference getCcmchgpgmReference() {
		return ccmchgpgm.getReference();
	}

	/**
	 * Getter for ccmchgpgm attribute.
	 * @return ccmchgpgm attribute
	 */
	public String getCcmchgpgm() {
		return ccmchgpgm.getValue();
	}

	/**
	 * Setter for ccmchgpgm attribute.
	 * @param ccmchgpgm the new value of ccmchgpgm
	 */
	public void setCcmchgpgm(String ccmchgpgm) {
		this.ccmchgpgm.setValue(ccmchgpgm);
	}
}
