// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdaut01dMsgsflc.
 */
public class Cdaut01dMsgsflc extends BaseScreenBean {

	public Cdaut01dMsgsflc() {
		super(new Cdaut01dMsgsfl(), "pgmq");
		setDspMode("*DS4");
		
		addFKeys("03", "04", "05", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdaut01d-msgsflc";
	}

	/**
	* return the pgmq.
	* @return the pgmq.
	*/
	public SimpleScreenField getPgmqField(){
		return getField("pgmq");
	}

	/**
	* return the pgmq value.
	* @return the pgmq value.
	*/
	public String getPgmq(){
		return getField("pgmq").getValue(String.class);
	}

	/**
	* sets the value for pgmq.
	* @param value the new pgmq.
	*/
	public void setPgmq(String value){
		getField("pgmq").setValue(value);
	}
	/**
	* return the msgsfl.
	* @return the msgsfl.
	*/
	public ArrayScreenField getMsgsflField(){
		return getArrayScreenField("msgsfl");
	}
}