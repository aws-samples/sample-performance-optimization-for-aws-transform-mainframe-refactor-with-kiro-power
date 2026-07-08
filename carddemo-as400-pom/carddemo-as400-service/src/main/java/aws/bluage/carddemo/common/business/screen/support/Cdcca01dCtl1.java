// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcca01dCtl1.
 */
public class Cdcca01dCtl1 extends BaseScreenBean {

	public Cdcca01dCtl1() {
		super(new Cdcca01dSfl1());
		setDspMode("*DS3");
		
		addFKeys("03", "12");

	}

	public String getComponentId() {
		return "cdcca01d-ctl1";
	}

	/**
	* return the sfl1.
	* @return the sfl1.
	*/
	public ArrayScreenField getSfl1Field(){
		return getArrayScreenField("sfl1");
	}
}