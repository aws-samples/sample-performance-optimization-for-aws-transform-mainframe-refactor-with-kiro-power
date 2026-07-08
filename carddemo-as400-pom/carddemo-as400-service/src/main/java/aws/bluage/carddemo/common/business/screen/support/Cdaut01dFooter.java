// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdaut01dFooter.
 */
public class Cdaut01dFooter extends BaseScreenBean {

	public Cdaut01dFooter() {
		super("dashes");
		setDspMode("*DS4");
		
		addFKeys("03", "04", "05", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdaut01d-footer";
	}

	/**
	* return the dashes.
	* @return the dashes.
	*/
	public SimpleScreenField getDashesField(){
		return getField("dashes");
	}

	/**
	* return the dashes value.
	* @return the dashes value.
	*/
	public String getDashes(){
		return getField("dashes").getValue(String.class);
	}

	/**
	* sets the value for dashes.
	* @param value the new dashes.
	*/
	public void setDashes(String value){
		getField("dashes").setValue(value);
	}
}