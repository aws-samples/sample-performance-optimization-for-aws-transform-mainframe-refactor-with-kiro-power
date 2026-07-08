// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus01dHeader2.
 */
public class Cdcus01dHeader2 extends BaseScreenBean {

	public Cdcus01dHeader2() {
		super("label", "labelCustomerId", "labelFirstName", "labelLastName", "position");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdcus01d-header2";
	}

	/**
	* return the label.
	* @return the label.
	*/
	public SimpleScreenField getLabelField(){
		return getField("label");
	}

	/**
	* return the label value.
	* @return the label value.
	*/
	public String getLabel(){
		return getField("label").getValue(String.class);
	}

	/**
	* sets the value for label.
	* @param value the new label.
	*/
	public void setLabel(String value){
		getField("label").setValue(value);
	}
	/**
	* return the labelCustomerId.
	* @return the labelCustomerId.
	*/
	public SimpleScreenField getLabelCustomerIdField(){
		return getField("labelCustomerId");
	}

	/**
	* return the labelCustomerId value.
	* @return the labelCustomerId value.
	*/
	public String getLabelCustomerId(){
		return getField("labelCustomerId").getValue(String.class);
	}

	/**
	* sets the value for labelCustomerId.
	* @param value the new labelCustomerId.
	*/
	public void setLabelCustomerId(String value){
		getField("labelCustomerId").setValue(value);
	}
	/**
	* return the labelFirstName.
	* @return the labelFirstName.
	*/
	public SimpleScreenField getLabelFirstNameField(){
		return getField("labelFirstName");
	}

	/**
	* return the labelFirstName value.
	* @return the labelFirstName value.
	*/
	public String getLabelFirstName(){
		return getField("labelFirstName").getValue(String.class);
	}

	/**
	* sets the value for labelFirstName.
	* @param value the new labelFirstName.
	*/
	public void setLabelFirstName(String value){
		getField("labelFirstName").setValue(value);
	}
	/**
	* return the labelLastName.
	* @return the labelLastName.
	*/
	public SimpleScreenField getLabelLastNameField(){
		return getField("labelLastName");
	}

	/**
	* return the labelLastName value.
	* @return the labelLastName value.
	*/
	public String getLabelLastName(){
		return getField("labelLastName").getValue(String.class);
	}

	/**
	* sets the value for labelLastName.
	* @param value the new labelLastName.
	*/
	public void setLabelLastName(String value){
		getField("labelLastName").setValue(value);
	}
	/**
	* return the position.
	* @return the position.
	*/
	public SimpleScreenField getPositionField(){
		return getField("position");
	}

	/**
	* return the position value.
	* @return the position value.
	*/
	public String getPosition(){
		return getField("position").getValue(String.class);
	}

	/**
	* sets the value for position.
	* @param value the new position.
	*/
	public void setPosition(String value){
		getField("position").setValue(value);
	}
}