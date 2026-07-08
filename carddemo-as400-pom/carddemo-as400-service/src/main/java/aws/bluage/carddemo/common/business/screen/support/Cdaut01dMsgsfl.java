// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdaut01dMsgsfl.
 */
public class Cdaut01dMsgsfl extends ArrayScreenField {

	public Cdaut01dMsgsfl() {
		super("msgsfl", "sflmsgkey", "pgmq", "subfileMessageLine", "subfileSecondMessageLine", "subfileMessageId");
		
		addFKeys("03", "04", "05", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdaut01d-msgsfl";
	}

	/**
	* return the sflmsgkey.
	* @return the sflmsgkey.
	*/
	public SimpleScreenField getSflmsgkeyField(){
		return getField("sflmsgkey");
	}

	/**
	* return the sflmsgkey value.
	* @return the sflmsgkey value.
	*/
	public String getSflmsgkey(){
		return getField("sflmsgkey").getValue(String.class);
	}

	/**
	* sets the value for sflmsgkey.
	* @param value the new sflmsgkey.
	*/
	public void setSflmsgkey(String value){
		getField("sflmsgkey").setValue(value);
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
	* return the subfileMessageLine.
	* @return the subfileMessageLine.
	*/
	public SimpleScreenField getSubfileMessageLineField(){
		return getField("subfileMessageLine");
	}

	/**
	* return the subfileMessageLine value.
	* @return the subfileMessageLine value.
	*/
	public String getSubfileMessageLine(){
		return getField("subfileMessageLine").getValue(String.class);
	}

	/**
	* sets the value for subfileMessageLine.
	* @param value the new subfileMessageLine.
	*/
	public void setSubfileMessageLine(String value){
		getField("subfileMessageLine").setValue(value);
	}
	/**
	* return the subfileSecondMessageLine.
	* @return the subfileSecondMessageLine.
	*/
	public SimpleScreenField getSubfileSecondMessageLineField(){
		return getField("subfileSecondMessageLine");
	}

	/**
	* return the subfileSecondMessageLine value.
	* @return the subfileSecondMessageLine value.
	*/
	public String getSubfileSecondMessageLine(){
		return getField("subfileSecondMessageLine").getValue(String.class);
	}

	/**
	* sets the value for subfileSecondMessageLine.
	* @param value the new subfileSecondMessageLine.
	*/
	public void setSubfileSecondMessageLine(String value){
		getField("subfileSecondMessageLine").setValue(value);
	}
	/**
	* return the subfileMessageId.
	* @return the subfileMessageId.
	*/
	public SimpleScreenField getSubfileMessageIdField(){
		return getField("subfileMessageId");
	}

	/**
	* return the subfileMessageId value.
	* @return the subfileMessageId value.
	*/
	public String getSubfileMessageId(){
		return getField("subfileMessageId").getValue(String.class);
	}

	/**
	* sets the value for subfileMessageId.
	* @param value the new subfileMessageId.
	*/
	public void setSubfileMessageId(String value){
		getField("subfileMessageId").setValue(value);
	}
}