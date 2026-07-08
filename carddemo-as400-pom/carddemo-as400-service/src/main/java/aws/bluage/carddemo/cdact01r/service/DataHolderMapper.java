package aws.bluage.carddemo.cdact01r.service;

import aws.bluage.carddemo.cdact01r.business.context.Cdact01rContext;
import aws.bluage.carddemo.cdact01r.business.model.Ctl1;
import aws.bluage.carddemo.cdact01r.business.model.Delerrwin;
import aws.bluage.carddemo.cdact01r.business.model.Delwin;
import aws.bluage.carddemo.cdact01r.business.model.Filterwin;
import aws.bluage.carddemo.cdact01r.business.model.Footer;
import aws.bluage.carddemo.cdact01r.business.model.Header1;
import aws.bluage.carddemo.cdact01r.business.model.Header2;
import aws.bluage.carddemo.cdact01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdact01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdact01r.business.model.Sfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dDelerrwin;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dDelwin;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dFilterwin;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dSfl1;
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
	
	public void updateCdact01dHeader1FromHeader1(final Cdact01rContext ctx, final ExecutionController ctrl, Header1 dsEntity, Cdact01dHeader1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmname() != null ) {
			vo.setPgmname(dsEntity.getPgmname());
		}

	}
	
	public void applyCdact01dHeader1MiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dHeader1 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.setLabelAccountMainScreen("Account Main Screen");
		vo.getLabelAccountMainScreenField().setProtection(ProtectionMode.PROT);
		vo.getLabelAccountMainScreenField().setHilight(HilightMode.REVERSE);
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
	}
	
	public void applyCdact01dHeader2MiscIn(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dHeader2 vo){
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
	
	public void updateHeader2FromCdact01dHeader2(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dHeader2 vo, Header2 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getPosition() != null ) {
			dsEntity.setPosition(vo.getPosition());
		} else {
			dsEntity.setPosition("");
		}
	}
	
	public void updateCdact01dHeader2FromHeader2(final Cdact01rContext ctx, final ExecutionController ctrl, Header2 dsEntity, Cdact01dHeader2 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPosition() != null ) {
			vo.setPosition(dsEntity.getPosition());
		}

	}
	
	public void applyCdact01dHeader2MiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dHeader2 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.setLabel("?");
		vo.getLabelField().setProtection(ProtectionMode.PROT);
		vo.getLabelField().setColor(ColorMode.BLUE);
		vo.getLabelField().setUnderline(true);
		vo.setLabelAccountId("Account ID");
		vo.getLabelAccountIdField().setProtection(ProtectionMode.PROT);
		vo.getLabelAccountIdField().setColor(ColorMode.BLUE);
		vo.getLabelAccountIdField().setUnderline(true);
		vo.setLabelOpenDate("Open Date");
		vo.getLabelOpenDateField().setProtection(ProtectionMode.PROT);
		vo.getLabelOpenDateField().setColor(ColorMode.BLUE);
		vo.getLabelOpenDateField().setUnderline(true);
		vo.setLabelPrimaryCust("Primary Cust");
		vo.getLabelPrimaryCustField().setProtection(ProtectionMode.PROT);
		vo.getLabelPrimaryCustField().setColor(ColorMode.BLUE);
		vo.getLabelPrimaryCustField().setUnderline(true);
		vo.setLabelSecondaryCust("Secondary Cust");
		vo.getLabelSecondaryCustField().setProtection(ProtectionMode.PROT);
		vo.getLabelSecondaryCustField().setColor(ColorMode.BLUE);
		vo.getLabelSecondaryCustField().setUnderline(true);
		vo.setLabelBalance("Balance");
		vo.getLabelBalanceField().setProtection(ProtectionMode.PROT);
		vo.getLabelBalanceField().setColor(ColorMode.BLUE);
		vo.getLabelBalanceField().setUnderline(true);
		vo.getPositionField().setProtection(ProtectionMode.UNPROT);
		vo.getPositionField().setUnderline(true);
		vo.getPositionField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getPositionField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getPositionField().setHilight(HilightMode.REVERSE);
		}
		vo.setLabelSts("Sts");
		vo.getLabelStsField().setProtection(ProtectionMode.PROT);
		vo.getLabelStsField().setColor(ColorMode.BLUE);
		vo.getLabelStsField().setUnderline(true);
	}
	
	public void updateSfl1FromCdact01dSfl1(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dSfl1 vo, Sfl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getOption() != null ) {
			dsEntity.setOption(vo.getOption());
		} else {
			dsEntity.setOption("");
		}
		if(vo.getSflacct() != null ) {
			dsEntity.setSflacct(vo.getSflacct());
		} else {
			dsEntity.setSflacct("");
		}
		if(vo.getOpendate() != null ) {
			dsEntity.setOpendate(vo.getOpendate());
		} else {
			dsEntity.setOpendate("");
		}
		if(vo.getSflpcust() != null ) {
			dsEntity.setSflpcust(vo.getSflpcust());
		} else {
			dsEntity.setSflpcust("");
		}
		if(vo.getSflscust() != null ) {
			dsEntity.setSflscust(vo.getSflscust());
		} else {
			dsEntity.setSflscust("");
		}
		if(vo.getSflbal() != null ) {
			dsEntity.setSflbal(vo.getSflbal());
		} else {
			dsEntity.setSflbal("");
		}
		if(vo.getSflsts() != null ) {
			dsEntity.setSflsts(vo.getSflsts());
		} else {
			dsEntity.setSflsts("");
		}
	}
	
	public void updateCdact01dSfl1FromSfl1(final Cdact01rContext ctx, final ExecutionController ctrl, Sfl1 dsEntity, Cdact01dSfl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getOption() != null ) {
			vo.setOption(dsEntity.getOption());
		}

		if(dsEntity.getSflacct() != null ) {
			vo.setSflacct(dsEntity.getSflacct());
		}

		if(dsEntity.getOpendate() != null ) {
			vo.setOpendate(dsEntity.getOpendate());
		}

		if(dsEntity.getSflpcust() != null ) {
			vo.setSflpcust(dsEntity.getSflpcust());
		}

		if(dsEntity.getSflscust() != null ) {
			vo.setSflscust(dsEntity.getSflscust());
		}

		if(dsEntity.getSflbal() != null ) {
			vo.setSflbal(dsEntity.getSflbal());
		}

		if(dsEntity.getSflsts() != null ) {
			vo.setSflsts(dsEntity.getSflsts());
		}

	}
	
	public void applyCdact01dSfl1MiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dSfl1 vo){

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.getOptionField().setProtection(ProtectionMode.UNPROT);
		vo.getOptionField().setUnderline(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn34Reference(), "1") == 0) {
			vo.getOptionField().setColor(ColorMode.WHITE);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn34Reference(), "1") == 0) {
			vo.getOptionField().setHilight(HilightMode.REVERSE);
		}
		vo.getOptionField().loadCheckMessage("ERR0001","*LIBL/CDMSGF01");
		vo.getSflacctField().setProtection(ProtectionMode.PROT);
		vo.getOpendateField().setProtection(ProtectionMode.PROT);
		vo.getSflpcustField().setProtection(ProtectionMode.PROT);
		vo.getSflscustField().setProtection(ProtectionMode.PROT);
		vo.getSflbalField().setProtection(ProtectionMode.PROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getSflbalField().setColor(ColorMode.RED);
		}
		vo.getSflstsField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdact01dCtl1MiscIn(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dCtl1 vo){
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
		ctx.getIndicatorsGroup().setIn26("0");
		ctx.getIndicatorsGroup().setIn25("0");
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
			case "PAGEUP": {
				ctx.getIndicatorsGroup().setIn26("1");
				break;
			}
			case "PAGEDOWN": {
				ctx.getIndicatorsGroup().setIn25("1");
				break;
			}
		}
	}
	
	public void updateCtl1FromCdact01dCtl1(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dCtl1 vo, Ctl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getSflrrn() != null ) {
			dsEntity.setSflrrn(vo.getSflrrn());
		} else {
			dsEntity.setSflrrn(0);
		}
	}
	
	public void updateCdact01dCtl1FromCtl1(final Cdact01rContext ctx, final ExecutionController ctrl, Ctl1 dsEntity, Cdact01dCtl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setSflrrn(dsEntity.getSflrrn());
		} catch (Exception e) {
			vo.getSflrrnField().setValue(StringUtils.removeSign(dsEntity.getSflrrnReference().getValue(String.class)));
		}
		vo.getSflrrnField().setNumerical(true);

	}
	
	public void applyCdact01dCtl1MiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dCtl1 vo){
		vo.setDspMode("*DS3");
		vo.getSfl1Field().setDspMode("*DS3");
		vo.setOverlay(true);
		vo.getSfl1Field().setSize(13);
		vo.getSfl1Field().setNumberOfRecordsPerPage(13);
		vo.getSfl1Field().display(DataUtils.compare(ctx.getIndicatorsGroup().getIn30Reference(), "1") != 0);
		vo.getSfl1Field().displayControl(DataUtils.compare(ctx.getIndicatorsGroup().getIn29Reference(), "1") != 0);
		vo.getSfl1Field().initializeRecord(DataUtils.compare(ctx.getIndicatorsGroup().getIn31Reference(), "1") == 0);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn30Reference(), "1") == 0) {
			vo.getSfl1Field().subfileClear();
		}
		vo.getSfl1Field().setPageDown(PageDownMode.PLUS);
		vo.getSfl1Field().setEnd(false);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn33Reference(), "1") == 0) {
			vo.getSfl1Field().setEnd(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.getSflrrnField().setIntensity(IntensityMode.DRK);
		vo.getSflrrnField().setProtection(ProtectionMode.PROT);
		vo.getSfl1Field().setRecordNumber(vo.getSflrrn());
	}
	
	public void updateCdact01dFooterFromFooter(final Cdact01rContext ctx, final ExecutionController ctrl, Footer dsEntity, Cdact01dFooter vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getVaryft() != null ) {
			vo.setVaryft(dsEntity.getVaryft());
		}

	}
	
	public void applyCdact01dFooterMiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dFooter vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.getVaryftField().setProtection(ProtectionMode.PROT);
		vo.getVaryftField().setColor(ColorMode.BLUE);
	}
	
	public void applyCdact01dFilterwinMiscIn(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dFilterwin vo){
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
	
	public void updateFilterwinFromCdact01dFilterwin(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dFilterwin vo, Filterwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCustfltr() != null ) {
			dsEntity.setCustfltr(vo.getCustfltr());
		} else {
			dsEntity.setCustfltr("");
		}
	}
	
	public void updateCdact01dFilterwinFromFilterwin(final Cdact01rContext ctx, final ExecutionController ctrl, Filterwin dsEntity, Cdact01dFilterwin vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getCustfltr() != null ) {
			vo.setCustfltr(dsEntity.getCustfltr());
		}

	}
	
	public void applyCdact01dFilterwinMiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dFilterwin vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(5);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(5);
		vo.setHeight(9);
		vo.setWidth(46);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.BLUE);
		vo.setBorderHilight(HilightMode.REVERSE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.setLabelFilterOption("Filter Option");
		vo.getLabelFilterOptionField().setProtection(ProtectionMode.PROT);
		vo.getLabelFilterOptionField().setColor(ColorMode.WHITE);
		vo.getLabelFilterOptionField().setUnderline(true);
		vo.getCustfltrField().setProtection(ProtectionMode.UNPROT);
		vo.getCustfltrField().setUnderline(true);
		vo.getCustfltrField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") != 0) {
			vo.getCustfltrField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") != 0) {
			vo.getCustfltrField().setHilight(HilightMode.REVERSE);
		}
		vo.setLabelFilterValueMustBeNumeric("Filter value must be numeric.");
		vo.getLabelFilterValueMustBeNumericField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") != 0)) {
			vo.getLabelFilterValueMustBeNumericField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelEnterYOrBlank("Enter Y or blank.");
		vo.getLabelEnterYOrBlankField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn91Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") == 0)) {
			vo.getLabelEnterYOrBlankField().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void applyCdact01dDelwinMiscIn(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dDelwin vo){
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
	
	public void updateDelwinFromCdact01dDelwin(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dDelwin vo, Delwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getActid() != null ) {
			dsEntity.setActid(vo.getActid());
		} else {
			dsEntity.setActid("");
		}
	}
	
	public void updateCdact01dDelwinFromDelwin(final Cdact01rContext ctx, final ExecutionController ctrl, Delwin dsEntity, Cdact01dDelwin vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getActid() != null ) {
			vo.setActid(dsEntity.getActid());
		}

	}
	
	public void applyCdact01dDelwinMiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dDelwin vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(4);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(2);
		vo.setHeight(15);
		vo.setWidth(74);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.BLUE);
		vo.setBorderHilight(HilightMode.REVERSE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.setLabelInactivateAccount("Inactivate Account");
		vo.getLabelInactivateAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelInactivateAccountField().setColor(ColorMode.WHITE);
		vo.getLabelInactivateAccountField().setHilight(HilightMode.REVERSE);
		vo.getActidField().setProtection(ProtectionMode.PROT);
		vo.getActidField().setColor(ColorMode.WHITE);
	}
	
	public void applyCdact01dDelerrwinMiscIn(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dDelerrwin vo){
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
	
	public void updateDelerrwinFromCdact01dDelerrwin(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dDelerrwin vo, Delerrwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getActid() != null ) {
			dsEntity.setActid(vo.getActid());
		} else {
			dsEntity.setActid("");
		}
		if(vo.getErrdelw() != null ) {
			dsEntity.setErrdelw(vo.getErrdelw());
		} else {
			dsEntity.setErrdelw("");
		}
		if(vo.getDpricustid() != null ) {
			dsEntity.setDpricustid(vo.getDpricustid());
		} else {
			dsEntity.setDpricustid("");
		}
		if(vo.getDseccustid() != null ) {
			dsEntity.setDseccustid(vo.getDseccustid());
		} else {
			dsEntity.setDseccustid("");
		}
		if(vo.getDpricredit() != null ) {
			dsEntity.setDpricredit(vo.getDpricredit());
		} else {
			dsEntity.setDpricredit(0l);
		}
		if(vo.getDseccredit() != null ) {
			dsEntity.setDseccredit(vo.getDseccredit());
		} else {
			dsEntity.setDseccredit(0l);
		}
	}
	
	public void updateCdact01dDelerrwinFromDelerrwin(final Cdact01rContext ctx, final ExecutionController ctrl, Delerrwin dsEntity, Cdact01dDelerrwin vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getActid() != null ) {
			vo.setActid(dsEntity.getActid());
		}

		if(dsEntity.getErrdelw() != null ) {
			vo.setErrdelw(dsEntity.getErrdelw());
		}

		if(dsEntity.getDpricustid() != null ) {
			vo.setDpricustid(dsEntity.getDpricustid());
		}

		if(dsEntity.getDseccustid() != null ) {
			vo.setDseccustid(dsEntity.getDseccustid());
		}

		try {
			vo.setDpricredit(dsEntity.getDpricredit());
		} catch (Exception e) {
			vo.getDpricreditField().setValue(StringUtils.removeSign(dsEntity.getDpricreditReference().getValue(String.class)));
		}
		vo.getDpricreditField().setNumerical(true);

		try {
			vo.setDseccredit(dsEntity.getDseccredit());
		} catch (Exception e) {
			vo.getDseccreditField().setValue(StringUtils.removeSign(dsEntity.getDseccreditReference().getValue(String.class)));
		}
		vo.getDseccreditField().setNumerical(true);

	}
	
	public void applyCdact01dDelerrwinMiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dDelerrwin vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(4);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(2);
		vo.setHeight(15);
		vo.setWidth(74);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.RED);
		vo.setBorderHilight(HilightMode.REVERSE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.setLabelEditAccount("Edit Account");
		vo.getLabelEditAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelEditAccountField().setColor(ColorMode.WHITE);
		vo.getLabelEditAccountField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn32Reference(), "1") == 0)) {
			vo.getLabelEditAccountField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelInactivateAccount("Inactivate Account");
		vo.getLabelInactivateAccountField().setProtection(ProtectionMode.PROT);
		vo.getLabelInactivateAccountField().setColor(ColorMode.WHITE);
		vo.getLabelInactivateAccountField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn32Reference(), "1") != 0)) {
			vo.getLabelInactivateAccountField().setIntensity(IntensityMode.DRK);
		}
		vo.getActidField().setProtection(ProtectionMode.PROT);
		vo.getActidField().setColor(ColorMode.WHITE);
		vo.getErrdelwField().setProtection(ProtectionMode.PROT);
		vo.getErrdelwField().setColor(ColorMode.RED);
		vo.getErrdelwField().setHilight(HilightMode.BLINK);
		vo.setLabelPrimaryCustId("Primary Cust ID   :");
		vo.getLabelPrimaryCustIdField().setProtection(ProtectionMode.PROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getLabelPrimaryCustIdField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelSecondaryCustId("Secondary Cust ID :");
		vo.getLabelSecondaryCustIdField().setProtection(ProtectionMode.PROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getLabelSecondaryCustIdField().setIntensity(IntensityMode.DRK);
		}
		vo.getDpricustidField().setProtection(ProtectionMode.PROT);
		vo.getDpricustidField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getDpricustidField().setIntensity(IntensityMode.DRK);
		}
		vo.getDseccustidField().setProtection(ProtectionMode.PROT);
		vo.getDseccustidField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getDseccustidField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelCreditCardSH("Credit Card#:");
		vo.getLabelCreditCardSHField().setProtection(ProtectionMode.PROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getLabelCreditCardSHField().setIntensity(IntensityMode.DRK);
		}
		vo.getDpricreditField().setProtection(ProtectionMode.PROT);
		vo.getDpricreditField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getDpricreditField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelCreditCardSH1("Credit Card#:");
		vo.getLabelCreditCardSH1Field().setProtection(ProtectionMode.PROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getLabelCreditCardSH1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getDseccreditField().setProtection(ProtectionMode.PROT);
		vo.getDseccreditField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0) {
			vo.getDseccreditField().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void updateCdact01dMsgsflFromMsgsfl(final Cdact01rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdact01dMsgsfl vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getSflmsgkey() != null ) {
			vo.setSflmsgkey(dsEntity.getSflmsgkey());
		}

		if(dsEntity.getPgmq() != null ) {
			vo.setPgmq(dsEntity.getPgmq());
		}

	}
	
	public void applyCdact01dMsgsflMiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdact01dMsgsflcFromMsgsflc(final Cdact01rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdact01dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmq() != null ) {
			vo.setPgmq(dsEntity.getPgmq());
		}

	}
	
	public void applyCdact01dMsgsflcMiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dMsgsflc vo){
		vo.setDspMode("*DS3");
		vo.getMsgsflField().setDspMode("*DS3");
		vo.getMsgsflField().setMessageSubfile();
		vo.setOverlay(true);
		vo.getMsgsflField().setSize(1);
		vo.getMsgsflField().setNumberOfRecordsPerPage(1);
		vo.getMsgsflField().display(true);
		vo.getMsgsflField().displayControl(true);
		vo.getMsgsflField().initializeRecord(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdact01dEmptyMiscOut(final Cdact01rContext ctx, final ExecutionController ctrl, Cdact01dEmpty vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") != 0) {
			vo.activateFKeys("09");
		}
		else {
			vo.deactivateFKeys("09");
		}
	}
	

}
