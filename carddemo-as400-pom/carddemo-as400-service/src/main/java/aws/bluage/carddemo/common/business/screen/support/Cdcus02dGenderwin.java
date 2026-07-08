// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus02dGenderwin.
 */
public class Cdcus02dGenderwin extends WindowScreenBean {

	public Cdcus02dGenderwin() {
		super("selgen");
		setDspMode("*DS3");
		
		addFKeys("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdcus02d-genderwin";
	}

	/**
	* return the selgen.
	* @return the selgen.
	*/
	public SimpleScreenField getSelgenField(){
		return getField("selgen");
	}

	/**
	* return the selgen value.
	* @return the selgen value.
	*/
	public Integer getSelgen(){
		return getField("selgen").getValue(Integer.class);
	}

	/**
	* sets the value for selgen.
	* @param value the new selgen.
	*/
	public void setSelgen(Integer value){
		getField("selgen").setValue(value);
	}
}