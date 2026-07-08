// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdstcp;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity CdstcpCdstapr 
 * @see AbstractJPAEntity
 */
@Entity
@Table(name="cdstcp")
public class CdstcpCdstapr extends AbstractJPAEntity implements ICdstcpCdstapr {
	/**
	* statecd
	* 'STATE CODE'
	*/
	@Column(name="statecd",length=2)
	private String statecd;

	/**
	* statenm
	* 'STATE NAME'
	*/
	@Column(name="statenm",length=30)
	private String statenm;

	/**
	* countrycd
	* 'COUNTRY CODE'
	*/
	@Column(name="countrycd",length=3)
	private String countrycd;

	/**
	* countrynm
	* 'COUNTRY NAME'
	*/
	@Column(name="countrynm",length=30)
	private String countrynm;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.statecd = "  ";
		this.statenm = "                              ";
		this.countrycd = "   ";
		this.countrynm = "                              ";
	}

	/**
	* return the statecd.
	* @return the statecd.
	*/
	public String getStatecd(){
		return statecd;
	}
	
	/**
	* sets the value for statecd.
	* @param value the new statecd.
	*/
	public void setStatecd(String value){
		this.statecd = value;
	}
	
	/**
	* return the statenm.
	* @return the statenm.
	*/
	public String getStatenm(){
		return statenm;
	}
	
	/**
	* sets the value for statenm.
	* @param value the new statenm.
	*/
	public void setStatenm(String value){
		this.statenm = value;
	}
	
	/**
	* return the countrycd.
	* @return the countrycd.
	*/
	public String getCountrycd(){
		return countrycd;
	}
	
	/**
	* sets the value for countrycd.
	* @param value the new countrycd.
	*/
	public void setCountrycd(String value){
		this.countrycd = value;
	}
	
	/**
	* return the countrynm.
	* @return the countrynm.
	*/
	public String getCountrynm(){
		return countrynm;
	}
	
	/**
	* sets the value for countrynm.
	* @param value the new countrynm.
	*/
	public void setCountrynm(String value){
		this.countrynm = value;
	}
	
}