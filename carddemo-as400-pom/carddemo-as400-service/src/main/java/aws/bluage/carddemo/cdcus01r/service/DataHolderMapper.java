package aws.bluage.carddemo.cdcus01r.service;

import aws.bluage.carddemo.cdcus01r.business.context.Cdcus01rContext;
import aws.bluage.carddemo.cdcus01r.business.model.Ctl1;
import aws.bluage.carddemo.cdcus01r.business.model.Delerrwin;
import aws.bluage.carddemo.cdcus01r.business.model.Delwin;
import aws.bluage.carddemo.cdcus01r.business.model.Header1;
import aws.bluage.carddemo.cdcus01r.business.model.Header2;
import aws.bluage.carddemo.cdcus01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdcus01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdcus01r.business.model.Sfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dDelerrwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dDelwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dSfl1;
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
	
	public void updateCdcus01dHeader1FromHeader1(final Cdcus01rContext ctx, final ExecutionController ctrl, Header1 dsEntity, Cdcus01dHeader1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmname() != null ) {
			vo.setPgmname(dsEntity.getDpgmname());
		}

	}
	
	public void applyCdcus01dHeader1MiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dHeader1 vo){
		vo.setDspMode("*DS3");
		vo.setLabelCustomerMainScreen("Customer Main Screen");
		vo.getLabelCustomerMainScreenField().setProtection(ProtectionMode.PROT);
		vo.getLabelCustomerMainScreenField().setHilight(HilightMode.REVERSE);
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
	}
	
	public void applyCdcus01dHeader2MiscIn(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dHeader2 vo){
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
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
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
			case "PAGEDOWN": {
				ctx.getIndicatorsGroup().setIn25("1");
				break;
			}
			case "PAGEUP": {
				ctx.getIndicatorsGroup().setIn26("1");
				break;
			}
		}
	}
	
	public void updateHeader2FromCdcus01dHeader2(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dHeader2 vo, Header2 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getPosition() != null ) {
			dsEntity.setDposition(vo.getPosition());
		} else {
			dsEntity.setDposition("");
		}
	}
	
	public void updateCdcus01dHeader2FromHeader2(final Cdcus01rContext ctx, final ExecutionController ctrl, Header2 dsEntity, Cdcus01dHeader2 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDposition() != null ) {
			vo.setPosition(dsEntity.getDposition());
		}

	}
	
	public void applyCdcus01dHeader2MiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dHeader2 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
		vo.setLabel("?");
		vo.getLabelField().setProtection(ProtectionMode.PROT);
		vo.getLabelField().setColor(ColorMode.BLUE);
		vo.getLabelField().setUnderline(true);
		vo.setLabelCustomerId("Customer ID");
		vo.getLabelCustomerIdField().setProtection(ProtectionMode.PROT);
		vo.getLabelCustomerIdField().setColor(ColorMode.BLUE);
		vo.getLabelCustomerIdField().setUnderline(true);
		vo.setLabelFirstName("First Name");
		vo.getLabelFirstNameField().setProtection(ProtectionMode.PROT);
		vo.getLabelFirstNameField().setColor(ColorMode.BLUE);
		vo.getLabelFirstNameField().setUnderline(true);
		vo.setLabelLastName("Last Name");
		vo.getLabelLastNameField().setProtection(ProtectionMode.PROT);
		vo.getLabelLastNameField().setColor(ColorMode.BLUE);
		vo.getLabelLastNameField().setUnderline(true);
		vo.getPositionField().setProtection(ProtectionMode.UNPROT);
		vo.getPositionField().setUnderline(true);
		vo.getPositionField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getPositionField().setHilight(HilightMode.REVERSE);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getPositionField().setIc(true);
		}
	}
	
	public void updateSfl1FromCdcus01dSfl1(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dSfl1 vo, Sfl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getOption() != null ) {
			dsEntity.setDoption(vo.getOption());
		} else {
			dsEntity.setDoption("");
		}
		if(vo.getCustid() != null ) {
			dsEntity.setDcustid(vo.getCustid());
		} else {
			dsEntity.setDcustid("");
		}
		if(vo.getFirstname() != null ) {
			dsEntity.setDfirstname(vo.getFirstname());
		} else {
			dsEntity.setDfirstname("");
		}
		if(vo.getLastname() != null ) {
			dsEntity.setDlastname(vo.getLastname());
		} else {
			dsEntity.setDlastname("");
		}
	}
	
	public void updateCdcus01dSfl1FromSfl1(final Cdcus01rContext ctx, final ExecutionController ctrl, Sfl1 dsEntity, Cdcus01dSfl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDoption() != null ) {
			vo.setOption(dsEntity.getDoption());
		}

		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

		if(dsEntity.getDfirstname() != null ) {
			vo.setFirstname(dsEntity.getDfirstname());
		}

		if(dsEntity.getDlastname() != null ) {
			vo.setLastname(dsEntity.getDlastname());
		}

	}
	
	public void applyCdcus01dSfl1MiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dSfl1 vo){
		vo.getOptionField().setProtection(ProtectionMode.UNPROT);
		vo.getOptionField().setUnderline(true);
		vo.getOptionField().loadCheckMessage("ERR0001","CDMSGF01");
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getFirstnameField().setProtection(ProtectionMode.PROT);
		vo.getLastnameField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdcus01dCtl1MiscIn(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dCtl1 vo){
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
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
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
			case "PAGEDOWN": {
				ctx.getIndicatorsGroup().setIn25("1");
				break;
			}
			case "PAGEUP": {
				ctx.getIndicatorsGroup().setIn26("1");
				break;
			}
		}
	}
	
	public void updateCtl1FromCdcus01dCtl1(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dCtl1 vo, Ctl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getRow() != null ) {
			dsEntity.setDrow(vo.getRow());
		} else {
			dsEntity.setDrow(0);
		}
		if(vo.getCol() != null ) {
			dsEntity.setDcol(vo.getCol());
		} else {
			dsEntity.setDcol(0);
		}
		if(vo.getSflrrn() != null ) {
			dsEntity.setDsflrrn(vo.getSflrrn());
		} else {
			dsEntity.setDsflrrn(0);
		}
	}
	
	public void updateCdcus01dCtl1FromCtl1(final Cdcus01rContext ctx, final ExecutionController ctrl, Ctl1 dsEntity, Cdcus01dCtl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setRow(dsEntity.getDrow());
		} catch (Exception e) {
			vo.getRowField().setValue(StringUtils.removeSign(dsEntity.getDrowReference().getValue(String.class)));
		}
		vo.getRowField().setNumerical(true);

		try {
			vo.setCol(dsEntity.getDcol());
		} catch (Exception e) {
			vo.getColField().setValue(StringUtils.removeSign(dsEntity.getDcolReference().getValue(String.class)));
		}
		vo.getColField().setNumerical(true);

		try {
			vo.setSflrrn(dsEntity.getDsflrrn());
		} catch (Exception e) {
			vo.getSflrrnField().setValue(StringUtils.removeSign(dsEntity.getDsflrrnReference().getValue(String.class)));
		}
		vo.getSflrrnField().setNumerical(true);

	}
	
	public void applyCdcus01dCtl1MiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dCtl1 vo){
		vo.setDspMode("*DS3");
		vo.getSfl1Field().setDspMode("*DS3");
		vo.setOverlay(true);
		vo.getSfl1Field().setSize(13);
		vo.getSfl1Field().setNumberOfRecordsPerPage(13);
		vo.getSfl1Field().display(DataUtils.compare(ctx.getIndicatorsGroup().getIn30Reference(), "1") != 0);
		vo.getSfl1Field().displayControl(true);
		vo.getSfl1Field().initializeRecord(DataUtils.compare(ctx.getIndicatorsGroup().getIn31Reference(), "1") == 0);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn30Reference(), "1") == 0) {
			vo.getSfl1Field().subfileClear();
		}
		vo.getSfl1Field().setPageDown(PageDownMode.PLUS);
		vo.getSfl1Field().setEnd(false);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn33Reference(), "1") == 0) {
			vo.getSfl1Field().setEnd(true);
		}
		vo.setCursorLine(vo.getRow());
		vo.setCursorColumn(vo.getCol());

		vo.getRowField().setIntensity(IntensityMode.DRK);
		vo.getRowField().setProtection(ProtectionMode.PROT);
		vo.getColField().setIntensity(IntensityMode.DRK);
		vo.getColField().setProtection(ProtectionMode.PROT);
		vo.getSflrrnField().setIntensity(IntensityMode.DRK);
		vo.getSflrrnField().setProtection(ProtectionMode.PROT);
		vo.getSfl1Field().setRecordNumber(vo.getSflrrn());
		vo.getSfl1Field().setRecordNumberCursor(true);
	}
	
	public void applyCdcus01dFooterMiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dFooter vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
	}
	
	public void applyCdcus01dDelwinMiscIn(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dDelwin vo){
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
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
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
			case "PAGEDOWN": {
				ctx.getIndicatorsGroup().setIn25("1");
				break;
			}
			case "PAGEUP": {
				ctx.getIndicatorsGroup().setIn26("1");
				break;
			}
		}
	}
	
	public void updateDelwinFromCdcus01dDelwin(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dDelwin vo, Delwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCustid() != null ) {
			dsEntity.setDcustid(vo.getCustid());
		} else {
			dsEntity.setDcustid("");
		}
	}
	
	public void updateCdcus01dDelwinFromDelwin(final Cdcus01rContext ctx, final ExecutionController ctrl, Delwin dsEntity, Cdcus01dDelwin vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

	}
	
	public void applyCdcus01dDelwinMiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dDelwin vo){
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
		vo.setLabelDeleteCustomer("Delete Customer");
		vo.getLabelDeleteCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelDeleteCustomerField().setColor(ColorMode.WHITE);
		vo.getLabelDeleteCustomerField().setHilight(HilightMode.REVERSE);
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getCustidField().setColor(ColorMode.WHITE);
	}
	
	public void applyCdcus01dDelerrwinMiscIn(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dDelerrwin vo){
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
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
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
			case "PAGEDOWN": {
				ctx.getIndicatorsGroup().setIn25("1");
				break;
			}
			case "PAGEUP": {
				ctx.getIndicatorsGroup().setIn26("1");
				break;
			}
		}
	}
	
	public void updateDelerrwinFromCdcus01dDelerrwin(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dDelerrwin vo, Delerrwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCustid() != null ) {
			dsEntity.setDcustid(vo.getCustid());
		} else {
			dsEntity.setDcustid("");
		}
		if(vo.getActid() != null ) {
			dsEntity.setDactid(vo.getActid());
		} else {
			dsEntity.setDactid("");
		}
		if(vo.getErrdelw() != null ) {
			dsEntity.setDerrdelw(vo.getErrdelw());
		} else {
			dsEntity.setDerrdelw("");
		}
	}
	
	public void updateCdcus01dDelerrwinFromDelerrwin(final Cdcus01rContext ctx, final ExecutionController ctrl, Delerrwin dsEntity, Cdcus01dDelerrwin vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

		if(dsEntity.getDactid() != null ) {
			vo.setActid(dsEntity.getDactid());
		}

		if(dsEntity.getDerrdelw() != null ) {
			vo.setErrdelw(dsEntity.getDerrdelw());
		}

	}
	
	public void applyCdcus01dDelerrwinMiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dDelerrwin vo){
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
		vo.setLabelDeleteCustomer("Delete Customer");
		vo.getLabelDeleteCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelDeleteCustomerField().setColor(ColorMode.WHITE);
		vo.getLabelDeleteCustomerField().setHilight(HilightMode.REVERSE);
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getCustidField().setColor(ColorMode.WHITE);
		vo.getActidField().setProtection(ProtectionMode.PROT);
		vo.getActidField().setColor(ColorMode.WHITE);
		vo.getErrdelwField().setProtection(ProtectionMode.PROT);
		vo.getErrdelwField().setColor(ColorMode.RED);
		vo.getErrdelwField().setHilight(HilightMode.BLINK);
		vo.setErrdelw(MessageRegistry.getMessage("ERR0064","CDMSGF01"));
	}
	
	public void updateCdcus01dMsgsflFromMsgsfl(final Cdcus01rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdcus01dMsgsfl vo){
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
	
	public void applyCdcus01dMsgsflMiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdcus01dMsgsflcFromMsgsflc(final Cdcus01rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdcus01dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdcus01dMsgsflcMiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dMsgsflc vo){
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
	
	public void applyCdcus01dEmptyMiscOut(final Cdcus01rContext ctx, final ExecutionController ctrl, Cdcus01dEmpty vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
	}
	

}
