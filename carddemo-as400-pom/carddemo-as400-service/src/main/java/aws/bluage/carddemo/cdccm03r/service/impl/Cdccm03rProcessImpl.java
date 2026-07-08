
package aws.bluage.carddemo.cdccm03r.service.impl;

import aws.bluage.carddemo.cdccm03r.business.context.Cdccm03rContext;
import aws.bluage.carddemo.cdccm03r.service.Cdccm03rProcess;
import aws.bluage.carddemo.common.business.database.FileIds;
import com.netfective.bluage.gapwalk.dataarea.support.DataAreaFactory;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdccm03rProcessImpl
 * 
 * Defines application services for Cdccm03rProcess
 * @see Cdccm03rProcess
 */
@Service("aws.bluage.carddemo.cdccm03r.service.Cdccm03rProcess")
@Import({
com.netfective.bluage.gapwalk.dataarea.support.DataAreaFactory.class 
}) 	
@Lazy

public class Cdccm03rProcessImpl implements Cdccm03rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdccm03rProcessImpl.class);

	@Autowired
	private DataAreaFactory dataAreaFactory;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdccm03rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		ctx.getPcardnumber().bind(ArgUtils.get(ctx, 0));
		ctx.getPcvv().bind(ArgUtils.get(ctx, 1));
		if (ctx.isFirstRun()) {
			DAOManager.getDAO(ctx, FileIds.CDCCMR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			ctx.setRandomOutSnapshot(DataUtils.asRecord(ctx.getRandomout().getRandomoutReference()).clone());
			ctx.setReturnCodeSnapshot(DataUtils.asRecord(ctx.getReturncode1().getReturncode1Reference()).clone());
			ctx.setUniqueSnapshot(DataUtils.asRecord(ctx.getUnique().getUniqueReference()).clone());
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
			DAOManager.getDAO(ctx, FileIds.CDCCMR01)
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
	public void MAINCODE(final Cdccm03rContext ctx, final ExecutionController ctrl) {
		ctx.getRandomout().getRandomoutReference().setBytes(ctx.getRandomOutSnapshot().getBytes());
		ctx.getReturncode1().getReturncode1Reference().setBytes(ctx.getReturnCodeSnapshot().getBytes());
		ctx.getUnique().getUniqueReference().setBytes(ctx.getUniqueSnapshot().getBytes());
		do {
			dataAreaFactory.build("CDCCMDTARA", ctx, ctrl)
			.lock()
			.read(ctx.getRandomseed().getRandomseedReference());
			ctx.getRandomseed().setRandomseed(ctx.getRandomseed().getRandomseed() + 1);
			dataAreaFactory.build("CDCCMDTARA", ctx, ctrl)
			.write(ctx.getRandomseed().getRandomseedReference());
			dataAreaFactory.build("CDCCMDTARA", ctx, ctrl)
			.unlock();
			ctx.getRandomin().setRandomin(ctx.getRandomseed().getRandomseed());
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getRandomin().getRandominReference(),
				ctx.getRandomout().getRandomoutReference(),
				ctx.getReturncode1().getReturncode1Reference())
			.call("CEERAN0");
			ctx.getRandomout().setRandomout(NumberUtils.multiply(ctx.getRandomout().getRandomout(), ctx.getCcardsize().getCcardsize(), 23).doubleValue());
			ctx.getPcardnumber().setPcardnumber(NumberUtils.abs(NumberUtils.toDecimal(ctx.getRandomout().getRandomout(), 16, 0, true)).longValue());
			ctx.getPcardnumber().setPcardnumber(ctx.getPcardnumber().getPcardnumber() + ctx.getCcardprefix().getCcardprefix());
			DAOManager.getDAO(ctx, FileIds.CDCCMR01)
			.withKeys(ctx.getPcardnumber().getPcardnumber())
			.setOnGreaterOrEqual();
			if (!(DataUtils.compare("1", ctx.getFileReadIndicators().getEqualReference()) == 0)) {
				ctx.getUnique().setUnique("Y");
			} 
		} while (!(DataUtils.compare(ctx.getUnique().getUniqueReference(), "Y") == 0));
		ctx.getRandomin().setRandomin(0);
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getRandomin().getRandominReference(),
			ctx.getRandomout().getRandomoutReference(),
			ctx.getReturncode1().getReturncode1Reference())
		.call("CEERAN0");
		ctx.getRandomout().setRandomout(NumberUtils.multiply(ctx.getRandomout().getRandomout(), ctx.getCcvvsize().getCcvvsize(), 12).doubleValue());
		ctx.getPcvv().setPcvv(NumberUtils.abs(NumberUtils.toDecimal(ctx.getRandomout().getRandomout(), 3, 0, true)).intValue());
		ctx.getInLR().setInLR("1");
		ctx.setMainReturned(true);
		return;
	}

}
