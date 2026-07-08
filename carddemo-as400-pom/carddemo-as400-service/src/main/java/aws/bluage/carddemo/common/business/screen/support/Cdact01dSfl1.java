// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact01dSfl1.
 */
public class Cdact01dSfl1 extends ArrayScreenField {

	public Cdact01dSfl1() {
		super("sfl1", "option", "sflacct", "opendate", "sflpcust", "sflscust", "sflbal", "sflsts");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact01d-sfl1";
	}

	/**
	* return the option.
	* @return the option.
	*/
	public SimpleScreenField getOptionField(){
		return getField("option");
	}

	/**
	* return the option value.
	* @return the option value.
	*/
	public String getOption(){
		return getField("option").getValue(String.class);
	}

	/**
	* sets the value for option.
	* @param value the new option.
	*/
	public void setOption(String value){
		getField("option").setValue(value);
	}
	/**
	* return the sflacct.
	* @return the sflacct.
	*/
	public SimpleScreenField getSflacctField(){
		return getField("sflacct");
	}

	/**
	* return the sflacct value.
	* @return the sflacct value.
	*/
	public String getSflacct(){
		return getField("sflacct").getValue(String.class);
	}

	/**
	* sets the value for sflacct.
	* @param value the new sflacct.
	*/
	public void setSflacct(String value){
		getField("sflacct").setValue(value);
	}
	/**
	* return the opendate.
	* @return the opendate.
	*/
	public SimpleScreenField getOpendateField(){
		return getField("opendate");
	}

	/**
	* return the opendate value.
	* @return the opendate value.
	*/
	public String getOpendate(){
		return getField("opendate").getValue(String.class);
	}

	/**
	* sets the value for opendate.
	* @param value the new opendate.
	*/
	public void setOpendate(String value){
		getField("opendate").setValue(value);
	}
	/**
	* return the sflpcust.
	* @return the sflpcust.
	*/
	public SimpleScreenField getSflpcustField(){
		return getField("sflpcust");
	}

	/**
	* return the sflpcust value.
	* @return the sflpcust value.
	*/
	public String getSflpcust(){
		return getField("sflpcust").getValue(String.class);
	}

	/**
	* sets the value for sflpcust.
	* @param value the new sflpcust.
	*/
	public void setSflpcust(String value){
		getField("sflpcust").setValue(value);
	}
	/**
	* return the sflscust.
	* @return the sflscust.
	*/
	public SimpleScreenField getSflscustField(){
		return getField("sflscust");
	}

	/**
	* return the sflscust value.
	* @return the sflscust value.
	*/
	public String getSflscust(){
		return getField("sflscust").getValue(String.class);
	}

	/**
	* sets the value for sflscust.
	* @param value the new sflscust.
	*/
	public void setSflscust(String value){
		getField("sflscust").setValue(value);
	}
	/**
	* return the sflbal.
	* @return the sflbal.
	*/
	public SimpleScreenField getSflbalField(){
		return getField("sflbal");
	}

	/**
	* return the sflbal value.
	* @return the sflbal value.
	*/
	public String getSflbal(){
		return getField("sflbal").getValue(String.class);
	}

	/**
	* sets the value for sflbal.
	* @param value the new sflbal.
	*/
	public void setSflbal(String value){
		getField("sflbal").setValue(value);
	}
	/**
	* return the sflsts.
	* @return the sflsts.
	*/
	public SimpleScreenField getSflstsField(){
		return getField("sflsts");
	}

	/**
	* return the sflsts value.
	* @return the sflsts value.
	*/
	public String getSflsts(){
		return getField("sflsts").getValue(String.class);
	}

	/**
	* sets the value for sflsts.
	* @param value the new sflsts.
	*/
	public void setSflsts(String value){
		getField("sflsts").setValue(value);
	}
}