package aws.bluage.carddemo.cdbpl011m.business.model;

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
 * Data simplifier entity Cdautpr.
 * 
 * <p>About 'aut_authid' field, <br>
 * </p>
 * 
 * <p>About 'aut_trnid' field, <br>
 * </p>
 * 
 * <p>About 'aut_cardnum' field, <br>
 * </p>
 * 
 * <p>About 'aut_response' field, <br>
 * </p>
 * 
 * <p>About 'aut_rspreason' field, <br>
 * </p>
 * 
 * <p>About 'aut_fraudflag' field, <br>
 * </p>
 * 
 * <p>About 'aut_authdate' field, <br>
 * </p>
 * 
 * <p>About 'aut_authtime' field, <br>
 * </p>
 * 
 * <p>About 'aut_authuser' field, <br>
 * </p>
 * 
 * <p>About 'aut_authpgm' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cdautpr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary aut_authid = new Elementary(root,new PackedType(18, 0, true),new BigDecimal("0"));
	private final Elementary aut_trnid = new Elementary(root,new PackedType(15, 0, true),new BigDecimal("0"));
	private final Elementary aut_cardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	private final Elementary aut_response = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary aut_rspreason = new Elementary(root,new AlphanumericType(30)," ");
	private final Elementary aut_fraudflag = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary aut_authdate = new Elementary(root,new AlphanumericType(10),"0001-01-01");
	private final Elementary aut_authtime = new Elementary(root,new AlphanumericType(8),"00.00.00");
	private final Elementary aut_authuser = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary aut_authpgm = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Cdautpr with a default record.
	 * @param configuration the configuration
	 */
	public Cdautpr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cdautpr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cdautpr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute aut_authid.
	 * @return the aut_authid attribute reference
	 */
	public ElementaryRangeReference getAut_authidReference() {
		return aut_authid.getReference();
	}

	/**
	 * Getter for aut_authid attribute.
	 * @return aut_authid attribute
	 */
	public long getAut_authid() {
		return aut_authid.getValue();
	}

	/**
	 * Setter for aut_authid attribute.
	 * @param aut_authid the new value of aut_authid
	 */
	public void setAut_authid(long aut_authid) {
		this.aut_authid.setValue(aut_authid);
	}
	/**
	 * Gets the reference for attribute aut_trnid.
	 * @return the aut_trnid attribute reference
	 */
	public ElementaryRangeReference getAut_trnidReference() {
		return aut_trnid.getReference();
	}

	/**
	 * Getter for aut_trnid attribute.
	 * @return aut_trnid attribute
	 */
	public long getAut_trnid() {
		return aut_trnid.getValue();
	}

	/**
	 * Setter for aut_trnid attribute.
	 * @param aut_trnid the new value of aut_trnid
	 */
	public void setAut_trnid(long aut_trnid) {
		this.aut_trnid.setValue(aut_trnid);
	}
	/**
	 * Gets the reference for attribute aut_cardnum.
	 * @return the aut_cardnum attribute reference
	 */
	public ElementaryRangeReference getAut_cardnumReference() {
		return aut_cardnum.getReference();
	}

	/**
	 * Getter for aut_cardnum attribute.
	 * @return aut_cardnum attribute
	 */
	public long getAut_cardnum() {
		return aut_cardnum.getValue();
	}

	/**
	 * Setter for aut_cardnum attribute.
	 * @param aut_cardnum the new value of aut_cardnum
	 */
	public void setAut_cardnum(long aut_cardnum) {
		this.aut_cardnum.setValue(aut_cardnum);
	}
	/**
	 * Gets the reference for attribute aut_response.
	 * @return the aut_response attribute reference
	 */
	public ElementaryRangeReference getAut_responseReference() {
		return aut_response.getReference();
	}

	/**
	 * Getter for aut_response attribute.
	 * @return aut_response attribute
	 */
	public String getAut_response() {
		return aut_response.getValue();
	}

	/**
	 * Setter for aut_response attribute.
	 * @param aut_response the new value of aut_response
	 */
	public void setAut_response(String aut_response) {
		this.aut_response.setValue(aut_response);
	}
	/**
	 * Gets the reference for attribute aut_rspreason.
	 * @return the aut_rspreason attribute reference
	 */
	public ElementaryRangeReference getAut_rspreasonReference() {
		return aut_rspreason.getReference();
	}

	/**
	 * Getter for aut_rspreason attribute.
	 * @return aut_rspreason attribute
	 */
	public String getAut_rspreason() {
		return aut_rspreason.getValue();
	}

	/**
	 * Setter for aut_rspreason attribute.
	 * @param aut_rspreason the new value of aut_rspreason
	 */
	public void setAut_rspreason(String aut_rspreason) {
		this.aut_rspreason.setValue(aut_rspreason);
	}
	/**
	 * Gets the reference for attribute aut_fraudflag.
	 * @return the aut_fraudflag attribute reference
	 */
	public ElementaryRangeReference getAut_fraudflagReference() {
		return aut_fraudflag.getReference();
	}

	/**
	 * Getter for aut_fraudflag attribute.
	 * @return aut_fraudflag attribute
	 */
	public String getAut_fraudflag() {
		return aut_fraudflag.getValue();
	}

	/**
	 * Setter for aut_fraudflag attribute.
	 * @param aut_fraudflag the new value of aut_fraudflag
	 */
	public void setAut_fraudflag(String aut_fraudflag) {
		this.aut_fraudflag.setValue(aut_fraudflag);
	}
	/**
	 * Gets the reference for attribute aut_authdate.
	 * @return the aut_authdate attribute reference
	 */
	public ElementaryRangeReference getAut_authdateReference() {
		return aut_authdate.getReference();
	}

	/**
	 * Getter for aut_authdate attribute.
	 * @return aut_authdate attribute
	 */
	public String getAut_authdate() {
		return aut_authdate.getValue();
	}

	/**
	 * Setter for aut_authdate attribute.
	 * @param aut_authdate the new value of aut_authdate
	 */
	public void setAut_authdate(String aut_authdate) {
		this.aut_authdate.setValue(aut_authdate);
	}
	/**
	 * Gets the reference for attribute aut_authtime.
	 * @return the aut_authtime attribute reference
	 */
	public ElementaryRangeReference getAut_authtimeReference() {
		return aut_authtime.getReference();
	}

	/**
	 * Getter for aut_authtime attribute.
	 * @return aut_authtime attribute
	 */
	public String getAut_authtime() {
		return aut_authtime.getValue();
	}

	/**
	 * Setter for aut_authtime attribute.
	 * @param aut_authtime the new value of aut_authtime
	 */
	public void setAut_authtime(String aut_authtime) {
		this.aut_authtime.setValue(aut_authtime);
	}
	/**
	 * Gets the reference for attribute aut_authuser.
	 * @return the aut_authuser attribute reference
	 */
	public ElementaryRangeReference getAut_authuserReference() {
		return aut_authuser.getReference();
	}

	/**
	 * Getter for aut_authuser attribute.
	 * @return aut_authuser attribute
	 */
	public String getAut_authuser() {
		return aut_authuser.getValue();
	}

	/**
	 * Setter for aut_authuser attribute.
	 * @param aut_authuser the new value of aut_authuser
	 */
	public void setAut_authuser(String aut_authuser) {
		this.aut_authuser.setValue(aut_authuser);
	}
	/**
	 * Gets the reference for attribute aut_authpgm.
	 * @return the aut_authpgm attribute reference
	 */
	public ElementaryRangeReference getAut_authpgmReference() {
		return aut_authpgm.getReference();
	}

	/**
	 * Getter for aut_authpgm attribute.
	 * @return aut_authpgm attribute
	 */
	public String getAut_authpgm() {
		return aut_authpgm.getValue();
	}

	/**
	 * Setter for aut_authpgm attribute.
	 * @param aut_authpgm the new value of aut_authpgm
	 */
	public void setAut_authpgm(String aut_authpgm) {
		this.aut_authpgm.setValue(aut_authpgm);
	}
}
