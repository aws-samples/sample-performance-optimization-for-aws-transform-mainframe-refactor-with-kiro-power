
package aws.bluage.carddemo.cdcca01r.service.impl;

import aws.bluage.carddemo.cdcca01r.business.context.Cdcca01rContext;
import aws.bluage.carddemo.cdcca01r.service.Cdcca01rProcess;
import aws.bluage.carddemo.cdcca01r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dSfl1;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import com.netfective.bluage.gapwalk.runtime.screen.WorkstationIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdcca01rProcessImpl
 * 
 * Defines application services for Cdcca01rProcess
 * @see Cdcca01rProcess
 */
@Service("aws.bluage.carddemo.cdcca01r.service.Cdcca01rProcess")
@Import({
aws.bluage.carddemo.cdcca01r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdcca01rProcessImpl implements Cdcca01rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdcca01rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdcca01rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		ctx.getPcardnum().bind(ArgUtils.get(ctx, 0));
		if (ctx.isFirstRun()) {
			ctx.getIndicatords_pointer().setIndicatords_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDCCA01D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCAR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
		} 
		ctx.setFirstRun(false);
		EntityUtils.track(ctx.getIndicatords(), ctx.getIndicatords_pointer().getIndicatords_pointerReference(), ctrl);
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
			DAOManager.getDAO(ctx, FileIds.CDCCAR01)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDCCA01D")
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
	public void MAINCODE(final Cdcca01rContext ctx, final ExecutionController ctrl) {
		ctx.getWleaveprogram().setWleaveprogram(" ");
		ctx.getHeader1().setPgmname("CDCCA01R");
		ctx.getHeader1().getCardnumReference().setValue(ctx.getPcardnum().getPcardnumReference());
		DAOManager.getDAO(ctx, FileIds.CDCCAR01)
		.withKeys(ctx.getPcardnum().getPcardnum())
		.setOnGreaterOrEqual();
		LOADSUBFILE(ctx, ctrl);
		do {
			WorkstationIO.newInstance(ctrl, ctx, Cdcca01dHeader1.class, "CDCCA01D")
			.fieldsToRecord(sbean -> toCDCCA01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcca01dFooter.class, "CDCCA01D")
			.fieldsToRecord(sbean -> toCDCCA01D_FOOTER(ctx, ctrl, sbean))
			.write();
			ctx.getIndicatords().setIsfldspctl("1");
			WorkstationIO.newInstance(ctrl, ctx, Cdcca01dCtl1.class, "CDCCA01D")
			.fieldsToRecord(sbean -> toCDCCA01D_CTL1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcca01dCtl1.class, "CDCCA01D")
			.recordToFields(sbean -> fromCDCCA01D_CTL1(ctx, ctrl, sbean))
			.read();
			ctx.getIndicatords().setIsfldspctl("0");
			if (DataUtils.compare(ctx.getIndicatords().getIexitReference(), "1") == 0 || DataUtils.compare(ctx.getIndicatords().getIpreviousReference(), "1") == 0) {
				ctx.getWleaveprogram().setWleaveprogram("Y");
			} 
		} while (!(DataUtils.compare(ctx.getWleaveprogram().getWleaveprogramReference(), "Y") == 0));
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation LOADSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADSUBFILE(final Cdcca01rContext ctx, final ExecutionController ctrl) {
		CLEARSUBFILE(ctx, ctrl);
		DAOManager.getDAO(ctx, FileIds.CDCCAR01)
		.withRecord(ctx.getCdccapr())
		.withKeys(ctx.getPcardnum().getPcardnum())
		.readNextEqual();
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCAR01).getEofReference()) == 0) && ctx.getWrrn().getWrrn() < 9999) {
			ctx.getSfl1().getActivityReference().setValue(ctx.getCdccapr().getR1shactivityReference());
			ctx.getSfl1().getDessReference().setValue(ctx.getCdccapr().getR1shdessReference());
			ctx.getSfl1().getCcauserReference().setValue(ctx.getCdccapr().getR1shccauserReference());
			ctx.getSfl1().getCcatmstampReference().setValue(ctx.getCdccapr().getR1shccatmstampReference());
			ctx.getWrrn().setWrrn(ctx.getWrrn().getWrrn() + 1);
			WorkstationIO.newInstance(ctrl, ctx, Cdcca01dSfl1.class, "CDCCA01D")
			.withRRN(ctx.getWrrn().getWrrnReference())
			.fieldsToRecord(sbean -> toCDCCA01D_SFL1(ctx, ctrl, sbean))
			.write();
			DAOManager.getDAO(ctx, FileIds.CDCCAR01)
			.withRecord(ctx.getCdccapr())
			.withKeys(ctx.getPcardnum().getPcardnum())
			.readNextEqual();
		}
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCAR01).getEofReference()) == 0) {
			ctx.getIndicatords().setIsflend("1");
		} else {
			ctx.getIndicatords().setIsflend("0");
		}
		if (ctx.getWrrn().getWrrn() > 0) {
			ctx.getIndicatords().setIsfldsp("1");
		} else {
			ctx.getIndicatords().setIsfldsp("0");
		}
	}

	/**
	 * Process operation CLEARSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CLEARSUBFILE(final Cdcca01rContext ctx, final ExecutionController ctrl) {
		ctx.getWrrn().setWrrn(0);
		ctx.getIndicatords().setIsflclr("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdcca01dCtl1.class, "CDCCA01D")
		.fieldsToRecord(sbean -> toCDCCA01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatords().setIsflclr("0");
		ctx.getIndicatords().setIsflend("0");
	}

	/**
	 * Process operation toCDCCA01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCA01D_HEADER1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dHeader1 vo) {
		mapper.updateCdcca01dHeader1FromHeader1(ctx, ctrl, ctx.getHeader1(), vo);
		mapper.applyCdcca01dHeader1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCA01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCA01D_SFL1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dSfl1 vo) {
		mapper.updateCdcca01dSfl1FromSfl1(ctx, ctrl, ctx.getSfl1(), vo);
		mapper.applyCdcca01dSfl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCA01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCA01D_CTL1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dCtl1 vo) {
		mapper.applyCdcca01dCtl1MiscIn(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCA01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCA01D_CTL1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dCtl1 vo) {
		mapper.applyCdcca01dCtl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCA01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCA01D_FOOTER(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dFooter vo) {
		mapper.applyCdcca01dFooterMiscOut(ctx, ctrl, vo);
	}

}
