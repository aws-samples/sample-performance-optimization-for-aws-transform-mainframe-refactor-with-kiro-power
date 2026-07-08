// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdccm02dConfirm.
 */
public class Cdccm02dConfirm extends WindowScreenBean {

	public Cdccm02dConfirm() {
		super("labelCreateCreditCard", "labelUpdateCreditCard");
		setDspMode("*DS3");
		
		addFKeys("02", "03", "04", "09", "12");

	}

	public String getComponentId() {
		return "cdccm02d-confirm";
	}

	/**
	* return the labelCreateCreditCard.
	* @return the labelCreateCreditCard.
	*/
	public SimpleScreenField getLabelCreateCreditCardField(){
		return getField("labelCreateCreditCard");
	}

	/**
	* return the labelCreateCreditCard value.
	* @return the labelCreateCreditCard value.
	*/
	public String getLabelCreateCreditCard(){
		return getField("labelCreateCreditCard").getValue(String.class);
	}

	/**
	* sets the value for labelCreateCreditCard.
	* @param value the new labelCreateCreditCard.
	*/
	public void setLabelCreateCreditCard(String value){
		getField("labelCreateCreditCard").setValue(value);
	}
	/**
	* return the labelUpdateCreditCard.
	* @return the labelUpdateCreditCard.
	*/
	public SimpleScreenField getLabelUpdateCreditCardField(){
		return getField("labelUpdateCreditCard");
	}

	/**
	* return the labelUpdateCreditCard value.
	* @return the labelUpdateCreditCard value.
	*/
	public String getLabelUpdateCreditCard(){
		return getField("labelUpdateCreditCard").getValue(String.class);
	}

	/**
	* sets the value for labelUpdateCreditCard.
	* @param value the new labelUpdateCreditCard.
	*/
	public void setLabelUpdateCreditCard(String value){
		getField("labelUpdateCreditCard").setValue(value);
	}
}