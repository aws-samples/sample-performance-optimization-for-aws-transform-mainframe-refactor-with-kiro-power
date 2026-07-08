package aws.bluage.carddemo.cdtrn02r.business.model;

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
 * <p>About 'scsrrec' field, <br>
 * </p>
 * 
 * <p>About 'scsrfld' field, <br>
 * </p>
 * 
 * <p>About 'scsrpos' field, <br>
 * </p>
 * 
 * <p>About 'spgmname' field, <br>
 * </p>
 * 
 * <p>About 'sftrtext' field, <br>
 * </p>
 * 
 * <p>About 'strnid' field, <br>
 * </p>
 * 
 * <p>About 'sstatus' field, <br>
 * </p>
 * 
 * <p>About 'sstatusdtl' field, <br>
 * </p>
 * 
 * <p>About 'scardnum' field, <br>
 * </p>
 * 
 * <p>About 'stypecd' field, <br>
 * </p>
 * 
 * <p>About 'scategcd' field, <br>
 * </p>
 * 
 * <p>About 'ssource' field, <br>
 * </p>
 * 
 * <p>About 'sdess' field, <br>
 * </p>
 * 
 * <p>About 'samountedt' field, <br>
 * </p>
 * 
 * <p>About 'samountdsp' field, <br>
 * </p>
 * 
 * <p>About 'smerchid' field, <br>
 * </p>
 * 
 * <p>About 'smerchname' field, <br>
 * </p>
 * 
 * <p>About 'sorigdate' field, <br>
 * </p>
 * 
 * <p>About 'sprocdate' field, <br>
 * </p>
 * 
 * <p>About 'susra1' field, <br>
 * </p>
 * 
 * <p>About 'sdtea1' field, <br>
 * </p>
 * 
 * <p>About 'stmea1' field, <br>
 * </p>
 * 
 * <p>About 'spgma1' field, <br>
 * </p>
 * 
 * <p>About 'susra2' field, <br>
 * </p>
 * 
 * <p>About 'sdtea2' field, <br>
 * </p>
 * 
 * <p>About 'stmea2' field, <br>
 * </p>
 * 
 * <p>About 'spgma2' field, <br>
 * </p>
 * 
 * <p>About 'susrb1' field, <br>
 * </p>
 * 
 * <p>About 'sdteb1' field, <br>
 * </p>
 * 
 * <p>About 'stmeb1' field, <br>
 * </p>
 * 
 * <p>About 'spgmb1' field, <br>
 * </p>
 * 
 * <p>About 'susrb2' field, <br>
 * </p>
 * 
 * <p>About 'sdteb2' field, <br>
 * </p>
 * 
 * <p>About 'stmeb2' field, <br>
 * </p>
 * 
 * <p>About 'spgmb2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Scrn1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary scsrrec = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary scsrfld = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary scsrpos = new Elementary(root,new ZonedType(4, 0, true),Short.valueOf("0"));
	private final Elementary spgmname = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary sftrtext = new Elementary(root,new AlphanumericType(35)," ");
	private final Elementary strnid = new Elementary(root,new ZonedType(15, 0, true));
	private final Elementary sstatus = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary sstatusdtl = new Elementary(root,new AlphanumericType(20)," ");
	private final Elementary scardnum = new Elementary(root,new ZonedType(16, 0, true));
	private final Elementary stypecd = new Elementary(root,new AlphanumericType(2));
	private final Elementary scategcd = new Elementary(root,new AlphanumericType(4));
	private final Elementary ssource = new Elementary(root,new AlphanumericType(1));
	private final Elementary sdess = new Elementary(root,new AlphanumericType(30));
	private final Elementary samountedt = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary samountdsp = new Elementary(root,new AlphanumericType(13)," ");
	private final Elementary smerchid = new Elementary(root,new ZonedType(9, 0, true));
	private final Elementary smerchname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary sorigdate = new Elementary(root,new AlphanumericType(10));
	private final Elementary sprocdate = new Elementary(root,new AlphanumericType(10));
	private final Elementary susra1 = new Elementary(root,new AlphanumericType(10));
	private final Elementary sdtea1 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary stmea1 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary spgma1 = new Elementary(root,new AlphanumericType(10));
	private final Elementary susra2 = new Elementary(root,new AlphanumericType(10));
	private final Elementary sdtea2 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary stmea2 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary spgma2 = new Elementary(root,new AlphanumericType(10));
	private final Elementary susrb1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary sdteb1 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary stmeb1 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary spgmb1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary susrb2 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary sdteb2 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary stmeb2 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary spgmb2 = new Elementary(root,new AlphanumericType(10)," ");
	
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
	 * Gets the reference for attribute scsrrec.
	 * @return the scsrrec attribute reference
	 */
	public ElementaryRangeReference getScsrrecReference() {
		return scsrrec.getReference();
	}

	/**
	 * Getter for scsrrec attribute.
	 * @return scsrrec attribute
	 */
	public String getScsrrec() {
		return scsrrec.getValue();
	}

	/**
	 * Setter for scsrrec attribute.
	 * @param scsrrec the new value of scsrrec
	 */
	public void setScsrrec(String scsrrec) {
		this.scsrrec.setValue(scsrrec);
	}
	/**
	 * Gets the reference for attribute scsrfld.
	 * @return the scsrfld attribute reference
	 */
	public ElementaryRangeReference getScsrfldReference() {
		return scsrfld.getReference();
	}

	/**
	 * Getter for scsrfld attribute.
	 * @return scsrfld attribute
	 */
	public String getScsrfld() {
		return scsrfld.getValue();
	}

	/**
	 * Setter for scsrfld attribute.
	 * @param scsrfld the new value of scsrfld
	 */
	public void setScsrfld(String scsrfld) {
		this.scsrfld.setValue(scsrfld);
	}
	/**
	 * Gets the reference for attribute scsrpos.
	 * @return the scsrpos attribute reference
	 */
	public ElementaryRangeReference getScsrposReference() {
		return scsrpos.getReference();
	}

	/**
	 * Getter for scsrpos attribute.
	 * @return scsrpos attribute
	 */
	public int getScsrpos() {
		return scsrpos.getValue();
	}

	/**
	 * Setter for scsrpos attribute.
	 * @param scsrpos the new value of scsrpos
	 */
	public void setScsrpos(int scsrpos) {
		this.scsrpos.setValue(scsrpos);
	}
	/**
	 * Gets the reference for attribute spgmname.
	 * @return the spgmname attribute reference
	 */
	public ElementaryRangeReference getSpgmnameReference() {
		return spgmname.getReference();
	}

	/**
	 * Getter for spgmname attribute.
	 * @return spgmname attribute
	 */
	public String getSpgmname() {
		return spgmname.getValue();
	}

	/**
	 * Setter for spgmname attribute.
	 * @param spgmname the new value of spgmname
	 */
	public void setSpgmname(String spgmname) {
		this.spgmname.setValue(spgmname);
	}
	/**
	 * Gets the reference for attribute sftrtext.
	 * @return the sftrtext attribute reference
	 */
	public ElementaryRangeReference getSftrtextReference() {
		return sftrtext.getReference();
	}

	/**
	 * Getter for sftrtext attribute.
	 * @return sftrtext attribute
	 */
	public String getSftrtext() {
		return sftrtext.getValue();
	}

	/**
	 * Setter for sftrtext attribute.
	 * @param sftrtext the new value of sftrtext
	 */
	public void setSftrtext(String sftrtext) {
		this.sftrtext.setValue(sftrtext);
	}
	/**
	 * Gets the reference for attribute strnid.
	 * @return the strnid attribute reference
	 */
	public ElementaryRangeReference getStrnidReference() {
		return strnid.getReference();
	}

	/**
	 * Getter for strnid attribute.
	 * @return strnid attribute
	 */
	public long getStrnid() {
		return strnid.getValue();
	}

	/**
	 * Setter for strnid attribute.
	 * @param strnid the new value of strnid
	 */
	public void setStrnid(long strnid) {
		this.strnid.setValue(strnid);
	}
	/**
	 * Gets the reference for attribute sstatus.
	 * @return the sstatus attribute reference
	 */
	public ElementaryRangeReference getSstatusReference() {
		return sstatus.getReference();
	}

	/**
	 * Getter for sstatus attribute.
	 * @return sstatus attribute
	 */
	public String getSstatus() {
		return sstatus.getValue();
	}

	/**
	 * Setter for sstatus attribute.
	 * @param sstatus the new value of sstatus
	 */
	public void setSstatus(String sstatus) {
		this.sstatus.setValue(sstatus);
	}
	/**
	 * Gets the reference for attribute sstatusdtl.
	 * @return the sstatusdtl attribute reference
	 */
	public ElementaryRangeReference getSstatusdtlReference() {
		return sstatusdtl.getReference();
	}

	/**
	 * Getter for sstatusdtl attribute.
	 * @return sstatusdtl attribute
	 */
	public String getSstatusdtl() {
		return sstatusdtl.getValue();
	}

	/**
	 * Setter for sstatusdtl attribute.
	 * @param sstatusdtl the new value of sstatusdtl
	 */
	public void setSstatusdtl(String sstatusdtl) {
		this.sstatusdtl.setValue(sstatusdtl);
	}
	/**
	 * Gets the reference for attribute scardnum.
	 * @return the scardnum attribute reference
	 */
	public ElementaryRangeReference getScardnumReference() {
		return scardnum.getReference();
	}

	/**
	 * Getter for scardnum attribute.
	 * @return scardnum attribute
	 */
	public long getScardnum() {
		return scardnum.getValue();
	}

	/**
	 * Setter for scardnum attribute.
	 * @param scardnum the new value of scardnum
	 */
	public void setScardnum(long scardnum) {
		this.scardnum.setValue(scardnum);
	}
	/**
	 * Gets the reference for attribute stypecd.
	 * @return the stypecd attribute reference
	 */
	public ElementaryRangeReference getStypecdReference() {
		return stypecd.getReference();
	}

	/**
	 * Getter for stypecd attribute.
	 * @return stypecd attribute
	 */
	public String getStypecd() {
		return stypecd.getValue();
	}

	/**
	 * Setter for stypecd attribute.
	 * @param stypecd the new value of stypecd
	 */
	public void setStypecd(String stypecd) {
		this.stypecd.setValue(stypecd);
	}
	/**
	 * Gets the reference for attribute scategcd.
	 * @return the scategcd attribute reference
	 */
	public ElementaryRangeReference getScategcdReference() {
		return scategcd.getReference();
	}

	/**
	 * Getter for scategcd attribute.
	 * @return scategcd attribute
	 */
	public String getScategcd() {
		return scategcd.getValue();
	}

	/**
	 * Setter for scategcd attribute.
	 * @param scategcd the new value of scategcd
	 */
	public void setScategcd(String scategcd) {
		this.scategcd.setValue(scategcd);
	}
	/**
	 * Gets the reference for attribute ssource.
	 * @return the ssource attribute reference
	 */
	public ElementaryRangeReference getSsourceReference() {
		return ssource.getReference();
	}

	/**
	 * Getter for ssource attribute.
	 * @return ssource attribute
	 */
	public String getSsource() {
		return ssource.getValue();
	}

	/**
	 * Setter for ssource attribute.
	 * @param ssource the new value of ssource
	 */
	public void setSsource(String ssource) {
		this.ssource.setValue(ssource);
	}
	/**
	 * Gets the reference for attribute sdess.
	 * @return the sdess attribute reference
	 */
	public ElementaryRangeReference getSdessReference() {
		return sdess.getReference();
	}

	/**
	 * Getter for sdess attribute.
	 * @return sdess attribute
	 */
	public String getSdess() {
		return sdess.getValue();
	}

	/**
	 * Setter for sdess attribute.
	 * @param sdess the new value of sdess
	 */
	public void setSdess(String sdess) {
		this.sdess.setValue(sdess);
	}
	/**
	 * Gets the reference for attribute samountedt.
	 * @return the samountedt attribute reference
	 */
	public ElementaryRangeReference getSamountedtReference() {
		return samountedt.getReference();
	}

	/**
	 * Getter for samountedt attribute.
	 * @return samountedt attribute
	 */
	public String getSamountedt() {
		return samountedt.getValue();
	}

	/**
	 * Setter for samountedt attribute.
	 * @param samountedt the new value of samountedt
	 */
	public void setSamountedt(String samountedt) {
		this.samountedt.setValue(samountedt);
	}
	/**
	 * Gets the reference for attribute samountdsp.
	 * @return the samountdsp attribute reference
	 */
	public ElementaryRangeReference getSamountdspReference() {
		return samountdsp.getReference();
	}

	/**
	 * Getter for samountdsp attribute.
	 * @return samountdsp attribute
	 */
	public String getSamountdsp() {
		return samountdsp.getValue();
	}

	/**
	 * Setter for samountdsp attribute.
	 * @param samountdsp the new value of samountdsp
	 */
	public void setSamountdsp(String samountdsp) {
		this.samountdsp.setValue(samountdsp);
	}
	/**
	 * Gets the reference for attribute smerchid.
	 * @return the smerchid attribute reference
	 */
	public ElementaryRangeReference getSmerchidReference() {
		return smerchid.getReference();
	}

	/**
	 * Getter for smerchid attribute.
	 * @return smerchid attribute
	 */
	public int getSmerchid() {
		return smerchid.getValue();
	}

	/**
	 * Setter for smerchid attribute.
	 * @param smerchid the new value of smerchid
	 */
	public void setSmerchid(int smerchid) {
		this.smerchid.setValue(smerchid);
	}
	/**
	 * Gets the reference for attribute smerchname.
	 * @return the smerchname attribute reference
	 */
	public ElementaryRangeReference getSmerchnameReference() {
		return smerchname.getReference();
	}

	/**
	 * Getter for smerchname attribute.
	 * @return smerchname attribute
	 */
	public String getSmerchname() {
		return smerchname.getValue();
	}

	/**
	 * Setter for smerchname attribute.
	 * @param smerchname the new value of smerchname
	 */
	public void setSmerchname(String smerchname) {
		this.smerchname.setValue(smerchname);
	}
	/**
	 * Gets the reference for attribute sorigdate.
	 * @return the sorigdate attribute reference
	 */
	public ElementaryRangeReference getSorigdateReference() {
		return sorigdate.getReference();
	}

	/**
	 * Getter for sorigdate attribute.
	 * @return sorigdate attribute
	 */
	public String getSorigdate() {
		return sorigdate.getValue();
	}

	/**
	 * Setter for sorigdate attribute.
	 * @param sorigdate the new value of sorigdate
	 */
	public void setSorigdate(String sorigdate) {
		this.sorigdate.setValue(sorigdate);
	}
	/**
	 * Gets the reference for attribute sprocdate.
	 * @return the sprocdate attribute reference
	 */
	public ElementaryRangeReference getSprocdateReference() {
		return sprocdate.getReference();
	}

	/**
	 * Getter for sprocdate attribute.
	 * @return sprocdate attribute
	 */
	public String getSprocdate() {
		return sprocdate.getValue();
	}

	/**
	 * Setter for sprocdate attribute.
	 * @param sprocdate the new value of sprocdate
	 */
	public void setSprocdate(String sprocdate) {
		this.sprocdate.setValue(sprocdate);
	}
	/**
	 * Gets the reference for attribute susra1.
	 * @return the susra1 attribute reference
	 */
	public ElementaryRangeReference getSusra1Reference() {
		return susra1.getReference();
	}

	/**
	 * Getter for susra1 attribute.
	 * @return susra1 attribute
	 */
	public String getSusra1() {
		return susra1.getValue();
	}

	/**
	 * Setter for susra1 attribute.
	 * @param susra1 the new value of susra1
	 */
	public void setSusra1(String susra1) {
		this.susra1.setValue(susra1);
	}
	/**
	 * Gets the reference for attribute sdtea1.
	 * @return the sdtea1 attribute reference
	 */
	public ElementaryRangeReference getSdtea1Reference() {
		return sdtea1.getReference();
	}

	/**
	 * Getter for sdtea1 attribute.
	 * @return sdtea1 attribute
	 */
	public int getSdtea1() {
		return sdtea1.getValue();
	}

	/**
	 * Setter for sdtea1 attribute.
	 * @param sdtea1 the new value of sdtea1
	 */
	public void setSdtea1(int sdtea1) {
		this.sdtea1.setValue(sdtea1);
	}
	/**
	 * Gets the reference for attribute stmea1.
	 * @return the stmea1 attribute reference
	 */
	public ElementaryRangeReference getStmea1Reference() {
		return stmea1.getReference();
	}

	/**
	 * Getter for stmea1 attribute.
	 * @return stmea1 attribute
	 */
	public int getStmea1() {
		return stmea1.getValue();
	}

	/**
	 * Setter for stmea1 attribute.
	 * @param stmea1 the new value of stmea1
	 */
	public void setStmea1(int stmea1) {
		this.stmea1.setValue(stmea1);
	}
	/**
	 * Gets the reference for attribute spgma1.
	 * @return the spgma1 attribute reference
	 */
	public ElementaryRangeReference getSpgma1Reference() {
		return spgma1.getReference();
	}

	/**
	 * Getter for spgma1 attribute.
	 * @return spgma1 attribute
	 */
	public String getSpgma1() {
		return spgma1.getValue();
	}

	/**
	 * Setter for spgma1 attribute.
	 * @param spgma1 the new value of spgma1
	 */
	public void setSpgma1(String spgma1) {
		this.spgma1.setValue(spgma1);
	}
	/**
	 * Gets the reference for attribute susra2.
	 * @return the susra2 attribute reference
	 */
	public ElementaryRangeReference getSusra2Reference() {
		return susra2.getReference();
	}

	/**
	 * Getter for susra2 attribute.
	 * @return susra2 attribute
	 */
	public String getSusra2() {
		return susra2.getValue();
	}

	/**
	 * Setter for susra2 attribute.
	 * @param susra2 the new value of susra2
	 */
	public void setSusra2(String susra2) {
		this.susra2.setValue(susra2);
	}
	/**
	 * Gets the reference for attribute sdtea2.
	 * @return the sdtea2 attribute reference
	 */
	public ElementaryRangeReference getSdtea2Reference() {
		return sdtea2.getReference();
	}

	/**
	 * Getter for sdtea2 attribute.
	 * @return sdtea2 attribute
	 */
	public int getSdtea2() {
		return sdtea2.getValue();
	}

	/**
	 * Setter for sdtea2 attribute.
	 * @param sdtea2 the new value of sdtea2
	 */
	public void setSdtea2(int sdtea2) {
		this.sdtea2.setValue(sdtea2);
	}
	/**
	 * Gets the reference for attribute stmea2.
	 * @return the stmea2 attribute reference
	 */
	public ElementaryRangeReference getStmea2Reference() {
		return stmea2.getReference();
	}

	/**
	 * Getter for stmea2 attribute.
	 * @return stmea2 attribute
	 */
	public int getStmea2() {
		return stmea2.getValue();
	}

	/**
	 * Setter for stmea2 attribute.
	 * @param stmea2 the new value of stmea2
	 */
	public void setStmea2(int stmea2) {
		this.stmea2.setValue(stmea2);
	}
	/**
	 * Gets the reference for attribute spgma2.
	 * @return the spgma2 attribute reference
	 */
	public ElementaryRangeReference getSpgma2Reference() {
		return spgma2.getReference();
	}

	/**
	 * Getter for spgma2 attribute.
	 * @return spgma2 attribute
	 */
	public String getSpgma2() {
		return spgma2.getValue();
	}

	/**
	 * Setter for spgma2 attribute.
	 * @param spgma2 the new value of spgma2
	 */
	public void setSpgma2(String spgma2) {
		this.spgma2.setValue(spgma2);
	}
	/**
	 * Gets the reference for attribute susrb1.
	 * @return the susrb1 attribute reference
	 */
	public ElementaryRangeReference getSusrb1Reference() {
		return susrb1.getReference();
	}

	/**
	 * Getter for susrb1 attribute.
	 * @return susrb1 attribute
	 */
	public String getSusrb1() {
		return susrb1.getValue();
	}

	/**
	 * Setter for susrb1 attribute.
	 * @param susrb1 the new value of susrb1
	 */
	public void setSusrb1(String susrb1) {
		this.susrb1.setValue(susrb1);
	}
	/**
	 * Gets the reference for attribute sdteb1.
	 * @return the sdteb1 attribute reference
	 */
	public ElementaryRangeReference getSdteb1Reference() {
		return sdteb1.getReference();
	}

	/**
	 * Getter for sdteb1 attribute.
	 * @return sdteb1 attribute
	 */
	public int getSdteb1() {
		return sdteb1.getValue();
	}

	/**
	 * Setter for sdteb1 attribute.
	 * @param sdteb1 the new value of sdteb1
	 */
	public void setSdteb1(int sdteb1) {
		this.sdteb1.setValue(sdteb1);
	}
	/**
	 * Gets the reference for attribute stmeb1.
	 * @return the stmeb1 attribute reference
	 */
	public ElementaryRangeReference getStmeb1Reference() {
		return stmeb1.getReference();
	}

	/**
	 * Getter for stmeb1 attribute.
	 * @return stmeb1 attribute
	 */
	public int getStmeb1() {
		return stmeb1.getValue();
	}

	/**
	 * Setter for stmeb1 attribute.
	 * @param stmeb1 the new value of stmeb1
	 */
	public void setStmeb1(int stmeb1) {
		this.stmeb1.setValue(stmeb1);
	}
	/**
	 * Gets the reference for attribute spgmb1.
	 * @return the spgmb1 attribute reference
	 */
	public ElementaryRangeReference getSpgmb1Reference() {
		return spgmb1.getReference();
	}

	/**
	 * Getter for spgmb1 attribute.
	 * @return spgmb1 attribute
	 */
	public String getSpgmb1() {
		return spgmb1.getValue();
	}

	/**
	 * Setter for spgmb1 attribute.
	 * @param spgmb1 the new value of spgmb1
	 */
	public void setSpgmb1(String spgmb1) {
		this.spgmb1.setValue(spgmb1);
	}
	/**
	 * Gets the reference for attribute susrb2.
	 * @return the susrb2 attribute reference
	 */
	public ElementaryRangeReference getSusrb2Reference() {
		return susrb2.getReference();
	}

	/**
	 * Getter for susrb2 attribute.
	 * @return susrb2 attribute
	 */
	public String getSusrb2() {
		return susrb2.getValue();
	}

	/**
	 * Setter for susrb2 attribute.
	 * @param susrb2 the new value of susrb2
	 */
	public void setSusrb2(String susrb2) {
		this.susrb2.setValue(susrb2);
	}
	/**
	 * Gets the reference for attribute sdteb2.
	 * @return the sdteb2 attribute reference
	 */
	public ElementaryRangeReference getSdteb2Reference() {
		return sdteb2.getReference();
	}

	/**
	 * Getter for sdteb2 attribute.
	 * @return sdteb2 attribute
	 */
	public int getSdteb2() {
		return sdteb2.getValue();
	}

	/**
	 * Setter for sdteb2 attribute.
	 * @param sdteb2 the new value of sdteb2
	 */
	public void setSdteb2(int sdteb2) {
		this.sdteb2.setValue(sdteb2);
	}
	/**
	 * Gets the reference for attribute stmeb2.
	 * @return the stmeb2 attribute reference
	 */
	public ElementaryRangeReference getStmeb2Reference() {
		return stmeb2.getReference();
	}

	/**
	 * Getter for stmeb2 attribute.
	 * @return stmeb2 attribute
	 */
	public int getStmeb2() {
		return stmeb2.getValue();
	}

	/**
	 * Setter for stmeb2 attribute.
	 * @param stmeb2 the new value of stmeb2
	 */
	public void setStmeb2(int stmeb2) {
		this.stmeb2.setValue(stmeb2);
	}
	/**
	 * Gets the reference for attribute spgmb2.
	 * @return the spgmb2 attribute reference
	 */
	public ElementaryRangeReference getSpgmb2Reference() {
		return spgmb2.getReference();
	}

	/**
	 * Getter for spgmb2 attribute.
	 * @return spgmb2 attribute
	 */
	public String getSpgmb2() {
		return spgmb2.getValue();
	}

	/**
	 * Setter for spgmb2 attribute.
	 * @param spgmb2 the new value of spgmb2
	 */
	public void setSpgmb2(String spgmb2) {
		this.spgmb2.setValue(spgmb2);
	}
}
