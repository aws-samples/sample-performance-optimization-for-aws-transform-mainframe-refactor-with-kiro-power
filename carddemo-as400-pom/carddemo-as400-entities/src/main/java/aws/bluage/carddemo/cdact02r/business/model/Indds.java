package aws.bluage.carddemo.cdact02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Indds.
 * 
 * <p>About 'f2' field, <br>
 * </p>
 * 
 * <p>About 'f3' field, <br>
 * </p>
 * 
 * <p>About 'f4' field, <br>
 * </p>
 * 
 * <p>About 'f12' field, <br>
 * </p>
 * 
 * <p>About 'commandkey' field, <br>
 * </p>
 * 
 * <p>About 'pricustposito' field, <br>
 * </p>
 * 
 * <p>About 'seccustposito' field, <br>
 * </p>
 * 
 * <p>About 'addmode' field, <br>
 * </p>
 * 
 * <p>About 'highlightsts' field, <br>
 * </p>
 * 
 * <p>About 'seccustview' field, <br>
 * </p>
 * 
 * <p>About 'viewonly' field, <br>
 * </p>
 * 
 * <p>About 'acctnumerr' field, <br>
 * </p>
 * 
 * <p>About 'acctgrperr' field, <br>
 * </p>
 * 
 * <p>About 'credlimiterr' field, <br>
 * </p>
 * 
 * <p>About 'cashlimiterr' field, <br>
 * </p>
 * 
 * <p>About 'pricusterr' field, <br>
 * </p>
 * 
 * <p>About 'seccusterr' field, <br>
 * </p>
 * 
 * <p>About 'expdateerr' field, <br>
 * </p>
 * 
 * <p>About 'expirydateerr' field, <br>
 * </p>
 * 
 * <p>About 'alwayson' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indds extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(1));
	private final Elementary f2 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f3 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f4 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(7));
	private final Elementary f12 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(37));
	private final Elementary commandkey = new Elementary(root,new AlphanumericType(1));
	private final Elementary pricustposito = new Elementary(root,new AlphanumericType(1));
	private final Elementary seccustposito = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(17));
	private final Elementary addmode = new Elementary(root,new AlphanumericType(1));
	private final Elementary highlightsts = new Elementary(root,new AlphanumericType(1));
	private final Elementary seccustview = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(7));
	private final Elementary viewonly = new Elementary(root,new AlphanumericType(1));
	private final Elementary acctnumerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary acctgrperr = new Elementary(root,new AlphanumericType(1));
	private final Elementary credlimiterr = new Elementary(root,new AlphanumericType(1));
	private final Elementary cashlimiterr = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(3));
	private final Elementary pricusterr = new Elementary(root,new AlphanumericType(1));
	private final Elementary seccusterr = new Elementary(root,new AlphanumericType(1));
	private final Elementary expdateerr = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(root,new AlphanumericType(1));
	private final Elementary expirydateerr = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(root,new AlphanumericType(6));
	private final Elementary alwayson = new Elementary(root,new AlphanumericType(1),"1");
	
	/**
	 * Instantiate a new Indds with a default record.
	 * @param configuration the configuration
	 */
	public Indds(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indds bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indds(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute f2.
	 * @return the f2 attribute reference
	 */
	public ElementaryRangeReference getF2Reference() {
		return f2.getReference();
	}

	/**
	 * Getter for f2 attribute.
	 * @return f2 attribute
	 */
	public String getF2() {
		return f2.getValue();
	}

	/**
	 * Setter for f2 attribute.
	 * @param f2 the new value of f2
	 */
	public void setF2(String f2) {
		this.f2.setValue(f2);
	}
	/**
	 * Gets the reference for attribute f3.
	 * @return the f3 attribute reference
	 */
	public ElementaryRangeReference getF3Reference() {
		return f3.getReference();
	}

	/**
	 * Getter for f3 attribute.
	 * @return f3 attribute
	 */
	public String getF3() {
		return f3.getValue();
	}

	/**
	 * Setter for f3 attribute.
	 * @param f3 the new value of f3
	 */
	public void setF3(String f3) {
		this.f3.setValue(f3);
	}
	/**
	 * Gets the reference for attribute f4.
	 * @return the f4 attribute reference
	 */
	public ElementaryRangeReference getF4Reference() {
		return f4.getReference();
	}

	/**
	 * Getter for f4 attribute.
	 * @return f4 attribute
	 */
	public String getF4() {
		return f4.getValue();
	}

	/**
	 * Setter for f4 attribute.
	 * @param f4 the new value of f4
	 */
	public void setF4(String f4) {
		this.f4.setValue(f4);
	}
	/**
	 * Gets the reference for attribute f12.
	 * @return the f12 attribute reference
	 */
	public ElementaryRangeReference getF12Reference() {
		return f12.getReference();
	}

	/**
	 * Getter for f12 attribute.
	 * @return f12 attribute
	 */
	public String getF12() {
		return f12.getValue();
	}

	/**
	 * Setter for f12 attribute.
	 * @param f12 the new value of f12
	 */
	public void setF12(String f12) {
		this.f12.setValue(f12);
	}
	/**
	 * Gets the reference for attribute commandkey.
	 * @return the commandkey attribute reference
	 */
	public ElementaryRangeReference getCommandkeyReference() {
		return commandkey.getReference();
	}

	/**
	 * Getter for commandkey attribute.
	 * @return commandkey attribute
	 */
	public String getCommandkey() {
		return commandkey.getValue();
	}

	/**
	 * Setter for commandkey attribute.
	 * @param commandkey the new value of commandkey
	 */
	public void setCommandkey(String commandkey) {
		this.commandkey.setValue(commandkey);
	}
	/**
	 * Gets the reference for attribute pricustposito.
	 * @return the pricustposito attribute reference
	 */
	public ElementaryRangeReference getPricustpositoReference() {
		return pricustposito.getReference();
	}

	/**
	 * Getter for pricustposito attribute.
	 * @return pricustposito attribute
	 */
	public String getPricustposito() {
		return pricustposito.getValue();
	}

	/**
	 * Setter for pricustposito attribute.
	 * @param pricustposito the new value of pricustposito
	 */
	public void setPricustposito(String pricustposito) {
		this.pricustposito.setValue(pricustposito);
	}
	/**
	 * Gets the reference for attribute seccustposito.
	 * @return the seccustposito attribute reference
	 */
	public ElementaryRangeReference getSeccustpositoReference() {
		return seccustposito.getReference();
	}

	/**
	 * Getter for seccustposito attribute.
	 * @return seccustposito attribute
	 */
	public String getSeccustposito() {
		return seccustposito.getValue();
	}

	/**
	 * Setter for seccustposito attribute.
	 * @param seccustposito the new value of seccustposito
	 */
	public void setSeccustposito(String seccustposito) {
		this.seccustposito.setValue(seccustposito);
	}
	/**
	 * Gets the reference for attribute addmode.
	 * @return the addmode attribute reference
	 */
	public ElementaryRangeReference getAddmodeReference() {
		return addmode.getReference();
	}

	/**
	 * Getter for addmode attribute.
	 * @return addmode attribute
	 */
	public String getAddmode() {
		return addmode.getValue();
	}

	/**
	 * Setter for addmode attribute.
	 * @param addmode the new value of addmode
	 */
	public void setAddmode(String addmode) {
		this.addmode.setValue(addmode);
	}
	/**
	 * Gets the reference for attribute highlightsts.
	 * @return the highlightsts attribute reference
	 */
	public ElementaryRangeReference getHighlightstsReference() {
		return highlightsts.getReference();
	}

	/**
	 * Getter for highlightsts attribute.
	 * @return highlightsts attribute
	 */
	public String getHighlightsts() {
		return highlightsts.getValue();
	}

	/**
	 * Setter for highlightsts attribute.
	 * @param highlightsts the new value of highlightsts
	 */
	public void setHighlightsts(String highlightsts) {
		this.highlightsts.setValue(highlightsts);
	}
	/**
	 * Gets the reference for attribute seccustview.
	 * @return the seccustview attribute reference
	 */
	public ElementaryRangeReference getSeccustviewReference() {
		return seccustview.getReference();
	}

	/**
	 * Getter for seccustview attribute.
	 * @return seccustview attribute
	 */
	public String getSeccustview() {
		return seccustview.getValue();
	}

	/**
	 * Setter for seccustview attribute.
	 * @param seccustview the new value of seccustview
	 */
	public void setSeccustview(String seccustview) {
		this.seccustview.setValue(seccustview);
	}
	/**
	 * Gets the reference for attribute viewonly.
	 * @return the viewonly attribute reference
	 */
	public ElementaryRangeReference getViewonlyReference() {
		return viewonly.getReference();
	}

	/**
	 * Getter for viewonly attribute.
	 * @return viewonly attribute
	 */
	public String getViewonly() {
		return viewonly.getValue();
	}

	/**
	 * Setter for viewonly attribute.
	 * @param viewonly the new value of viewonly
	 */
	public void setViewonly(String viewonly) {
		this.viewonly.setValue(viewonly);
	}
	/**
	 * Gets the reference for attribute acctnumerr.
	 * @return the acctnumerr attribute reference
	 */
	public ElementaryRangeReference getAcctnumerrReference() {
		return acctnumerr.getReference();
	}

	/**
	 * Getter for acctnumerr attribute.
	 * @return acctnumerr attribute
	 */
	public String getAcctnumerr() {
		return acctnumerr.getValue();
	}

	/**
	 * Setter for acctnumerr attribute.
	 * @param acctnumerr the new value of acctnumerr
	 */
	public void setAcctnumerr(String acctnumerr) {
		this.acctnumerr.setValue(acctnumerr);
	}
	/**
	 * Gets the reference for attribute acctgrperr.
	 * @return the acctgrperr attribute reference
	 */
	public ElementaryRangeReference getAcctgrperrReference() {
		return acctgrperr.getReference();
	}

	/**
	 * Getter for acctgrperr attribute.
	 * @return acctgrperr attribute
	 */
	public String getAcctgrperr() {
		return acctgrperr.getValue();
	}

	/**
	 * Setter for acctgrperr attribute.
	 * @param acctgrperr the new value of acctgrperr
	 */
	public void setAcctgrperr(String acctgrperr) {
		this.acctgrperr.setValue(acctgrperr);
	}
	/**
	 * Gets the reference for attribute credlimiterr.
	 * @return the credlimiterr attribute reference
	 */
	public ElementaryRangeReference getCredlimiterrReference() {
		return credlimiterr.getReference();
	}

	/**
	 * Getter for credlimiterr attribute.
	 * @return credlimiterr attribute
	 */
	public String getCredlimiterr() {
		return credlimiterr.getValue();
	}

	/**
	 * Setter for credlimiterr attribute.
	 * @param credlimiterr the new value of credlimiterr
	 */
	public void setCredlimiterr(String credlimiterr) {
		this.credlimiterr.setValue(credlimiterr);
	}
	/**
	 * Gets the reference for attribute cashlimiterr.
	 * @return the cashlimiterr attribute reference
	 */
	public ElementaryRangeReference getCashlimiterrReference() {
		return cashlimiterr.getReference();
	}

	/**
	 * Getter for cashlimiterr attribute.
	 * @return cashlimiterr attribute
	 */
	public String getCashlimiterr() {
		return cashlimiterr.getValue();
	}

	/**
	 * Setter for cashlimiterr attribute.
	 * @param cashlimiterr the new value of cashlimiterr
	 */
	public void setCashlimiterr(String cashlimiterr) {
		this.cashlimiterr.setValue(cashlimiterr);
	}
	/**
	 * Gets the reference for attribute pricusterr.
	 * @return the pricusterr attribute reference
	 */
	public ElementaryRangeReference getPricusterrReference() {
		return pricusterr.getReference();
	}

	/**
	 * Getter for pricusterr attribute.
	 * @return pricusterr attribute
	 */
	public String getPricusterr() {
		return pricusterr.getValue();
	}

	/**
	 * Setter for pricusterr attribute.
	 * @param pricusterr the new value of pricusterr
	 */
	public void setPricusterr(String pricusterr) {
		this.pricusterr.setValue(pricusterr);
	}
	/**
	 * Gets the reference for attribute seccusterr.
	 * @return the seccusterr attribute reference
	 */
	public ElementaryRangeReference getSeccusterrReference() {
		return seccusterr.getReference();
	}

	/**
	 * Getter for seccusterr attribute.
	 * @return seccusterr attribute
	 */
	public String getSeccusterr() {
		return seccusterr.getValue();
	}

	/**
	 * Setter for seccusterr attribute.
	 * @param seccusterr the new value of seccusterr
	 */
	public void setSeccusterr(String seccusterr) {
		this.seccusterr.setValue(seccusterr);
	}
	/**
	 * Gets the reference for attribute expdateerr.
	 * @return the expdateerr attribute reference
	 */
	public ElementaryRangeReference getExpdateerrReference() {
		return expdateerr.getReference();
	}

	/**
	 * Getter for expdateerr attribute.
	 * @return expdateerr attribute
	 */
	public String getExpdateerr() {
		return expdateerr.getValue();
	}

	/**
	 * Setter for expdateerr attribute.
	 * @param expdateerr the new value of expdateerr
	 */
	public void setExpdateerr(String expdateerr) {
		this.expdateerr.setValue(expdateerr);
	}
	/**
	 * Gets the reference for attribute expirydateerr.
	 * @return the expirydateerr attribute reference
	 */
	public ElementaryRangeReference getExpirydateerrReference() {
		return expirydateerr.getReference();
	}

	/**
	 * Getter for expirydateerr attribute.
	 * @return expirydateerr attribute
	 */
	public String getExpirydateerr() {
		return expirydateerr.getValue();
	}

	/**
	 * Setter for expirydateerr attribute.
	 * @param expirydateerr the new value of expirydateerr
	 */
	public void setExpirydateerr(String expirydateerr) {
		this.expirydateerr.setValue(expirydateerr);
	}
	/**
	 * Gets the reference for attribute alwayson.
	 * @return the alwayson attribute reference
	 */
	public ElementaryRangeReference getAlwaysonReference() {
		return alwayson.getReference();
	}

	/**
	 * Getter for alwayson attribute.
	 * @return alwayson attribute
	 */
	public String getAlwayson() {
		return alwayson.getValue();
	}

	/**
	 * Setter for alwayson attribute.
	 * @param alwayson the new value of alwayson
	 */
	public void setAlwayson(String alwayson) {
		this.alwayson.setValue(alwayson);
	}
}
