// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdtrn02dScrn1.
 */
public class Cdtrn02dScrn1 extends BaseScreenBean {

	public Cdtrn02dScrn1() {
		super("csrrec", "csrfld", "csrpos", "labelViewTransactions", "labelSubmitTransaction", "date1", "time1", "labelUser", "pgmname", "ftrtext", "trnid", "labelStatus", "status", "statusdtl", "cardnum", "typecd", "categcd", "source", "dess", "amountedt", "amountdsp", "merchid", "merchname", "origdate", "procdate", "labelSubmittedBy", "usra1", "labelOn", "dtea1", "tmea1", "labelProgram", "pgma1", "labelAuthorizedBy", "usra2", "labelOn1", "dtea2", "tmea2", "labelProgram1", "pgma2", "labelReversedBy", "usrb1", "labelOn2", "dteb1", "tmeb1", "labelProgram2", "pgmb1", "labelAuthorizedBy1", "usrb2", "labelOn3", "dteb2", "tmeb2", "labelProgram3", "pgmb2");
		setDspMode("*DS3");
		
		

	}

	public String getComponentId() {
		return "cdtrn02d-scrn1";
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
	* return the labelViewTransactions.
	* @return the labelViewTransactions.
	*/
	public SimpleScreenField getLabelViewTransactionsField(){
		return getField("labelViewTransactions");
	}

	/**
	* return the labelViewTransactions value.
	* @return the labelViewTransactions value.
	*/
	public String getLabelViewTransactions(){
		return getField("labelViewTransactions").getValue(String.class);
	}

	/**
	* sets the value for labelViewTransactions.
	* @param value the new labelViewTransactions.
	*/
	public void setLabelViewTransactions(String value){
		getField("labelViewTransactions").setValue(value);
	}
	/**
	* return the labelSubmitTransaction.
	* @return the labelSubmitTransaction.
	*/
	public SimpleScreenField getLabelSubmitTransactionField(){
		return getField("labelSubmitTransaction");
	}

	/**
	* return the labelSubmitTransaction value.
	* @return the labelSubmitTransaction value.
	*/
	public String getLabelSubmitTransaction(){
		return getField("labelSubmitTransaction").getValue(String.class);
	}

	/**
	* sets the value for labelSubmitTransaction.
	* @param value the new labelSubmitTransaction.
	*/
	public void setLabelSubmitTransaction(String value){
		getField("labelSubmitTransaction").setValue(value);
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
	* return the ftrtext.
	* @return the ftrtext.
	*/
	public SimpleScreenField getFtrtextField(){
		return getField("ftrtext");
	}

	/**
	* return the ftrtext value.
	* @return the ftrtext value.
	*/
	public String getFtrtext(){
		return getField("ftrtext").getValue(String.class);
	}

	/**
	* sets the value for ftrtext.
	* @param value the new ftrtext.
	*/
	public void setFtrtext(String value){
		getField("ftrtext").setValue(value);
	}
	/**
	* return the trnid.
	* @return the trnid.
	*/
	public SimpleScreenField getTrnidField(){
		return getField("trnid");
	}

	/**
	* return the trnid value.
	* @return the trnid value.
	*/
	public Long getTrnid(){
		return getField("trnid").getValue(Long.class);
	}

	/**
	* sets the value for trnid.
	* @param value the new trnid.
	*/
	public void setTrnid(Long value){
		getField("trnid").setValue(value);
	}
	/**
	* return the labelStatus.
	* @return the labelStatus.
	*/
	public SimpleScreenField getLabelStatusField(){
		return getField("labelStatus");
	}

	/**
	* return the labelStatus value.
	* @return the labelStatus value.
	*/
	public String getLabelStatus(){
		return getField("labelStatus").getValue(String.class);
	}

	/**
	* sets the value for labelStatus.
	* @param value the new labelStatus.
	*/
	public void setLabelStatus(String value){
		getField("labelStatus").setValue(value);
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
	* return the statusdtl.
	* @return the statusdtl.
	*/
	public SimpleScreenField getStatusdtlField(){
		return getField("statusdtl");
	}

	/**
	* return the statusdtl value.
	* @return the statusdtl value.
	*/
	public String getStatusdtl(){
		return getField("statusdtl").getValue(String.class);
	}

	/**
	* sets the value for statusdtl.
	* @param value the new statusdtl.
	*/
	public void setStatusdtl(String value){
		getField("statusdtl").setValue(value);
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
	* return the typecd.
	* @return the typecd.
	*/
	public SimpleScreenField getTypecdField(){
		return getField("typecd");
	}

	/**
	* return the typecd value.
	* @return the typecd value.
	*/
	public String getTypecd(){
		return getField("typecd").getValue(String.class);
	}

	/**
	* sets the value for typecd.
	* @param value the new typecd.
	*/
	public void setTypecd(String value){
		getField("typecd").setValue(value);
	}
	/**
	* return the categcd.
	* @return the categcd.
	*/
	public SimpleScreenField getCategcdField(){
		return getField("categcd");
	}

	/**
	* return the categcd value.
	* @return the categcd value.
	*/
	public String getCategcd(){
		return getField("categcd").getValue(String.class);
	}

	/**
	* sets the value for categcd.
	* @param value the new categcd.
	*/
	public void setCategcd(String value){
		getField("categcd").setValue(value);
	}
	/**
	* return the source.
	* @return the source.
	*/
	public SimpleScreenField getSourceField(){
		return getField("source");
	}

	/**
	* return the source value.
	* @return the source value.
	*/
	public String getSource(){
		return getField("source").getValue(String.class);
	}

	/**
	* sets the value for source.
	* @param value the new source.
	*/
	public void setSource(String value){
		getField("source").setValue(value);
	}
	/**
	* return the dess.
	* @return the dess.
	*/
	public SimpleScreenField getDessField(){
		return getField("dess");
	}

	/**
	* return the dess value.
	* @return the dess value.
	*/
	public String getDess(){
		return getField("dess").getValue(String.class);
	}

	/**
	* sets the value for dess.
	* @param value the new dess.
	*/
	public void setDess(String value){
		getField("dess").setValue(value);
	}
	/**
	* return the amountedt.
	* @return the amountedt.
	*/
	public SimpleScreenField getAmountedtField(){
		return getField("amountedt");
	}

	/**
	* return the amountedt value.
	* @return the amountedt value.
	*/
	public String getAmountedt(){
		return getField("amountedt").getValue(String.class);
	}

	/**
	* sets the value for amountedt.
	* @param value the new amountedt.
	*/
	public void setAmountedt(String value){
		getField("amountedt").setValue(value);
	}
	/**
	* return the amountdsp.
	* @return the amountdsp.
	*/
	public SimpleScreenField getAmountdspField(){
		return getField("amountdsp");
	}

	/**
	* return the amountdsp value.
	* @return the amountdsp value.
	*/
	public String getAmountdsp(){
		return getField("amountdsp").getValue(String.class);
	}

	/**
	* sets the value for amountdsp.
	* @param value the new amountdsp.
	*/
	public void setAmountdsp(String value){
		getField("amountdsp").setValue(value);
	}
	/**
	* return the merchid.
	* @return the merchid.
	*/
	public SimpleScreenField getMerchidField(){
		return getField("merchid");
	}

	/**
	* return the merchid value.
	* @return the merchid value.
	*/
	public Integer getMerchid(){
		return getField("merchid").getValue(Integer.class);
	}

	/**
	* sets the value for merchid.
	* @param value the new merchid.
	*/
	public void setMerchid(Integer value){
		getField("merchid").setValue(value);
	}
	/**
	* return the merchname.
	* @return the merchname.
	*/
	public SimpleScreenField getMerchnameField(){
		return getField("merchname");
	}

	/**
	* return the merchname value.
	* @return the merchname value.
	*/
	public String getMerchname(){
		return getField("merchname").getValue(String.class);
	}

	/**
	* sets the value for merchname.
	* @param value the new merchname.
	*/
	public void setMerchname(String value){
		getField("merchname").setValue(value);
	}
	/**
	* return the origdate.
	* @return the origdate.
	*/
	public SimpleScreenField getOrigdateField(){
		return getField("origdate");
	}

	/**
	* return the origdate value.
	* @return the origdate value.
	*/
	public String getOrigdate(){
		return getField("origdate").getValue(String.class);
	}

	/**
	* sets the value for origdate.
	* @param value the new origdate.
	*/
	public void setOrigdate(String value){
		getField("origdate").setValue(value);
	}
	/**
	* return the procdate.
	* @return the procdate.
	*/
	public SimpleScreenField getProcdateField(){
		return getField("procdate");
	}

	/**
	* return the procdate value.
	* @return the procdate value.
	*/
	public String getProcdate(){
		return getField("procdate").getValue(String.class);
	}

	/**
	* sets the value for procdate.
	* @param value the new procdate.
	*/
	public void setProcdate(String value){
		getField("procdate").setValue(value);
	}
	/**
	* return the labelSubmittedBy.
	* @return the labelSubmittedBy.
	*/
	public SimpleScreenField getLabelSubmittedByField(){
		return getField("labelSubmittedBy");
	}

	/**
	* return the labelSubmittedBy value.
	* @return the labelSubmittedBy value.
	*/
	public String getLabelSubmittedBy(){
		return getField("labelSubmittedBy").getValue(String.class);
	}

	/**
	* sets the value for labelSubmittedBy.
	* @param value the new labelSubmittedBy.
	*/
	public void setLabelSubmittedBy(String value){
		getField("labelSubmittedBy").setValue(value);
	}
	/**
	* return the usra1.
	* @return the usra1.
	*/
	public SimpleScreenField getUsra1Field(){
		return getField("usra1");
	}

	/**
	* return the usra1 value.
	* @return the usra1 value.
	*/
	public String getUsra1(){
		return getField("usra1").getValue(String.class);
	}

	/**
	* sets the value for usra1.
	* @param value the new usra1.
	*/
	public void setUsra1(String value){
		getField("usra1").setValue(value);
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
	* return the dtea1.
	* @return the dtea1.
	*/
	public SimpleScreenField getDtea1Field(){
		return getField("dtea1");
	}

	/**
	* return the dtea1 value.
	* @return the dtea1 value.
	*/
	public Integer getDtea1(){
		return getField("dtea1").getValue(Integer.class);
	}

	/**
	* sets the value for dtea1.
	* @param value the new dtea1.
	*/
	public void setDtea1(Integer value){
		getField("dtea1").setValue(value);
	}
	/**
	* return the tmea1.
	* @return the tmea1.
	*/
	public SimpleScreenField getTmea1Field(){
		return getField("tmea1");
	}

	/**
	* return the tmea1 value.
	* @return the tmea1 value.
	*/
	public Integer getTmea1(){
		return getField("tmea1").getValue(Integer.class);
	}

	/**
	* sets the value for tmea1.
	* @param value the new tmea1.
	*/
	public void setTmea1(Integer value){
		getField("tmea1").setValue(value);
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
	* return the pgma1.
	* @return the pgma1.
	*/
	public SimpleScreenField getPgma1Field(){
		return getField("pgma1");
	}

	/**
	* return the pgma1 value.
	* @return the pgma1 value.
	*/
	public String getPgma1(){
		return getField("pgma1").getValue(String.class);
	}

	/**
	* sets the value for pgma1.
	* @param value the new pgma1.
	*/
	public void setPgma1(String value){
		getField("pgma1").setValue(value);
	}
	/**
	* return the labelAuthorizedBy.
	* @return the labelAuthorizedBy.
	*/
	public SimpleScreenField getLabelAuthorizedByField(){
		return getField("labelAuthorizedBy");
	}

	/**
	* return the labelAuthorizedBy value.
	* @return the labelAuthorizedBy value.
	*/
	public String getLabelAuthorizedBy(){
		return getField("labelAuthorizedBy").getValue(String.class);
	}

	/**
	* sets the value for labelAuthorizedBy.
	* @param value the new labelAuthorizedBy.
	*/
	public void setLabelAuthorizedBy(String value){
		getField("labelAuthorizedBy").setValue(value);
	}
	/**
	* return the usra2.
	* @return the usra2.
	*/
	public SimpleScreenField getUsra2Field(){
		return getField("usra2");
	}

	/**
	* return the usra2 value.
	* @return the usra2 value.
	*/
	public String getUsra2(){
		return getField("usra2").getValue(String.class);
	}

	/**
	* sets the value for usra2.
	* @param value the new usra2.
	*/
	public void setUsra2(String value){
		getField("usra2").setValue(value);
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
	* return the dtea2.
	* @return the dtea2.
	*/
	public SimpleScreenField getDtea2Field(){
		return getField("dtea2");
	}

	/**
	* return the dtea2 value.
	* @return the dtea2 value.
	*/
	public Integer getDtea2(){
		return getField("dtea2").getValue(Integer.class);
	}

	/**
	* sets the value for dtea2.
	* @param value the new dtea2.
	*/
	public void setDtea2(Integer value){
		getField("dtea2").setValue(value);
	}
	/**
	* return the tmea2.
	* @return the tmea2.
	*/
	public SimpleScreenField getTmea2Field(){
		return getField("tmea2");
	}

	/**
	* return the tmea2 value.
	* @return the tmea2 value.
	*/
	public Integer getTmea2(){
		return getField("tmea2").getValue(Integer.class);
	}

	/**
	* sets the value for tmea2.
	* @param value the new tmea2.
	*/
	public void setTmea2(Integer value){
		getField("tmea2").setValue(value);
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
	* return the pgma2.
	* @return the pgma2.
	*/
	public SimpleScreenField getPgma2Field(){
		return getField("pgma2");
	}

	/**
	* return the pgma2 value.
	* @return the pgma2 value.
	*/
	public String getPgma2(){
		return getField("pgma2").getValue(String.class);
	}

	/**
	* sets the value for pgma2.
	* @param value the new pgma2.
	*/
	public void setPgma2(String value){
		getField("pgma2").setValue(value);
	}
	/**
	* return the labelReversedBy.
	* @return the labelReversedBy.
	*/
	public SimpleScreenField getLabelReversedByField(){
		return getField("labelReversedBy");
	}

	/**
	* return the labelReversedBy value.
	* @return the labelReversedBy value.
	*/
	public String getLabelReversedBy(){
		return getField("labelReversedBy").getValue(String.class);
	}

	/**
	* sets the value for labelReversedBy.
	* @param value the new labelReversedBy.
	*/
	public void setLabelReversedBy(String value){
		getField("labelReversedBy").setValue(value);
	}
	/**
	* return the usrb1.
	* @return the usrb1.
	*/
	public SimpleScreenField getUsrb1Field(){
		return getField("usrb1");
	}

	/**
	* return the usrb1 value.
	* @return the usrb1 value.
	*/
	public String getUsrb1(){
		return getField("usrb1").getValue(String.class);
	}

	/**
	* sets the value for usrb1.
	* @param value the new usrb1.
	*/
	public void setUsrb1(String value){
		getField("usrb1").setValue(value);
	}
	/**
	* return the labelOn2.
	* @return the labelOn2.
	*/
	public SimpleScreenField getLabelOn2Field(){
		return getField("labelOn2");
	}

	/**
	* return the labelOn2 value.
	* @return the labelOn2 value.
	*/
	public String getLabelOn2(){
		return getField("labelOn2").getValue(String.class);
	}

	/**
	* sets the value for labelOn2.
	* @param value the new labelOn2.
	*/
	public void setLabelOn2(String value){
		getField("labelOn2").setValue(value);
	}
	/**
	* return the dteb1.
	* @return the dteb1.
	*/
	public SimpleScreenField getDteb1Field(){
		return getField("dteb1");
	}

	/**
	* return the dteb1 value.
	* @return the dteb1 value.
	*/
	public Integer getDteb1(){
		return getField("dteb1").getValue(Integer.class);
	}

	/**
	* sets the value for dteb1.
	* @param value the new dteb1.
	*/
	public void setDteb1(Integer value){
		getField("dteb1").setValue(value);
	}
	/**
	* return the tmeb1.
	* @return the tmeb1.
	*/
	public SimpleScreenField getTmeb1Field(){
		return getField("tmeb1");
	}

	/**
	* return the tmeb1 value.
	* @return the tmeb1 value.
	*/
	public Integer getTmeb1(){
		return getField("tmeb1").getValue(Integer.class);
	}

	/**
	* sets the value for tmeb1.
	* @param value the new tmeb1.
	*/
	public void setTmeb1(Integer value){
		getField("tmeb1").setValue(value);
	}
	/**
	* return the labelProgram2.
	* @return the labelProgram2.
	*/
	public SimpleScreenField getLabelProgram2Field(){
		return getField("labelProgram2");
	}

	/**
	* return the labelProgram2 value.
	* @return the labelProgram2 value.
	*/
	public String getLabelProgram2(){
		return getField("labelProgram2").getValue(String.class);
	}

	/**
	* sets the value for labelProgram2.
	* @param value the new labelProgram2.
	*/
	public void setLabelProgram2(String value){
		getField("labelProgram2").setValue(value);
	}
	/**
	* return the pgmb1.
	* @return the pgmb1.
	*/
	public SimpleScreenField getPgmb1Field(){
		return getField("pgmb1");
	}

	/**
	* return the pgmb1 value.
	* @return the pgmb1 value.
	*/
	public String getPgmb1(){
		return getField("pgmb1").getValue(String.class);
	}

	/**
	* sets the value for pgmb1.
	* @param value the new pgmb1.
	*/
	public void setPgmb1(String value){
		getField("pgmb1").setValue(value);
	}
	/**
	* return the labelAuthorizedBy1.
	* @return the labelAuthorizedBy1.
	*/
	public SimpleScreenField getLabelAuthorizedBy1Field(){
		return getField("labelAuthorizedBy1");
	}

	/**
	* return the labelAuthorizedBy1 value.
	* @return the labelAuthorizedBy1 value.
	*/
	public String getLabelAuthorizedBy1(){
		return getField("labelAuthorizedBy1").getValue(String.class);
	}

	/**
	* sets the value for labelAuthorizedBy1.
	* @param value the new labelAuthorizedBy1.
	*/
	public void setLabelAuthorizedBy1(String value){
		getField("labelAuthorizedBy1").setValue(value);
	}
	/**
	* return the usrb2.
	* @return the usrb2.
	*/
	public SimpleScreenField getUsrb2Field(){
		return getField("usrb2");
	}

	/**
	* return the usrb2 value.
	* @return the usrb2 value.
	*/
	public String getUsrb2(){
		return getField("usrb2").getValue(String.class);
	}

	/**
	* sets the value for usrb2.
	* @param value the new usrb2.
	*/
	public void setUsrb2(String value){
		getField("usrb2").setValue(value);
	}
	/**
	* return the labelOn3.
	* @return the labelOn3.
	*/
	public SimpleScreenField getLabelOn3Field(){
		return getField("labelOn3");
	}

	/**
	* return the labelOn3 value.
	* @return the labelOn3 value.
	*/
	public String getLabelOn3(){
		return getField("labelOn3").getValue(String.class);
	}

	/**
	* sets the value for labelOn3.
	* @param value the new labelOn3.
	*/
	public void setLabelOn3(String value){
		getField("labelOn3").setValue(value);
	}
	/**
	* return the dteb2.
	* @return the dteb2.
	*/
	public SimpleScreenField getDteb2Field(){
		return getField("dteb2");
	}

	/**
	* return the dteb2 value.
	* @return the dteb2 value.
	*/
	public Integer getDteb2(){
		return getField("dteb2").getValue(Integer.class);
	}

	/**
	* sets the value for dteb2.
	* @param value the new dteb2.
	*/
	public void setDteb2(Integer value){
		getField("dteb2").setValue(value);
	}
	/**
	* return the tmeb2.
	* @return the tmeb2.
	*/
	public SimpleScreenField getTmeb2Field(){
		return getField("tmeb2");
	}

	/**
	* return the tmeb2 value.
	* @return the tmeb2 value.
	*/
	public Integer getTmeb2(){
		return getField("tmeb2").getValue(Integer.class);
	}

	/**
	* sets the value for tmeb2.
	* @param value the new tmeb2.
	*/
	public void setTmeb2(Integer value){
		getField("tmeb2").setValue(value);
	}
	/**
	* return the labelProgram3.
	* @return the labelProgram3.
	*/
	public SimpleScreenField getLabelProgram3Field(){
		return getField("labelProgram3");
	}

	/**
	* return the labelProgram3 value.
	* @return the labelProgram3 value.
	*/
	public String getLabelProgram3(){
		return getField("labelProgram3").getValue(String.class);
	}

	/**
	* sets the value for labelProgram3.
	* @param value the new labelProgram3.
	*/
	public void setLabelProgram3(String value){
		getField("labelProgram3").setValue(value);
	}
	/**
	* return the pgmb2.
	* @return the pgmb2.
	*/
	public SimpleScreenField getPgmb2Field(){
		return getField("pgmb2");
	}

	/**
	* return the pgmb2 value.
	* @return the pgmb2 value.
	*/
	public String getPgmb2(){
		return getField("pgmb2").getValue(String.class);
	}

	/**
	* sets the value for pgmb2.
	* @param value the new pgmb2.
	*/
	public void setPgmb2(String value){
		getField("pgmb2").setValue(value);
	}
}