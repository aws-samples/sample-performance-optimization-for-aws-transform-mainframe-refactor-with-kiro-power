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
 * Data simplifier entity Screenstate.
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
 * <p>About 'dacctnum' field, <br>
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
 * @see RecordEntity
 */
public class Screenstate extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dcsrrec = new Elementary(root,new AlphanumericType(10));
	private final Elementary dcsrfld = new Elementary(root,new AlphanumericType(10));
	private final Elementary dcsrpos = new Elementary(root,new ZonedType(4, 0, true));
	private final Elementary dacctnum = new Elementary(root,new AlphanumericType(12));
	private final Elementary dexpirydate = new Elementary(root,new AlphanumericType(10));
	private final Elementary dpricustid = new Elementary(root,new AlphanumericType(9));
	private final Elementary dseccustid = new Elementary(root,new AlphanumericType(9));
	private final Elementary dacctgrp = new Elementary(root,new AlphanumericType(15));
	private final Elementary dcredlimit = new Elementary(root,new AlphanumericType(10));
	private final Elementary dcashlimit = new Elementary(root,new AlphanumericType(10));
	
	/**
	 * Instantiate a new Screenstate with a default record.
	 * @param configuration the configuration
	 */
	public Screenstate(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Screenstate bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Screenstate(Configuration configuration, RecordAdaptable record) {
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
}
