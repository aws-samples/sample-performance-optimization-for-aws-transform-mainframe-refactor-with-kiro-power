// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.report.cdrptp;

import com.netfective.bluage.gapwalk.runtime.report.*;

/**
 * Report bean object CdrptpDetail.
 */
public class CdrptpDetail implements ReportBean {

	private String racct;
	private String rcus;
	private String rtype;
	private String rcheck;

	@Override
	public String getComponent() {
	    return "cdrptp-detail";
	}

	/**
	* return the racct.
	* @return the racct.
	*/
	public String getRacct(){
		return racct;
	}

	/**
	* sets the value for racct.
	* @param value the new racct.
	*/
	public void setRacct(String value){
		racct = value;
	}
	/**
	* return the rcus.
	* @return the rcus.
	*/
	public String getRcus(){
		return rcus;
	}

	/**
	* sets the value for rcus.
	* @param value the new rcus.
	*/
	public void setRcus(String value){
		rcus = value;
	}
	/**
	* return the rtype.
	* @return the rtype.
	*/
	public String getRtype(){
		return rtype;
	}

	/**
	* sets the value for rtype.
	* @param value the new rtype.
	*/
	public void setRtype(String value){
		rtype = value;
	}
	/**
	* return the rcheck.
	* @return the rcheck.
	*/
	public String getRcheck(){
		return rcheck;
	}

	/**
	* sets the value for rcheck.
	* @param value the new rcheck.
	*/
	public void setRcheck(String value){
		rcheck = value;
	}
}