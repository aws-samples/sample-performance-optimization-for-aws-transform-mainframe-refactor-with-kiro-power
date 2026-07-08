// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdccm01dDelerrwin.
 */
public class Cdccm01dDelerrwin extends WindowScreenBean {

	public Cdccm01dDelerrwin() {
		super("cardnum", "status", "custid", "acctnum", "errdelw");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("05", "06", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdccm01d-delerrwin";
	}

	/**
	* return the cardnum.
	* @return the cardnum.
	*/
	public SimpleScreenField getCardnumField(){
		return getField("cardnum");
	}

	/**
	* return the cardnum value.
	* @return the cardnum value.
	*/
	public Long getCardnum(){
		return getField("cardnum").getValue(Long.class);
	}

	/**
	* sets the value for cardnum.
	* @param value the new cardnum.
	*/
	public void setCardnum(Long value){
		getField("cardnum").setValue(value);
	}
	/**
	* return the status.
	* @return the status.
	*/
	public SimpleScreenField getStatusField(){
		return getField("status");
	}

	/**
	* return the status value.
	* @return the status value.
	*/
	public String getStatus(){
		return getField("status").getValue(String.class);
	}

	/**
	* sets the value for status.
	* @param value the new status.
	*/
	public void setStatus(String value){
		getField("status").setValue(value);
	}
	/**
	* return the custid.
	* @return the custid.
	*/
	public SimpleScreenField getCustidField(){
		return getField("custid");
	}

	/**
	* return the custid value.
	* @return the custid value.
	*/
	public String getCustid(){
		return getField("custid").getValue(String.class);
	}

	/**
	* sets the value for custid.
	* @param value the new custid.
	*/
	public void setCustid(String value){
		getField("custid").setValue(value);
	}
	/**
	* return the acctnum.
	* @return the acctnum.
	*/
	public SimpleScreenField getAcctnumField(){
		return getField("acctnum");
	}

	/**
	* return the acctnum value.
	* @return the acctnum value.
	*/
	public String getAcctnum(){
		return getField("acctnum").getValue(String.class);
	}

	/**
	* sets the value for acctnum.
	* @param value the new acctnum.
	*/
	public void setAcctnum(String value){
		getField("acctnum").setValue(value);
	}
	/**
	* return the errdelw.
	* @return the errdelw.
	*/
	public SimpleScreenField getErrdelwField(){
		return getField("errdelw");
	}

	/**
	* return the errdelw value.
	* @return the errdelw value.
	*/
	public String getErrdelw(){
		return getField("errdelw").getValue(String.class);
	}

	/**
	* sets the value for errdelw.
	* @param value the new errdelw.
	*/
	public void setErrdelw(String value){
		getField("errdelw").setValue(value);
	}
}