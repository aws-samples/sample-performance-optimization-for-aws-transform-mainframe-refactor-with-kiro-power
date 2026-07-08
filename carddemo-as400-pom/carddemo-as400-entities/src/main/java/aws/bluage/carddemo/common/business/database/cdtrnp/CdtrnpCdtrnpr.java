// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdtrnp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdtrnpCdtrnpr 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDTRNP (PF)       
 *  Author          : Subu              
 *  Date            : 02/11/2024        
 *  Description     : Transaction Master
 * ***************************************************************
 */
@Entity
@Table(name="cdtrnp")
public class CdtrnpCdtrnpr extends AbstractJPAEntity implements ICdtrnpCdtrnpr {
	/**
	* trnid
	* 'TRANSACTION ID'
	*/
	@Column(name="trnid")
	private Long trnid;

	/**
	* cardnum
	* 'CREDIT CARD NUMBER'
	*/
	@Column(name="cardnum")
	private Long cardnum;

	/**
	* typecd
	* 'TYPE CODE'
	*/
	@Column(name="typecd",length=2)
	private String typecd;

	/**
	* categcd
	* 'CATEGORY CODE'
	*/
	@Column(name="categcd",length=4)
	private String categcd;

	/**
	* source
	* 'SOURCE'
	*/
	@Column(name="source",length=1)
	private String source;

	/**
	* dess
	* 'DESCRIPTION'
	*/
	@Column(name="dess",length=30)
	private String dess;

	/**
	* amount
	* 'AMOUNT'
	*/
	@Column(name="amount" ,precision=2)
	private java.math.BigDecimal amount;

	/**
	* origdate
	* 'ORIGINATION DATE'
	*/
	@Column(name="origdate")
	private java.sql.Date origdate;

	/**
	* procdate
	* 'PROCESS DATE'
	*/
	@Column(name="procdate")
	private java.sql.Date procdate;

	/**
	* merchid
	* 'MERCHANT ID'
	*/
	@Column(name="merchid")
	private Integer merchid;

	/**
	* trnstatus
	* 'TRANSACTION STATUS'
	*/
	@Column(name="trnstatus",length=1)
	private String trnstatus;

	/**
	* trncrtdt
	* 'TRN ADD DATE'
	*/
	@Column(name="trncrtdt")
	private Integer trncrtdt;

	/**
	* trncrttm
	* 'TRN ADD TIME'
	*/
	@Column(name="trncrttm")
	private Integer trncrttm;

	/**
	* trncrtusr
	* 'TRN ADD USER'
	*/
	@Column(name="trncrtusr",length=10)
	private String trncrtusr;

	/**
	* trncrtpgm
	* 'TRN ADD PROGRAM'
	*/
	@Column(name="trncrtpgm",length=10)
	private String trncrtpgm;

	/**
	* trnchgdt
	* 'TRN CHANGE DATE'
	*/
	@Column(name="trnchgdt")
	private Integer trnchgdt;

	/**
	* trnchgtm
	* 'TRN CHANGE TIME'
	*/
	@Column(name="trnchgtm")
	private Integer trnchgtm;

	/**
	* trnchgusr
	* 'TRN CHANGE USER'
	*/
	@Column(name="trnchgusr",length=10)
	private String trnchgusr;

	/**
	* trnchgpgm
	* 'TRN CHANGE PROGRAM'
	*/
	@Column(name="trnchgpgm",length=10)
	private String trnchgpgm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.trnid = 0l;
		this.cardnum = 0l;
		this.typecd = "  ";
		this.categcd = "    ";
		this.source = " ";
		this.dess = "                              ";
		this.amount = java.math.BigDecimal.valueOf(0, 2);
		this.origdate = new java.sql.Date(0);
		this.procdate = new java.sql.Date(0);
		this.merchid = 0;
		this.trnstatus = " ";
		this.trncrtdt = 0;
		this.trncrttm = 0;
		this.trncrtusr = "          ";
		this.trncrtpgm = "          ";
		this.trnchgdt = 0;
		this.trnchgtm = 0;
		this.trnchgusr = "          ";
		this.trnchgpgm = "          ";
	}

	/**
	* return the trnid.
	* @return the trnid.
	*/
	public Long getTrnid(){
		return trnid;
	}
	
	/**
	* sets the value for trnid.
	* @param value the new trnid.
	*/
	public void setTrnid(Long value){
		this.trnid = value;
	}
	
	/**
	* return the cardnum.
	* @return the cardnum.
	*/
	public Long getCardnum(){
		return cardnum;
	}
	
	/**
	* sets the value for cardnum.
	* @param value the new cardnum.
	*/
	public void setCardnum(Long value){
		this.cardnum = value;
	}
	
	/**
	* return the typecd.
	* @return the typecd.
	*/
	public String getTypecd(){
		return typecd;
	}
	
	/**
	* sets the value for typecd.
	* @param value the new typecd.
	*/
	public void setTypecd(String value){
		this.typecd = value;
	}
	
	/**
	* return the categcd.
	* @return the categcd.
	*/
	public String getCategcd(){
		return categcd;
	}
	
	/**
	* sets the value for categcd.
	* @param value the new categcd.
	*/
	public void setCategcd(String value){
		this.categcd = value;
	}
	
	/**
	* return the source.
	* @return the source.
	*/
	public String getSource(){
		return source;
	}
	
	/**
	* sets the value for source.
	* @param value the new source.
	*/
	public void setSource(String value){
		this.source = value;
	}
	
	/**
	* return the dess.
	* @return the dess.
	*/
	public String getDess(){
		return dess;
	}
	
	/**
	* sets the value for dess.
	* @param value the new dess.
	*/
	public void setDess(String value){
		this.dess = value;
	}
	
	/**
	* return the amount.
	* @return the amount.
	*/
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	
	/**
	* sets the value for amount.
	* @param value the new amount.
	*/
	public void setAmount(java.math.BigDecimal value){
		this.amount = value;
	}
	
	/**
	* return the origdate.
	* @return the origdate.
	*/
	public java.sql.Date getOrigdate(){
		return origdate;
	}
	
	/**
	* sets the value for origdate.
	* @param value the new origdate.
	*/
	public void setOrigdate(java.sql.Date value){
		this.origdate = value;
	}
	
	/**
	* return the procdate.
	* @return the procdate.
	*/
	public java.sql.Date getProcdate(){
		return procdate;
	}
	
	/**
	* sets the value for procdate.
	* @param value the new procdate.
	*/
	public void setProcdate(java.sql.Date value){
		this.procdate = value;
	}
	
	/**
	* return the merchid.
	* @return the merchid.
	*/
	public Integer getMerchid(){
		return merchid;
	}
	
	/**
	* sets the value for merchid.
	* @param value the new merchid.
	*/
	public void setMerchid(Integer value){
		this.merchid = value;
	}
	
	/**
	* return the trnstatus.
	* @return the trnstatus.
	*/
	public String getTrnstatus(){
		return trnstatus;
	}
	
	/**
	* sets the value for trnstatus.
	* @param value the new trnstatus.
	*/
	public void setTrnstatus(String value){
		this.trnstatus = value;
	}
	
	/**
	* return the trncrtdt.
	* @return the trncrtdt.
	*/
	public Integer getTrncrtdt(){
		return trncrtdt;
	}
	
	/**
	* sets the value for trncrtdt.
	* @param value the new trncrtdt.
	*/
	public void setTrncrtdt(Integer value){
		this.trncrtdt = value;
	}
	
	/**
	* return the trncrttm.
	* @return the trncrttm.
	*/
	public Integer getTrncrttm(){
		return trncrttm;
	}
	
	/**
	* sets the value for trncrttm.
	* @param value the new trncrttm.
	*/
	public void setTrncrttm(Integer value){
		this.trncrttm = value;
	}
	
	/**
	* return the trncrtusr.
	* @return the trncrtusr.
	*/
	public String getTrncrtusr(){
		return trncrtusr;
	}
	
	/**
	* sets the value for trncrtusr.
	* @param value the new trncrtusr.
	*/
	public void setTrncrtusr(String value){
		this.trncrtusr = value;
	}
	
	/**
	* return the trncrtpgm.
	* @return the trncrtpgm.
	*/
	public String getTrncrtpgm(){
		return trncrtpgm;
	}
	
	/**
	* sets the value for trncrtpgm.
	* @param value the new trncrtpgm.
	*/
	public void setTrncrtpgm(String value){
		this.trncrtpgm = value;
	}
	
	/**
	* return the trnchgdt.
	* @return the trnchgdt.
	*/
	public Integer getTrnchgdt(){
		return trnchgdt;
	}
	
	/**
	* sets the value for trnchgdt.
	* @param value the new trnchgdt.
	*/
	public void setTrnchgdt(Integer value){
		this.trnchgdt = value;
	}
	
	/**
	* return the trnchgtm.
	* @return the trnchgtm.
	*/
	public Integer getTrnchgtm(){
		return trnchgtm;
	}
	
	/**
	* sets the value for trnchgtm.
	* @param value the new trnchgtm.
	*/
	public void setTrnchgtm(Integer value){
		this.trnchgtm = value;
	}
	
	/**
	* return the trnchgusr.
	* @return the trnchgusr.
	*/
	public String getTrnchgusr(){
		return trnchgusr;
	}
	
	/**
	* sets the value for trnchgusr.
	* @param value the new trnchgusr.
	*/
	public void setTrnchgusr(String value){
		this.trnchgusr = value;
	}
	
	/**
	* return the trnchgpgm.
	* @return the trnchgpgm.
	*/
	public String getTrnchgpgm(){
		return trnchgpgm;
	}
	
	/**
	* sets the value for trnchgpgm.
	* @param value the new trnchgpgm.
	*/
	public void setTrnchgpgm(String value){
		this.trnchgpgm = value;
	}
	
}