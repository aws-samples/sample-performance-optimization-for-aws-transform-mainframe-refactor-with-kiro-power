package aws.bluage.carddemo.cdcus03r.business.model;

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
 * Data simplifier entity Cdcuspr.
 * 
 * <p>About 'r1shcustid' field, <br>
 * </p>
 * 
 * <p>About 'r1shssn' field, <br>
 * </p>
 * 
 * <p>About 'r1shbirthday' field, <br>
 * </p>
 * 
 * <p>About 'r1shbirthmo' field, <br>
 * </p>
 * 
 * <p>About 'r1shbirthyr' field, <br>
 * </p>
 * 
 * <p>About 'r1shgender' field, <br>
 * </p>
 * 
 * <p>About 'r1shficoscore' field, <br>
 * </p>
 * 
 * <p>About 'r1shfirstname' field, <br>
 * </p>
 * 
 * <p>About 'r1shmidname' field, <br>
 * </p>
 * 
 * <p>About 'r1shlastname' field, <br>
 * </p>
 * 
 * <p>About 'r1shaddress1' field, <br>
 * </p>
 * 
 * <p>About 'r1shaddress2' field, <br>
 * </p>
 * 
 * <p>About 'r1shcity' field, <br>
 * </p>
 * 
 * <p>About 'r1shstate' field, <br>
 * </p>
 * 
 * <p>About 'r1shzip' field, <br>
 * </p>
 * 
 * <p>About 'r1shcountry' field, <br>
 * </p>
 * 
 * <p>About 'r1shphone1' field, <br>
 * </p>
 * 
 * <p>About 'r1shphone2' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuscrtdt' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuscrttm' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuscrtusr' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuscrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuschgdt' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuschgtm' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuschgusr' field, <br>
 * </p>
 * 
 * <p>About 'r1shcuschgpgm' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cdcuspr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary r1shcustid = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary r1shssn = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary r1shbirthday = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("0"));
	private final Elementary r1shbirthmo = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("0"));
	private final Elementary r1shbirthyr = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("0"));
	private final Elementary r1shgender = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary r1shficoscore = new Elementary(root,new PackedType(3, 0, true),Short.valueOf("0"));
	private final Elementary r1shfirstname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary r1shmidname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary r1shlastname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary r1shaddress1 = new Elementary(root,new AlphanumericType(40)," ");
	private final Elementary r1shaddress2 = new Elementary(root,new AlphanumericType(40)," ");
	private final Elementary r1shcity = new Elementary(root,new AlphanumericType(20)," ");
	private final Elementary r1shstate = new Elementary(root,new AlphanumericType(2)," ");
	private final Elementary r1shzip = new Elementary(root,new PackedType(5, 0, true),Integer.valueOf("0"));
	private final Elementary r1shcountry = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary r1shphone1 = new Elementary(root,new PackedType(10, 0, true),new BigDecimal("0"));
	private final Elementary r1shphone2 = new Elementary(root,new PackedType(10, 0, true),new BigDecimal("0"));
	private final Elementary r1shcuscrtdt = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary r1shcuscrttm = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary r1shcuscrtusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary r1shcuscrtpgm = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary r1shcuschgdt = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary r1shcuschgtm = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary r1shcuschgusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary r1shcuschgpgm = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Cdcuspr with a default record.
	 * @param configuration the configuration
	 */
	public Cdcuspr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cdcuspr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cdcuspr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute r1shcustid.
	 * @return the r1shcustid attribute reference
	 */
	public ElementaryRangeReference getR1shcustidReference() {
		return r1shcustid.getReference();
	}

	/**
	 * Getter for r1shcustid attribute.
	 * @return r1shcustid attribute
	 */
	public int getR1shcustid() {
		return r1shcustid.getValue();
	}

	/**
	 * Setter for r1shcustid attribute.
	 * @param r1shcustid the new value of r1shcustid
	 */
	public void setR1shcustid(int r1shcustid) {
		this.r1shcustid.setValue(r1shcustid);
	}
	/**
	 * Gets the reference for attribute r1shssn.
	 * @return the r1shssn attribute reference
	 */
	public ElementaryRangeReference getR1shssnReference() {
		return r1shssn.getReference();
	}

	/**
	 * Getter for r1shssn attribute.
	 * @return r1shssn attribute
	 */
	public int getR1shssn() {
		return r1shssn.getValue();
	}

	/**
	 * Setter for r1shssn attribute.
	 * @param r1shssn the new value of r1shssn
	 */
	public void setR1shssn(int r1shssn) {
		this.r1shssn.setValue(r1shssn);
	}
	/**
	 * Gets the reference for attribute r1shbirthday.
	 * @return the r1shbirthday attribute reference
	 */
	public ElementaryRangeReference getR1shbirthdayReference() {
		return r1shbirthday.getReference();
	}

	/**
	 * Getter for r1shbirthday attribute.
	 * @return r1shbirthday attribute
	 */
	public int getR1shbirthday() {
		return r1shbirthday.getValue();
	}

	/**
	 * Setter for r1shbirthday attribute.
	 * @param r1shbirthday the new value of r1shbirthday
	 */
	public void setR1shbirthday(int r1shbirthday) {
		this.r1shbirthday.setValue(r1shbirthday);
	}
	/**
	 * Gets the reference for attribute r1shbirthmo.
	 * @return the r1shbirthmo attribute reference
	 */
	public ElementaryRangeReference getR1shbirthmoReference() {
		return r1shbirthmo.getReference();
	}

	/**
	 * Getter for r1shbirthmo attribute.
	 * @return r1shbirthmo attribute
	 */
	public int getR1shbirthmo() {
		return r1shbirthmo.getValue();
	}

	/**
	 * Setter for r1shbirthmo attribute.
	 * @param r1shbirthmo the new value of r1shbirthmo
	 */
	public void setR1shbirthmo(int r1shbirthmo) {
		this.r1shbirthmo.setValue(r1shbirthmo);
	}
	/**
	 * Gets the reference for attribute r1shbirthyr.
	 * @return the r1shbirthyr attribute reference
	 */
	public ElementaryRangeReference getR1shbirthyrReference() {
		return r1shbirthyr.getReference();
	}

	/**
	 * Getter for r1shbirthyr attribute.
	 * @return r1shbirthyr attribute
	 */
	public int getR1shbirthyr() {
		return r1shbirthyr.getValue();
	}

	/**
	 * Setter for r1shbirthyr attribute.
	 * @param r1shbirthyr the new value of r1shbirthyr
	 */
	public void setR1shbirthyr(int r1shbirthyr) {
		this.r1shbirthyr.setValue(r1shbirthyr);
	}
	/**
	 * Gets the reference for attribute r1shgender.
	 * @return the r1shgender attribute reference
	 */
	public ElementaryRangeReference getR1shgenderReference() {
		return r1shgender.getReference();
	}

	/**
	 * Getter for r1shgender attribute.
	 * @return r1shgender attribute
	 */
	public String getR1shgender() {
		return r1shgender.getValue();
	}

	/**
	 * Setter for r1shgender attribute.
	 * @param r1shgender the new value of r1shgender
	 */
	public void setR1shgender(String r1shgender) {
		this.r1shgender.setValue(r1shgender);
	}
	/**
	 * Gets the reference for attribute r1shficoscore.
	 * @return the r1shficoscore attribute reference
	 */
	public ElementaryRangeReference getR1shficoscoreReference() {
		return r1shficoscore.getReference();
	}

	/**
	 * Getter for r1shficoscore attribute.
	 * @return r1shficoscore attribute
	 */
	public int getR1shficoscore() {
		return r1shficoscore.getValue();
	}

	/**
	 * Setter for r1shficoscore attribute.
	 * @param r1shficoscore the new value of r1shficoscore
	 */
	public void setR1shficoscore(int r1shficoscore) {
		this.r1shficoscore.setValue(r1shficoscore);
	}
	/**
	 * Gets the reference for attribute r1shfirstname.
	 * @return the r1shfirstname attribute reference
	 */
	public ElementaryRangeReference getR1shfirstnameReference() {
		return r1shfirstname.getReference();
	}

	/**
	 * Getter for r1shfirstname attribute.
	 * @return r1shfirstname attribute
	 */
	public String getR1shfirstname() {
		return r1shfirstname.getValue();
	}

	/**
	 * Setter for r1shfirstname attribute.
	 * @param r1shfirstname the new value of r1shfirstname
	 */
	public void setR1shfirstname(String r1shfirstname) {
		this.r1shfirstname.setValue(r1shfirstname);
	}
	/**
	 * Gets the reference for attribute r1shmidname.
	 * @return the r1shmidname attribute reference
	 */
	public ElementaryRangeReference getR1shmidnameReference() {
		return r1shmidname.getReference();
	}

	/**
	 * Getter for r1shmidname attribute.
	 * @return r1shmidname attribute
	 */
	public String getR1shmidname() {
		return r1shmidname.getValue();
	}

	/**
	 * Setter for r1shmidname attribute.
	 * @param r1shmidname the new value of r1shmidname
	 */
	public void setR1shmidname(String r1shmidname) {
		this.r1shmidname.setValue(r1shmidname);
	}
	/**
	 * Gets the reference for attribute r1shlastname.
	 * @return the r1shlastname attribute reference
	 */
	public ElementaryRangeReference getR1shlastnameReference() {
		return r1shlastname.getReference();
	}

	/**
	 * Getter for r1shlastname attribute.
	 * @return r1shlastname attribute
	 */
	public String getR1shlastname() {
		return r1shlastname.getValue();
	}

	/**
	 * Setter for r1shlastname attribute.
	 * @param r1shlastname the new value of r1shlastname
	 */
	public void setR1shlastname(String r1shlastname) {
		this.r1shlastname.setValue(r1shlastname);
	}
	/**
	 * Gets the reference for attribute r1shaddress1.
	 * @return the r1shaddress1 attribute reference
	 */
	public ElementaryRangeReference getR1shaddress1Reference() {
		return r1shaddress1.getReference();
	}

	/**
	 * Getter for r1shaddress1 attribute.
	 * @return r1shaddress1 attribute
	 */
	public String getR1shaddress1() {
		return r1shaddress1.getValue();
	}

	/**
	 * Setter for r1shaddress1 attribute.
	 * @param r1shaddress1 the new value of r1shaddress1
	 */
	public void setR1shaddress1(String r1shaddress1) {
		this.r1shaddress1.setValue(r1shaddress1);
	}
	/**
	 * Gets the reference for attribute r1shaddress2.
	 * @return the r1shaddress2 attribute reference
	 */
	public ElementaryRangeReference getR1shaddress2Reference() {
		return r1shaddress2.getReference();
	}

	/**
	 * Getter for r1shaddress2 attribute.
	 * @return r1shaddress2 attribute
	 */
	public String getR1shaddress2() {
		return r1shaddress2.getValue();
	}

	/**
	 * Setter for r1shaddress2 attribute.
	 * @param r1shaddress2 the new value of r1shaddress2
	 */
	public void setR1shaddress2(String r1shaddress2) {
		this.r1shaddress2.setValue(r1shaddress2);
	}
	/**
	 * Gets the reference for attribute r1shcity.
	 * @return the r1shcity attribute reference
	 */
	public ElementaryRangeReference getR1shcityReference() {
		return r1shcity.getReference();
	}

	/**
	 * Getter for r1shcity attribute.
	 * @return r1shcity attribute
	 */
	public String getR1shcity() {
		return r1shcity.getValue();
	}

	/**
	 * Setter for r1shcity attribute.
	 * @param r1shcity the new value of r1shcity
	 */
	public void setR1shcity(String r1shcity) {
		this.r1shcity.setValue(r1shcity);
	}
	/**
	 * Gets the reference for attribute r1shstate.
	 * @return the r1shstate attribute reference
	 */
	public ElementaryRangeReference getR1shstateReference() {
		return r1shstate.getReference();
	}

	/**
	 * Getter for r1shstate attribute.
	 * @return r1shstate attribute
	 */
	public String getR1shstate() {
		return r1shstate.getValue();
	}

	/**
	 * Setter for r1shstate attribute.
	 * @param r1shstate the new value of r1shstate
	 */
	public void setR1shstate(String r1shstate) {
		this.r1shstate.setValue(r1shstate);
	}
	/**
	 * Gets the reference for attribute r1shzip.
	 * @return the r1shzip attribute reference
	 */
	public ElementaryRangeReference getR1shzipReference() {
		return r1shzip.getReference();
	}

	/**
	 * Getter for r1shzip attribute.
	 * @return r1shzip attribute
	 */
	public int getR1shzip() {
		return r1shzip.getValue();
	}

	/**
	 * Setter for r1shzip attribute.
	 * @param r1shzip the new value of r1shzip
	 */
	public void setR1shzip(int r1shzip) {
		this.r1shzip.setValue(r1shzip);
	}
	/**
	 * Gets the reference for attribute r1shcountry.
	 * @return the r1shcountry attribute reference
	 */
	public ElementaryRangeReference getR1shcountryReference() {
		return r1shcountry.getReference();
	}

	/**
	 * Getter for r1shcountry attribute.
	 * @return r1shcountry attribute
	 */
	public String getR1shcountry() {
		return r1shcountry.getValue();
	}

	/**
	 * Setter for r1shcountry attribute.
	 * @param r1shcountry the new value of r1shcountry
	 */
	public void setR1shcountry(String r1shcountry) {
		this.r1shcountry.setValue(r1shcountry);
	}
	/**
	 * Gets the reference for attribute r1shphone1.
	 * @return the r1shphone1 attribute reference
	 */
	public ElementaryRangeReference getR1shphone1Reference() {
		return r1shphone1.getReference();
	}

	/**
	 * Getter for r1shphone1 attribute.
	 * @return r1shphone1 attribute
	 */
	public long getR1shphone1() {
		return r1shphone1.getValue();
	}

	/**
	 * Setter for r1shphone1 attribute.
	 * @param r1shphone1 the new value of r1shphone1
	 */
	public void setR1shphone1(long r1shphone1) {
		this.r1shphone1.setValue(r1shphone1);
	}
	/**
	 * Gets the reference for attribute r1shphone2.
	 * @return the r1shphone2 attribute reference
	 */
	public ElementaryRangeReference getR1shphone2Reference() {
		return r1shphone2.getReference();
	}

	/**
	 * Getter for r1shphone2 attribute.
	 * @return r1shphone2 attribute
	 */
	public long getR1shphone2() {
		return r1shphone2.getValue();
	}

	/**
	 * Setter for r1shphone2 attribute.
	 * @param r1shphone2 the new value of r1shphone2
	 */
	public void setR1shphone2(long r1shphone2) {
		this.r1shphone2.setValue(r1shphone2);
	}
	/**
	 * Gets the reference for attribute r1shcuscrtdt.
	 * @return the r1shcuscrtdt attribute reference
	 */
	public ElementaryRangeReference getR1shcuscrtdtReference() {
		return r1shcuscrtdt.getReference();
	}

	/**
	 * Getter for r1shcuscrtdt attribute.
	 * @return r1shcuscrtdt attribute
	 */
	public int getR1shcuscrtdt() {
		return r1shcuscrtdt.getValue();
	}

	/**
	 * Setter for r1shcuscrtdt attribute.
	 * @param r1shcuscrtdt the new value of r1shcuscrtdt
	 */
	public void setR1shcuscrtdt(int r1shcuscrtdt) {
		this.r1shcuscrtdt.setValue(r1shcuscrtdt);
	}
	/**
	 * Gets the reference for attribute r1shcuscrttm.
	 * @return the r1shcuscrttm attribute reference
	 */
	public ElementaryRangeReference getR1shcuscrttmReference() {
		return r1shcuscrttm.getReference();
	}

	/**
	 * Getter for r1shcuscrttm attribute.
	 * @return r1shcuscrttm attribute
	 */
	public int getR1shcuscrttm() {
		return r1shcuscrttm.getValue();
	}

	/**
	 * Setter for r1shcuscrttm attribute.
	 * @param r1shcuscrttm the new value of r1shcuscrttm
	 */
	public void setR1shcuscrttm(int r1shcuscrttm) {
		this.r1shcuscrttm.setValue(r1shcuscrttm);
	}
	/**
	 * Gets the reference for attribute r1shcuscrtusr.
	 * @return the r1shcuscrtusr attribute reference
	 */
	public ElementaryRangeReference getR1shcuscrtusrReference() {
		return r1shcuscrtusr.getReference();
	}

	/**
	 * Getter for r1shcuscrtusr attribute.
	 * @return r1shcuscrtusr attribute
	 */
	public String getR1shcuscrtusr() {
		return r1shcuscrtusr.getValue();
	}

	/**
	 * Setter for r1shcuscrtusr attribute.
	 * @param r1shcuscrtusr the new value of r1shcuscrtusr
	 */
	public void setR1shcuscrtusr(String r1shcuscrtusr) {
		this.r1shcuscrtusr.setValue(r1shcuscrtusr);
	}
	/**
	 * Gets the reference for attribute r1shcuscrtpgm.
	 * @return the r1shcuscrtpgm attribute reference
	 */
	public ElementaryRangeReference getR1shcuscrtpgmReference() {
		return r1shcuscrtpgm.getReference();
	}

	/**
	 * Getter for r1shcuscrtpgm attribute.
	 * @return r1shcuscrtpgm attribute
	 */
	public String getR1shcuscrtpgm() {
		return r1shcuscrtpgm.getValue();
	}

	/**
	 * Setter for r1shcuscrtpgm attribute.
	 * @param r1shcuscrtpgm the new value of r1shcuscrtpgm
	 */
	public void setR1shcuscrtpgm(String r1shcuscrtpgm) {
		this.r1shcuscrtpgm.setValue(r1shcuscrtpgm);
	}
	/**
	 * Gets the reference for attribute r1shcuschgdt.
	 * @return the r1shcuschgdt attribute reference
	 */
	public ElementaryRangeReference getR1shcuschgdtReference() {
		return r1shcuschgdt.getReference();
	}

	/**
	 * Getter for r1shcuschgdt attribute.
	 * @return r1shcuschgdt attribute
	 */
	public int getR1shcuschgdt() {
		return r1shcuschgdt.getValue();
	}

	/**
	 * Setter for r1shcuschgdt attribute.
	 * @param r1shcuschgdt the new value of r1shcuschgdt
	 */
	public void setR1shcuschgdt(int r1shcuschgdt) {
		this.r1shcuschgdt.setValue(r1shcuschgdt);
	}
	/**
	 * Gets the reference for attribute r1shcuschgtm.
	 * @return the r1shcuschgtm attribute reference
	 */
	public ElementaryRangeReference getR1shcuschgtmReference() {
		return r1shcuschgtm.getReference();
	}

	/**
	 * Getter for r1shcuschgtm attribute.
	 * @return r1shcuschgtm attribute
	 */
	public int getR1shcuschgtm() {
		return r1shcuschgtm.getValue();
	}

	/**
	 * Setter for r1shcuschgtm attribute.
	 * @param r1shcuschgtm the new value of r1shcuschgtm
	 */
	public void setR1shcuschgtm(int r1shcuschgtm) {
		this.r1shcuschgtm.setValue(r1shcuschgtm);
	}
	/**
	 * Gets the reference for attribute r1shcuschgusr.
	 * @return the r1shcuschgusr attribute reference
	 */
	public ElementaryRangeReference getR1shcuschgusrReference() {
		return r1shcuschgusr.getReference();
	}

	/**
	 * Getter for r1shcuschgusr attribute.
	 * @return r1shcuschgusr attribute
	 */
	public String getR1shcuschgusr() {
		return r1shcuschgusr.getValue();
	}

	/**
	 * Setter for r1shcuschgusr attribute.
	 * @param r1shcuschgusr the new value of r1shcuschgusr
	 */
	public void setR1shcuschgusr(String r1shcuschgusr) {
		this.r1shcuschgusr.setValue(r1shcuschgusr);
	}
	/**
	 * Gets the reference for attribute r1shcuschgpgm.
	 * @return the r1shcuschgpgm attribute reference
	 */
	public ElementaryRangeReference getR1shcuschgpgmReference() {
		return r1shcuschgpgm.getReference();
	}

	/**
	 * Getter for r1shcuschgpgm attribute.
	 * @return r1shcuschgpgm attribute
	 */
	public String getR1shcuschgpgm() {
		return r1shcuschgpgm.getValue();
	}

	/**
	 * Setter for r1shcuschgpgm attribute.
	 * @param r1shcuschgpgm the new value of r1shcuschgpgm
	 */
	public void setR1shcuschgpgm(String r1shcuschgpgm) {
		this.r1shcuschgpgm.setValue(r1shcuschgpgm);
	}
}
