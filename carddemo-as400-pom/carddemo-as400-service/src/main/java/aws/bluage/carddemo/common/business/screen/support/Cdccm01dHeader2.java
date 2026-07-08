// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdccm01dHeader2.
 */
public class Cdccm01dHeader2 extends BaseScreenBean {

	public Cdccm01dHeader2() {
		super("label", "labelCreditCardNumber", "labelCustomerId", "labelAccountNumber", "labelPrimSec", "labelStatus", "position");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("05", "06", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdccm01d-header2";
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
	* return the labelCreditCardNumber.
	* @return the labelCreditCardNumber.
	*/
	public SimpleScreenField getLabelCreditCardNumberField(){
		return getField("labelCreditCardNumber");
	}

	/**
	* return the labelCreditCardNumber value.
	* @return the labelCreditCardNumber value.
	*/
	public String getLabelCreditCardNumber(){
		return getField("labelCreditCardNumber").getValue(String.class);
	}

	/**
	* sets the value for labelCreditCardNumber.
	* @param value the new labelCreditCardNumber.
	*/
	public void setLabelCreditCardNumber(String value){
		getField("labelCreditCardNumber").setValue(value);
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
	* return the labelAccountNumber.
	* @return the labelAccountNumber.
	*/
	public SimpleScreenField getLabelAccountNumberField(){
		return getField("labelAccountNumber");
	}

	/**
	* return the labelAccountNumber value.
	* @return the labelAccountNumber value.
	*/
	public String getLabelAccountNumber(){
		return getField("labelAccountNumber").getValue(String.class);
	}

	/**
	* sets the value for labelAccountNumber.
	* @param value the new labelAccountNumber.
	*/
	public void setLabelAccountNumber(String value){
		getField("labelAccountNumber").setValue(value);
	}
	/**
	* return the labelPrimSec.
	* @return the labelPrimSec.
	*/
	public SimpleScreenField getLabelPrimSecField(){
		return getField("labelPrimSec");
	}

	/**
	* return the labelPrimSec value.
	* @return the labelPrimSec value.
	*/
	public String getLabelPrimSec(){
		return getField("labelPrimSec").getValue(String.class);
	}

	/**
	* sets the value for labelPrimSec.
	* @param value the new labelPrimSec.
	*/
	public void setLabelPrimSec(String value){
		getField("labelPrimSec").setValue(value);
	}
	/**
	* return the labelStatus.
	* @return the labelStatus.
	*/
	public SimpleScreenField getLabelStatusField(){
		return getField("labelStatus");
	}

	/**
	* return the labelStatus value.
	* @return the labelStatus value.
	*/
	public String getLabelStatus(){
		return getField("labelStatus").getValue(String.class);
	}

	/**
	* sets the value for labelStatus.
	* @param value the new labelStatus.
	*/
	public void setLabelStatus(String value){
		getField("labelStatus").setValue(value);
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