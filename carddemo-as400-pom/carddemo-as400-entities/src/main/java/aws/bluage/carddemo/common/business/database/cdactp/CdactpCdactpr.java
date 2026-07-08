// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdactp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdactpCdactpr 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDACTP (PF)       
 *  Author          : Subu              
 *  Date            : 02/11/2024        
 *  Description     : Account Master    
 * ***************************************************************
 */
@Entity
@Table(name="cdactp")
public class CdactpCdactpr extends AbstractJPAEntity implements ICdactpCdactpr {
	/**
	* acctnum
	* 'ACCOUNT NUMBER'
	*/
	@Column(name="acctnum")
	private Long acctnum;

	/**
	* active
	* 'ACCOUNT ACTIVE STATUS'
	*/
	@Column(name="active",length=1)
	private String active;

	/**
	* opendate
	* 'OPEN DATE'
	*/
	@Column(name="opendate")
	private java.sql.Date opendate;

	/**
	* expirydate
	* 'EXPIRY DATE'
	*/
	@Column(name="expirydate")
	private java.sql.Date expirydate;

	/**
	* credlimit
	* 'CREDIT LIMIT'
	*/
	@Column(name="credlimit" ,precision=2)
	private java.math.BigDecimal credlimit;

	/**
	* cashlimit
	* 'CASH LIMIT'
	*/
	@Column(name="cashlimit" ,precision=2)
	private java.math.BigDecimal cashlimit;

	/**
	* balance
	* 'ACCOUNT BALANCE'
	*/
	@Column(name="balance" ,precision=2)
	private java.math.BigDecimal balance;

	/**
	* curcredit
	* 'CURRENT CREDIT'
	*/
	@Column(name="curcredit" ,precision=2)
	private java.math.BigDecimal curcredit;

	/**
	* curdebit
	* 'CURRENT DEBIT'
	*/
	@Column(name="curdebit" ,precision=2)
	private java.math.BigDecimal curdebit;

	/**
	* acctgrp
	* 'ACCOUNT GROUP'
	*/
	@Column(name="acctgrp",length=10)
	private String acctgrp;

	/**
	* pricustid
	* 'PRIMARY CUSTOMER ID'
	*/
	@Column(name="pricustid")
	private Integer pricustid;

	/**
	* seccustid
	* 'SECONDARY CUSTOMER ID'
	*/
	@Column(name="seccustid")
	private Integer seccustid;

	/**
	* actcrtdt
	* 'CCM ADD DATE'
	*/
	@Column(name="actcrtdt")
	private Integer actcrtdt;

	/**
	* actcrttm
	* 'CCM ADD TIME'
	*/
	@Column(name="actcrttm")
	private Integer actcrttm;

	/**
	* actcrtusr
	* 'CCM ADD USER'
	*/
	@Column(name="actcrtusr",length=10)
	private String actcrtusr;

	/**
	* actcrtpgm
	* 'CCM ADD PROGRAM'
	*/
	@Column(name="actcrtpgm",length=10)
	private String actcrtpgm;

	/**
	* actchgdt
	* 'CCM CHANGE DATE'
	*/
	@Column(name="actchgdt")
	private Integer actchgdt;

	/**
	* actchgtm
	* 'CCM CHANGE DATE'
	*/
	@Column(name="actchgtm")
	private Integer actchgtm;

	/**
	* actchgusr
	* 'CCM CHANGE USER'
	*/
	@Column(name="actchgusr",length=10)
	private String actchgusr;

	/**
	* actchgpgm
	* 'CCM CHANGE PROGRAM'
	*/
	@Column(name="actchgpgm",length=10)
	private String actchgpgm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.acctnum = 0l;
		this.active = " ";
		this.opendate = new java.sql.Date(0);
		this.expirydate = new java.sql.Date(0);
		this.credlimit = java.math.BigDecimal.valueOf(0, 2);
		this.cashlimit = java.math.BigDecimal.valueOf(0, 2);
		this.balance = java.math.BigDecimal.valueOf(0, 2);
		this.curcredit = java.math.BigDecimal.valueOf(0, 2);
		this.curdebit = java.math.BigDecimal.valueOf(0, 2);
		this.acctgrp = "          ";
		this.pricustid = 0;
		this.seccustid = 0;
		this.actcrtdt = 0;
		this.actcrttm = 0;
		this.actcrtusr = "          ";
		this.actcrtpgm = "          ";
		this.actchgdt = 0;
		this.actchgtm = 0;
		this.actchgusr = "          ";
		this.actchgpgm = "          ";
	}

	/**
	* return the acctnum.
	* @return the acctnum.
	*/
	public Long getAcctnum(){
		return acctnum;
	}
	
	/**
	* sets the value for acctnum.
	* @param value the new acctnum.
	*/
	public void setAcctnum(Long value){
		this.acctnum = value;
	}
	
	/**
	* return the active.
	* @return the active.
	*/
	public String getActive(){
		return active;
	}
	
	/**
	* sets the value for active.
	* @param value the new active.
	*/
	public void setActive(String value){
		this.active = value;
	}
	
	/**
	* return the opendate.
	* @return the opendate.
	*/
	public java.sql.Date getOpendate(){
		return opendate;
	}
	
	/**
	* sets the value for opendate.
	* @param value the new opendate.
	*/
	public void setOpendate(java.sql.Date value){
		this.opendate = value;
	}
	
	/**
	* return the expirydate.
	* @return the expirydate.
	*/
	public java.sql.Date getExpirydate(){
		return expirydate;
	}
	
	/**
	* sets the value for expirydate.
	* @param value the new expirydate.
	*/
	public void setExpirydate(java.sql.Date value){
		this.expirydate = value;
	}
	
	/**
	* return the credlimit.
	* @return the credlimit.
	*/
	public java.math.BigDecimal getCredlimit(){
		return credlimit;
	}
	
	/**
	* sets the value for credlimit.
	* @param value the new credlimit.
	*/
	public void setCredlimit(java.math.BigDecimal value){
		this.credlimit = value;
	}
	
	/**
	* return the cashlimit.
	* @return the cashlimit.
	*/
	public java.math.BigDecimal getCashlimit(){
		return cashlimit;
	}
	
	/**
	* sets the value for cashlimit.
	* @param value the new cashlimit.
	*/
	public void setCashlimit(java.math.BigDecimal value){
		this.cashlimit = value;
	}
	
	/**
	* return the balance.
	* @return the balance.
	*/
	public java.math.BigDecimal getBalance(){
		return balance;
	}
	
	/**
	* sets the value for balance.
	* @param value the new balance.
	*/
	public void setBalance(java.math.BigDecimal value){
		this.balance = value;
	}
	
	/**
	* return the curcredit.
	* @return the curcredit.
	*/
	public java.math.BigDecimal getCurcredit(){
		return curcredit;
	}
	
	/**
	* sets the value for curcredit.
	* @param value the new curcredit.
	*/
	public void setCurcredit(java.math.BigDecimal value){
		this.curcredit = value;
	}
	
	/**
	* return the curdebit.
	* @return the curdebit.
	*/
	public java.math.BigDecimal getCurdebit(){
		return curdebit;
	}
	
	/**
	* sets the value for curdebit.
	* @param value the new curdebit.
	*/
	public void setCurdebit(java.math.BigDecimal value){
		this.curdebit = value;
	}
	
	/**
	* return the acctgrp.
	* @return the acctgrp.
	*/
	public String getAcctgrp(){
		return acctgrp;
	}
	
	/**
	* sets the value for acctgrp.
	* @param value the new acctgrp.
	*/
	public void setAcctgrp(String value){
		this.acctgrp = value;
	}
	
	/**
	* return the pricustid.
	* @return the pricustid.
	*/
	public Integer getPricustid(){
		return pricustid;
	}
	
	/**
	* sets the value for pricustid.
	* @param value the new pricustid.
	*/
	public void setPricustid(Integer value){
		this.pricustid = value;
	}
	
	/**
	* return the seccustid.
	* @return the seccustid.
	*/
	public Integer getSeccustid(){
		return seccustid;
	}
	
	/**
	* sets the value for seccustid.
	* @param value the new seccustid.
	*/
	public void setSeccustid(Integer value){
		this.seccustid = value;
	}
	
	/**
	* return the actcrtdt.
	* @return the actcrtdt.
	*/
	public Integer getActcrtdt(){
		return actcrtdt;
	}
	
	/**
	* sets the value for actcrtdt.
	* @param value the new actcrtdt.
	*/
	public void setActcrtdt(Integer value){
		this.actcrtdt = value;
	}
	
	/**
	* return the actcrttm.
	* @return the actcrttm.
	*/
	public Integer getActcrttm(){
		return actcrttm;
	}
	
	/**
	* sets the value for actcrttm.
	* @param value the new actcrttm.
	*/
	public void setActcrttm(Integer value){
		this.actcrttm = value;
	}
	
	/**
	* return the actcrtusr.
	* @return the actcrtusr.
	*/
	public String getActcrtusr(){
		return actcrtusr;
	}
	
	/**
	* sets the value for actcrtusr.
	* @param value the new actcrtusr.
	*/
	public void setActcrtusr(String value){
		this.actcrtusr = value;
	}
	
	/**
	* return the actcrtpgm.
	* @return the actcrtpgm.
	*/
	public String getActcrtpgm(){
		return actcrtpgm;
	}
	
	/**
	* sets the value for actcrtpgm.
	* @param value the new actcrtpgm.
	*/
	public void setActcrtpgm(String value){
		this.actcrtpgm = value;
	}
	
	/**
	* return the actchgdt.
	* @return the actchgdt.
	*/
	public Integer getActchgdt(){
		return actchgdt;
	}
	
	/**
	* sets the value for actchgdt.
	* @param value the new actchgdt.
	*/
	public void setActchgdt(Integer value){
		this.actchgdt = value;
	}
	
	/**
	* return the actchgtm.
	* @return the actchgtm.
	*/
	public Integer getActchgtm(){
		return actchgtm;
	}
	
	/**
	* sets the value for actchgtm.
	* @param value the new actchgtm.
	*/
	public void setActchgtm(Integer value){
		this.actchgtm = value;
	}
	
	/**
	* return the actchgusr.
	* @return the actchgusr.
	*/
	public String getActchgusr(){
		return actchgusr;
	}
	
	/**
	* sets the value for actchgusr.
	* @param value the new actchgusr.
	*/
	public void setActchgusr(String value){
		this.actchgusr = value;
	}
	
	/**
	* return the actchgpgm.
	* @return the actchgpgm.
	*/
	public String getActchgpgm(){
		return actchgpgm;
	}
	
	/**
	* sets the value for actchgpgm.
	* @param value the new actchgpgm.
	*/
	public void setActchgpgm(String value){
		this.actchgpgm = value;
	}
	
}