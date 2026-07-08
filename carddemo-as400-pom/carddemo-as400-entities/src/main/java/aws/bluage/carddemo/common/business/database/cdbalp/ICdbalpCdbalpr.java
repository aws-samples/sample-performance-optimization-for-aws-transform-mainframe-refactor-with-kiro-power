// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdbalp;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdbalpCdbalpr interface.
 * 
 */
public interface ICdbalpCdbalpr extends IRecordObject {
	
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
	* return the custid.
	*/
	Integer getCustid();
	
	/**
	* sets the value for custid.
	*/
	void setCustid(Integer value);
	
	/**
	* return the acctnum.
	*/
	Long getAcctnum();
	
	/**
	* sets the value for acctnum.
	*/
	void setAcctnum(Long value);
	
	/**
	* return the outstandbal.
	*/
	java.math.BigDecimal getOutstandbal();
	
	/**
	* sets the value for outstandbal.
	*/
	void setOutstandbal(java.math.BigDecimal value);
	
	/**
	* return the totpurchase.
	*/
	java.math.BigDecimal getTotpurchase();
	
	/**
	* sets the value for totpurchase.
	*/
	void setTotpurchase(java.math.BigDecimal value);
	
	/**
	* return the totpayment.
	*/
	java.math.BigDecimal getTotpayment();
	
	/**
	* sets the value for totpayment.
	*/
	void setTotpayment(java.math.BigDecimal value);
	
	/**
	* return the totcashadvance.
	*/
	java.math.BigDecimal getTotcashadvance();
	
	/**
	* sets the value for totcashadvance.
	*/
	void setTotcashadvance(java.math.BigDecimal value);
	
	/**
	* return the totrefund.
	*/
	java.math.BigDecimal getTotrefund();
	
	/**
	* sets the value for totrefund.
	*/
	void setTotrefund(java.math.BigDecimal value);
	
	/**
	* return the duedate.
	*/
	java.sql.Date getDuedate();
	
	/**
	* sets the value for duedate.
	*/
	void setDuedate(java.sql.Date value);
	
	/**
	* return the paymentstatus.
	*/
	String getPaymentstatus();
	
	/**
	* sets the value for paymentstatus.
	*/
	void setPaymentstatus(String value);
	
	/**
	* return the lastupddate.
	*/
	java.sql.Date getLastupddate();
	
	/**
	* sets the value for lastupddate.
	*/
	void setLastupddate(java.sql.Date value);
	
	/**
	* return the lastupdtime.
	*/
	java.sql.Timestamp getLastupdtime();
	
	/**
	* sets the value for lastupdtime.
	*/
	void setLastupdtime(java.sql.Timestamp value);
	
	/**
	* return the balcrtdt.
	*/
	Integer getBalcrtdt();
	
	/**
	* sets the value for balcrtdt.
	*/
	void setBalcrtdt(Integer value);
	
	/**
	* return the balcrttm.
	*/
	Integer getBalcrttm();
	
	/**
	* sets the value for balcrttm.
	*/
	void setBalcrttm(Integer value);
	
	/**
	* return the balchgdt.
	*/
	Integer getBalchgdt();
	
	/**
	* sets the value for balchgdt.
	*/
	void setBalchgdt(Integer value);
	
	/**
	* return the balchgtm.
	*/
	Integer getBalchgtm();
	
	/**
	* sets the value for balchgtm.
	*/
	void setBalchgtm(Integer value);
}
