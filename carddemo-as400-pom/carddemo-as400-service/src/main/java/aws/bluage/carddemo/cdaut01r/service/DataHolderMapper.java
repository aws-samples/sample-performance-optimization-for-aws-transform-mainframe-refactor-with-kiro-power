package aws.bluage.carddemo.cdaut01r.service;

import aws.bluage.carddemo.cdaut01r.business.context.Cdaut01rContext;
import aws.bluage.carddemo.cdaut01r.business.model.Ctl1;
import aws.bluage.carddemo.cdaut01r.business.model.Footer;
import aws.bluage.carddemo.cdaut01r.business.model.Header1;
import aws.bluage.carddemo.cdaut01r.business.model.Header2;
import aws.bluage.carddemo.cdaut01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdaut01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdaut01r.business.model.Sfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dSfl1;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
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
	
	public void updateCdaut01dHeader1FromHeader1(final Cdaut01rContext ctx, final ExecutionController ctrl, Header1 dsEntity, Cdaut01dHeader1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmname() != null ) {
			vo.setPgmname(dsEntity.getPgmname());
		}

	}
	
	public void applyCdaut01dHeader1MiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dHeader1 vo){
		vo.setDspMode("*DS4");
		vo.setLabelAuthorizationMainScreen("Authorization Main Screen");
		vo.getLabelAuthorizationMainScreenField().setProtection(ProtectionMode.PROT);
		vo.getLabelAuthorizationMainScreenField().setHilight(HilightMode.REVERSE);
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
	}
	
	public void applyCdaut01dHeader2MiscIn(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dHeader2 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		switch (vo.getAttentionKey()) {
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
			case "5": {
				ctx.getFkeyIndicatorsGroup().setInKE("1");
				ctx.getIndicatorsGroup().setIn05("1");
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
	
	public void updateHeader2FromCdaut01dHeader2(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dHeader2 vo, Header2 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getPosition() != null ) {
			dsEntity.setPosition(vo.getPosition());
		} else {
			dsEntity.setPosition(0l);
		}
	}
	
	public void updateCdaut01dHeader2FromHeader2(final Cdaut01rContext ctx, final ExecutionController ctrl, Header2 dsEntity, Cdaut01dHeader2 vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setPosition(dsEntity.getPosition());
		} catch (Exception e) {
			vo.getPositionField().setValue(StringUtils.removeSign(dsEntity.getPositionReference().getValue(String.class)));
		}
		vo.getPositionField().setNumerical(true);

	}
	
	public void applyCdaut01dHeader2MiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dHeader2 vo){
		vo.setDspMode("*DS4");
		vo.setOverlay(true);
		vo.setLabelAuthorizationId("Authorization ID");
		vo.getLabelAuthorizationIdField().setProtection(ProtectionMode.PROT);
		vo.getLabelAuthorizationIdField().setColor(ColorMode.BLUE);
		vo.getLabelAuthorizationIdField().setUnderline(true);
		vo.setLabelTransactionId("Transaction ID");
		vo.getLabelTransactionIdField().setProtection(ProtectionMode.PROT);
		vo.getLabelTransactionIdField().setColor(ColorMode.BLUE);
		vo.getLabelTransactionIdField().setUnderline(true);
		vo.setLabelCreditCardNumber("Credit Card Number");
		vo.getLabelCreditCardNumberField().setProtection(ProtectionMode.PROT);
		vo.getLabelCreditCardNumberField().setColor(ColorMode.BLUE);
		vo.getLabelCreditCardNumberField().setUnderline(true);
		vo.setLabelResponseReason("Response Reason");
		vo.getLabelResponseReasonField().setProtection(ProtectionMode.PROT);
		vo.getLabelResponseReasonField().setColor(ColorMode.BLUE);
		vo.getLabelResponseReasonField().setUnderline(true);
		vo.setLabelFraudFlag("Fraud Flag");
		vo.getLabelFraudFlagField().setProtection(ProtectionMode.PROT);
		vo.getLabelFraudFlagField().setColor(ColorMode.BLUE);
		vo.getLabelFraudFlagField().setUnderline(true);
		vo.setLabelAuthDate("Auth Date");
		vo.getLabelAuthDateField().setProtection(ProtectionMode.PROT);
		vo.getLabelAuthDateField().setColor(ColorMode.BLUE);
		vo.getLabelAuthDateField().setUnderline(true);
		vo.setLabelAuthTime("Auth Time");
		vo.getLabelAuthTimeField().setProtection(ProtectionMode.PROT);
		vo.getLabelAuthTimeField().setColor(ColorMode.BLUE);
		vo.getLabelAuthTimeField().setUnderline(true);
		vo.getPositionField().setProtection(ProtectionMode.UNPROT);
		vo.getPositionField().setUnderline(true);
		vo.getPositionField().setColor(ColorMode.WHITE);
	}
	
	public void updateCdaut01dSfl1FromSfl1(final Cdaut01rContext ctx, final ExecutionController ctrl, Sfl1 dsEntity, Cdaut01dSfl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setAuthid(dsEntity.getAuthid());
		} catch (Exception e) {
			vo.getAuthidField().setValue(StringUtils.removeSign(dsEntity.getAuthidReference().getValue(String.class)));
		}
		vo.getAuthidField().setNumerical(true);

		try {
			vo.setTrnid(dsEntity.getTrnid());
		} catch (Exception e) {
			vo.getTrnidField().setValue(StringUtils.removeSign(dsEntity.getTrnidReference().getValue(String.class)));
		}
		vo.getTrnidField().setNumerical(true);

		try {
			vo.setCardnum(dsEntity.getCardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getCardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

		if(dsEntity.getRspreason() != null ) {
			vo.setRspreason(dsEntity.getRspreason());
		}

		if(dsEntity.getFraudflag() != null ) {
			vo.setFraudflag(dsEntity.getFraudflag());
		}

		if(dsEntity.getAuthdate() != null ) {
			vo.setAuthdate(dsEntity.getAuthdate());
		}

		if(dsEntity.getAuthtime() != null ) {
			vo.setAuthtime(dsEntity.getAuthtime());
		}

	}
	
	public void applyCdaut01dSfl1MiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dSfl1 vo){
		vo.getAuthidField().setProtection(ProtectionMode.PROT);
		vo.getTrnidField().setProtection(ProtectionMode.PROT);
		vo.getTrnidField().setColor(ColorMode.PINK);
		vo.getCardnumField().setProtection(ProtectionMode.PROT);
		vo.getCardnumField().setColor(ColorMode.PINK);
		vo.getRspreasonField().setProtection(ProtectionMode.PROT);
		vo.getFraudflagField().setProtection(ProtectionMode.PROT);
		vo.getAuthdateField().setProtection(ProtectionMode.PROT);
		vo.getAuthtimeField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdaut01dCtl1MiscIn(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dCtl1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		switch (vo.getAttentionKey()) {
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
			case "5": {
				ctx.getFkeyIndicatorsGroup().setInKE("1");
				ctx.getIndicatorsGroup().setIn05("1");
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
		vo.setCsrrec(vo.getCursorRecordName());
		vo.setCsrfld(vo.getCursorFieldName());
		vo.setCsrpos(vo.getCursorPosition());
	}
	
	public void updateCtl1FromCdaut01dCtl1(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dCtl1 vo, Ctl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getRow() != null ) {
			dsEntity.setRow(vo.getRow());
		} else {
			dsEntity.setRow(0);
		}
		if(vo.getCol() != null ) {
			dsEntity.setCol(vo.getCol());
		} else {
			dsEntity.setCol(0);
		}
		if(vo.getCsrrec() != null ) {
			dsEntity.setCsrrec(vo.getCsrrec());
		} else {
			dsEntity.setCsrrec("");
		}
		if(vo.getCsrfld() != null ) {
			dsEntity.setCsrfld(vo.getCsrfld());
		} else {
			dsEntity.setCsrfld("");
		}
		if(vo.getCsrpos() != null ) {
			dsEntity.setCsrpos(vo.getCsrpos());
		} else {
			dsEntity.setCsrpos(0);
		}
		if(vo.getSflrrn() != null ) {
			dsEntity.setSflrrn(vo.getSflrrn());
		} else {
			dsEntity.setSflrrn(0);
		}
	}
	
	public void updateCdaut01dCtl1FromCtl1(final Cdaut01rContext ctx, final ExecutionController ctrl, Ctl1 dsEntity, Cdaut01dCtl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setRow(dsEntity.getRow());
		} catch (Exception e) {
			vo.getRowField().setValue(StringUtils.removeSign(dsEntity.getRowReference().getValue(String.class)));
		}
		vo.getRowField().setNumerical(true);

		try {
			vo.setCol(dsEntity.getCol());
		} catch (Exception e) {
			vo.getColField().setValue(StringUtils.removeSign(dsEntity.getColReference().getValue(String.class)));
		}
		vo.getColField().setNumerical(true);

		if(dsEntity.getCsrrec() != null ) {
			vo.setCsrrec(dsEntity.getCsrrec());
		}

		if(dsEntity.getCsrfld() != null ) {
			vo.setCsrfld(dsEntity.getCsrfld());
		}

		try {
			vo.setCsrpos(dsEntity.getCsrpos());
		} catch (Exception e) {
			vo.getCsrposField().setValue(StringUtils.removeSign(dsEntity.getCsrposReference().getValue(String.class)));
		}
		vo.getCsrposField().setNumerical(true);

		try {
			vo.setSflrrn(dsEntity.getSflrrn());
		} catch (Exception e) {
			vo.getSflrrnField().setValue(StringUtils.removeSign(dsEntity.getSflrrnReference().getValue(String.class)));
		}
		vo.getSflrrnField().setNumerical(true);

	}
	
	public void applyCdaut01dCtl1MiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dCtl1 vo){
		vo.setDspMode("*DS4");
		vo.getSfl1Field().setDspMode("*DS4");
		vo.setOverlay(true);
		vo.getSfl1Field().setSize(16);
		vo.getSfl1Field().setNumberOfRecordsPerPage(16);
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
		vo.getCsrrecField().setIntensity(IntensityMode.DRK);
		vo.getCsrrecField().setProtection(ProtectionMode.PROT);
		vo.getCsrfldField().setIntensity(IntensityMode.DRK);
		vo.getCsrfldField().setProtection(ProtectionMode.PROT);
		vo.getCsrposField().setIntensity(IntensityMode.DRK);
		vo.getCsrposField().setProtection(ProtectionMode.PROT);
		vo.getSflrrnField().setIntensity(IntensityMode.DRK);
		vo.getSflrrnField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdaut01dFooterFromFooter(final Cdaut01rContext ctx, final ExecutionController ctrl, Footer dsEntity, Cdaut01dFooter vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDashes() != null ) {
			vo.setDashes(dsEntity.getDashes());
		}

	}
	
	public void applyCdaut01dFooterMiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dFooter vo){
		vo.setDspMode("*DS4");
		vo.setOverlay(true);
		vo.getDashesField().setProtection(ProtectionMode.PROT);
		vo.getDashesField().setColor(ColorMode.WHITE);
	}
	
	public void updateCdaut01dMsgsflFromMsgsfl(final Cdaut01rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdaut01dMsgsfl vo){
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
	
	public void applyCdaut01dMsgsflMiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdaut01dMsgsflcFromMsgsflc(final Cdaut01rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdaut01dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmq() != null ) {
			vo.setPgmq(dsEntity.getPgmq());
		}

	}
	
	public void applyCdaut01dMsgsflcMiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dMsgsflc vo){
		vo.setDspMode("*DS4");
		vo.getMsgsflField().setDspMode("*DS4");
		vo.getMsgsflField().setMessageSubfile();
		vo.setOverlay(true);
		vo.getMsgsflField().setSize(2);
		vo.getMsgsflField().setNumberOfRecordsPerPage(1);
		vo.getMsgsflField().display(true);
		vo.getMsgsflField().displayControl(true);
		vo.getMsgsflField().initializeRecord(true);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdaut01dEmptyMiscOut(final Cdaut01rContext ctx, final ExecutionController ctrl, Cdaut01dEmpty vo){
		vo.setDspMode("*DS4");
		vo.setOverlay(true);
	}
	

}
