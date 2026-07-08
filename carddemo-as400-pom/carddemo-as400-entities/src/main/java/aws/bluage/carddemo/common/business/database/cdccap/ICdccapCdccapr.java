// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdccap;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdccapCdccapr interface.
 * 
 */
public interface ICdccapCdccapr extends IRecordObject {
	
	/**
	* initialize all the fields' value
	*/
	void initData();
	
	/**
	* return the cardnum.
	*/
	Long getCardnum();
	
	/**
	* sets the value for cardnum.
	*/
	void setCardnum(Long value);
	/**
	* return the ccaseqno.
	*/
	Integer getCcaseqno();
	
	/**
	* sets the value for ccaseqno.
	*/
	void setCcaseqno(Integer value);
	/**
	* return the activity.
	*/
	String getActivity();
	
	/**
	* sets the value for activity.
	*/
	void setActivity(String value);
	/**
	* return the dess.
	*/
	String getDess();
	
	/**
	* sets the value for dess.
	*/
	void setDess(String value);
	/**
	* return the ccauser.
	*/
	String getCcauser();
	
	/**
	* sets the value for ccauser.
	*/
	void setCcauser(String value);
	/**
	* return the ccatmstamp.
	*/
	java.sql.Timestamp getCcatmstamp();
	
	/**
	* sets the value for ccatmstamp.
	*/
	void setCcatmstamp(java.sql.Timestamp value);
}