package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Dsshindds.
 * 
 * <p>About 'iexit' field, <br>
 * </p>
 * 
 * <p>About 'irefresh' field, <br>
 * </p>
 * 
 * <p>About 'iadd' field, <br>
 * </p>
 * 
 * <p>About 'icancel' field, <br>
 * </p>
 * 
 * <p>About 'ipageup' field, <br>
 * </p>
 * 
 * <p>About 'ipagedown' field, <br>
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
 * <p>About 'isflnxtchg' field, <br>
 * </p>
 * 
 * <p>About 'isflopterr' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dsshindds extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(2));
	private final Elementary iexit = new Elementary(root,new AlphanumericType(1),"0");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(1));
	private final Elementary irefresh = new Elementary(root,new AlphanumericType(1),"0");
	private final Elementary iadd = new Elementary(root,new AlphanumericType(1),"0");
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(5));
	private final Elementary icancel = new Elementary(root,new AlphanumericType(1),"0");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(12));
	private final Elementary ipageup = new Elementary(root,new AlphanumericType(1),"0");
	private final Elementary ipagedown = new Elementary(root,new AlphanumericType(1),"0");
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(13));
	private final Elementary isfldsp = new Elementary(root,new AlphanumericType(1),"0");
	private final Elementary isfldspctl = new Elementary(root,new AlphanumericType(1),"0");
	private final Elementary isflclr = new Elementary(root,new AlphanumericType(1),"0");
	private final Elementary isflend = new Elementary(root,new AlphanumericType(1),"0");
	private final Elementary isflnxtchg = new Elementary(root,new AlphanumericType(1),"0");
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(5));
	private final Elementary isflopterr = new Elementary(root,new AlphanumericType(1),"0");
	
	/**
	 * Instantiate a new Dsshindds with a default record.
	 * @param configuration the configuration
	 */
	public Dsshindds(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Dsshindds bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dsshindds(Configuration configuration, RecordAdaptable record) {
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
	 * Gets the reference for attribute iadd.
	 * @return the iadd attribute reference
	 */
	public ElementaryRangeReference getIaddReference() {
		return iadd.getReference();
	}

	/**
	 * Getter for iadd attribute.
	 * @return iadd attribute
	 */
	public String getIadd() {
		return iadd.getValue();
	}

	/**
	 * Setter for iadd attribute.
	 * @param iadd the new value of iadd
	 */
	public void setIadd(String iadd) {
		this.iadd.setValue(iadd);
	}
	/**
	 * Gets the reference for attribute icancel.
	 * @return the icancel attribute reference
	 */
	public ElementaryRangeReference getIcancelReference() {
		return icancel.getReference();
	}

	/**
	 * Getter for icancel attribute.
	 * @return icancel attribute
	 */
	public String getIcancel() {
		return icancel.getValue();
	}

	/**
	 * Setter for icancel attribute.
	 * @param icancel the new value of icancel
	 */
	public void setIcancel(String icancel) {
		this.icancel.setValue(icancel);
	}
	/**
	 * Gets the reference for attribute ipageup.
	 * @return the ipageup attribute reference
	 */
	public ElementaryRangeReference getIpageupReference() {
		return ipageup.getReference();
	}

	/**
	 * Getter for ipageup attribute.
	 * @return ipageup attribute
	 */
	public String getIpageup() {
		return ipageup.getValue();
	}

	/**
	 * Setter for ipageup attribute.
	 * @param ipageup the new value of ipageup
	 */
	public void setIpageup(String ipageup) {
		this.ipageup.setValue(ipageup);
	}
	/**
	 * Gets the reference for attribute ipagedown.
	 * @return the ipagedown attribute reference
	 */
	public ElementaryRangeReference getIpagedownReference() {
		return ipagedown.getReference();
	}

	/**
	 * Getter for ipagedown attribute.
	 * @return ipagedown attribute
	 */
	public String getIpagedown() {
		return ipagedown.getValue();
	}

	/**
	 * Setter for ipagedown attribute.
	 * @param ipagedown the new value of ipagedown
	 */
	public void setIpagedown(String ipagedown) {
		this.ipagedown.setValue(ipagedown);
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
	/**
	 * Gets the reference for attribute isflnxtchg.
	 * @return the isflnxtchg attribute reference
	 */
	public ElementaryRangeReference getIsflnxtchgReference() {
		return isflnxtchg.getReference();
	}

	/**
	 * Getter for isflnxtchg attribute.
	 * @return isflnxtchg attribute
	 */
	public String getIsflnxtchg() {
		return isflnxtchg.getValue();
	}

	/**
	 * Setter for isflnxtchg attribute.
	 * @param isflnxtchg the new value of isflnxtchg
	 */
	public void setIsflnxtchg(String isflnxtchg) {
		this.isflnxtchg.setValue(isflnxtchg);
	}
	/**
	 * Gets the reference for attribute isflopterr.
	 * @return the isflopterr attribute reference
	 */
	public ElementaryRangeReference getIsflopterrReference() {
		return isflopterr.getReference();
	}

	/**
	 * Getter for isflopterr attribute.
	 * @return isflopterr attribute
	 */
	public String getIsflopterr() {
		return isflopterr.getValue();
	}

	/**
	 * Setter for isflopterr attribute.
	 * @param isflopterr the new value of isflopterr
	 */
	public void setIsflopterr(String isflopterr) {
		this.isflopterr.setValue(isflopterr);
	}
}
