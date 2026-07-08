package aws.bluage.carddemo.cdcus02r.business.model;

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
 * <p>About 'addmode' field, <br>
 * </p>
 * 
 * <p>About 'viewonly' field, <br>
 * </p>
 * 
 * <p>About 'custiderr' field, <br>
 * </p>
 * 
 * <p>About 'ssnerr' field, <br>
 * </p>
 * 
 * <p>About 'birthdayerr' field, <br>
 * </p>
 * 
 * <p>About 'ficoscoreerr' field, <br>
 * </p>
 * 
 * <p>About 'firstnameerr' field, <br>
 * </p>
 * 
 * <p>About 'lastnameerr' field, <br>
 * </p>
 * 
 * <p>About 'addresserr' field, <br>
 * </p>
 * 
 * <p>About 'cityerr' field, <br>
 * </p>
 * 
 * <p>About 'stateerr' field, <br>
 * </p>
 * 
 * <p>About 'ziperr' field, <br>
 * </p>
 * 
 * <p>About 'countryerr' field, <br>
 * </p>
 * 
 * <p>About 'phone1err' field, <br>
 * </p>
 * 
 * <p>About 'phone2err' field, <br>
 * </p>
 * 
 * <p>About 'hidechgtm' field, <br>
 * </p>
 * 
 * <p>About 'gendererr' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indicators extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(2));
	private final Elementary f3 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f4 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(7));
	private final Elementary f12 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(37));
	private final Elementary commandkey = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(19));
	private final Elementary addmode = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(9));
	private final Elementary viewonly = new Elementary(root,new AlphanumericType(1));
	private final Elementary custiderr = new Elementary(root,new AlphanumericType(1));
	private final Elementary ssnerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary birthdayerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary ficoscoreerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary firstnameerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary lastnameerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary addresserr = new Elementary(root,new AlphanumericType(1));
	private final Elementary cityerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary stateerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary ziperr = new Elementary(root,new AlphanumericType(1));
	private final Elementary countryerr = new Elementary(root,new AlphanumericType(1));
	private final Elementary phone1err = new Elementary(root,new AlphanumericType(1));
	private final Elementary phone2err = new Elementary(root,new AlphanumericType(1));
	private final Elementary hidechgtm = new Elementary(root,new AlphanumericType(1));
	private final Elementary gendererr = new Elementary(root,new AlphanumericType(1));
	
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
	 * Gets the reference for attribute ssnerr.
	 * @return the ssnerr attribute reference
	 */
	public ElementaryRangeReference getSsnerrReference() {
		return ssnerr.getReference();
	}

	/**
	 * Getter for ssnerr attribute.
	 * @return ssnerr attribute
	 */
	public String getSsnerr() {
		return ssnerr.getValue();
	}

	/**
	 * Setter for ssnerr attribute.
	 * @param ssnerr the new value of ssnerr
	 */
	public void setSsnerr(String ssnerr) {
		this.ssnerr.setValue(ssnerr);
	}
	/**
	 * Gets the reference for attribute birthdayerr.
	 * @return the birthdayerr attribute reference
	 */
	public ElementaryRangeReference getBirthdayerrReference() {
		return birthdayerr.getReference();
	}

	/**
	 * Getter for birthdayerr attribute.
	 * @return birthdayerr attribute
	 */
	public String getBirthdayerr() {
		return birthdayerr.getValue();
	}

	/**
	 * Setter for birthdayerr attribute.
	 * @param birthdayerr the new value of birthdayerr
	 */
	public void setBirthdayerr(String birthdayerr) {
		this.birthdayerr.setValue(birthdayerr);
	}
	/**
	 * Gets the reference for attribute ficoscoreerr.
	 * @return the ficoscoreerr attribute reference
	 */
	public ElementaryRangeReference getFicoscoreerrReference() {
		return ficoscoreerr.getReference();
	}

	/**
	 * Getter for ficoscoreerr attribute.
	 * @return ficoscoreerr attribute
	 */
	public String getFicoscoreerr() {
		return ficoscoreerr.getValue();
	}

	/**
	 * Setter for ficoscoreerr attribute.
	 * @param ficoscoreerr the new value of ficoscoreerr
	 */
	public void setFicoscoreerr(String ficoscoreerr) {
		this.ficoscoreerr.setValue(ficoscoreerr);
	}
	/**
	 * Gets the reference for attribute firstnameerr.
	 * @return the firstnameerr attribute reference
	 */
	public ElementaryRangeReference getFirstnameerrReference() {
		return firstnameerr.getReference();
	}

	/**
	 * Getter for firstnameerr attribute.
	 * @return firstnameerr attribute
	 */
	public String getFirstnameerr() {
		return firstnameerr.getValue();
	}

	/**
	 * Setter for firstnameerr attribute.
	 * @param firstnameerr the new value of firstnameerr
	 */
	public void setFirstnameerr(String firstnameerr) {
		this.firstnameerr.setValue(firstnameerr);
	}
	/**
	 * Gets the reference for attribute lastnameerr.
	 * @return the lastnameerr attribute reference
	 */
	public ElementaryRangeReference getLastnameerrReference() {
		return lastnameerr.getReference();
	}

	/**
	 * Getter for lastnameerr attribute.
	 * @return lastnameerr attribute
	 */
	public String getLastnameerr() {
		return lastnameerr.getValue();
	}

	/**
	 * Setter for lastnameerr attribute.
	 * @param lastnameerr the new value of lastnameerr
	 */
	public void setLastnameerr(String lastnameerr) {
		this.lastnameerr.setValue(lastnameerr);
	}
	/**
	 * Gets the reference for attribute addresserr.
	 * @return the addresserr attribute reference
	 */
	public ElementaryRangeReference getAddresserrReference() {
		return addresserr.getReference();
	}

	/**
	 * Getter for addresserr attribute.
	 * @return addresserr attribute
	 */
	public String getAddresserr() {
		return addresserr.getValue();
	}

	/**
	 * Setter for addresserr attribute.
	 * @param addresserr the new value of addresserr
	 */
	public void setAddresserr(String addresserr) {
		this.addresserr.setValue(addresserr);
	}
	/**
	 * Gets the reference for attribute cityerr.
	 * @return the cityerr attribute reference
	 */
	public ElementaryRangeReference getCityerrReference() {
		return cityerr.getReference();
	}

	/**
	 * Getter for cityerr attribute.
	 * @return cityerr attribute
	 */
	public String getCityerr() {
		return cityerr.getValue();
	}

	/**
	 * Setter for cityerr attribute.
	 * @param cityerr the new value of cityerr
	 */
	public void setCityerr(String cityerr) {
		this.cityerr.setValue(cityerr);
	}
	/**
	 * Gets the reference for attribute stateerr.
	 * @return the stateerr attribute reference
	 */
	public ElementaryRangeReference getStateerrReference() {
		return stateerr.getReference();
	}

	/**
	 * Getter for stateerr attribute.
	 * @return stateerr attribute
	 */
	public String getStateerr() {
		return stateerr.getValue();
	}

	/**
	 * Setter for stateerr attribute.
	 * @param stateerr the new value of stateerr
	 */
	public void setStateerr(String stateerr) {
		this.stateerr.setValue(stateerr);
	}
	/**
	 * Gets the reference for attribute ziperr.
	 * @return the ziperr attribute reference
	 */
	public ElementaryRangeReference getZiperrReference() {
		return ziperr.getReference();
	}

	/**
	 * Getter for ziperr attribute.
	 * @return ziperr attribute
	 */
	public String getZiperr() {
		return ziperr.getValue();
	}

	/**
	 * Setter for ziperr attribute.
	 * @param ziperr the new value of ziperr
	 */
	public void setZiperr(String ziperr) {
		this.ziperr.setValue(ziperr);
	}
	/**
	 * Gets the reference for attribute countryerr.
	 * @return the countryerr attribute reference
	 */
	public ElementaryRangeReference getCountryerrReference() {
		return countryerr.getReference();
	}

	/**
	 * Getter for countryerr attribute.
	 * @return countryerr attribute
	 */
	public String getCountryerr() {
		return countryerr.getValue();
	}

	/**
	 * Setter for countryerr attribute.
	 * @param countryerr the new value of countryerr
	 */
	public void setCountryerr(String countryerr) {
		this.countryerr.setValue(countryerr);
	}
	/**
	 * Gets the reference for attribute phone1err.
	 * @return the phone1err attribute reference
	 */
	public ElementaryRangeReference getPhone1errReference() {
		return phone1err.getReference();
	}

	/**
	 * Getter for phone1err attribute.
	 * @return phone1err attribute
	 */
	public String getPhone1err() {
		return phone1err.getValue();
	}

	/**
	 * Setter for phone1err attribute.
	 * @param phone1err the new value of phone1err
	 */
	public void setPhone1err(String phone1err) {
		this.phone1err.setValue(phone1err);
	}
	/**
	 * Gets the reference for attribute phone2err.
	 * @return the phone2err attribute reference
	 */
	public ElementaryRangeReference getPhone2errReference() {
		return phone2err.getReference();
	}

	/**
	 * Getter for phone2err attribute.
	 * @return phone2err attribute
	 */
	public String getPhone2err() {
		return phone2err.getValue();
	}

	/**
	 * Setter for phone2err attribute.
	 * @param phone2err the new value of phone2err
	 */
	public void setPhone2err(String phone2err) {
		this.phone2err.setValue(phone2err);
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
	 * Gets the reference for attribute gendererr.
	 * @return the gendererr attribute reference
	 */
	public ElementaryRangeReference getGendererrReference() {
		return gendererr.getReference();
	}

	/**
	 * Getter for gendererr attribute.
	 * @return gendererr attribute
	 */
	public String getGendererr() {
		return gendererr.getValue();
	}

	/**
	 * Setter for gendererr attribute.
	 * @param gendererr the new value of gendererr
	 */
	public void setGendererr(String gendererr) {
		this.gendererr.setValue(gendererr);
	}
}
