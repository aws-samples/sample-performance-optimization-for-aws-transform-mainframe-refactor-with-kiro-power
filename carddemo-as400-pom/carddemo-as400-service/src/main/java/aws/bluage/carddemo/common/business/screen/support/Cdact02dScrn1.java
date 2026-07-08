// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdact02dScrn1.
 */
public class Cdact02dScrn1 extends BaseScreenBean {

	public Cdact02dScrn1() {
		super("csrrec", "csrfld", "csrpos", "labelEditAccount", "labelAddAccount", "labelViewAccount", "date1", "time1", "labelUser", "pgmname", "acctnum", "opendate", "expirydate", "pricustid", "seccustid", "acctgrp", "credlimit", "cashlimit", "labelCurrentBalance", "balance", "labelCurrentCycleCredit", "curcredit", "labelCurrentCycleDebit", "curdebit", "labelCreatedBy", "actcrtusr", "labelOn", "actcrtdt", "actcrttm", "labelProgram", "actcrtpgm", "labelUpdatedBy", "actchgusr", "labelOn1", "actchgdt", "actchgtm", "labelProgram1", "actchgpgm", "labelAccountStatus", "status");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

	}

	public String getComponentId() {
		return "cdact02d-scrn1";
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
	* return the labelAddAccount.
	* @return the labelAddAccount.
	*/
	public SimpleScreenField getLabelAddAccountField(){
		return getField("labelAddAccount");
	}

	/**
	* return the labelAddAccount value.
	* @return the labelAddAccount value.
	*/
	public String getLabelAddAccount(){
		return getField("labelAddAccount").getValue(String.class);
	}

	/**
	* sets the value for labelAddAccount.
	* @param value the new labelAddAccount.
	*/
	public void setLabelAddAccount(String value){
		getField("labelAddAccount").setValue(value);
	}
	/**
	* return the labelViewAccount.
	* @return the labelViewAccount.
	*/
	public SimpleScreenField getLabelViewAccountField(){
		return getField("labelViewAccount");
	}

	/**
	* return the labelViewAccount value.
	* @return the labelViewAccount value.
	*/
	public String getLabelViewAccount(){
		return getField("labelViewAccount").getValue(String.class);
	}

	/**
	* sets the value for labelViewAccount.
	* @param value the new labelViewAccount.
	*/
	public void setLabelViewAccount(String value){
		getField("labelViewAccount").setValue(value);
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
	* return the expirydate.
	* @return the expirydate.
	*/
	public SimpleScreenField getExpirydateField(){
		return getField("expirydate");
	}

	/**
	* return the expirydate value.
	* @return the expirydate value.
	*/
	public String getExpirydate(){
		return getField("expirydate").getValue(String.class);
	}

	/**
	* sets the value for expirydate.
	* @param value the new expirydate.
	*/
	public void setExpirydate(String value){
		getField("expirydate").setValue(value);
	}
	/**
	* return the pricustid.
	* @return the pricustid.
	*/
	public SimpleScreenField getPricustidField(){
		return getField("pricustid");
	}

	/**
	* return the pricustid value.
	* @return the pricustid value.
	*/
	public String getPricustid(){
		return getField("pricustid").getValue(String.class);
	}

	/**
	* sets the value for pricustid.
	* @param value the new pricustid.
	*/
	public void setPricustid(String value){
		getField("pricustid").setValue(value);
	}
	/**
	* return the seccustid.
	* @return the seccustid.
	*/
	public SimpleScreenField getSeccustidField(){
		return getField("seccustid");
	}

	/**
	* return the seccustid value.
	* @return the seccustid value.
	*/
	public String getSeccustid(){
		return getField("seccustid").getValue(String.class);
	}

	/**
	* sets the value for seccustid.
	* @param value the new seccustid.
	*/
	public void setSeccustid(String value){
		getField("seccustid").setValue(value);
	}
	/**
	* return the acctgrp.
	* @return the acctgrp.
	*/
	public SimpleScreenField getAcctgrpField(){
		return getField("acctgrp");
	}

	/**
	* return the acctgrp value.
	* @return the acctgrp value.
	*/
	public String getAcctgrp(){
		return getField("acctgrp").getValue(String.class);
	}

	/**
	* sets the value for acctgrp.
	* @param value the new acctgrp.
	*/
	public void setAcctgrp(String value){
		getField("acctgrp").setValue(value);
	}
	/**
	* return the credlimit.
	* @return the credlimit.
	*/
	public SimpleScreenField getCredlimitField(){
		return getField("credlimit");
	}

	/**
	* return the credlimit value.
	* @return the credlimit value.
	*/
	public String getCredlimit(){
		return getField("credlimit").getValue(String.class);
	}

	/**
	* sets the value for credlimit.
	* @param value the new credlimit.
	*/
	public void setCredlimit(String value){
		getField("credlimit").setValue(value);
	}
	/**
	* return the cashlimit.
	* @return the cashlimit.
	*/
	public SimpleScreenField getCashlimitField(){
		return getField("cashlimit");
	}

	/**
	* return the cashlimit value.
	* @return the cashlimit value.
	*/
	public String getCashlimit(){
		return getField("cashlimit").getValue(String.class);
	}

	/**
	* sets the value for cashlimit.
	* @param value the new cashlimit.
	*/
	public void setCashlimit(String value){
		getField("cashlimit").setValue(value);
	}
	/**
	* return the labelCurrentBalance.
	* @return the labelCurrentBalance.
	*/
	public SimpleScreenField getLabelCurrentBalanceField(){
		return getField("labelCurrentBalance");
	}

	/**
	* return the labelCurrentBalance value.
	* @return the labelCurrentBalance value.
	*/
	public String getLabelCurrentBalance(){
		return getField("labelCurrentBalance").getValue(String.class);
	}

	/**
	* sets the value for labelCurrentBalance.
	* @param value the new labelCurrentBalance.
	*/
	public void setLabelCurrentBalance(String value){
		getField("labelCurrentBalance").setValue(value);
	}
	/**
	* return the balance.
	* @return the balance.
	*/
	public SimpleScreenField getBalanceField(){
		return getField("balance");
	}

	/**
	* return the balance value.
	* @return the balance value.
	*/
	public String getBalance(){
		return getField("balance").getValue(String.class);
	}

	/**
	* sets the value for balance.
	* @param value the new balance.
	*/
	public void setBalance(String value){
		getField("balance").setValue(value);
	}
	/**
	* return the labelCurrentCycleCredit.
	* @return the labelCurrentCycleCredit.
	*/
	public SimpleScreenField getLabelCurrentCycleCreditField(){
		return getField("labelCurrentCycleCredit");
	}

	/**
	* return the labelCurrentCycleCredit value.
	* @return the labelCurrentCycleCredit value.
	*/
	public String getLabelCurrentCycleCredit(){
		return getField("labelCurrentCycleCredit").getValue(String.class);
	}

	/**
	* sets the value for labelCurrentCycleCredit.
	* @param value the new labelCurrentCycleCredit.
	*/
	public void setLabelCurrentCycleCredit(String value){
		getField("labelCurrentCycleCredit").setValue(value);
	}
	/**
	* return the curcredit.
	* @return the curcredit.
	*/
	public SimpleScreenField getCurcreditField(){
		return getField("curcredit");
	}

	/**
	* return the curcredit value.
	* @return the curcredit value.
	*/
	public String getCurcredit(){
		return getField("curcredit").getValue(String.class);
	}

	/**
	* sets the value for curcredit.
	* @param value the new curcredit.
	*/
	public void setCurcredit(String value){
		getField("curcredit").setValue(value);
	}
	/**
	* return the labelCurrentCycleDebit.
	* @return the labelCurrentCycleDebit.
	*/
	public SimpleScreenField getLabelCurrentCycleDebitField(){
		return getField("labelCurrentCycleDebit");
	}

	/**
	* return the labelCurrentCycleDebit value.
	* @return the labelCurrentCycleDebit value.
	*/
	public String getLabelCurrentCycleDebit(){
		return getField("labelCurrentCycleDebit").getValue(String.class);
	}

	/**
	* sets the value for labelCurrentCycleDebit.
	* @param value the new labelCurrentCycleDebit.
	*/
	public void setLabelCurrentCycleDebit(String value){
		getField("labelCurrentCycleDebit").setValue(value);
	}
	/**
	* return the curdebit.
	* @return the curdebit.
	*/
	public SimpleScreenField getCurdebitField(){
		return getField("curdebit");
	}

	/**
	* return the curdebit value.
	* @return the curdebit value.
	*/
	public String getCurdebit(){
		return getField("curdebit").getValue(String.class);
	}

	/**
	* sets the value for curdebit.
	* @param value the new curdebit.
	*/
	public void setCurdebit(String value){
		getField("curdebit").setValue(value);
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
	* return the actcrtusr.
	* @return the actcrtusr.
	*/
	public SimpleScreenField getActcrtusrField(){
		return getField("actcrtusr");
	}

	/**
	* return the actcrtusr value.
	* @return the actcrtusr value.
	*/
	public String getActcrtusr(){
		return getField("actcrtusr").getValue(String.class);
	}

	/**
	* sets the value for actcrtusr.
	* @param value the new actcrtusr.
	*/
	public void setActcrtusr(String value){
		getField("actcrtusr").setValue(value);
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
	* return the actcrtdt.
	* @return the actcrtdt.
	*/
	public SimpleScreenField getActcrtdtField(){
		return getField("actcrtdt");
	}

	/**
	* return the actcrtdt value.
	* @return the actcrtdt value.
	*/
	public Integer getActcrtdt(){
		return getField("actcrtdt").getValue(Integer.class);
	}

	/**
	* sets the value for actcrtdt.
	* @param value the new actcrtdt.
	*/
	public void setActcrtdt(Integer value){
		getField("actcrtdt").setValue(value);
	}
	/**
	* return the actcrttm.
	* @return the actcrttm.
	*/
	public SimpleScreenField getActcrttmField(){
		return getField("actcrttm");
	}

	/**
	* return the actcrttm value.
	* @return the actcrttm value.
	*/
	public Integer getActcrttm(){
		return getField("actcrttm").getValue(Integer.class);
	}

	/**
	* sets the value for actcrttm.
	* @param value the new actcrttm.
	*/
	public void setActcrttm(Integer value){
		getField("actcrttm").setValue(value);
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
	* return the actcrtpgm.
	* @return the actcrtpgm.
	*/
	public SimpleScreenField getActcrtpgmField(){
		return getField("actcrtpgm");
	}

	/**
	* return the actcrtpgm value.
	* @return the actcrtpgm value.
	*/
	public String getActcrtpgm(){
		return getField("actcrtpgm").getValue(String.class);
	}

	/**
	* sets the value for actcrtpgm.
	* @param value the new actcrtpgm.
	*/
	public void setActcrtpgm(String value){
		getField("actcrtpgm").setValue(value);
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
	* return the actchgusr.
	* @return the actchgusr.
	*/
	public SimpleScreenField getActchgusrField(){
		return getField("actchgusr");
	}

	/**
	* return the actchgusr value.
	* @return the actchgusr value.
	*/
	public String getActchgusr(){
		return getField("actchgusr").getValue(String.class);
	}

	/**
	* sets the value for actchgusr.
	* @param value the new actchgusr.
	*/
	public void setActchgusr(String value){
		getField("actchgusr").setValue(value);
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
	* return the actchgdt.
	* @return the actchgdt.
	*/
	public SimpleScreenField getActchgdtField(){
		return getField("actchgdt");
	}

	/**
	* return the actchgdt value.
	* @return the actchgdt value.
	*/
	public Integer getActchgdt(){
		return getField("actchgdt").getValue(Integer.class);
	}

	/**
	* sets the value for actchgdt.
	* @param value the new actchgdt.
	*/
	public void setActchgdt(Integer value){
		getField("actchgdt").setValue(value);
	}
	/**
	* return the actchgtm.
	* @return the actchgtm.
	*/
	public SimpleScreenField getActchgtmField(){
		return getField("actchgtm");
	}

	/**
	* return the actchgtm value.
	* @return the actchgtm value.
	*/
	public Integer getActchgtm(){
		return getField("actchgtm").getValue(Integer.class);
	}

	/**
	* sets the value for actchgtm.
	* @param value the new actchgtm.
	*/
	public void setActchgtm(Integer value){
		getField("actchgtm").setValue(value);
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
	* return the actchgpgm.
	* @return the actchgpgm.
	*/
	public SimpleScreenField getActchgpgmField(){
		return getField("actchgpgm");
	}

	/**
	* return the actchgpgm value.
	* @return the actchgpgm value.
	*/
	public String getActchgpgm(){
		return getField("actchgpgm").getValue(String.class);
	}

	/**
	* sets the value for actchgpgm.
	* @param value the new actchgpgm.
	*/
	public void setActchgpgm(String value){
		getField("actchgpgm").setValue(value);
	}
	/**
	* return the labelAccountStatus.
	* @return the labelAccountStatus.
	*/
	public SimpleScreenField getLabelAccountStatusField(){
		return getField("labelAccountStatus");
	}

	/**
	* return the labelAccountStatus value.
	* @return the labelAccountStatus value.
	*/
	public String getLabelAccountStatus(){
		return getField("labelAccountStatus").getValue(String.class);
	}

	/**
	* sets the value for labelAccountStatus.
	* @param value the new labelAccountStatus.
	*/
	public void setLabelAccountStatus(String value){
		getField("labelAccountStatus").setValue(value);
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
}