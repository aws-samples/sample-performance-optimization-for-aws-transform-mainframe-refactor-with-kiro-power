// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdbalp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdbalpCdbalpr 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDBALP (PF)       
 *  Author          : Generated              
 *  Date            : 02/27/2026        
 *  Description     : Balance Master
 * ***************************************************************
 */
@Entity
@Table(name="cdbalp")
public class CdbalpCdbalpr extends AbstractJPAEntity implements ICdbalpCdbalpr {
	/**
	* cardnum
	* 'CREDIT CARD NUMBER'
	*/
	@Column(name="cardnum")
	private Long cardnum;

	/**
	* custid
	* 'CUSTOMER ID'
	*/
	@Column(name="custid")
	private Integer custid;

	/**
	* acctnum
	* 'ACCOUNT NUMBER'
	*/
	@Column(name="acctnum")
	private Long acctnum;

	/**
	* outstandbal
	* 'OUTSTANDING BALANCE'
	*/
	@Column(name="outstandbal", precision=2)
	private java.math.BigDecimal outstandbal;

	/**
	* totpurchase
	* 'TOTAL PURCHASES'
	*/
	@Column(name="totpurchase", precision=2)
	private java.math.BigDecimal totpurchase;

	/**
	* totpayment
	* 'TOTAL PAYMENTS'
	*/
	@Column(name="totpayment", precision=2)
	private java.math.BigDecimal totpayment;

	/**
	* totcashadvance
	* 'TOTAL CASH ADVANCES'
	*/
	@Column(name="totcashadvance", precision=2)
	private java.math.BigDecimal totcashadvance;

	/**
	* totrefund
	* 'TOTAL REFUNDS'
	*/
	@Column(name="totrefund", precision=2)
	private java.math.BigDecimal totrefund;

	/**
	* duedate
	* 'PAYMENT DUE DATE'
	*/
	@Column(name="duedate")
	private java.sql.Date duedate;

	/**
	* paymentstatus
	* 'PAYMENT STATUS'
	*/
	@Column(name="paymentstatus", length=1)
	private String paymentstatus;

	/**
	* lastupddate
	* 'LAST UPDATE DATE'
	*/
	@Column(name="lastupddate")
	private java.sql.Date lastupddate;

	/**
	* lastupdtime
	* 'LAST UPDATE TIMESTAMP'
	*/
	@Column(name="lastupdtime")
	private java.sql.Timestamp lastupdtime;

	/**
	* balcrtdt
	* 'BAL CREATE DATE'
	*/
	@Column(name="balcrtdt")
	private Integer balcrtdt;

	/**
	* balcrttm
	* 'BAL CREATE TIME'
	*/
	@Column(name="balcrttm")
	private Integer balcrttm;

	/**
	* balchgdt
	* 'BAL CHANGE DATE'
	*/
	@Column(name="balchgdt")
	private Integer balchgdt;

	/**
	* balchgtm
	* 'BAL CHANGE TIME'
	*/
	@Column(name="balchgtm")
	private Integer balchgtm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.cardnum = 0l;
		this.custid = 0;
		this.acctnum = 0l;
		this.outstandbal = java.math.BigDecimal.valueOf(0, 2);
		this.totpurchase = java.math.BigDecimal.valueOf(0, 2);
		this.totpayment = java.math.BigDecimal.valueOf(0, 2);
		this.totcashadvance = java.math.BigDecimal.valueOf(0, 2);
		this.totrefund = java.math.BigDecimal.valueOf(0, 2);
		this.duedate = new java.sql.Date(0);
		this.paymentstatus = " ";
		this.lastupddate = new java.sql.Date(0);
		this.lastupdtime = new java.sql.Timestamp(0);
		this.balcrtdt = 0;
		this.balcrttm = 0;
		this.balchgdt = 0;
		this.balchgtm = 0;
	}

	public Long getCardnum(){
		return cardnum;
	}
	
	public void setCardnum(Long value){
		this.cardnum = value;
	}
	
	public Integer getCustid(){
		return custid;
	}
	
	public void setCustid(Integer value){
		this.custid = value;
	}
	
	public Long getAcctnum(){
		return acctnum;
	}
	
	public void setAcctnum(Long value){
		this.acctnum = value;
	}
	
	public java.math.BigDecimal getOutstandbal(){
		return outstandbal;
	}
	
	public void setOutstandbal(java.math.BigDecimal value){
		this.outstandbal = value;
	}
	
	public java.math.BigDecimal getTotpurchase(){
		return totpurchase;
	}
	
	public void setTotpurchase(java.math.BigDecimal value){
		this.totpurchase = value;
	}
	
	public java.math.BigDecimal getTotpayment(){
		return totpayment;
	}
	
	public void setTotpayment(java.math.BigDecimal value){
		this.totpayment = value;
	}
	
	public java.math.BigDecimal getTotcashadvance(){
		return totcashadvance;
	}
	
	public void setTotcashadvance(java.math.BigDecimal value){
		this.totcashadvance = value;
	}
	
	public java.math.BigDecimal getTotrefund(){
		return totrefund;
	}
	
	public void setTotrefund(java.math.BigDecimal value){
		this.totrefund = value;
	}
	
	public java.sql.Date getDuedate(){
		return duedate;
	}
	
	public void setDuedate(java.sql.Date value){
		this.duedate = value;
	}
	
	public String getPaymentstatus(){
		return paymentstatus;
	}
	
	public void setPaymentstatus(String value){
		this.paymentstatus = value;
	}
	
	public java.sql.Date getLastupddate(){
		return lastupddate;
	}
	
	public void setLastupddate(java.sql.Date value){
		this.lastupddate = value;
	}
	
	public java.sql.Timestamp getLastupdtime(){
		return lastupdtime;
	}
	
	public void setLastupdtime(java.sql.Timestamp value){
		this.lastupdtime = value;
	}
	
	public Integer getBalcrtdt(){
		return balcrtdt;
	}
	
	public void setBalcrtdt(Integer value){
		this.balcrtdt = value;
	}
	
	public Integer getBalcrttm(){
		return balcrttm;
	}
	
	public void setBalcrttm(Integer value){
		this.balcrttm = value;
	}
	
	public Integer getBalchgdt(){
		return balchgdt;
	}
	
	public void setBalchgdt(Integer value){
		this.balchgdt = value;
	}
	
	public Integer getBalchgtm(){
		return balchgtm;
	}
	
	public void setBalchgtm(Integer value){
		this.balchgtm = value;
	}
	
}
