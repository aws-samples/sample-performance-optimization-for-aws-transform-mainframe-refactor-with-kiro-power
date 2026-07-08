// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus02dScrn1.
 */
public class Cdcus02dScrn1 extends BaseScreenBean {

	public Cdcus02dScrn1() {
		super("csrrec", "csrfld", "csrpos", "labelViewCustomer", "labelAddCustomer", "labelUpdateCustomer", "date1", "time1", "labelUser", "pgmname", "custid", "ssn", "ficoscore", "dob", "birthyr", "birthmo", "birthday", "gender", "firstname", "middlename", "lastname", "address1", "address2", "city", "state", "zip", "country", "phone1area", "phone1f3", "phone1l4", "phone2area", "phone2f3", "phone2l4", "labelCreatedBy", "cuscrtusr", "labelOn", "cuscrtdt", "cuscrttm", "labelProgram", "cuscrtpgm", "labelUpdatedBy", "cuschgusr", "labelOn1", "cuschgdt", "cuschgtm", "labelProgram1", "cuschgpgm");
		setDspMode("*DS3");
		
		addFKeys("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdcus02d-scrn1";
	}

	/**
	* return the csrrec.
	* @return the csrrec.
	*/
	public SimpleScreenField getCsrrecField(){
		return getField("csrrec");
	}

	/**
	* return the csrrec value.
	* @return the csrrec value.
	*/
	public String getCsrrec(){
		return getField("csrrec").getValue(String.class);
	}

	/**
	* sets the value for csrrec.
	* @param value the new csrrec.
	*/
	public void setCsrrec(String value){
		getField("csrrec").setValue(value);
	}
	/**
	* return the csrfld.
	* @return the csrfld.
	*/
	public SimpleScreenField getCsrfldField(){
		return getField("csrfld");
	}

	/**
	* return the csrfld value.
	* @return the csrfld value.
	*/
	public String getCsrfld(){
		return getField("csrfld").getValue(String.class);
	}

	/**
	* sets the value for csrfld.
	* @param value the new csrfld.
	*/
	public void setCsrfld(String value){
		getField("csrfld").setValue(value);
	}
	/**
	* return the csrpos.
	* @return the csrpos.
	*/
	public SimpleScreenField getCsrposField(){
		return getField("csrpos");
	}

	/**
	* return the csrpos value.
	* @return the csrpos value.
	*/
	public Integer getCsrpos(){
		return getField("csrpos").getValue(Integer.class);
	}

	/**
	* sets the value for csrpos.
	* @param value the new csrpos.
	*/
	public void setCsrpos(Integer value){
		getField("csrpos").setValue(value);
	}
	/**
	* return the labelViewCustomer.
	* @return the labelViewCustomer.
	*/
	public SimpleScreenField getLabelViewCustomerField(){
		return getField("labelViewCustomer");
	}

	/**
	* return the labelViewCustomer value.
	* @return the labelViewCustomer value.
	*/
	public String getLabelViewCustomer(){
		return getField("labelViewCustomer").getValue(String.class);
	}

	/**
	* sets the value for labelViewCustomer.
	* @param value the new labelViewCustomer.
	*/
	public void setLabelViewCustomer(String value){
		getField("labelViewCustomer").setValue(value);
	}
	/**
	* return the labelAddCustomer.
	* @return the labelAddCustomer.
	*/
	public SimpleScreenField getLabelAddCustomerField(){
		return getField("labelAddCustomer");
	}

	/**
	* return the labelAddCustomer value.
	* @return the labelAddCustomer value.
	*/
	public String getLabelAddCustomer(){
		return getField("labelAddCustomer").getValue(String.class);
	}

	/**
	* sets the value for labelAddCustomer.
	* @param value the new labelAddCustomer.
	*/
	public void setLabelAddCustomer(String value){
		getField("labelAddCustomer").setValue(value);
	}
	/**
	* return the labelUpdateCustomer.
	* @return the labelUpdateCustomer.
	*/
	public SimpleScreenField getLabelUpdateCustomerField(){
		return getField("labelUpdateCustomer");
	}

	/**
	* return the labelUpdateCustomer value.
	* @return the labelUpdateCustomer value.
	*/
	public String getLabelUpdateCustomer(){
		return getField("labelUpdateCustomer").getValue(String.class);
	}

	/**
	* sets the value for labelUpdateCustomer.
	* @param value the new labelUpdateCustomer.
	*/
	public void setLabelUpdateCustomer(String value){
		getField("labelUpdateCustomer").setValue(value);
	}
	/**
	* return the date1.
	* @return the date1.
	*/
	public SimpleScreenField getDate1Field(){
		return getField("date1");
	}

	/**
	* return the date1 value.
	* @return the date1 value.
	*/
	public String getDate1(){
		return getField("date1").getValue(String.class);
	}

	/**
	* sets the value for date1.
	* @param value the new date1.
	*/
	public void setDate1(String value){
		getField("date1").setValue(value);
	}
	/**
	* return the time1.
	* @return the time1.
	*/
	public SimpleScreenField getTime1Field(){
		return getField("time1");
	}

	/**
	* return the time1 value.
	* @return the time1 value.
	*/
	public String getTime1(){
		return getField("time1").getValue(String.class);
	}

	/**
	* sets the value for time1.
	* @param value the new time1.
	*/
	public void setTime1(String value){
		getField("time1").setValue(value);
	}
	/**
	* return the labelUser.
	* @return the labelUser.
	*/
	public SimpleScreenField getLabelUserField(){
		return getField("labelUser");
	}

	/**
	* return the labelUser value.
	* @return the labelUser value.
	*/
	public String getLabelUser(){
		return getField("labelUser").getValue(String.class);
	}

	/**
	* sets the value for labelUser.
	* @param value the new labelUser.
	*/
	public void setLabelUser(String value){
		getField("labelUser").setValue(value);
	}
	/**
	* return the pgmname.
	* @return the pgmname.
	*/
	public SimpleScreenField getPgmnameField(){
		return getField("pgmname");
	}

	/**
	* return the pgmname value.
	* @return the pgmname value.
	*/
	public String getPgmname(){
		return getField("pgmname").getValue(String.class);
	}

	/**
	* sets the value for pgmname.
	* @param value the new pgmname.
	*/
	public void setPgmname(String value){
		getField("pgmname").setValue(value);
	}
	/**
	* return the custid.
	* @return the custid.
	*/
	public SimpleScreenField getCustidField(){
		return getField("custid");
	}

	/**
	* return the custid value.
	* @return the custid value.
	*/
	public String getCustid(){
		return getField("custid").getValue(String.class);
	}

	/**
	* sets the value for custid.
	* @param value the new custid.
	*/
	public void setCustid(String value){
		getField("custid").setValue(value);
	}
	/**
	* return the ssn.
	* @return the ssn.
	*/
	public SimpleScreenField getSsnField(){
		return getField("ssn");
	}

	/**
	* return the ssn value.
	* @return the ssn value.
	*/
	public String getSsn(){
		return getField("ssn").getValue(String.class);
	}

	/**
	* sets the value for ssn.
	* @param value the new ssn.
	*/
	public void setSsn(String value){
		getField("ssn").setValue(value);
	}
	/**
	* return the ficoscore.
	* @return the ficoscore.
	*/
	public SimpleScreenField getFicoscoreField(){
		return getField("ficoscore");
	}

	/**
	* return the ficoscore value.
	* @return the ficoscore value.
	*/
	public String getFicoscore(){
		return getField("ficoscore").getValue(String.class);
	}

	/**
	* sets the value for ficoscore.
	* @param value the new ficoscore.
	*/
	public void setFicoscore(String value){
		getField("ficoscore").setValue(value);
	}
	/**
	* return the dob.
	* @return the dob.
	*/
	public SimpleScreenField getDobField(){
		return getField("dob");
	}

	/**
	* return the dob value.
	* @return the dob value.
	*/
	public String getDob(){
		return getField("dob").getValue(String.class);
	}

	/**
	* sets the value for dob.
	* @param value the new dob.
	*/
	public void setDob(String value){
		getField("dob").setValue(value);
	}
	/**
	* return the birthyr.
	* @return the birthyr.
	*/
	public SimpleScreenField getBirthyrField(){
		return getField("birthyr");
	}

	/**
	* return the birthyr value.
	* @return the birthyr value.
	*/
	public String getBirthyr(){
		return getField("birthyr").getValue(String.class);
	}

	/**
	* sets the value for birthyr.
	* @param value the new birthyr.
	*/
	public void setBirthyr(String value){
		getField("birthyr").setValue(value);
	}
	/**
	* return the birthmo.
	* @return the birthmo.
	*/
	public SimpleScreenField getBirthmoField(){
		return getField("birthmo");
	}

	/**
	* return the birthmo value.
	* @return the birthmo value.
	*/
	public String getBirthmo(){
		return getField("birthmo").getValue(String.class);
	}

	/**
	* sets the value for birthmo.
	* @param value the new birthmo.
	*/
	public void setBirthmo(String value){
		getField("birthmo").setValue(value);
	}
	/**
	* return the birthday.
	* @return the birthday.
	*/
	public SimpleScreenField getBirthdayField(){
		return getField("birthday");
	}

	/**
	* return the birthday value.
	* @return the birthday value.
	*/
	public String getBirthday(){
		return getField("birthday").getValue(String.class);
	}

	/**
	* sets the value for birthday.
	* @param value the new birthday.
	*/
	public void setBirthday(String value){
		getField("birthday").setValue(value);
	}
	/**
	* return the gender.
	* @return the gender.
	*/
	public SimpleScreenField getGenderField(){
		return getField("gender");
	}

	/**
	* return the gender value.
	* @return the gender value.
	*/
	public String getGender(){
		return getField("gender").getValue(String.class);
	}

	/**
	* sets the value for gender.
	* @param value the new gender.
	*/
	public void setGender(String value){
		getField("gender").setValue(value);
	}
	/**
	* return the firstname.
	* @return the firstname.
	*/
	public SimpleScreenField getFirstnameField(){
		return getField("firstname");
	}

	/**
	* return the firstname value.
	* @return the firstname value.
	*/
	public String getFirstname(){
		return getField("firstname").getValue(String.class);
	}

	/**
	* sets the value for firstname.
	* @param value the new firstname.
	*/
	public void setFirstname(String value){
		getField("firstname").setValue(value);
	}
	/**
	* return the middlename.
	* @return the middlename.
	*/
	public SimpleScreenField getMiddlenameField(){
		return getField("middlename");
	}

	/**
	* return the middlename value.
	* @return the middlename value.
	*/
	public String getMiddlename(){
		return getField("middlename").getValue(String.class);
	}

	/**
	* sets the value for middlename.
	* @param value the new middlename.
	*/
	public void setMiddlename(String value){
		getField("middlename").setValue(value);
	}
	/**
	* return the lastname.
	* @return the lastname.
	*/
	public SimpleScreenField getLastnameField(){
		return getField("lastname");
	}

	/**
	* return the lastname value.
	* @return the lastname value.
	*/
	public String getLastname(){
		return getField("lastname").getValue(String.class);
	}

	/**
	* sets the value for lastname.
	* @param value the new lastname.
	*/
	public void setLastname(String value){
		getField("lastname").setValue(value);
	}
	/**
	* return the address1.
	* @return the address1.
	*/
	public SimpleScreenField getAddress1Field(){
		return getField("address1");
	}

	/**
	* return the address1 value.
	* @return the address1 value.
	*/
	public String getAddress1(){
		return getField("address1").getValue(String.class);
	}

	/**
	* sets the value for address1.
	* @param value the new address1.
	*/
	public void setAddress1(String value){
		getField("address1").setValue(value);
	}
	/**
	* return the address2.
	* @return the address2.
	*/
	public SimpleScreenField getAddress2Field(){
		return getField("address2");
	}

	/**
	* return the address2 value.
	* @return the address2 value.
	*/
	public String getAddress2(){
		return getField("address2").getValue(String.class);
	}

	/**
	* sets the value for address2.
	* @param value the new address2.
	*/
	public void setAddress2(String value){
		getField("address2").setValue(value);
	}
	/**
	* return the city.
	* @return the city.
	*/
	public SimpleScreenField getCityField(){
		return getField("city");
	}

	/**
	* return the city value.
	* @return the city value.
	*/
	public String getCity(){
		return getField("city").getValue(String.class);
	}

	/**
	* sets the value for city.
	* @param value the new city.
	*/
	public void setCity(String value){
		getField("city").setValue(value);
	}
	/**
	* return the state.
	* @return the state.
	*/
	public SimpleScreenField getStateField(){
		return getField("state");
	}

	/**
	* return the state value.
	* @return the state value.
	*/
	public String getState(){
		return getField("state").getValue(String.class);
	}

	/**
	* sets the value for state.
	* @param value the new state.
	*/
	public void setState(String value){
		getField("state").setValue(value);
	}
	/**
	* return the zip.
	* @return the zip.
	*/
	public SimpleScreenField getZipField(){
		return getField("zip");
	}

	/**
	* return the zip value.
	* @return the zip value.
	*/
	public String getZip(){
		return getField("zip").getValue(String.class);
	}

	/**
	* sets the value for zip.
	* @param value the new zip.
	*/
	public void setZip(String value){
		getField("zip").setValue(value);
	}
	/**
	* return the country.
	* @return the country.
	*/
	public SimpleScreenField getCountryField(){
		return getField("country");
	}

	/**
	* return the country value.
	* @return the country value.
	*/
	public String getCountry(){
		return getField("country").getValue(String.class);
	}

	/**
	* sets the value for country.
	* @param value the new country.
	*/
	public void setCountry(String value){
		getField("country").setValue(value);
	}
	/**
	* return the phone1area.
	* @return the phone1area.
	*/
	public SimpleScreenField getPhone1areaField(){
		return getField("phone1area");
	}

	/**
	* return the phone1area value.
	* @return the phone1area value.
	*/
	public String getPhone1area(){
		return getField("phone1area").getValue(String.class);
	}

	/**
	* sets the value for phone1area.
	* @param value the new phone1area.
	*/
	public void setPhone1area(String value){
		getField("phone1area").setValue(value);
	}
	/**
	* return the phone1f3.
	* @return the phone1f3.
	*/
	public SimpleScreenField getPhone1f3Field(){
		return getField("phone1f3");
	}

	/**
	* return the phone1f3 value.
	* @return the phone1f3 value.
	*/
	public String getPhone1f3(){
		return getField("phone1f3").getValue(String.class);
	}

	/**
	* sets the value for phone1f3.
	* @param value the new phone1f3.
	*/
	public void setPhone1f3(String value){
		getField("phone1f3").setValue(value);
	}
	/**
	* return the phone1l4.
	* @return the phone1l4.
	*/
	public SimpleScreenField getPhone1l4Field(){
		return getField("phone1l4");
	}

	/**
	* return the phone1l4 value.
	* @return the phone1l4 value.
	*/
	public String getPhone1l4(){
		return getField("phone1l4").getValue(String.class);
	}

	/**
	* sets the value for phone1l4.
	* @param value the new phone1l4.
	*/
	public void setPhone1l4(String value){
		getField("phone1l4").setValue(value);
	}
	/**
	* return the phone2area.
	* @return the phone2area.
	*/
	public SimpleScreenField getPhone2areaField(){
		return getField("phone2area");
	}

	/**
	* return the phone2area value.
	* @return the phone2area value.
	*/
	public String getPhone2area(){
		return getField("phone2area").getValue(String.class);
	}

	/**
	* sets the value for phone2area.
	* @param value the new phone2area.
	*/
	public void setPhone2area(String value){
		getField("phone2area").setValue(value);
	}
	/**
	* return the phone2f3.
	* @return the phone2f3.
	*/
	public SimpleScreenField getPhone2f3Field(){
		return getField("phone2f3");
	}

	/**
	* return the phone2f3 value.
	* @return the phone2f3 value.
	*/
	public String getPhone2f3(){
		return getField("phone2f3").getValue(String.class);
	}

	/**
	* sets the value for phone2f3.
	* @param value the new phone2f3.
	*/
	public void setPhone2f3(String value){
		getField("phone2f3").setValue(value);
	}
	/**
	* return the phone2l4.
	* @return the phone2l4.
	*/
	public SimpleScreenField getPhone2l4Field(){
		return getField("phone2l4");
	}

	/**
	* return the phone2l4 value.
	* @return the phone2l4 value.
	*/
	public String getPhone2l4(){
		return getField("phone2l4").getValue(String.class);
	}

	/**
	* sets the value for phone2l4.
	* @param value the new phone2l4.
	*/
	public void setPhone2l4(String value){
		getField("phone2l4").setValue(value);
	}
	/**
	* return the labelCreatedBy.
	* @return the labelCreatedBy.
	*/
	public SimpleScreenField getLabelCreatedByField(){
		return getField("labelCreatedBy");
	}

	/**
	* return the labelCreatedBy value.
	* @return the labelCreatedBy value.
	*/
	public String getLabelCreatedBy(){
		return getField("labelCreatedBy").getValue(String.class);
	}

	/**
	* sets the value for labelCreatedBy.
	* @param value the new labelCreatedBy.
	*/
	public void setLabelCreatedBy(String value){
		getField("labelCreatedBy").setValue(value);
	}
	/**
	* return the cuscrtusr.
	* @return the cuscrtusr.
	*/
	public SimpleScreenField getCuscrtusrField(){
		return getField("cuscrtusr");
	}

	/**
	* return the cuscrtusr value.
	* @return the cuscrtusr value.
	*/
	public String getCuscrtusr(){
		return getField("cuscrtusr").getValue(String.class);
	}

	/**
	* sets the value for cuscrtusr.
	* @param value the new cuscrtusr.
	*/
	public void setCuscrtusr(String value){
		getField("cuscrtusr").setValue(value);
	}
	/**
	* return the labelOn.
	* @return the labelOn.
	*/
	public SimpleScreenField getLabelOnField(){
		return getField("labelOn");
	}

	/**
	* return the labelOn value.
	* @return the labelOn value.
	*/
	public String getLabelOn(){
		return getField("labelOn").getValue(String.class);
	}

	/**
	* sets the value for labelOn.
	* @param value the new labelOn.
	*/
	public void setLabelOn(String value){
		getField("labelOn").setValue(value);
	}
	/**
	* return the cuscrtdt.
	* @return the cuscrtdt.
	*/
	public SimpleScreenField getCuscrtdtField(){
		return getField("cuscrtdt");
	}

	/**
	* return the cuscrtdt value.
	* @return the cuscrtdt value.
	*/
	public Integer getCuscrtdt(){
		return getField("cuscrtdt").getValue(Integer.class);
	}

	/**
	* sets the value for cuscrtdt.
	* @param value the new cuscrtdt.
	*/
	public void setCuscrtdt(Integer value){
		getField("cuscrtdt").setValue(value);
	}
	/**
	* return the cuscrttm.
	* @return the cuscrttm.
	*/
	public SimpleScreenField getCuscrttmField(){
		return getField("cuscrttm");
	}

	/**
	* return the cuscrttm value.
	* @return the cuscrttm value.
	*/
	public Integer getCuscrttm(){
		return getField("cuscrttm").getValue(Integer.class);
	}

	/**
	* sets the value for cuscrttm.
	* @param value the new cuscrttm.
	*/
	public void setCuscrttm(Integer value){
		getField("cuscrttm").setValue(value);
	}
	/**
	* return the labelProgram.
	* @return the labelProgram.
	*/
	public SimpleScreenField getLabelProgramField(){
		return getField("labelProgram");
	}

	/**
	* return the labelProgram value.
	* @return the labelProgram value.
	*/
	public String getLabelProgram(){
		return getField("labelProgram").getValue(String.class);
	}

	/**
	* sets the value for labelProgram.
	* @param value the new labelProgram.
	*/
	public void setLabelProgram(String value){
		getField("labelProgram").setValue(value);
	}
	/**
	* return the cuscrtpgm.
	* @return the cuscrtpgm.
	*/
	public SimpleScreenField getCuscrtpgmField(){
		return getField("cuscrtpgm");
	}

	/**
	* return the cuscrtpgm value.
	* @return the cuscrtpgm value.
	*/
	public String getCuscrtpgm(){
		return getField("cuscrtpgm").getValue(String.class);
	}

	/**
	* sets the value for cuscrtpgm.
	* @param value the new cuscrtpgm.
	*/
	public void setCuscrtpgm(String value){
		getField("cuscrtpgm").setValue(value);
	}
	/**
	* return the labelUpdatedBy.
	* @return the labelUpdatedBy.
	*/
	public SimpleScreenField getLabelUpdatedByField(){
		return getField("labelUpdatedBy");
	}

	/**
	* return the labelUpdatedBy value.
	* @return the labelUpdatedBy value.
	*/
	public String getLabelUpdatedBy(){
		return getField("labelUpdatedBy").getValue(String.class);
	}

	/**
	* sets the value for labelUpdatedBy.
	* @param value the new labelUpdatedBy.
	*/
	public void setLabelUpdatedBy(String value){
		getField("labelUpdatedBy").setValue(value);
	}
	/**
	* return the cuschgusr.
	* @return the cuschgusr.
	*/
	public SimpleScreenField getCuschgusrField(){
		return getField("cuschgusr");
	}

	/**
	* return the cuschgusr value.
	* @return the cuschgusr value.
	*/
	public String getCuschgusr(){
		return getField("cuschgusr").getValue(String.class);
	}

	/**
	* sets the value for cuschgusr.
	* @param value the new cuschgusr.
	*/
	public void setCuschgusr(String value){
		getField("cuschgusr").setValue(value);
	}
	/**
	* return the labelOn1.
	* @return the labelOn1.
	*/
	public SimpleScreenField getLabelOn1Field(){
		return getField("labelOn1");
	}

	/**
	* return the labelOn1 value.
	* @return the labelOn1 value.
	*/
	public String getLabelOn1(){
		return getField("labelOn1").getValue(String.class);
	}

	/**
	* sets the value for labelOn1.
	* @param value the new labelOn1.
	*/
	public void setLabelOn1(String value){
		getField("labelOn1").setValue(value);
	}
	/**
	* return the cuschgdt.
	* @return the cuschgdt.
	*/
	public SimpleScreenField getCuschgdtField(){
		return getField("cuschgdt");
	}

	/**
	* return the cuschgdt value.
	* @return the cuschgdt value.
	*/
	public Integer getCuschgdt(){
		return getField("cuschgdt").getValue(Integer.class);
	}

	/**
	* sets the value for cuschgdt.
	* @param value the new cuschgdt.
	*/
	public void setCuschgdt(Integer value){
		getField("cuschgdt").setValue(value);
	}
	/**
	* return the cuschgtm.
	* @return the cuschgtm.
	*/
	public SimpleScreenField getCuschgtmField(){
		return getField("cuschgtm");
	}

	/**
	* return the cuschgtm value.
	* @return the cuschgtm value.
	*/
	public Integer getCuschgtm(){
		return getField("cuschgtm").getValue(Integer.class);
	}

	/**
	* sets the value for cuschgtm.
	* @param value the new cuschgtm.
	*/
	public void setCuschgtm(Integer value){
		getField("cuschgtm").setValue(value);
	}
	/**
	* return the labelProgram1.
	* @return the labelProgram1.
	*/
	public SimpleScreenField getLabelProgram1Field(){
		return getField("labelProgram1");
	}

	/**
	* return the labelProgram1 value.
	* @return the labelProgram1 value.
	*/
	public String getLabelProgram1(){
		return getField("labelProgram1").getValue(String.class);
	}

	/**
	* sets the value for labelProgram1.
	* @param value the new labelProgram1.
	*/
	public void setLabelProgram1(String value){
		getField("labelProgram1").setValue(value);
	}
	/**
	* return the cuschgpgm.
	* @return the cuschgpgm.
	*/
	public SimpleScreenField getCuschgpgmField(){
		return getField("cuschgpgm");
	}

	/**
	* return the cuschgpgm value.
	* @return the cuschgpgm value.
	*/
	public String getCuschgpgm(){
		return getField("cuschgpgm").getValue(String.class);
	}

	/**
	* sets the value for cuschgpgm.
	* @param value the new cuschgpgm.
	*/
	public void setCuschgpgm(String value){
		getField("cuschgpgm").setValue(value);
	}
}