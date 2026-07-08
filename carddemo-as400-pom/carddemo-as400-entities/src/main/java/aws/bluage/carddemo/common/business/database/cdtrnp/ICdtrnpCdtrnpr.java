// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdtrnp;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdtrnpCdtrnpr interface.
 * 
 */
public interface ICdtrnpCdtrnpr extends IRecordObject {
	
	/**
	* initialize all the fields' value
	*/
	void initData();
	
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
	* return the typecd.
	*/
	String getTypecd();
	
	/**
	* sets the value for typecd.
	*/
	void setTypecd(String value);
	/**
	* return the categcd.
	*/
	String getCategcd();
	
	/**
	* sets the value for categcd.
	*/
	void setCategcd(String value);
	/**
	* return the source.
	*/
	String getSource();
	
	/**
	* sets the value for source.
	*/
	void setSource(String value);
	/**
	* return the dess.
	*/
	String getDess();
	
	/**
	* sets the value for dess.
	*/
	void setDess(String value);
	/**
	* return the amount.
	*/
	java.math.BigDecimal getAmount();
	
	/**
	* sets the value for amount.
	*/
	void setAmount(java.math.BigDecimal value);
	/**
	* return the origdate.
	*/
	java.sql.Date getOrigdate();
	
	/**
	* sets the value for origdate.
	*/
	void setOrigdate(java.sql.Date value);
	/**
	* return the procdate.
	*/
	java.sql.Date getProcdate();
	
	/**
	* sets the value for procdate.
	*/
	void setProcdate(java.sql.Date value);
	/**
	* return the merchid.
	*/
	Integer getMerchid();
	
	/**
	* sets the value for merchid.
	*/
	void setMerchid(Integer value);
	/**
	* return the trnstatus.
	*/
	String getTrnstatus();
	
	/**
	* sets the value for trnstatus.
	*/
	void setTrnstatus(String value);
	/**
	* return the trncrtdt.
	*/
	Integer getTrncrtdt();
	
	/**
	* sets the value for trncrtdt.
	*/
	void setTrncrtdt(Integer value);
	/**
	* return the trncrttm.
	*/
	Integer getTrncrttm();
	
	/**
	* sets the value for trncrttm.
	*/
	void setTrncrttm(Integer value);
	/**
	* return the trncrtusr.
	*/
	String getTrncrtusr();
	
	/**
	* sets the value for trncrtusr.
	*/
	void setTrncrtusr(String value);
	/**
	* return the trncrtpgm.
	*/
	String getTrncrtpgm();
	
	/**
	* sets the value for trncrtpgm.
	*/
	void setTrncrtpgm(String value);
	/**
	* return the trnchgdt.
	*/
	Integer getTrnchgdt();
	
	/**
	* sets the value for trnchgdt.
	*/
	void setTrnchgdt(Integer value);
	/**
	* return the trnchgtm.
	*/
	Integer getTrnchgtm();
	
	/**
	* sets the value for trnchgtm.
	*/
	void setTrnchgtm(Integer value);
	/**
	* return the trnchgusr.
	*/
	String getTrnchgusr();
	
	/**
	* sets the value for trnchgusr.
	*/
	void setTrnchgusr(String value);
	/**
	* return the trnchgpgm.
	*/
	String getTrnchgpgm();
	
	/**
	* sets the value for trnchgpgm.
	*/
	void setTrnchgpgm(String value);
}