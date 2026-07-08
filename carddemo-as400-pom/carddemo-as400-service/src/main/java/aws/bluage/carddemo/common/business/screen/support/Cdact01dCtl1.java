// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact01dCtl1.
 */
public class Cdact01dCtl1 extends BaseScreenBean {

	public Cdact01dCtl1() {
		super(new Cdact01dSfl1(), "sflrrn");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "PAGEUP", "PAGEDOWN");

	}

	public String getComponentId() {
		return "cdact01d-ctl1";
	}

	/**
	* return the sflrrn.
	* @return the sflrrn.
	*/
	public SimpleScreenField getSflrrnField(){
		return getField("sflrrn");
	}

	/**
	* return the sflrrn value.
	* @return the sflrrn value.
	*/
	public Integer getSflrrn(){
		return getField("sflrrn").getValue(Integer.class);
	}

	/**
	* sets the value for sflrrn.
	* @param value the new sflrrn.
	*/
	public void setSflrrn(Integer value){
		getField("sflrrn").setValue(value);
	}
	/**
	* return the sfl1.
	* @return the sfl1.
	*/
	public ArrayScreenField getSfl1Field(){
		return getArrayScreenField("sfl1");
	}
}