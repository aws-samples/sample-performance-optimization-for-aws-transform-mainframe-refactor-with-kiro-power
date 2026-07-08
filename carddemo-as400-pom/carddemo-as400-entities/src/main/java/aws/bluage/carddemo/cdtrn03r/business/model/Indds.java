package aws.bluage.carddemo.cdtrn03r.business.model;

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
 * <p>About 'f12' field, <br>
 * </p>
 * 
 * <p>About 'commandkey' field, <br>
 * </p>
 * 
 * <p>About 'dfltval' field, <br>
 * </p>
 * 
 * <p>About 'addmode' field, <br>
 * </p>
 * 
 * <p>About 'traniderr' field, <br>
 * </p>
 * 
 * <p>About 'cardnumerr' field, <br>
 * </p>
 * 
 * <p>About 'amounterr' field, <br>
 * </p>
 * 
 * <p>About 'categoryerr' field, <br>
 * </p>
 * 
 * <p>About 'desserr' field, <br>
 * </p>
 * 
 * <p>About 'merchiderr' field, <br>
 * </p>
 * 
 * <p>About 'origdterr' field, <br>
 * </p>
 * 
 * <p>About 'procdterr' field, <br>
 * </p>
 * 
 * <p>About 'confirmind' field, <br>
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
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(8));
	private final Elementary f12 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(37));
	private final Elementary commandkey = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(14));
	private final Elementary dfltval = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(14));
	private final Elementary addmode = new Elementary(root,new AlphanumericType(1));
	private final Elementary traniderr = new Elementary(root,new AlphanumericType(1));
	private final Elementary cardnumerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary amounterr = new Elementary(root,new AlphanumericType(1));
	private final Elementary categoryerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary desserr = new Elementary(root,new AlphanumericType(1));
	private final Elementary merchiderr = new Elementary(root,new AlphanumericType(1));
	private final Elementary origdterr = new Elementary(root,new AlphanumericType(1));
	private final Elementary procdterr = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(6));
	private final Elementary confirmind = new Elementary(root,new AlphanumericType(1));
	
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
	 * Gets the reference for attribute dfltval.
	 * @return the dfltval attribute reference
	 */
	public ElementaryRangeReference getDfltvalReference() {
		return dfltval.getReference();
	}

	/**
	 * Getter for dfltval attribute.
	 * @return dfltval attribute
	 */
	public String getDfltval() {
		return dfltval.getValue();
	}

	/**
	 * Setter for dfltval attribute.
	 * @param dfltval the new value of dfltval
	 */
	public void setDfltval(String dfltval) {
		this.dfltval.setValue(dfltval);
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
	 * Gets the reference for attribute traniderr.
	 * @return the traniderr attribute reference
	 */
	public ElementaryRangeReference getTraniderrReference() {
		return traniderr.getReference();
	}

	/**
	 * Getter for traniderr attribute.
	 * @return traniderr attribute
	 */
	public String getTraniderr() {
		return traniderr.getValue();
	}

	/**
	 * Setter for traniderr attribute.
	 * @param traniderr the new value of traniderr
	 */
	public void setTraniderr(String traniderr) {
		this.traniderr.setValue(traniderr);
	}
	/**
	 * Gets the reference for attribute cardnumerr.
	 * @return the cardnumerr attribute reference
	 */
	public ElementaryRangeReference getCardnumerrReference() {
		return cardnumerr.getReference();
	}

	/**
	 * Getter for cardnumerr attribute.
	 * @return cardnumerr attribute
	 */
	public String getCardnumerr() {
		return cardnumerr.getValue();
	}

	/**
	 * Setter for cardnumerr attribute.
	 * @param cardnumerr the new value of cardnumerr
	 */
	public void setCardnumerr(String cardnumerr) {
		this.cardnumerr.setValue(cardnumerr);
	}
	/**
	 * Gets the reference for attribute amounterr.
	 * @return the amounterr attribute reference
	 */
	public ElementaryRangeReference getAmounterrReference() {
		return amounterr.getReference();
	}

	/**
	 * Getter for amounterr attribute.
	 * @return amounterr attribute
	 */
	public String getAmounterr() {
		return amounterr.getValue();
	}

	/**
	 * Setter for amounterr attribute.
	 * @param amounterr the new value of amounterr
	 */
	public void setAmounterr(String amounterr) {
		this.amounterr.setValue(amounterr);
	}
	/**
	 * Gets the reference for attribute categoryerr.
	 * @return the categoryerr attribute reference
	 */
	public ElementaryRangeReference getCategoryerrReference() {
		return categoryerr.getReference();
	}

	/**
	 * Getter for categoryerr attribute.
	 * @return categoryerr attribute
	 */
	public String getCategoryerr() {
		return categoryerr.getValue();
	}

	/**
	 * Setter for categoryerr attribute.
	 * @param categoryerr the new value of categoryerr
	 */
	public void setCategoryerr(String categoryerr) {
		this.categoryerr.setValue(categoryerr);
	}
	/**
	 * Gets the reference for attribute desserr.
	 * @return the desserr attribute reference
	 */
	public ElementaryRangeReference getDesserrReference() {
		return desserr.getReference();
	}

	/**
	 * Getter for desserr attribute.
	 * @return desserr attribute
	 */
	public String getDesserr() {
		return desserr.getValue();
	}

	/**
	 * Setter for desserr attribute.
	 * @param desserr the new value of desserr
	 */
	public void setDesserr(String desserr) {
		this.desserr.setValue(desserr);
	}
	/**
	 * Gets the reference for attribute merchiderr.
	 * @return the merchiderr attribute reference
	 */
	public ElementaryRangeReference getMerchiderrReference() {
		return merchiderr.getReference();
	}

	/**
	 * Getter for merchiderr attribute.
	 * @return merchiderr attribute
	 */
	public String getMerchiderr() {
		return merchiderr.getValue();
	}

	/**
	 * Setter for merchiderr attribute.
	 * @param merchiderr the new value of merchiderr
	 */
	public void setMerchiderr(String merchiderr) {
		this.merchiderr.setValue(merchiderr);
	}
	/**
	 * Gets the reference for attribute origdterr.
	 * @return the origdterr attribute reference
	 */
	public ElementaryRangeReference getOrigdterrReference() {
		return origdterr.getReference();
	}

	/**
	 * Getter for origdterr attribute.
	 * @return origdterr attribute
	 */
	public String getOrigdterr() {
		return origdterr.getValue();
	}

	/**
	 * Setter for origdterr attribute.
	 * @param origdterr the new value of origdterr
	 */
	public void setOrigdterr(String origdterr) {
		this.origdterr.setValue(origdterr);
	}
	/**
	 * Gets the reference for attribute procdterr.
	 * @return the procdterr attribute reference
	 */
	public ElementaryRangeReference getProcdterrReference() {
		return procdterr.getReference();
	}

	/**
	 * Getter for procdterr attribute.
	 * @return procdterr attribute
	 */
	public String getProcdterr() {
		return procdterr.getValue();
	}

	/**
	 * Setter for procdterr attribute.
	 * @param procdterr the new value of procdterr
	 */
	public void setProcdterr(String procdterr) {
		this.procdterr.setValue(procdterr);
	}
	/**
	 * Gets the reference for attribute confirmind.
	 * @return the confirmind attribute reference
	 */
	public ElementaryRangeReference getConfirmindReference() {
		return confirmind.getReference();
	}

	/**
	 * Getter for confirmind attribute.
	 * @return confirmind attribute
	 */
	public String getConfirmind() {
		return confirmind.getValue();
	}

	/**
	 * Setter for confirmind attribute.
	 * @param confirmind the new value of confirmind
	 */
	public void setConfirmind(String confirmind) {
		this.confirmind.setValue(confirmind);
	}
}
