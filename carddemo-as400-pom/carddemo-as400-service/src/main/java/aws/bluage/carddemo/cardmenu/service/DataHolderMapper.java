package aws.bluage.carddemo.cardmenu.service;

import aws.bluage.carddemo.cardmenu.business.context.CardmenuContext;
import aws.bluage.carddemo.cardmenu.business.model.Cardmenu;
import aws.bluage.carddemo.common.business.screen.support.CdmenudCardmenu;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
import com.netfective.bluage.gapwalk.runtime.screen.ColorMode;
import com.netfective.bluage.gapwalk.runtime.screen.IntensityMode;
import com.netfective.bluage.gapwalk.runtime.screen.ProtectionMode;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import org.springframework.stereotype.Component;

@Component
public class DataHolderMapper {
	
	public void applyCdmenudCardmenuMiscIn(final CardmenuContext ctx, final ExecutionController ctrl, CdmenudCardmenu vo){
		ctx.setOffFkeyIndicators();
		switch (vo.getAttentionKey()) {
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				break;
			}
		}
	}
	
	public void updateCardmenuFromCdmenudCardmenu(final CardmenuContext ctx, final ExecutionController ctrl, CdmenudCardmenu vo, Cardmenu dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCmdprompt() != null ) {
			dsEntity.setCmdprompt(vo.getCmdprompt());
		} else {
			dsEntity.setCmdprompt("");
		}
		vo.setDate1(StringUtils.replaceChars(vo.getDate1Field().getValue(String.class), "/", ""));
	}
	
	public void updateCdmenudCardmenuFromCardmenu(final CardmenuContext ctx, final ExecutionController ctrl, Cardmenu dsEntity, CdmenudCardmenu vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getCmdprompt() != null ) {
			vo.setCmdprompt(dsEntity.getCmdprompt());
		}

	}
	
	public void applyCdmenudCardmenuMiscOut(final CardmenuContext ctx, final ExecutionController ctrl, CdmenudCardmenu vo){
		vo.setDspMode("*DS3");
		vo.setClearLines("*ALL");
		vo.setDspMode("*DS3");
		vo.setLock(true);
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getCmdpromptField().setProtection(ProtectionMode.UNPROT);
		vo.getCmdpromptField().setColor(ColorMode.WHITE);
		vo.getCmdpromptField().setUnderline(true);
	}
	

}
