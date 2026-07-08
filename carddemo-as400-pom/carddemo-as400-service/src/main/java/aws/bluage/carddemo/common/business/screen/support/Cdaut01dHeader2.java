// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdaut01dHeader2.
 */
public class Cdaut01dHeader2 extends BaseScreenBean {

	public Cdaut01dHeader2() {
		super("labelAuthorizationId", "labelTransactionId", "labelCreditCardNumber", "labelResponseReason", "labelFraudFlag", "labelAuthDate", "labelAuthTime", "position");
		setDspMode("*DS4");
		
		addFKeys("03", "04", "05", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdaut01d-header2";
	}

	/**
	* return the labelAuthorizationId.
	* @return the labelAuthorizationId.
	*/
	public SimpleScreenField getLabelAuthorizationIdField(){
		return getField("labelAuthorizationId");
	}

	/**
	* return the labelAuthorizationId value.
	* @return the labelAuthorizationId value.
	*/
	public String getLabelAuthorizationId(){
		return getField("labelAuthorizationId").getValue(String.class);
	}

	/**
	* sets the value for labelAuthorizationId.
	* @param value the new labelAuthorizationId.
	*/
	public void setLabelAuthorizationId(String value){
		getField("labelAuthorizationId").setValue(value);
	}
	/**
	* return the labelTransactionId.
	* @return the labelTransactionId.
	*/
	public SimpleScreenField getLabelTransactionIdField(){
		return getField("labelTransactionId");
	}

	/**
	* return the labelTransactionId value.
	* @return the labelTransactionId value.
	*/
	public String getLabelTransactionId(){
		return getField("labelTransactionId").getValue(String.class);
	}

	/**
	* sets the value for labelTransactionId.
	* @param value the new labelTransactionId.
	*/
	public void setLabelTransactionId(String value){
		getField("labelTransactionId").setValue(value);
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
	* return the labelResponseReason.
	* @return the labelResponseReason.
	*/
	public SimpleScreenField getLabelResponseReasonField(){
		return getField("labelResponseReason");
	}

	/**
	* return the labelResponseReason value.
	* @return the labelResponseReason value.
	*/
	public String getLabelResponseReason(){
		return getField("labelResponseReason").getValue(String.class);
	}

	/**
	* sets the value for labelResponseReason.
	* @param value the new labelResponseReason.
	*/
	public void setLabelResponseReason(String value){
		getField("labelResponseReason").setValue(value);
	}
	/**
	* return the labelFraudFlag.
	* @return the labelFraudFlag.
	*/
	public SimpleScreenField getLabelFraudFlagField(){
		return getField("labelFraudFlag");
	}

	/**
	* return the labelFraudFlag value.
	* @return the labelFraudFlag value.
	*/
	public String getLabelFraudFlag(){
		return getField("labelFraudFlag").getValue(String.class);
	}

	/**
	* sets the value for labelFraudFlag.
	* @param value the new labelFraudFlag.
	*/
	public void setLabelFraudFlag(String value){
		getField("labelFraudFlag").setValue(value);
	}
	/**
	* return the labelAuthDate.
	* @return the labelAuthDate.
	*/
	public SimpleScreenField getLabelAuthDateField(){
		return getField("labelAuthDate");
	}

	/**
	* return the labelAuthDate value.
	* @return the labelAuthDate value.
	*/
	public String getLabelAuthDate(){
		return getField("labelAuthDate").getValue(String.class);
	}

	/**
	* sets the value for labelAuthDate.
	* @param value the new labelAuthDate.
	*/
	public void setLabelAuthDate(String value){
		getField("labelAuthDate").setValue(value);
	}
	/**
	* return the labelAuthTime.
	* @return the labelAuthTime.
	*/
	public SimpleScreenField getLabelAuthTimeField(){
		return getField("labelAuthTime");
	}

	/**
	* return the labelAuthTime value.
	* @return the labelAuthTime value.
	*/
	public String getLabelAuthTime(){
		return getField("labelAuthTime").getValue(String.class);
	}

	/**
	* sets the value for labelAuthTime.
	* @param value the new labelAuthTime.
	*/
	public void setLabelAuthTime(String value){
		getField("labelAuthTime").setValue(value);
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
	public Long getPosition(){
		return getField("position").getValue(Long.class);
	}

	/**
	* sets the value for position.
	* @param value the new position.
	*/
	public void setPosition(Long value){
		getField("position").setValue(value);
	}
}