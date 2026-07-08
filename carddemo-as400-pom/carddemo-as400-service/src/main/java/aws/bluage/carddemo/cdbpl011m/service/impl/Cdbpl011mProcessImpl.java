
package aws.bluage.carddemo.cdbpl011m.service.impl;

import aws.bluage.carddemo.cdbpl011m.business.context.Cdbpl011mContext;
import aws.bluage.carddemo.cdbpl011m.service.Cdbpl011mProcess;
import aws.bluage.carddemo.common.business.database.FileIds;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedBigDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.control.ReturnException;
import com.netfective.bluage.gapwalk.rt.mh.MessageQueueMessage.MessageType;
import com.netfective.bluage.gapwalk.rt.mh.MessageQueueReceiveOptions.MessageAction;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.MessageHandlingBuilder;
import java.math.BigDecimal;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdbpl011mProcessImpl
 * 
 * Defines application services for Cdbpl011mProcess
 * @see Cdbpl011mProcess
 */
@Service("aws.bluage.carddemo.cdbpl011m.service.Cdbpl011mProcess")
@Lazy

public class Cdbpl011mProcessImpl implements Cdbpl011mProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdbpl011mProcessImpl.class);


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		<--START COPYBOOK QCPYSRC COPYBPLAUT -->
		<--START COPYBOOK QCPYSRC COPYPSDS --> */
		ctx.getDlengtrnsts().bind(ArgUtils.get(ctx, 0));
		ctx.getMypsds().setParms(ctx.getArguments().length);
		ctx.getMypsds().setJob_name(SharedContext.get().getJobName());
		ctx.getMypsds().setUser(SharedContext.get().getUserName());
		if (ctx.isFirstRun()) {
			DAOManager.getDAO(ctx, FileIds.CDAUTU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Output)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCMR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDTRNR02)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
			.open();
			ctx.getAtct_root().setItemFromAtct("CREDIT CARD NOT FOUND         ",0);
			ctx.getAtct_root().setItemFromAtct("CREDIT CARD NOT ACTIVE        ",1);
			ctx.getAtct_root().setItemFromAtct("CREDIT CARD EXPIRED           ",2);
			ctx.getAtct_root().setItemFromAtct("ACCOUNT EXPIRED OR INACTIVE   ",3);
			ctx.getAtct_root().setItemFromAtct("CREDIT LIMIT EXCEEDED         ",4);
			ctx.getAtct_root().setItemFromAtct("IT ERROR - CURDEBIT OVERFLOW  ",5);
			ctx.getAtct_root().setItemFromAtct("IT ERROR - CURCREDIT OVERFLOW ",6);
			try {
			    STINZSR(ctx, ctrl);
			} catch (ReturnException e) {
			    if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") != 0) {
			        return;
			    }
			}

		} 
		ctx.setFirstRun(false);
		do {
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				break;
			} else {
				try {
				    MAINCODE(ctx, ctrl);
				} catch (ReturnException e) {
				    if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") != 0) {
				        return;
				    }
				}

				if (ctx.isMainReturned()) {
					ctx.setMainReturned(false);
					break;
				} 
			}
		} while (true);
		ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
		if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDTRNR02)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDCCMR01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDAUTU01)
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
	public void MAINCODE(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		ctx.getMypsds().setRoutine("*TOTC");
		GETACTION(ctx, ctrl);
		if (DataUtils.compare("stop", ctx.getAction().getAction().trim()) == 0) {
			PUTMESSAGE(ctx, ctrl);
			ctx.setMainReturned(true);
			return;
		} else {
			DAOManager.getDAO(ctx, FileIds.CDTRNR02)
			.withKeys(ctx.getDlengtrnsts().getDlengtrnsts())
			.setOnGreaterOrEqual();
			while (ctx.getShutdown().getShutdown() == 0) {
				GETMESSAGE(ctx, ctrl);
				DAOManager.getDAO(ctx, FileIds.CDTRNR02)
				.withRecord(ctx.getCdtrnpr())
				.withKeys(ctx.getDlengtrnsts().getDlengtrnsts())
				.handleErrors()
				.readNextEqual();
				if (DataUtils.compare("1", ctx.getErrorContext().getError()) == 0) {
				} else if (DataUtils.compare("1", ctx.getFileReadIndicators().getEofReference()) == 0) {
					SLEEP(ctx, ctrl);
					DAOManager.getDAO(ctx, FileIds.CDTRNR02)
					.withKeys(ctx.getDlengtrnsts().getDlengtrnsts())
					.setOnGreaterOrEqual();
				} else if (DataUtils.compare("1", ctx.getFileReadIndicators().getFoundReference()) == 0) {
					ctx.getCdtrnpr().setTrnchgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
					ctx.getCdtrnpr().setTrnchgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
					ctx.getCdtrnpr().getTrnchgusrReference().setValue(ctx.getMypsds().getUserReference());
					ctx.getCdtrnpr().getTrnchgpgmReference().setValue(ctx.getMypsds().getProc_nameReference());
					PROCESS_TRN(ctx, ctrl);
				} 
			}
			ctx.setMainReturned(true);
			return;
		}
	}

	/**
	 * Process operation STINZSR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void STINZSR(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getDlengtrnsts().getDlengtrnstsReference(), ctx.getSubmitsts().getSubmitstsReference()) != 0 && DataUtils.compare(ctx.getDlengtrnsts().getDlengtrnstsReference(), ctx.getSubmitrevsts().getSubmitrevstsReference()) != 0) {
			throw new ReturnException("RETURN");
		} 
		ctx.getCdautpr().getAut_authuserReference().setValue(ctx.getMypsds().getUserReference());
		ctx.getCdautpr().getAut_authpgmReference().setValue(ctx.getMypsds().getProc_nameReference());
	}

	/**
	 * Process operation PROCESS_TRN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PROCESS_TRN(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		DataUtils.setToBlank(ctx.getCdautpr().getAut_fraudflagReference());
		DataUtils.setToBlank(ctx.getCdautpr().getAut_rspreasonReference());
		ctx.getCdtrnpr().getTrnstatusReference().setValue(ctx.getRejectedsts().getRejectedstsReference());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getGeneratedauth().getGeneratedauthReference())
		.byReference(ctx.getGENAUTSHReturn().getGENAUTSHReturnReference())
		.call("GENAUT#");
		DAOManager.getDAO(ctx, FileIds.CDCCMR01)
		.withRecord(ctx.getCdccmpr())
		.withKeys(ctx.getCdtrnpr().getCardnum())
		.retrieve();
		if (!(DataUtils.compare("1", ctx.getFileReadIndicators().getFoundReference()) == 0)) {
			ctx.getCdautpr().setAut_rspreason(ctx.getAtct_root().getItemFromAtct(0));
			WRTAUT_UPDTRN_UPDACT(ctx, ctrl);
			return;
		} else {
			if (DataUtils.compare(ctx.getDlengtrnsts().getDlengtrnstsReference(), ctx.getSubmitsts().getSubmitstsReference()) == 0) {
				if (DataUtils.compare(ctx.getCdccmpr().getCcm_statusReference(), "A") != 0) {
					if (DataUtils.compare(ctx.getCdccmpr().getCcm_statusReference(), "H") == 0) {
						ctx.getCdautpr().setAut_fraudflag("Y");
					} 
					ctx.getCdautpr().setAut_rspreason(ctx.getAtct_root().getItemFromAtct(1));
					WRTAUT_UPDTRN_UPDACT(ctx, ctrl);
					return;
				} else {
					if (NumberUtils.compare(ctx.getCdccmpr().getCcm_expiryyr(), DateHelper.subDate(ctx.getCdtrnpr().getOrigdate(), "*ISO", "*Years")) < 0 || (NumberUtils.compare(ctx.getCdccmpr().getCcm_expiryyr(), DateHelper.subDate(ctx.getCdtrnpr().getOrigdate(), "*ISO", "*Years")) == 0 && NumberUtils.compare(ctx.getCdccmpr().getCcm_expirymo(), DateHelper.subDate(ctx.getCdtrnpr().getOrigdate(), "*ISO", "*Months")) < 0)) {
						ctx.getCdautpr().setAut_rspreason(ctx.getAtct_root().getItemFromAtct(2));
						WRTAUT_UPDTRN_UPDACT(ctx, ctrl);
						return;
					} else {
						DAOManager.getDAO(ctx, FileIds.CDACTR04)
						.withRecord(ctx.getCdactpr())
						.withKeys("A", ctx.getCdccmpr().getCcm_acctnum())
						.noLock()
						.handleErrors()
						.retrieve();
						if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0) && DataUtils.compare("1", ctx.getFileReadIndicators().getFoundReference()) == 0 && DataUtils.compare(ctx.getCdactpr().getAct_expirydateReference(), ctx.getCdtrnpr().getProcdateReference()) >= 0) {
							ctx.getCdtrnpr().getTrnstatusReference().setValue(ctx.getApprovedsts().getApprovedstsReference());
						} else {
							ctx.getCdautpr().setAut_rspreason(ctx.getAtct_root().getItemFromAtct(3));
							WRTAUT_UPDTRN_UPDACT(ctx, ctrl);
							return;
						}
					}
				}
			} else {
				ctx.getCdtrnpr().getTrnstatusReference().setValue(ctx.getReversedsts().getReversedstsReference());
			}
			CALCUPDDLBAL(ctx, ctrl);
			WRTAUT_UPDTRN_UPDACT(ctx, ctrl);
		}
	}

	/**
	 * Process operation WRTAUT_UPDTRN_UPDACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void WRTAUT_UPDTRN_UPDACT(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		ctx.getCdautpr().getAut_authidReference().setValue(ctx.getGeneratedauth().getGeneratedauthReference());
		ctx.getCdautpr().getAut_trnidReference().setValue(ctx.getCdtrnpr().getTrnidReference());
		ctx.getCdautpr().getAut_cardnumReference().setValue(ctx.getCdtrnpr().getCardnumReference());
		ctx.getCdautpr().setAut_authdate(DateHelper.getDate("*ISO"));
		ctx.getCdautpr().setAut_authtime(DateHelper.toTime());
		if (DataUtils.compare(ctx.getCdtrnpr().getTrnstatusReference(), ctx.getErrorsts().getErrorstsReference()) == 0) {
			ctx.getCdautpr().setAut_response("F");
		} else if (DataUtils.compare(ctx.getCdtrnpr().getTrnstatusReference(), ctx.getRejectedsts().getRejectedstsReference()) == 0) {
			ctx.getCdautpr().setAut_response("P");
		} else {
			ctx.getCdautpr().setAut_response("P");
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withRecord(ctx.getCdactpr())
			.update();
		}
		DAOManager.getDAO(ctx, FileIds.CDAUTU01)
		.withRecord(ctx.getCdautpr())
		.write();
		DAOManager.getDAO(ctx, FileIds.CDTRNR02)
		.withRecord(ctx.getCdtrnpr())
		.update();
	}

	/**
	 * Process operation RCDLCK_TRN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void RCDLCK_TRN(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn60("1");
		while (DataUtils.compare(ctx.getIndicatorsGroup().getIn60Reference(), "1") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDTRNR02)
			.withKeys(ctx.getDlengtrnsts().getDlengtrnsts())
			.setOnGreaterOrEqual();
			DAOManager.getDAO(ctx, FileIds.CDTRNR02)
			.withRecord(ctx.getCdtrnpr())
			.withKeys(ctx.getDlengtrnsts().getDlengtrnsts())
			.handleErrors()
			.readNextEqual();
			if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0)) {
				ctx.getIndicatorsGroup().setIn60("0");
			} 
		}
	}

	/**
	 * Process operation SLEEP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void SLEEP(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		ctx.getDly().setDly(StringUtils.concat(StringUtils.concat("DLYJOB DLY(", ctx.getDelay().getDelay()), ")"));
		ctx.getQCMDPRCSParam0().setQCMDPRCSParam0(ctx.getDly().getDly());
		ctx.getQCMDPRCSParam1().setQCMDPRCSParam1(new BigDecimal(DataUtils.currentSizeOfVarying(ctx.getDly().getDlyReference())));
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getQCMDPRCSParam0().getQCMDPRCSParam0Reference(),
			ctx.getQCMDPRCSParam1().getQCMDPRCSParam1Reference())
		.call("QCMDEXC");
	}

	/**
	 * Process operation CALCUPDDLBAL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CALCUPDDLBAL(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		PackedBigDecimal wKAMOUNT = PackedDecimal.build(15, 5, true, 0);
		PackedBigDecimal wKCURDEBIT = PackedDecimal.build(7, 2, true, 0);
		PackedBigDecimal wKCURCREDIT = PackedDecimal.build(7, 2, true, 0);
		ctx.getIndicatorsGroup().setIn60("1");
		while (DataUtils.compare(ctx.getIndicatorsGroup().getIn60Reference(), "1") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withRecord(ctx.getCdactpr())
			.withKeys("A", ctx.getCdccmpr().getCcm_acctnum())
			.handleErrors()
			.retrieve();
			if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0) && DataUtils.compare("1", ctx.getFileReadIndicators().getFoundReference()) == 0) {
				ctx.getIndicatorsGroup().setIn60("0");
			} 
		}
		if (DataUtils.compare(ctx.getCdtrnpr().getTrnstatusReference(), ctx.getApprovedsts().getApprovedstsReference()) == 0) {
			wKAMOUNT.set(ctx.getCdactpr().getAct_balance().add(ctx.getCdtrnpr().getAmount()));
			if (NumberUtils.compare(wKAMOUNT.get(), ctx.getCdactpr().getAct_credlimit()) > 0) {
				DAOManager.getDAO(ctx, FileIds.CDACTR04)
				.releaseLockedRecord();
				ctx.getCdautpr().setAut_rspreason(ctx.getAtct_root().getItemFromAtct(4));
				ctx.getCdtrnpr().getTrnstatusReference().setValue(ctx.getRejectedsts().getRejectedstsReference());
				return;
			} else {
				try {
					wKCURDEBIT.set(ctx.getCdactpr().getAct_curdebit().add(ctx.getCdtrnpr().getAmount()));
				} catch (RuntimeException e) {
					DAOManager.getDAO(ctx, FileIds.CDACTR04)
					.releaseLockedRecord();
					ctx.getCdautpr().setAut_rspreason(ctx.getAtct_root().getItemFromAtct(5));
					ctx.getCdtrnpr().getTrnstatusReference().setValue(ctx.getErrorsts().getErrorstsReference());
					return;
				}
				ctx.getCdactpr().setAct_curdebit(NumberUtils.convert(wKCURDEBIT.get()));
				ctx.getCdactpr().setAct_balance(ctx.getCdactpr().getAct_curdebit().subtract(ctx.getCdactpr().getAct_curcredit()));
			}
		} else {
			try {
				wKCURCREDIT.set(ctx.getCdactpr().getAct_curcredit().add(ctx.getCdtrnpr().getAmount()));
			} catch (RuntimeException e) {
				DAOManager.getDAO(ctx, FileIds.CDACTR04)
				.releaseLockedRecord();
				ctx.getCdautpr().setAut_rspreason(ctx.getAtct_root().getItemFromAtct(6));
				ctx.getCdtrnpr().getTrnstatusReference().setValue(ctx.getErrorsts().getErrorstsReference());
				return;
			}
			ctx.getCdactpr().setAct_curcredit(NumberUtils.convert(wKCURCREDIT.get()));
			ctx.getCdactpr().setAct_balance(ctx.getCdactpr().getAct_curdebit().subtract(ctx.getCdactpr().getAct_curcredit()));
		}
	}

	/**
	 * Process operation GETACTION.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void GETACTION(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		/* FIXME BA:START PATCH V7-13641-GET-ACTION */
		// Get action from program call parameters
		String action = "stop";
		if (ctx.getParams() != null && ctx.getParams().containsKey("action")) {
			if (ctx.getParams().get("action") instanceof String actionParam) {
				if (actionParam.equalsIgnoreCase("start")) {
					action = "start";
				}
			}
		}
		ctx.getAction().setAction(action);

		/* BA:END PATCH V7-13641-GET-ACTION */
		ctx.getMessage().setMessage("");
		ctx.getShutdown().setShutdown(0);
	}

	/**
	 * Process operation GETMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void GETMESSAGE(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		ctx.getMessage().setMessage("");
		/* FIXME BA:START PATCH V7-13641-GET-MESSAGE */
		// Receive program message
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withFromMsgQueue(new Alphanumeric("CDBPL011M"))
		.withMsgAction(MessageAction.REMOVE.name())
		.withMsgKey("0001")
		.withMsgType(MessageType.INFO.name())
		.withData(ctx.getMessage())
		.receiveProgMsg();
		/* BA:END PATCH V7-13641-GET-MESSAGE */
		if (DataUtils.compare(ctx.getMessage().getMessageReference(), "*END") == 0) {
			ctx.getShutdown().setShutdown(1);
		}
	}

	/**
	 * Process operation PUTMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PUTMESSAGE(final Cdbpl011mContext ctx, final ExecutionController ctrl) {
		ctx.getMessage().setMessage("*END");
		/* FIXME BA:START PATCH V7-13641-PUT-MESSAGE */
		// Send program message to stop execution
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withToMsgQueue(Arrays.asList("CDBPL011M"))
		.withMsgType(MessageType.INFO.name())
		.withMsgKey("0001")
		.withData(ctx.getMessage().getMessageReference())
		.sendProgMsg();

		/* BA:END PATCH V7-13641-PUT-MESSAGE */
		ctx.getShutdown().setShutdown(1);
	}

}
