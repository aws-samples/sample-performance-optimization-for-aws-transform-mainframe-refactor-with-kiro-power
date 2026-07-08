package aws.bluage.carddemo.cdtrn02r.business.model;

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
 * Data simplifier entity Modifiedds.
 * 
 * <p>About 'strnid' field, <br>
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
 * <p>About 'samount' field, <br>
 * </p>
 * 
 * <p>About 'sorigdate' field, <br>
 * </p>
 * 
 * <p>About 'sprocdate' field, <br>
 * </p>
 * 
 * <p>About 'smerchid' field, <br>
 * </p>
 * 
 * <p>About 'strnstatus' field, <br>
 * </p>
 * 
 * <p>About 'wdtea1' field, <br>
 * </p>
 * 
 * <p>About 'wtmea1' field, <br>
 * </p>
 * 
 * <p>About 'susra1' field, <br>
 * </p>
 * 
 * <p>About 'spgma1' field, <br>
 * </p>
 * 
 * <p>About 'wdtea2' field, <br>
 * </p>
 * 
 * <p>About 'wtmea2' field, <br>
 * </p>
 * 
 * <p>About 'susra2' field, <br>
 * </p>
 * 
 * <p>About 'spgma2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Modifiedds extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary strnid = new Elementary(root,new PackedType(15, 0, true),new BigDecimal("0"));
	private final Elementary scardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	private final Elementary stypecd = new Elementary(root,new AlphanumericType(2)," ");
	private final Elementary scategcd = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary ssource = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary sdess = new Elementary(root,new AlphanumericType(30)," ");
	private final Elementary samount = new Elementary(root,new ZonedType(9, 2, true),new BigDecimal("0"));
	private final Elementary sorigdate = new Elementary(root,new AlphanumericType(10),"0001-01-01");
	private final Elementary sprocdate = new Elementary(root,new AlphanumericType(10),"0001-01-01");
	private final Elementary smerchid = new Elementary(root,new PackedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary strnstatus = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary wdtea1 = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary wtmea1 = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary susra1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary spgma1 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary wdtea2 = new Elementary(root,new PackedType(7, 0, true),Integer.valueOf("0"));
	private final Elementary wtmea2 = new Elementary(root,new PackedType(6, 0, true),Integer.valueOf("0"));
	private final Elementary susra2 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary spgma2 = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Modifiedds with a default record.
	 * @param configuration the configuration
	 */
	public Modifiedds(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Modifiedds bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Modifiedds(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
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
	 * Gets the reference for attribute samount.
	 * @return the samount attribute reference
	 */
	public ElementaryRangeReference getSamountReference() {
		return samount.getReference();
	}

	/**
	 * Getter for samount attribute.
	 * @return samount attribute
	 */
	public BigDecimal getSamount() {
		return samount.getValue();
	}

	/**
	 * Setter for samount attribute.
	 * @param samount the new value of samount
	 */
	public void setSamount(BigDecimal samount) {
		this.samount.setValue(samount);
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
	 * Gets the reference for attribute strnstatus.
	 * @return the strnstatus attribute reference
	 */
	public ElementaryRangeReference getStrnstatusReference() {
		return strnstatus.getReference();
	}

	/**
	 * Getter for strnstatus attribute.
	 * @return strnstatus attribute
	 */
	public String getStrnstatus() {
		return strnstatus.getValue();
	}

	/**
	 * Setter for strnstatus attribute.
	 * @param strnstatus the new value of strnstatus
	 */
	public void setStrnstatus(String strnstatus) {
		this.strnstatus.setValue(strnstatus);
	}
	/**
	 * Gets the reference for attribute wdtea1.
	 * @return the wdtea1 attribute reference
	 */
	public ElementaryRangeReference getWdtea1Reference() {
		return wdtea1.getReference();
	}

	/**
	 * Getter for wdtea1 attribute.
	 * @return wdtea1 attribute
	 */
	public int getWdtea1() {
		return wdtea1.getValue();
	}

	/**
	 * Setter for wdtea1 attribute.
	 * @param wdtea1 the new value of wdtea1
	 */
	public void setWdtea1(int wdtea1) {
		this.wdtea1.setValue(wdtea1);
	}
	/**
	 * Gets the reference for attribute wtmea1.
	 * @return the wtmea1 attribute reference
	 */
	public ElementaryRangeReference getWtmea1Reference() {
		return wtmea1.getReference();
	}

	/**
	 * Getter for wtmea1 attribute.
	 * @return wtmea1 attribute
	 */
	public int getWtmea1() {
		return wtmea1.getValue();
	}

	/**
	 * Setter for wtmea1 attribute.
	 * @param wtmea1 the new value of wtmea1
	 */
	public void setWtmea1(int wtmea1) {
		this.wtmea1.setValue(wtmea1);
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
	 * Gets the reference for attribute wdtea2.
	 * @return the wdtea2 attribute reference
	 */
	public ElementaryRangeReference getWdtea2Reference() {
		return wdtea2.getReference();
	}

	/**
	 * Getter for wdtea2 attribute.
	 * @return wdtea2 attribute
	 */
	public int getWdtea2() {
		return wdtea2.getValue();
	}

	/**
	 * Setter for wdtea2 attribute.
	 * @param wdtea2 the new value of wdtea2
	 */
	public void setWdtea2(int wdtea2) {
		this.wdtea2.setValue(wdtea2);
	}
	/**
	 * Gets the reference for attribute wtmea2.
	 * @return the wtmea2 attribute reference
	 */
	public ElementaryRangeReference getWtmea2Reference() {
		return wtmea2.getReference();
	}

	/**
	 * Getter for wtmea2 attribute.
	 * @return wtmea2 attribute
	 */
	public int getWtmea2() {
		return wtmea2.getValue();
	}

	/**
	 * Setter for wtmea2 attribute.
	 * @param wtmea2 the new value of wtmea2
	 */
	public void setWtmea2(int wtmea2) {
		this.wtmea2.setValue(wtmea2);
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
}
