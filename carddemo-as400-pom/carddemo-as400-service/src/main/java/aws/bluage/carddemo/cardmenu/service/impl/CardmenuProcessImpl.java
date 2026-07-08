
package aws.bluage.carddemo.cardmenu.service.impl;

import aws.bluage.carddemo.cardmenu.business.context.CardmenuContext;
import aws.bluage.carddemo.cardmenu.service.CardmenuProcess;
import aws.bluage.carddemo.cardmenu.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.screen.support.CdmenudCardmenu;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.runtime.screen.WorkstationIO;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class CardmenuProcessImpl
 * 
 * Defines application services for CardmenuProcess
 * @see CardmenuProcess
 */
@Service("aws.bluage.carddemo.cardmenu.service.CardmenuProcess")
@Import({
aws.bluage.carddemo.cardmenu.service.DataHolderMapper.class 
}) 	
@Lazy

public class CardmenuProcessImpl implements CardmenuProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CardmenuProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final CardmenuContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		if (ctx.isFirstRun()) {
			WorkstationIO.newInstance(ctrl, ctx, "CDMENUD")
			.open();
		} 
		ctx.setFirstRun(false);
		do {
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				break;
			} else {
				MAINCODE(ctx, ctrl);
				if (ctx.isMainReturned()) {
					ctx.setMainReturned(false);
					break;
				} 
			}
		} while (true);
		ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
		if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
			WorkstationIO.newInstance(ctrl, ctx, "CDMENUD")
			.close();
			programId = ctx.getProgramIdentifier();
			ctrl.setNeedReset(programId);
		}
	}

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void MAINCODE(final CardmenuContext ctx, final ExecutionController ctrl) {
		while (0 == 0) {
			DataUtils.setToBlank(ctx.getCardmenu().getCmdpromptReference());
			WorkstationIO.newInstance(ctrl, ctx, CdmenudCardmenu.class, "CDMENUD")
			.fieldsToRecord(sbean -> toCDMENUD_CARDMENU(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, CdmenudCardmenu.class, "CDMENUD")
			.recordToFields(sbean -> fromCDMENUD_CARDMENU(ctx, ctrl, sbean))
			.read();
			ctx.getCardmenu().setCmdprompt(ctx.getCardmenu().getCmdprompt().trim());
			if (DataUtils.compare("1", ctx.getCardmenu().getCmdpromptReference()) == 0) {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDCUS01R");
			} else if (DataUtils.compare("2", ctx.getCardmenu().getCmdpromptReference()) == 0) {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDACT01R");
			} else if (DataUtils.compare("3", ctx.getCardmenu().getCmdpromptReference()) == 0) {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDCCM01R");
			} else if (DataUtils.compare("4", ctx.getCardmenu().getCmdpromptReference()) == 0) {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDTRN01R");
			} else if (DataUtils.compare("5", ctx.getCardmenu().getCmdpromptReference()) == 0) {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDAUT01R");
			} else if (DataUtils.compare("90", ctx.getCardmenu().getCmdpromptReference()) == 0) {
				break;
			} else {
				DataUtils.setToBlank(ctx.getCardmenu().getCmdpromptReference());
			}
		}
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation fromCDMENUD_CARDMENU.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDMENUD_CARDMENU(final CardmenuContext ctx, final ExecutionController ctrl, final CdmenudCardmenu vo) {
		mapper.applyCdmenudCardmenuMiscIn(ctx, ctrl, vo);
		mapper.updateCardmenuFromCdmenudCardmenu(ctx, ctrl, vo, ctx.getCardmenu());
	}

	/**
	 * Process operation toCDMENUD_CARDMENU.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDMENUD_CARDMENU(final CardmenuContext ctx, final ExecutionController ctrl, final CdmenudCardmenu vo) {
		mapper.updateCdmenudCardmenuFromCardmenu(ctx, ctrl, ctx.getCardmenu(), vo);
		mapper.applyCdmenudCardmenuMiscOut(ctx, ctrl, vo);
	}

}
