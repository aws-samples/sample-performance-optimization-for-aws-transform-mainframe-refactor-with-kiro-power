
package aws.bluage.carddemo.cdact02r.service.impl;

import aws.bluage.carddemo.cdact02r.business.context.Cdact02rContext;
import aws.bluage.carddemo.cdact02r.business.model.Cdact02rConstant;
import aws.bluage.carddemo.cdact02r.service.Cdact02rProcess;
import aws.bluage.carddemo.cdact02r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dConfirm;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dScrn1;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
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
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdact02rProcessImpl
 * 
 * Defines application services for Cdact02rProcess
 * @see Cdact02rProcess
 */
@Service("aws.bluage.carddemo.cdact02r.service.Cdact02rProcess")
@Import({
aws.bluage.carddemo.cdact02r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdact02rProcessImpl implements Cdact02rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdact02rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdact02rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		<--START COPYBOOK *LIBL/QCPYSRC COPYUTILPR -->
		** Test Numeric */
		ctx.getPacctnum().bind(ArgUtils.get(ctx, 0));
		ctx.getPviewonly().bind(ArgUtils.get(ctx, 1));
		ctx.getPgmstatus().setArgumentsCount(ctx.getArguments().length);
		ctx.getPgmstatus().setJobName(SharedContext.get().getJobName());
		ctx.getPgmstatus().setUserid(SharedContext.get().getUserName());
		if (ctx.isFirstRun()) {
			ctx.getIndds_pointer().setIndds_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDAct02D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCMR02)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCUSR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
			.withFileAddition()
			.open();
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
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDCUSR01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDCCMR02)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDAct02D")
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
	public void MAINCODE(final Cdact02rContext ctx, final ExecutionController ctrl) {
		/* 
		***************************************************************
		MAIN PROCESSING                                              *
		*************************************************************** */
		ctx.getSharedRecordFields().getDpgmqReference().setValue(ctx.getPgmstatus().getPgmnameReference());
		ctx.getScrn1().getDpgmnameReference().setValue(ctx.getPgmstatus().getPgmnameReference());
		WorkstationIO.newInstance(ctrl, ctx, Cdact02dMsgsflc.class, "CDACT02D")
		.fieldsToRecord(sbean -> toCDACT02D_MSGSFLC(ctx, ctrl, sbean))
		.write();
		if (ctx.getPacctnum().getPacctnum() == 0 && !(DataUtils.compare(ctx.getPviewonly().getPviewonlyReference(), "1") == 0)) {
			ctx.getIndds().setAddmode("1");
			DLCLEARSCREEN(ctx, ctrl);
		} else {
			ctx.getIndds().getViewonlyReference().setValue(ctx.getPviewonly().getPviewonlyReference());
			DLFILLSCREEN(ctx, ctrl);
			if (DataUtils.compare(ctx.getPviewonly().getPviewonlyReference(), "0") == 0) {
				DLSAVESTATE(ctx, ctrl);
			} 
		}
		while (1 == 1) {
			WorkstationIO.newInstance(ctrl, ctx, Cdact02dMsgsflc.class, "CDACT02D")
			.fieldsToRecord(sbean -> toCDACT02D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact02dScrn1.class, "CDACT02D")
			.fieldsToRecord(sbean -> toCDACT02D_SCRN1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact02dScrn1.class, "CDACT02D")
			.recordToFields(sbean -> fromCDACT02D_SCRN1(ctx, ctrl, sbean))
			.read();
			DataUtils.initialize(ctx.getErrorid().getErroridReference());
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.call("CDUTL02C");
			DLCLEARINDS(ctx, ctrl);
			if (DataUtils.compare(ctx.getIndds().getF2Reference(), "1") == 0) {
				DLCLEARSCREEN(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndds().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndds().getF12Reference(), "1") == 0) {
				break;
			} else if (DataUtils.compare(ctx.getIndds().getF4Reference(), "1") == 0 && DataUtils.compare(ctx.getIndds().getViewonlyReference(), "1") == 0) {
				DLPROMPT(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndds().getF4Reference(), "1") == 0) {
				DLPROMPTSEL(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndds().getCommandkeyReference(), "1") == 0) {
				
				/* 
				Ignore */
			} else {
				if (!(DataUtils.compare(ctx.getIndds().getAddmodeReference(), "1") == 0)) {
					DLCHECKCHANGE(ctx, ctrl);
					if (!(DataUtils.compare(ctx.getItemschanged().getItemschangedReference(), "1") == 0)) {
						continue;
					} 
				} 
				if (DataUtils.compare(ctx.getIndds().getAddmodeReference(), "1") == 0) {
					DLADD(ctx, ctrl);
					if (DataUtils.isBlankOrLowValues(ctx.getErrorid().getErrorid()) && !(DataUtils.compare(ctx.getIndds().getF12Reference(), "1") == 0)) {
						break;
					} 
				} else if (!(DataUtils.compare(ctx.getIndds().getViewonlyReference(), "1") == 0)) {
					DLUPDATE(ctx, ctrl);
				} 
			}
		}
		ctx.getInLR().setInLR("1");
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation DLSAVESTATE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLSAVESTATE(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getScreenstate().getDacctnumReference().setValue(ctx.getScrn1().getDacctnumReference());
		ctx.getScreenstate().getDacctgrpReference().setValue(ctx.getScrn1().getDacctgrpReference());
		ctx.getScreenstate().getDexpirydateReference().setValue(ctx.getScrn1().getDexpirydateReference());
		ctx.getScreenstate().getDcredlimitReference().setValue(ctx.getScrn1().getDcredlimitReference());
		ctx.getScreenstate().getDcashlimitReference().setValue(ctx.getScrn1().getDcashlimitReference());
		ctx.getScreenstate().getDpricustidReference().setValue(ctx.getScrn1().getDpricustidReference());
		ctx.getScreenstate().getDseccustidReference().setValue(ctx.getScrn1().getDseccustidReference());
	}

	/**
	 * Process operation DLCHECKCHANGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCHECKCHANGE(final Cdact02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getScreenstate().getDacctnumReference(), ctx.getScrn1().getDacctnumReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDacctgrpReference(), ctx.getScrn1().getDacctgrpReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDexpirydateReference(), ctx.getScrn1().getDexpirydateReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDcredlimitReference(), ctx.getScrn1().getDcredlimitReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDcashlimitReference(), ctx.getScrn1().getDcashlimitReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDpricustidReference(), ctx.getScrn1().getDpricustidReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDseccustidReference(), ctx.getScrn1().getDseccustidReference()) != 0) {
			ctx.getItemschanged().setItemschanged("1");
		}
	}

	/**
	 * Process operation DLFILLSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLFILLSCREEN(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getAcctnumReference().setValue(ctx.getPacctnum().getPacctnumReference());
		DAOManager.getDAO(ctx, FileIds.CDACTU01)
		.withRecord(ctx.getCdactpr())
		.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
		.withKeys(ctx.getSharedRecordFields().getAcctnum())
		.noLock()
		.retrieve();
		ctx.getScrn1().setDacctnum(NumberUtils.editC(ctx.getSharedRecordFields().getAcctnum(), "X", 12).trim());
		ctx.getScrn1().setDacctgrp(ctx.getCdactpr().getAcctgrp().trim());
		ctx.getScrn1().getDopendateReference().setValue(ctx.getCdactpr().getOpendateReference());
		ctx.getScrn1().getDexpirydateReference().setValue(ctx.getCdactpr().getExpirydateReference());
		if (DataUtils.compare(ctx.getCdactpr().getActiveReference(), "A") == 0) {
			ctx.getScrn1().setDstatus("ACTIVE");
			ctx.getIndds().setHighlightsts("0");
		} else if (DataUtils.compare(ctx.getCdactpr().getActiveReference(), "I") == 0) {
			ctx.getScrn1().setDstatus("INACTIVE");
			ctx.getIndds().setHighlightsts("1");
		} 
		if (DataUtils.compare(ctx.getIndds().getViewonlyReference(), "1") == 0) {
			if (NumberUtils.compare(ctx.getCdactpr().getCredlimit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcredlimitReference());
			} else {
				ctx.getScrn1().setDcredlimit(NumberUtils.editC(ctx.getCdactpr().getCredlimit(), "N", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getCashlimit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcashlimitReference());
			} else {
				ctx.getScrn1().setDcashlimit(NumberUtils.editC(ctx.getCdactpr().getCashlimit(), "N", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getBalance(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDbalanceReference());
			} else {
				ctx.getScrn1().setDbalance(NumberUtils.editC(ctx.getCdactpr().getBalance(), "N", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getCurcredit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcurcreditReference());
			} else {
				ctx.getScrn1().setDcurcredit(NumberUtils.editC(ctx.getCdactpr().getCurcredit(), "N", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getCurdebit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcurdebitReference());
			} else {
				ctx.getScrn1().setDcurdebit(NumberUtils.editC(ctx.getCdactpr().getCurdebit(), "N", 9).trim());
			}
		} else {
			if (NumberUtils.compare(ctx.getCdactpr().getCredlimit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcredlimitReference());
			} else {
				ctx.getScrn1().setDcredlimit(NumberUtils.editC(ctx.getCdactpr().getCredlimit(), "3", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getCashlimit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcashlimitReference());
			} else {
				ctx.getScrn1().setDcashlimit(NumberUtils.editC(ctx.getCdactpr().getCashlimit(), "3", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getBalance(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDbalanceReference());
			} else {
				ctx.getScrn1().setDbalance(NumberUtils.editC(ctx.getCdactpr().getBalance(), "3", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getCurcredit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcurcreditReference());
			} else {
				ctx.getScrn1().setDcurcredit(NumberUtils.editC(ctx.getCdactpr().getCurcredit(), "3", 9).trim());
			}
			if (NumberUtils.compare(ctx.getCdactpr().getCurdebit(), 0) == 0) {
				DataUtils.setToBlank(ctx.getScrn1().getDcurdebitReference());
			} else {
				ctx.getScrn1().setDcurdebit(NumberUtils.editC(ctx.getCdactpr().getCurdebit(), "3", 9).trim());
			}
		}
		ctx.getScrn1().setDpricustid(NumberUtils.editC(ctx.getCdactpr().getPricustid(), "X", 9).trim());
		if (ctx.getCdactpr().getSeccustid() == 0) {
			DataUtils.setToBlank(ctx.getScrn1().getDseccustidReference());
		} else {
			ctx.getScrn1().setDseccustid(NumberUtils.editC(ctx.getCdactpr().getSeccustid(), "X", 9).trim());
		}
		if (DataUtils.compare(ctx.getIndds().getViewonlyReference(), "1") == 0) {
			ctx.getIndds().setSeccustview("1");
		} else {
			DAOManager.getDAO(ctx, FileIds.CDCCMR02)
			.withKeys(ctx.getCdactpr().getSeccustid(), ctx.getSharedRecordFields().getAcctnum())
			.setOnGreaterOrEqual();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMR02).getEqualReference()) == 0) {
				ctx.getIndds().setSeccustview("1");
			} else {
				ctx.getIndds().setSeccustview("0");
			}
		}
		if (ctx.getCdactpr().getActcrtdt() != 0) {
			ctx.getScrn1().setDactcrtdt(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getCdactpr().getActcrtdt(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
		} 
		ctx.getScrn1().setDactcrttm(ctx.getCdactpr().getActcrttm());
		ctx.getScrn1().getDactcrtusrReference().setValue(ctx.getCdactpr().getActcrtusrReference());
		ctx.getScrn1().getDactcrtpgmReference().setValue(ctx.getCdactpr().getActcrtpgmReference());
		if (ctx.getCdactpr().getActchgdt() != 0) {
			ctx.getScrn1().setDactchgdt(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getCdactpr().getActchgdt(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
		} 
		ctx.getScrn1().setDactchgtm(ctx.getCdactpr().getActchgtm());
		ctx.getScrn1().getDactchgusrReference().setValue(ctx.getCdactpr().getActchgusrReference());
		ctx.getScrn1().getDactchgpgmReference().setValue(ctx.getCdactpr().getActchgpgmReference());
	}

	/**
	 * Process operation DLCLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCLEARSCREEN(final Cdact02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getIndds().getAddmodeReference(), "1") == 0) {
			DataUtils.setToBlank(ctx.getScrn1().getDacctnumReference());
			DataUtils.setToBlank(ctx.getScrn1().getDacctgrpReference());
			ctx.getScrn1().setDopendate(DateHelper.getDate("*ISO"));
			ctx.getScrn1().setDexpirydate("2099-12-31");
			DataUtils.setToBlank(ctx.getScrn1().getDcredlimitReference());
			DataUtils.setToBlank(ctx.getScrn1().getDcashlimitReference());
			DataUtils.setToBlank(ctx.getScrn1().getDbalanceReference());
			DataUtils.setToBlank(ctx.getScrn1().getDcurcreditReference());
			DataUtils.setToBlank(ctx.getScrn1().getDcurdebitReference());
			ctx.getScrn1().setDstatus("ACTIVE");
		} else {
			DLFILLSCREEN(ctx, ctrl);
		}
	}

	/**
	 * Process operation DLCLEARINDS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCLEARINDS(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getIndds().setAcctnumerr("0");
		ctx.getIndds().setExpirydateerr("0");
		ctx.getIndds().setAcctgrperr("0");
		ctx.getIndds().setCredlimiterr("0");
		ctx.getIndds().setCashlimiterr("0");
		ctx.getIndds().setPricusterr("0");
		ctx.getIndds().setPricustposito("0");
		ctx.getIndds().setSeccusterr("0");
		ctx.getIndds().setSeccustposito("0");
		ctx.getItemschanged().setItemschanged("0");
	}

	/**
	 * Process operation DLUPDATE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLUPDATE(final Cdact02rContext ctx, final ExecutionController ctrl) {
		DLCHECKINPUTS(ctx, ctrl);
		if (!(DataUtils.isBlankOrLowValues(ctx.getErrorid().getErrorid()))) {
			DLERROR(ctx, ctrl);
			return;
		} else {
			while (!(DataUtils.compare(ctx.getIndds().getF12Reference(), "1") == 0)) {
				WorkstationIO.newInstance(ctrl, ctx, Cdact02dConfirm.class, "CDACT02D")
				.fieldsToRecord(sbean -> toCDACT02D_CONFIRM(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdact02dConfirm.class, "CDACT02D")
				.recordToFields(sbean -> fromCDACT02D_CONFIRM(ctx, ctrl, sbean))
				.read();
				if (DataUtils.compare(ctx.getIndds().getF12Reference(), "1") == 0) {
					return;
				} else if (DataUtils.compare(ctx.getIndds().getCommandkeyReference(), "1") == 0) {
					continue;
				} else {
					break;
				}
			}
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withRecord(ctx.getCdactpr())
			.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
			.withKeys(ctx.getSharedRecordFields().getAcctnum())
			.retrieve();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTU01).getFoundReference()) == 0) {
				ctx.getSharedRecordFields().setAcctnum(NumberUtils.toDecimal(ctx.getScrn1().getDacctnum(), 12, 0, false).longValue());
				ctx.getCdactpr().setAcctgrp(ctx.getScrn1().getDacctgrp());
				ctx.getCdactpr().getOpendateReference().setValue(ctx.getScrn1().getDopendateReference());
				ctx.getCdactpr().getExpirydateReference().setValue(ctx.getScrn1().getDexpirydateReference());
				ctx.getCdactpr().setCredlimit(NumberUtils.toDecimal(ctx.getScrn1().getDcredlimit(), 9, 2, false));
				if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcashlimit()))) {
					ctx.getCdactpr().setCashlimit(NumberUtils.toDecimal(ctx.getScrn1().getDcashlimit(), 9, 2, false));
				} else {
					ctx.getCdactpr().setCashlimit(BigDecimal.ZERO);
				}
				if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDbalance()))) {
					ctx.getCdactpr().setBalance(NumberUtils.toDecimal(ctx.getScrn1().getDbalance(), 9, 2, false));
				} else {
					ctx.getCdactpr().setBalance(BigDecimal.ZERO);
				}
				if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcurcredit()))) {
					ctx.getCdactpr().setCurcredit(NumberUtils.toDecimal(ctx.getScrn1().getDcurcredit(), 9, 2, false));
				} else {
					ctx.getCdactpr().setCurcredit(BigDecimal.ZERO);
				}
				if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcurdebit()))) {
					ctx.getCdactpr().setCurdebit(NumberUtils.toDecimal(ctx.getScrn1().getDcurdebit(), 9, 2, false));
				} else {
					ctx.getCdactpr().setCurdebit(BigDecimal.ZERO);
				}
				ctx.getCdactpr().setPricustid(NumberUtils.toDecimal(ctx.getScrn1().getDpricustid(), 9, 0, false).intValue());
				if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDseccustid()))) {
					ctx.getCdactpr().setSeccustid(NumberUtils.toDecimal(ctx.getScrn1().getDseccustid(), 9, 0, false).intValue());
				} else {
					ctx.getCdactpr().setSeccustid(0);
				}
				ctx.getCdactpr().setActchgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
				ctx.getCdactpr().setActchgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
				ctx.getCdactpr().getActchgusrReference().setValue(ctx.getPgmstatus().getUseridReference());
				ctx.getCdactpr().getActchgpgmReference().setValue(ctx.getPgmstatus().getPgmnameReference());
				ctx.getScrn1().setDactchgdt(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getCdactpr().getActchgdt(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
				ctx.getScrn1().setDactchgtm(ctx.getCdactpr().getActchgtm());
				ctx.getScrn1().getDactchgusrReference().setValue(ctx.getCdactpr().getActchgusrReference());
				ctx.getScrn1().getDactchgpgmReference().setValue(ctx.getCdactpr().getActchgpgmReference());
				DAOManager.getDAO(ctx, FileIds.CDACTU01)
				.withRecord(ctx.getCdactpr())
				.withMapper(() -> this.outputCDACTPR(ctx, ctrl))
				.update();
				ctx.getErrorid().setErrorid("MSG0004");
				DLERROR(ctx, ctrl);
			} else {
				ctx.getErrorid().setErrorid("UNK0001");
				DLERROR(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLADD(final Cdact02rContext ctx, final ExecutionController ctrl) {
		DLFILLTABLE(ctx, ctrl);
		if (DataUtils.isBlankOrLowValues(ctx.getErrorid().getErrorid())) {
			while (!(DataUtils.compare(ctx.getIndds().getF12Reference(), "1") == 0)) {
				WorkstationIO.newInstance(ctrl, ctx, Cdact02dConfirm.class, "CDACT02D")
				.fieldsToRecord(sbean -> toCDACT02D_CONFIRM(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdact02dConfirm.class, "CDACT02D")
				.recordToFields(sbean -> fromCDACT02D_CONFIRM(ctx, ctrl, sbean))
				.read();
				if (!(DataUtils.compare(ctx.getIndds().getCommandkeyReference(), "1") == 0)) {
					ctx.getCdactpr().setActcrtdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
					ctx.getCdactpr().setActcrttm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
					ctx.getCdactpr().getActcrtusrReference().setValue(ctx.getPgmstatus().getUseridReference());
					ctx.getCdactpr().getActcrtpgmReference().setValue(ctx.getPgmstatus().getPgmnameReference());
					ctx.getCdactpr().setActchgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
					ctx.getCdactpr().setActchgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
					ctx.getCdactpr().getActchgusrReference().setValue(ctx.getPgmstatus().getUseridReference());
					ctx.getCdactpr().getActchgpgmReference().setValue(ctx.getPgmstatus().getPgmnameReference());
					DAOManager.getDAO(ctx, FileIds.CDACTU01)
					.withRecord(ctx.getCdactpr())
					.withMapper(() -> this.outputCDACTPR(ctx, ctrl))
					.write();
					break;
				} 
			}
		}
	}

	/**
	 * Process operation DLFILLTABLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLFILLTABLE(final Cdact02rContext ctx, final ExecutionController ctrl) {
		DLCHECKINPUTS(ctx, ctrl);
		if (!(DataUtils.isBlankOrLowValues(ctx.getErrorid().getErrorid()))) {
			DLERROR(ctx, ctrl);
			return;
		} else {
			ctx.getCdactpr().getOpendateReference().setValue(ctx.getScrn1().getDopendateReference());
			ctx.getCdactpr().getExpirydateReference().setValue(ctx.getScrn1().getDexpirydateReference());
			ctx.getCdactpr().setActive("A");
		}
	}

	/**
	 * Process operation DLCHECKINPUTS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCHECKINPUTS(final Cdact02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDacctnum())) {
			ctx.getIndds().setAcctnumerr("1");
			ctx.getErrorid().setErrorid("ERR0006");
			return;
		} else {
			ctx.getTeststring().setTeststring(ctx.getScrn1().getDacctnum().trim());
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getTeststring().getTeststringReference())
			.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
			.call("ISNUMERIC");
			if (DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0) {
				ctx.getSharedRecordFields().setAcctnum(NumberUtils.toDecimal(ctx.getScrn1().getDacctnum(), 15, 0, false).longValue());
				if (DataUtils.compare(ctx.getIndds().getAddmodeReference(), "1") == 0) {
					DAOManager.getDAO(ctx, FileIds.CDACTU01)
					.withKeys(ctx.getSharedRecordFields().getAcctnum())
					.setOnGreaterOrEqual();
					if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTU01).getEqualReference()) == 0) {
						ctx.getIndds().setAcctnumerr("1");
						ctx.getErrorid().setErrorid("ERR0033");
						return;
					} 
				} 
				if (DataUtils.compare(ctx.getScrn1().getDexpirydateReference(), DateHelper.getDate("*ISO")) < 0 && DataUtils.compare(ctx.getScrn1().getDexpirydateReference(), ctx.getCdactpr().getExpirydateReference()) != 0) {
					ctx.getIndds().setExpirydateerr("1");
					ctx.getErrorid().setErrorid("ERR0018");
					return;
				} else {
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDpricustid())) {
						ctx.getIndds().setPricusterr("1");
						ctx.getIndds().setPricustposito("1");
						ctx.getErrorid().setErrorid("ERR0008");
						return;
					} else {
						ctx.getTeststring().setTeststring(ctx.getScrn1().getDpricustid().trim());
						CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
						.byReference(ctx.getTeststring().getTeststringReference())
						.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
						.call("ISNUMERIC");
						if (DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0) {
							ctx.getCdactpr().setPricustid(NumberUtils.toDecimal(ctx.getScrn1().getDpricustid(), 9, 0, false).intValue());
							if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDseccustid()))) {
								ctx.getTeststring().setTeststring(ctx.getScrn1().getDseccustid().trim());
								CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
								.byReference(ctx.getTeststring().getTeststringReference())
								.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
								.call("ISNUMERIC");
								if (DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0) {
									ctx.getCdactpr().setSeccustid(NumberUtils.toDecimal(ctx.getScrn1().getDseccustid(), 9, 0, false).intValue());
								} else {
									CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
									.call("CDUTL02C");
									ctx.getIndds().setSeccusterr("1");
									ctx.getIndds().setSeccustposito("1");
									ctx.getErrorid().setErrorid("ERR0004");
									return;
								}
							} else {
								ctx.getCdactpr().setSeccustid(0);
							}
							if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDseccustid()))) {
								if (NumberUtils.compare(NumberUtils.toDecimal(ctx.getScrn1().getDpricustid(), 9, 0, false), NumberUtils.toDecimal(ctx.getScrn1().getDseccustid(), 9, 0, false)) == 0) {
									ctx.getIndds().setPricusterr("1");
									ctx.getIndds().setPricustposito("1");
									ctx.getIndds().setSeccusterr("1");
									ctx.getIndds().setSeccustposito("1");
									ctx.getErrorid().setErrorid("ERR0066");
									return;
								} 
							} 
							DAOManager.getDAO(ctx, FileIds.CDCUSR01)
							.withRecord(ctx.getCdcuspr())
							.withMapper(() -> this.inputCDCUSPR(ctx, ctrl))
							.withKeys(ctx.getCdactpr().getPricustid())
							.retrieve();
							if (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSR01).getFoundReference()) == 0)) {
								ctx.getIndds().setPricusterr("1");
								ctx.getIndds().setPricustposito("1");
								ctx.getErrorid().setErrorid("ERR0009");
								return;
							} else {
								if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDseccustid()))) {
									DAOManager.getDAO(ctx, FileIds.CDCUSR01)
									.withRecord(ctx.getCdcuspr())
									.withMapper(() -> this.inputCDCUSPR(ctx, ctrl))
									.withKeys(ctx.getCdactpr().getSeccustid())
									.retrieve();
									if (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSR01).getFoundReference()) == 0)) {
										ctx.getIndds().setSeccusterr("1");
										ctx.getIndds().setSeccustposito("1");
										ctx.getErrorid().setErrorid("ERR0009");
										return;
									} 
								} 
								if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcredlimit())) {
									ctx.getIndds().setCredlimiterr("1");
									ctx.getErrorid().setErrorid("ERR0007");
									return;
								} else {
									ctx.getTeststring().setTeststring(ctx.getScrn1().getDcredlimit().trim());
									CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
									.byReference(ctx.getTeststring().getTeststringReference())
									.byReference(ctx.getISCURRENCYReturn().getISCURRENCYReturnReference())
									.call("ISCURRENCY");
									if (DataUtils.compare(ctx.getISCURRENCYReturn().getISCURRENCYReturnReference(), "1") == 0) {
										ctx.getTestnumeric().setTestnumeric(NumberUtils.toDecimal(ctx.getScrn1().getDcredlimit(), 15, 2, false));
										if (NumberUtils.compare(ctx.getTestnumeric().getTestnumeric(), Cdact02rConstant.CONST_9999999) > 0) {
											ctx.getErrorid().setErrorid("ERR0020");
											ctx.getIndds().setCredlimiterr("1");
											return;
										} else {
											ctx.getCdactpr().setCredlimit(NumberUtils.toDecimal(ctx.getScrn1().getDcredlimit(), 9, 2, false));
											if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcashlimit()))) {
												ctx.getTeststring().setTeststring(ctx.getScrn1().getDcashlimit().trim());
												CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
												.byReference(ctx.getTeststring().getTeststringReference())
												.byReference(ctx.getISCURRENCYReturn().getISCURRENCYReturnReference())
												.call("ISCURRENCY");
												if (DataUtils.compare(ctx.getISCURRENCYReturn().getISCURRENCYReturnReference(), "1") == 0) {
													ctx.getTestnumeric().setTestnumeric(NumberUtils.toDecimal(ctx.getScrn1().getDcashlimit(), 15, 2, false));
													if (NumberUtils.compare(ctx.getTestnumeric().getTestnumeric(), Cdact02rConstant.CONST_9999999) > 0) {
														ctx.getErrorid().setErrorid("ERR0020");
														ctx.getIndds().setCashlimiterr("1");
														return;
													} else {
														ctx.getCdactpr().setCashlimit(NumberUtils.toDecimal(ctx.getScrn1().getDcashlimit(), 9, 2, false));
													}
												} else {
													CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
													.call("CDUTL02C");
													ctx.getIndds().setCashlimiterr("1");
													ctx.getErrorid().setErrorid("ERR0015");
													return;
												}
											} else {
												ctx.getCdactpr().setCashlimit(BigDecimal.ZERO);
											}
											if (NumberUtils.compare(ctx.getCdactpr().getCashlimit(), ctx.getCdactpr().getCredlimit()) > 0) {
												ctx.getIndds().setCashlimiterr("1");
												ctx.getErrorid().setErrorid("ERR0017");
												return;
											} else {
												ctx.getCdactpr().setAcctgrp(ctx.getScrn1().getDacctgrp());
											}
										}
									} else {
										CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
										.call("CDUTL02C");
										ctx.getIndds().setCredlimiterr("1");
										ctx.getErrorid().setErrorid("ERR0015");
										return;
									}
								}
							}
						} else {
							CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
							.call("CDUTL02C");
							ctx.getIndds().setPricusterr("1");
							ctx.getIndds().setPricustposito("1");
							ctx.getErrorid().setErrorid("ERR0004");
							return;
						}
					}
				}
			} else {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDUTL02C");
				ctx.getIndds().setAcctnumerr("1");
				ctx.getErrorid().setErrorid("ERR0004");
				return;
			}
		}
	}

	/**
	 * Process operation DLPROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPROMPT(final Cdact02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare("PRICUSTID", ctx.getScrn1().getDcsrfldReference()) == 0 && !(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDpricustid()))) {
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getCdactpr().getPricustidReference(),
				ctx.getIndds().getAlwaysonReference())
			.call("CDCUS02R");
			ctx.getIndds().setPricustposito("1");
		} else if (DataUtils.compare("SECCUSTID", ctx.getScrn1().getDcsrfldReference()) == 0 && !(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDseccustid()))) {
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getCdactpr().getSeccustidReference(),
				ctx.getIndds().getAlwaysonReference())
			.call("CDCUS02R");
			ctx.getIndds().setSeccustposito("1");
		}
	}

	/**
	 * Process operation DLPROMPTSEL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPROMPTSEL(final Cdact02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare("PRICUSTID", ctx.getScrn1().getDcsrfldReference()) == 0) {
			if (DataUtils.compare(ctx.getIndds().getAddmodeReference(), "0") == 0) {
				if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDpricustid()))) {
					CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
					.byReference(ctx.getCdactpr().getPricustidReference(),
						ctx.getIndds().getAlwaysonReference())
					.call("CDCUS02R");
				} 
			} else {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.byReference(ctx.getScrn1().getDpricustidReference())
				.call("CDCUS03R");
				ctx.getIndds().setPricustposito("1");
			}
		} else if (DataUtils.compare("SECCUSTID", ctx.getScrn1().getDcsrfldReference()) == 0) {
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getScrn1().getDseccustidReference())
			.call("CDCUS03R");
			ctx.getIndds().setSeccustposito("1");
		}
	}

	/**
	 * Process operation DLERROR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLERROR(final Cdact02rContext ctx, final ExecutionController ctrl) {
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getErrorid().getErroridReference(),
			ctx.getSharedRecordFields().getDpgmqReference())
		.call("CDUTL01C");
	}

	/**
	 * Process operation fromCDACT02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT02D_SCRN1(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dScrn1 vo) {
		mapper.applyCdact02dScrn1MiscIn(ctx, ctrl, vo);
		mapper.updateScrn1FromCdact02dScrn1(ctx, ctrl, vo, ctx.getScrn1());
	}

	/**
	 * Process operation toCDACT02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT02D_SCRN1(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dScrn1 vo) {
		mapper.updateCdact02dScrn1FromScrn1(ctx, ctrl, ctx.getScrn1(), vo);
		mapper.applyCdact02dScrn1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDACT02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT02D_CONFIRM(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dConfirm vo) {
		mapper.applyCdact02dConfirmMiscIn(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDACT02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT02D_CONFIRM(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dConfirm vo) {
		mapper.applyCdact02dConfirmMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDACT02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT02D_MSGSFL(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdact02dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdact02dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDACT02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT02D_MSGSFLC(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dMsgsflc vo) {
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
				WorkstationIO.newInstance(ctrl, ctx, Cdact02dMsgsfl.class, "CDACT02D")
				.fieldsToRecord(sbean -> toCDACT02D_MSGSFL(ctx, ctrl, sbean))
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
		mapper.updateCdact02dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdact02dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation inputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDACTPR(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getAcctnumReference().setValue(ctx.getCdactpr().getAcctnumReference());
	}

	/**
	 * Process operation inputCDCUSPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDCUSPR(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getCustidReference().setValue(ctx.getCdcuspr().getCustidReference());
	}

	/**
	 * Process operation outputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputCDACTPR(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getCdactpr().getAcctnumReference().setValue(ctx.getSharedRecordFields().getAcctnumReference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdact02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

}
