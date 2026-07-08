// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact01dDelerrwin.
 */
public class Cdact01dDelerrwin extends WindowScreenBean {

	public Cdact01dDelerrwin() {
		super("labelEditAccount", "labelInactivateAccount", "actid", "errdelw", "labelPrimaryCustId", "labelSecondaryCustId", "dpricustid", "dseccustid", "labelCreditCardSH", "dpricredit", "labelCreditCardSH1", "dseccredit");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact01d-delerrwin";
	}

	/**
	* return the labelEditAccount.
	* @return the labelEditAccount.
	*/
	public SimpleScreenField getLabelEditAccountField(){
		return getField("labelEditAccount");
	}

	/**
	* return the labelEditAccount value.
	* @return the labelEditAccount value.
	*/
	public String getLabelEditAccount(){
		return getField("labelEditAccount").getValue(String.class);
	}

	/**
	* sets the value for labelEditAccount.
	* @param value the new labelEditAccount.
	*/
	public void setLabelEditAccount(String value){
		getField("labelEditAccount").setValue(value);
	}
	/**
	* return the labelInactivateAccount.
	* @return the labelInactivateAccount.
	*/
	public SimpleScreenField getLabelInactivateAccountField(){
		return getField("labelInactivateAccount");
	}

	/**
	* return the labelInactivateAccount value.
	* @return the labelInactivateAccount value.
	*/
	public String getLabelInactivateAccount(){
		return getField("labelInactivateAccount").getValue(String.class);
	}

	/**
	* sets the value for labelInactivateAccount.
	* @param value the new labelInactivateAccount.
	*/
	public void setLabelInactivateAccount(String value){
		getField("labelInactivateAccount").setValue(value);
	}
	/**
	* return the actid.
	* @return the actid.
	*/
	public SimpleScreenField getActidField(){
		return getField("actid");
	}

	/**
	* return the actid value.
	* @return the actid value.
	*/
	public String getActid(){
		return getField("actid").getValue(String.class);
	}

	/**
	* sets the value for actid.
	* @param value the new actid.
	*/
	public void setActid(String value){
		getField("actid").setValue(value);
	}
	/**
	* return the errdelw.
	* @return the errdelw.
	*/
	public SimpleScreenField getErrdelwField(){
		return getField("errdelw");
	}

	/**
	* return the errdelw value.
	* @return the errdelw value.
	*/
	public String getErrdelw(){
		return getField("errdelw").getValue(String.class);
	}

	/**
	* sets the value for errdelw.
	* @param value the new errdelw.
	*/
	public void setErrdelw(String value){
		getField("errdelw").setValue(value);
	}
	/**
	* return the labelPrimaryCustId.
	* @return the labelPrimaryCustId.
	*/
	public SimpleScreenField getLabelPrimaryCustIdField(){
		return getField("labelPrimaryCustId");
	}

	/**
	* return the labelPrimaryCustId value.
	* @return the labelPrimaryCustId value.
	*/
	public String getLabelPrimaryCustId(){
		return getField("labelPrimaryCustId").getValue(String.class);
	}

	/**
	* sets the value for labelPrimaryCustId.
	* @param value the new labelPrimaryCustId.
	*/
	public void setLabelPrimaryCustId(String value){
		getField("labelPrimaryCustId").setValue(value);
	}
	/**
	* return the labelSecondaryCustId.
	* @return the labelSecondaryCustId.
	*/
	public SimpleScreenField getLabelSecondaryCustIdField(){
		return getField("labelSecondaryCustId");
	}

	/**
	* return the labelSecondaryCustId value.
	* @return the labelSecondaryCustId value.
	*/
	public String getLabelSecondaryCustId(){
		return getField("labelSecondaryCustId").getValue(String.class);
	}

	/**
	* sets the value for labelSecondaryCustId.
	* @param value the new labelSecondaryCustId.
	*/
	public void setLabelSecondaryCustId(String value){
		getField("labelSecondaryCustId").setValue(value);
	}
	/**
	* return the dpricustid.
	* @return the dpricustid.
	*/
	public SimpleScreenField getDpricustidField(){
		return getField("dpricustid");
	}

	/**
	* return the dpricustid value.
	* @return the dpricustid value.
	*/
	public String getDpricustid(){
		return getField("dpricustid").getValue(String.class);
	}

	/**
	* sets the value for dpricustid.
	* @param value the new dpricustid.
	*/
	public void setDpricustid(String value){
		getField("dpricustid").setValue(value);
	}
	/**
	* return the dseccustid.
	* @return the dseccustid.
	*/
	public SimpleScreenField getDseccustidField(){
		return getField("dseccustid");
	}

	/**
	* return the dseccustid value.
	* @return the dseccustid value.
	*/
	public String getDseccustid(){
		return getField("dseccustid").getValue(String.class);
	}

	/**
	* sets the value for dseccustid.
	* @param value the new dseccustid.
	*/
	public void setDseccustid(String value){
		getField("dseccustid").setValue(value);
	}
	/**
	* return the labelCreditCardSH.
	* @return the labelCreditCardSH.
	*/
	public SimpleScreenField getLabelCreditCardSHField(){
		return getField("labelCreditCardSH");
	}

	/**
	* return the labelCreditCardSH value.
	* @return the labelCreditCardSH value.
	*/
	public String getLabelCreditCardSH(){
		return getField("labelCreditCardSH").getValue(String.class);
	}

	/**
	* sets the value for labelCreditCardSH.
	* @param value the new labelCreditCardSH.
	*/
	public void setLabelCreditCardSH(String value){
		getField("labelCreditCardSH").setValue(value);
	}
	/**
	* return the dpricredit.
	* @return the dpricredit.
	*/
	public SimpleScreenField getDpricreditField(){
		return getField("dpricredit");
	}

	/**
	* return the dpricredit value.
	* @return the dpricredit value.
	*/
	public Long getDpricredit(){
		return getField("dpricredit").getValue(Long.class);
	}

	/**
	* sets the value for dpricredit.
	* @param value the new dpricredit.
	*/
	public void setDpricredit(Long value){
		getField("dpricredit").setValue(value);
	}
	/**
	* return the labelCreditCardSH1.
	* @return the labelCreditCardSH1.
	*/
	public SimpleScreenField getLabelCreditCardSH1Field(){
		return getField("labelCreditCardSH1");
	}

	/**
	* return the labelCreditCardSH1 value.
	* @return the labelCreditCardSH1 value.
	*/
	public String getLabelCreditCardSH1(){
		return getField("labelCreditCardSH1").getValue(String.class);
	}

	/**
	* sets the value for labelCreditCardSH1.
	* @param value the new labelCreditCardSH1.
	*/
	public void setLabelCreditCardSH1(String value){
		getField("labelCreditCardSH1").setValue(value);
	}
	/**
	* return the dseccredit.
	* @return the dseccredit.
	*/
	public SimpleScreenField getDseccreditField(){
		return getField("dseccredit");
	}

	/**
	* return the dseccredit value.
	* @return the dseccredit value.
	*/
	public Long getDseccredit(){
		return getField("dseccredit").getValue(Long.class);
	}

	/**
	* sets the value for dseccredit.
	* @param value the new dseccredit.
	*/
	public void setDseccredit(Long value){
		getField("dseccredit").setValue(value);
	}
}