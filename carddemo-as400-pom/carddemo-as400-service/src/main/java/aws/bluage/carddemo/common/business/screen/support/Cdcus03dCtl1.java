// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus03dCtl1.
 */
public class Cdcus03dCtl1 extends BaseScreenBean {

	public Cdcus03dCtl1() {
		super(new Cdcus03dSfl1());
		setDspMode("*DS3");
		addAKeys("03", "05", "12");
		

	}

	public String getComponentId() {
		return "cdcus03d-ctl1";
	}

	/**
	* return the sfl1.
	* @return the sfl1.
	*/
	public ArrayScreenField getSfl1Field(){
		return getArrayScreenField("sfl1");
	}
}