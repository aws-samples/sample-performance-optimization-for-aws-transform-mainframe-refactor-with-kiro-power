// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdautp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdautpCdautpr 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDAUTP (PF)       
 *  Author          : Subu              
 *  Date            : 02/11/2024        
 *  Description     : Authorization Master
 * ***************************************************************
 */
@Entity
@Table(name="cdautp")
public class CdautpCdautpr extends AbstractJPAEntity implements ICdautpCdautpr {
	/**
	* authid
	* 'AUTHORIZATION ID'
	*/
	@Column(name="authid")
	private Long authid;

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
	* response
	* 'AUTH RESPONSE'
	*/
	@Column(name="response",length=1)
	private String response;

	/**
	* rspreason
	* 'AUTH RESP REASON'
	*/
	@Column(name="rspreason",length=30)
	private String rspreason;

	/**
	* fraudflag
	* 'FRAUD FLAG'
	*/
	@Column(name="fraudflag",length=1)
	private String fraudflag;

	/**
	* authdate
	* 'AUTH DATE'
	*/
	@Column(name="authdate")
	private java.sql.Date authdate;

	/**
	* authtime
	* 'AUTH TIME'
	*/
	@Column(name="authtime")
	private java.sql.Time authtime;

	/**
	* authuser
	* 'AUTH USER'
	*/
	@Column(name="authuser",length=10)
	private String authuser;

	/**
	* authpgm
	* 'AUTH PROGRAM'
	*/
	@Column(name="authpgm",length=10)
	private String authpgm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.authid = 0l;
		this.trnid = 0l;
		this.cardnum = 0l;
		this.response = " ";
		this.rspreason = "                              ";
		this.fraudflag = " ";
		this.authdate = new java.sql.Date(0);
		this.authtime = new java.sql.Time(0);
		this.authuser = "          ";
		this.authpgm = "          ";
	}

	/**
	* return the authid.
	* @return the authid.
	*/
	public Long getAuthid(){
		return authid;
	}
	
	/**
	* sets the value for authid.
	* @param value the new authid.
	*/
	public void setAuthid(Long value){
		this.authid = value;
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
	* return the response.
	* @return the response.
	*/
	public String getResponse(){
		return response;
	}
	
	/**
	* sets the value for response.
	* @param value the new response.
	*/
	public void setResponse(String value){
		this.response = value;
	}
	
	/**
	* return the rspreason.
	* @return the rspreason.
	*/
	public String getRspreason(){
		return rspreason;
	}
	
	/**
	* sets the value for rspreason.
	* @param value the new rspreason.
	*/
	public void setRspreason(String value){
		this.rspreason = value;
	}
	
	/**
	* return the fraudflag.
	* @return the fraudflag.
	*/
	public String getFraudflag(){
		return fraudflag;
	}
	
	/**
	* sets the value for fraudflag.
	* @param value the new fraudflag.
	*/
	public void setFraudflag(String value){
		this.fraudflag = value;
	}
	
	/**
	* return the authdate.
	* @return the authdate.
	*/
	public java.sql.Date getAuthdate(){
		return authdate;
	}
	
	/**
	* sets the value for authdate.
	* @param value the new authdate.
	*/
	public void setAuthdate(java.sql.Date value){
		this.authdate = value;
	}
	
	/**
	* return the authtime.
	* @return the authtime.
	*/
	public java.sql.Time getAuthtime(){
		return authtime;
	}
	
	/**
	* sets the value for authtime.
	* @param value the new authtime.
	*/
	public void setAuthtime(java.sql.Time value){
		this.authtime = value;
	}
	
	/**
	* return the authuser.
	* @return the authuser.
	*/
	public String getAuthuser(){
		return authuser;
	}
	
	/**
	* sets the value for authuser.
	* @param value the new authuser.
	*/
	public void setAuthuser(String value){
		this.authuser = value;
	}
	
	/**
	* return the authpgm.
	* @return the authpgm.
	*/
	public String getAuthpgm(){
		return authpgm;
	}
	
	/**
	* sets the value for authpgm.
	* @param value the new authpgm.
	*/
	public void setAuthpgm(String value){
		this.authpgm = value;
	}
	
}