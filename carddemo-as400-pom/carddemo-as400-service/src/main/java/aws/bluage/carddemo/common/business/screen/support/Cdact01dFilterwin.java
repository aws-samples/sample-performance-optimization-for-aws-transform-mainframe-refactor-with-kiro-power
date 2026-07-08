// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact01dFilterwin.
 */
public class Cdact01dFilterwin extends WindowScreenBean {

	public Cdact01dFilterwin() {
		super("labelFilterOption", "custfltr", "labelFilterValueMustBeNumeric", "labelEnterYOrBlank");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact01d-filterwin";
	}

	/**
	* return the labelFilterOption.
	* @return the labelFilterOption.
	*/
	public SimpleScreenField getLabelFilterOptionField(){
		return getField("labelFilterOption");
	}

	/**
	* return the labelFilterOption value.
	* @return the labelFilterOption value.
	*/
	public String getLabelFilterOption(){
		return getField("labelFilterOption").getValue(String.class);
	}

	/**
	* sets the value for labelFilterOption.
	* @param value the new labelFilterOption.
	*/
	public void setLabelFilterOption(String value){
		getField("labelFilterOption").setValue(value);
	}
	/**
	* return the custfltr.
	* @return the custfltr.
	*/
	public SimpleScreenField getCustfltrField(){
		return getField("custfltr");
	}

	/**
	* return the custfltr value.
	* @return the custfltr value.
	*/
	public String getCustfltr(){
		return getField("custfltr").getValue(String.class);
	}

	/**
	* sets the value for custfltr.
	* @param value the new custfltr.
	*/
	public void setCustfltr(String value){
		getField("custfltr").setValue(value);
	}
	/**
	* return the labelFilterValueMustBeNumeric.
	* @return the labelFilterValueMustBeNumeric.
	*/
	public SimpleScreenField getLabelFilterValueMustBeNumericField(){
		return getField("labelFilterValueMustBeNumeric");
	}

	/**
	* return the labelFilterValueMustBeNumeric value.
	* @return the labelFilterValueMustBeNumeric value.
	*/
	public String getLabelFilterValueMustBeNumeric(){
		return getField("labelFilterValueMustBeNumeric").getValue(String.class);
	}

	/**
	* sets the value for labelFilterValueMustBeNumeric.
	* @param value the new labelFilterValueMustBeNumeric.
	*/
	public void setLabelFilterValueMustBeNumeric(String value){
		getField("labelFilterValueMustBeNumeric").setValue(value);
	}
	/**
	* return the labelEnterYOrBlank.
	* @return the labelEnterYOrBlank.
	*/
	public SimpleScreenField getLabelEnterYOrBlankField(){
		return getField("labelEnterYOrBlank");
	}

	/**
	* return the labelEnterYOrBlank value.
	* @return the labelEnterYOrBlank value.
	*/
	public String getLabelEnterYOrBlank(){
		return getField("labelEnterYOrBlank").getValue(String.class);
	}

	/**
	* sets the value for labelEnterYOrBlank.
	* @param value the new labelEnterYOrBlank.
	*/
	public void setLabelEnterYOrBlank(String value){
		getField("labelEnterYOrBlank").setValue(value);
	}
}