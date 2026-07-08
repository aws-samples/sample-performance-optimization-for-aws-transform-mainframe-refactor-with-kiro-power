// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdstcp;

import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

/**
 * jpa entity CdstcpCdstapr interface.
 * 
 */
public interface ICdstcpCdstapr extends IRecordObject {
	
	/**
	* initialize all the fields' value
	*/
	void initData();
	
	/**
	* return the statecd.
	*/
	String getStatecd();
	
	/**
	* sets the value for statecd.
	*/
	void setStatecd(String value);
	/**
	* return the statenm.
	*/
	String getStatenm();
	
	/**
	* sets the value for statenm.
	*/
	void setStatenm(String value);
	/**
	* return the countrycd.
	*/
	String getCountrycd();
	
	/**
	* sets the value for countrycd.
	*/
	void setCountrycd(String value);
	/**
	* return the countrynm.
	*/
	String getCountrynm();
	
	/**
	* sets the value for countrynm.
	*/
	void setCountrynm(String value);
}