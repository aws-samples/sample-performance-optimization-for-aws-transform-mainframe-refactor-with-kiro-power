// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact01dDelwin.
 */
public class Cdact01dDelwin extends WindowScreenBean {

	public Cdact01dDelwin() {
		super("labelInactivateAccount", "actid");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact01d-delwin";
	}

	/**
	* return the labelInactivateAccount.
	* @return the labelInactivateAccount.
	*/
	public SimpleScreenField getLabelInactivateAccountField(){
		return getField("labelInactivateAccount");
	}

	/**
	* return the labelInactivateAccount value.
	* @return the labelInactivateAccount value.
	*/
	public String getLabelInactivateAccount(){
		return getField("labelInactivateAccount").getValue(String.class);
	}

	/**
	* sets the value for labelInactivateAccount.
	* @param value the new labelInactivateAccount.
	*/
	public void setLabelInactivateAccount(String value){
		getField("labelInactivateAccount").setValue(value);
	}
	/**
	* return the actid.
	* @return the actid.
	*/
	public SimpleScreenField getActidField(){
		return getField("actid");
	}

	/**
	* return the actid value.
	* @return the actid value.
	*/
	public String getActid(){
		return getField("actid").getValue(String.class);
	}

	/**
	* sets the value for actid.
	* @param value the new actid.
	*/
	public void setActid(String value){
		getField("actid").setValue(value);
	}
}