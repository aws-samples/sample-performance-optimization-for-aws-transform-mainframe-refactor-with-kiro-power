package aws.bluage.carddemo.cdcus03r.service;

import aws.bluage.carddemo.cdcus03r.business.context.Cdcus03rContext;
import aws.bluage.carddemo.cdcus03r.business.model.Header1;
import aws.bluage.carddemo.cdcus03r.business.model.Header2;
import aws.bluage.carddemo.cdcus03r.business.model.Sfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dSfl1;
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
	
	public void updateCdcus03dHeader1FromHeader1(final Cdcus03rContext ctx, final ExecutionController ctrl, Header1 dsEntity, Cdcus03dHeader1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getPgmname() != null ) {
			vo.setPgmname(dsEntity.getPgmname());
		}

	}
	
	public void applyCdcus03dHeader1MiscOut(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dHeader1 vo){
		vo.setDspMode("*DS3");
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
		vo.setLabelSelectCustomer("Select Customer");
		vo.getLabelSelectCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelSelectCustomerField().setHilight(HilightMode.REVERSE);
	}
	
	public void updateHeader2FromCdcus03dHeader2(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dHeader2 vo, Header2 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getPosition() != null ) {
			dsEntity.setPosition(vo.getPosition());
		} else {
			dsEntity.setPosition(0);
		}
	}
	
	public void updateCdcus03dHeader2FromHeader2(final Cdcus03rContext ctx, final ExecutionController ctrl, Header2 dsEntity, Cdcus03dHeader2 vo){
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
	
	public void applyCdcus03dHeader2MiscOut(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dHeader2 vo){
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
	}
	
	public void updateSfl1FromCdcus03dSfl1(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dSfl1 vo, Sfl1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getOption() != null ) {
			dsEntity.setOption(vo.getOption());
		} else {
			dsEntity.setOption("");
		}
		if(vo.getCustid() != null ) {
			dsEntity.setCustid(vo.getCustid());
		} else {
			dsEntity.setCustid("");
		}
		if(vo.getFirstname() != null ) {
			dsEntity.setFirstname(vo.getFirstname());
		} else {
			dsEntity.setFirstname("");
		}
		if(vo.getLastname() != null ) {
			dsEntity.setLastname(vo.getLastname());
		} else {
			dsEntity.setLastname("");
		}
	}
	
	public void updateCdcus03dSfl1FromSfl1(final Cdcus03rContext ctx, final ExecutionController ctrl, Sfl1 dsEntity, Cdcus03dSfl1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getOption() != null ) {
			vo.setOption(dsEntity.getOption());
		}

		if(dsEntity.getCustid() != null ) {
			vo.setCustid(dsEntity.getCustid());
		}

		if(dsEntity.getFirstname() != null ) {
			vo.setFirstname(dsEntity.getFirstname());
		}

		if(dsEntity.getLastname() != null ) {
			vo.setLastname(dsEntity.getLastname());
		}

	}
	
	public void applyCdcus03dSfl1MiscOut(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dSfl1 vo){
		vo.getOptionField().setProtection(ProtectionMode.UNPROT);
		vo.getOptionField().setUnderline(true);
		vo.getOptionField().loadCheckMessage("ERR0001","*LIBL/CDMSGF01");
		vo.getCustidField().setProtection(ProtectionMode.PROT);
		vo.getFirstnameField().setProtection(ProtectionMode.PROT);
		vo.getLastnameField().setProtection(ProtectionMode.PROT);
	}
	
	public void applyCdcus03dCtl1MiscIn(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dCtl1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn12("0");
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
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
		}
	}
	
	public void applyCdcus03dCtl1MiscOut(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dCtl1 vo){
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
	
	public void applyCdcus03dFooterMiscOut(final Cdcus03rContext ctx, final ExecutionController ctrl, Cdcus03dFooter vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
	}
	

}
