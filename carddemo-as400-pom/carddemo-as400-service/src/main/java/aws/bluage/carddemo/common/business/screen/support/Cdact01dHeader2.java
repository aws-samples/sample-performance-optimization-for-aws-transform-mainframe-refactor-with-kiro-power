// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact01dHeader2.
 */
public class Cdact01dHeader2 extends BaseScreenBean {

	public Cdact01dHeader2() {
		super("label", "labelAccountId", "labelOpenDate", "labelPrimaryCust", "labelSecondaryCust", "labelBalance", "position", "labelSts");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact01d-header2";
	}

	/**
	* return the label.
	* @return the label.
	*/
	public SimpleScreenField getLabelField(){
		return getField("label");
	}

	/**
	* return the label value.
	* @return the label value.
	*/
	public String getLabel(){
		return getField("label").getValue(String.class);
	}

	/**
	* sets the value for label.
	* @param value the new label.
	*/
	public void setLabel(String value){
		getField("label").setValue(value);
	}
	/**
	* return the labelAccountId.
	* @return the labelAccountId.
	*/
	public SimpleScreenField getLabelAccountIdField(){
		return getField("labelAccountId");
	}

	/**
	* return the labelAccountId value.
	* @return the labelAccountId value.
	*/
	public String getLabelAccountId(){
		return getField("labelAccountId").getValue(String.class);
	}

	/**
	* sets the value for labelAccountId.
	* @param value the new labelAccountId.
	*/
	public void setLabelAccountId(String value){
		getField("labelAccountId").setValue(value);
	}
	/**
	* return the labelOpenDate.
	* @return the labelOpenDate.
	*/
	public SimpleScreenField getLabelOpenDateField(){
		return getField("labelOpenDate");
	}

	/**
	* return the labelOpenDate value.
	* @return the labelOpenDate value.
	*/
	public String getLabelOpenDate(){
		return getField("labelOpenDate").getValue(String.class);
	}

	/**
	* sets the value for labelOpenDate.
	* @param value the new labelOpenDate.
	*/
	public void setLabelOpenDate(String value){
		getField("labelOpenDate").setValue(value);
	}
	/**
	* return the labelPrimaryCust.
	* @return the labelPrimaryCust.
	*/
	public SimpleScreenField getLabelPrimaryCustField(){
		return getField("labelPrimaryCust");
	}

	/**
	* return the labelPrimaryCust value.
	* @return the labelPrimaryCust value.
	*/
	public String getLabelPrimaryCust(){
		return getField("labelPrimaryCust").getValue(String.class);
	}

	/**
	* sets the value for labelPrimaryCust.
	* @param value the new labelPrimaryCust.
	*/
	public void setLabelPrimaryCust(String value){
		getField("labelPrimaryCust").setValue(value);
	}
	/**
	* return the labelSecondaryCust.
	* @return the labelSecondaryCust.
	*/
	public SimpleScreenField getLabelSecondaryCustField(){
		return getField("labelSecondaryCust");
	}

	/**
	* return the labelSecondaryCust value.
	* @return the labelSecondaryCust value.
	*/
	public String getLabelSecondaryCust(){
		return getField("labelSecondaryCust").getValue(String.class);
	}

	/**
	* sets the value for labelSecondaryCust.
	* @param value the new labelSecondaryCust.
	*/
	public void setLabelSecondaryCust(String value){
		getField("labelSecondaryCust").setValue(value);
	}
	/**
	* return the labelBalance.
	* @return the labelBalance.
	*/
	public SimpleScreenField getLabelBalanceField(){
		return getField("labelBalance");
	}

	/**
	* return the labelBalance value.
	* @return the labelBalance value.
	*/
	public String getLabelBalance(){
		return getField("labelBalance").getValue(String.class);
	}

	/**
	* sets the value for labelBalance.
	* @param value the new labelBalance.
	*/
	public void setLabelBalance(String value){
		getField("labelBalance").setValue(value);
	}
	/**
	* return the position.
	* @return the position.
	*/
	public SimpleScreenField getPositionField(){
		return getField("position");
	}

	/**
	* return the position value.
	* @return the position value.
	*/
	public String getPosition(){
		return getField("position").getValue(String.class);
	}

	/**
	* sets the value for position.
	* @param value the new position.
	*/
	public void setPosition(String value){
		getField("position").setValue(value);
	}
	/**
	* return the labelSts.
	* @return the labelSts.
	*/
	public SimpleScreenField getLabelStsField(){
		return getField("labelSts");
	}

	/**
	* return the labelSts value.
	* @return the labelSts value.
	*/
	public String getLabelSts(){
		return getField("labelSts").getValue(String.class);
	}

	/**
	* sets the value for labelSts.
	* @param value the new labelSts.
	*/
	public void setLabelSts(String value){
		getField("labelSts").setValue(value);
	}
}