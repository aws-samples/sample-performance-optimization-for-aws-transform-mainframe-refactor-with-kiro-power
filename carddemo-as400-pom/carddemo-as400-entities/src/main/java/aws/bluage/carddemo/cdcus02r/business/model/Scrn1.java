package aws.bluage.carddemo.cdcus02r.business.model;

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
 * <p>About 'dcustid' field, <br>
 * </p>
 * 
 * <p>About 'dssn' field, <br>
 * </p>
 * 
 * <p>About 'dficoscore' field, <br>
 * </p>
 * 
 * <p>About 'ddob' field, <br>
 * </p>
 * 
 * <p>About 'dbirthyr' field, <br>
 * </p>
 * 
 * <p>About 'dbirthmo' field, <br>
 * </p>
 * 
 * <p>About 'dbirthday' field, <br>
 * </p>
 * 
 * <p>About 'dgender' field, <br>
 * </p>
 * 
 * <p>About 'dfirstname' field, <br>
 * </p>
 * 
 * <p>About 'dmiddlename' field, <br>
 * </p>
 * 
 * <p>About 'dlastname' field, <br>
 * </p>
 * 
 * <p>About 'daddress1' field, <br>
 * </p>
 * 
 * <p>About 'daddress2' field, <br>
 * </p>
 * 
 * <p>About 'dcity' field, <br>
 * </p>
 * 
 * <p>About 'dstate' field, <br>
 * </p>
 * 
 * <p>About 'dzip' field, <br>
 * </p>
 * 
 * <p>About 'dcountry' field, <br>
 * </p>
 * 
 * <p>About 'dphone1area' field, <br>
 * </p>
 * 
 * <p>About 'dphone1f3' field, <br>
 * </p>
 * 
 * <p>About 'dphone1l4' field, <br>
 * </p>
 * 
 * <p>About 'dphone2area' field, <br>
 * </p>
 * 
 * <p>About 'dphone2f3' field, <br>
 * </p>
 * 
 * <p>About 'dphone2l4' field, <br>
 * </p>
 * 
 * <p>About 'dcuscrtusr' field, <br>
 * </p>
 * 
 * <p>About 'dcuscrtdt' field, <br>
 * </p>
 * 
 * <p>About 'dcuscrttm' field, <br>
 * </p>
 * 
 * <p>About 'dcuscrtpgm' field, <br>
 * </p>
 * 
 * <p>About 'dcuschgusr' field, <br>
 * </p>
 * 
 * <p>About 'dcuschgdt' field, <br>
 * </p>
 * 
 * <p>About 'dcuschgtm' field, <br>
 * </p>
 * 
 * <p>About 'dcuschgpgm' field, <br>
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
	private final Elementary dcustid = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary dssn = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary dficoscore = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary ddob = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dbirthyr = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary dbirthmo = new Elementary(root,new AlphanumericType(2)," ");
	private final Elementary dbirthday = new Elementary(root,new AlphanumericType(2)," ");
	private final Elementary dgender = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary dfirstname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary dmiddlename = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary dlastname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary daddress1 = new Elementary(root,new AlphanumericType(40)," ");
	private final Elementary daddress2 = new Elementary(root,new AlphanumericType(40)," ");
	private final Elementary dcity = new Elementary(root,new AlphanumericType(20)," ");
	private final Elementary dstate = new Elementary(root,new AlphanumericType(2)," ");
	private final Elementary dzip = new Elementary(root,new AlphanumericType(5)," ");
	private final Elementary dcountry = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary dphone1area = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary dphone1f3 = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary dphone1l4 = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary dphone2area = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary dphone2f3 = new Elementary(root,new AlphanumericType(3)," ");
	private final Elementary dphone2l4 = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary dcuscrtusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcuscrtdt = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dcuscrttm = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dcuscrtpgm = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcuschgusr = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dcuschgdt = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dcuschgtm = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dcuschgpgm = new Elementary(root,new AlphanumericType(10)," ");
	
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
	 * Gets the reference for attribute dssn.
	 * @return the dssn attribute reference
	 */
	public ElementaryRangeReference getDssnReference() {
		return dssn.getReference();
	}

	/**
	 * Getter for dssn attribute.
	 * @return dssn attribute
	 */
	public String getDssn() {
		return dssn.getValue();
	}

	/**
	 * Setter for dssn attribute.
	 * @param dssn the new value of dssn
	 */
	public void setDssn(String dssn) {
		this.dssn.setValue(dssn);
	}
	/**
	 * Gets the reference for attribute dficoscore.
	 * @return the dficoscore attribute reference
	 */
	public ElementaryRangeReference getDficoscoreReference() {
		return dficoscore.getReference();
	}

	/**
	 * Getter for dficoscore attribute.
	 * @return dficoscore attribute
	 */
	public String getDficoscore() {
		return dficoscore.getValue();
	}

	/**
	 * Setter for dficoscore attribute.
	 * @param dficoscore the new value of dficoscore
	 */
	public void setDficoscore(String dficoscore) {
		this.dficoscore.setValue(dficoscore);
	}
	/**
	 * Gets the reference for attribute ddob.
	 * @return the ddob attribute reference
	 */
	public ElementaryRangeReference getDdobReference() {
		return ddob.getReference();
	}

	/**
	 * Getter for ddob attribute.
	 * @return ddob attribute
	 */
	public String getDdob() {
		return ddob.getValue();
	}

	/**
	 * Setter for ddob attribute.
	 * @param ddob the new value of ddob
	 */
	public void setDdob(String ddob) {
		this.ddob.setValue(ddob);
	}
	/**
	 * Gets the reference for attribute dbirthyr.
	 * @return the dbirthyr attribute reference
	 */
	public ElementaryRangeReference getDbirthyrReference() {
		return dbirthyr.getReference();
	}

	/**
	 * Getter for dbirthyr attribute.
	 * @return dbirthyr attribute
	 */
	public String getDbirthyr() {
		return dbirthyr.getValue();
	}

	/**
	 * Setter for dbirthyr attribute.
	 * @param dbirthyr the new value of dbirthyr
	 */
	public void setDbirthyr(String dbirthyr) {
		this.dbirthyr.setValue(dbirthyr);
	}
	/**
	 * Gets the reference for attribute dbirthmo.
	 * @return the dbirthmo attribute reference
	 */
	public ElementaryRangeReference getDbirthmoReference() {
		return dbirthmo.getReference();
	}

	/**
	 * Getter for dbirthmo attribute.
	 * @return dbirthmo attribute
	 */
	public String getDbirthmo() {
		return dbirthmo.getValue();
	}

	/**
	 * Setter for dbirthmo attribute.
	 * @param dbirthmo the new value of dbirthmo
	 */
	public void setDbirthmo(String dbirthmo) {
		this.dbirthmo.setValue(dbirthmo);
	}
	/**
	 * Gets the reference for attribute dbirthday.
	 * @return the dbirthday attribute reference
	 */
	public ElementaryRangeReference getDbirthdayReference() {
		return dbirthday.getReference();
	}

	/**
	 * Getter for dbirthday attribute.
	 * @return dbirthday attribute
	 */
	public String getDbirthday() {
		return dbirthday.getValue();
	}

	/**
	 * Setter for dbirthday attribute.
	 * @param dbirthday the new value of dbirthday
	 */
	public void setDbirthday(String dbirthday) {
		this.dbirthday.setValue(dbirthday);
	}
	/**
	 * Gets the reference for attribute dgender.
	 * @return the dgender attribute reference
	 */
	public ElementaryRangeReference getDgenderReference() {
		return dgender.getReference();
	}

	/**
	 * Getter for dgender attribute.
	 * @return dgender attribute
	 */
	public String getDgender() {
		return dgender.getValue();
	}

	/**
	 * Setter for dgender attribute.
	 * @param dgender the new value of dgender
	 */
	public void setDgender(String dgender) {
		this.dgender.setValue(dgender);
	}
	/**
	 * Gets the reference for attribute dfirstname.
	 * @return the dfirstname attribute reference
	 */
	public ElementaryRangeReference getDfirstnameReference() {
		return dfirstname.getReference();
	}

	/**
	 * Getter for dfirstname attribute.
	 * @return dfirstname attribute
	 */
	public String getDfirstname() {
		return dfirstname.getValue();
	}

	/**
	 * Setter for dfirstname attribute.
	 * @param dfirstname the new value of dfirstname
	 */
	public void setDfirstname(String dfirstname) {
		this.dfirstname.setValue(dfirstname);
	}
	/**
	 * Gets the reference for attribute dmiddlename.
	 * @return the dmiddlename attribute reference
	 */
	public ElementaryRangeReference getDmiddlenameReference() {
		return dmiddlename.getReference();
	}

	/**
	 * Getter for dmiddlename attribute.
	 * @return dmiddlename attribute
	 */
	public String getDmiddlename() {
		return dmiddlename.getValue();
	}

	/**
	 * Setter for dmiddlename attribute.
	 * @param dmiddlename the new value of dmiddlename
	 */
	public void setDmiddlename(String dmiddlename) {
		this.dmiddlename.setValue(dmiddlename);
	}
	/**
	 * Gets the reference for attribute dlastname.
	 * @return the dlastname attribute reference
	 */
	public ElementaryRangeReference getDlastnameReference() {
		return dlastname.getReference();
	}

	/**
	 * Getter for dlastname attribute.
	 * @return dlastname attribute
	 */
	public String getDlastname() {
		return dlastname.getValue();
	}

	/**
	 * Setter for dlastname attribute.
	 * @param dlastname the new value of dlastname
	 */
	public void setDlastname(String dlastname) {
		this.dlastname.setValue(dlastname);
	}
	/**
	 * Gets the reference for attribute daddress1.
	 * @return the daddress1 attribute reference
	 */
	public ElementaryRangeReference getDaddress1Reference() {
		return daddress1.getReference();
	}

	/**
	 * Getter for daddress1 attribute.
	 * @return daddress1 attribute
	 */
	public String getDaddress1() {
		return daddress1.getValue();
	}

	/**
	 * Setter for daddress1 attribute.
	 * @param daddress1 the new value of daddress1
	 */
	public void setDaddress1(String daddress1) {
		this.daddress1.setValue(daddress1);
	}
	/**
	 * Gets the reference for attribute daddress2.
	 * @return the daddress2 attribute reference
	 */
	public ElementaryRangeReference getDaddress2Reference() {
		return daddress2.getReference();
	}

	/**
	 * Getter for daddress2 attribute.
	 * @return daddress2 attribute
	 */
	public String getDaddress2() {
		return daddress2.getValue();
	}

	/**
	 * Setter for daddress2 attribute.
	 * @param daddress2 the new value of daddress2
	 */
	public void setDaddress2(String daddress2) {
		this.daddress2.setValue(daddress2);
	}
	/**
	 * Gets the reference for attribute dcity.
	 * @return the dcity attribute reference
	 */
	public ElementaryRangeReference getDcityReference() {
		return dcity.getReference();
	}

	/**
	 * Getter for dcity attribute.
	 * @return dcity attribute
	 */
	public String getDcity() {
		return dcity.getValue();
	}

	/**
	 * Setter for dcity attribute.
	 * @param dcity the new value of dcity
	 */
	public void setDcity(String dcity) {
		this.dcity.setValue(dcity);
	}
	/**
	 * Gets the reference for attribute dstate.
	 * @return the dstate attribute reference
	 */
	public ElementaryRangeReference getDstateReference() {
		return dstate.getReference();
	}

	/**
	 * Getter for dstate attribute.
	 * @return dstate attribute
	 */
	public String getDstate() {
		return dstate.getValue();
	}

	/**
	 * Setter for dstate attribute.
	 * @param dstate the new value of dstate
	 */
	public void setDstate(String dstate) {
		this.dstate.setValue(dstate);
	}
	/**
	 * Gets the reference for attribute dzip.
	 * @return the dzip attribute reference
	 */
	public ElementaryRangeReference getDzipReference() {
		return dzip.getReference();
	}

	/**
	 * Getter for dzip attribute.
	 * @return dzip attribute
	 */
	public String getDzip() {
		return dzip.getValue();
	}

	/**
	 * Setter for dzip attribute.
	 * @param dzip the new value of dzip
	 */
	public void setDzip(String dzip) {
		this.dzip.setValue(dzip);
	}
	/**
	 * Gets the reference for attribute dcountry.
	 * @return the dcountry attribute reference
	 */
	public ElementaryRangeReference getDcountryReference() {
		return dcountry.getReference();
	}

	/**
	 * Getter for dcountry attribute.
	 * @return dcountry attribute
	 */
	public String getDcountry() {
		return dcountry.getValue();
	}

	/**
	 * Setter for dcountry attribute.
	 * @param dcountry the new value of dcountry
	 */
	public void setDcountry(String dcountry) {
		this.dcountry.setValue(dcountry);
	}
	/**
	 * Gets the reference for attribute dphone1area.
	 * @return the dphone1area attribute reference
	 */
	public ElementaryRangeReference getDphone1areaReference() {
		return dphone1area.getReference();
	}

	/**
	 * Getter for dphone1area attribute.
	 * @return dphone1area attribute
	 */
	public String getDphone1area() {
		return dphone1area.getValue();
	}

	/**
	 * Setter for dphone1area attribute.
	 * @param dphone1area the new value of dphone1area
	 */
	public void setDphone1area(String dphone1area) {
		this.dphone1area.setValue(dphone1area);
	}
	/**
	 * Gets the reference for attribute dphone1f3.
	 * @return the dphone1f3 attribute reference
	 */
	public ElementaryRangeReference getDphone1f3Reference() {
		return dphone1f3.getReference();
	}

	/**
	 * Getter for dphone1f3 attribute.
	 * @return dphone1f3 attribute
	 */
	public String getDphone1f3() {
		return dphone1f3.getValue();
	}

	/**
	 * Setter for dphone1f3 attribute.
	 * @param dphone1f3 the new value of dphone1f3
	 */
	public void setDphone1f3(String dphone1f3) {
		this.dphone1f3.setValue(dphone1f3);
	}
	/**
	 * Gets the reference for attribute dphone1l4.
	 * @return the dphone1l4 attribute reference
	 */
	public ElementaryRangeReference getDphone1l4Reference() {
		return dphone1l4.getReference();
	}

	/**
	 * Getter for dphone1l4 attribute.
	 * @return dphone1l4 attribute
	 */
	public String getDphone1l4() {
		return dphone1l4.getValue();
	}

	/**
	 * Setter for dphone1l4 attribute.
	 * @param dphone1l4 the new value of dphone1l4
	 */
	public void setDphone1l4(String dphone1l4) {
		this.dphone1l4.setValue(dphone1l4);
	}
	/**
	 * Gets the reference for attribute dphone2area.
	 * @return the dphone2area attribute reference
	 */
	public ElementaryRangeReference getDphone2areaReference() {
		return dphone2area.getReference();
	}

	/**
	 * Getter for dphone2area attribute.
	 * @return dphone2area attribute
	 */
	public String getDphone2area() {
		return dphone2area.getValue();
	}

	/**
	 * Setter for dphone2area attribute.
	 * @param dphone2area the new value of dphone2area
	 */
	public void setDphone2area(String dphone2area) {
		this.dphone2area.setValue(dphone2area);
	}
	/**
	 * Gets the reference for attribute dphone2f3.
	 * @return the dphone2f3 attribute reference
	 */
	public ElementaryRangeReference getDphone2f3Reference() {
		return dphone2f3.getReference();
	}

	/**
	 * Getter for dphone2f3 attribute.
	 * @return dphone2f3 attribute
	 */
	public String getDphone2f3() {
		return dphone2f3.getValue();
	}

	/**
	 * Setter for dphone2f3 attribute.
	 * @param dphone2f3 the new value of dphone2f3
	 */
	public void setDphone2f3(String dphone2f3) {
		this.dphone2f3.setValue(dphone2f3);
	}
	/**
	 * Gets the reference for attribute dphone2l4.
	 * @return the dphone2l4 attribute reference
	 */
	public ElementaryRangeReference getDphone2l4Reference() {
		return dphone2l4.getReference();
	}

	/**
	 * Getter for dphone2l4 attribute.
	 * @return dphone2l4 attribute
	 */
	public String getDphone2l4() {
		return dphone2l4.getValue();
	}

	/**
	 * Setter for dphone2l4 attribute.
	 * @param dphone2l4 the new value of dphone2l4
	 */
	public void setDphone2l4(String dphone2l4) {
		this.dphone2l4.setValue(dphone2l4);
	}
	/**
	 * Gets the reference for attribute dcuscrtusr.
	 * @return the dcuscrtusr attribute reference
	 */
	public ElementaryRangeReference getDcuscrtusrReference() {
		return dcuscrtusr.getReference();
	}

	/**
	 * Getter for dcuscrtusr attribute.
	 * @return dcuscrtusr attribute
	 */
	public String getDcuscrtusr() {
		return dcuscrtusr.getValue();
	}

	/**
	 * Setter for dcuscrtusr attribute.
	 * @param dcuscrtusr the new value of dcuscrtusr
	 */
	public void setDcuscrtusr(String dcuscrtusr) {
		this.dcuscrtusr.setValue(dcuscrtusr);
	}
	/**
	 * Gets the reference for attribute dcuscrtdt.
	 * @return the dcuscrtdt attribute reference
	 */
	public ElementaryRangeReference getDcuscrtdtReference() {
		return dcuscrtdt.getReference();
	}

	/**
	 * Getter for dcuscrtdt attribute.
	 * @return dcuscrtdt attribute
	 */
	public int getDcuscrtdt() {
		return dcuscrtdt.getValue();
	}

	/**
	 * Setter for dcuscrtdt attribute.
	 * @param dcuscrtdt the new value of dcuscrtdt
	 */
	public void setDcuscrtdt(int dcuscrtdt) {
		this.dcuscrtdt.setValue(dcuscrtdt);
	}
	/**
	 * Gets the reference for attribute dcuscrttm.
	 * @return the dcuscrttm attribute reference
	 */
	public ElementaryRangeReference getDcuscrttmReference() {
		return dcuscrttm.getReference();
	}

	/**
	 * Getter for dcuscrttm attribute.
	 * @return dcuscrttm attribute
	 */
	public int getDcuscrttm() {
		return dcuscrttm.getValue();
	}

	/**
	 * Setter for dcuscrttm attribute.
	 * @param dcuscrttm the new value of dcuscrttm
	 */
	public void setDcuscrttm(int dcuscrttm) {
		this.dcuscrttm.setValue(dcuscrttm);
	}
	/**
	 * Gets the reference for attribute dcuscrtpgm.
	 * @return the dcuscrtpgm attribute reference
	 */
	public ElementaryRangeReference getDcuscrtpgmReference() {
		return dcuscrtpgm.getReference();
	}

	/**
	 * Getter for dcuscrtpgm attribute.
	 * @return dcuscrtpgm attribute
	 */
	public String getDcuscrtpgm() {
		return dcuscrtpgm.getValue();
	}

	/**
	 * Setter for dcuscrtpgm attribute.
	 * @param dcuscrtpgm the new value of dcuscrtpgm
	 */
	public void setDcuscrtpgm(String dcuscrtpgm) {
		this.dcuscrtpgm.setValue(dcuscrtpgm);
	}
	/**
	 * Gets the reference for attribute dcuschgusr.
	 * @return the dcuschgusr attribute reference
	 */
	public ElementaryRangeReference getDcuschgusrReference() {
		return dcuschgusr.getReference();
	}

	/**
	 * Getter for dcuschgusr attribute.
	 * @return dcuschgusr attribute
	 */
	public String getDcuschgusr() {
		return dcuschgusr.getValue();
	}

	/**
	 * Setter for dcuschgusr attribute.
	 * @param dcuschgusr the new value of dcuschgusr
	 */
	public void setDcuschgusr(String dcuschgusr) {
		this.dcuschgusr.setValue(dcuschgusr);
	}
	/**
	 * Gets the reference for attribute dcuschgdt.
	 * @return the dcuschgdt attribute reference
	 */
	public ElementaryRangeReference getDcuschgdtReference() {
		return dcuschgdt.getReference();
	}

	/**
	 * Getter for dcuschgdt attribute.
	 * @return dcuschgdt attribute
	 */
	public int getDcuschgdt() {
		return dcuschgdt.getValue();
	}

	/**
	 * Setter for dcuschgdt attribute.
	 * @param dcuschgdt the new value of dcuschgdt
	 */
	public void setDcuschgdt(int dcuschgdt) {
		this.dcuschgdt.setValue(dcuschgdt);
	}
	/**
	 * Gets the reference for attribute dcuschgtm.
	 * @return the dcuschgtm attribute reference
	 */
	public ElementaryRangeReference getDcuschgtmReference() {
		return dcuschgtm.getReference();
	}

	/**
	 * Getter for dcuschgtm attribute.
	 * @return dcuschgtm attribute
	 */
	public int getDcuschgtm() {
		return dcuschgtm.getValue();
	}

	/**
	 * Setter for dcuschgtm attribute.
	 * @param dcuschgtm the new value of dcuschgtm
	 */
	public void setDcuschgtm(int dcuschgtm) {
		this.dcuschgtm.setValue(dcuschgtm);
	}
	/**
	 * Gets the reference for attribute dcuschgpgm.
	 * @return the dcuschgpgm attribute reference
	 */
	public ElementaryRangeReference getDcuschgpgmReference() {
		return dcuschgpgm.getReference();
	}

	/**
	 * Getter for dcuschgpgm attribute.
	 * @return dcuschgpgm attribute
	 */
	public String getDcuschgpgm() {
		return dcuschgpgm.getValue();
	}

	/**
	 * Setter for dcuschgpgm attribute.
	 * @param dcuschgpgm the new value of dcuschgpgm
	 */
	public void setDcuschgpgm(String dcuschgpgm) {
		this.dcuschgpgm.setValue(dcuschgpgm);
	}
}
