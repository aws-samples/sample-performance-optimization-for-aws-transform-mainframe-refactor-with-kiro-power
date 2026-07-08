// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact01dFooter.
 */
public class Cdact01dFooter extends BaseScreenBean {

	public Cdact01dFooter() {
		super("varyft");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact01d-footer";
	}

	/**
	* return the varyft.
	* @return the varyft.
	*/
	public SimpleScreenField getVaryftField(){
		return getField("varyft");
	}

	/**
	* return the varyft value.
	* @return the varyft value.
	*/
	public String getVaryft(){
		return getField("varyft").getValue(String.class);
	}

	/**
	* sets the value for varyft.
	* @param value the new varyft.
	*/
	public void setVaryft(String value){
		getField("varyft").setValue(value);
	}
}