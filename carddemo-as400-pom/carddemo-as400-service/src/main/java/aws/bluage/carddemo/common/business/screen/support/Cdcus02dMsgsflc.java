// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdcus02dMsgsflc.
 */
public class Cdcus02dMsgsflc extends BaseScreenBean {

	public Cdcus02dMsgsflc() {
		super(new Cdcus02dMsgsfl(), "pgmq");
		setDspMode("*DS3");
		
		addFKeys("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdcus02d-msgsflc";
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