
package aws.bluage.carddemo.cdbpl012m.service.impl;

import aws.bluage.carddemo.cdbpl012m.business.context.Cdbpl012mContext;
import aws.bluage.carddemo.cdbpl012m.service.Cdbpl012mProcess;
import aws.bluage.carddemo.common.business.database.FileIds;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedLong;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdbpl012mProcessImpl
 * 
 * Defines application services for Cdbpl012mProcess
 * @see Cdbpl012mProcess
 */
@Service("aws.bluage.carddemo.cdbpl012m.service.Cdbpl012mProcess")
@Lazy

public class Cdbpl012mProcessImpl implements Cdbpl012mProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdbpl012mProcessImpl.class);


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdbpl012mContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		ctx.getProgramStatus().setArgumentsCount(ctx.getArguments().length);
		ctx.getProgramStatus().setJobnm(SharedContext.get().getJobName());
		if (ctx.isFirstRun()) {
			DAOManager.getDAO(ctx, FileIds.CDAUTU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
		} 
		ctx.setFirstRun(false);
		if (DataUtils.compare("GENAUT#", ctx.getUsedProgramIdentifier()) == 0) {
			PackedLong gENAUTSHReturn = PackedDecimal.build(18, 0, true, ArgUtils.get(ctx, ctx.getArguments().length - 1));
			gENAUTSHReturn.set(GENAUTSH(ctx, ctrl, DataUtils.asRecord(ArgUtils.get(ctx, 0))));
			return;
		} else {
			ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				DAOManager.getDAO(ctx, FileIds.CDAUTU01)
				.close();
				programId = ctx.getProgramIdentifier();
				ctrl.setNeedReset(programId);
			} 
		}
	}

	/**
	 * Process operation GENAUTSH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pGENERATEDSH 
	 * @return 
	 */
	@Override
	public long GENAUTSH(final Cdbpl012mContext ctx, final ExecutionController ctrl, final Record pGENERATEDSH) {
		long returnValue = 0;
		PackedLong gENERATEDSH = PackedDecimal.build(18, 0, true, pGENERATEDSH);
		Alphanumeric cURDT = new Alphanumeric(6, " ");
		Alphanumeric cURTM = new Alphanumeric(6, " ");
		Alphanumeric dAYOFWEEK = new Alphanumeric(1, " ");
		Alphanumeric wKJOBNM = new Alphanumeric(10, " ");
		Alphanumeric eNGINESH = new Alphanumeric(3, " ");
		Alphanumeric cTR = new Alphanumeric(2, "01");
		Alphanumeric uNIQUE = new Alphanumeric(1, " ");
		
		/* 
		FIXED: CurDt = %Char(%Dec(%Date():*ymd)) - 6 chars YYMMDD format */
		String isoDate = DateHelper.getDate("*ISO");
		String ymd = DateHelper.convertDate(isoDate, "*ISO", "*YMD");
		cURDT.set(ymd);
		
		/* 
		FIXED: CurTm = %Char(%Dec(%Time():*hms)) - 6 chars HHMMSS format */
		String isoTime = DateHelper.toTime();
		cURTM.set(isoTime.replace(".", ""));
		dAYOFWEEK.set(String.valueOf(NumberUtils.modulo(DateHelper.noOfDuration(DateHelper.getDate("*ISO"), "0001-01-01", "*Days"), 7).add(BigDecimal.ONE)));
		wKJOBNM.set(StringUtils.leftPad(StringUtils.rightSubstring(ctx.getProgramStatus().getJobnm(), 10),10));
		eNGINESH.setBytes(DataUtils.getBytes(wKJOBNM.getBytes(), 7, 3));
		gENERATEDSH.set(NumberUtils.toDecimal(StringUtils.concat(StringUtils.concat(StringUtils.concat(StringUtils.concat(cURDT.get(), cURTM.get()), dAYOFWEEK.get()), eNGINESH.get()), cTR.get()), 18, 0, false).longValue());
		while (DataUtils.compare(" ", uNIQUE.get()) == 0) {
			DAOManager.getDAO(ctx, FileIds.CDAUTU01)
			.withKeys(gENERATEDSH.get())
			.setOnGreaterOrEqual();
			if (DataUtils.compare("1", ctx.getFileReadIndicators().getEqualReference()) == 0) {
				gENERATEDSH.set(gENERATEDSH.get() + 1);
			} else {
				uNIQUE.set("Y");
			}
		}
		returnValue = NumberUtils.convert(gENERATEDSH.get()).longValue();
		return returnValue;

	}

}
