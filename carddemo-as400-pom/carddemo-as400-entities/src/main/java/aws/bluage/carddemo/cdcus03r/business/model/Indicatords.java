package aws.bluage.carddemo.cdcus03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Indicatords.
 * 
 * <p>About 'iexit' field, <br>
 * </p>
 * 
 * <p>About 'irefresh' field, <br>
 * </p>
 * 
 * <p>About 'iprevious' field, <br>
 * </p>
 * 
 * <p>About 'isfldsp' field, <br>
 * </p>
 * 
 * <p>About 'isfldspctl' field, <br>
 * </p>
 * 
 * <p>About 'isflclr' field, <br>
 * </p>
 * 
 * <p>About 'isflend' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indicatords extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(2));
	private final Elementary iexit = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(1));
	private final Elementary irefresh = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(6));
	private final Elementary iprevious = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(17));
	private final Elementary isfldsp = new Elementary(root,new AlphanumericType(1));
	private final Elementary isfldspctl = new Elementary(root,new AlphanumericType(1));
	private final Elementary isflclr = new Elementary(root,new AlphanumericType(1));
	private final Elementary isflend = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Instantiate a new Indicatords with a default record.
	 * @param configuration the configuration
	 */
	public Indicatords(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indicatords bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indicatords(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute iexit.
	 * @return the iexit attribute reference
	 */
	public ElementaryRangeReference getIexitReference() {
		return iexit.getReference();
	}

	/**
	 * Getter for iexit attribute.
	 * @return iexit attribute
	 */
	public String getIexit() {
		return iexit.getValue();
	}

	/**
	 * Setter for iexit attribute.
	 * @param iexit the new value of iexit
	 */
	public void setIexit(String iexit) {
		this.iexit.setValue(iexit);
	}
	/**
	 * Gets the reference for attribute irefresh.
	 * @return the irefresh attribute reference
	 */
	public ElementaryRangeReference getIrefreshReference() {
		return irefresh.getReference();
	}

	/**
	 * Getter for irefresh attribute.
	 * @return irefresh attribute
	 */
	public String getIrefresh() {
		return irefresh.getValue();
	}

	/**
	 * Setter for irefresh attribute.
	 * @param irefresh the new value of irefresh
	 */
	public void setIrefresh(String irefresh) {
		this.irefresh.setValue(irefresh);
	}
	/**
	 * Gets the reference for attribute iprevious.
	 * @return the iprevious attribute reference
	 */
	public ElementaryRangeReference getIpreviousReference() {
		return iprevious.getReference();
	}

	/**
	 * Getter for iprevious attribute.
	 * @return iprevious attribute
	 */
	public String getIprevious() {
		return iprevious.getValue();
	}

	/**
	 * Setter for iprevious attribute.
	 * @param iprevious the new value of iprevious
	 */
	public void setIprevious(String iprevious) {
		this.iprevious.setValue(iprevious);
	}
	/**
	 * Gets the reference for attribute isfldsp.
	 * @return the isfldsp attribute reference
	 */
	public ElementaryRangeReference getIsfldspReference() {
		return isfldsp.getReference();
	}

	/**
	 * Getter for isfldsp attribute.
	 * @return isfldsp attribute
	 */
	public String getIsfldsp() {
		return isfldsp.getValue();
	}

	/**
	 * Setter for isfldsp attribute.
	 * @param isfldsp the new value of isfldsp
	 */
	public void setIsfldsp(String isfldsp) {
		this.isfldsp.setValue(isfldsp);
	}
	/**
	 * Gets the reference for attribute isfldspctl.
	 * @return the isfldspctl attribute reference
	 */
	public ElementaryRangeReference getIsfldspctlReference() {
		return isfldspctl.getReference();
	}

	/**
	 * Getter for isfldspctl attribute.
	 * @return isfldspctl attribute
	 */
	public String getIsfldspctl() {
		return isfldspctl.getValue();
	}

	/**
	 * Setter for isfldspctl attribute.
	 * @param isfldspctl the new value of isfldspctl
	 */
	public void setIsfldspctl(String isfldspctl) {
		this.isfldspctl.setValue(isfldspctl);
	}
	/**
	 * Gets the reference for attribute isflclr.
	 * @return the isflclr attribute reference
	 */
	public ElementaryRangeReference getIsflclrReference() {
		return isflclr.getReference();
	}

	/**
	 * Getter for isflclr attribute.
	 * @return isflclr attribute
	 */
	public String getIsflclr() {
		return isflclr.getValue();
	}

	/**
	 * Setter for isflclr attribute.
	 * @param isflclr the new value of isflclr
	 */
	public void setIsflclr(String isflclr) {
		this.isflclr.setValue(isflclr);
	}
	/**
	 * Gets the reference for attribute isflend.
	 * @return the isflend attribute reference
	 */
	public ElementaryRangeReference getIsflendReference() {
		return isflend.getReference();
	}

	/**
	 * Getter for isflend attribute.
	 * @return isflend attribute
	 */
	public String getIsflend() {
		return isflend.getValue();
	}

	/**
	 * Setter for isflend attribute.
	 * @param isflend the new value of isflend
	 */
	public void setIsflend(String isflend) {
		this.isflend.setValue(isflend);
	}
}
