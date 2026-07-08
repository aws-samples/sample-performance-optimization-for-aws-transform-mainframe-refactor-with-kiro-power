// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdccm01dMsgsflc.
 */
public class Cdccm01dMsgsflc extends BaseScreenBean {

	public Cdccm01dMsgsflc() {
		super(new Cdccm01dMsgsfl(), "pgmq");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("05", "06", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdccm01d-msgsflc";
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