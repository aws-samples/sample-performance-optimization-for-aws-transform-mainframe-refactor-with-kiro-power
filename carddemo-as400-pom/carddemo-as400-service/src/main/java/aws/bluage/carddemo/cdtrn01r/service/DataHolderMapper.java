package aws.bluage.carddemo.cdtrn01r.service;

import aws.bluage.carddemo.cdtrn01r.business.context.Cdtrn01rContext;
import aws.bluage.carddemo.cdtrn01r.business.model.Header;
import aws.bluage.carddemo.cdtrn01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdtrn01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdtrn01r.business.model.Sfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dHeader;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dSfl1;
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
	
	public void updateHeaderFromCdtrn01dHeader(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dHeader vo, Header dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getPgmname() != null ) {
			dsEntity.setPgmname(vo.getPgmname());
		} else {
			dsEntity.setPgmname("");
		}
		if(vo.getD1posto() != null ) {
			dsEntity.setD1posto(vo.getD1posto());
		} else {
			dsEntity.setD1posto(0l);
		}
		vo.setDate1(StringUtils.replaceChars(vo.getDate1Field().getValue(String.class), "/", ""));
	}
	
	public void updateCdtrn01dHeaderFromHeader(final Cdtrn01rContext ctx, final ExecutionController ctrl, Header dsEntity, Cdtrn01dHeader vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmname() != null ) {
			vo.setPgmname(dsEntity.getPgmname());
		}

		try {
			vo.setD1posto(dsEntity.getD1posto());
		} catch (Exception e) {
			vo.getD1postoField().setValue(StringUtils.removeSign(dsEntity.getD1postoReference().getValue(String.class)));
		}
		vo.getD1postoField().setNumerical(true);

	}
	
	public void applyCdtrn01dHeaderMiscOut(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dHeader vo){
		vo.setDspMode("*DS3");
		vo.setLabelTransactionMainScreen("Transaction Main Screen");
		vo.getLabelTransactionMainScreenField().setProtection(ProtectionMode.PROT);
		vo.getLabelTransactionMainScreenField().setHilight(HilightMode.REVERSE);
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.getLabelUserField().setColor(ColorMode.BLUE);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getD1postoField().setProtection(ProtectionMode.UNPROT);
		vo.getD1postoField().setUnderline(true);
		vo.getD1postoField().setColor(ColorMode.WHITE);
		vo.setLabel("?");
		vo.getLabelField().setProtection(ProtectionMode.PROT);
		vo.getLabelField().setColor(ColorMode.BLUE);
		vo.getLabelField().setUnderline(true);
		vo.setLabelTransactionId("Transaction ID");
		vo.getLabelTransactionIdField().setProtection(ProtectionMode.PROT);
		vo.getLabelTransactionIdField().setColor(ColorMode.BLUE);
		vo.getLabelTransactionIdField().setUnderline(true);
		vo.setLabelProcessDt("Process Dt");
		vo.getLabelProcessDtField().setProtection(ProtectionMode.PROT);
		vo.getLabelProcessDtField().setColor(ColorMode.BLUE);
		vo.getLabelProcessDtField().setUnderline(true);
		vo.setLabelDescription("Description");
		vo.getLabelDescriptionField().setProtection(ProtectionMode.PROT);
		vo.getLabelDescriptionField().setColor(ColorMode.BLUE);
		vo.getLabelDescriptionField().setUnderline(true);
		vo.setLabelAmount("Amount");
		vo.getLabelAmountField().setProtection(ProtectionMode.PROT);
		vo.getLabelAmountField().setColor(ColorMode.BLUE);
		vo.getLabelAmountField().setUnderline(true);
		vo.setLabelSts("Sts");
		vo.getLabelStsField().setProtection(ProtectionMode.PROT);
		vo.getLabelStsField().setColor(ColorMode.BLUE);
		vo.getLabelStsField().setUnderline(true);
	}
	
	public void updateSfl1FromCdtrn01dSfl1(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dSfl1 vo, Sfl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getD1soption() != null ) {
			dsEntity.setD1soption(vo.getD1soption());
		} else {
			dsEntity.setD1soption("");
		}
		if(vo.getD1stranid() != null ) {
			dsEntity.setD1stranid(vo.getD1stranid());
		} else {
			dsEntity.setD1stranid("");
		}
		if(vo.getD1sdate() != null ) {
			dsEntity.setD1sdate(vo.getD1sdate());
		} else {
			dsEntity.setD1sdate(0);
		}
		if(vo.getD1sdess() != null ) {
			dsEntity.setD1sdess(vo.getD1sdess());
		} else {
			dsEntity.setD1sdess("");
		}
		if(vo.getD1samount() != null ) {
			dsEntity.setD1samount(vo.getD1samount());
		} else {
			dsEntity.setD1samount("");
		}
		if(vo.getD1sstatus() != null ) {
			dsEntity.setD1sstatus(vo.getD1sstatus());
		} else {
			dsEntity.setD1sstatus("");
		}
	}
	
	public void updateCdtrn01dSfl1FromSfl1(final Cdtrn01rContext ctx, final ExecutionController ctrl, Sfl1 dsEntity, Cdtrn01dSfl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getD1soption() != null ) {
			vo.setD1soption(dsEntity.getD1soption());
		}

		if(dsEntity.getD1stranid() != null ) {
			vo.setD1stranid(dsEntity.getD1stranid());
		}

		try {
			vo.setD1sdate(dsEntity.getD1sdate());
		} catch (Exception e) {
			vo.getD1sdateField().setValue(StringUtils.removeSign(dsEntity.getD1sdateReference().getValue(String.class)));
		}
		vo.getD1sdateField().setNumerical(true);

		if(dsEntity.getD1sdess() != null ) {
			vo.setD1sdess(dsEntity.getD1sdess());
		}

		if(dsEntity.getD1samount() != null ) {
			vo.setD1samount(dsEntity.getD1samount());
		}

		if(dsEntity.getD1sstatus() != null ) {
			vo.setD1sstatus(dsEntity.getD1sstatus());
		}

	}
	
	public void applyCdtrn01dSfl1MiscOut(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dSfl1 vo){
		vo.setSflnxtchg(DataUtils.compare(ctx.getIndicatorsGroup().getIn44Reference(), "1") == 0);
		vo.getD1soptionField().setProtection(ProtectionMode.UNPROT);
		vo.getD1soptionField().setUnderline(true);
		vo.getD1soptionField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn50Reference(), "1") == 0) {
			vo.getD1soptionField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn50Reference(), "1") == 0) {
			vo.getD1soptionField().setHilight(HilightMode.REVERSE);
		}
		vo.getD1stranidField().setProtection(ProtectionMode.PROT);
		vo.getD1sdateField().setProtection(ProtectionMode.PROT);
		vo.getD1sdessField().setProtection(ProtectionMode.PROT);
		vo.getD1samountField().setProtection(ProtectionMode.PROT);
		vo.getD1sstatusField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdtrn01dCtl1MiscIn(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dCtl1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn25("0");
		ctx.getIndicatorsGroup().setIn26("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn12("0");
		switch (vo.getAttentionKey()) {
			case "PAGEUP": {
				ctx.getIndicatorsGroup().setIn25("1");
				break;
			}
			case "PAGEDOWN": {
				ctx.getIndicatorsGroup().setIn26("1");
				break;
			}
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
		}
	}
	
	public void applyCdtrn01dCtl1MiscOut(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dCtl1 vo){
		vo.setDspMode("*DS3");
		vo.getSfl1Field().setDspMode("*DS3");
		vo.setOverlay(true);
		vo.getSfl1Field().setSize(13);
		vo.getSfl1Field().setNumberOfRecordsPerPage(13);
		vo.getSfl1Field().display(DataUtils.compare(ctx.getIndicatorsGroup().getIn40Reference(), "1") == 0);
		vo.getSfl1Field().displayControl(DataUtils.compare(ctx.getIndicatorsGroup().getIn41Reference(), "1") == 0);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn42Reference(), "1") == 0) {
			vo.getSfl1Field().subfileClear();
		}
		vo.getSfl1Field().setPageDown(PageDownMode.PLUS);
		vo.getSfl1Field().setEnd(false);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn43Reference(), "1") == 0) {
			vo.getSfl1Field().setEnd(true);
		}
	}
	
	public void applyCdtrn01dFooterMiscOut(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dFooter vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
	}
	
	public void updateCdtrn01dMsgsflFromMsgsfl(final Cdtrn01rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdtrn01dMsgsfl vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getMsgkey() != null ) {
			vo.setMsgkey(dsEntity.getMsgkey());
		}

		if(dsEntity.getPgmq() != null ) {
			vo.setPgmq(dsEntity.getPgmq());
		}

	}
	
	public void applyCdtrn01dMsgsflMiscOut(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());
		vo.getMsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdtrn01dMsgsflcFromMsgsflc(final Cdtrn01rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdtrn01dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmq() != null ) {
			vo.setPgmq(dsEntity.getPgmq());
		}

	}
	
	public void applyCdtrn01dMsgsflcMiscOut(final Cdtrn01rContext ctx, final ExecutionController ctrl, Cdtrn01dMsgsflc vo){
		vo.setDspMode("*DS3");
		vo.getMsgsflField().setDspMode("*DS3");
		vo.getMsgsflField().setMessageSubfile();
		vo.setOverlay(true);
		vo.getMsgsflField().setSize(2);
		vo.getMsgsflField().setNumberOfRecordsPerPage(1);
		vo.getMsgsflField().display(true);
		vo.getMsgsflField().displayControl(true);
		vo.getMsgsflField().initializeRecord(true);
		vo.getMsgsflField().setPageDown(PageDownMode.PLUS);
		vo.getMsgsflField().setEnd(false);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn03Reference(), "1") != 0) {
			vo.getMsgsflField().setEnd(true);
		}
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	

}
