// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcca01dHeader1.
 */
public class Cdcca01dHeader1 extends BaseScreenBean {

	public Cdcca01dHeader1() {
		super("date1", "time1", "labelUser", "pgmname", "labelCardActivityHistory", "cardnum", "labelActivity", "labelDescription", "labelUser1", "labelTimestamp");
		setDspMode("*DS3");
		
		

	}

	public String getComponentId() {
		return "cdcca01d-header1";
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
	* return the labelCardActivityHistory.
	* @return the labelCardActivityHistory.
	*/
	public SimpleScreenField getLabelCardActivityHistoryField(){
		return getField("labelCardActivityHistory");
	}

	/**
	* return the labelCardActivityHistory value.
	* @return the labelCardActivityHistory value.
	*/
	public String getLabelCardActivityHistory(){
		return getField("labelCardActivityHistory").getValue(String.class);
	}

	/**
	* sets the value for labelCardActivityHistory.
	* @param value the new labelCardActivityHistory.
	*/
	public void setLabelCardActivityHistory(String value){
		getField("labelCardActivityHistory").setValue(value);
	}
	/**
	* return the cardnum.
	* @return the cardnum.
	*/
	public SimpleScreenField getCardnumField(){
		return getField("cardnum");
	}

	/**
	* return the cardnum value.
	* @return the cardnum value.
	*/
	public Long getCardnum(){
		return getField("cardnum").getValue(Long.class);
	}

	/**
	* sets the value for cardnum.
	* @param value the new cardnum.
	*/
	public void setCardnum(Long value){
		getField("cardnum").setValue(value);
	}
	/**
	* return the labelActivity.
	* @return the labelActivity.
	*/
	public SimpleScreenField getLabelActivityField(){
		return getField("labelActivity");
	}

	/**
	* return the labelActivity value.
	* @return the labelActivity value.
	*/
	public String getLabelActivity(){
		return getField("labelActivity").getValue(String.class);
	}

	/**
	* sets the value for labelActivity.
	* @param value the new labelActivity.
	*/
	public void setLabelActivity(String value){
		getField("labelActivity").setValue(value);
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
	* return the labelUser1.
	* @return the labelUser1.
	*/
	public SimpleScreenField getLabelUser1Field(){
		return getField("labelUser1");
	}

	/**
	* return the labelUser1 value.
	* @return the labelUser1 value.
	*/
	public String getLabelUser1(){
		return getField("labelUser1").getValue(String.class);
	}

	/**
	* sets the value for labelUser1.
	* @param value the new labelUser1.
	*/
	public void setLabelUser1(String value){
		getField("labelUser1").setValue(value);
	}
	/**
	* return the labelTimestamp.
	* @return the labelTimestamp.
	*/
	public SimpleScreenField getLabelTimestampField(){
		return getField("labelTimestamp");
	}

	/**
	* return the labelTimestamp value.
	* @return the labelTimestamp value.
	*/
	public String getLabelTimestamp(){
		return getField("labelTimestamp").getValue(String.class);
	}

	/**
	* sets the value for labelTimestamp.
	* @param value the new labelTimestamp.
	*/
	public void setLabelTimestamp(String value){
		getField("labelTimestamp").setValue(value);
	}
}