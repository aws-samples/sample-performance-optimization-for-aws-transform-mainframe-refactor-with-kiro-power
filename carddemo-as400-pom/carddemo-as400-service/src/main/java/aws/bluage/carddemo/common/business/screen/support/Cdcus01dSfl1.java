// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus01dSfl1.
 */
public class Cdcus01dSfl1 extends ArrayScreenField {

	public Cdcus01dSfl1() {
		super("sfl1", "option", "custid", "firstname", "lastname");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdcus01d-sfl1";
	}

	/**
	* return the option.
	* @return the option.
	*/
	public SimpleScreenField getOptionField(){
		return getField("option");
	}

	/**
	* return the option value.
	* @return the option value.
	*/
	public String getOption(){
		return getField("option").getValue(String.class);
	}

	/**
	* sets the value for option.
	* @param value the new option.
	*/
	public void setOption(String value){
		getField("option").setValue(value);
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
}