// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdccap;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdccapCdccapr 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDCCAP (PF)       
 *  Author          : Subu              
 *  Date            : 02/11/2024        
 *  Description     : Credit Card Activity
 * ***************************************************************
 */
@Entity
@Table(name="cdccap")
public class CdccapCdccapr extends AbstractJPAEntity implements ICdccapCdccapr {
	/**
	* cardnum
	* 'CREDIT CARD NUMBER'
	*/
	@Column(name="cardnum")
	private Long cardnum;

	/**
	* ccaseqno
	* 'CC SEQ NUMBER'
	*/
	@Column(name="ccaseqno")
	private Integer ccaseqno;

	/**
	* activity
	* 'ACTIVITY'
	*/
	@Column(name="activity",length=5)
	private String activity;

	/**
	* dess
	* 'DESCRIPTION'
	*/
	@Column(name="dess",length=25)
	private String dess;

	/**
	* ccauser
	* 'CCA USER'
	*/
	@Column(name="ccauser",length=10)
	private String ccauser;

	/**
	* ccatmstamp
	* 'CCA TIME STAMP'
	*/
	@Column(name="ccatmstamp")
	private java.sql.Timestamp ccatmstamp;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.cardnum = 0l;
		this.ccaseqno = 0;
		this.activity = "     ";
		this.dess = "                         ";
		this.ccauser = "          ";
		this.ccatmstamp = new java.sql.Timestamp(0);
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
	* return the ccaseqno.
	* @return the ccaseqno.
	*/
	public Integer getCcaseqno(){
		return ccaseqno;
	}
	
	/**
	* sets the value for ccaseqno.
	* @param value the new ccaseqno.
	*/
	public void setCcaseqno(Integer value){
		this.ccaseqno = value;
	}
	
	/**
	* return the activity.
	* @return the activity.
	*/
	public String getActivity(){
		return activity;
	}
	
	/**
	* sets the value for activity.
	* @param value the new activity.
	*/
	public void setActivity(String value){
		this.activity = value;
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
	* return the ccauser.
	* @return the ccauser.
	*/
	public String getCcauser(){
		return ccauser;
	}
	
	/**
	* sets the value for ccauser.
	* @param value the new ccauser.
	*/
	public void setCcauser(String value){
		this.ccauser = value;
	}
	
	/**
	* return the ccatmstamp.
	* @return the ccatmstamp.
	*/
	public java.sql.Timestamp getCcatmstamp(){
		return ccatmstamp;
	}
	
	/**
	* sets the value for ccatmstamp.
	* @param value the new ccatmstamp.
	*/
	public void setCcatmstamp(java.sql.Timestamp value){
		this.ccatmstamp = value;
	}
	
}