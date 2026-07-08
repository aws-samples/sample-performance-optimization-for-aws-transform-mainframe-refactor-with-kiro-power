package aws.bluage.carddemo.cdccm01r.service;

import aws.bluage.carddemo.cdccm01r.business.context.Cdccm01rContext;
import aws.bluage.carddemo.cdccm01r.business.model.Ctl1;
import aws.bluage.carddemo.cdccm01r.business.model.Delerrwin;
import aws.bluage.carddemo.cdccm01r.business.model.Delwin;
import aws.bluage.carddemo.cdccm01r.business.model.Header1;
import aws.bluage.carddemo.cdccm01r.business.model.Header2;
import aws.bluage.carddemo.cdccm01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdccm01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdccm01r.business.model.Sfl1;
import aws.bluage.carddemo.cdccm01r.business.model.Statuswin;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dDelerrwin;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dDelwin;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dSfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dStatuswin;
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
	
	public void updateCdccm01dHeader1FromHeader1(final Cdccm01rContext ctx, final ExecutionController ctrl, Header1 dsEntity, Cdccm01dHeader1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmname() != null ) {
			vo.setPgmname(dsEntity.getDpgmname());
		}

	}
	
	public void applyCdccm01dHeader1MiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dHeader1 vo){
		vo.setDspMode("*DS3");
		vo.setLabelCreditCardMainScreen("Credit Card Main Screen");
		vo.getLabelCreditCardMainScreenField().setProtection(ProtectionMode.PROT);
		vo.getLabelCreditCardMainScreenField().setHilight(HilightMode.REVERSE);
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
	}
	
	public void applyCdccm01dHeader2MiscIn(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dHeader2 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
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
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
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
	
	public void updateHeader2FromCdccm01dHeader2(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dHeader2 vo, Header2 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getPosition() != null ) {
			dsEntity.setDposition(vo.getPosition());
		} else {
			dsEntity.setDposition("");
		}
	}
	
	public void updateCdccm01dHeader2FromHeader2(final Cdccm01rContext ctx, final ExecutionController ctrl, Header2 dsEntity, Cdccm01dHeader2 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDposition() != null ) {
			vo.setPosition(dsEntity.getDposition());
		}

	}
	
	public void applyCdccm01dHeader2MiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dHeader2 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
		vo.setLabel("?");
		vo.getLabelField().setProtection(ProtectionMode.PROT);
		vo.getLabelField().setColor(ColorMode.BLUE);
		vo.getLabelField().setUnderline(true);
		vo.setLabelCreditCardNumber("Credit Card Number");
		vo.getLabelCreditCardNumberField().setProtection(ProtectionMode.PROT);
		vo.getLabelCreditCardNumberField().setColor(ColorMode.BLUE);
		vo.getLabelCreditCardNumberField().setUnderline(true);
		vo.setLabelCustomerId("Customer ID");
		vo.getLabelCustomerIdField().setProtection(ProtectionMode.PROT);
		vo.getLabelCustomerIdField().setColor(ColorMode.BLUE);
		vo.getLabelCustomerIdField().setUnderline(true);
		vo.setLabelAccountNumber("Account Number");
		vo.getLabelAccountNumberField().setProtection(ProtectionMode.PROT);
		vo.getLabelAccountNumberField().setColor(ColorMode.BLUE);
		vo.getLabelAccountNumberField().setUnderline(true);
		vo.setLabelPrimSec("Prim/Sec");
		vo.getLabelPrimSecField().setProtection(ProtectionMode.PROT);
		vo.getLabelPrimSecField().setColor(ColorMode.BLUE);
		vo.getLabelPrimSecField().setUnderline(true);
		vo.setLabelStatus("Status");
		vo.getLabelStatusField().setProtection(ProtectionMode.PROT);
		vo.getLabelStatusField().setColor(ColorMode.BLUE);
		vo.getLabelStatusField().setUnderline(true);
		vo.getPositionField().setProtection(ProtectionMode.UNPROT);
		vo.getPositionField().setUnderline(true);
		vo.getPositionField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getPositionField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getPositionField().setHilight(HilightMode.REVERSE);
		}
	}
	
	public void updateSfl1FromCdccm01dSfl1(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dSfl1 vo, Sfl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getOption() != null ) {
			dsEntity.setDoption(vo.getOption());
		} else {
			dsEntity.setDoption("");
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
	}
	
	public void updateCdccm01dSfl1FromSfl1(final Cdccm01rContext ctx, final ExecutionController ctrl, Sfl1 dsEntity, Cdccm01dSfl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDoption() != null ) {
			vo.setOption(dsEntity.getDoption());
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

		if(dsEntity.getDprimarysec() != null ) {
			vo.setPrimarysec(dsEntity.getDprimarysec());
		}

		if(dsEntity.getDstatus() != null ) {
			vo.setStatus(dsEntity.getDstatus());
		}

	}
	
	public void applyCdccm01dSfl1MiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dSfl1 vo){
		vo.getOptionField().setProtection(ProtectionMode.UNPROT);
		vo.getOptionField().setUnderline(true);
		vo.getOptionField().loadCheckMessage("ERR0001","CDMSGF01");
		vo.getCardnumField().setProtection(ProtectionMode.PROT);
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getAcctnumField().setProtection(ProtectionMode.PROT);
		vo.getPrimarysecField().setProtection(ProtectionMode.PROT);
		vo.getStatusField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdccm01dCtl1MiscIn(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dCtl1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
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
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
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
	
	public void updateCtl1FromCdccm01dCtl1(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dCtl1 vo, Ctl1 dsEntity){
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
	
	public void updateCdccm01dCtl1FromCtl1(final Cdccm01rContext ctx, final ExecutionController ctrl, Ctl1 dsEntity, Cdccm01dCtl1 vo){
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
	
	public void applyCdccm01dCtl1MiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dCtl1 vo){
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
	
	public void applyCdccm01dFooterMiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dFooter vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
	}
	
	public void applyCdccm01dDelwinMiscIn(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dDelwin vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
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
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
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
	
	public void updateDelwinFromCdccm01dDelwin(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dDelwin vo, Delwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCardnum() != null ) {
			dsEntity.setDcardnum(vo.getCardnum());
		} else {
			dsEntity.setDcardnum(0l);
		}
		if(vo.getStatus() != null ) {
			dsEntity.setDstatus(vo.getStatus());
		} else {
			dsEntity.setDstatus("");
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
	}
	
	public void updateCdccm01dDelwinFromDelwin(final Cdccm01rContext ctx, final ExecutionController ctrl, Delwin dsEntity, Cdccm01dDelwin vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setCardnum(dsEntity.getDcardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getDcardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

		if(dsEntity.getDstatus() != null ) {
			vo.setStatus(dsEntity.getDstatus());
		}

		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

		if(dsEntity.getDacctnum() != null ) {
			vo.setAcctnum(dsEntity.getDacctnum());
		}

	}
	
	public void applyCdccm01dDelwinMiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dDelwin vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(4);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(2);
		vo.setHeight(15);
		vo.setWidth(74);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.RED);
		vo.setBorderTop("true");
		vo.setTitleTop("Deactivate Card");
		vo.setTitleColorTop(ColorMode.GREEN);
		vo.getCardnumField().setProtection(ProtectionMode.PROT);
		vo.getCardnumField().setColor(ColorMode.WHITE);
		vo.getStatusField().setProtection(ProtectionMode.PROT);
		vo.getStatusField().setColor(ColorMode.WHITE);
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getCustidField().setColor(ColorMode.WHITE);
		vo.getAcctnumField().setProtection(ProtectionMode.PROT);
		vo.getAcctnumField().setColor(ColorMode.WHITE);
	}
	
	public void applyCdccm01dDelerrwinMiscIn(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dDelerrwin vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
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
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
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
	
	public void updateDelerrwinFromCdccm01dDelerrwin(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dDelerrwin vo, Delerrwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCardnum() != null ) {
			dsEntity.setDcardnum(vo.getCardnum());
		} else {
			dsEntity.setDcardnum(0l);
		}
		if(vo.getStatus() != null ) {
			dsEntity.setDstatus(vo.getStatus());
		} else {
			dsEntity.setDstatus("");
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
		if(vo.getErrdelw() != null ) {
			dsEntity.setDerrdelw(vo.getErrdelw());
		} else {
			dsEntity.setDerrdelw("");
		}
	}
	
	public void updateCdccm01dDelerrwinFromDelerrwin(final Cdccm01rContext ctx, final ExecutionController ctrl, Delerrwin dsEntity, Cdccm01dDelerrwin vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setCardnum(dsEntity.getDcardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getDcardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

		if(dsEntity.getDstatus() != null ) {
			vo.setStatus(dsEntity.getDstatus());
		}

		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

		if(dsEntity.getDacctnum() != null ) {
			vo.setAcctnum(dsEntity.getDacctnum());
		}

		if(dsEntity.getDerrdelw() != null ) {
			vo.setErrdelw(dsEntity.getDerrdelw());
		}

	}
	
	public void applyCdccm01dDelerrwinMiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dDelerrwin vo){
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
		vo.setBorderTop("true");
		vo.setTitleTop("Deactivate Card");
		vo.setTitleColorTop(ColorMode.GREEN);
		vo.getCardnumField().setProtection(ProtectionMode.PROT);
		vo.getCardnumField().setColor(ColorMode.WHITE);
		vo.getStatusField().setProtection(ProtectionMode.PROT);
		vo.getStatusField().setColor(ColorMode.WHITE);
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getCustidField().setColor(ColorMode.WHITE);
		vo.getAcctnumField().setProtection(ProtectionMode.PROT);
		vo.getAcctnumField().setColor(ColorMode.WHITE);
		vo.getErrdelwField().setProtection(ProtectionMode.PROT);
		vo.getErrdelwField().setColor(ColorMode.RED);
		vo.getErrdelwField().setHilight(HilightMode.BLINK);
		vo.setErrdelw(MessageRegistry.getMessage("ERR0068","CDMSGF01"));
	}
	
	public void applyCdccm01dStatuswinMiscIn(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dStatuswin vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
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
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
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
	
	public void updateStatuswinFromCdccm01dStatuswin(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dStatuswin vo, Statuswin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCardnum() != null ) {
			dsEntity.setDcardnum(vo.getCardnum());
		} else {
			dsEntity.setDcardnum(0l);
		}
		if(vo.getStatus() != null ) {
			dsEntity.setDstatus(vo.getStatus());
		} else {
			dsEntity.setDstatus("");
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
		if(vo.getUpdatetype() != null ) {
			dsEntity.setDupdatetype(vo.getUpdatetype());
		} else {
			dsEntity.setDupdatetype("");
		}
	}
	
	public void updateCdccm01dStatuswinFromStatuswin(final Cdccm01rContext ctx, final ExecutionController ctrl, Statuswin dsEntity, Cdccm01dStatuswin vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setCardnum(dsEntity.getDcardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getDcardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

		if(dsEntity.getDstatus() != null ) {
			vo.setStatus(dsEntity.getDstatus());
		}

		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

		if(dsEntity.getDacctnum() != null ) {
			vo.setAcctnum(dsEntity.getDacctnum());
		}

		if(dsEntity.getDupdatetype() != null ) {
			vo.setUpdatetype(dsEntity.getDupdatetype());
		}

	}
	
	public void applyCdccm01dStatuswinMiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dStatuswin vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(4);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(2);
		vo.setHeight(15);
		vo.setWidth(74);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.BLUE);
		vo.setBorderTop("true");
		vo.setTitleTop("Update Card Status");
		vo.setTitleColorTop(ColorMode.GREEN);
		vo.getCardnumField().setProtection(ProtectionMode.PROT);
		vo.getCardnumField().setColor(ColorMode.WHITE);
		vo.getStatusField().setProtection(ProtectionMode.PROT);
		vo.getStatusField().setColor(ColorMode.WHITE);
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getCustidField().setColor(ColorMode.WHITE);
		vo.getAcctnumField().setProtection(ProtectionMode.PROT);
		vo.getAcctnumField().setColor(ColorMode.WHITE);
		vo.getUpdatetypeField().setProtection(ProtectionMode.PROT);
		vo.getUpdatetypeField().setColor(ColorMode.WHITE);
	}
	
	public void updateCdccm01dMsgsflFromMsgsfl(final Cdccm01rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdccm01dMsgsfl vo){
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
	
	public void applyCdccm01dMsgsflMiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdccm01dMsgsflcFromMsgsflc(final Cdccm01rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdccm01dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdccm01dMsgsflcMiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dMsgsflc vo){
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
	
	public void applyCdccm01dEmptyMiscOut(final Cdccm01rContext ctx, final ExecutionController ctrl, Cdccm01dEmpty vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
	}
	

}
