// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.report.cdrptp;

import com.netfective.bluage.gapwalk.runtime.report.*;

/**
 * Report bean object CdrptpSummary.
 */
public class CdrptpSummary implements ReportBean {

	private String rmetric;
	private String rvalue;

	@Override
	public String getComponent() {
	    return "cdrptp-summary";
	}

	/**
	* return the rmetric.
	* @return the rmetric.
	*/
	public String getRmetric(){
		return rmetric;
	}

	/**
	* sets the value for rmetric.
	* @param value the new rmetric.
	*/
	public void setRmetric(String value){
		rmetric = value;
	}
	/**
	* return the rvalue.
	* @return the rvalue.
	*/
	public String getRvalue(){
		return rvalue;
	}

	/**
	* sets the value for rvalue.
	* @param value the new rvalue.
	*/
	public void setRvalue(String value){
		rvalue = value;
	}
}