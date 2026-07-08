package aws.bluage.carddemo.cdtrn02r.service;

import aws.bluage.carddemo.cdtrn02r.business.context.Cdtrn02rContext;
import aws.bluage.carddemo.cdtrn02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdtrn02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdtrn02r.business.model.Scrn1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dScrn1;
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
	
	public void applyCdtrn02dScrn1MiscIn(final Cdtrn02rContext ctx, final ExecutionController ctrl, Cdtrn02dScrn1 vo){
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
	
	public void updateScrn1FromCdtrn02dScrn1(final Cdtrn02rContext ctx, final ExecutionController ctrl, Cdtrn02dScrn1 vo, Scrn1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCsrrec() != null ) {
			dsEntity.setScsrrec(vo.getCsrrec());
		} else {
			dsEntity.setScsrrec("");
		}
		if(vo.getCsrfld() != null ) {
			dsEntity.setScsrfld(vo.getCsrfld());
		} else {
			dsEntity.setScsrfld("");
		}
		if(vo.getCsrpos() != null ) {
			dsEntity.setScsrpos(vo.getCsrpos());
		} else {
			dsEntity.setScsrpos(0);
		}
		if(vo.getPgmname() != null ) {
			dsEntity.setSpgmname(vo.getPgmname());
		} else {
			dsEntity.setSpgmname("");
		}
		if(vo.getFtrtext() != null ) {
			dsEntity.setSftrtext(vo.getFtrtext());
		} else {
			dsEntity.setSftrtext("");
		}
		if(vo.getTrnid() != null ) {
			dsEntity.setStrnid(vo.getTrnid());
		} else {
			dsEntity.setStrnid(0l);
		}
		if(vo.getStatus() != null ) {
			dsEntity.setSstatus(vo.getStatus());
		} else {
			dsEntity.setSstatus("");
		}
		if(vo.getStatusdtl() != null ) {
			dsEntity.setSstatusdtl(vo.getStatusdtl());
		} else {
			dsEntity.setSstatusdtl("");
		}
		if(vo.getCardnum() != null ) {
			dsEntity.setScardnum(vo.getCardnum());
		} else {
			dsEntity.setScardnum(0l);
		}
		if(vo.getTypecd() != null ) {
			dsEntity.setStypecd(vo.getTypecd());
		} else {
			dsEntity.setStypecd("");
		}
		if(vo.getCategcd() != null ) {
			dsEntity.setScategcd(vo.getCategcd());
		} else {
			dsEntity.setScategcd("");
		}
		if(vo.getSource() != null ) {
			dsEntity.setSsource(vo.getSource());
		} else {
			dsEntity.setSsource("");
		}
		if(vo.getDess() != null ) {
			dsEntity.setSdess(vo.getDess());
		} else {
			dsEntity.setSdess("");
		}
		if(vo.getAmountedt() != null ) {
			dsEntity.setSamountedt(vo.getAmountedt());
		} else {
			dsEntity.setSamountedt("");
		}
		if(vo.getAmountdsp() != null ) {
			dsEntity.setSamountdsp(vo.getAmountdsp());
		} else {
			dsEntity.setSamountdsp("");
		}
		if(vo.getMerchid() != null ) {
			dsEntity.setSmerchid(vo.getMerchid());
		} else {
			dsEntity.setSmerchid(0);
		}
		if(vo.getMerchname() != null ) {
			dsEntity.setSmerchname(vo.getMerchname());
		} else {
			dsEntity.setSmerchname("");
		}
		if(vo.getOrigdate() != null ) {
			dsEntity.setSorigdate(vo.getOrigdate());
		} else {
			dsEntity.setSorigdate("");
		}
		if(vo.getProcdate() != null ) {
			dsEntity.setSprocdate(vo.getProcdate());
		} else {
			dsEntity.setSprocdate("");
		}
		if(vo.getUsra1() != null ) {
			dsEntity.setSusra1(vo.getUsra1());
		} else {
			dsEntity.setSusra1("");
		}
		if(vo.getDtea1() != null ) {
			dsEntity.setSdtea1(vo.getDtea1());
		} else {
			dsEntity.setSdtea1(0);
		}
		if(vo.getTmea1() != null ) {
			dsEntity.setStmea1(vo.getTmea1());
		} else {
			dsEntity.setStmea1(0);
		}
		if(vo.getPgma1() != null ) {
			dsEntity.setSpgma1(vo.getPgma1());
		} else {
			dsEntity.setSpgma1("");
		}
		if(vo.getUsra2() != null ) {
			dsEntity.setSusra2(vo.getUsra2());
		} else {
			dsEntity.setSusra2("");
		}
		if(vo.getDtea2() != null ) {
			dsEntity.setSdtea2(vo.getDtea2());
		} else {
			dsEntity.setSdtea2(0);
		}
		if(vo.getTmea2() != null ) {
			dsEntity.setStmea2(vo.getTmea2());
		} else {
			dsEntity.setStmea2(0);
		}
		if(vo.getPgma2() != null ) {
			dsEntity.setSpgma2(vo.getPgma2());
		} else {
			dsEntity.setSpgma2("");
		}
		if(vo.getUsrb1() != null ) {
			dsEntity.setSusrb1(vo.getUsrb1());
		} else {
			dsEntity.setSusrb1("");
		}
		if(vo.getDteb1() != null ) {
			dsEntity.setSdteb1(vo.getDteb1());
		} else {
			dsEntity.setSdteb1(0);
		}
		if(vo.getTmeb1() != null ) {
			dsEntity.setStmeb1(vo.getTmeb1());
		} else {
			dsEntity.setStmeb1(0);
		}
		if(vo.getPgmb1() != null ) {
			dsEntity.setSpgmb1(vo.getPgmb1());
		} else {
			dsEntity.setSpgmb1("");
		}
		if(vo.getUsrb2() != null ) {
			dsEntity.setSusrb2(vo.getUsrb2());
		} else {
			dsEntity.setSusrb2("");
		}
		if(vo.getDteb2() != null ) {
			dsEntity.setSdteb2(vo.getDteb2());
		} else {
			dsEntity.setSdteb2(0);
		}
		if(vo.getTmeb2() != null ) {
			dsEntity.setStmeb2(vo.getTmeb2());
		} else {
			dsEntity.setStmeb2(0);
		}
		if(vo.getPgmb2() != null ) {
			dsEntity.setSpgmb2(vo.getPgmb2());
		} else {
			dsEntity.setSpgmb2("");
		}
		vo.setDate1(StringUtils.replaceChars(vo.getDate1Field().getValue(String.class), "/", ""));
	}
	
	public void updateCdtrn02dScrn1FromScrn1(final Cdtrn02rContext ctx, final ExecutionController ctrl, Scrn1 dsEntity, Cdtrn02dScrn1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getScsrrec() != null ) {
			vo.setCsrrec(dsEntity.getScsrrec());
		}

		if(dsEntity.getScsrfld() != null ) {
			vo.setCsrfld(dsEntity.getScsrfld());
		}

		try {
			vo.setCsrpos(dsEntity.getScsrpos());
		} catch (Exception e) {
			vo.getCsrposField().setValue(StringUtils.removeSign(dsEntity.getScsrposReference().getValue(String.class)));
		}
		vo.getCsrposField().setNumerical(true);

		if(dsEntity.getSpgmname() != null ) {
			vo.setPgmname(dsEntity.getSpgmname());
		}

		if(dsEntity.getSftrtext() != null ) {
			vo.setFtrtext(dsEntity.getSftrtext());
		}

		try {
			vo.setTrnid(dsEntity.getStrnid());
		} catch (Exception e) {
			vo.getTrnidField().setValue(StringUtils.removeSign(dsEntity.getStrnidReference().getValue(String.class)));
		}
		vo.getTrnidField().setNumerical(true);

		if(dsEntity.getSstatus() != null ) {
			vo.setStatus(dsEntity.getSstatus());
		}

		if(dsEntity.getSstatusdtl() != null ) {
			vo.setStatusdtl(dsEntity.getSstatusdtl());
		}

		try {
			vo.setCardnum(dsEntity.getScardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getScardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

		if(dsEntity.getStypecd() != null ) {
			vo.setTypecd(dsEntity.getStypecd());
		}

		if(dsEntity.getScategcd() != null ) {
			vo.setCategcd(dsEntity.getScategcd());
		}

		if(dsEntity.getSsource() != null ) {
			vo.setSource(dsEntity.getSsource());
		}

		if(dsEntity.getSdess() != null ) {
			vo.setDess(dsEntity.getSdess());
		}

		if(dsEntity.getSamountedt() != null ) {
			vo.setAmountedt(dsEntity.getSamountedt());
		}

		if(dsEntity.getSamountdsp() != null ) {
			vo.setAmountdsp(dsEntity.getSamountdsp());
		}

		try {
			vo.setMerchid(dsEntity.getSmerchid());
		} catch (Exception e) {
			vo.getMerchidField().setValue(StringUtils.removeSign(dsEntity.getSmerchidReference().getValue(String.class)));
		}
		vo.getMerchidField().setNumerical(true);

		if(dsEntity.getSmerchname() != null ) {
			vo.setMerchname(dsEntity.getSmerchname());
		}

		if(dsEntity.getSorigdate() != null ) {
			vo.setOrigdate(dsEntity.getSorigdate());
		}

		if(dsEntity.getSprocdate() != null ) {
			vo.setProcdate(dsEntity.getSprocdate());
		}

		if(dsEntity.getSusra1() != null ) {
			vo.setUsra1(dsEntity.getSusra1());
		}

		try {
			vo.setDtea1(dsEntity.getSdtea1());
		} catch (Exception e) {
			vo.getDtea1Field().setValue(StringUtils.removeSign(dsEntity.getSdtea1Reference().getValue(String.class)));
		}
		vo.getDtea1Field().setNumerical(true);

		try {
			vo.setTmea1(dsEntity.getStmea1());
		} catch (Exception e) {
			vo.getTmea1Field().setValue(StringUtils.removeSign(dsEntity.getStmea1Reference().getValue(String.class)));
		}
		vo.getTmea1Field().setNumerical(true);

		if(dsEntity.getSpgma1() != null ) {
			vo.setPgma1(dsEntity.getSpgma1());
		}

		if(dsEntity.getSusra2() != null ) {
			vo.setUsra2(dsEntity.getSusra2());
		}

		try {
			vo.setDtea2(dsEntity.getSdtea2());
		} catch (Exception e) {
			vo.getDtea2Field().setValue(StringUtils.removeSign(dsEntity.getSdtea2Reference().getValue(String.class)));
		}
		vo.getDtea2Field().setNumerical(true);

		try {
			vo.setTmea2(dsEntity.getStmea2());
		} catch (Exception e) {
			vo.getTmea2Field().setValue(StringUtils.removeSign(dsEntity.getStmea2Reference().getValue(String.class)));
		}
		vo.getTmea2Field().setNumerical(true);

		if(dsEntity.getSpgma2() != null ) {
			vo.setPgma2(dsEntity.getSpgma2());
		}

		if(dsEntity.getSusrb1() != null ) {
			vo.setUsrb1(dsEntity.getSusrb1());
		}

		try {
			vo.setDteb1(dsEntity.getSdteb1());
		} catch (Exception e) {
			vo.getDteb1Field().setValue(StringUtils.removeSign(dsEntity.getSdteb1Reference().getValue(String.class)));
		}
		vo.getDteb1Field().setNumerical(true);

		try {
			vo.setTmeb1(dsEntity.getStmeb1());
		} catch (Exception e) {
			vo.getTmeb1Field().setValue(StringUtils.removeSign(dsEntity.getStmeb1Reference().getValue(String.class)));
		}
		vo.getTmeb1Field().setNumerical(true);

		if(dsEntity.getSpgmb1() != null ) {
			vo.setPgmb1(dsEntity.getSpgmb1());
		}

		if(dsEntity.getSusrb2() != null ) {
			vo.setUsrb2(dsEntity.getSusrb2());
		}

		try {
			vo.setDteb2(dsEntity.getSdteb2());
		} catch (Exception e) {
			vo.getDteb2Field().setValue(StringUtils.removeSign(dsEntity.getSdteb2Reference().getValue(String.class)));
		}
		vo.getDteb2Field().setNumerical(true);

		try {
			vo.setTmeb2(dsEntity.getStmeb2());
		} catch (Exception e) {
			vo.getTmeb2Field().setValue(StringUtils.removeSign(dsEntity.getStmeb2Reference().getValue(String.class)));
		}
		vo.getTmeb2Field().setNumerical(true);

		if(dsEntity.getSpgmb2() != null ) {
			vo.setPgmb2(dsEntity.getSpgmb2());
		}

	}
	
	public void applyCdtrn02dScrn1MiscOut(final Cdtrn02rContext ctx, final ExecutionController ctrl, Cdtrn02dScrn1 vo){
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
	
	public void updateCdtrn02dMsgsflFromMsgsfl(final Cdtrn02rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdtrn02dMsgsfl vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getSsflmsgkey() != null ) {
			vo.setSflmsgkey(dsEntity.getSsflmsgkey());
		}

		if(dsEntity.getSpgmq() != null ) {
			vo.setPgmq(dsEntity.getSpgmq());
		}

	}
	
	public void applyCdtrn02dMsgsflMiscOut(final Cdtrn02rContext ctx, final ExecutionController ctrl, Cdtrn02dMsgsfl vo){
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
	
	public void updateCdtrn02dMsgsflcFromMsgsflc(final Cdtrn02rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdtrn02dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getSpgmq() != null ) {
			vo.setPgmq(dsEntity.getSpgmq());
		}

	}
	
	public void applyCdtrn02dMsgsflcMiscOut(final Cdtrn02rContext ctx, final ExecutionController ctrl, Cdtrn02dMsgsflc vo){
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
