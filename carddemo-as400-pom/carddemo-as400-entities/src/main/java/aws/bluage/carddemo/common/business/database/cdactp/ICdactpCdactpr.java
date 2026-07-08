// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdactp;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdactpCdactpr interface.
 * 
 */
public interface ICdactpCdactpr extends IRecordObject {
	
	/**
	* initialize all the fields' value
	*/
	void initData();
	
	/**
	* return the acctnum.
	*/
	Long getAcctnum();
	
	/**
	* sets the value for acctnum.
	*/
	void setAcctnum(Long value);
	/**
	* return the active.
	*/
	String getActive();
	
	/**
	* sets the value for active.
	*/
	void setActive(String value);
	/**
	* return the opendate.
	*/
	java.sql.Date getOpendate();
	
	/**
	* sets the value for opendate.
	*/
	void setOpendate(java.sql.Date value);
	/**
	* return the expirydate.
	*/
	java.sql.Date getExpirydate();
	
	/**
	* sets the value for expirydate.
	*/
	void setExpirydate(java.sql.Date value);
	/**
	* return the credlimit.
	*/
	java.math.BigDecimal getCredlimit();
	
	/**
	* sets the value for credlimit.
	*/
	void setCredlimit(java.math.BigDecimal value);
	/**
	* return the cashlimit.
	*/
	java.math.BigDecimal getCashlimit();
	
	/**
	* sets the value for cashlimit.
	*/
	void setCashlimit(java.math.BigDecimal value);
	/**
	* return the balance.
	*/
	java.math.BigDecimal getBalance();
	
	/**
	* sets the value for balance.
	*/
	void setBalance(java.math.BigDecimal value);
	/**
	* return the curcredit.
	*/
	java.math.BigDecimal getCurcredit();
	
	/**
	* sets the value for curcredit.
	*/
	void setCurcredit(java.math.BigDecimal value);
	/**
	* return the curdebit.
	*/
	java.math.BigDecimal getCurdebit();
	
	/**
	* sets the value for curdebit.
	*/
	void setCurdebit(java.math.BigDecimal value);
	/**
	* return the acctgrp.
	*/
	String getAcctgrp();
	
	/**
	* sets the value for acctgrp.
	*/
	void setAcctgrp(String value);
	/**
	* return the pricustid.
	*/
	Integer getPricustid();
	
	/**
	* sets the value for pricustid.
	*/
	void setPricustid(Integer value);
	/**
	* return the seccustid.
	*/
	Integer getSeccustid();
	
	/**
	* sets the value for seccustid.
	*/
	void setSeccustid(Integer value);
	/**
	* return the actcrtdt.
	*/
	Integer getActcrtdt();
	
	/**
	* sets the value for actcrtdt.
	*/
	void setActcrtdt(Integer value);
	/**
	* return the actcrttm.
	*/
	Integer getActcrttm();
	
	/**
	* sets the value for actcrttm.
	*/
	void setActcrttm(Integer value);
	/**
	* return the actcrtusr.
	*/
	String getActcrtusr();
	
	/**
	* sets the value for actcrtusr.
	*/
	void setActcrtusr(String value);
	/**
	* return the actcrtpgm.
	*/
	String getActcrtpgm();
	
	/**
	* sets the value for actcrtpgm.
	*/
	void setActcrtpgm(String value);
	/**
	* return the actchgdt.
	*/
	Integer getActchgdt();
	
	/**
	* sets the value for actchgdt.
	*/
	void setActchgdt(Integer value);
	/**
	* return the actchgtm.
	*/
	Integer getActchgtm();
	
	/**
	* sets the value for actchgtm.
	*/
	void setActchgtm(Integer value);
	/**
	* return the actchgusr.
	*/
	String getActchgusr();
	
	/**
	* sets the value for actchgusr.
	*/
	void setActchgusr(String value);
	/**
	* return the actchgpgm.
	*/
	String getActchgpgm();
	
	/**
	* sets the value for actchgpgm.
	*/
	void setActchgpgm(String value);
}