package aws.bluage.carddemo.cdccm02r.service;

import aws.bluage.carddemo.cdccm02r.business.context.Cdccm02rContext;
import aws.bluage.carddemo.cdccm02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdccm02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdccm02r.business.model.Scrn1;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dConfirm;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dScrn1;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
import com.netfective.bluage.gapwalk.runtime.screen.ColorMode;
import com.netfective.bluage.gapwalk.runtime.screen.HilightMode;
import com.netfective.bluage.gapwalk.runtime.screen.IntensityMode;
import com.netfective.bluage.gapwalk.runtime.screen.ProtectionMode;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import org.springframework.stereotype.Component;

@Component
public class DataHolderMapper {
	
	public void applyCdccm02dScrn1MiscIn(final Cdccm02rContext ctx, final ExecutionController ctrl, Cdccm02dScrn1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn09("0");
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
			case "9": {
				ctx.getFkeyIndicatorsGroup().setInKI("1");
				ctx.getIndicatorsGroup().setIn09("1");
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
	
	public void updateScrn1FromCdccm02dScrn1(final Cdccm02rContext ctx, final ExecutionController ctrl, Cdccm02dScrn1 vo, Scrn1 dsEntity){
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
		if(vo.getCardnum() != null ) {
			dsEntity.setDcardnum(vo.getCardnum());
		} else {
			dsEntity.setDcardnum(0l);
		}
		if(vo.getCustid() != null ) {
			dsEntity.setDcustid(vo.getCustid());
		} else {
			dsEntity.setDcustid("");
		}
		if(vo.getAcctnum() != null ) {
			dsEntity.setDacctnum(vo.getAcctnum());
		} else {
			dsEntity.setDacctnum("");
		}
		if(vo.getName() != null ) {
			dsEntity.setDname(vo.getName());
		} else {
			dsEntity.setDname("");
		}
		if(vo.getPrimarysec() != null ) {
			dsEntity.setDprimarysec(vo.getPrimarysec());
		} else {
			dsEntity.setDprimarysec("");
		}
		if(vo.getStatus() != null ) {
			dsEntity.setDstatus(vo.getStatus());
		} else {
			dsEntity.setDstatus("");
		}
		if(vo.getStatusdess() != null ) {
			dsEntity.setDstatusdess(vo.getStatusdess());
		} else {
			dsEntity.setDstatusdess("");
		}
		if(vo.getExpirymo() != null ) {
			dsEntity.setDexpirymo(vo.getExpirymo());
		} else {
			dsEntity.setDexpirymo("");
		}
		if(vo.getExpiryyr() != null ) {
			dsEntity.setDexpiryyr(vo.getExpiryyr());
		} else {
			dsEntity.setDexpiryyr("");
		}
		if(vo.getCvv() != null ) {
			dsEntity.setDcvv(vo.getCvv());
		} else {
			dsEntity.setDcvv("");
		}
		if(vo.getCcmcrtusr() != null ) {
			dsEntity.setDccmcrtusr(vo.getCcmcrtusr());
		} else {
			dsEntity.setDccmcrtusr("");
		}
		if(vo.getCcmcrtdt() != null ) {
			dsEntity.setDccmcrtdt(vo.getCcmcrtdt());
		} else {
			dsEntity.setDccmcrtdt(0);
		}
		if(vo.getCcmcrttm() != null ) {
			dsEntity.setDccmcrttm(vo.getCcmcrttm());
		} else {
			dsEntity.setDccmcrttm(0);
		}
		if(vo.getCcmcrtpgm() != null ) {
			dsEntity.setDccmcrtpgm(vo.getCcmcrtpgm());
		} else {
			dsEntity.setDccmcrtpgm("");
		}
		if(vo.getCcmchgusr() != null ) {
			dsEntity.setDccmchgusr(vo.getCcmchgusr());
		} else {
			dsEntity.setDccmchgusr("");
		}
		if(vo.getCcmchgdt() != null ) {
			dsEntity.setDccmchgdt(vo.getCcmchgdt());
		} else {
			dsEntity.setDccmchgdt(0);
		}
		if(vo.getCcmchgtm() != null ) {
			dsEntity.setDccmchgtm(vo.getCcmchgtm());
		} else {
			dsEntity.setDccmchgtm(0);
		}
		if(vo.getCcmchgpgm() != null ) {
			dsEntity.setDccmchgpgm(vo.getCcmchgpgm());
		} else {
			dsEntity.setDccmchgpgm("");
		}
		vo.setDate1(StringUtils.replaceChars(vo.getDate1Field().getValue(String.class), "/", ""));
	}
	
	public void updateCdccm02dScrn1FromScrn1(final Cdccm02rContext ctx, final ExecutionController ctrl, Scrn1 dsEntity, Cdccm02dScrn1 vo){
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

		try {
			vo.setCardnum(dsEntity.getDcardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getDcardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

		if(dsEntity.getDacctnum() != null ) {
			vo.setAcctnum(dsEntity.getDacctnum());
		}

		if(dsEntity.getDname() != null ) {
			vo.setName(dsEntity.getDname());
		}

		if(dsEntity.getDprimarysec() != null ) {
			vo.setPrimarysec(dsEntity.getDprimarysec());
		}

		if(dsEntity.getDstatus() != null ) {
			vo.setStatus(dsEntity.getDstatus());
		}

		if(dsEntity.getDstatusdess() != null ) {
			vo.setStatusdess(dsEntity.getDstatusdess());
		}

		if(dsEntity.getDexpirymo() != null ) {
			vo.setExpirymo(dsEntity.getDexpirymo());
		}

		if(dsEntity.getDexpiryyr() != null ) {
			vo.setExpiryyr(dsEntity.getDexpiryyr());
		}

		if(dsEntity.getDcvv() != null ) {
			vo.setCvv(dsEntity.getDcvv());
		}

		if(dsEntity.getDccmcrtusr() != null ) {
			vo.setCcmcrtusr(dsEntity.getDccmcrtusr());
		}

		try {
			vo.setCcmcrtdt(dsEntity.getDccmcrtdt());
		} catch (Exception e) {
			vo.getCcmcrtdtField().setValue(StringUtils.removeSign(dsEntity.getDccmcrtdtReference().getValue(String.class)));
		}
		vo.getCcmcrtdtField().setNumerical(true);

		try {
			vo.setCcmcrttm(dsEntity.getDccmcrttm());
		} catch (Exception e) {
			vo.getCcmcrttmField().setValue(StringUtils.removeSign(dsEntity.getDccmcrttmReference().getValue(String.class)));
		}
		vo.getCcmcrttmField().setNumerical(true);

		if(dsEntity.getDccmcrtpgm() != null ) {
			vo.setCcmcrtpgm(dsEntity.getDccmcrtpgm());
		}

		if(dsEntity.getDccmchgusr() != null ) {
			vo.setCcmchgusr(dsEntity.getDccmchgusr());
		}

		try {
			vo.setCcmchgdt(dsEntity.getDccmchgdt());
		} catch (Exception e) {
			vo.getCcmchgdtField().setValue(StringUtils.removeSign(dsEntity.getDccmchgdtReference().getValue(String.class)));
		}
		vo.getCcmchgdtField().setNumerical(true);

		try {
			vo.setCcmchgtm(dsEntity.getDccmchgtm());
		} catch (Exception e) {
			vo.getCcmchgtmField().setValue(StringUtils.removeSign(dsEntity.getDccmchgtmReference().getValue(String.class)));
		}
		vo.getCcmchgtmField().setNumerical(true);

		if(dsEntity.getDccmchgpgm() != null ) {
			vo.setCcmchgpgm(dsEntity.getDccmchgpgm());
		}

	}
	
	public void applyCdccm02dScrn1MiscOut(final Cdccm02rContext ctx, final ExecutionController ctrl, Cdccm02dScrn1 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
		vo.getCsrrecField().setIntensity(IntensityMode.DRK);
		vo.getCsrrecField().setProtection(ProtectionMode.PROT);
		vo.getCsrfldField().setIntensity(IntensityMode.DRK);
		vo.getCsrfldField().setProtection(ProtectionMode.PROT);
		vo.getCsrposField().setIntensity(IntensityMode.DRK);
		vo.getCsrposField().setProtection(ProtectionMode.PROT);
		vo.setLabelViewCreditCard("View Credit Card");
		vo.getLabelViewCreditCardField().setProtection(ProtectionMode.PROT);
		vo.getLabelViewCreditCardField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") == 0)) {
			vo.getLabelViewCreditCardField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelCreateCreditCard("Create Credit Card");
		vo.getLabelCreateCreditCardField().setProtection(ProtectionMode.PROT);
		vo.getLabelCreateCreditCardField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelCreateCreditCardField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdateCreditCard("Update Credit Card");
		vo.getLabelUpdateCreditCardField().setProtection(ProtectionMode.PROT);
		vo.getLabelUpdateCreditCardField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") != 0)) {
			vo.getLabelUpdateCreditCardField().setIntensity(IntensityMode.DRK);
		}
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
		vo.getCardnumField().setProtection(ProtectionMode.PROT);
		vo.getCardnumField().setColor(ColorMode.WHITE);
		vo.getCustidField().setProtection(ProtectionMode.UNPROT);
		vo.getCustidField().setColor(ColorMode.PINK);

		if((DataUtils.compare(ctx.getIndicatorsGroup().getIn61Reference(), "1") == 0) 
			|| (DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCustidField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn61Reference(), "1") != 0) {
			vo.getCustidField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn77Reference(), "1") == 0) {
			vo.getCustidField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn77Reference(), "1") == 0) {
			vo.getCustidField().setHilight(HilightMode.REVERSE);
		}
		vo.getAcctnumField().setProtection(ProtectionMode.UNPROT);
		vo.getAcctnumField().setColor(ColorMode.PINK);

		if((DataUtils.compare(ctx.getIndicatorsGroup().getIn61Reference(), "1") == 0) 
			|| (DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getAcctnumField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn61Reference(), "1") != 0) {
			vo.getAcctnumField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn78Reference(), "1") == 0) {
			vo.getAcctnumField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn78Reference(), "1") == 0) {
			vo.getAcctnumField().setHilight(HilightMode.REVERSE);
		}
		vo.getNameField().setProtection(ProtectionMode.UNPROT);
		vo.getNameField().setColor(ColorMode.WHITE);

		if((DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) 
			|| (DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") == 0)) {
			vo.getNameField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") != 0) {
			vo.getNameField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0) {
			vo.getNameField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn79Reference(), "1") == 0) {
			vo.getNameField().setHilight(HilightMode.REVERSE);
		}
		vo.getPrimarysecField().setProtection(ProtectionMode.PROT);
		vo.getPrimarysecField().setColor(ColorMode.WHITE);
		vo.getStatusField().setProtection(ProtectionMode.PROT);
		vo.getStatusField().setColor(ColorMode.TURQUOISE);
		vo.getStatusdessField().setProtection(ProtectionMode.PROT);
		vo.getStatusdessField().setColor(ColorMode.WHITE);
		vo.getExpirymoField().setProtection(ProtectionMode.PROT);
		vo.getExpirymoField().setColor(ColorMode.WHITE);
		vo.getExpiryyrField().setProtection(ProtectionMode.PROT);
		vo.getExpiryyrField().setColor(ColorMode.WHITE);
		vo.getCvvField().setProtection(ProtectionMode.PROT);
		vo.getCvvField().setColor(ColorMode.WHITE);
		vo.setLabelCreatedBy("Created By:");
		vo.getLabelCreatedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelCreatedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmcrtusrField().setProtection(ProtectionMode.PROT);
		vo.getCcmcrtusrField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCcmcrtusrField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn("On:");
		vo.getLabelOnField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelOnField().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmcrtdtField().setProtection(ProtectionMode.PROT);
		vo.getCcmcrtdtField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCcmcrtdtField().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmcrttmField().setProtection(ProtectionMode.PROT);
		vo.getCcmcrttmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCcmcrttmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram("Program:");
		vo.getLabelProgramField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelProgramField().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmcrtpgmField().setProtection(ProtectionMode.PROT);
		vo.getCcmcrtpgmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCcmcrtpgmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdatedBy("Updated By:");
		vo.getLabelUpdatedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelUpdatedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmchgusrField().setProtection(ProtectionMode.PROT);
		vo.getCcmchgusrField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCcmchgusrField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn1("On:");
		vo.getLabelOn1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelOn1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmchgdtField().setProtection(ProtectionMode.PROT);
		vo.getCcmchgdtField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCcmchgdtField().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmchgtmField().setProtection(ProtectionMode.PROT);
		vo.getCcmchgtmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") != 0)) {
			vo.getCcmchgtmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram1("Program:");
		vo.getLabelProgram1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelProgram1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getCcmchgpgmField().setProtection(ProtectionMode.PROT);
		vo.getCcmchgpgmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCcmchgpgmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelF3ExitF9CardHistory("F3=Exit  F9=Card History");
		vo.getLabelF3ExitF9CardHistoryField().setProtection(ProtectionMode.PROT);
		vo.getLabelF3ExitF9CardHistoryField().setColor(ColorMode.BLUE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") == 0)) {
			vo.getLabelF3ExitF9CardHistoryField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelF12Cancel("F12=Cancel");
		vo.getLabelF12CancelField().setProtection(ProtectionMode.PROT);
		vo.getLabelF12CancelField().setColor(ColorMode.BLUE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") == 0)) {
			vo.getLabelF12CancelField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelF2Clear("F2=Clear");
		vo.getLabelF2ClearField().setProtection(ProtectionMode.PROT);
		vo.getLabelF2ClearField().setColor(ColorMode.BLUE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelF2ClearField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelF3ExitF12Cancel("F3=Exit  F12=Cancel");
		vo.getLabelF3ExitF12CancelField().setProtection(ProtectionMode.PROT);
		vo.getLabelF3ExitF12CancelField().setColor(ColorMode.BLUE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelF3ExitF12CancelField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelF3ExitF9CardHistory1("F3=Exit  F9=Card History");
		vo.getLabelF3ExitF9CardHistory1Field().setProtection(ProtectionMode.PROT);
		vo.getLabelF3ExitF9CardHistory1Field().setColor(ColorMode.BLUE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") != 0)) {
			vo.getLabelF3ExitF9CardHistory1Field().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelF12Cancel1("F12=Cancel");
		vo.getLabelF12Cancel1Field().setProtection(ProtectionMode.PROT);
		vo.getLabelF12Cancel1Field().setColor(ColorMode.BLUE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") != 0)) {
			vo.getLabelF12Cancel1Field().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void applyCdccm02dConfirmMiscIn(final Cdccm02rContext ctx, final ExecutionController ctrl, Cdccm02dConfirm vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn09("0");
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
			case "9": {
				ctx.getFkeyIndicatorsGroup().setInKI("1");
				ctx.getIndicatorsGroup().setIn09("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
		}
	}
	
	public void applyCdccm02dConfirmMiscOut(final Cdccm02rContext ctx, final ExecutionController ctrl, Cdccm02dConfirm vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(5);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(45);
		vo.setHeight(9);
		vo.setWidth(20);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.BLUE);
		vo.setBorderHilight(HilightMode.REVERSE);
		vo.setLabelCreateCreditCard("Create Credit Card");
		vo.getLabelCreateCreditCardField().setProtection(ProtectionMode.PROT);
		vo.getLabelCreateCreditCardField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelCreateCreditCardField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdateCreditCard("Update Credit Card");
		vo.getLabelUpdateCreditCardField().setProtection(ProtectionMode.PROT);
		vo.getLabelUpdateCreditCardField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelUpdateCreditCardField().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void updateCdccm02dMsgsflFromMsgsfl(final Cdccm02rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdccm02dMsgsfl vo){
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
	
	public void applyCdccm02dMsgsflMiscOut(final Cdccm02rContext ctx, final ExecutionController ctrl, Cdccm02dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdccm02dMsgsflcFromMsgsflc(final Cdccm02rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdccm02dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdccm02dMsgsflcMiscOut(final Cdccm02rContext ctx, final ExecutionController ctrl, Cdccm02dMsgsflc vo){
		vo.setDspMode("*DS3");
		vo.getMsgsflField().setDspMode("*DS3");
		vo.getMsgsflField().setMessageSubfile();
		vo.setOverlay(true);
		vo.getMsgsflField().setSize(1);
		vo.getMsgsflField().setNumberOfRecordsPerPage(1);
		vo.getMsgsflField().display(true);
		vo.getMsgsflField().displayControl(true);
		vo.getMsgsflField().initializeRecord(true);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	

}
