
package aws.bluage.carddemo.cdccm02r.service.impl;

import aws.bluage.carddemo.cdccm02r.business.context.Cdccm02rContext;
import aws.bluage.carddemo.cdccm02r.service.Cdccm02rProcess;
import aws.bluage.carddemo.cdccm02r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dConfirm;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dScrn1;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
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
 * Class Cdccm02rProcessImpl
 * 
 * Defines application services for Cdccm02rProcess
 * @see Cdccm02rProcess
 */
@Service("aws.bluage.carddemo.cdccm02r.service.Cdccm02rProcess")
@Import({
aws.bluage.carddemo.cdccm02r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdccm02rProcessImpl implements Cdccm02rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdccm02rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		-------------------------------------------------------------------*
		WORKING STORAGE
		-------------------------------------------------------------------* */
		ctx.getPcardnum().bind(ArgUtils.get(ctx, 0));
		ctx.getPviewonly().bind(ArgUtils.get(ctx, 1));
		ctx.getPgmstatus().setArgumentsCount(ctx.getArguments().length);
		ctx.getPgmstatus().setJobName(SharedContext.get().getJobName());
		ctx.getPgmstatus().setUserid(SharedContext.get().getUserName());
		if (ctx.isFirstRun()) {
			ctx.getIndicators_pointer().setIndicators_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDCCM02D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCUSR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDACTR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCMR02)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCMU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
			.withFileAddition()
			.open();
		} 
		ctx.setFirstRun(false);
		EntityUtils.track(ctx.getIndicators(), ctx.getIndicators_pointer().getIndicators_pointerReference(), ctrl);
		do {
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				break;
			} else {
				MAINCODE(ctx, ctrl);
			}
		} while (true);
		ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
		if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDCCMU01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDCCMR02)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDACTR01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDCUSR01)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDCCM02D")
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
	public void MAINCODE(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		/* 
		<--END COPYBOOK-->
		-------------------------------------------------------------------*
		MAIN PROCESSING
		-------------------------------------------------------------------* */
		if (DataUtils.compare(ctx.getPviewonly().getPviewonlyReference(), "1") == 0) {
			ctx.getIndicators().setViewonly("1");
		} else {
			ctx.getIndicators().setViewonly("0");
		}
		if (ctx.getPcardnum().getPcardnum() == 0) {
			ctx.getIndicators().setAddmode("1");
			DLGENCARD(ctx, ctrl);
		} else {
			DLFILL(ctx, ctrl);
		}
		ctx.getScrn1().getDpgmnameReference().setValue(ctx.getPgmstatus().getPgmnameReference());
		ctx.getSharedRecordFields().getDpgmqReference().setValue(ctx.getPgmstatus().getPgmnameReference());
		while (0 == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdccm02dMsgsflc.class, "CDCCM02D")
			.fieldsToRecord(sbean -> toCDCCM02D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm02dScrn1.class, "CDCCM02D")
			.fieldsToRecord(sbean -> toCDCCM02D_SCRN1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm02dScrn1.class, "CDCCM02D")
			.recordToFields(sbean -> fromCDCCM02D_SCRN1(ctx, ctrl, sbean))
			.read();
			if (DataUtils.compare(ctx.getIndicators().getF2Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0) {
				DLCLEARSCREEN(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicators().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0) {
				break;
			} else if (DataUtils.compare(ctx.getIndicators().getF9Reference(), "1") == 0 && !(DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0)) {
				ctx.getDcardnumparam().setDcardnumparam(ctx.getScrn1().getDcardnum());
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.byReference(ctx.getDcardnumparam().getDcardnumparamReference())
				.call("CDCCA01R");
				ctx.getScrn1().setDcardnum(ctx.getDcardnumparam().getDcardnumparam());
			} else if (DataUtils.compare(ctx.getIndicators().getF4Reference(), "1") == 0 && !(DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0)) {
				DLPROMPT(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicators().getCommandkeyReference(), "1") == 0) {
				continue;
			} else if (DataUtils.compare(ctx.getIndicators().getViewonlyReference(), "1") == 0) {
				break;
			} else {
				DLCLRINDSMSG(ctx, ctrl);
				if (DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0) {
					DLADD(ctx, ctrl);
				} else {
					DLUPDATE(ctx, ctrl);
				}
				if (DataUtils.isBlankOrLowValues(ctx.getMessageid().getMessageid()) && (!(DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0) || !(DataUtils.compare(ctx.getIndicators().getF3Reference(), "1") == 0))) {
					break;
				} 
			}
		}
		ctx.getInLR().setInLR("1");
		
		/* 
		-------------------------------------------------------------------*
		$FILL - POPULATE SCREEN
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$FILLTABLE - POPULATE DB TABLE FIELDS
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$CLEARSCREEN - CLEAR INPUT FIELDS
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$CLRINDSMSG - CLEAR ERROR INDICATORS AND MESSAGE
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$ADD - ADD A CARD
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$UPDATE - UPDATE AN EXISTING CARD
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$CHECKINPUT - VALIDATE USER INPUT
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$GENCARD - GENERATE A CREDIT CARD NUMBER AT RANDOM
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$NAME - BUILD NAME
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$PROMPT - CALL PROMPT SCREEN
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$STATUSDES - STATUS DESCRIPTIONS
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		$MESSAGE - SEND MESSAGE TO MESSAGE SUBFILE
		-------------------------------------------------------------------*
		-------------------------------------------------------------------*
		KEYLIST
		-------------------------------------------------------------------* */
		return;
	}

	/**
	 * Process operation DLFILL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLFILL(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDCCMU01)
		.withRecord(ctx.getCdccmpr())
		.withMapper(() -> this.inputCDCCMPR(ctx, ctrl))
		.withKeys(ctx.getPcardnum().getPcardnum())
		.noLock()
		.retrieve();
		ctx.getScrn1().setDcardnum(ctx.getCdccmpr().getCardnum());
		ctx.getScrn1().setDcustid(NumberUtils.editC(ctx.getSharedRecordFields().getCustid(), "X", 9).trim());
		ctx.getScrn1().setDacctnum(NumberUtils.editC(ctx.getSharedRecordFields().getAcctnum(), "X", 12).trim());
		ctx.getScrn1().getDstatusReference().setValue(ctx.getCdccmpr().getStatusReference());
		DLSTATUSDES(ctx, ctrl);
		ctx.getScrn1().setDname(ctx.getCdccmpr().getName().trim());
		ctx.getWname().getWnameReference().setValue(ctx.getScrn1().getDnameReference());
		ctx.getScrn1().setDexpirymo(NumberUtils.editC(ctx.getCdccmpr().getExpirymo(), "X", 2));
		ctx.getScrn1().setDexpiryyr(NumberUtils.editC(ctx.getCdccmpr().getExpiryyr(), "X", 4));
		ctx.getScrn1().getDprimarysecReference().setValue(ctx.getCdccmpr().getPrimarysecReference());
		ctx.getScrn1().setDcvv(NumberUtils.editC(ctx.getCdccmpr().getCvv(), "X", 3));
		if (ctx.getCdccmpr().getCcmcrtdt() != 0) {
			ctx.getScrn1().setDccmcrtdt(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getCdccmpr().getCcmcrtdt(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
		} else {
			ctx.getScrn1().setDccmcrtdt(0);
		}
		ctx.getScrn1().setDccmcrttm(ctx.getCdccmpr().getCcmcrttm());
		ctx.getScrn1().getDccmcrtusrReference().setValue(ctx.getCdccmpr().getCcmcrtusrReference());
		ctx.getScrn1().getDccmcrtpgmReference().setValue(ctx.getCdccmpr().getCcmcrtpgmReference());
		if (ctx.getCdccmpr().getCcmchgdt() != 0) {
			ctx.getScrn1().setDccmchgdt(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getCdccmpr().getCcmchgdt(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
			ctx.getIndicators().setHidechgtm("0");
		} else {
			ctx.getScrn1().setDccmchgdt(0);
			ctx.getIndicators().setHidechgtm("1");
		}
		ctx.getScrn1().setDccmchgtm(ctx.getCdccmpr().getCcmchgtm());
		ctx.getScrn1().getDccmchgusrReference().setValue(ctx.getCdccmpr().getCcmchgusrReference());
		ctx.getScrn1().getDccmchgpgmReference().setValue(ctx.getCdccmpr().getCcmchgpgmReference());
	}

	/**
	 * Process operation DLFILLTABLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLFILLTABLE(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getCdccmpr().setCardnum(ctx.getScrn1().getDcardnum());
		ctx.getSharedRecordFields().setCustid(NumberUtils.toDecimal(ctx.getScrn1().getDcustid(), 9, 0, false).intValue());
		ctx.getSharedRecordFields().setAcctnum(NumberUtils.toDecimal(ctx.getScrn1().getDacctnum(), 12, 0, false).longValue());
		ctx.getCdccmpr().getStatusReference().setValue(ctx.getScrn1().getDstatusReference());
		ctx.getCdccmpr().setName(ctx.getScrn1().getDname().trim());
		ctx.getCdccmpr().setExpirymo(NumberUtils.toDecimal(ctx.getScrn1().getDexpirymo(), 2, 0, false).intValue());
		ctx.getCdccmpr().setExpiryyr(NumberUtils.toDecimal(ctx.getScrn1().getDexpiryyr(), 4, 0, false).intValue());
		ctx.getCdccmpr().getPrimarysecReference().setValue(ctx.getScrn1().getDprimarysecReference());
		ctx.getCdccmpr().setCvv(NumberUtils.toDecimal(ctx.getScrn1().getDcvv(), 3, 0, false).intValue());
	}

	/**
	 * Process operation DLCLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCLEARSCREEN(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		DataUtils.initialize(ctx.getScrn1().getDcustidReference());
		DataUtils.initialize(ctx.getScrn1().getDacctnumReference());
		DataUtils.initialize(ctx.getScrn1().getDnameReference());
		DataUtils.initialize(ctx.getScrn1().getDprimarysecReference());
	}

	/**
	 * Process operation DLCLRINDSMSG.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCLRINDSMSG(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.call("CDUTL02C");
		DataUtils.setToBlank(ctx.getMessageid().getMessageidReference());
		ctx.getIndicators().setCustiderr("0");
		ctx.getIndicators().setAccterr("0");
		ctx.getIndicators().setNameerr("0");
	}

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLADD(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		DLCHECKINPUT(ctx, ctrl);
		if (!(DataUtils.isBlankOrLowValues(ctx.getMessageid().getMessageid()))) {
			DLMESSAGE(ctx, ctrl);
			return;
		} else {
			ctx.getWacctnum().setWacctnum(NumberUtils.toDecimal(ctx.getScrn1().getDacctnum(), 12, 0, false).longValue());
			DAOManager.getDAO(ctx, FileIds.CDACTR01)
			.withRecord(ctx.getCdactpr())
			.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
			.withKeys(ctx.getWacctnum().getWacctnum())
			.retrieve();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTR01).getFoundReference()) == 0) {
				if (DataUtils.compare(ctx.getCdactpr().getActiveReference(), "I") == 0) {
					ctx.getMessageid().setMessageid("ERR0069");
					ctx.getIndicators().setAccterr("1");
					DLMESSAGE(ctx, ctrl);
					return;
				} else {
					if (ctx.getWcustid().getWcustid() == ctx.getCdactpr().getPricustid()) {
						ctx.getScrn1().setDprimarysec("P");
					} else if (ctx.getWcustid().getWcustid() == ctx.getCdactpr().getSeccustid()) {
						ctx.getScrn1().setDprimarysec("S");
					} else {
						ctx.getMessageid().setMessageid("ERR0067");
						ctx.getIndicators().setAccterr("1");
						DLMESSAGE(ctx, ctrl);
						return;
					}
					DAOManager.getDAO(ctx, FileIds.CDCCMR02)
					.withKeys(ctx.getWcustid().getWcustid(), ctx.getWacctnum().getWacctnum())
					.setOnGreaterOrEqual();
					if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMR02).getEqualReference()) == 0) {
						ctx.getIndicators().setCustiderr("1");
						ctx.getIndicators().setAccterr("1");
						ctx.getMessageid().setMessageid("CPF9897");
						ctx.getDuperrmsgl().setDuperrmsgl((long) StringUtils.trimRight(ctx.getDuperrmsg().getDuperrmsg()," ").length());
						ctx.getDuperrmsg().setDuperrmsg(StringUtils.concat(StringUtils.concat(StringUtils.concat("Credit Card ", NumberUtils.editC(ctx.getScrn1().getDcardnum(), "X", 16)), " is already"), " attached to this customer account."));
						MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
						.withMsgId(ctx.getMessageid().getMessageidReference())
						.withMsgFileName("QCPFMSG   *LIBL")
						.withData(ctx.getDuperrmsg().getDuperrmsgReference())
						.withDataLength(ctx.getDuperrmsgl().getDuperrmsglReference())
						.withMsgType("*INFO")
						.withCallStackEntry("*")
						.withCallStackCounter(0)
						.withMsgKey("    ")
						.withErrorCode(ctx.getErrorcde())
						.sendProgMsg();
						return;
					} else {
						while (0 == 0) {
							ctx.getMessageid().setMessageid("MSG0008");
							DLMESSAGE(ctx, ctrl);
							ctx.getIndicators().setSaveprotect("1");
							WorkstationIO.newInstance(ctrl, ctx, Cdccm02dMsgsflc.class, "CDCCM02D")
							.fieldsToRecord(sbean -> toCDCCM02D_MSGSFLC(ctx, ctrl, sbean))
							.write();
							WorkstationIO.newInstance(ctrl, ctx, Cdccm02dScrn1.class, "CDCCM02D")
							.fieldsToRecord(sbean -> toCDCCM02D_SCRN1(ctx, ctrl, sbean))
							.write();
							WorkstationIO.newInstance(ctrl, ctx, Cdccm02dScrn1.class, "CDCCM02D")
							.recordToFields(sbean -> fromCDCCM02D_SCRN1(ctx, ctrl, sbean))
							.read();
							DataUtils.setToBlank(ctx.getMessageid().getMessageidReference());
							if (DataUtils.compare(ctx.getIndicators().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0) {
								ctx.getIndicators().setSaveprotect("0");
								return;
							} else if (DataUtils.compare(ctx.getIndicators().getCommandkeyReference(), "1") == 0) {
								continue;
							} else {
								break;
							}
						}
						while (1 == 1) {
							WorkstationIO.newInstance(ctrl, ctx, Cdccm02dConfirm.class, "CDCCM02D")
							.fieldsToRecord(sbean -> toCDCCM02D_CONFIRM(ctx, ctrl, sbean))
							.write();
							WorkstationIO.newInstance(ctrl, ctx, Cdccm02dConfirm.class, "CDCCM02D")
							.recordToFields(sbean -> fromCDCCM02D_CONFIRM(ctx, ctrl, sbean))
							.read();
							if (DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0) {
								return;
							} else if (DataUtils.compare(ctx.getIndicators().getCommandkeyReference(), "1") == 0) {
								continue;
							} else {
								break;
							}
						}
						DLFILLTABLE(ctx, ctrl);
						ctx.getCdccmpr().setCcmcrtdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
						ctx.getCdccmpr().setCcmcrtdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
						ctx.getCdccmpr().setCcmcrttm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
						ctx.getCdccmpr().getCcmcrtusrReference().setValue(ctx.getPgmstatus().getUseridReference());
						ctx.getCdccmpr().getCcmcrtpgmReference().setValue(ctx.getPgmstatus().getPgmnameReference());
						DAOManager.getDAO(ctx, FileIds.CDCCMU01)
						.withRecord(ctx.getCdccmpr())
						.withMapper(() -> this.outputCDCCMPR(ctx, ctrl))
						.write();
					}
				}
			} else {
				ctx.getMessageid().setMessageid("ERR0002");
				ctx.getIndicators().setAccterr("1");
				DLMESSAGE(ctx, ctrl);
				return;
			}
		}
	}

	/**
	 * Process operation DLUPDATE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLUPDATE(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getWname().getWnameReference(), ctx.getScrn1().getDnameReference()) == 0) {
			ctx.getMessageid().setMessageid("~~~~~");
			return;
		} else {
			DLCHECKINPUT(ctx, ctrl);
			if (!(DataUtils.isBlankOrLowValues(ctx.getMessageid().getMessageid()))) {
				DLMESSAGE(ctx, ctrl);
				return;
			} else {
				while (1 == 1) {
					WorkstationIO.newInstance(ctrl, ctx, Cdccm02dConfirm.class, "CDCCM02D")
					.fieldsToRecord(sbean -> toCDCCM02D_CONFIRM(ctx, ctrl, sbean))
					.write();
					WorkstationIO.newInstance(ctrl, ctx, Cdccm02dConfirm.class, "CDCCM02D")
					.recordToFields(sbean -> fromCDCCM02D_CONFIRM(ctx, ctrl, sbean))
					.read();
					if (DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0) {
						ctx.getMessageid().setMessageid("~~~~~");
						return;
					} else if (DataUtils.compare(ctx.getIndicators().getCommandkeyReference(), "1") == 0) {
						continue;
					} else {
						break;
					}
				}
				DAOManager.getDAO(ctx, FileIds.CDCCMU01)
				.withRecord(ctx.getCdccmpr())
				.withMapper(() -> this.inputCDCCMPR(ctx, ctrl))
				.withKeys(ctx.getPcardnum().getPcardnum())
				.retrieve();
				DLFILLTABLE(ctx, ctrl);
				ctx.getCdccmpr().setCcmchgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
				ctx.getCdccmpr().setCcmchgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
				ctx.getCdccmpr().getCcmchgusrReference().setValue(ctx.getPgmstatus().getUseridReference());
				ctx.getCdccmpr().getCcmchgpgmReference().setValue(ctx.getPgmstatus().getPgmnameReference());
				DAOManager.getDAO(ctx, FileIds.CDCCMU01)
				.withRecord(ctx.getCdccmpr())
				.withMapper(() -> this.outputCDCCMPR(ctx, ctrl))
				.update();
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
	public void DLCHECKINPUT(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0) {
			DataUtils.setToBlank(ctx.getScrn1().getDnameReference());
			DataUtils.setToBlank(ctx.getScrn1().getDprimarysecReference());
			if (DataUtils.isBlank(ctx.getScrn1().getDcustidReference())) {
				ctx.getIndicatorsGroup().setIn98("1");
			} 
			if (DataUtils.compare(ctx.getIndicatorsGroup().getIn98Reference(), "1") == 0) {
				ctx.getMessageid().setMessageid("ERR0050");
				ctx.getIndicators().setCustiderr("1");
				return;
			} else {
				ctx.getTeststring().setTeststring(ctx.getScrn1().getDcustid().trim());
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.byReference(ctx.getTeststring().getTeststringReference())
				.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
				.call("ISNUMERIC");
				if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
					ctx.getMessageid().setMessageid("ERR0051");
					ctx.getIndicators().setCustiderr("1");
					return;
				} else {
					if (NumberUtils.compare(NumberUtils.toDecimal(ctx.getTeststring().getTeststring(), 9, 0, false), 0) == 0) {
						ctx.getMessageid().setMessageid("ERR0050");
						ctx.getIndicators().setCustiderr("1");
						return;
					} else {
						ctx.getWcustid().setWcustid(NumberUtils.toDecimal(ctx.getScrn1().getDcustid(), 9, 0, false).intValue());
						DAOManager.getDAO(ctx, FileIds.CDCUSR01)
						.withRecord(ctx.getCdcuspr())
						.withMapper(() -> this.inputCDCUSPR(ctx, ctrl))
						.withKeys(ctx.getWcustid().getWcustid())
						.retrieve();
						if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSR01).getFoundReference()) == 0) {
							DLNAME(ctx, ctrl);
							if (DataUtils.isBlank(ctx.getScrn1().getDacctnumReference())) {
								ctx.getIndicatorsGroup().setIn98("1");
							} 
							if (DataUtils.compare(ctx.getIndicatorsGroup().getIn98Reference(), "1") == 0) {
								ctx.getMessageid().setMessageid("ERR0052");
								ctx.getIndicators().setAccterr("1");
								return;
							} else {
								ctx.getTeststring().setTeststring(ctx.getScrn1().getDacctnum().trim());
								CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
								.byReference(ctx.getTeststring().getTeststringReference())
								.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
								.call("ISNUMERIC");
								if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
									ctx.getMessageid().setMessageid("ERR0053");
									ctx.getIndicators().setAccterr("1");
									return;
								} else {
									if (NumberUtils.compare(NumberUtils.toDecimal(ctx.getTeststring().getTeststring(), 12, 0, false), 0) == 0) {
										ctx.getMessageid().setMessageid("ERR0052");
										ctx.getIndicators().setAccterr("1");
										return;
									} else {
										return;
									}
								}
							}
						} else {
							ctx.getMessageid().setMessageid("ERR0009");
							ctx.getIndicators().setCustiderr("1");
							return;
						}
					}
				}
			}
		} else {
			if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDname())) {
				ctx.getMessageid().setMessageid("ERR0055");
				ctx.getIndicators().setNameerr("1");
				return;
			} else {
				return;
			}
		}
	}

	/**
	 * Process operation DLGENCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLGENCARD(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getDcvvparam().getDcvvparamReference().setValue(ctx.getWcvv().getWcvvReference());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getWcardnum().getWcardnumReference(),
			ctx.getDcvvparam().getDcvvparamReference())
		.call("CDCCM03R");
		ctx.getWcvv().getWcvvReference().setValue(ctx.getDcvvparam().getDcvvparamReference());
		ctx.getScrn1().setDcardnum(ctx.getWcardnum().getWcardnum());
		ctx.getScrn1().setDcvv(NumberUtils.convertToPlainText(ctx.getWcvv().getWcvv(), 3));
		ctx.getCdccmpr().setExpirymo(DateHelper.subDateTime(DateHelper.getDate("*ISO"), "*MONTHS").intValue());
		ctx.getScrn1().setDexpirymo(NumberUtils.editC(ctx.getCdccmpr().getExpirymo(), "X", 2));
		ctx.getCdccmpr().setExpiryyr(DateHelper.subDateTime(DateHelper.getDate("*ISO"), "*YEARS").intValue());
		ctx.getCdccmpr().setExpiryyr(ctx.getCdccmpr().getExpiryyr() + 5);
		ctx.getScrn1().setDexpiryyr(NumberUtils.editC(ctx.getCdccmpr().getExpiryyr(), "X", 4));
		ctx.getScrn1().setDstatus("G");
		DLSTATUSDES(ctx, ctrl);
	}

	/**
	 * Process operation DLNAME.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLNAME(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		if (!(DataUtils.isBlankOrLowValues(ctx.getCdcuspr().getMidname()))) {
			ctx.getScrn1().setDname(StringUtils.concat(StringUtils.concat(StringUtils.concat(StringUtils.concat(ctx.getCdcuspr().getFirstname().trim(), " "), ctx.getCdcuspr().getMidname().trim()), " "), ctx.getCdcuspr().getLastname().trim()));
			if (ctx.getScrn1().getDname().trim().length() > 25) {
				ctx.getScrn1().setDname(DataUtils.concat(DataUtils.concat(DataUtils.concat(StringUtils.concat(ctx.getCdcuspr().getFirstname().trim(), " "), String.valueOf(DataUtils.getBytes(ctx.getCdcuspr().getMidnameReference().getBytes(), 0, 1)).trim()), " "), ctx.getCdcuspr().getLastname().trim()));
				if (ctx.getScrn1().getDname().trim().length() > 25) {
					ctx.getScrn1().setDname(StringUtils.concat(StringUtils.concat(ctx.getCdcuspr().getFirstname().trim(), " "), ctx.getCdcuspr().getLastname().trim()));
				} 
			} 
		} else {
			ctx.getScrn1().setDname(StringUtils.concat(StringUtils.concat(ctx.getCdcuspr().getFirstname().trim(), " "), ctx.getCdcuspr().getLastname().trim()));
		}
	}

	/**
	 * Process operation DLPROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPROMPT(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getScrn1().getDcsrfldReference(), "CUSTID") == 0) {
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getSharedRecordFields().getCustidReference(),
				ctx.getIndicators().getAlwaysonReference())
			.call("CDCUS02R");
		} else if (DataUtils.compare(ctx.getScrn1().getDcsrfldReference(), "ACCTNUM") == 0) {
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getSharedRecordFields().getAcctnumReference(),
				ctx.getIndicators().getAlwaysonReference())
			.call("CDACT02R");
		}
	}

	/**
	 * Process operation DLSTATUSDES.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLSTATUSDES(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getScrn1().getDstatusReference(), "G") == 0) {
			ctx.getScrn1().setDstatusdess("Generated New");
		} else if (DataUtils.compare(ctx.getScrn1().getDstatusReference(), "A") == 0) {
			ctx.getScrn1().setDstatusdess("Active");
		} else if (DataUtils.compare(ctx.getScrn1().getDstatusReference(), "H") == 0) {
			ctx.getScrn1().setDstatusdess("Hold");
		} else if (DataUtils.compare(ctx.getScrn1().getDstatusReference(), "D") == 0) {
			ctx.getScrn1().setDstatusdess("Deactivated");
		} else {
			ctx.getScrn1().setDstatusdess(" ");
		}
	}

	/**
	 * Process operation DLMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLMESSAGE(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getMessageid().getMessageidReference(),
			ctx.getSharedRecordFields().getDpgmqReference())
		.call("CDUTL01C");
	}

	/**
	 * Process operation fromCDCCM02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM02D_SCRN1(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dScrn1 vo) {
		mapper.applyCdccm02dScrn1MiscIn(ctx, ctrl, vo);
		mapper.updateScrn1FromCdccm02dScrn1(ctx, ctrl, vo, ctx.getScrn1());
	}

	/**
	 * Process operation toCDCCM02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM02D_SCRN1(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dScrn1 vo) {
		mapper.updateCdccm02dScrn1FromScrn1(ctx, ctrl, ctx.getScrn1(), vo);
		mapper.applyCdccm02dScrn1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCM02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM02D_CONFIRM(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dConfirm vo) {
		mapper.applyCdccm02dConfirmMiscIn(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCM02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM02D_CONFIRM(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dConfirm vo) {
		mapper.applyCdccm02dConfirmMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCM02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM02D_MSGSFL(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdccm02dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdccm02dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCM02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM02D_MSGSFLC(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dMsgsflc vo) {
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
				WorkstationIO.newInstance(ctrl, ctx, Cdccm02dMsgsfl.class, "CDCCM02D")
				.fieldsToRecord(sbean -> toCDCCM02D_MSGSFL(ctx, ctrl, sbean))
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
		mapper.updateCdccm02dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdccm02dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation inputCDCCMPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDCCMPR(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getCustidReference().setValue(ctx.getCdccmpr().getCustidReference());
		ctx.getSharedRecordFields().getAcctnumReference().setValue(ctx.getCdccmpr().getAcctnumReference());
	}

	/**
	 * Process operation inputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDACTPR(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getAcctnumReference().setValue(ctx.getCdactpr().getAcctnumReference());
	}

	/**
	 * Process operation inputCDCUSPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDCUSPR(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getCustidReference().setValue(ctx.getCdcuspr().getCustidReference());
	}

	/**
	 * Process operation outputCDCCMPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputCDCCMPR(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getCdccmpr().getCustidReference().setValue(ctx.getSharedRecordFields().getCustidReference());
		ctx.getCdccmpr().getAcctnumReference().setValue(ctx.getSharedRecordFields().getAcctnumReference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdccm02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

}
