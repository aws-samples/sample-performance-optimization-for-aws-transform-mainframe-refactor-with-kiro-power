// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdtrn01dMsgsfl.
 */
public class Cdtrn01dMsgsfl extends ArrayScreenField {

	public Cdtrn01dMsgsfl() {
		super("msgsfl", "msgkey", "pgmq", "subfileMessageLine", "subfileSecondMessageLine", "subfileMessageId");
		
		

	}

	public String getComponentId() {
		return "cdtrn01d-msgsfl";
	}

	/**
	* return the msgkey.
	* @return the msgkey.
	*/
	public SimpleScreenField getMsgkeyField(){
		return getField("msgkey");
	}

	/**
	* return the msgkey value.
	* @return the msgkey value.
	*/
	public String getMsgkey(){
		return getField("msgkey").getValue(String.class);
	}

	/**
	* sets the value for msgkey.
	* @param value the new msgkey.
	*/
	public void setMsgkey(String value){
		getField("msgkey").setValue(value);
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