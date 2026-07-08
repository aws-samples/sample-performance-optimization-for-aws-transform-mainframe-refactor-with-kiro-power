package aws.bluage.carddemo.cdact02r.service;

import aws.bluage.carddemo.cdact02r.business.context.Cdact02rContext;
import aws.bluage.carddemo.cdact02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdact02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdact02r.business.model.Scrn1;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dConfirm;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dScrn1;
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
	
	public void applyCdact02dScrn1MiscIn(final Cdact02rContext ctx, final ExecutionController ctrl, Cdact02dScrn1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn01("0");
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn07("0");
		ctx.getIndicatorsGroup().setIn08("0");
		ctx.getIndicatorsGroup().setIn09("0");
		ctx.getIndicatorsGroup().setIn10("0");
		ctx.getIndicatorsGroup().setIn11("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn13("0");
		ctx.getIndicatorsGroup().setIn14("0");
		ctx.getIndicatorsGroup().setIn15("0");
		ctx.getIndicatorsGroup().setIn16("0");
		ctx.getIndicatorsGroup().setIn17("0");
		ctx.getIndicatorsGroup().setIn18("0");
		ctx.getIndicatorsGroup().setIn19("0");
		ctx.getIndicatorsGroup().setIn20("0");
		ctx.getIndicatorsGroup().setIn21("0");
		ctx.getIndicatorsGroup().setIn22("0");
		ctx.getIndicatorsGroup().setIn23("0");
		ctx.getIndicatorsGroup().setIn24("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "1": {
				ctx.getFkeyIndicatorsGroup().setInKA("1");
				ctx.getIndicatorsGroup().setIn01("1");
				break;
			}
			case "2": {
				ctx.getFkeyIndicatorsGroup().setInKB("1");
				ctx.getIndicatorsGroup().setIn02("1");
				break;
			}
			case "4": {
				ctx.getFkeyIndicatorsGroup().setInKD("1");
				ctx.getIndicatorsGroup().setIn04("1");
				break;
			}
			case "5": {
				ctx.getFkeyIndicatorsGroup().setInKE("1");
				ctx.getIndicatorsGroup().setIn05("1");
				break;
			}
			case "6": {
				ctx.getFkeyIndicatorsGroup().setInKF("1");
				ctx.getIndicatorsGroup().setIn06("1");
				break;
			}
			case "7": {
				ctx.getFkeyIndicatorsGroup().setInKG("1");
				ctx.getIndicatorsGroup().setIn07("1");
				break;
			}
			case "8": {
				ctx.getFkeyIndicatorsGroup().setInKH("1");
				ctx.getIndicatorsGroup().setIn08("1");
				break;
			}
			case "9": {
				ctx.getFkeyIndicatorsGroup().setInKI("1");
				ctx.getIndicatorsGroup().setIn09("1");
				break;
			}
			case "10": {
				ctx.getFkeyIndicatorsGroup().setInKJ("1");
				ctx.getIndicatorsGroup().setIn10("1");
				break;
			}
			case "11": {
				ctx.getFkeyIndicatorsGroup().setInKK("1");
				ctx.getIndicatorsGroup().setIn11("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
			case "13": {
				ctx.getFkeyIndicatorsGroup().setInKM("1");
				ctx.getIndicatorsGroup().setIn13("1");
				break;
			}
			case "14": {
				ctx.getFkeyIndicatorsGroup().setInKN("1");
				ctx.getIndicatorsGroup().setIn14("1");
				break;
			}
			case "15": {
				ctx.getFkeyIndicatorsGroup().setInKP("1");
				ctx.getIndicatorsGroup().setIn15("1");
				break;
			}
			case "16": {
				ctx.getFkeyIndicatorsGroup().setInKQ("1");
				ctx.getIndicatorsGroup().setIn16("1");
				break;
			}
			case "17": {
				ctx.getFkeyIndicatorsGroup().setInKR("1");
				ctx.getIndicatorsGroup().setIn17("1");
				break;
			}
			case "18": {
				ctx.getFkeyIndicatorsGroup().setInKS("1");
				ctx.getIndicatorsGroup().setIn18("1");
				break;
			}
			case "19": {
				ctx.getFkeyIndicatorsGroup().setInKT("1");
				ctx.getIndicatorsGroup().setIn19("1");
				break;
			}
			case "20": {
				ctx.getFkeyIndicatorsGroup().setInKU("1");
				ctx.getIndicatorsGroup().setIn20("1");
				break;
			}
			case "21": {
				ctx.getFkeyIndicatorsGroup().setInKV("1");
				ctx.getIndicatorsGroup().setIn21("1");
				break;
			}
			case "22": {
				ctx.getFkeyIndicatorsGroup().setInKW("1");
				ctx.getIndicatorsGroup().setIn22("1");
				break;
			}
			case "23": {
				ctx.getFkeyIndicatorsGroup().setInKX("1");
				ctx.getIndicatorsGroup().setIn23("1");
				break;
			}
			case "24": {
				ctx.getFkeyIndicatorsGroup().setInKY("1");
				ctx.getIndicatorsGroup().setIn24("1");
				break;
			}
		}
		vo.setCsrrec(vo.getCursorRecordName());
		vo.setCsrfld(vo.getCursorFieldName());
		vo.setCsrpos(vo.getCursorPosition());
	}
	
	public void updateScrn1FromCdact02dScrn1(final Cdact02rContext ctx, final ExecutionController ctrl, Cdact02dScrn1 vo, Scrn1 dsEntity){
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
		if(vo.getAcctnum() != null ) {
			dsEntity.setDacctnum(vo.getAcctnum());
		} else {
			dsEntity.setDacctnum("");
		}
		if(vo.getOpendate() != null ) {
			dsEntity.setDopendate(vo.getOpendate());
		} else {
			dsEntity.setDopendate("");
		}
		if(vo.getExpirydate() != null ) {
			dsEntity.setDexpirydate(vo.getExpirydate());
		} else {
			dsEntity.setDexpirydate("");
		}
		if(vo.getPricustid() != null ) {
			dsEntity.setDpricustid(vo.getPricustid());
		} else {
			dsEntity.setDpricustid("");
		}
		if(vo.getSeccustid() != null ) {
			dsEntity.setDseccustid(vo.getSeccustid());
		} else {
			dsEntity.setDseccustid("");
		}
		if(vo.getAcctgrp() != null ) {
			dsEntity.setDacctgrp(vo.getAcctgrp());
		} else {
			dsEntity.setDacctgrp("");
		}
		if(vo.getCredlimit() != null ) {
			dsEntity.setDcredlimit(vo.getCredlimit());
		} else {
			dsEntity.setDcredlimit("");
		}
		if(vo.getCashlimit() != null ) {
			dsEntity.setDcashlimit(vo.getCashlimit());
		} else {
			dsEntity.setDcashlimit("");
		}
		if(vo.getBalance() != null ) {
			dsEntity.setDbalance(vo.getBalance());
		} else {
			dsEntity.setDbalance("");
		}
		if(vo.getCurcredit() != null ) {
			dsEntity.setDcurcredit(vo.getCurcredit());
		} else {
			dsEntity.setDcurcredit("");
		}
		if(vo.getCurdebit() != null ) {
			dsEntity.setDcurdebit(vo.getCurdebit());
		} else {
			dsEntity.setDcurdebit("");
		}
		if(vo.getActcrtusr() != null ) {
			dsEntity.setDactcrtusr(vo.getActcrtusr());
		} else {
			dsEntity.setDactcrtusr("");
		}
		if(vo.getActcrtdt() != null ) {
			dsEntity.setDactcrtdt(vo.getActcrtdt());
		} else {
			dsEntity.setDactcrtdt(0);
		}
		if(vo.getActcrttm() != null ) {
			dsEntity.setDactcrttm(vo.getActcrttm());
		} else {
			dsEntity.setDactcrttm(0);
		}
		if(vo.getActcrtpgm() != null ) {
			dsEntity.setDactcrtpgm(vo.getActcrtpgm());
		} else {
			dsEntity.setDactcrtpgm("");
		}
		if(vo.getActchgusr() != null ) {
			dsEntity.setDactchgusr(vo.getActchgusr());
		} else {
			dsEntity.setDactchgusr("");
		}
		if(vo.getActchgdt() != null ) {
			dsEntity.setDactchgdt(vo.getActchgdt());
		} else {
			dsEntity.setDactchgdt(0);
		}
		if(vo.getActchgtm() != null ) {
			dsEntity.setDactchgtm(vo.getActchgtm());
		} else {
			dsEntity.setDactchgtm(0);
		}
		if(vo.getActchgpgm() != null ) {
			dsEntity.setDactchgpgm(vo.getActchgpgm());
		} else {
			dsEntity.setDactchgpgm("");
		}
		if(vo.getStatus() != null ) {
			dsEntity.setDstatus(vo.getStatus());
		} else {
			dsEntity.setDstatus("");
		}
		vo.setDate1(StringUtils.replaceChars(vo.getDate1Field().getValue(String.class), "/", ""));
	}
	
	public void updateCdact02dScrn1FromScrn1(final Cdact02rContext ctx, final ExecutionController ctrl, Scrn1 dsEntity, Cdact02dScrn1 vo){
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

		if(dsEntity.getDacctnum() != null ) {
			vo.setAcctnum(dsEntity.getDacctnum());
		}

		if(dsEntity.getDopendate() != null ) {
			vo.setOpendate(dsEntity.getDopendate());
		}

		if(dsEntity.getDexpirydate() != null ) {
			vo.setExpirydate(dsEntity.getDexpirydate());
		}

		if(dsEntity.getDpricustid() != null ) {
			vo.setPricustid(dsEntity.getDpricustid());
		}

		if(dsEntity.getDseccustid() != null ) {
			vo.setSeccustid(dsEntity.getDseccustid());
		}

		if(dsEntity.getDacctgrp() != null ) {
			vo.setAcctgrp(dsEntity.getDacctgrp());
		}

		if(dsEntity.getDcredlimit() != null ) {
			vo.setCredlimit(dsEntity.getDcredlimit());
		}

		if(dsEntity.getDcashlimit() != null ) {
			vo.setCashlimit(dsEntity.getDcashlimit());
		}

		if(dsEntity.getDbalance() != null ) {
			vo.setBalance(dsEntity.getDbalance());
		}

		if(dsEntity.getDcurcredit() != null ) {
			vo.setCurcredit(dsEntity.getDcurcredit());
		}

		if(dsEntity.getDcurdebit() != null ) {
			vo.setCurdebit(dsEntity.getDcurdebit());
		}

		if(dsEntity.getDactcrtusr() != null ) {
			vo.setActcrtusr(dsEntity.getDactcrtusr());
		}

		try {
			vo.setActcrtdt(dsEntity.getDactcrtdt());
		} catch (Exception e) {
			vo.getActcrtdtField().setValue(StringUtils.removeSign(dsEntity.getDactcrtdtReference().getValue(String.class)));
		}
		vo.getActcrtdtField().setNumerical(true);

		try {
			vo.setActcrttm(dsEntity.getDactcrttm());
		} catch (Exception e) {
			vo.getActcrttmField().setValue(StringUtils.removeSign(dsEntity.getDactcrttmReference().getValue(String.class)));
		}
		vo.getActcrttmField().setNumerical(true);

		if(dsEntity.getDactcrtpgm() != null ) {
			vo.setActcrtpgm(dsEntity.getDactcrtpgm());
		}

		if(dsEntity.getDactchgusr() != null ) {
			vo.setActchgusr(dsEntity.getDactchgusr());
		}

		try {
			vo.setActchgdt(dsEntity.getDactchgdt());
		} catch (Exception e) {
			vo.getActchgdtField().setValue(StringUtils.removeSign(dsEntity.getDactchgdtReference().getValue(String.class)));
		}
		vo.getActchgdtField().setNumerical(true);

		try {
			vo.setActchgtm(dsEntity.getDactchgtm());
		} catch (Exception e) {
			vo.getActchgtmField().setValue(StringUtils.removeSign(dsEntity.getDactchgtmReference().getValue(String.class)));
		}
		vo.getActchgtmField().setNumerical(true);

		if(dsEntity.getDactchgpgm() != null ) {
			vo.setActchgpgm(dsEntity.getDactchgpgm());
		}

		if(dsEntity.getDstatus() != null ) {
			vo.setStatus(dsEntity.getDstatus());
		}

	}
	
	public void applyCdact02dScrn1MiscOut(final Cdact02rContext ctx, final ExecutionController ctrl, Cdact02dScrn1 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
		vo.getCsrrecField().setIntensity(IntensityMode.DRK);
		vo.getCsrrecField().setProtection(ProtectionMode.PROT);
		vo.getCsrfldField().setIntensity(IntensityMode.DRK);
		vo.getCsrfldField().setProtection(ProtectionMode.PROT);
		vo.getCsrposField().setIntensity(IntensityMode.DRK);
		vo.getCsrposField().setProtection(ProtectionMode.PROT);
		vo.setLabelEditAccount("Edit Account");
		vo.getLabelEditAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelEditAccountField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelEditAccountField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelAddAccount("Add Account");
		vo.getLabelAddAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelAddAccountField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelAddAccountField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelViewAccount("View Account");
		vo.getLabelViewAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelViewAccountField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0)) {
			vo.getLabelViewAccountField().setIntensity(IntensityMode.DRK);
		}
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
		vo.getAcctnumField().setProtection(ProtectionMode.UNPROT);
		vo.getAcctnumField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0) {
			vo.getAcctnumField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) {
			vo.getAcctnumField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getAcctnumField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getAcctnumField().setHilight(HilightMode.REVERSE);
		}
		vo.getOpendateField().setProtection(ProtectionMode.PROT);
		vo.getOpendateField().setColor(ColorMode.WHITE);
		vo.getExpirydateField().setProtection(ProtectionMode.UNPROT);
		vo.getExpirydateField().setColor(ColorMode.WHITE);

		if((DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) 
			|| (DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0)) {
			vo.getExpirydateField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0) {
			vo.getExpirydateField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getExpirydateField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getExpirydateField().setHilight(HilightMode.REVERSE);
		}
		vo.getPricustidField().setProtection(ProtectionMode.UNPROT);
		vo.getPricustidField().setColor(ColorMode.PINK);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0) {
			vo.getPricustidField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) {
			vo.getPricustidField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn51Reference(), "1") == 0) {
			vo.getPricustidField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn88Reference(), "1") == 0) {
			vo.getPricustidField().setHilight(HilightMode.REVERSE);
		}
		vo.getSeccustidField().setProtection(ProtectionMode.UNPROT);
		vo.getSeccustidField().setColor(ColorMode.PINK);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn72Reference(), "1") == 0) {
			vo.getSeccustidField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn72Reference(), "1") != 0) {
			vo.getSeccustidField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn52Reference(), "1") == 0) {
			vo.getSeccustidField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn89Reference(), "1") == 0) {
			vo.getSeccustidField().setHilight(HilightMode.REVERSE);
		}
		vo.getAcctgrpField().setProtection(ProtectionMode.UNPROT);
		vo.getAcctgrpField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getAcctgrpField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getAcctgrpField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn82Reference(), "1") == 0) {
			vo.getAcctgrpField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn82Reference(), "1") == 0) {
			vo.getAcctgrpField().setHilight(HilightMode.REVERSE);
		}
		vo.getCredlimitField().setProtection(ProtectionMode.UNPROT);
		vo.getCredlimitField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getCredlimitField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getCredlimitField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getCredlimitField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getCredlimitField().setHilight(HilightMode.REVERSE);
		}
		vo.getCashlimitField().setProtection(ProtectionMode.UNPROT);
		vo.getCashlimitField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getCashlimitField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getCashlimitField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn84Reference(), "1") == 0) {
			vo.getCashlimitField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn84Reference(), "1") == 0) {
			vo.getCashlimitField().setHilight(HilightMode.REVERSE);
		}
		vo.setLabelCurrentBalance("Current Balance       :");
		vo.getLabelCurrentBalanceField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelCurrentBalanceField().setIntensity(IntensityMode.DRK);
		}
		vo.getBalanceField().setProtection(ProtectionMode.PROT);
		vo.getBalanceField().setColor(ColorMode.WHITE);
		vo.setLabelCurrentCycleCredit("Current Cycle Credit  :");
		vo.getLabelCurrentCycleCreditField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelCurrentCycleCreditField().setIntensity(IntensityMode.DRK);
		}
		vo.getCurcreditField().setProtection(ProtectionMode.PROT);
		vo.getCurcreditField().setColor(ColorMode.WHITE);
		vo.setLabelCurrentCycleDebit("Current Cycle Debit   :");
		vo.getLabelCurrentCycleDebitField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelCurrentCycleDebitField().setIntensity(IntensityMode.DRK);
		}
		vo.getCurdebitField().setProtection(ProtectionMode.PROT);
		vo.getCurdebitField().setColor(ColorMode.WHITE);
		vo.setLabelCreatedBy("Created By:");
		vo.getLabelCreatedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelCreatedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getActcrtusrField().setProtection(ProtectionMode.PROT);
		vo.getActcrtusrField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActcrtusrField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn("On:");
		vo.getLabelOnField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelOnField().setIntensity(IntensityMode.DRK);
		}
		vo.getActcrtdtField().setProtection(ProtectionMode.PROT);
		vo.getActcrtdtField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActcrtdtField().setIntensity(IntensityMode.DRK);
		}
		vo.getActcrttmField().setProtection(ProtectionMode.PROT);
		vo.getActcrttmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActcrttmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram("Program:");
		vo.getLabelProgramField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelProgramField().setIntensity(IntensityMode.DRK);
		}
		vo.getActcrtpgmField().setProtection(ProtectionMode.PROT);
		vo.getActcrtpgmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActcrtpgmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdatedBy("Updated By:");
		vo.getLabelUpdatedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelUpdatedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getActchgusrField().setProtection(ProtectionMode.PROT);
		vo.getActchgusrField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActchgusrField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn1("On:");
		vo.getLabelOn1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelOn1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getActchgdtField().setProtection(ProtectionMode.PROT);
		vo.getActchgdtField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActchgdtField().setIntensity(IntensityMode.DRK);
		}
		vo.getActchgtmField().setProtection(ProtectionMode.PROT);
		vo.getActchgtmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActchgtmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram1("Program:");
		vo.getLabelProgram1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelProgram1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getActchgpgmField().setProtection(ProtectionMode.PROT);
		vo.getActchgpgmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getActchgpgmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelAccountStatus("Account Status :");
		vo.getLabelAccountStatusField().setProtection(ProtectionMode.PROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) {
			vo.getLabelAccountStatusField().setIntensity(IntensityMode.DRK);
		}
		vo.getStatusField().setProtection(ProtectionMode.PROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") == 0) {
			vo.getStatusField().setColor(ColorMode.RED);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn71Reference(), "1") != 0) {
			vo.getStatusField().setColor(ColorMode.WHITE);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) {
			vo.getStatusField().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void applyCdact02dConfirmMiscIn(final Cdact02rContext ctx, final ExecutionController ctrl, Cdact02dConfirm vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn01("0");
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn07("0");
		ctx.getIndicatorsGroup().setIn08("0");
		ctx.getIndicatorsGroup().setIn09("0");
		ctx.getIndicatorsGroup().setIn10("0");
		ctx.getIndicatorsGroup().setIn11("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn13("0");
		ctx.getIndicatorsGroup().setIn14("0");
		ctx.getIndicatorsGroup().setIn15("0");
		ctx.getIndicatorsGroup().setIn16("0");
		ctx.getIndicatorsGroup().setIn17("0");
		ctx.getIndicatorsGroup().setIn18("0");
		ctx.getIndicatorsGroup().setIn19("0");
		ctx.getIndicatorsGroup().setIn20("0");
		ctx.getIndicatorsGroup().setIn21("0");
		ctx.getIndicatorsGroup().setIn22("0");
		ctx.getIndicatorsGroup().setIn23("0");
		ctx.getIndicatorsGroup().setIn24("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "1": {
				ctx.getFkeyIndicatorsGroup().setInKA("1");
				ctx.getIndicatorsGroup().setIn01("1");
				break;
			}
			case "2": {
				ctx.getFkeyIndicatorsGroup().setInKB("1");
				ctx.getIndicatorsGroup().setIn02("1");
				break;
			}
			case "4": {
				ctx.getFkeyIndicatorsGroup().setInKD("1");
				ctx.getIndicatorsGroup().setIn04("1");
				break;
			}
			case "5": {
				ctx.getFkeyIndicatorsGroup().setInKE("1");
				ctx.getIndicatorsGroup().setIn05("1");
				break;
			}
			case "6": {
				ctx.getFkeyIndicatorsGroup().setInKF("1");
				ctx.getIndicatorsGroup().setIn06("1");
				break;
			}
			case "7": {
				ctx.getFkeyIndicatorsGroup().setInKG("1");
				ctx.getIndicatorsGroup().setIn07("1");
				break;
			}
			case "8": {
				ctx.getFkeyIndicatorsGroup().setInKH("1");
				ctx.getIndicatorsGroup().setIn08("1");
				break;
			}
			case "9": {
				ctx.getFkeyIndicatorsGroup().setInKI("1");
				ctx.getIndicatorsGroup().setIn09("1");
				break;
			}
			case "10": {
				ctx.getFkeyIndicatorsGroup().setInKJ("1");
				ctx.getIndicatorsGroup().setIn10("1");
				break;
			}
			case "11": {
				ctx.getFkeyIndicatorsGroup().setInKK("1");
				ctx.getIndicatorsGroup().setIn11("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
			case "13": {
				ctx.getFkeyIndicatorsGroup().setInKM("1");
				ctx.getIndicatorsGroup().setIn13("1");
				break;
			}
			case "14": {
				ctx.getFkeyIndicatorsGroup().setInKN("1");
				ctx.getIndicatorsGroup().setIn14("1");
				break;
			}
			case "15": {
				ctx.getFkeyIndicatorsGroup().setInKP("1");
				ctx.getIndicatorsGroup().setIn15("1");
				break;
			}
			case "16": {
				ctx.getFkeyIndicatorsGroup().setInKQ("1");
				ctx.getIndicatorsGroup().setIn16("1");
				break;
			}
			case "17": {
				ctx.getFkeyIndicatorsGroup().setInKR("1");
				ctx.getIndicatorsGroup().setIn17("1");
				break;
			}
			case "18": {
				ctx.getFkeyIndicatorsGroup().setInKS("1");
				ctx.getIndicatorsGroup().setIn18("1");
				break;
			}
			case "19": {
				ctx.getFkeyIndicatorsGroup().setInKT("1");
				ctx.getIndicatorsGroup().setIn19("1");
				break;
			}
			case "20": {
				ctx.getFkeyIndicatorsGroup().setInKU("1");
				ctx.getIndicatorsGroup().setIn20("1");
				break;
			}
			case "21": {
				ctx.getFkeyIndicatorsGroup().setInKV("1");
				ctx.getIndicatorsGroup().setIn21("1");
				break;
			}
			case "22": {
				ctx.getFkeyIndicatorsGroup().setInKW("1");
				ctx.getIndicatorsGroup().setIn22("1");
				break;
			}
			case "23": {
				ctx.getFkeyIndicatorsGroup().setInKX("1");
				ctx.getIndicatorsGroup().setIn23("1");
				break;
			}
			case "24": {
				ctx.getFkeyIndicatorsGroup().setInKY("1");
				ctx.getIndicatorsGroup().setIn24("1");
				break;
			}
		}
	}
	
	public void applyCdact02dConfirmMiscOut(final Cdact02rContext ctx, final ExecutionController ctrl, Cdact02dConfirm vo){
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
		vo.setLabelAddAccount("Add Account");
		vo.getLabelAddAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelAddAccountField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelAddAccountField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdateAccount("Update Account");
		vo.getLabelUpdateAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelUpdateAccountField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelUpdateAccountField().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void updateCdact02dMsgsflFromMsgsfl(final Cdact02rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdact02dMsgsfl vo){
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
	
	public void applyCdact02dMsgsflMiscOut(final Cdact02rContext ctx, final ExecutionController ctrl, Cdact02dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdact02dMsgsflcFromMsgsflc(final Cdact02rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdact02dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdact02dMsgsflcMiscOut(final Cdact02rContext ctx, final ExecutionController ctrl, Cdact02dMsgsflc vo){
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
