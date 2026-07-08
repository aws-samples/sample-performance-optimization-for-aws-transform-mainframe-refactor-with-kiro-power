// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdtrn02dZconfirm.
 */
public class Cdtrn02dZconfirm extends WindowScreenBean {

	public Cdtrn02dZconfirm() {
		super("yesno");
		setDspMode("*DS3");
		
		

	}

	public String getComponentId() {
		return "cdtrn02d-zconfirm";
	}

	/**
	* return the yesno.
	* @return the yesno.
	*/
	public SimpleScreenField getYesnoField(){
		return getField("yesno");
	}

	/**
	* return the yesno value.
	* @return the yesno value.
	*/
	public String getYesno(){
		return getField("yesno").getValue(String.class);
	}

	/**
	* sets the value for yesno.
	* @param value the new yesno.
	*/
	public void setYesno(String value){
		getField("yesno").setValue(value);
	}
}