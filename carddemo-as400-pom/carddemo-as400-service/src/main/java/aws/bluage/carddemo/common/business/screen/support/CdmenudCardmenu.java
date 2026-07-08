// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object CdmenudCardmenu.
 */
public class CdmenudCardmenu extends BaseScreenBean {

	public CdmenudCardmenu() {
		super("labelUser", "date1", "time1", "cmdprompt");
		setDspMode("*DS3");
		
		addFKeys("03");

	}

	public String getComponentId() {
		return "cdmenud-cardmenu";
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
	* return the cmdprompt.
	* @return the cmdprompt.
	*/
	public SimpleScreenField getCmdpromptField(){
		return getField("cmdprompt");
	}

	/**
	* return the cmdprompt value.
	* @return the cmdprompt value.
	*/
	public String getCmdprompt(){
		return getField("cmdprompt").getValue(String.class);
	}

	/**
	* sets the value for cmdprompt.
	* @param value the new cmdprompt.
	*/
	public void setCmdprompt(String value){
		getField("cmdprompt").setValue(value);
	}
}