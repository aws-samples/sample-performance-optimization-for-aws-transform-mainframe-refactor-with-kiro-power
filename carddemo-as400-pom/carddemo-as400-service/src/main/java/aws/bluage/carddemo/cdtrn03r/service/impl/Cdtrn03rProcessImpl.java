
package aws.bluage.carddemo.cdtrn03r.service.impl;

import aws.bluage.carddemo.cdtrn03r.business.context.Cdtrn03rContext;
import aws.bluage.carddemo.cdtrn03r.service.Cdtrn03rProcess;
import aws.bluage.carddemo.cdtrn03r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dScrn1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dZconfirm;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
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
 * Class Cdtrn03rProcessImpl
 * 
 * Defines application services for Cdtrn03rProcess
 * @see Cdtrn03rProcess
 */
@Service("aws.bluage.carddemo.cdtrn03r.service.Cdtrn03rProcess")
@Import({
aws.bluage.carddemo.cdtrn03r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdtrn03rProcessImpl implements Cdtrn03rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdtrn03rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		<--START COPYBOOK *LIBL/QCPYSRC COPYUTILPR -->
		** Test Numeric */
		ctx.getPgmstatus().setArgumentsCount(ctx.getArguments().length);
		ctx.getPgmstatus().setJobName(SharedContext.get().getJobName());
		ctx.getPgmstatus().setUserid(SharedContext.get().getUserName());
		if (ctx.isFirstRun()) {
			ctx.getWtodaydt().setWtodaydt(DateHelper.toTimestamp());
			ctx.getIndds_pointer().setIndds_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDTRN02D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCMR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDTRNU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.withFileAddition()
			.open();
			ctx.setWtodaydtSnapshot(DataUtils.asRecord(ctx.getWtodaydt().getWtodaydtReference()).clone());
			ctx.setDfltvalSnapshot(DataUtils.asRecord(ctx.getIndds().getDfltvalReference()).clone());
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
			DAOManager.getDAO(ctx, FileIds.CDTRNU01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDCCMR01)
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
	public void MAINCODE(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		/* 
		***************************************************************
		MAIN PROCESSING                                              *
		*************************************************************** */
		ctx.getScrn1().setDftrtext("F2=Clear  F3=Exit  F12=Save");
		ctx.getSharedRecordFields().getDpgmqReference().setValue(ctx.getPgmstatus().getPgmnameReference());
		ctx.getScrn1().getDpgmnameReference().setValue(ctx.getPgmstatus().getPgmnameReference());
		ctx.getScrn1().getDprocdateReference().setValue(ctx.getWtodaydt().getWtodaydtReference());
		while (1 == 1) {
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dMsgsflc.class, "CDTRN02D")
			.fieldsToRecord(sbean -> toCDTRN02D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dScrn1.class, "CDTRN02D")
			.fieldsToRecord(sbean -> toCDTRN02D_SCRN1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dScrn1.class, "CDTRN02D")
			.recordToFields(sbean -> fromCDTRN02D_SCRN1(ctx, ctrl, sbean))
			.read();
			DLCLEARINDS(ctx, ctrl);
			DataUtils.initialize(ctx.getMessageid().getMessageidReference());
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.call("CDUTL02C");
			if (DataUtils.compare(ctx.getIndds().getF2Reference(), "1") == 0) {
				DLCLEARSCREEN(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndds().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndds().getF12Reference(), "1") == 0) {
				break;
			} else if (DataUtils.compare(ctx.getIndds().getCommandkeyReference(), "1") == 0) {
			} else {
				ctx.getWtodaydt().getWtodaydtReference().setValue(ctx.getScrn1().getDprocdateReference());
				DLADD(ctx, ctrl);
				if (DataUtils.isBlankOrLowValues(ctx.getMessageid().getMessageid())) {
					break;
				} 
			}
		}
		ctx.getInLR().getInLRReference().setValue(ctx.getIndds().getF3Reference());
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation DLCLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCLEARSCREEN(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		DataUtils.initialize(ctx.getScrn1().getDtrnidReference());
		DataUtils.initialize(ctx.getScrn1().getDcardnumReference());
		DataUtils.initialize(ctx.getScrn1().getDtypecdReference());
		DataUtils.initialize(ctx.getScrn1().getDcategcdReference());
		DataUtils.initialize(ctx.getScrn1().getDsourceReference());
		DataUtils.initialize(ctx.getScrn1().getDdessReference());
		DataUtils.initialize(ctx.getScrn1().getDamountedtReference());
		DataUtils.initialize(ctx.getScrn1().getDmerchidReference());
		DataUtils.initialize(ctx.getScrn1().getDmerchnameReference());
		DataUtils.initialize(ctx.getScrn1().getDorigdateReference());
		ctx.getWtodaydt().getWtodaydtReference().setBytes(ctx.getWtodaydtSnapshot().getBytes());
		ctx.getIndds().getDfltvalReference().setBytes(ctx.getDfltvalSnapshot().getBytes());
		ctx.getScrn1().getDprocdateReference().setValue(ctx.getWtodaydt().getWtodaydtReference());
	}

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLADD(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		DLCHECKINPUT(ctx, ctrl);
		if (!(DataUtils.isBlankOrLowValues(ctx.getMessageid().getMessageid()))) {
			return;
		} else {
			ctx.getZconfirm().setDyesno(" ");
			ctx.getIndds().setConfirmind("1");
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dZconfirm.class, "CDTRN02D")
			.fieldsToRecord(sbean -> toCDTRN02D_ZCONFIRM(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dZconfirm.class, "CDTRN02D")
			.fieldsToRecord(sbean -> toCDTRN02D_ZCONFIRM(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn02dZconfirm.class, "CDTRN02D")
			.recordToFields(sbean -> fromCDTRN02D_ZCONFIRM(ctx, ctrl, sbean))
			.read();
			ctx.getIndds().setConfirmind("0");
			if (DataUtils.compare(ctx.getZconfirm().getDyesnoReference(), "Y") != 0) {
				ctx.getMessageid().setMessageid("~~~~~");
				return;
			} else {
				ctx.getCdtrnpr().setTrnid(ctx.getScrn1().getDtrnid());
				ctx.getSharedRecordFields().setCardnum(ctx.getScrn1().getDcardnum());
				ctx.getCdtrnpr().getTypecdReference().setValue(ctx.getScrn1().getDtypecdReference());
				ctx.getCdtrnpr().setCategcd("0000");
				ctx.getWcategcd().setWcategcd(NumberUtils.toDecimal(ctx.getScrn1().getDcategcd(), 4, 0, false).intValue());
				ctx.getCdtrnpr().setCategcd(NumberUtils.convertToPlainText(ctx.getWcategcd().getWcategcd(), 4));
				ctx.getCdtrnpr().getSourceReference().setValue(ctx.getScrn1().getDsourceReference());
				ctx.getCdtrnpr().setDess(ctx.getScrn1().getDdess().trim());
				ctx.getCdtrnpr().setAmount(NumberUtils.toDecimal(ctx.getScrn1().getDamountedt(), 11, 2, false));
				ctx.getCdtrnpr().setMerchid(ctx.getScrn1().getDmerchid());
				ctx.getCdtrnpr().setTrnstatus("s");
				ctx.getCdtrnpr().getOrigdateReference().setValue(ctx.getScrn1().getDorigdateReference());
				ctx.getCdtrnpr().getProcdateReference().setValue(ctx.getScrn1().getDprocdateReference());
				ctx.getCdtrnpr().setTrncrtdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
				ctx.getCdtrnpr().setTrncrttm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
				ctx.getCdtrnpr().getTrncrtusrReference().setValue(ctx.getPgmstatus().getUseridReference());
				ctx.getCdtrnpr().getTrncrtpgmReference().setValue(ctx.getPgmstatus().getPgmnameReference());
				DAOManager.getDAO(ctx, FileIds.CDTRNU01)
				.withRecord(ctx.getCdtrnpr())
				.withMapper(() -> this.outputCDTRNPR(ctx, ctrl))
				.write();
				ctx.getIndds().setF3("1");
			}
		}
	}

	/**
	 * Process operation DLCHECKINPUT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCHECKINPUT(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDTRNU01)
		.withKeys(ctx.getScrn1().getDtrnid())
		.setOnGreaterOrEqual();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDTRNU01).getEqualReference()) == 0) {
			ctx.getIndds().setTraniderr("1");
			ctx.getMessageid().setMessageid("ERR0047");
			DLMESSAGE(ctx, ctrl);
		} 
		DAOManager.getDAO(ctx, FileIds.CDCCMR01)
		.withKeys(ctx.getScrn1().getDcardnum())
		.setOnGreaterOrEqual();
		if (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMR01).getEqualReference()) == 0)) {
			ctx.getIndds().setCardnumerr("1");
			ctx.getMessageid().setMessageid("ERR0034");
			DLMESSAGE(ctx, ctrl);
		} 
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcategcd())) {
			ctx.getIndds().setCategoryerr("1");
			ctx.getMessageid().setMessageid("ERR0036");
			DLMESSAGE(ctx, ctrl);
		} else {
			try {
				if (NumberUtils.compare(NumberUtils.toDecimal(ctx.getScrn1().getDcategcd(), 4, 0, false), 0) > 0 && NumberUtils.compare(NumberUtils.toDecimal(ctx.getScrn1().getDcategcd(), 4, 0, false), 6000) < 0) {
				} else {
					ctx.getIndds().setCategoryerr("1");
					ctx.getMessageid().setMessageid("ERR0036");
					DLMESSAGE(ctx, ctrl);
				}
			} catch (RuntimeException e) {
				ctx.getIndds().setCategoryerr("1");
				ctx.getMessageid().setMessageid("ERR0036");
				DLMESSAGE(ctx, ctrl);
			}
		}
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDdess())) {
			ctx.getIndds().setDesserr("1");
			ctx.getMessageid().setMessageid("ERR0038");
			DLMESSAGE(ctx, ctrl);
		} 
		ctx.getTeststring().setTeststring(ctx.getScrn1().getDamountedt().trim());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getTeststring().getTeststringReference())
		.byReference(ctx.getISCURRENCYReturn().getISCURRENCYReturnReference())
		.call("ISCURRENCY");
		if (!(DataUtils.compare(ctx.getISCURRENCYReturn().getISCURRENCYReturnReference(), "1") == 0) || DataUtils.isBlankOrLowValues(ctx.getTeststring().getTeststring())) {
			ctx.getIndds().setAmounterr("1");
			ctx.getMessageid().setMessageid("ERR0015");
			DLMESSAGE(ctx, ctrl);
		} else if (NumberUtils.compare(NumberUtils.toDecimal(ctx.getScrn1().getDamountedt(), 11, 2, false), 0) == 0) {
			ctx.getIndds().setAmounterr("1");
			ctx.getMessageid().setMessageid("ERR0015");
			DLMESSAGE(ctx, ctrl);
		} 
		if (DataUtils.compareAlphInt(StringUtils.removeSign(ctx.getScrn1().getDmerchidReference().getValue(String.class)), StringUtils.repeat("0", 9)) == 0) {
			ctx.getIndds().setMerchiderr("1");
			ctx.getMessageid().setMessageid("ERR0039");
			DLMESSAGE(ctx, ctrl);
		} 
		if (DataUtils.compare(ctx.getScrn1().getDorigdateReference(), DateHelper.getDate("*ISO")) > 0) {
			ctx.getIndds().setOrigdterr("1");
			ctx.getMessageid().setMessageid("ERR0043");
			DLMESSAGE(ctx, ctrl);
		} else if (DateHelper.noOfDuration(DateHelper.getDate("*ISO"), ctx.getScrn1().getDorigdate(), "*Days") > 365) {
			ctx.getIndds().setOrigdterr("1");
			ctx.getMessageid().setMessageid("ERR0040");
			DLMESSAGE(ctx, ctrl);
		} 
		if (DataUtils.compare(ctx.getScrn1().getDprocdateReference(), DateHelper.getDate("*ISO")) > 0) {
			ctx.getIndds().setProcdterr("1");
			ctx.getMessageid().setMessageid("ERR0044");
			DLMESSAGE(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getScrn1().getDprocdateReference(), ctx.getScrn1().getDorigdateReference()) < 0) {
			ctx.getIndds().setProcdterr("1");
			ctx.getMessageid().setMessageid("ERR0042");
			DLMESSAGE(ctx, ctrl);
		} else if (DateHelper.noOfDuration(DateHelper.getDate("*ISO"), ctx.getScrn1().getDprocdate(), "*D") > 30) {
			ctx.getIndds().setProcdterr("1");
			ctx.getMessageid().setMessageid("ERR0041");
			DLMESSAGE(ctx, ctrl);
		}
	}

	/**
	 * Process operation DLCLEARINDS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCLEARINDS(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		ctx.getIndds().setTraniderr("0");
		ctx.getIndds().setCardnumerr("0");
		ctx.getIndds().setCategoryerr("0");
		ctx.getIndds().setDesserr("0");
		ctx.getIndds().setAmounterr("0");
		ctx.getIndds().setMerchiderr("0");
		ctx.getIndds().setOrigdterr("0");
		ctx.getIndds().setProcdterr("0");
		ctx.getIndds().setDfltval("0");
	}

	/**
	 * Process operation DLMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLMESSAGE(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getMessageid().getMessageidReference(),
			ctx.getPgmstatus().getPgmnameReference())
		.call("CDUTL01C");
	}

	/**
	 * Process operation STINZSR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void STINZSR(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn65("1");
		ctx.getIndicatorsGroup().setIn80("1");
	}

	/**
	 * Process operation fromCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDTRN02D_SCRN1(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo) {
		mapper.applyCdtrn02dScrn1MiscIn(ctx, ctrl, vo);
		mapper.updateScrn1FromCdtrn02dScrn1(ctx, ctrl, vo, ctx.getScrn1());
	}

	/**
	 * Process operation toCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN02D_SCRN1(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo) {
		mapper.updateCdtrn02dScrn1FromScrn1(ctx, ctrl, ctx.getScrn1(), vo);
		mapper.applyCdtrn02dScrn1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDTRN02D_ZCONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDTRN02D_ZCONFIRM(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dZconfirm vo) {
		mapper.applyCdtrn02dZconfirmMiscIn(ctx, ctrl, vo);
		mapper.updateZconfirmFromCdtrn02dZconfirm(ctx, ctrl, vo, ctx.getZconfirm());
	}

	/**
	 * Process operation toCDTRN02D_ZCONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN02D_ZCONFIRM(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dZconfirm vo) {
		mapper.updateCdtrn02dZconfirmFromZconfirm(ctx, ctrl, ctx.getZconfirm(), vo);
		mapper.applyCdtrn02dZconfirmMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDTRN02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN02D_MSGSFL(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsfl vo) {
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
	public void toCDTRN02D_MSGSFLC(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsflc vo) {
		PackedInt MSGDATALENGTH = PackedDecimal.build(8, 0, false);
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilesecondmessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessageidReference());
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withSubfileMsgInfo(ctx.getMsgsfl().getSubfilemessagelineReference())
		.withSubfileSecondMsgInfo(ctx.getMsgsfl().getSubfilesecondmessagelineReference())
		.withSubfileMsgId(ctx.getMsgsfl().getSubfilemessageidReference())
		.withCallStackEntry(ctx.getSharedRecordFields().getDpgmqReference())
		.withMsgKey(ctx.getMsgsfl().getDsflmsgkeyReference())
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
				.withCallStackEntry(ctx.getSharedRecordFields().getDpgmqReference())
				.withMsgKey(ctx.getMsgsfl().getDsflmsgkeyReference())
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
	 * Process operation outputCDTRNPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputCDTRNPR(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		ctx.getCdtrnpr().getCardnumReference().setValue(ctx.getSharedRecordFields().getCardnumReference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdtrn03rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

}
