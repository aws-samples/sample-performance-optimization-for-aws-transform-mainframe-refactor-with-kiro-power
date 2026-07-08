// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdtrn01dHeader.
 */
public class Cdtrn01dHeader extends BaseScreenBean {

	public Cdtrn01dHeader() {
		super("labelTransactionMainScreen", "date1", "time1", "labelUser", "pgmname", "d1posto", "label", "labelTransactionId", "labelProcessDt", "labelDescription", "labelAmount", "labelSts");
		setDspMode("*DS3");
		
		

	}

	public String getComponentId() {
		return "cdtrn01d-header";
	}

	/**
	* return the labelTransactionMainScreen.
	* @return the labelTransactionMainScreen.
	*/
	public SimpleScreenField getLabelTransactionMainScreenField(){
		return getField("labelTransactionMainScreen");
	}

	/**
	* return the labelTransactionMainScreen value.
	* @return the labelTransactionMainScreen value.
	*/
	public String getLabelTransactionMainScreen(){
		return getField("labelTransactionMainScreen").getValue(String.class);
	}

	/**
	* sets the value for labelTransactionMainScreen.
	* @param value the new labelTransactionMainScreen.
	*/
	public void setLabelTransactionMainScreen(String value){
		getField("labelTransactionMainScreen").setValue(value);
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
	/**
	* return the d1posto.
	* @return the d1posto.
	*/
	public SimpleScreenField getD1postoField(){
		return getField("d1posto");
	}

	/**
	* return the d1posto value.
	* @return the d1posto value.
	*/
	public Long getD1posto(){
		return getField("d1posto").getValue(Long.class);
	}

	/**
	* sets the value for d1posto.
	* @param value the new d1posto.
	*/
	public void setD1posto(Long value){
		getField("d1posto").setValue(value);
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
	* return the labelProcessDt.
	* @return the labelProcessDt.
	*/
	public SimpleScreenField getLabelProcessDtField(){
		return getField("labelProcessDt");
	}

	/**
	* return the labelProcessDt value.
	* @return the labelProcessDt value.
	*/
	public String getLabelProcessDt(){
		return getField("labelProcessDt").getValue(String.class);
	}

	/**
	* sets the value for labelProcessDt.
	* @param value the new labelProcessDt.
	*/
	public void setLabelProcessDt(String value){
		getField("labelProcessDt").setValue(value);
	}
	/**
	* return the labelDescription.
	* @return the labelDescription.
	*/
	public SimpleScreenField getLabelDescriptionField(){
		return getField("labelDescription");
	}

	/**
	* return the labelDescription value.
	* @return the labelDescription value.
	*/
	public String getLabelDescription(){
		return getField("labelDescription").getValue(String.class);
	}

	/**
	* sets the value for labelDescription.
	* @param value the new labelDescription.
	*/
	public void setLabelDescription(String value){
		getField("labelDescription").setValue(value);
	}
	/**
	* return the labelAmount.
	* @return the labelAmount.
	*/
	public SimpleScreenField getLabelAmountField(){
		return getField("labelAmount");
	}

	/**
	* return the labelAmount value.
	* @return the labelAmount value.
	*/
	public String getLabelAmount(){
		return getField("labelAmount").getValue(String.class);
	}

	/**
	* sets the value for labelAmount.
	* @param value the new labelAmount.
	*/
	public void setLabelAmount(String value){
		getField("labelAmount").setValue(value);
	}
	/**
	* return the labelSts.
	* @return the labelSts.
	*/
	public SimpleScreenField getLabelStsField(){
		return getField("labelSts");
	}

	/**
	* return the labelSts value.
	* @return the labelSts value.
	*/
	public String getLabelSts(){
		return getField("labelSts").getValue(String.class);
	}

	/**
	* sets the value for labelSts.
	* @param value the new labelSts.
	*/
	public void setLabelSts(String value){
		getField("labelSts").setValue(value);
	}
}