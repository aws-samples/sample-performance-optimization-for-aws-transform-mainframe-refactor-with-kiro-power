// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdccmp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdccmpCdccmpr 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDCCMP (PF)       
 *  Author          : Subu              
 *  Date            : 02/11/2024        
 *  Description     : Credit Card Master
 * ***************************************************************
 */
@Entity
@Table(name="cdccmp")
public class CdccmpCdccmpr extends AbstractJPAEntity implements ICdccmpCdccmpr {
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
	* primarysec
	* 'CC PRIMARY OR SECONDARY'
	*/
	@Column(name="primarysec",length=1)
	private String primarysec;

	/**
	* name
	* 'NAME ON CC'
	*/
	@Column(name="name",length=25)
	private String name;

	/**
	* expirymo
	* 'CC EXPIRY MONTH'
	*/
	@Column(name="expirymo")
	private Integer expirymo;

	/**
	* expiryyr
	* 'CC EXPIRY YEAR'
	*/
	@Column(name="expiryyr")
	private Integer expiryyr;

	/**
	* cvv
	* 'CC CVV'
	*/
	@Column(name="cvv")
	private Integer cvv;

	/**
	* status
	* 'CC STATUS'
	*/
	@Column(name="status",length=1)
	private String status;

	/**
	* ccmcrtdt
	* 'CCM ADD DATE'
	*/
	@Column(name="ccmcrtdt")
	private Integer ccmcrtdt;

	/**
	* ccmcrttm
	* 'CCM ADD TIME'
	*/
	@Column(name="ccmcrttm")
	private Integer ccmcrttm;

	/**
	* ccmcrtusr
	* 'CCM ADD USER'
	*/
	@Column(name="ccmcrtusr",length=10)
	private String ccmcrtusr;

	/**
	* ccmcrtpgm
	* 'CCM ADD PROGRAM'
	*/
	@Column(name="ccmcrtpgm",length=10)
	private String ccmcrtpgm;

	/**
	* ccmchgdt
	* 'CCM CHANGE DATE'
	*/
	@Column(name="ccmchgdt")
	private Integer ccmchgdt;

	/**
	* ccmchgtm
	* 'CCM CHANGE TIME'
	*/
	@Column(name="ccmchgtm")
	private Integer ccmchgtm;

	/**
	* ccmchgusr
	* 'CCM CHANGE USER'
	*/
	@Column(name="ccmchgusr",length=10)
	private String ccmchgusr;

	/**
	* ccmchgpgm
	* 'CCM CHANGE PROGRAM'
	*/
	@Column(name="ccmchgpgm",length=10)
	private String ccmchgpgm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.cardnum = 0l;
		this.custid = 0;
		this.acctnum = 0l;
		this.primarysec = " ";
		this.name = "                         ";
		this.expirymo = 0;
		this.expiryyr = 0;
		this.cvv = 0;
		this.status = " ";
		this.ccmcrtdt = 0;
		this.ccmcrttm = 0;
		this.ccmcrtusr = "          ";
		this.ccmcrtpgm = "          ";
		this.ccmchgdt = 0;
		this.ccmchgtm = 0;
		this.ccmchgusr = "          ";
		this.ccmchgpgm = "          ";
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
	* return the custid.
	* @return the custid.
	*/
	public Integer getCustid(){
		return custid;
	}
	
	/**
	* sets the value for custid.
	* @param value the new custid.
	*/
	public void setCustid(Integer value){
		this.custid = value;
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
	* return the primarysec.
	* @return the primarysec.
	*/
	public String getPrimarysec(){
		return primarysec;
	}
	
	/**
	* sets the value for primarysec.
	* @param value the new primarysec.
	*/
	public void setPrimarysec(String value){
		this.primarysec = value;
	}
	
	/**
	* return the name.
	* @return the name.
	*/
	public String getName(){
		return name;
	}
	
	/**
	* sets the value for name.
	* @param value the new name.
	*/
	public void setName(String value){
		this.name = value;
	}
	
	/**
	* return the expirymo.
	* @return the expirymo.
	*/
	public Integer getExpirymo(){
		return expirymo;
	}
	
	/**
	* sets the value for expirymo.
	* @param value the new expirymo.
	*/
	public void setExpirymo(Integer value){
		this.expirymo = value;
	}
	
	/**
	* return the expiryyr.
	* @return the expiryyr.
	*/
	public Integer getExpiryyr(){
		return expiryyr;
	}
	
	/**
	* sets the value for expiryyr.
	* @param value the new expiryyr.
	*/
	public void setExpiryyr(Integer value){
		this.expiryyr = value;
	}
	
	/**
	* return the cvv.
	* @return the cvv.
	*/
	public Integer getCvv(){
		return cvv;
	}
	
	/**
	* sets the value for cvv.
	* @param value the new cvv.
	*/
	public void setCvv(Integer value){
		this.cvv = value;
	}
	
	/**
	* return the status.
	* @return the status.
	*/
	public String getStatus(){
		return status;
	}
	
	/**
	* sets the value for status.
	* @param value the new status.
	*/
	public void setStatus(String value){
		this.status = value;
	}
	
	/**
	* return the ccmcrtdt.
	* @return the ccmcrtdt.
	*/
	public Integer getCcmcrtdt(){
		return ccmcrtdt;
	}
	
	/**
	* sets the value for ccmcrtdt.
	* @param value the new ccmcrtdt.
	*/
	public void setCcmcrtdt(Integer value){
		this.ccmcrtdt = value;
	}
	
	/**
	* return the ccmcrttm.
	* @return the ccmcrttm.
	*/
	public Integer getCcmcrttm(){
		return ccmcrttm;
	}
	
	/**
	* sets the value for ccmcrttm.
	* @param value the new ccmcrttm.
	*/
	public void setCcmcrttm(Integer value){
		this.ccmcrttm = value;
	}
	
	/**
	* return the ccmcrtusr.
	* @return the ccmcrtusr.
	*/
	public String getCcmcrtusr(){
		return ccmcrtusr;
	}
	
	/**
	* sets the value for ccmcrtusr.
	* @param value the new ccmcrtusr.
	*/
	public void setCcmcrtusr(String value){
		this.ccmcrtusr = value;
	}
	
	/**
	* return the ccmcrtpgm.
	* @return the ccmcrtpgm.
	*/
	public String getCcmcrtpgm(){
		return ccmcrtpgm;
	}
	
	/**
	* sets the value for ccmcrtpgm.
	* @param value the new ccmcrtpgm.
	*/
	public void setCcmcrtpgm(String value){
		this.ccmcrtpgm = value;
	}
	
	/**
	* return the ccmchgdt.
	* @return the ccmchgdt.
	*/
	public Integer getCcmchgdt(){
		return ccmchgdt;
	}
	
	/**
	* sets the value for ccmchgdt.
	* @param value the new ccmchgdt.
	*/
	public void setCcmchgdt(Integer value){
		this.ccmchgdt = value;
	}
	
	/**
	* return the ccmchgtm.
	* @return the ccmchgtm.
	*/
	public Integer getCcmchgtm(){
		return ccmchgtm;
	}
	
	/**
	* sets the value for ccmchgtm.
	* @param value the new ccmchgtm.
	*/
	public void setCcmchgtm(Integer value){
		this.ccmchgtm = value;
	}
	
	/**
	* return the ccmchgusr.
	* @return the ccmchgusr.
	*/
	public String getCcmchgusr(){
		return ccmchgusr;
	}
	
	/**
	* sets the value for ccmchgusr.
	* @param value the new ccmchgusr.
	*/
	public void setCcmchgusr(String value){
		this.ccmchgusr = value;
	}
	
	/**
	* return the ccmchgpgm.
	* @return the ccmchgpgm.
	*/
	public String getCcmchgpgm(){
		return ccmchgpgm;
	}
	
	/**
	* sets the value for ccmchgpgm.
	* @param value the new ccmchgpgm.
	*/
	public void setCcmchgpgm(String value){
		this.ccmchgpgm = value;
	}
	
}