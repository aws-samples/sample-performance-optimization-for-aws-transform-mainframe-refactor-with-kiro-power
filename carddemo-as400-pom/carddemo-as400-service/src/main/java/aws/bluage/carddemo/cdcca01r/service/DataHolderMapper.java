package aws.bluage.carddemo.cdcca01r.service;

import aws.bluage.carddemo.cdcca01r.business.context.Cdcca01rContext;
import aws.bluage.carddemo.cdcca01r.business.model.Header1;
import aws.bluage.carddemo.cdcca01r.business.model.Sfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dSfl1;
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
	
	public void updateCdcca01dHeader1FromHeader1(final Cdcca01rContext ctx, final ExecutionController ctrl, Header1 dsEntity, Cdcca01dHeader1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmname() != null ) {
			vo.setPgmname(dsEntity.getPgmname());
		}

		try {
			vo.setCardnum(dsEntity.getCardnum());
		} catch (Exception e) {
			vo.getCardnumField().setValue(StringUtils.removeSign(dsEntity.getCardnumReference().getValue(String.class)));
		}
		vo.getCardnumField().setNumerical(true);

	}
	
	public void applyCdcca01dHeader1MiscOut(final Cdcca01rContext ctx, final ExecutionController ctrl, Cdcca01dHeader1 vo){
		vo.setDspMode("*DS3");
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
		vo.setLabelCardActivityHistory("Card Activity History");
		vo.getLabelCardActivityHistoryField().setProtection(ProtectionMode.PROT);
		vo.getLabelCardActivityHistoryField().setHilight(HilightMode.REVERSE);
		vo.getCardnumField().setProtection(ProtectionMode.PROT);
		vo.getCardnumField().setColor(ColorMode.WHITE);
		vo.setLabelActivity("Activity");
		vo.getLabelActivityField().setProtection(ProtectionMode.PROT);
		vo.getLabelActivityField().setColor(ColorMode.BLUE);
		vo.getLabelActivityField().setUnderline(true);
		vo.setLabelDescription("Description");
		vo.getLabelDescriptionField().setProtection(ProtectionMode.PROT);
		vo.getLabelDescriptionField().setColor(ColorMode.BLUE);
		vo.getLabelDescriptionField().setUnderline(true);
		vo.setLabelUser1("User");
		vo.getLabelUser1Field().setProtection(ProtectionMode.PROT);
		vo.getLabelUser1Field().setColor(ColorMode.BLUE);
		vo.getLabelUser1Field().setUnderline(true);
		vo.setLabelTimestamp("Timestamp");
		vo.getLabelTimestampField().setProtection(ProtectionMode.PROT);
		vo.getLabelTimestampField().setColor(ColorMode.BLUE);
		vo.getLabelTimestampField().setUnderline(true);
	}
	
	public void updateCdcca01dSfl1FromSfl1(final Cdcca01rContext ctx, final ExecutionController ctrl, Sfl1 dsEntity, Cdcca01dSfl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getActivity() != null ) {
			vo.setActivity(dsEntity.getActivity());
		}

		if(dsEntity.getDess() != null ) {
			vo.setDess(dsEntity.getDess());
		}

		if(dsEntity.getCcauser() != null ) {
			vo.setCcauser(dsEntity.getCcauser());
		}

		if(dsEntity.getCcatmstamp() != null ) {
			vo.setCcatmstamp(dsEntity.getCcatmstamp());
		}

	}
	
	public void applyCdcca01dSfl1MiscOut(final Cdcca01rContext ctx, final ExecutionController ctrl, Cdcca01dSfl1 vo){
		vo.getActivityField().setProtection(ProtectionMode.PROT);
		vo.getDessField().setProtection(ProtectionMode.PROT);
		vo.getCcauserField().setProtection(ProtectionMode.PROT);
		vo.getCcatmstampField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdcca01dCtl1MiscIn(final Cdcca01rContext ctx, final ExecutionController ctrl, Cdcca01dCtl1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn12("0");
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
		}
	}
	
	public void applyCdcca01dCtl1MiscOut(final Cdcca01rContext ctx, final ExecutionController ctrl, Cdcca01dCtl1 vo){
		vo.setDspMode("*DS3");
		vo.getSfl1Field().setDspMode("*DS3");
		vo.setOverlay(true);
		vo.getSfl1Field().setSize(9999);
		vo.getSfl1Field().setNumberOfRecordsPerPage(13);
		vo.getSfl1Field().display(DataUtils.compare(ctx.getIndicatorsGroup().getIn30Reference(), "1") == 0);
		vo.getSfl1Field().displayControl(DataUtils.compare(ctx.getIndicatorsGroup().getIn31Reference(), "1") == 0);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn32Reference(), "1") == 0) {
			vo.getSfl1Field().subfileClear();
		}
		vo.getSfl1Field().setPageDown(PageDownMode.PLUS);
		vo.getSfl1Field().setEnd(false);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn33Reference(), "1") == 0) {
			vo.getSfl1Field().setEnd(true);
		}
	}
	
	public void applyCdcca01dFooterMiscOut(final Cdcca01rContext ctx, final ExecutionController ctrl, Cdcca01dFooter vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
	}
	

}
