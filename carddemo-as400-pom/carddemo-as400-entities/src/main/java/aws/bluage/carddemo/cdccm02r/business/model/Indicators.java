package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Indicators.
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
 * <p>About 'f9' field, <br>
 * </p>
 * 
 * <p>About 'f12' field, <br>
 * </p>
 * 
 * <p>About 'commandkey' field, <br>
 * </p>
 * 
 * <p>About 'saveprotect' field, <br>
 * </p>
 * 
 * <p>About 'addmode' field, <br>
 * </p>
 * 
 * <p>About 'viewonly' field, <br>
 * </p>
 * 
 * <p>About 'custiderr' field, <br>
 * </p>
 * 
 * <p>About 'accterr' field, <br>
 * </p>
 * 
 * <p>About 'nameerr' field, <br>
 * </p>
 * 
 * <p>About 'hidechgtm' field, <br>
 * </p>
 * 
 * <p>About 'alwayson' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indicators extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(1));
	private final Elementary f2 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f3 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f4 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(4));
	private final Elementary f9 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(2));
	private final Elementary f12 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(37));
	private final Elementary commandkey = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(10));
	private final Elementary saveprotect = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(8));
	private final Elementary addmode = new Elementary(root,new AlphanumericType(1));
	private final Elementary viewonly = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(root,new AlphanumericType(5));
	private final Elementary custiderr = new Elementary(root,new AlphanumericType(1));
	private final Elementary accterr = new Elementary(root,new AlphanumericType(1));
	private final Elementary nameerr = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(root,new AlphanumericType(10));
	private final Elementary hidechgtm = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(root,new AlphanumericType(8));
	private final Elementary alwayson = new Elementary(root,new AlphanumericType(1),"1");
	
	/**
	 * Instantiate a new Indicators with a default record.
	 * @param configuration the configuration
	 */
	public Indicators(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indicators bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indicators(Configuration configuration, RecordAdaptable record) {
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
	 * Gets the reference for attribute f9.
	 * @return the f9 attribute reference
	 */
	public ElementaryRangeReference getF9Reference() {
		return f9.getReference();
	}

	/**
	 * Getter for f9 attribute.
	 * @return f9 attribute
	 */
	public String getF9() {
		return f9.getValue();
	}

	/**
	 * Setter for f9 attribute.
	 * @param f9 the new value of f9
	 */
	public void setF9(String f9) {
		this.f9.setValue(f9);
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
	 * Gets the reference for attribute saveprotect.
	 * @return the saveprotect attribute reference
	 */
	public ElementaryRangeReference getSaveprotectReference() {
		return saveprotect.getReference();
	}

	/**
	 * Getter for saveprotect attribute.
	 * @return saveprotect attribute
	 */
	public String getSaveprotect() {
		return saveprotect.getValue();
	}

	/**
	 * Setter for saveprotect attribute.
	 * @param saveprotect the new value of saveprotect
	 */
	public void setSaveprotect(String saveprotect) {
		this.saveprotect.setValue(saveprotect);
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
	 * Gets the reference for attribute custiderr.
	 * @return the custiderr attribute reference
	 */
	public ElementaryRangeReference getCustiderrReference() {
		return custiderr.getReference();
	}

	/**
	 * Getter for custiderr attribute.
	 * @return custiderr attribute
	 */
	public String getCustiderr() {
		return custiderr.getValue();
	}

	/**
	 * Setter for custiderr attribute.
	 * @param custiderr the new value of custiderr
	 */
	public void setCustiderr(String custiderr) {
		this.custiderr.setValue(custiderr);
	}
	/**
	 * Gets the reference for attribute accterr.
	 * @return the accterr attribute reference
	 */
	public ElementaryRangeReference getAccterrReference() {
		return accterr.getReference();
	}

	/**
	 * Getter for accterr attribute.
	 * @return accterr attribute
	 */
	public String getAccterr() {
		return accterr.getValue();
	}

	/**
	 * Setter for accterr attribute.
	 * @param accterr the new value of accterr
	 */
	public void setAccterr(String accterr) {
		this.accterr.setValue(accterr);
	}
	/**
	 * Gets the reference for attribute nameerr.
	 * @return the nameerr attribute reference
	 */
	public ElementaryRangeReference getNameerrReference() {
		return nameerr.getReference();
	}

	/**
	 * Getter for nameerr attribute.
	 * @return nameerr attribute
	 */
	public String getNameerr() {
		return nameerr.getValue();
	}

	/**
	 * Setter for nameerr attribute.
	 * @param nameerr the new value of nameerr
	 */
	public void setNameerr(String nameerr) {
		this.nameerr.setValue(nameerr);
	}
	/**
	 * Gets the reference for attribute hidechgtm.
	 * @return the hidechgtm attribute reference
	 */
	public ElementaryRangeReference getHidechgtmReference() {
		return hidechgtm.getReference();
	}

	/**
	 * Getter for hidechgtm attribute.
	 * @return hidechgtm attribute
	 */
	public String getHidechgtm() {
		return hidechgtm.getValue();
	}

	/**
	 * Setter for hidechgtm attribute.
	 * @param hidechgtm the new value of hidechgtm
	 */
	public void setHidechgtm(String hidechgtm) {
		this.hidechgtm.setValue(hidechgtm);
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
