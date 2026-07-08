// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus02dAddwin.
 */
public class Cdcus02dAddwin extends WindowScreenBean {

	public Cdcus02dAddwin() {
		super("labelAddCustomer", "labelUpdateCustomer");
		setDspMode("*DS3");
		
		addFKeys("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdcus02d-addwin";
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
}