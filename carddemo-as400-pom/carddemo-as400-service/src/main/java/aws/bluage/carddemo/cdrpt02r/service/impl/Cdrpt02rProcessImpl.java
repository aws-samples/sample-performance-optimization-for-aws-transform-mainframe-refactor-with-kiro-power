
package aws.bluage.carddemo.cdrpt02r.service.impl;

import aws.bluage.carddemo.cdrpt02r.business.context.Cdrpt02rContext;
import aws.bluage.carddemo.cdrpt02r.service.Cdrpt02rProcess;
import aws.bluage.carddemo.common.business.database.FileIds;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdrpt02rProcessImpl
 * 
 * Defines application services for Cdrpt02rProcess
 * @see Cdrpt02rProcess
 */
@Service("aws.bluage.carddemo.cdrpt02r.service.Cdrpt02rProcess")
@Lazy

public class Cdrpt02rProcessImpl implements Cdrpt02rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdrpt02rProcessImpl.class);


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdrpt02rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		ctx.getPcustid().bind(ArgUtils.get(ctx, 0));
		ctx.getPresult().bind(ArgUtils.get(ctx, 1));
		if (ctx.isFirstRun()) {
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
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
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
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
	public void MAINCODE(final Cdrpt02rContext ctx, final ExecutionController ctrl) {
		/* 
		Main processing */
		READCUS(ctx, ctrl);
		ctx.getInLR().setInLR("1");
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation READCUS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void READCUS(final Cdrpt02rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDCUSU01)
		.withRecord(ctx.getCdcuspr())
		.withKeys(ctx.getPcustid().getPcustid())
		.noLock()
		.retrieve();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSU01).getFoundReference()) == 0) {
			ctx.getPresult().setPresult("FOUND");
		} else {
			ctx.getPresult().setPresult("NOT FOUND");
		}
	}

}
