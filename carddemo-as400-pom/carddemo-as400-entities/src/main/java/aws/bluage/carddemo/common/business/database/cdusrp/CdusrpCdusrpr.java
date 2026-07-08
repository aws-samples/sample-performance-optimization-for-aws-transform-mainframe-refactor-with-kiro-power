// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdusrp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdusrpCdusrpr  : 'CardDemo - Users (SQL)'.
 * @see AbstractJPAEntity
 * -- File Name       : CDUSRP (Table)
 * -- Author          : Subu
 * -- Date            : 02/11/2024
 * -- Description     : Users Master
 */
@Entity
@Table(name="cdusrp")
public class CdusrpCdusrpr extends AbstractJPAEntity implements ICdusrpCdusrpr {
	/**
	* userid
	* 'USER ID'
	*/
	@Column(name="userid",length=10)
	private String userid;

	/**
	* firstname
	* 'FIRST NAME'
	*/
	@Column(name="firstname",length=20)
	private String firstname;

	/**
	* lastname
	* 'LAST NAME'
	*/
	@Column(name="lastname",length=20)
	private String lastname;

	/**
	* type
	* 'USER TYPE'
	*/
	@Column(name="type",length=1)
	private String type;

	/**
	* email
	* 
	*/
	@Column(name="email",length=50)
	private String email;

	/**
	* status
	* 
	*/
	@Column(name="status",length=1)
	private String status;

	/**
	* usrcrtdt
	* 'TRN ADD DATE'
	*/
	@Column(name="usrcrtdt")
	private Integer usrcrtdt;

	/**
	* usrcrttm
	* 'TRN ADD TIME'
	*/
	@Column(name="usrcrttm")
	private Integer usrcrttm;

	/**
	* usrcrtusr
	* 'TRN ADD USER'
	*/
	@Column(name="usrcrtusr",length=10)
	private String usrcrtusr;

	/**
	* usrcrtpgm
	* 'TRN ADD PROGRAM'
	*/
	@Column(name="usrcrtpgm",length=10)
	private String usrcrtpgm;

	/**
	* usrchgdt
	* 'TRN CHANGE DATE'
	*/
	@Column(name="usrchgdt")
	private Integer usrchgdt;

	/**
	* usrchgtm
	* 'TRN CHANGE TIME'
	*/
	@Column(name="usrchgtm")
	private Integer usrchgtm;

	/**
	* usrchgusr
	* 'TRN CHANGE USER'
	*/
	@Column(name="usrchgusr",length=10)
	private String usrchgusr;

	/**
	* usrchgpgm
	* 'TRN CHANGE PROGRAM'
	*/
	@Column(name="usrchgpgm",length=10)
	private String usrchgpgm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.userid = "          ";
		this.firstname = "                    ";
		this.lastname = "                    ";
		this.type = " ";
		this.email = "                                                  ";
		this.status = " ";
		this.usrcrtdt = 0;
		this.usrcrttm = 0;
		this.usrcrtusr = "          ";
		this.usrcrtpgm = "          ";
		this.usrchgdt = 0;
		this.usrchgtm = 0;
		this.usrchgusr = "          ";
		this.usrchgpgm = "          ";
	}

	/**
	* return the userid.
	* @return the userid.
	*/
	public String getUserid(){
		return userid;
	}
	
	/**
	* sets the value for userid.
	* @param value the new userid.
	*/
	public void setUserid(String value){
		this.userid = value;
	}
	
	/**
	* return the firstname.
	* @return the firstname.
	*/
	public String getFirstname(){
		return firstname;
	}
	
	/**
	* sets the value for firstname.
	* @param value the new firstname.
	*/
	public void setFirstname(String value){
		this.firstname = value;
	}
	
	/**
	* return the lastname.
	* @return the lastname.
	*/
	public String getLastname(){
		return lastname;
	}
	
	/**
	* sets the value for lastname.
	* @param value the new lastname.
	*/
	public void setLastname(String value){
		this.lastname = value;
	}
	
	/**
	* return the type.
	* @return the type.
	*/
	public String getType(){
		return type;
	}
	
	/**
	* sets the value for type.
	* @param value the new type.
	*/
	public void setType(String value){
		this.type = value;
	}
	
	/**
	* return the email.
	* @return the email.
	*/
	public String getEmail(){
		return email;
	}
	
	/**
	* sets the value for email.
	* @param value the new email.
	*/
	public void setEmail(String value){
		this.email = value;
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
	* return the usrcrtdt.
	* @return the usrcrtdt.
	*/
	public Integer getUsrcrtdt(){
		return usrcrtdt;
	}
	
	/**
	* sets the value for usrcrtdt.
	* @param value the new usrcrtdt.
	*/
	public void setUsrcrtdt(Integer value){
		this.usrcrtdt = value;
	}
	
	/**
	* return the usrcrttm.
	* @return the usrcrttm.
	*/
	public Integer getUsrcrttm(){
		return usrcrttm;
	}
	
	/**
	* sets the value for usrcrttm.
	* @param value the new usrcrttm.
	*/
	public void setUsrcrttm(Integer value){
		this.usrcrttm = value;
	}
	
	/**
	* return the usrcrtusr.
	* @return the usrcrtusr.
	*/
	public String getUsrcrtusr(){
		return usrcrtusr;
	}
	
	/**
	* sets the value for usrcrtusr.
	* @param value the new usrcrtusr.
	*/
	public void setUsrcrtusr(String value){
		this.usrcrtusr = value;
	}
	
	/**
	* return the usrcrtpgm.
	* @return the usrcrtpgm.
	*/
	public String getUsrcrtpgm(){
		return usrcrtpgm;
	}
	
	/**
	* sets the value for usrcrtpgm.
	* @param value the new usrcrtpgm.
	*/
	public void setUsrcrtpgm(String value){
		this.usrcrtpgm = value;
	}
	
	/**
	* return the usrchgdt.
	* @return the usrchgdt.
	*/
	public Integer getUsrchgdt(){
		return usrchgdt;
	}
	
	/**
	* sets the value for usrchgdt.
	* @param value the new usrchgdt.
	*/
	public void setUsrchgdt(Integer value){
		this.usrchgdt = value;
	}
	
	/**
	* return the usrchgtm.
	* @return the usrchgtm.
	*/
	public Integer getUsrchgtm(){
		return usrchgtm;
	}
	
	/**
	* sets the value for usrchgtm.
	* @param value the new usrchgtm.
	*/
	public void setUsrchgtm(Integer value){
		this.usrchgtm = value;
	}
	
	/**
	* return the usrchgusr.
	* @return the usrchgusr.
	*/
	public String getUsrchgusr(){
		return usrchgusr;
	}
	
	/**
	* sets the value for usrchgusr.
	* @param value the new usrchgusr.
	*/
	public void setUsrchgusr(String value){
		this.usrchgusr = value;
	}
	
	/**
	* return the usrchgpgm.
	* @return the usrchgpgm.
	*/
	public String getUsrchgpgm(){
		return usrchgpgm;
	}
	
	/**
	* sets the value for usrchgpgm.
	* @param value the new usrchgpgm.
	*/
	public void setUsrchgpgm(String value){
		this.usrchgpgm = value;
	}
	
}