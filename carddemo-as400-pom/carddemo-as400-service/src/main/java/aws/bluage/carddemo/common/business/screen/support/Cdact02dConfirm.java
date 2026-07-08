// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact02dConfirm.
 */
public class Cdact02dConfirm extends WindowScreenBean {

	public Cdact02dConfirm() {
		super("labelAddAccount", "labelUpdateAccount");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact02d-confirm";
	}

	/**
	* return the labelAddAccount.
	* @return the labelAddAccount.
	*/
	public SimpleScreenField getLabelAddAccountField(){
		return getField("labelAddAccount");
	}

	/**
	* return the labelAddAccount value.
	* @return the labelAddAccount value.
	*/
	public String getLabelAddAccount(){
		return getField("labelAddAccount").getValue(String.class);
	}

	/**
	* sets the value for labelAddAccount.
	* @param value the new labelAddAccount.
	*/
	public void setLabelAddAccount(String value){
		getField("labelAddAccount").setValue(value);
	}
	/**
	* return the labelUpdateAccount.
	* @return the labelUpdateAccount.
	*/
	public SimpleScreenField getLabelUpdateAccountField(){
		return getField("labelUpdateAccount");
	}

	/**
	* return the labelUpdateAccount value.
	* @return the labelUpdateAccount value.
	*/
	public String getLabelUpdateAccount(){
		return getField("labelUpdateAccount").getValue(String.class);
	}

	/**
	* sets the value for labelUpdateAccount.
	* @param value the new labelUpdateAccount.
	*/
	public void setLabelUpdateAccount(String value){
		getField("labelUpdateAccount").setValue(value);
	}
}