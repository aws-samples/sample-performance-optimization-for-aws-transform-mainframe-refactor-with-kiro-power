// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdcusp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdcuspCdcuspr 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDCUSP (PF)       
 *  Author          : Subu              
 *  Date            : 02/11/2024        
 *  Description     : Customer Master   
 * ***************************************************************
 */
@Entity
@Table(name="cdcusp")
public class CdcuspCdcuspr extends AbstractJPAEntity implements ICdcuspCdcuspr {
	/**
	* custid
	* 'CUSTOMER ID'
	*/
	@Column(name="custid")
	private Integer custid;

	/**
	* ssn
	* 'SOCIAL SECURITY NUMBER'
	*/
	@Column(name="ssn")
	private Integer ssn;

	/**
	* birthday
	* 'BIRTH DAY'
	*/
	@Column(name="birthday")
	private Integer birthday;

	/**
	* birthmo
	* 'BIRTH MONTH'
	*/
	@Column(name="birthmo")
	private Integer birthmo;

	/**
	* birthyr
	* 'BIRTH YEAR'
	*/
	@Column(name="birthyr")
	private Integer birthyr;

	/**
	* gender
	* 'GENDER'
	*/
	@Column(name="gender",length=1)
	private String gender;

	/**
	* ficoscore
	* 'FICO SCORE'
	*/
	@Column(name="ficoscore")
	private Integer ficoscore;

	/**
	* firstname
	* 'FIRST NAME'
	*/
	@Column(name="firstname",length=25)
	private String firstname;

	/**
	* midname
	* 'MIDDLE NAME'
	*/
	@Column(name="midname",length=25)
	private String midname;

	/**
	* lastname
	* 'LAST NAME'
	*/
	@Column(name="lastname",length=25)
	private String lastname;

	/**
	* address1
	* 'ADDRESS LINE 1'
	*/
	@Column(name="address1",length=40)
	private String address1;

	/**
	* address2
	* 'ADDRESS LINE 2'
	*/
	@Column(name="address2",length=40)
	private String address2;

	/**
	* city
	* 'CITY'
	*/
	@Column(name="city",length=20)
	private String city;

	/**
	* state
	* 'STATE'
	*/
	@Column(name="state",length=2)
	private String state;

	/**
	* zip
	* 'ZIP CODE'
	*/
	@Column(name="zip")
	private Integer zip;

	/**
	* country
	* 'COUNTRY'
	*/
	@Column(name="country",length=3)
	private String country;

	/**
	* phone1
	* 'PHONE NUMBER 1'
	*/
	@Column(name="phone1")
	private Long phone1;

	/**
	* phone2
	* 'PHONE NUMBER 2'
	*/
	@Column(name="phone2")
	private Long phone2;

	/**
	* cuscrtdt
	* 'CUS ADD DATE'
	*/
	@Column(name="cuscrtdt")
	private Integer cuscrtdt;

	/**
	* cuscrttm
	* 'CUS ADD TIME'
	*/
	@Column(name="cuscrttm")
	private Integer cuscrttm;

	/**
	* cuscrtusr
	* 'CUS ADD USER'
	*/
	@Column(name="cuscrtusr",length=10)
	private String cuscrtusr;

	/**
	* cuscrtpgm
	* 'CUS ADD PROGRAM'
	*/
	@Column(name="cuscrtpgm",length=10)
	private String cuscrtpgm;

	/**
	* cuschgdt
	* 'CUS CHANGE DATE'
	*/
	@Column(name="cuschgdt")
	private Integer cuschgdt;

	/**
	* cuschgtm
	* 'CUS CHANGE TIME'
	*/
	@Column(name="cuschgtm")
	private Integer cuschgtm;

	/**
	* cuschgusr
	* 'CUS CHANGE USER'
	*/
	@Column(name="cuschgusr",length=10)
	private String cuschgusr;

	/**
	* cuschgpgm
	* 'CUS CHANGE PROGRAM'
	*/
	@Column(name="cuschgpgm",length=10)
	private String cuschgpgm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.custid = 0;
		this.ssn = 0;
		this.birthday = 0;
		this.birthmo = 0;
		this.birthyr = 0;
		this.gender = " ";
		this.ficoscore = 0;
		this.firstname = "                         ";
		this.midname = "                         ";
		this.lastname = "                         ";
		this.address1 = "                                        ";
		this.address2 = "                                        ";
		this.city = "                    ";
		this.state = "  ";
		this.zip = 0;
		this.country = "   ";
		this.phone1 = 0l;
		this.phone2 = 0l;
		this.cuscrtdt = 0;
		this.cuscrttm = 0;
		this.cuscrtusr = "          ";
		this.cuscrtpgm = "          ";
		this.cuschgdt = 0;
		this.cuschgtm = 0;
		this.cuschgusr = "          ";
		this.cuschgpgm = "          ";
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
	* return the ssn.
	* @return the ssn.
	*/
	public Integer getSsn(){
		return ssn;
	}
	
	/**
	* sets the value for ssn.
	* @param value the new ssn.
	*/
	public void setSsn(Integer value){
		this.ssn = value;
	}
	
	/**
	* return the birthday.
	* @return the birthday.
	*/
	public Integer getBirthday(){
		return birthday;
	}
	
	/**
	* sets the value for birthday.
	* @param value the new birthday.
	*/
	public void setBirthday(Integer value){
		this.birthday = value;
	}
	
	/**
	* return the birthmo.
	* @return the birthmo.
	*/
	public Integer getBirthmo(){
		return birthmo;
	}
	
	/**
	* sets the value for birthmo.
	* @param value the new birthmo.
	*/
	public void setBirthmo(Integer value){
		this.birthmo = value;
	}
	
	/**
	* return the birthyr.
	* @return the birthyr.
	*/
	public Integer getBirthyr(){
		return birthyr;
	}
	
	/**
	* sets the value for birthyr.
	* @param value the new birthyr.
	*/
	public void setBirthyr(Integer value){
		this.birthyr = value;
	}
	
	/**
	* return the gender.
	* @return the gender.
	*/
	public String getGender(){
		return gender;
	}
	
	/**
	* sets the value for gender.
	* @param value the new gender.
	*/
	public void setGender(String value){
		this.gender = value;
	}
	
	/**
	* return the ficoscore.
	* @return the ficoscore.
	*/
	public Integer getFicoscore(){
		return ficoscore;
	}
	
	/**
	* sets the value for ficoscore.
	* @param value the new ficoscore.
	*/
	public void setFicoscore(Integer value){
		this.ficoscore = value;
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
	* return the midname.
	* @return the midname.
	*/
	public String getMidname(){
		return midname;
	}
	
	/**
	* sets the value for midname.
	* @param value the new midname.
	*/
	public void setMidname(String value){
		this.midname = value;
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
	* return the address1.
	* @return the address1.
	*/
	public String getAddress1(){
		return address1;
	}
	
	/**
	* sets the value for address1.
	* @param value the new address1.
	*/
	public void setAddress1(String value){
		this.address1 = value;
	}
	
	/**
	* return the address2.
	* @return the address2.
	*/
	public String getAddress2(){
		return address2;
	}
	
	/**
	* sets the value for address2.
	* @param value the new address2.
	*/
	public void setAddress2(String value){
		this.address2 = value;
	}
	
	/**
	* return the city.
	* @return the city.
	*/
	public String getCity(){
		return city;
	}
	
	/**
	* sets the value for city.
	* @param value the new city.
	*/
	public void setCity(String value){
		this.city = value;
	}
	
	/**
	* return the state.
	* @return the state.
	*/
	public String getState(){
		return state;
	}
	
	/**
	* sets the value for state.
	* @param value the new state.
	*/
	public void setState(String value){
		this.state = value;
	}
	
	/**
	* return the zip.
	* @return the zip.
	*/
	public Integer getZip(){
		return zip;
	}
	
	/**
	* sets the value for zip.
	* @param value the new zip.
	*/
	public void setZip(Integer value){
		this.zip = value;
	}
	
	/**
	* return the country.
	* @return the country.
	*/
	public String getCountry(){
		return country;
	}
	
	/**
	* sets the value for country.
	* @param value the new country.
	*/
	public void setCountry(String value){
		this.country = value;
	}
	
	/**
	* return the phone1.
	* @return the phone1.
	*/
	public Long getPhone1(){
		return phone1;
	}
	
	/**
	* sets the value for phone1.
	* @param value the new phone1.
	*/
	public void setPhone1(Long value){
		this.phone1 = value;
	}
	
	/**
	* return the phone2.
	* @return the phone2.
	*/
	public Long getPhone2(){
		return phone2;
	}
	
	/**
	* sets the value for phone2.
	* @param value the new phone2.
	*/
	public void setPhone2(Long value){
		this.phone2 = value;
	}
	
	/**
	* return the cuscrtdt.
	* @return the cuscrtdt.
	*/
	public Integer getCuscrtdt(){
		return cuscrtdt;
	}
	
	/**
	* sets the value for cuscrtdt.
	* @param value the new cuscrtdt.
	*/
	public void setCuscrtdt(Integer value){
		this.cuscrtdt = value;
	}
	
	/**
	* return the cuscrttm.
	* @return the cuscrttm.
	*/
	public Integer getCuscrttm(){
		return cuscrttm;
	}
	
	/**
	* sets the value for cuscrttm.
	* @param value the new cuscrttm.
	*/
	public void setCuscrttm(Integer value){
		this.cuscrttm = value;
	}
	
	/**
	* return the cuscrtusr.
	* @return the cuscrtusr.
	*/
	public String getCuscrtusr(){
		return cuscrtusr;
	}
	
	/**
	* sets the value for cuscrtusr.
	* @param value the new cuscrtusr.
	*/
	public void setCuscrtusr(String value){
		this.cuscrtusr = value;
	}
	
	/**
	* return the cuscrtpgm.
	* @return the cuscrtpgm.
	*/
	public String getCuscrtpgm(){
		return cuscrtpgm;
	}
	
	/**
	* sets the value for cuscrtpgm.
	* @param value the new cuscrtpgm.
	*/
	public void setCuscrtpgm(String value){
		this.cuscrtpgm = value;
	}
	
	/**
	* return the cuschgdt.
	* @return the cuschgdt.
	*/
	public Integer getCuschgdt(){
		return cuschgdt;
	}
	
	/**
	* sets the value for cuschgdt.
	* @param value the new cuschgdt.
	*/
	public void setCuschgdt(Integer value){
		this.cuschgdt = value;
	}
	
	/**
	* return the cuschgtm.
	* @return the cuschgtm.
	*/
	public Integer getCuschgtm(){
		return cuschgtm;
	}
	
	/**
	* sets the value for cuschgtm.
	* @param value the new cuschgtm.
	*/
	public void setCuschgtm(Integer value){
		this.cuschgtm = value;
	}
	
	/**
	* return the cuschgusr.
	* @return the cuschgusr.
	*/
	public String getCuschgusr(){
		return cuschgusr;
	}
	
	/**
	* sets the value for cuschgusr.
	* @param value the new cuschgusr.
	*/
	public void setCuschgusr(String value){
		this.cuschgusr = value;
	}
	
	/**
	* return the cuschgpgm.
	* @return the cuschgpgm.
	*/
	public String getCuschgpgm(){
		return cuschgpgm;
	}
	
	/**
	* sets the value for cuschgpgm.
	* @param value the new cuschgpgm.
	*/
	public void setCuschgpgm(String value){
		this.cuschgpgm = value;
	}
	
}