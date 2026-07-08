// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdccmp;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdccmpCdccmpr interface.
 * 
 */
public interface ICdccmpCdccmpr extends IRecordObject {
	
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
	* return the primarysec.
	*/
	String getPrimarysec();
	
	/**
	* sets the value for primarysec.
	*/
	void setPrimarysec(String value);
	/**
	* return the name.
	*/
	String getName();
	
	/**
	* sets the value for name.
	*/
	void setName(String value);
	/**
	* return the expirymo.
	*/
	Integer getExpirymo();
	
	/**
	* sets the value for expirymo.
	*/
	void setExpirymo(Integer value);
	/**
	* return the expiryyr.
	*/
	Integer getExpiryyr();
	
	/**
	* sets the value for expiryyr.
	*/
	void setExpiryyr(Integer value);
	/**
	* return the cvv.
	*/
	Integer getCvv();
	
	/**
	* sets the value for cvv.
	*/
	void setCvv(Integer value);
	/**
	* return the status.
	*/
	String getStatus();
	
	/**
	* sets the value for status.
	*/
	void setStatus(String value);
	/**
	* return the ccmcrtdt.
	*/
	Integer getCcmcrtdt();
	
	/**
	* sets the value for ccmcrtdt.
	*/
	void setCcmcrtdt(Integer value);
	/**
	* return the ccmcrttm.
	*/
	Integer getCcmcrttm();
	
	/**
	* sets the value for ccmcrttm.
	*/
	void setCcmcrttm(Integer value);
	/**
	* return the ccmcrtusr.
	*/
	String getCcmcrtusr();
	
	/**
	* sets the value for ccmcrtusr.
	*/
	void setCcmcrtusr(String value);
	/**
	* return the ccmcrtpgm.
	*/
	String getCcmcrtpgm();
	
	/**
	* sets the value for ccmcrtpgm.
	*/
	void setCcmcrtpgm(String value);
	/**
	* return the ccmchgdt.
	*/
	Integer getCcmchgdt();
	
	/**
	* sets the value for ccmchgdt.
	*/
	void setCcmchgdt(Integer value);
	/**
	* return the ccmchgtm.
	*/
	Integer getCcmchgtm();
	
	/**
	* sets the value for ccmchgtm.
	*/
	void setCcmchgtm(Integer value);
	/**
	* return the ccmchgusr.
	*/
	String getCcmchgusr();
	
	/**
	* sets the value for ccmchgusr.
	*/
	void setCcmchgusr(String value);
	/**
	* return the ccmchgpgm.
	*/
	String getCcmchgpgm();
	
	/**
	* sets the value for ccmchgpgm.
	*/
	void setCcmchgpgm(String value);
}