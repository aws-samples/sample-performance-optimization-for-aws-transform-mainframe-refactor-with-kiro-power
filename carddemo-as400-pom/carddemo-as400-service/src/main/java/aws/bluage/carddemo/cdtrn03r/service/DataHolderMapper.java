package aws.bluage.carddemo.cdtrn03r.service;

import aws.bluage.carddemo.cdtrn03r.business.context.Cdtrn03rContext;
import aws.bluage.carddemo.cdtrn03r.business.model.Msgsfl;
import aws.bluage.carddemo.cdtrn03r.business.model.Msgsflc;
import aws.bluage.carddemo.cdtrn03r.business.model.Scrn1;
import aws.bluage.carddemo.cdtrn03r.business.model.Zconfirm;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dScrn1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dZconfirm;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.provider.MessageRegistry;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
import com.netfective.bluage.gapwalk.runtime.screen.ColorMode;
import com.netfective.bluage.gapwalk.runtime.screen.HilightMode;
import com.netfective.bluage.gapwalk.runtime.screen.IntensityMode;
import com.netfective.bluage.gapwalk.runtime.screen.PageDownMode;
import com.netfective.bluage.gapwalk.runtime.screen.ProtectionMode;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import org.springframework.stereotype.Component;

@Component
public class DataHolderMapper {
	
	public void applyCdtrn02dScrn1MiscIn(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dScrn1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "2": {
				ctx.getFkeyIndicatorsGroup().setInKB("1");
				ctx.getIndicatorsGroup().setIn02("1");
				break;
			}
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "4": {
				ctx.getFkeyIndicatorsGroup().setInKD("1");
				ctx.getIndicatorsGroup().setIn04("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
		}
		vo.setCsrrec(vo.getCursorRecordName());
		vo.setCsrfld(vo.getCursorFieldName());
		vo.setCsrpos(vo.getCursorPosition());
	}
	
	public void updateScrn1FromCdtrn02dScrn1(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dScrn1 vo, Scrn1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCsrrec() != null ) {
			dsEntity.setDcsrrec(vo.getCsrrec());
		} else {
			dsEntity.setDcsrrec("");
		}
		if(vo.getCsrfld() != null ) {
			dsEntity.setDcsrfld(vo.getCsrfld());
		} else {
			dsEntity.setDcsrfld("");
		}
		if(vo.getCsrpos() != null ) {
			dsEntity.setDcsrpos(vo.getCsrpos());
		} else {
			dsEntity.setDcsrpos(0);
		}
		if(vo.getPgmname() != null ) {
			dsEntity.setDpgmname(vo.getPgmname());
		} else {
			dsEntity.setDpgmname("");
		}
		if(vo.getFtrtext() != null ) {
			dsEntity.setDftrtext(vo.getFtrtext());
		} else {
			dsEntity.setDftrtext("");
		}
		if(vo.getTrnid() != null ) {
			dsEntity.setDtrnid(vo.getTrnid());
		} else {
			dsEntity.setDtrnid(0l);
		}
		if(vo.getStatus() != null ) {
			dsEntity.setDstatus(vo.getStatus());
		} else {
			dsEntity.setDstatus("");
		}
		if(vo.getStatusdtl() != null ) {
			dsEntity.setDstatusdtl(vo.getStatusdtl());
		} else {
			dsEntity.setDstatusdtl("");
		}
		if(vo.getCardnum() != null ) {
			dsEntity.setDcardnum(vo.getCardnum());
		} else {
			dsEntity.setDcardnum(0l);
		}
		if(vo.getTypecd() != null ) {
			dsEntity.setDtypecd(vo.getTypecd());
		} else {
			dsEntity.setDtypecd("");
		}
		if(vo.getCategcd() != null ) {
			dsEntity.setDcategcd(vo.getCategcd());
		} else {
			dsEntity.setDcategcd("");
		}
		if(vo.getSource() != null ) {
			dsEntity.setDsource(vo.getSource());
		} else {
			dsEntity.setDsource("");
		}
		if(vo.getDess() != null ) {
			dsEntity.setDdess(vo.getDess());
		} else {
			dsEntity.setDdess("");
		}
		if(vo.getAmountedt() != null ) {
			dsEntity.setDamountedt(vo.getAmountedt());
		} else {
			dsEntity.setDamountedt("");
		}
		if(vo.getAmountdsp() != null ) {
			dsEntity.setDamountdsp(vo.getAmountdsp());
		} else {
			dsEntity.setDamountdsp("");
		}
		if(vo.getMerchid() != null ) {
			dsEntity.setDmerchid(vo.getMerchid());
		} else {
			dsEntity.setDmerchid(0);
		}
		if(vo.getMerchname() != null ) {
			dsEntity.setDmerchname(vo.getMerchname());
		} else {
			dsEntity.setDmerchname("");
		}
		if(vo.getOrigdate() != null ) {
			dsEntity.setDorigdate(vo.getOrigdate());
		} else {
			dsEntity.setDorigdate("");
		}
		if(vo.getProcdate() != null ) {
			dsEntity.setDprocdate(vo.getProcdate());
		} else {
			dsEntity.setDprocdate("");
		}
		if(vo.getUsra1() != null ) {
			dsEntity.setDusra1(vo.getUsra1());
		} else {
			dsEntity.setDusra1("");
		}
		if(vo.getDtea1() != null ) {
			dsEntity.setDdtea1(vo.getDtea1());
		} else {
			dsEntity.setDdtea1(0);
		}
		if(vo.getTmea1() != null ) {
			dsEntity.setDtmea1(vo.getTmea1());
		} else {
			dsEntity.setDtmea1(0);
		}
		if(vo.getPgma1() != null ) {
			dsEntity.setDpgma1(vo.getPgma1());
		} else {
			dsEntity.setDpgma1("");
		}
		if(vo.getUsra2() != null ) {
			dsEntity.setDusra2(vo.getUsra2());
		} else {
			dsEntity.setDusra2("");
		}
		if(vo.getDtea2() != null ) {
			dsEntity.setDdtea2(vo.getDtea2());
		} else {
			dsEntity.setDdtea2(0);
		}
		if(vo.getTmea2() != null ) {
			dsEntity.setDtmea2(vo.getTmea2());
		} else {
			dsEntity.setDtmea2(0);
		}
		if(vo.getPgma2() != null ) {
			dsEntity.setDpgma2(vo.getPgma2());
		} else {
			dsEntity.setDpgma2("");
		}
		if(vo.getUsrb1() != null ) {
			dsEntity.setDusrb1(vo.getUsrb1());
		} else {
			dsEntity.setDusrb1("");
		}
		if(vo.getDteb1() != null ) {
			dsEntity.setDdteb1(vo.getDteb1());
		} else {
			dsEntity.setDdteb1(0);
		}
		if(vo.getTmeb1() != null ) {
			dsEntity.setDtmeb1(vo.getTmeb1());
		} else {
			dsEntity.setDtmeb1(0);
		}
		if(vo.getPgmb1() != null ) {
			dsEntity.setDpgmb1(vo.getPgmb1());
		} else {
			dsEntity.setDpgmb1("");
		}
		if(vo.getUsrb2() != null ) {
			dsEntity.setDusrb2(vo.getUsrb2());
		} else {
			dsEntity.setDusrb2("");
		}
		if(vo.getDteb2() != null ) {
			dsEntity.setDdteb2(vo.getDteb2());
		} else {
			dsEntity.setDdteb2(0);
		}
		if(vo.getTmeb2() != null ) {
			dsEntity.setDtmeb2(vo.getTmeb2());
		} else {
			dsEntity.setDtmeb2(0);
		}
		if(vo.getPgmb2() != null ) {
			dsEntity.setDpgmb2(vo.getPgmb2());
		} else {
			dsEntity.setDpgmb2("");
		}
		vo.setDate1(StringUtils.replaceChars(vo.getDate1Field().getValue(String.class), "/", ""));
	}
	
	public void updateCdtrn02dScrn1FromScrn1(final Cdtrn03rContext ctx, final ExecutionController ctrl, Scrn1 dsEntity, Cdtrn02dScrn1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDcsrrec() != null ) {
			vo.setCsrrec(dsEntity.getDcsrrec());
		}

		if(dsEntity.getDcsrfld() != null ) {
			vo.setCsrfld(dsEntity.getDcsrfld());
		}

		try {
			vo.setCsrpos(dsEntity.getDcsrpos());
		} catch (Exception e) {
			vo.getCsrposField().setValue(StringUtils.removeSign(dsEntity.getDcsrposReference().getValue(String.class)));
		}
		vo.getCsrposField().setNumerical(true);

		if(dsEntity.getDpgmname() != null ) {
			vo.setPgmname(dsEntity.getDpgmname());
		}

		if(dsEntity.getDftrtext() != null ) {
			vo.setFtrtext(dsEntity.getDftrtext());
		}

		try {
			vo.setTrnid(dsEntity.getDtrnid());
		} catch (Exception e) {
			vo.getTrnidField().setValue(StringUtils.removeSign(dsEntity.getDtrnidReference().getValue(String.class)));
		}
		vo.getTrnidField().setNumerical(true);

		if(dsEntity.getDstatus() != null ) {
			vo.setStatus(dsEntity.getDstatus());
		}

		if(dsEntity.getDstatusdtl() != null ) {
			vo.setStatusdtl(dsEntity.getDstatusdtl());
		}

		try {
			vo.setCardnum(dsEntity.getDcardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getDcardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

		if(dsEntity.getDtypecd() != null ) {
			vo.setTypecd(dsEntity.getDtypecd());
		}

		if(dsEntity.getDcategcd() != null ) {
			vo.setCategcd(dsEntity.getDcategcd());
		}

		if(dsEntity.getDsource() != null ) {
			vo.setSource(dsEntity.getDsource());
		}

		if(dsEntity.getDdess() != null ) {
			vo.setDess(dsEntity.getDdess());
		}

		if(dsEntity.getDamountedt() != null ) {
			vo.setAmountedt(dsEntity.getDamountedt());
		}

		if(dsEntity.getDamountdsp() != null ) {
			vo.setAmountdsp(dsEntity.getDamountdsp());
		}

		try {
			vo.setMerchid(dsEntity.getDmerchid());
		} catch (Exception e) {
			vo.getMerchidField().setValue(StringUtils.removeSign(dsEntity.getDmerchidReference().getValue(String.class)));
		}
		vo.getMerchidField().setNumerical(true);

		if(dsEntity.getDmerchname() != null ) {
			vo.setMerchname(dsEntity.getDmerchname());
		}

		if(dsEntity.getDorigdate() != null ) {
			vo.setOrigdate(dsEntity.getDorigdate());
		}

		if(dsEntity.getDprocdate() != null ) {
			vo.setProcdate(dsEntity.getDprocdate());
		}

		if(dsEntity.getDusra1() != null ) {
			vo.setUsra1(dsEntity.getDusra1());
		}

		try {
			vo.setDtea1(dsEntity.getDdtea1());
		} catch (Exception e) {
			vo.getDtea1Field().setValue(StringUtils.removeSign(dsEntity.getDdtea1Reference().getValue(String.class)));
		}
		vo.getDtea1Field().setNumerical(true);

		try {
			vo.setTmea1(dsEntity.getDtmea1());
		} catch (Exception e) {
			vo.getTmea1Field().setValue(StringUtils.removeSign(dsEntity.getDtmea1Reference().getValue(String.class)));
		}
		vo.getTmea1Field().setNumerical(true);

		if(dsEntity.getDpgma1() != null ) {
			vo.setPgma1(dsEntity.getDpgma1());
		}

		if(dsEntity.getDusra2() != null ) {
			vo.setUsra2(dsEntity.getDusra2());
		}

		try {
			vo.setDtea2(dsEntity.getDdtea2());
		} catch (Exception e) {
			vo.getDtea2Field().setValue(StringUtils.removeSign(dsEntity.getDdtea2Reference().getValue(String.class)));
		}
		vo.getDtea2Field().setNumerical(true);

		try {
			vo.setTmea2(dsEntity.getDtmea2());
		} catch (Exception e) {
			vo.getTmea2Field().setValue(StringUtils.removeSign(dsEntity.getDtmea2Reference().getValue(String.class)));
		}
		vo.getTmea2Field().setNumerical(true);

		if(dsEntity.getDpgma2() != null ) {
			vo.setPgma2(dsEntity.getDpgma2());
		}

		if(dsEntity.getDusrb1() != null ) {
			vo.setUsrb1(dsEntity.getDusrb1());
		}

		try {
			vo.setDteb1(dsEntity.getDdteb1());
		} catch (Exception e) {
			vo.getDteb1Field().setValue(StringUtils.removeSign(dsEntity.getDdteb1Reference().getValue(String.class)));
		}
		vo.getDteb1Field().setNumerical(true);

		try {
			vo.setTmeb1(dsEntity.getDtmeb1());
		} catch (Exception e) {
			vo.getTmeb1Field().setValue(StringUtils.removeSign(dsEntity.getDtmeb1Reference().getValue(String.class)));
		}
		vo.getTmeb1Field().setNumerical(true);

		if(dsEntity.getDpgmb1() != null ) {
			vo.setPgmb1(dsEntity.getDpgmb1());
		}

		if(dsEntity.getDusrb2() != null ) {
			vo.setUsrb2(dsEntity.getDusrb2());
		}

		try {
			vo.setDteb2(dsEntity.getDdteb2());
		} catch (Exception e) {
			vo.getDteb2Field().setValue(StringUtils.removeSign(dsEntity.getDdteb2Reference().getValue(String.class)));
		}
		vo.getDteb2Field().setNumerical(true);

		try {
			vo.setTmeb2(dsEntity.getDtmeb2());
		} catch (Exception e) {
			vo.getTmeb2Field().setValue(StringUtils.removeSign(dsEntity.getDtmeb2Reference().getValue(String.class)));
		}
		vo.getTmeb2Field().setNumerical(true);

		if(dsEntity.getDpgmb2() != null ) {
			vo.setPgmb2(dsEntity.getDpgmb2());
		}

	}
	
	public void applyCdtrn02dScrn1MiscOut(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dScrn1 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("02");
		}
		else {
			vo.deactivateAKeys("02");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("03");
		}
		else {
			vo.deactivateAKeys("03");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("04");
		}
		else {
			vo.deactivateFKeys("04");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("12");
		}
		else {
			vo.deactivateFKeys("12");
		}
		vo.getCsrrecField().setIntensity(IntensityMode.DRK);
		vo.getCsrrecField().setProtection(ProtectionMode.PROT);
		vo.getCsrfldField().setIntensity(IntensityMode.DRK);
		vo.getCsrfldField().setProtection(ProtectionMode.PROT);
		vo.getCsrposField().setIntensity(IntensityMode.DRK);
		vo.getCsrposField().setProtection(ProtectionMode.PROT);
		vo.setLabelViewTransactions("View Transactions");
		vo.getLabelViewTransactionsField().setProtection(ProtectionMode.PROT);
		vo.getLabelViewTransactionsField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelViewTransactionsField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelSubmitTransaction("Submit Transaction");
		vo.getLabelSubmitTransactionField().setProtection(ProtectionMode.PROT);
		vo.getLabelSubmitTransactionField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0)) {
			vo.getLabelSubmitTransactionField().setIntensity(IntensityMode.DRK);
		}
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.getLabelUserField().setColor(ColorMode.BLUE);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getFtrtextField().setProtection(ProtectionMode.PROT);
		vo.getFtrtextField().setColor(ColorMode.BLUE);
		vo.getTrnidField().setProtection(ProtectionMode.UNPROT);
		vo.getTrnidField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getTrnidField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getTrnidField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getTrnidField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getTrnidField().setHilight(HilightMode.REVERSE);
		}
		vo.getTrnidField().setForceModified(true);
		vo.setLabelStatus("Status :");
		vo.getLabelStatusField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelStatusField().setIntensity(IntensityMode.DRK);
		}
		vo.getStatusField().setProtection(ProtectionMode.PROT);
		vo.getStatusField().setColor(ColorMode.TURQUOISE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getStatusField().setIntensity(IntensityMode.DRK);
		}
		vo.getStatusdtlField().setProtection(ProtectionMode.PROT);
		vo.getStatusdtlField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getStatusdtlField().setIntensity(IntensityMode.DRK);
		}
		vo.getCardnumField().setProtection(ProtectionMode.UNPROT);
		vo.getCardnumField().setColor(ColorMode.PINK);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getCardnumField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getCardnumField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn82Reference(), "1") == 0) {
			vo.getCardnumField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn82Reference(), "1") == 0) {
			vo.getCardnumField().setHilight(HilightMode.REVERSE);
		}
		vo.getTypecdField().setProtection(ProtectionMode.UNPROT);
		vo.getTypecdField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getTypecdField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getTypecdField().setUnderline(true);
		}
		vo.getTypecdField().setForceModified(true);
		vo.getTypecdField().loadCheckMessage("ERR0035","*LIBL/CDMSGF01");
		vo.getCategcdField().setProtection(ProtectionMode.UNPROT);
		vo.getCategcdField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getCategcdField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getCategcdField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn84Reference(), "1") == 0) {
			vo.getCategcdField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn84Reference(), "1") == 0) {
			vo.getCategcdField().setHilight(HilightMode.REVERSE);
		}
		vo.getSourceField().setProtection(ProtectionMode.UNPROT);
		vo.getSourceField().setColor(ColorMode.WHITE);
		vo.getSourceField().setForceModified(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getSourceField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getSourceField().setUnderline(true);
		}
		vo.getSourceField().loadCheckMessage("ERR0037","*LIBL/CDMSGF01");
		vo.getDessField().setProtection(ProtectionMode.UNPROT);
		vo.getDessField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getDessField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getDessField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn85Reference(), "1") == 0) {
			vo.getDessField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn85Reference(), "1") == 0) {
			vo.getDessField().setHilight(HilightMode.REVERSE);
		}
		vo.getAmountedtField().setProtection(ProtectionMode.UNPROT);
		vo.getAmountedtField().setColor(ColorMode.WHITE);
		vo.getAmountedtField().setUnderline(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getAmountedtField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getAmountedtField().setHilight(HilightMode.REVERSE);
		}

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0)) {
			vo.getAmountedtField().setIntensity(IntensityMode.DRK);
		}
		vo.getAmountdspField().setProtection(ProtectionMode.PROT);
		vo.getAmountdspField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getAmountdspField().setIntensity(IntensityMode.DRK);
		}
		vo.getMerchidField().setProtection(ProtectionMode.UNPROT);
		vo.getMerchidField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getMerchidField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getMerchidField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn86Reference(), "1") == 0) {
			vo.getMerchidField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn86Reference(), "1") == 0) {
			vo.getMerchidField().setHilight(HilightMode.REVERSE);
		}
		vo.getMerchnameField().setProtection(ProtectionMode.PROT);
		vo.getMerchnameField().setColor(ColorMode.WHITE);
		vo.getOrigdateField().setProtection(ProtectionMode.UNPROT);
		vo.getOrigdateField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getOrigdateField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getOrigdateField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn87Reference(), "1") == 0) {
			vo.getOrigdateField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn87Reference(), "1") == 0) {
			vo.getOrigdateField().setHilight(HilightMode.REVERSE);
		}
		vo.getProcdateField().setProtection(ProtectionMode.UNPROT);
		vo.getProcdateField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getProcdateField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getProcdateField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn88Reference(), "1") == 0) {
			vo.getProcdateField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn88Reference(), "1") == 0) {
			vo.getProcdateField().setHilight(HilightMode.REVERSE);
		}
		vo.setLabelSubmittedBy("Submitted By :");
		vo.getLabelSubmittedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelSubmittedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getUsra1Field().setProtection(ProtectionMode.PROT);
		vo.getUsra1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getUsra1Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn("On:");
		vo.getLabelOnField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelOnField().setIntensity(IntensityMode.DRK);
		}
		vo.getDtea1Field().setProtection(ProtectionMode.PROT);
		vo.getDtea1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getDtea1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getTmea1Field().setProtection(ProtectionMode.PROT);
		vo.getTmea1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getTmea1Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram("Program:");
		vo.getLabelProgramField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelProgramField().setIntensity(IntensityMode.DRK);
		}
		vo.getPgma1Field().setProtection(ProtectionMode.PROT);
		vo.getPgma1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getPgma1Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelAuthorizedBy("Authorized By:");
		vo.getLabelAuthorizedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelAuthorizedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getUsra2Field().setProtection(ProtectionMode.PROT);
		vo.getUsra2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getUsra2Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn1("On:");
		vo.getLabelOn1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelOn1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getDtea2Field().setProtection(ProtectionMode.PROT);
		vo.getDtea2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getDtea2Field().setIntensity(IntensityMode.DRK);
		}
		vo.getTmea2Field().setProtection(ProtectionMode.PROT);
		vo.getTmea2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getTmea2Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram1("Program:");
		vo.getLabelProgram1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getLabelProgram1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getPgma2Field().setProtection(ProtectionMode.PROT);
		vo.getPgma2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0)) {
			vo.getPgma2Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelReversedBy("Reversed By  :");
		vo.getLabelReversedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getLabelReversedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getUsrb1Field().setProtection(ProtectionMode.PROT);
		vo.getUsrb1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getUsrb1Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn2("On:");
		vo.getLabelOn2Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getLabelOn2Field().setIntensity(IntensityMode.DRK);
		}
		vo.getDteb1Field().setProtection(ProtectionMode.PROT);
		vo.getDteb1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getDteb1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getTmeb1Field().setProtection(ProtectionMode.PROT);
		vo.getTmeb1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getTmeb1Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram2("Program:");
		vo.getLabelProgram2Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getLabelProgram2Field().setIntensity(IntensityMode.DRK);
		}
		vo.getPgmb1Field().setProtection(ProtectionMode.PROT);
		vo.getPgmb1Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getPgmb1Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelAuthorizedBy1("Authorized By:");
		vo.getLabelAuthorizedBy1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getLabelAuthorizedBy1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getUsrb2Field().setProtection(ProtectionMode.PROT);
		vo.getUsrb2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getUsrb2Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn3("On:");
		vo.getLabelOn3Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getLabelOn3Field().setIntensity(IntensityMode.DRK);
		}
		vo.getDteb2Field().setProtection(ProtectionMode.PROT);
		vo.getDteb2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getDteb2Field().setIntensity(IntensityMode.DRK);
		}
		vo.getTmeb2Field().setProtection(ProtectionMode.PROT);
		vo.getTmeb2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getTmeb2Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram3("Program:");
		vo.getLabelProgram3Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getLabelProgram3Field().setIntensity(IntensityMode.DRK);
		}
		vo.getPgmb2Field().setProtection(ProtectionMode.PROT);
		vo.getPgmb2Field().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0)) {
			vo.getPgmb2Field().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void applyCdtrn02dZconfirmMiscIn(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dZconfirm vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "2": {
				ctx.getFkeyIndicatorsGroup().setInKB("1");
				ctx.getIndicatorsGroup().setIn02("1");
				break;
			}
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "4": {
				ctx.getFkeyIndicatorsGroup().setInKD("1");
				ctx.getIndicatorsGroup().setIn04("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
		}
	}
	
	public void updateZconfirmFromCdtrn02dZconfirm(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dZconfirm vo, Zconfirm dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getYesno() != null ) {
			dsEntity.setDyesno(vo.getYesno());
		} else {
			dsEntity.setDyesno("");
		}
	}
	
	public void updateCdtrn02dZconfirmFromZconfirm(final Cdtrn03rContext ctx, final ExecutionController ctrl, Zconfirm dsEntity, Cdtrn02dZconfirm vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDyesno() != null ) {
			vo.setYesno(dsEntity.getDyesno());
		}

	}
	
	public void applyCdtrn02dZconfirmMiscOut(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dZconfirm vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
		vo.setPositionTop(16);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(19);
		vo.setHeight(4);
		vo.setWidth(35);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.BLUE);
		vo.setBorderHilight(HilightMode.REVERSE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("02");
		}
		else {
			vo.deactivateAKeys("02");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("03");
		}
		else {
			vo.deactivateAKeys("03");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("04");
		}
		else {
			vo.deactivateFKeys("04");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("12");
		}
		else {
			vo.deactivateFKeys("12");
		}
		vo.getYesnoField().setProtection(ProtectionMode.UNPROT);
		vo.getYesnoField().setColor(ColorMode.WHITE);
		vo.getYesnoField().setHilight(HilightMode.BLINK);
		vo.getYesnoField().setUnderline(true);
		vo.getYesnoField().loadCheckMessage("ERR0048","CDMSGF01");
	}
	
	public void updateCdtrn02dMsgsflFromMsgsfl(final Cdtrn03rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdtrn02dMsgsfl vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDsflmsgkey() != null ) {
			vo.setSflmsgkey(dsEntity.getDsflmsgkey());
		}

		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdtrn02dMsgsflMiscOut(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("02");
		}
		else {
			vo.deactivateAKeys("02");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("03");
		}
		else {
			vo.deactivateAKeys("03");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("04");
		}
		else {
			vo.deactivateFKeys("04");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("12");
		}
		else {
			vo.deactivateFKeys("12");
		}
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdtrn02dMsgsflcFromMsgsflc(final Cdtrn03rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdtrn02dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdtrn02dMsgsflcMiscOut(final Cdtrn03rContext ctx, final ExecutionController ctrl, Cdtrn02dMsgsflc vo){
		vo.setDspMode("*DS3");
		vo.getMsgsflField().setDspMode("*DS3");
		vo.getMsgsflField().setMessageSubfile();
		vo.setOverlay(true);
		vo.getMsgsflField().setSize(8);
		vo.getMsgsflField().setNumberOfRecordsPerPage(1);
		vo.getMsgsflField().display(true);
		vo.getMsgsflField().displayControl(true);
		vo.getMsgsflField().initializeRecord(true);
		vo.getMsgsflField().setPageDown(PageDownMode.PLUS);
		vo.getMsgsflField().setEnd(false);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn97Reference(), "1") != 0) {
			vo.getMsgsflField().setEnd(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("02");
		}
		else {
			vo.deactivateAKeys("02");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateAKeys("03");
		}
		else {
			vo.deactivateAKeys("03");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("04");
		}
		else {
			vo.deactivateFKeys("04");
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("12");
		}
		else {
			vo.deactivateFKeys("12");
		}
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	

}
