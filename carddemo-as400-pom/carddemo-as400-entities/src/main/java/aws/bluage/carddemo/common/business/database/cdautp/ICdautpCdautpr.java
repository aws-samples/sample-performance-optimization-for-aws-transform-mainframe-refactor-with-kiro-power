// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdautp;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdautpCdautpr interface.
 * 
 */
public interface ICdautpCdautpr extends IRecordObject {
	
	/**
	* initialize all the fields' value
	*/
	void initData();
	
	/**
	* return the authid.
	*/
	Long getAuthid();
	
	/**
	* sets the value for authid.
	*/
	void setAuthid(Long value);
	/**
	* return the trnid.
	*/
	Long getTrnid();
	
	/**
	* sets the value for trnid.
	*/
	void setTrnid(Long value);
	/**
	* return the cardnum.
	*/
	Long getCardnum();
	
	/**
	* sets the value for cardnum.
	*/
	void setCardnum(Long value);
	/**
	* return the response.
	*/
	String getResponse();
	
	/**
	* sets the value for response.
	*/
	void setResponse(String value);
	/**
	* return the rspreason.
	*/
	String getRspreason();
	
	/**
	* sets the value for rspreason.
	*/
	void setRspreason(String value);
	/**
	* return the fraudflag.
	*/
	String getFraudflag();
	
	/**
	* sets the value for fraudflag.
	*/
	void setFraudflag(String value);
	/**
	* return the authdate.
	*/
	java.sql.Date getAuthdate();
	
	/**
	* sets the value for authdate.
	*/
	void setAuthdate(java.sql.Date value);
	/**
	* return the authtime.
	*/
	java.sql.Time getAuthtime();
	
	/**
	* sets the value for authtime.
	*/
	void setAuthtime(java.sql.Time value);
	/**
	* return the authuser.
	*/
	String getAuthuser();
	
	/**
	* sets the value for authuser.
	*/
	void setAuthuser(String value);
	/**
	* return the authpgm.
	*/
	String getAuthpgm();
	
	/**
	* sets the value for authpgm.
	*/
	void setAuthpgm(String value);
}