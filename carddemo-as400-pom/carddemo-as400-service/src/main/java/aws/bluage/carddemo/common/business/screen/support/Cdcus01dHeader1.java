// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus01dHeader1.
 */
public class Cdcus01dHeader1 extends BaseScreenBean {

	public Cdcus01dHeader1() {
		super("labelCustomerMainScreen", "date1", "time1", "labelUser", "pgmname");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdcus01d-header1";
	}

	/**
	* return the labelCustomerMainScreen.
	* @return the labelCustomerMainScreen.
	*/
	public SimpleScreenField getLabelCustomerMainScreenField(){
		return getField("labelCustomerMainScreen");
	}

	/**
	* return the labelCustomerMainScreen value.
	* @return the labelCustomerMainScreen value.
	*/
	public String getLabelCustomerMainScreen(){
		return getField("labelCustomerMainScreen").getValue(String.class);
	}

	/**
	* sets the value for labelCustomerMainScreen.
	* @param value the new labelCustomerMainScreen.
	*/
	public void setLabelCustomerMainScreen(String value){
		getField("labelCustomerMainScreen").setValue(value);
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
}