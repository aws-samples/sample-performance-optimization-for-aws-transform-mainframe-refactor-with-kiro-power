
package aws.bluage.carddemo.cdtrn02r.service.impl;

import aws.bluage.carddemo.cdtrn02r.business.context.Cdtrn02rContext;
import aws.bluage.carddemo.cdtrn02r.service.Cdtrn02rProcess;
import aws.bluage.carddemo.cdtrn02r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dScrn1;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import com.netfective.bluage.gapwalk.runtime.screen.WorkstationIO;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.MessageHandlingBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdtrn02rProcessImpl
 * 
 * Defines application services for Cdtrn02rProcess
 * @see Cdtrn02rProcess
 */
@Service("aws.bluage.carddemo.cdtrn02r.service.Cdtrn02rProcess")
@Import({
aws.bluage.carddemo.cdtrn02r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdtrn02rProcessImpl implements Cdtrn02rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdtrn02rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		ctx.getPtrnid().bind(ArgUtils.get(ctx, 0));
		if (ctx.isFirstRun()) {
			ctx.getIndds_pointer().setIndds_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDTRN02D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDAUTR02)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			ctx.setInddsSnapshot(DataUtils.asRecord(ctx.getIndds()).clone());
			ctx.setErrflgSnapshot(DataUtils.asRecord(ctx.getErrflg().getErrflgReference()).clone());
			STINZSR(ctx, ctrl);
		} 
		ctx.setFirstRun(false);
		EntityUtils.track(ctx.getIndds(), ctx.getIndds_pointer().getIndds_pointerReference(), ctrl);
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
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDAUTR02)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDTRN02D")
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
	public void MAINCODE(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		/* 
		***************************************************************
		MAIN PROCESSING                                              *
		*************************************************************** */
		ctx.getScrn1().setSpgmname("CDTRN02R");
		ctx.getSharedRecordFields().setSpgmq("CDTRN02R");
		ctx.getScrn1().setSftrtext("F3=Exit  F12=Cancel");
		ctx.getIndds().setBytes(ctx.getInddsSnapshot().getBytes());
		WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dMsgsflc.class, "CDTRN02D")
		.fieldsToRecord(sbean -> toCDTRN02D_MSGSFLC(ctx, ctrl, sbean))
		.write();
		do {
			ctx.getModifiedds().getField().initialize();
			ctx.getOrigloadds().getField().initialize();
			LOADDSP(ctx, ctrl);
			if (DataUtils.compare(ctx.getErrflg().getErrflgReference(), "Y") == 0) {
				ctx.getErrflg().getErrflgReference().setBytes(ctx.getErrflgSnapshot().getBytes());
				ctx.setMainReturned(true);
				return;
			} else {
				WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dMsgsflc.class, "CDTRN02D")
				.fieldsToRecord(sbean -> toCDTRN02D_MSGSFLC(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dScrn1.class, "CDTRN02D")
				.fieldsToRecord(sbean -> toCDTRN02D_SCRN1(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dScrn1.class, "CDTRN02D")
				.recordToFields(sbean -> fromCDTRN02D_SCRN1(ctx, ctrl, sbean))
				.read();
				if (DataUtils.compare(ctx.getIndds().getF4Reference(), "1") == 0) {
					PROMPT(ctx, ctrl);
				} else {
					break;
				}
			}
		} while (!(DataUtils.compare(ctx.getIndds().getF4Reference(), "0") == 0));
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation LOADDSP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADDSP(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withRecord(ctx.getOrigloadds())
		.withMapper(() -> this.inputCDTRNPR(ctx, ctrl))
		.withKeys(ctx.getPtrnid().getPtrnid())
		.retrieve();
		try {
			ctx.getModifiedds().setBytes(ctx.getOrigloadds().getBytes());
			ctx.getScrn1().getSstatusReference().setValue(ctx.getOrigloadds().getTrnstatusReference());
			STATUSDTL(ctx, ctrl);
			ctx.getScrn1().setSamountdsp(NumberUtils.editC(ctx.getOrigloadds().getAmount(), "3", "$", 11).trim());
			ctx.getScrn1().setSdtea1(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getModifiedds().getWdtea1(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
			ctx.getScrn1().setStmea1(ctx.getModifiedds().getWtmea1());
			if (ctx.getModifiedds().getWdtea2() != 0) {
				ctx.getScrn1().setSdtea2(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getModifiedds().getWdtea2(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
			} else {
				ctx.getScrn1().setSdtea2(0);
			}
			ctx.getScrn1().setStmea2(ctx.getModifiedds().getWtmea2());
			if (DataUtils.compare(ctx.getScrn1().getSstatusReference(), "a") == 0 || DataUtils.compare(ctx.getScrn1().getSstatusReference(), "X") == 0) {
				ctx.getIndds().setRevaudit("1");
			} else {
				ctx.getIndds().setRevaudit("0");
			}
			ctx.getScrn1().getSdteb1Reference().setValue(ctx.getScrn1().getSdtea2Reference());
			ctx.getScrn1().getStmeb1Reference().setValue(ctx.getScrn1().getStmea2Reference());
			ctx.getScrn1().getSusrb1Reference().setValue(ctx.getModifiedds().getSusra2Reference());
			ctx.getScrn1().getSpgmb1Reference().setValue(ctx.getModifiedds().getSpgma2Reference());
			DAOManager.getDAO(ctx, FileIds.CDAUTR02)
			.withKeys(ctx.getPtrnid().getPtrnid())
			.setOnGreaterOrEqual();
			DAOManager.getDAO(ctx, FileIds.CDAUTR02)
			.withRecord(ctx.getCdautpr())
			.withMapper(() -> this.inputCDAUTPR(ctx, ctrl))
			.withKeys(ctx.getPtrnid().getPtrnid())
			.readNextEqual();
			if (!(DataUtils.compare("1", ctx.getFileReadIndicators().getEofReference()) == 0)) {
				ctx.getScrn1().setSdtea2(DateHelper.toDecimal(ctx.getCdautpr().getAuthdate()).intValue());
				ctx.getScrn1().setStmea2(DateHelper.toDecimal(ctx.getCdautpr().getAuthtime()).intValue());
				ctx.getModifiedds().getSusra2Reference().setValue(ctx.getCdautpr().getAuthuserReference());
				ctx.getModifiedds().getSpgma2Reference().setValue(ctx.getCdautpr().getAuthpgmReference());
			} 
			DAOManager.getDAO(ctx, FileIds.CDAUTR02)
			.withRecord(ctx.getCdautpr())
			.withMapper(() -> this.inputCDAUTPR(ctx, ctrl))
			.withKeys(ctx.getPtrnid().getPtrnid())
			.readNextEqual();
			if (!(DataUtils.compare("1", ctx.getFileReadIndicators().getEofReference()) == 0)) {
				ctx.getScrn1().setSdteb2(DateHelper.toDecimal(ctx.getCdautpr().getAuthdate()).intValue());
				ctx.getScrn1().setStmeb2(DateHelper.toDecimal(ctx.getCdautpr().getAuthtime()).intValue());
				ctx.getScrn1().getSusrb2Reference().setValue(ctx.getCdautpr().getAuthuserReference());
				ctx.getScrn1().getSpgmb2Reference().setValue(ctx.getCdautpr().getAuthpgmReference());
			} else {
				DataUtils.initialize(ctx.getScrn1().getSdteb2Reference());
				DataUtils.initialize(ctx.getScrn1().getStmeb2Reference());
				DataUtils.initialize(ctx.getScrn1().getSusrb2Reference());
				DataUtils.initialize(ctx.getScrn1().getSpgmb2Reference());
			}
		} catch (RuntimeException e) {
			ctx.getErrflg().setErrflg("Y");
		}
	}

	/**
	 * Process operation PROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PROMPT(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getTcardnum().getTcardnumReference().setValue(ctx.getOrigloadds().getCardnumReference());
		if (DataUtils.compare(ctx.getScrn1().getScsrfldReference(), "CARDNUM") == 0) {
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getTcardnum().getTcardnumReference(),
				ctx.getIndds().getAlwaysonReference())
			.call("CDCCM02R");
		}
	}

	/**
	 * Process operation STATUSDTL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void STATUSDTL(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getScrn1().getSstatusReference(), "s") == 0) {
			ctx.getScrn1().setSstatusdtl("Submitted");
		} else if (DataUtils.compare(ctx.getScrn1().getSstatusReference(), "A") == 0) {
			ctx.getScrn1().setSstatusdtl("Approved");
		} else if (DataUtils.compare(ctx.getScrn1().getSstatusReference(), "R") == 0) {
			ctx.getScrn1().setSstatusdtl("Rejected");
		} else if (DataUtils.compare(ctx.getScrn1().getSstatusReference(), "a") == 0) {
			ctx.getScrn1().setSstatusdtl("Reversal Submitted");
		} else if (DataUtils.compare(ctx.getScrn1().getSstatusReference(), "X") == 0) {
			ctx.getScrn1().setSstatusdtl("Reversed");
		} else if (DataUtils.compare(ctx.getScrn1().getSstatusReference(), "I") == 0) {
			ctx.getScrn1().setSstatusdtl("Inactivated");
		} else {
			ctx.getScrn1().setSstatusdtl("Error");
		}
	}

	/**
	 * Process operation STINZSR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void STINZSR(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn99("1");
	}

	/**
	 * Process operation fromCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDTRN02D_SCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo) {
		mapper.applyCdtrn02dScrn1MiscIn(ctx, ctrl, vo);
		mapper.updateScrn1FromCdtrn02dScrn1(ctx, ctrl, vo, ctx.getScrn1());
		inputSCRN1(ctx, ctrl);
	}

	/**
	 * Process operation toCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN02D_SCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo) {
		outputSCRN1(ctx, ctrl);
		mapper.updateCdtrn02dScrn1FromScrn1(ctx, ctrl, ctx.getScrn1(), vo);
		mapper.applyCdtrn02dScrn1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDTRN02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN02D_MSGSFL(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdtrn02dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdtrn02dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDTRN02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN02D_MSGSFLC(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsflc vo) {
		PackedInt MSGDATALENGTH = PackedDecimal.build(8, 0, false);
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilesecondmessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessageidReference());
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withSubfileMsgInfo(ctx.getMsgsfl().getSubfilemessagelineReference())
		.withSubfileSecondMsgInfo(ctx.getMsgsfl().getSubfilesecondmessagelineReference())
		.withSubfileMsgId(ctx.getMsgsfl().getSubfilemessageidReference())
		.withCallStackEntry(ctx.getSharedRecordFields().getSpgmqReference())
		.withMsgKey(ctx.getMsgsfl().getSsflmsgkeyReference())
		.withMsgInfoLength(MSGDATALENGTH)
		.receiveProgMsg();
		if (MSGDATALENGTH.get() > 0) {
			while (MSGDATALENGTH.get() > 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dMsgsfl.class, "CDTRN02D")
				.fieldsToRecord(sbean -> toCDTRN02D_MSGSFL(ctx, ctrl, sbean))
				.write();
				MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
				.withSubfileMsgInfo(ctx.getMsgsfl().getSubfilemessagelineReference())
				.withSubfileSecondMsgInfo(ctx.getMsgsfl().getSubfilesecondmessagelineReference())
				.withSubfileMsgId(ctx.getMsgsfl().getSubfilemessageidReference())
				.withCallStackEntry(ctx.getSharedRecordFields().getSpgmqReference())
				.withMsgKey(ctx.getMsgsfl().getSsflmsgkeyReference())
				.withMsgInfoLength(MSGDATALENGTH)
				.receiveProgMsg();
			}
		} else {
			vo.getMsgsflField().subfileClear();
		}
		outputMSGSFLC(ctx, ctrl);
		mapper.updateCdtrn02dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdtrn02dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation inputCDTRNPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDTRNPR(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getTrnidReference().setValue(ctx.getCdtrnpr().getTrnidReference());
		ctx.getSharedRecordFields().getCardnumReference().setValue(ctx.getCdtrnpr().getCardnumReference());
	}

	/**
	 * Process operation inputCDAUTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDAUTPR(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getTrnidReference().setValue(ctx.getCdautpr().getTrnidReference());
		ctx.getSharedRecordFields().getCardnumReference().setValue(ctx.getCdautpr().getCardnumReference());
	}

	/**
	 * Process operation inputSCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputSCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getModifiedds().setStrnid(ctx.getScrn1().getStrnid());
		ctx.getModifiedds().setScardnum(ctx.getScrn1().getScardnum());
		ctx.getModifiedds().getStypecdReference().setValue(ctx.getScrn1().getStypecdReference());
		ctx.getModifiedds().getScategcdReference().setValue(ctx.getScrn1().getScategcdReference());
		ctx.getModifiedds().getSsourceReference().setValue(ctx.getScrn1().getSsourceReference());
		ctx.getModifiedds().getSdessReference().setValue(ctx.getScrn1().getSdessReference());
		ctx.getModifiedds().setSmerchid(ctx.getScrn1().getSmerchid());
		ctx.getModifiedds().getSorigdateReference().setValue(ctx.getScrn1().getSorigdateReference());
		ctx.getModifiedds().getSprocdateReference().setValue(ctx.getScrn1().getSprocdateReference());
		ctx.getModifiedds().getSusra1Reference().setValue(ctx.getScrn1().getSusra1Reference());
		ctx.getModifiedds().getSpgma1Reference().setValue(ctx.getScrn1().getSpgma1Reference());
		ctx.getModifiedds().getSusra2Reference().setValue(ctx.getScrn1().getSusra2Reference());
		ctx.getModifiedds().getSpgma2Reference().setValue(ctx.getScrn1().getSpgma2Reference());
	}

	/**
	 * Process operation outputSCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputSCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getScrn1().setStrnid(ctx.getModifiedds().getStrnid());
		ctx.getScrn1().setScardnum(ctx.getModifiedds().getScardnum());
		ctx.getScrn1().getStypecdReference().setValue(ctx.getModifiedds().getStypecdReference());
		ctx.getScrn1().getScategcdReference().setValue(ctx.getModifiedds().getScategcdReference());
		ctx.getScrn1().getSsourceReference().setValue(ctx.getModifiedds().getSsourceReference());
		ctx.getScrn1().getSdessReference().setValue(ctx.getModifiedds().getSdessReference());
		ctx.getScrn1().setSmerchid(ctx.getModifiedds().getSmerchid());
		ctx.getScrn1().getSorigdateReference().setValue(ctx.getModifiedds().getSorigdateReference());
		ctx.getScrn1().getSprocdateReference().setValue(ctx.getModifiedds().getSprocdateReference());
		ctx.getScrn1().getSusra1Reference().setValue(ctx.getModifiedds().getSusra1Reference());
		ctx.getScrn1().getSpgma1Reference().setValue(ctx.getModifiedds().getSpgma1Reference());
		ctx.getScrn1().getSusra2Reference().setValue(ctx.getModifiedds().getSusra2Reference());
		ctx.getScrn1().getSpgma2Reference().setValue(ctx.getModifiedds().getSpgma2Reference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getSpgmqReference().setValue(ctx.getSharedRecordFields().getSpgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdtrn02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getSpgmqReference().setValue(ctx.getSharedRecordFields().getSpgmqReference());
	}

}
