// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdtrn01dCtl1.
 */
public class Cdtrn01dCtl1 extends BaseScreenBean {

	public Cdtrn01dCtl1() {
		super(new Cdtrn01dSfl1());
		setDspMode("*DS3");
		
		addFKeys("PAGEUP", "PAGEDOWN", "03", "05", "06", "12");

	}

	public String getComponentId() {
		return "cdtrn01d-ctl1";
	}

	/**
	* return the sfl1.
	* @return the sfl1.
	*/
	public ArrayScreenField getSfl1Field(){
		return getArrayScreenField("sfl1");
	}
}