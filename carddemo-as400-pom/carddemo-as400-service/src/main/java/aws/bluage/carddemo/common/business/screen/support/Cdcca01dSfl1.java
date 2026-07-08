// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcca01dSfl1.
 */
public class Cdcca01dSfl1 extends ArrayScreenField {

	public Cdcca01dSfl1() {
		super("sfl1", "activity", "dess", "ccauser", "ccatmstamp");
		
		

	}

	public String getComponentId() {
		return "cdcca01d-sfl1";
	}

	/**
	* return the activity.
	* @return the activity.
	*/
	public SimpleScreenField getActivityField(){
		return getField("activity");
	}

	/**
	* return the activity value.
	* @return the activity value.
	*/
	public String getActivity(){
		return getField("activity").getValue(String.class);
	}

	/**
	* sets the value for activity.
	* @param value the new activity.
	*/
	public void setActivity(String value){
		getField("activity").setValue(value);
	}
	/**
	* return the dess.
	* @return the dess.
	*/
	public SimpleScreenField getDessField(){
		return getField("dess");
	}

	/**
	* return the dess value.
	* @return the dess value.
	*/
	public String getDess(){
		return getField("dess").getValue(String.class);
	}

	/**
	* sets the value for dess.
	* @param value the new dess.
	*/
	public void setDess(String value){
		getField("dess").setValue(value);
	}
	/**
	* return the ccauser.
	* @return the ccauser.
	*/
	public SimpleScreenField getCcauserField(){
		return getField("ccauser");
	}

	/**
	* return the ccauser value.
	* @return the ccauser value.
	*/
	public String getCcauser(){
		return getField("ccauser").getValue(String.class);
	}

	/**
	* sets the value for ccauser.
	* @param value the new ccauser.
	*/
	public void setCcauser(String value){
		getField("ccauser").setValue(value);
	}
	/**
	* return the ccatmstamp.
	* @return the ccatmstamp.
	*/
	public SimpleScreenField getCcatmstampField(){
		return getField("ccatmstamp");
	}

	/**
	* return the ccatmstamp value.
	* @return the ccatmstamp value.
	*/
	public String getCcatmstamp(){
		return getField("ccatmstamp").getValue(String.class);
	}

	/**
	* sets the value for ccatmstamp.
	* @param value the new ccatmstamp.
	*/
	public void setCcatmstamp(String value){
		getField("ccatmstamp").setValue(value);
	}
}