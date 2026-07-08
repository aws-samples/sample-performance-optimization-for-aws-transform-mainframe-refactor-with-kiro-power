// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdusrp;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdusrpCdusrpr interface.
 * 
 */
public interface ICdusrpCdusrpr extends IRecordObject {
	
	/**
	* initialize all the fields' value
	*/
	void initData();
	
	/**
	* return the userid.
	*/
	String getUserid();
	
	/**
	* sets the value for userid.
	*/
	void setUserid(String value);
	/**
	* return the firstname.
	*/
	String getFirstname();
	
	/**
	* sets the value for firstname.
	*/
	void setFirstname(String value);
	/**
	* return the lastname.
	*/
	String getLastname();
	
	/**
	* sets the value for lastname.
	*/
	void setLastname(String value);
	/**
	* return the type.
	*/
	String getType();
	
	/**
	* sets the value for type.
	*/
	void setType(String value);
	/**
	* return the email.
	*/
	String getEmail();
	
	/**
	* sets the value for email.
	*/
	void setEmail(String value);
	/**
	* return the status.
	*/
	String getStatus();
	
	/**
	* sets the value for status.
	*/
	void setStatus(String value);
	/**
	* return the usrcrtdt.
	*/
	Integer getUsrcrtdt();
	
	/**
	* sets the value for usrcrtdt.
	*/
	void setUsrcrtdt(Integer value);
	/**
	* return the usrcrttm.
	*/
	Integer getUsrcrttm();
	
	/**
	* sets the value for usrcrttm.
	*/
	void setUsrcrttm(Integer value);
	/**
	* return the usrcrtusr.
	*/
	String getUsrcrtusr();
	
	/**
	* sets the value for usrcrtusr.
	*/
	void setUsrcrtusr(String value);
	/**
	* return the usrcrtpgm.
	*/
	String getUsrcrtpgm();
	
	/**
	* sets the value for usrcrtpgm.
	*/
	void setUsrcrtpgm(String value);
	/**
	* return the usrchgdt.
	*/
	Integer getUsrchgdt();
	
	/**
	* sets the value for usrchgdt.
	*/
	void setUsrchgdt(Integer value);
	/**
	* return the usrchgtm.
	*/
	Integer getUsrchgtm();
	
	/**
	* sets the value for usrchgtm.
	*/
	void setUsrchgtm(Integer value);
	/**
	* return the usrchgusr.
	*/
	String getUsrchgusr();
	
	/**
	* sets the value for usrchgusr.
	*/
	void setUsrchgusr(String value);
	/**
	* return the usrchgpgm.
	*/
	String getUsrchgpgm();
	
	/**
	* sets the value for usrchgpgm.
	*/
	void setUsrchgpgm(String value);
}