// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdccm02dScrn1.
 */
public class Cdccm02dScrn1 extends BaseScreenBean {

	public Cdccm02dScrn1() {
		super("csrrec", "csrfld", "csrpos", "labelViewCreditCard", "labelCreateCreditCard", "labelUpdateCreditCard", "date1", "time1", "labelUser", "pgmname", "cardnum", "custid", "acctnum", "name", "primarysec", "status", "statusdess", "expirymo", "expiryyr", "cvv", "labelCreatedBy", "ccmcrtusr", "labelOn", "ccmcrtdt", "ccmcrttm", "labelProgram", "ccmcrtpgm", "labelUpdatedBy", "ccmchgusr", "labelOn1", "ccmchgdt", "ccmchgtm", "labelProgram1", "ccmchgpgm", "labelF3ExitF9CardHistory", "labelF12Cancel", "labelF2Clear", "labelF3ExitF12Cancel", "labelF3ExitF9CardHistory1", "labelF12Cancel1");
		setDspMode("*DS3");
		
		addFKeys("02", "03", "04", "09", "12");

	}

	public String getComponentId() {
		return "cdccm02d-scrn1";
	}

	/**
	* return the csrrec.
	* @return the csrrec.
	*/
	public SimpleScreenField getCsrrecField(){
		return getField("csrrec");
	}

	/**
	* return the csrrec value.
	* @return the csrrec value.
	*/
	public String getCsrrec(){
		return getField("csrrec").getValue(String.class);
	}

	/**
	* sets the value for csrrec.
	* @param value the new csrrec.
	*/
	public void setCsrrec(String value){
		getField("csrrec").setValue(value);
	}
	/**
	* return the csrfld.
	* @return the csrfld.
	*/
	public SimpleScreenField getCsrfldField(){
		return getField("csrfld");
	}

	/**
	* return the csrfld value.
	* @return the csrfld value.
	*/
	public String getCsrfld(){
		return getField("csrfld").getValue(String.class);
	}

	/**
	* sets the value for csrfld.
	* @param value the new csrfld.
	*/
	public void setCsrfld(String value){
		getField("csrfld").setValue(value);
	}
	/**
	* return the csrpos.
	* @return the csrpos.
	*/
	public SimpleScreenField getCsrposField(){
		return getField("csrpos");
	}

	/**
	* return the csrpos value.
	* @return the csrpos value.
	*/
	public Integer getCsrpos(){
		return getField("csrpos").getValue(Integer.class);
	}

	/**
	* sets the value for csrpos.
	* @param value the new csrpos.
	*/
	public void setCsrpos(Integer value){
		getField("csrpos").setValue(value);
	}
	/**
	* return the labelViewCreditCard.
	* @return the labelViewCreditCard.
	*/
	public SimpleScreenField getLabelViewCreditCardField(){
		return getField("labelViewCreditCard");
	}

	/**
	* return the labelViewCreditCard value.
	* @return the labelViewCreditCard value.
	*/
	public String getLabelViewCreditCard(){
		return getField("labelViewCreditCard").getValue(String.class);
	}

	/**
	* sets the value for labelViewCreditCard.
	* @param value the new labelViewCreditCard.
	*/
	public void setLabelViewCreditCard(String value){
		getField("labelViewCreditCard").setValue(value);
	}
	/**
	* return the labelCreateCreditCard.
	* @return the labelCreateCreditCard.
	*/
	public SimpleScreenField getLabelCreateCreditCardField(){
		return getField("labelCreateCreditCard");
	}

	/**
	* return the labelCreateCreditCard value.
	* @return the labelCreateCreditCard value.
	*/
	public String getLabelCreateCreditCard(){
		return getField("labelCreateCreditCard").getValue(String.class);
	}

	/**
	* sets the value for labelCreateCreditCard.
	* @param value the new labelCreateCreditCard.
	*/
	public void setLabelCreateCreditCard(String value){
		getField("labelCreateCreditCard").setValue(value);
	}
	/**
	* return the labelUpdateCreditCard.
	* @return the labelUpdateCreditCard.
	*/
	public SimpleScreenField getLabelUpdateCreditCardField(){
		return getField("labelUpdateCreditCard");
	}

	/**
	* return the labelUpdateCreditCard value.
	* @return the labelUpdateCreditCard value.
	*/
	public String getLabelUpdateCreditCard(){
		return getField("labelUpdateCreditCard").getValue(String.class);
	}

	/**
	* sets the value for labelUpdateCreditCard.
	* @param value the new labelUpdateCreditCard.
	*/
	public void setLabelUpdateCreditCard(String value){
		getField("labelUpdateCreditCard").setValue(value);
	}
	/**
	* return the date1.
	* @return the date1.
	*/
	public SimpleScreenField getDate1Field(){
		return getField("date1");
	}

	/**
	* return the date1 value.
	* @return the date1 value.
	*/
	public String getDate1(){
		return getField("date1").getValue(String.class);
	}

	/**
	* sets the value for date1.
	* @param value the new date1.
	*/
	public void setDate1(String value){
		getField("date1").setValue(value);
	}
	/**
	* return the time1.
	* @return the time1.
	*/
	public SimpleScreenField getTime1Field(){
		return getField("time1");
	}

	/**
	* return the time1 value.
	* @return the time1 value.
	*/
	public String getTime1(){
		return getField("time1").getValue(String.class);
	}

	/**
	* sets the value for time1.
	* @param value the new time1.
	*/
	public void setTime1(String value){
		getField("time1").setValue(value);
	}
	/**
	* return the labelUser.
	* @return the labelUser.
	*/
	public SimpleScreenField getLabelUserField(){
		return getField("labelUser");
	}

	/**
	* return the labelUser value.
	* @return the labelUser value.
	*/
	public String getLabelUser(){
		return getField("labelUser").getValue(String.class);
	}

	/**
	* sets the value for labelUser.
	* @param value the new labelUser.
	*/
	public void setLabelUser(String value){
		getField("labelUser").setValue(value);
	}
	/**
	* return the pgmname.
	* @return the pgmname.
	*/
	public SimpleScreenField getPgmnameField(){
		return getField("pgmname");
	}

	/**
	* return the pgmname value.
	* @return the pgmname value.
	*/
	public String getPgmname(){
		return getField("pgmname").getValue(String.class);
	}

	/**
	* sets the value for pgmname.
	* @param value the new pgmname.
	*/
	public void setPgmname(String value){
		getField("pgmname").setValue(value);
	}
	/**
	* return the cardnum.
	* @return the cardnum.
	*/
	public SimpleScreenField getCardnumField(){
		return getField("cardnum");
	}

	/**
	* return the cardnum value.
	* @return the cardnum value.
	*/
	public Long getCardnum(){
		return getField("cardnum").getValue(Long.class);
	}

	/**
	* sets the value for cardnum.
	* @param value the new cardnum.
	*/
	public void setCardnum(Long value){
		getField("cardnum").setValue(value);
	}
	/**
	* return the custid.
	* @return the custid.
	*/
	public SimpleScreenField getCustidField(){
		return getField("custid");
	}

	/**
	* return the custid value.
	* @return the custid value.
	*/
	public String getCustid(){
		return getField("custid").getValue(String.class);
	}

	/**
	* sets the value for custid.
	* @param value the new custid.
	*/
	public void setCustid(String value){
		getField("custid").setValue(value);
	}
	/**
	* return the acctnum.
	* @return the acctnum.
	*/
	public SimpleScreenField getAcctnumField(){
		return getField("acctnum");
	}

	/**
	* return the acctnum value.
	* @return the acctnum value.
	*/
	public String getAcctnum(){
		return getField("acctnum").getValue(String.class);
	}

	/**
	* sets the value for acctnum.
	* @param value the new acctnum.
	*/
	public void setAcctnum(String value){
		getField("acctnum").setValue(value);
	}
	/**
	* return the name.
	* @return the name.
	*/
	public SimpleScreenField getNameField(){
		return getField("name");
	}

	/**
	* return the name value.
	* @return the name value.
	*/
	public String getName(){
		return getField("name").getValue(String.class);
	}

	/**
	* sets the value for name.
	* @param value the new name.
	*/
	public void setName(String value){
		getField("name").setValue(value);
	}
	/**
	* return the primarysec.
	* @return the primarysec.
	*/
	public SimpleScreenField getPrimarysecField(){
		return getField("primarysec");
	}

	/**
	* return the primarysec value.
	* @return the primarysec value.
	*/
	public String getPrimarysec(){
		return getField("primarysec").getValue(String.class);
	}

	/**
	* sets the value for primarysec.
	* @param value the new primarysec.
	*/
	public void setPrimarysec(String value){
		getField("primarysec").setValue(value);
	}
	/**
	* return the status.
	* @return the status.
	*/
	public SimpleScreenField getStatusField(){
		return getField("status");
	}

	/**
	* return the status value.
	* @return the status value.
	*/
	public String getStatus(){
		return getField("status").getValue(String.class);
	}

	/**
	* sets the value for status.
	* @param value the new status.
	*/
	public void setStatus(String value){
		getField("status").setValue(value);
	}
	/**
	* return the statusdess.
	* @return the statusdess.
	*/
	public SimpleScreenField getStatusdessField(){
		return getField("statusdess");
	}

	/**
	* return the statusdess value.
	* @return the statusdess value.
	*/
	public String getStatusdess(){
		return getField("statusdess").getValue(String.class);
	}

	/**
	* sets the value for statusdess.
	* @param value the new statusdess.
	*/
	public void setStatusdess(String value){
		getField("statusdess").setValue(value);
	}
	/**
	* return the expirymo.
	* @return the expirymo.
	*/
	public SimpleScreenField getExpirymoField(){
		return getField("expirymo");
	}

	/**
	* return the expirymo value.
	* @return the expirymo value.
	*/
	public String getExpirymo(){
		return getField("expirymo").getValue(String.class);
	}

	/**
	* sets the value for expirymo.
	* @param value the new expirymo.
	*/
	public void setExpirymo(String value){
		getField("expirymo").setValue(value);
	}
	/**
	* return the expiryyr.
	* @return the expiryyr.
	*/
	public SimpleScreenField getExpiryyrField(){
		return getField("expiryyr");
	}

	/**
	* return the expiryyr value.
	* @return the expiryyr value.
	*/
	public String getExpiryyr(){
		return getField("expiryyr").getValue(String.class);
	}

	/**
	* sets the value for expiryyr.
	* @param value the new expiryyr.
	*/
	public void setExpiryyr(String value){
		getField("expiryyr").setValue(value);
	}
	/**
	* return the cvv.
	* @return the cvv.
	*/
	public SimpleScreenField getCvvField(){
		return getField("cvv");
	}

	/**
	* return the cvv value.
	* @return the cvv value.
	*/
	public String getCvv(){
		return getField("cvv").getValue(String.class);
	}

	/**
	* sets the value for cvv.
	* @param value the new cvv.
	*/
	public void setCvv(String value){
		getField("cvv").setValue(value);
	}
	/**
	* return the labelCreatedBy.
	* @return the labelCreatedBy.
	*/
	public SimpleScreenField getLabelCreatedByField(){
		return getField("labelCreatedBy");
	}

	/**
	* return the labelCreatedBy value.
	* @return the labelCreatedBy value.
	*/
	public String getLabelCreatedBy(){
		return getField("labelCreatedBy").getValue(String.class);
	}

	/**
	* sets the value for labelCreatedBy.
	* @param value the new labelCreatedBy.
	*/
	public void setLabelCreatedBy(String value){
		getField("labelCreatedBy").setValue(value);
	}
	/**
	* return the ccmcrtusr.
	* @return the ccmcrtusr.
	*/
	public SimpleScreenField getCcmcrtusrField(){
		return getField("ccmcrtusr");
	}

	/**
	* return the ccmcrtusr value.
	* @return the ccmcrtusr value.
	*/
	public String getCcmcrtusr(){
		return getField("ccmcrtusr").getValue(String.class);
	}

	/**
	* sets the value for ccmcrtusr.
	* @param value the new ccmcrtusr.
	*/
	public void setCcmcrtusr(String value){
		getField("ccmcrtusr").setValue(value);
	}
	/**
	* return the labelOn.
	* @return the labelOn.
	*/
	public SimpleScreenField getLabelOnField(){
		return getField("labelOn");
	}

	/**
	* return the labelOn value.
	* @return the labelOn value.
	*/
	public String getLabelOn(){
		return getField("labelOn").getValue(String.class);
	}

	/**
	* sets the value for labelOn.
	* @param value the new labelOn.
	*/
	public void setLabelOn(String value){
		getField("labelOn").setValue(value);
	}
	/**
	* return the ccmcrtdt.
	* @return the ccmcrtdt.
	*/
	public SimpleScreenField getCcmcrtdtField(){
		return getField("ccmcrtdt");
	}

	/**
	* return the ccmcrtdt value.
	* @return the ccmcrtdt value.
	*/
	public Integer getCcmcrtdt(){
		return getField("ccmcrtdt").getValue(Integer.class);
	}

	/**
	* sets the value for ccmcrtdt.
	* @param value the new ccmcrtdt.
	*/
	public void setCcmcrtdt(Integer value){
		getField("ccmcrtdt").setValue(value);
	}
	/**
	* return the ccmcrttm.
	* @return the ccmcrttm.
	*/
	public SimpleScreenField getCcmcrttmField(){
		return getField("ccmcrttm");
	}

	/**
	* return the ccmcrttm value.
	* @return the ccmcrttm value.
	*/
	public Integer getCcmcrttm(){
		return getField("ccmcrttm").getValue(Integer.class);
	}

	/**
	* sets the value for ccmcrttm.
	* @param value the new ccmcrttm.
	*/
	public void setCcmcrttm(Integer value){
		getField("ccmcrttm").setValue(value);
	}
	/**
	* return the labelProgram.
	* @return the labelProgram.
	*/
	public SimpleScreenField getLabelProgramField(){
		return getField("labelProgram");
	}

	/**
	* return the labelProgram value.
	* @return the labelProgram value.
	*/
	public String getLabelProgram(){
		return getField("labelProgram").getValue(String.class);
	}

	/**
	* sets the value for labelProgram.
	* @param value the new labelProgram.
	*/
	public void setLabelProgram(String value){
		getField("labelProgram").setValue(value);
	}
	/**
	* return the ccmcrtpgm.
	* @return the ccmcrtpgm.
	*/
	public SimpleScreenField getCcmcrtpgmField(){
		return getField("ccmcrtpgm");
	}

	/**
	* return the ccmcrtpgm value.
	* @return the ccmcrtpgm value.
	*/
	public String getCcmcrtpgm(){
		return getField("ccmcrtpgm").getValue(String.class);
	}

	/**
	* sets the value for ccmcrtpgm.
	* @param value the new ccmcrtpgm.
	*/
	public void setCcmcrtpgm(String value){
		getField("ccmcrtpgm").setValue(value);
	}
	/**
	* return the labelUpdatedBy.
	* @return the labelUpdatedBy.
	*/
	public SimpleScreenField getLabelUpdatedByField(){
		return getField("labelUpdatedBy");
	}

	/**
	* return the labelUpdatedBy value.
	* @return the labelUpdatedBy value.
	*/
	public String getLabelUpdatedBy(){
		return getField("labelUpdatedBy").getValue(String.class);
	}

	/**
	* sets the value for labelUpdatedBy.
	* @param value the new labelUpdatedBy.
	*/
	public void setLabelUpdatedBy(String value){
		getField("labelUpdatedBy").setValue(value);
	}
	/**
	* return the ccmchgusr.
	* @return the ccmchgusr.
	*/
	public SimpleScreenField getCcmchgusrField(){
		return getField("ccmchgusr");
	}

	/**
	* return the ccmchgusr value.
	* @return the ccmchgusr value.
	*/
	public String getCcmchgusr(){
		return getField("ccmchgusr").getValue(String.class);
	}

	/**
	* sets the value for ccmchgusr.
	* @param value the new ccmchgusr.
	*/
	public void setCcmchgusr(String value){
		getField("ccmchgusr").setValue(value);
	}
	/**
	* return the labelOn1.
	* @return the labelOn1.
	*/
	public SimpleScreenField getLabelOn1Field(){
		return getField("labelOn1");
	}

	/**
	* return the labelOn1 value.
	* @return the labelOn1 value.
	*/
	public String getLabelOn1(){
		return getField("labelOn1").getValue(String.class);
	}

	/**
	* sets the value for labelOn1.
	* @param value the new labelOn1.
	*/
	public void setLabelOn1(String value){
		getField("labelOn1").setValue(value);
	}
	/**
	* return the ccmchgdt.
	* @return the ccmchgdt.
	*/
	public SimpleScreenField getCcmchgdtField(){
		return getField("ccmchgdt");
	}

	/**
	* return the ccmchgdt value.
	* @return the ccmchgdt value.
	*/
	public Integer getCcmchgdt(){
		return getField("ccmchgdt").getValue(Integer.class);
	}

	/**
	* sets the value for ccmchgdt.
	* @param value the new ccmchgdt.
	*/
	public void setCcmchgdt(Integer value){
		getField("ccmchgdt").setValue(value);
	}
	/**
	* return the ccmchgtm.
	* @return the ccmchgtm.
	*/
	public SimpleScreenField getCcmchgtmField(){
		return getField("ccmchgtm");
	}

	/**
	* return the ccmchgtm value.
	* @return the ccmchgtm value.
	*/
	public Integer getCcmchgtm(){
		return getField("ccmchgtm").getValue(Integer.class);
	}

	/**
	* sets the value for ccmchgtm.
	* @param value the new ccmchgtm.
	*/
	public void setCcmchgtm(Integer value){
		getField("ccmchgtm").setValue(value);
	}
	/**
	* return the labelProgram1.
	* @return the labelProgram1.
	*/
	public SimpleScreenField getLabelProgram1Field(){
		return getField("labelProgram1");
	}

	/**
	* return the labelProgram1 value.
	* @return the labelProgram1 value.
	*/
	public String getLabelProgram1(){
		return getField("labelProgram1").getValue(String.class);
	}

	/**
	* sets the value for labelProgram1.
	* @param value the new labelProgram1.
	*/
	public void setLabelProgram1(String value){
		getField("labelProgram1").setValue(value);
	}
	/**
	* return the ccmchgpgm.
	* @return the ccmchgpgm.
	*/
	public SimpleScreenField getCcmchgpgmField(){
		return getField("ccmchgpgm");
	}

	/**
	* return the ccmchgpgm value.
	* @return the ccmchgpgm value.
	*/
	public String getCcmchgpgm(){
		return getField("ccmchgpgm").getValue(String.class);
	}

	/**
	* sets the value for ccmchgpgm.
	* @param value the new ccmchgpgm.
	*/
	public void setCcmchgpgm(String value){
		getField("ccmchgpgm").setValue(value);
	}
	/**
	* return the labelF3ExitF9CardHistory.
	* @return the labelF3ExitF9CardHistory.
	*/
	public SimpleScreenField getLabelF3ExitF9CardHistoryField(){
		return getField("labelF3ExitF9CardHistory");
	}

	/**
	* return the labelF3ExitF9CardHistory value.
	* @return the labelF3ExitF9CardHistory value.
	*/
	public String getLabelF3ExitF9CardHistory(){
		return getField("labelF3ExitF9CardHistory").getValue(String.class);
	}

	/**
	* sets the value for labelF3ExitF9CardHistory.
	* @param value the new labelF3ExitF9CardHistory.
	*/
	public void setLabelF3ExitF9CardHistory(String value){
		getField("labelF3ExitF9CardHistory").setValue(value);
	}
	/**
	* return the labelF12Cancel.
	* @return the labelF12Cancel.
	*/
	public SimpleScreenField getLabelF12CancelField(){
		return getField("labelF12Cancel");
	}

	/**
	* return the labelF12Cancel value.
	* @return the labelF12Cancel value.
	*/
	public String getLabelF12Cancel(){
		return getField("labelF12Cancel").getValue(String.class);
	}

	/**
	* sets the value for labelF12Cancel.
	* @param value the new labelF12Cancel.
	*/
	public void setLabelF12Cancel(String value){
		getField("labelF12Cancel").setValue(value);
	}
	/**
	* return the labelF2Clear.
	* @return the labelF2Clear.
	*/
	public SimpleScreenField getLabelF2ClearField(){
		return getField("labelF2Clear");
	}

	/**
	* return the labelF2Clear value.
	* @return the labelF2Clear value.
	*/
	public String getLabelF2Clear(){
		return getField("labelF2Clear").getValue(String.class);
	}

	/**
	* sets the value for labelF2Clear.
	* @param value the new labelF2Clear.
	*/
	public void setLabelF2Clear(String value){
		getField("labelF2Clear").setValue(value);
	}
	/**
	* return the labelF3ExitF12Cancel.
	* @return the labelF3ExitF12Cancel.
	*/
	public SimpleScreenField getLabelF3ExitF12CancelField(){
		return getField("labelF3ExitF12Cancel");
	}

	/**
	* return the labelF3ExitF12Cancel value.
	* @return the labelF3ExitF12Cancel value.
	*/
	public String getLabelF3ExitF12Cancel(){
		return getField("labelF3ExitF12Cancel").getValue(String.class);
	}

	/**
	* sets the value for labelF3ExitF12Cancel.
	* @param value the new labelF3ExitF12Cancel.
	*/
	public void setLabelF3ExitF12Cancel(String value){
		getField("labelF3ExitF12Cancel").setValue(value);
	}
	/**
	* return the labelF3ExitF9CardHistory1.
	* @return the labelF3ExitF9CardHistory1.
	*/
	public SimpleScreenField getLabelF3ExitF9CardHistory1Field(){
		return getField("labelF3ExitF9CardHistory1");
	}

	/**
	* return the labelF3ExitF9CardHistory1 value.
	* @return the labelF3ExitF9CardHistory1 value.
	*/
	public String getLabelF3ExitF9CardHistory1(){
		return getField("labelF3ExitF9CardHistory1").getValue(String.class);
	}

	/**
	* sets the value for labelF3ExitF9CardHistory1.
	* @param value the new labelF3ExitF9CardHistory1.
	*/
	public void setLabelF3ExitF9CardHistory1(String value){
		getField("labelF3ExitF9CardHistory1").setValue(value);
	}
	/**
	* return the labelF12Cancel1.
	* @return the labelF12Cancel1.
	*/
	public SimpleScreenField getLabelF12Cancel1Field(){
		return getField("labelF12Cancel1");
	}

	/**
	* return the labelF12Cancel1 value.
	* @return the labelF12Cancel1 value.
	*/
	public String getLabelF12Cancel1(){
		return getField("labelF12Cancel1").getValue(String.class);
	}

	/**
	* sets the value for labelF12Cancel1.
	* @param value the new labelF12Cancel1.
	*/
	public void setLabelF12Cancel1(String value){
		getField("labelF12Cancel1").setValue(value);
	}
}