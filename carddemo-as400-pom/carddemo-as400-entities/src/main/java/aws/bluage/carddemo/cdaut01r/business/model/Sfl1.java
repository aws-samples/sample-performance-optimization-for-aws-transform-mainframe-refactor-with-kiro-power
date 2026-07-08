package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Sfl1.
 * 
 * <p>About 'authid' field, <br>
 * </p>
 * 
 * <p>About 'trnid' field, <br>
 * </p>
 * 
 * <p>About 'cardnum' field, <br>
 * </p>
 * 
 * <p>About 'rspreason' field, <br>
 * </p>
 * 
 * <p>About 'fraudflag' field, <br>
 * </p>
 * 
 * <p>About 'authdate' field, <br>
 * </p>
 * 
 * <p>About 'authtime' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Sfl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary authid = new Elementary(root,new PackedType(18, 0, true));
	private final Elementary trnid = new Elementary(root,new PackedType(15, 0, true));
	private final Elementary cardnum = new Elementary(root,new PackedType(16, 0, true));
	private final Elementary rspreason = new Elementary(root,new AlphanumericType(30));
	private final Elementary fraudflag = new Elementary(root,new AlphanumericType(1));
	private final Elementary authdate = new Elementary(root,new AlphanumericType(10));
	private final Elementary authtime = new Elementary(root,new AlphanumericType(8));
	
	/**
	 * Instantiate a new Sfl1 with a default record.
	 * @param configuration the configuration
	 */
	public Sfl1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Sfl1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Sfl1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute authid.
	 * @return the authid attribute reference
	 */
	public ElementaryRangeReference getAuthidReference() {
		return authid.getReference();
	}

	/**
	 * Getter for authid attribute.
	 * @return authid attribute
	 */
	public long getAuthid() {
		return authid.getValue();
	}

	/**
	 * Setter for authid attribute.
	 * @param authid the new value of authid
	 */
	public void setAuthid(long authid) {
		this.authid.setValue(authid);
	}
	/**
	 * Gets the reference for attribute trnid.
	 * @return the trnid attribute reference
	 */
	public ElementaryRangeReference getTrnidReference() {
		return trnid.getReference();
	}

	/**
	 * Getter for trnid attribute.
	 * @return trnid attribute
	 */
	public long getTrnid() {
		return trnid.getValue();
	}

	/**
	 * Setter for trnid attribute.
	 * @param trnid the new value of trnid
	 */
	public void setTrnid(long trnid) {
		this.trnid.setValue(trnid);
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
	 * Gets the reference for attribute rspreason.
	 * @return the rspreason attribute reference
	 */
	public ElementaryRangeReference getRspreasonReference() {
		return rspreason.getReference();
	}

	/**
	 * Getter for rspreason attribute.
	 * @return rspreason attribute
	 */
	public String getRspreason() {
		return rspreason.getValue();
	}

	/**
	 * Setter for rspreason attribute.
	 * @param rspreason the new value of rspreason
	 */
	public void setRspreason(String rspreason) {
		this.rspreason.setValue(rspreason);
	}
	/**
	 * Gets the reference for attribute fraudflag.
	 * @return the fraudflag attribute reference
	 */
	public ElementaryRangeReference getFraudflagReference() {
		return fraudflag.getReference();
	}

	/**
	 * Getter for fraudflag attribute.
	 * @return fraudflag attribute
	 */
	public String getFraudflag() {
		return fraudflag.getValue();
	}

	/**
	 * Setter for fraudflag attribute.
	 * @param fraudflag the new value of fraudflag
	 */
	public void setFraudflag(String fraudflag) {
		this.fraudflag.setValue(fraudflag);
	}
	/**
	 * Gets the reference for attribute authdate.
	 * @return the authdate attribute reference
	 */
	public ElementaryRangeReference getAuthdateReference() {
		return authdate.getReference();
	}

	/**
	 * Getter for authdate attribute.
	 * @return authdate attribute
	 */
	public String getAuthdate() {
		return authdate.getValue();
	}

	/**
	 * Setter for authdate attribute.
	 * @param authdate the new value of authdate
	 */
	public void setAuthdate(String authdate) {
		this.authdate.setValue(authdate);
	}
	/**
	 * Gets the reference for attribute authtime.
	 * @return the authtime attribute reference
	 */
	public ElementaryRangeReference getAuthtimeReference() {
		return authtime.getReference();
	}

	/**
	 * Getter for authtime attribute.
	 * @return authtime attribute
	 */
	public String getAuthtime() {
		return authtime.getValue();
	}

	/**
	 * Setter for authtime attribute.
	 * @param authtime the new value of authtime
	 */
	public void setAuthtime(String authtime) {
		this.authtime.setValue(authtime);
	}
}
