package aws.bluage.carddemo.cdtrn03r.business.model;

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
 * <p>About 'dftrtext' field, <br>
 * </p>
 * 
 * <p>About 'dtrnid' field, <br>
 * </p>
 * 
 * <p>About 'dstatus' field, <br>
 * </p>
 * 
 * <p>About 'dstatusdtl' field, <br>
 * </p>
 * 
 * <p>About 'dcardnum' field, <br>
 * </p>
 * 
 * <p>About 'dtypecd' field, <br>
 * </p>
 * 
 * <p>About 'dcategcd' field, <br>
 * </p>
 * 
 * <p>About 'dsource' field, <br>
 * </p>
 * 
 * <p>About 'ddess' field, <br>
 * </p>
 * 
 * <p>About 'damountedt' field, <br>
 * </p>
 * 
 * <p>About 'damountdsp' field, <br>
 * </p>
 * 
 * <p>About 'dmerchid' field, <br>
 * </p>
 * 
 * <p>About 'dmerchname' field, <br>
 * </p>
 * 
 * <p>About 'dorigdate' field, <br>
 * </p>
 * 
 * <p>About 'dprocdate' field, <br>
 * </p>
 * 
 * <p>About 'dusra1' field, <br>
 * </p>
 * 
 * <p>About 'ddtea1' field, <br>
 * </p>
 * 
 * <p>About 'dtmea1' field, <br>
 * </p>
 * 
 * <p>About 'dpgma1' field, <br>
 * </p>
 * 
 * <p>About 'dusra2' field, <br>
 * </p>
 * 
 * <p>About 'ddtea2' field, <br>
 * </p>
 * 
 * <p>About 'dtmea2' field, <br>
 * </p>
 * 
 * <p>About 'dpgma2' field, <br>
 * </p>
 * 
 * <p>About 'dusrb1' field, <br>
 * </p>
 * 
 * <p>About 'ddteb1' field, <br>
 * </p>
 * 
 * <p>About 'dtmeb1' field, <br>
 * </p>
 * 
 * <p>About 'dpgmb1' field, <br>
 * </p>
 * 
 * <p>About 'dusrb2' field, <br>
 * </p>
 * 
 * <p>About 'ddteb2' field, <br>
 * </p>
 * 
 * <p>About 'dtmeb2' field, <br>
 * </p>
 * 
 * <p>About 'dpgmb2' field, <br>
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
	private final Elementary dftrtext = new Elementary(root,new AlphanumericType(35)," ");
	private final Elementary dtrnid = new Elementary(root,new ZonedType(15, 0, true),new BigDecimal("0"));
	private final Elementary dstatus = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary dstatusdtl = new Elementary(root,new AlphanumericType(20)," ");
	private final Elementary dcardnum = new Elementary(root,new ZonedType(16, 0, true),new BigDecimal("0"));
	private final Elementary dtypecd = new Elementary(root,new AlphanumericType(2)," ");
	private final Elementary dcategcd = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary dsource = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary ddess = new Elementary(root,new AlphanumericType(30)," ");
	private final Elementary damountedt = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary damountdsp = new Elementary(root,new AlphanumericType(13)," ");
	private final Elementary dmerchid = new Elementary(root,new ZonedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary dmerchname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary dorigdate = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dprocdate = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dusra1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ddtea1 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dtmea1 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dpgma1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dusra2 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ddtea2 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dtmea2 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dpgma2 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dusrb1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ddteb1 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dtmeb1 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dpgmb1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary dusrb2 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ddteb2 = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary dtmeb2 = new Elementary(root,new ZonedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary dpgmb2 = new Elementary(root,new AlphanumericType(10)," ");
	
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
	 * Gets the reference for attribute dftrtext.
	 * @return the dftrtext attribute reference
	 */
	public ElementaryRangeReference getDftrtextReference() {
		return dftrtext.getReference();
	}

	/**
	 * Getter for dftrtext attribute.
	 * @return dftrtext attribute
	 */
	public String getDftrtext() {
		return dftrtext.getValue();
	}

	/**
	 * Setter for dftrtext attribute.
	 * @param dftrtext the new value of dftrtext
	 */
	public void setDftrtext(String dftrtext) {
		this.dftrtext.setValue(dftrtext);
	}
	/**
	 * Gets the reference for attribute dtrnid.
	 * @return the dtrnid attribute reference
	 */
	public ElementaryRangeReference getDtrnidReference() {
		return dtrnid.getReference();
	}

	/**
	 * Getter for dtrnid attribute.
	 * @return dtrnid attribute
	 */
	public long getDtrnid() {
		return dtrnid.getValue();
	}

	/**
	 * Setter for dtrnid attribute.
	 * @param dtrnid the new value of dtrnid
	 */
	public void setDtrnid(long dtrnid) {
		this.dtrnid.setValue(dtrnid);
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
	 * Gets the reference for attribute dstatusdtl.
	 * @return the dstatusdtl attribute reference
	 */
	public ElementaryRangeReference getDstatusdtlReference() {
		return dstatusdtl.getReference();
	}

	/**
	 * Getter for dstatusdtl attribute.
	 * @return dstatusdtl attribute
	 */
	public String getDstatusdtl() {
		return dstatusdtl.getValue();
	}

	/**
	 * Setter for dstatusdtl attribute.
	 * @param dstatusdtl the new value of dstatusdtl
	 */
	public void setDstatusdtl(String dstatusdtl) {
		this.dstatusdtl.setValue(dstatusdtl);
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
	 * Gets the reference for attribute dtypecd.
	 * @return the dtypecd attribute reference
	 */
	public ElementaryRangeReference getDtypecdReference() {
		return dtypecd.getReference();
	}

	/**
	 * Getter for dtypecd attribute.
	 * @return dtypecd attribute
	 */
	public String getDtypecd() {
		return dtypecd.getValue();
	}

	/**
	 * Setter for dtypecd attribute.
	 * @param dtypecd the new value of dtypecd
	 */
	public void setDtypecd(String dtypecd) {
		this.dtypecd.setValue(dtypecd);
	}
	/**
	 * Gets the reference for attribute dcategcd.
	 * @return the dcategcd attribute reference
	 */
	public ElementaryRangeReference getDcategcdReference() {
		return dcategcd.getReference();
	}

	/**
	 * Getter for dcategcd attribute.
	 * @return dcategcd attribute
	 */
	public String getDcategcd() {
		return dcategcd.getValue();
	}

	/**
	 * Setter for dcategcd attribute.
	 * @param dcategcd the new value of dcategcd
	 */
	public void setDcategcd(String dcategcd) {
		this.dcategcd.setValue(dcategcd);
	}
	/**
	 * Gets the reference for attribute dsource.
	 * @return the dsource attribute reference
	 */
	public ElementaryRangeReference getDsourceReference() {
		return dsource.getReference();
	}

	/**
	 * Getter for dsource attribute.
	 * @return dsource attribute
	 */
	public String getDsource() {
		return dsource.getValue();
	}

	/**
	 * Setter for dsource attribute.
	 * @param dsource the new value of dsource
	 */
	public void setDsource(String dsource) {
		this.dsource.setValue(dsource);
	}
	/**
	 * Gets the reference for attribute ddess.
	 * @return the ddess attribute reference
	 */
	public ElementaryRangeReference getDdessReference() {
		return ddess.getReference();
	}

	/**
	 * Getter for ddess attribute.
	 * @return ddess attribute
	 */
	public String getDdess() {
		return ddess.getValue();
	}

	/**
	 * Setter for ddess attribute.
	 * @param ddess the new value of ddess
	 */
	public void setDdess(String ddess) {
		this.ddess.setValue(ddess);
	}
	/**
	 * Gets the reference for attribute damountedt.
	 * @return the damountedt attribute reference
	 */
	public ElementaryRangeReference getDamountedtReference() {
		return damountedt.getReference();
	}

	/**
	 * Getter for damountedt attribute.
	 * @return damountedt attribute
	 */
	public String getDamountedt() {
		return damountedt.getValue();
	}

	/**
	 * Setter for damountedt attribute.
	 * @param damountedt the new value of damountedt
	 */
	public void setDamountedt(String damountedt) {
		this.damountedt.setValue(damountedt);
	}
	/**
	 * Gets the reference for attribute damountdsp.
	 * @return the damountdsp attribute reference
	 */
	public ElementaryRangeReference getDamountdspReference() {
		return damountdsp.getReference();
	}

	/**
	 * Getter for damountdsp attribute.
	 * @return damountdsp attribute
	 */
	public String getDamountdsp() {
		return damountdsp.getValue();
	}

	/**
	 * Setter for damountdsp attribute.
	 * @param damountdsp the new value of damountdsp
	 */
	public void setDamountdsp(String damountdsp) {
		this.damountdsp.setValue(damountdsp);
	}
	/**
	 * Gets the reference for attribute dmerchid.
	 * @return the dmerchid attribute reference
	 */
	public ElementaryRangeReference getDmerchidReference() {
		return dmerchid.getReference();
	}

	/**
	 * Getter for dmerchid attribute.
	 * @return dmerchid attribute
	 */
	public int getDmerchid() {
		return dmerchid.getValue();
	}

	/**
	 * Setter for dmerchid attribute.
	 * @param dmerchid the new value of dmerchid
	 */
	public void setDmerchid(int dmerchid) {
		this.dmerchid.setValue(dmerchid);
	}
	/**
	 * Gets the reference for attribute dmerchname.
	 * @return the dmerchname attribute reference
	 */
	public ElementaryRangeReference getDmerchnameReference() {
		return dmerchname.getReference();
	}

	/**
	 * Getter for dmerchname attribute.
	 * @return dmerchname attribute
	 */
	public String getDmerchname() {
		return dmerchname.getValue();
	}

	/**
	 * Setter for dmerchname attribute.
	 * @param dmerchname the new value of dmerchname
	 */
	public void setDmerchname(String dmerchname) {
		this.dmerchname.setValue(dmerchname);
	}
	/**
	 * Gets the reference for attribute dorigdate.
	 * @return the dorigdate attribute reference
	 */
	public ElementaryRangeReference getDorigdateReference() {
		return dorigdate.getReference();
	}

	/**
	 * Getter for dorigdate attribute.
	 * @return dorigdate attribute
	 */
	public String getDorigdate() {
		return dorigdate.getValue();
	}

	/**
	 * Setter for dorigdate attribute.
	 * @param dorigdate the new value of dorigdate
	 */
	public void setDorigdate(String dorigdate) {
		this.dorigdate.setValue(dorigdate);
	}
	/**
	 * Gets the reference for attribute dprocdate.
	 * @return the dprocdate attribute reference
	 */
	public ElementaryRangeReference getDprocdateReference() {
		return dprocdate.getReference();
	}

	/**
	 * Getter for dprocdate attribute.
	 * @return dprocdate attribute
	 */
	public String getDprocdate() {
		return dprocdate.getValue();
	}

	/**
	 * Setter for dprocdate attribute.
	 * @param dprocdate the new value of dprocdate
	 */
	public void setDprocdate(String dprocdate) {
		this.dprocdate.setValue(dprocdate);
	}
	/**
	 * Gets the reference for attribute dusra1.
	 * @return the dusra1 attribute reference
	 */
	public ElementaryRangeReference getDusra1Reference() {
		return dusra1.getReference();
	}

	/**
	 * Getter for dusra1 attribute.
	 * @return dusra1 attribute
	 */
	public String getDusra1() {
		return dusra1.getValue();
	}

	/**
	 * Setter for dusra1 attribute.
	 * @param dusra1 the new value of dusra1
	 */
	public void setDusra1(String dusra1) {
		this.dusra1.setValue(dusra1);
	}
	/**
	 * Gets the reference for attribute ddtea1.
	 * @return the ddtea1 attribute reference
	 */
	public ElementaryRangeReference getDdtea1Reference() {
		return ddtea1.getReference();
	}

	/**
	 * Getter for ddtea1 attribute.
	 * @return ddtea1 attribute
	 */
	public int getDdtea1() {
		return ddtea1.getValue();
	}

	/**
	 * Setter for ddtea1 attribute.
	 * @param ddtea1 the new value of ddtea1
	 */
	public void setDdtea1(int ddtea1) {
		this.ddtea1.setValue(ddtea1);
	}
	/**
	 * Gets the reference for attribute dtmea1.
	 * @return the dtmea1 attribute reference
	 */
	public ElementaryRangeReference getDtmea1Reference() {
		return dtmea1.getReference();
	}

	/**
	 * Getter for dtmea1 attribute.
	 * @return dtmea1 attribute
	 */
	public int getDtmea1() {
		return dtmea1.getValue();
	}

	/**
	 * Setter for dtmea1 attribute.
	 * @param dtmea1 the new value of dtmea1
	 */
	public void setDtmea1(int dtmea1) {
		this.dtmea1.setValue(dtmea1);
	}
	/**
	 * Gets the reference for attribute dpgma1.
	 * @return the dpgma1 attribute reference
	 */
	public ElementaryRangeReference getDpgma1Reference() {
		return dpgma1.getReference();
	}

	/**
	 * Getter for dpgma1 attribute.
	 * @return dpgma1 attribute
	 */
	public String getDpgma1() {
		return dpgma1.getValue();
	}

	/**
	 * Setter for dpgma1 attribute.
	 * @param dpgma1 the new value of dpgma1
	 */
	public void setDpgma1(String dpgma1) {
		this.dpgma1.setValue(dpgma1);
	}
	/**
	 * Gets the reference for attribute dusra2.
	 * @return the dusra2 attribute reference
	 */
	public ElementaryRangeReference getDusra2Reference() {
		return dusra2.getReference();
	}

	/**
	 * Getter for dusra2 attribute.
	 * @return dusra2 attribute
	 */
	public String getDusra2() {
		return dusra2.getValue();
	}

	/**
	 * Setter for dusra2 attribute.
	 * @param dusra2 the new value of dusra2
	 */
	public void setDusra2(String dusra2) {
		this.dusra2.setValue(dusra2);
	}
	/**
	 * Gets the reference for attribute ddtea2.
	 * @return the ddtea2 attribute reference
	 */
	public ElementaryRangeReference getDdtea2Reference() {
		return ddtea2.getReference();
	}

	/**
	 * Getter for ddtea2 attribute.
	 * @return ddtea2 attribute
	 */
	public int getDdtea2() {
		return ddtea2.getValue();
	}

	/**
	 * Setter for ddtea2 attribute.
	 * @param ddtea2 the new value of ddtea2
	 */
	public void setDdtea2(int ddtea2) {
		this.ddtea2.setValue(ddtea2);
	}
	/**
	 * Gets the reference for attribute dtmea2.
	 * @return the dtmea2 attribute reference
	 */
	public ElementaryRangeReference getDtmea2Reference() {
		return dtmea2.getReference();
	}

	/**
	 * Getter for dtmea2 attribute.
	 * @return dtmea2 attribute
	 */
	public int getDtmea2() {
		return dtmea2.getValue();
	}

	/**
	 * Setter for dtmea2 attribute.
	 * @param dtmea2 the new value of dtmea2
	 */
	public void setDtmea2(int dtmea2) {
		this.dtmea2.setValue(dtmea2);
	}
	/**
	 * Gets the reference for attribute dpgma2.
	 * @return the dpgma2 attribute reference
	 */
	public ElementaryRangeReference getDpgma2Reference() {
		return dpgma2.getReference();
	}

	/**
	 * Getter for dpgma2 attribute.
	 * @return dpgma2 attribute
	 */
	public String getDpgma2() {
		return dpgma2.getValue();
	}

	/**
	 * Setter for dpgma2 attribute.
	 * @param dpgma2 the new value of dpgma2
	 */
	public void setDpgma2(String dpgma2) {
		this.dpgma2.setValue(dpgma2);
	}
	/**
	 * Gets the reference for attribute dusrb1.
	 * @return the dusrb1 attribute reference
	 */
	public ElementaryRangeReference getDusrb1Reference() {
		return dusrb1.getReference();
	}

	/**
	 * Getter for dusrb1 attribute.
	 * @return dusrb1 attribute
	 */
	public String getDusrb1() {
		return dusrb1.getValue();
	}

	/**
	 * Setter for dusrb1 attribute.
	 * @param dusrb1 the new value of dusrb1
	 */
	public void setDusrb1(String dusrb1) {
		this.dusrb1.setValue(dusrb1);
	}
	/**
	 * Gets the reference for attribute ddteb1.
	 * @return the ddteb1 attribute reference
	 */
	public ElementaryRangeReference getDdteb1Reference() {
		return ddteb1.getReference();
	}

	/**
	 * Getter for ddteb1 attribute.
	 * @return ddteb1 attribute
	 */
	public int getDdteb1() {
		return ddteb1.getValue();
	}

	/**
	 * Setter for ddteb1 attribute.
	 * @param ddteb1 the new value of ddteb1
	 */
	public void setDdteb1(int ddteb1) {
		this.ddteb1.setValue(ddteb1);
	}
	/**
	 * Gets the reference for attribute dtmeb1.
	 * @return the dtmeb1 attribute reference
	 */
	public ElementaryRangeReference getDtmeb1Reference() {
		return dtmeb1.getReference();
	}

	/**
	 * Getter for dtmeb1 attribute.
	 * @return dtmeb1 attribute
	 */
	public int getDtmeb1() {
		return dtmeb1.getValue();
	}

	/**
	 * Setter for dtmeb1 attribute.
	 * @param dtmeb1 the new value of dtmeb1
	 */
	public void setDtmeb1(int dtmeb1) {
		this.dtmeb1.setValue(dtmeb1);
	}
	/**
	 * Gets the reference for attribute dpgmb1.
	 * @return the dpgmb1 attribute reference
	 */
	public ElementaryRangeReference getDpgmb1Reference() {
		return dpgmb1.getReference();
	}

	/**
	 * Getter for dpgmb1 attribute.
	 * @return dpgmb1 attribute
	 */
	public String getDpgmb1() {
		return dpgmb1.getValue();
	}

	/**
	 * Setter for dpgmb1 attribute.
	 * @param dpgmb1 the new value of dpgmb1
	 */
	public void setDpgmb1(String dpgmb1) {
		this.dpgmb1.setValue(dpgmb1);
	}
	/**
	 * Gets the reference for attribute dusrb2.
	 * @return the dusrb2 attribute reference
	 */
	public ElementaryRangeReference getDusrb2Reference() {
		return dusrb2.getReference();
	}

	/**
	 * Getter for dusrb2 attribute.
	 * @return dusrb2 attribute
	 */
	public String getDusrb2() {
		return dusrb2.getValue();
	}

	/**
	 * Setter for dusrb2 attribute.
	 * @param dusrb2 the new value of dusrb2
	 */
	public void setDusrb2(String dusrb2) {
		this.dusrb2.setValue(dusrb2);
	}
	/**
	 * Gets the reference for attribute ddteb2.
	 * @return the ddteb2 attribute reference
	 */
	public ElementaryRangeReference getDdteb2Reference() {
		return ddteb2.getReference();
	}

	/**
	 * Getter for ddteb2 attribute.
	 * @return ddteb2 attribute
	 */
	public int getDdteb2() {
		return ddteb2.getValue();
	}

	/**
	 * Setter for ddteb2 attribute.
	 * @param ddteb2 the new value of ddteb2
	 */
	public void setDdteb2(int ddteb2) {
		this.ddteb2.setValue(ddteb2);
	}
	/**
	 * Gets the reference for attribute dtmeb2.
	 * @return the dtmeb2 attribute reference
	 */
	public ElementaryRangeReference getDtmeb2Reference() {
		return dtmeb2.getReference();
	}

	/**
	 * Getter for dtmeb2 attribute.
	 * @return dtmeb2 attribute
	 */
	public int getDtmeb2() {
		return dtmeb2.getValue();
	}

	/**
	 * Setter for dtmeb2 attribute.
	 * @param dtmeb2 the new value of dtmeb2
	 */
	public void setDtmeb2(int dtmeb2) {
		this.dtmeb2.setValue(dtmeb2);
	}
	/**
	 * Gets the reference for attribute dpgmb2.
	 * @return the dpgmb2 attribute reference
	 */
	public ElementaryRangeReference getDpgmb2Reference() {
		return dpgmb2.getReference();
	}

	/**
	 * Getter for dpgmb2 attribute.
	 * @return dpgmb2 attribute
	 */
	public String getDpgmb2() {
		return dpgmb2.getValue();
	}

	/**
	 * Setter for dpgmb2 attribute.
	 * @param dpgmb2 the new value of dpgmb2
	 */
	public void setDpgmb2(String dpgmb2) {
		this.dpgmb2.setValue(dpgmb2);
	}
}
