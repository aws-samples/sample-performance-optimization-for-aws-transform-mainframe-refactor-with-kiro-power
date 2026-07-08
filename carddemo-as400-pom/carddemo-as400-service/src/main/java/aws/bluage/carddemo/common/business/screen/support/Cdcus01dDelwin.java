// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus01dDelwin.
 */
public class Cdcus01dDelwin extends WindowScreenBean {

	public Cdcus01dDelwin() {
		super("labelDeleteCustomer", "custid");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdcus01d-delwin";
	}

	/**
	* return the labelDeleteCustomer.
	* @return the labelDeleteCustomer.
	*/
	public SimpleScreenField getLabelDeleteCustomerField(){
		return getField("labelDeleteCustomer");
	}

	/**
	* return the labelDeleteCustomer value.
	* @return the labelDeleteCustomer value.
	*/
	public String getLabelDeleteCustomer(){
		return getField("labelDeleteCustomer").getValue(String.class);
	}

	/**
	* sets the value for labelDeleteCustomer.
	* @param value the new labelDeleteCustomer.
	*/
	public void setLabelDeleteCustomer(String value){
		getField("labelDeleteCustomer").setValue(value);
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
}