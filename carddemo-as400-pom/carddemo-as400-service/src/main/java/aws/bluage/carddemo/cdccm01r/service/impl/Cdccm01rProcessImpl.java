
package aws.bluage.carddemo.cdccm01r.service.impl;

import aws.bluage.carddemo.cdccm01r.business.ValSrcCtl.Wteststring;
import aws.bluage.carddemo.cdccm01r.business.context.Cdccm01rContext;
import aws.bluage.carddemo.cdccm01r.service.Cdccm01rProcess;
import aws.bluage.carddemo.cdccm01r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dDelerrwin;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dDelwin;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dSfl1;
import aws.bluage.carddemo.common.business.screen.support.Cdccm01dStatuswin;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedBigInteger;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedLong;
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
import java.math.BigInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdccm01rProcessImpl
 * 
 * Defines application services for Cdccm01rProcess
 * @see Cdccm01rProcess
 */
@Service("aws.bluage.carddemo.cdccm01r.service.Cdccm01rProcess")
@Import({
aws.bluage.carddemo.cdccm01r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdccm01rProcessImpl implements Cdccm01rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdccm01rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		- - - - - - - - - - - - - - - *
		Procedure Definitions
		- - - - - - - - - - - - - - - * */
		ctx.getMypsds().setParms(ctx.getArguments().length);
		ctx.getMypsds().setJob_name(SharedContext.get().getJobName());
		ctx.getMypsds().setUser(SharedContext.get().getUserName());
		if (ctx.isFirstRun()) {
			ctx.getIndicatords_pointer().setIndicatords_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDCCM01D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCMU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
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
			DAOManager.getDAO(ctx, FileIds.CDCCMU01)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDCCM01D")
			.keep()
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
	public void MAINCODE(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getMypsds().setRoutine("*TOTC");
		
		/* 
		- - - - - - - - - - - - - - - *
		Main Processing
		- - - - - - - - - - - - - - - * */
		ctx.getHeader1().getDpgmnameReference().setValue(ctx.getMypsds().getProc_nameReference());
		ctx.getSharedRecordFields().getDpgmqReference().setValue(ctx.getMypsds().getProc_nameReference());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.call("CDUTL02C");
		DAOManager.getDAO(ctx, FileIds.CDCCMU01)
		.withLowValueKeys()
		.setOnGreaterOrEqual();
		LOADSFL(ctx, ctrl);
		while (0 == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader1.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader2.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_HEADER2(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dFooter.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_FOOTER(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dMsgsflc.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			if (DataUtils.compare(ctx.getIndicatords().getSflemptyReference(), "1") == 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dEmpty.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_EMPTY(ctx, ctrl, sbean))
				.write();
			} 
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dCtl1.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_CTL1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dCtl1.class, "CDCCM01D")
			.recordToFields(sbean -> fromCDCCM01D_CTL1(ctx, ctrl, sbean))
			.read();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader2.class, "CDCCM01D")
			.recordToFields(sbean -> fromCDCCM01D_HEADER2(ctx, ctrl, sbean))
			.read();
			ctx.getIndicatords().setPositionerr("0");
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.call("CDUTL02C");
			if (DataUtils.compare(ctx.getIndicatords().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndicatords().getF12Reference(), "1") == 0) {
				break;
			} else if (DataUtils.compare(ctx.getIndicatords().getF5Reference(), "1") == 0) {
				ctx.getWfirstkey().getWfirstkeyReference().setBytes(Record.LOW_VALUES);
				REFRESH(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getF6Reference(), "1") == 0) {
				ADDCARD(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getPgupReference(), "1") == 0) {
				LOADPREV(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getPgdnReference(), "1") == 0) {
				LOADNEXT(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getCommandkeyReference(), "1") == 0) {
				
				/* 
				//Ignore */
			} else {
				HANDLEENTER(ctx, ctrl);
			}
		}
		ctx.getInLR().setInLR("1");
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation LOADSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADSFL(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatords().setSflinit("0");
		ctx.getIndicatords().setSflreset("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdccm01dCtl1.class, "CDCCM01D")
		.fieldsToRecord(sbean -> toCDCCM01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatords().setSflreset("0");
		ctx.getIndicatords().setSflempty("0");
		ctx.getCtl1().setDsflrrn(1);
		DAOManager.getDAO(ctx, FileIds.CDCCMU01)
		.withRecord(ctx.getCdccmpr())
		.noLock()
		.readCurrentRecord();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMU01).getEofReference()) == 0) {
			ctx.getCtl1().setDsflrrn(0);
			DataUtils.setToHighValues(ctx.getCdccmpr().getCardnumReference());
		} 
		ctx.getWfirstkey().getWfirstkeyReference().setValue(ctx.getCdccmpr().getCardnumReference());
		DataUtils.setToHighValues(ctx.getWlastkey().getWlastkeyReference());
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMU01).getEofReference()) == 0) && NumberUtils.le(ctx.getCtl1().getDsflrrnReference(), ctx.getCsflsize().getCsflsizeReference())) {
			ctx.getSharedRecordFields().setDcardnum(ctx.getCdccmpr().getCardnum());
			ctx.getSharedRecordFields().setDcustid(NumberUtils.editC(ctx.getCdccmpr().getCustid(), "X", 9).trim());
			ctx.getSharedRecordFields().setDacctnum(NumberUtils.editC(ctx.getCdccmpr().getAcctnum(), "X", 12).trim());
			ctx.getSfl1().getDprimarysecReference().setValue(ctx.getCdccmpr().getPrimarysecReference());
			ctx.getSharedRecordFields().getDstatusReference().setValue(ctx.getCdccmpr().getStatusReference());
			DataUtils.setToBlank(ctx.getSfl1().getDoptionReference());
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dSfl1.class, "CDCCM01D")
			.withRRN(ctx.getCtl1().getDsflrrnReference())
			.fieldsToRecord(sbean -> toCDCCM01D_SFL1(ctx, ctrl, sbean))
			.write();
			DAOManager.getDAO(ctx, FileIds.CDCCMU01)
			.withRecord(ctx.getCdccmpr())
			.noLock()
			.readCurrentRecord();
			ctx.getCtl1().setDsflrrn(ctx.getCtl1().getDsflrrn() + 1);
			ctx.getWlastkey().getWlastkeyReference().setValue(ctx.getCdccmpr().getCardnumReference());
		}
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMU01).getEofReference()) == 0) {
			ctx.getIndicatords().setSflend("1");
		} else {
			ctx.getIndicatords().setSflend("0");
		}
		if (DataUtils.compare(ctx.getIndicatords().getSflendReference(), "1") == 0) {
			DataUtils.setToHighValues(ctx.getWlastkey().getWlastkeyReference());
		} 
		if (NumberUtils.eq(ctx.getCtl1().getDsflrrnReference(), 0)) {
			ctx.getIndicatords().setSflreset("1");
			ctx.getIndicatords().setSflinit("1");
			ctx.getIndicatords().setSflempty("1");
		} else {
			ctx.getIndicatords().setSflinit("0");
			ctx.getCtl1().setDsflrrn(1);
		}
	}

	/**
	 * Process operation LOADNEXT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADNEXT(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getIndicatords().getSflendReference(), "1") == 0) {
			return;
		} else {
			DAOManager.getDAO(ctx, FileIds.CDCCMU01)
			.withKeys(ctx.getWlastkey().getWlastkey())
			.setOnGreaterOrEqual();
			LOADSFL(ctx, ctrl);
		}
	}

	/**
	 * Process operation LOADPREV.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADPREV(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		PackedInt i = PackedDecimal.build(2, 0, true, 0);
		Alphanumeric sFLTOP = new Alphanumeric(1, " ");
		DAOManager.getDAO(ctx, FileIds.CDCCMU01)
		.withKeys(ctx.getWfirstkey().getWfirstkey())
		.setOnGreaterOrEqual();
		i.set(0);
		while (i.get() <= ctx.getCsflsize().getCsflsize()) {
			DAOManager.getDAO(ctx, FileIds.CDCCMU01)
			.withRecord(ctx.getCdccmpr())
			.noLock()
			.readPriorRecord();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMU01).getEofReference()) == 0) {
				DAOManager.getDAO(ctx, FileIds.CDCCMU01)
				.withLowValueKeys()
				.setOnGreaterOrEqual();
				if (i.get() == 0) {
					sFLTOP.set("Y");
				} 
				break;
			} else {
				i.set(i.get() + 1);
			}
		}
		if (DataUtils.compare(" ", sFLTOP.get()) == 0) {
			LOADSFL(ctx, ctrl);
		}
	}

	/**
	 * Process operation REFRESH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void REFRESH(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		DataUtils.initialize(ctx.getHeader2().getDpositionReference());
		DAOManager.getDAO(ctx, FileIds.CDCCMU01)
		.withKeys(ctx.getWfirstkey().getWfirstkey())
		.setOnGreaterOrEqual();
		LOADSFL(ctx, ctrl);
	}

	/**
	 * Process operation HANDLEENTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void HANDLEENTER(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		PackedInt eRRSRCCTL = PackedDecimal.build(1, 0, true, 0);
		ctx.getWposition().getWpositionReference().setValue(ctx.getHeader2().getDpositionReference());
		eRRSRCCTL.set(0);
		if (!(DataUtils.isBlankOrLowValues(ctx.getWposition().getWposition()))) {
			VALSRCCTL(ctx, ctrl, eRRSRCCTL.getRecord());
		} 
		if (eRRSRCCTL.get() == 0) {
			SFLOPTIONS(ctx, ctrl);
			if (!(DataUtils.isBlankOrLowValues(ctx.getWposition().getWposition()))) {
				POSITIONTO(ctx, ctrl);
			} 
		}
	}

	/**
	 * Process operation VALSRCCTL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pERRSRCCTL 
	 */
	@Override
	public void VALSRCCTL(final Cdccm01rContext ctx, final ExecutionController ctrl, final Record pERRSRCCTL) {
		PackedInt eRRSRCCTL = PackedDecimal.build(1, 0, true, pERRSRCCTL);
		Alphanumeric wCLEANVALUE = new Alphanumeric(19, " ");
		Wteststring wTESTSTRING = new Wteststring(ctx.getConfiguration());
		PackedBigInteger tEMP = PackedDecimal.build(19, 0, true, 0);
		Alphanumeric eRROR = new Alphanumeric(1, " ");
		ctx.getCtl1().setDrow(0);
		ctx.getCtl1().setDcol(0);
		wCLEANVALUE.set(StringUtils.replace(ctx.getHeader2().getDposition(),"-",""));
		wTESTSTRING.setWteststring(wCLEANVALUE.get());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wTESTSTRING.getWteststringReference())
		.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
		.call("ISNUMERIC");
		if (DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0) {
			try {
				tEMP.set(NumberUtils.toDecimal(wCLEANVALUE.get(), 19, 0, false).toBigInteger());
			} catch (RuntimeException e) {
				eRROR.set("Y");
			}
		} else {
			eRROR.set("Y");
		}
		if (DataUtils.compare("Y", eRROR.get()) == 0) {
			ctx.getSHOWMESSAGEParam0().setSHOWMESSAGEParam0("ERR0016");
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getSHOWMESSAGEParam0().getSHOWMESSAGEParam0Reference(),
				ctx.getSharedRecordFields().getDpgmqReference())
			.call("CDUTL01C");
			ctx.getCtl1().setDrow(5);
			ctx.getCtl1().setDcol(5);
			ctx.getIndicatords().setPositionerr("1");
			eRRSRCCTL.set(1);
			return;
		} else {
			return;
		}
	}

	/**
	 * Process operation POSITIONTO.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void POSITIONTO(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		Alphanumeric wCLEANVALUE = new Alphanumeric(19, " ");
		wCLEANVALUE.set(StringUtils.replace(ctx.getWposition().getWposition(),"-",""));
		if (NumberUtils.compare(NumberUtils.toDecimal(wCLEANVALUE.get(), 19, 0, false), 9999999999999999L) > 0) {
			DataUtils.setToHighValues(ctx.getWfirstkey().getWfirstkeyReference());
		} else {
			ctx.getWfirstkey().setWfirstkey(NumberUtils.toDecimal(wCLEANVALUE.get(), 16, 0, false).longValue());
		}
		REFRESH(ctx, ctrl);
	}

	/**
	 * Process operation SFLOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void SFLOPTIONS(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		WorkstationIO.newInstance(ctrl, ctx, Cdccm01dSfl1.class, "CDCCM01D")
		.withRRN(ctx.getCtl1().getDsflrrnReference())
		.recordToFields(sbean -> fromCDCCM01D_SFL1(ctx, ctrl, sbean))
		.readNextChangedRecord();
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators().getEofReference()) == 0)) {
			HANDLEOPTIONS(ctx, ctrl);
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dSfl1.class, "CDCCM01D")
			.withRRN(ctx.getCtl1().getDsflrrnReference())
			.recordToFields(sbean -> fromCDCCM01D_SFL1(ctx, ctrl, sbean))
			.readNextChangedRecord();
		}
		REFRESH(ctx, ctrl);
	}

	/**
	 * Process operation ADDCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void ADDCARD(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		PackedLong wCARDNUMBER = PackedDecimal.build(16, 0, true, 0);
		Alphanumeric wVIEWONLY = new Alphanumeric(1, "0");
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wCARDNUMBER,
			wVIEWONLY)
		.call("CDCCM02R");
		REFRESH(ctx, ctrl);
	}

	/**
	 * Process operation EDITCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void EDITCARD(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		PackedLong wCARDNUMBER = PackedDecimal.build(16, 0, true, 0);
		Alphanumeric wVIEWONLY = new Alphanumeric(1, "0");
		wCARDNUMBER.set(ctx.getSharedRecordFields().getDcardnum());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wCARDNUMBER,
			wVIEWONLY)
		.call("CDCCM02R");
	}

	/**
	 * Process operation DEACTIVATECARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DEACTIVATECARD(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		while (!(DataUtils.compare(ctx.getIndicatords().getF12Reference(), "1") == 0)) {
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader1.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelwin.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_DELWIN(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelwin.class, "CDCCM01D")
			.recordToFields(sbean -> fromCDCCM01D_DELWIN(ctx, ctrl, sbean))
			.read();
			if (DataUtils.compare(ctx.getIndicatords().getCommandkeyReference(), "1") == 0) {
				continue;
			} else {
				DAOManager.getDAO(ctx, FileIds.CDCCMU01)
				.withRecord(ctx.getCdccmpr())
				.withKeys(ctx.getSharedRecordFields().getDcardnum())
				.handleErrors()
				.retrieve();
				if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0)) {
					ctx.getCdccmpr().setStatus("D");
					ctx.getCdccmpr().setCcmchgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
					ctx.getCdccmpr().setCcmchgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
					ctx.getCdccmpr().getCcmchgusrReference().setValue(ctx.getMypsds().getUserReference());
					ctx.getCdccmpr().getCcmchgpgmReference().setValue(ctx.getMypsds().getProc_nameReference());
					DAOManager.getDAO(ctx, FileIds.CDCCMU01)
					.withRecord(ctx.getCdccmpr())
					.update();
					break;
				} else {
					continue;
				}
			}
		}
	}

	/**
	 * Process operation VIEWCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void VIEWCARD(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		PackedLong wCARDNUMBER = PackedDecimal.build(16, 0, true, 0);
		Alphanumeric wVIEWONLY = new Alphanumeric(1, "1");
		wCARDNUMBER.set(ctx.getSharedRecordFields().getDcardnum());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wCARDNUMBER,
			wVIEWONLY)
		.call("CDCCM02R");
	}

	/**
	 * Process operation CARDSTATUS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CARDSTATUS(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare("G", ctx.getSharedRecordFields().getDstatusReference()) == 0 || DataUtils.compare("H", ctx.getSharedRecordFields().getDstatusReference()) == 0) {
			ctx.getStatuswin().setDupdatetype("Activate Card");
		} else if (DataUtils.compare("A", ctx.getSharedRecordFields().getDstatusReference()) == 0) {
			ctx.getStatuswin().setDupdatetype("Put Card on Hold");
		} 
		while (!(DataUtils.compare(ctx.getIndicatords().getF12Reference(), "1") == 0)) {
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader1.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dStatuswin.class, "CDCCM01D")
			.fieldsToRecord(sbean -> toCDCCM01D_STATUSWIN(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdccm01dStatuswin.class, "CDCCM01D")
			.recordToFields(sbean -> fromCDCCM01D_STATUSWIN(ctx, ctrl, sbean))
			.read();
			if (DataUtils.compare(ctx.getIndicatords().getCommandkeyReference(), "1") == 0) {
				continue;
			} else {
				DAOManager.getDAO(ctx, FileIds.CDCCMU01)
				.withRecord(ctx.getCdccmpr())
				.withKeys(ctx.getSharedRecordFields().getDcardnum())
				.handleErrors()
				.retrieve();
				if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0)) {
					if (DataUtils.compare("G", ctx.getCdccmpr().getStatusReference()) == 0 || DataUtils.compare("H", ctx.getCdccmpr().getStatusReference()) == 0) {
						ctx.getCdccmpr().setStatus("A");
					} else if (DataUtils.compare("A", ctx.getCdccmpr().getStatusReference()) == 0) {
						ctx.getCdccmpr().setStatus("H");
					} 
					ctx.getCdccmpr().setCcmchgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
					ctx.getCdccmpr().setCcmchgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
					ctx.getCdccmpr().getCcmchgusrReference().setValue(ctx.getMypsds().getUserReference());
					ctx.getCdccmpr().getCcmchgpgmReference().setValue(ctx.getMypsds().getProc_nameReference());
					DAOManager.getDAO(ctx, FileIds.CDCCMU01)
					.withRecord(ctx.getCdccmpr())
					.update();
					break;
				} else {
					continue;
				}
			}
		}
	}

	/**
	 * Process operation HANDLEOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void HANDLEOPTIONS(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "2") == 0) {
			if (DataUtils.compare("D", ctx.getSharedRecordFields().getDstatusReference()) == 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader1.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_HEADER1(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelerrwin.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_DELERRWIN(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelerrwin.class, "CDCCM01D")
				.recordToFields(sbean -> fromCDCCM01D_DELERRWIN(ctx, ctrl, sbean))
				.read();
			} else {
				EDITCARD(ctx, ctrl);
			}
		} else if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "4") == 0) {
			if (DataUtils.compare("D", ctx.getSharedRecordFields().getDstatusReference()) == 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader1.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_HEADER1(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelerrwin.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_DELERRWIN(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelerrwin.class, "CDCCM01D")
				.recordToFields(sbean -> fromCDCCM01D_DELERRWIN(ctx, ctrl, sbean))
				.read();
			} else {
				DEACTIVATECARD(ctx, ctrl);
			}
		} else if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "5") == 0) {
			VIEWCARD(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "7") == 0) {
			if (DataUtils.compare("D", ctx.getSharedRecordFields().getDstatusReference()) == 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dHeader1.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_HEADER1(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelerrwin.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_DELERRWIN(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dDelerrwin.class, "CDCCM01D")
				.recordToFields(sbean -> fromCDCCM01D_DELERRWIN(ctx, ctrl, sbean))
				.read();
			} else {
				CARDSTATUS(ctx, ctrl);
			}
		} else if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "9") == 0) {
			ctx.getDcardnumparam().setDcardnumparam(ctx.getSharedRecordFields().getDcardnum());
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getDcardnumparam().getDcardnumparamReference())
			.call("CDCCA01R");
			ctx.getSharedRecordFields().setDcardnum(ctx.getDcardnumparam().getDcardnumparam());
		}
	}

	/**
	 * Process operation toCDCCM01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_HEADER1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dHeader1 vo) {
		mapper.updateCdccm01dHeader1FromHeader1(ctx, ctrl, ctx.getHeader1(), vo);
		mapper.applyCdccm01dHeader1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCM01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM01D_HEADER2(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dHeader2 vo) {
		mapper.applyCdccm01dHeader2MiscIn(ctx, ctrl, vo);
		mapper.updateHeader2FromCdccm01dHeader2(ctx, ctrl, vo, ctx.getHeader2());
	}

	/**
	 * Process operation toCDCCM01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_HEADER2(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dHeader2 vo) {
		mapper.updateCdccm01dHeader2FromHeader2(ctx, ctrl, ctx.getHeader2(), vo);
		mapper.applyCdccm01dHeader2MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCM01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM01D_SFL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dSfl1 vo) {
		mapper.updateSfl1FromCdccm01dSfl1(ctx, ctrl, vo, ctx.getSfl1());
		inputSFL1(ctx, ctrl);
	}

	/**
	 * Process operation toCDCCM01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_SFL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dSfl1 vo) {
		outputSFL1(ctx, ctrl);
		mapper.updateCdccm01dSfl1FromSfl1(ctx, ctrl, ctx.getSfl1(), vo);
		mapper.applyCdccm01dSfl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCM01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM01D_CTL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dCtl1 vo) {
		mapper.applyCdccm01dCtl1MiscIn(ctx, ctrl, vo);
		mapper.updateCtl1FromCdccm01dCtl1(ctx, ctrl, vo, ctx.getCtl1());
	}

	/**
	 * Process operation toCDCCM01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_CTL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dCtl1 vo) {
		mapper.updateCdccm01dCtl1FromCtl1(ctx, ctrl, ctx.getCtl1(), vo);
		mapper.applyCdccm01dCtl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCM01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_FOOTER(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dFooter vo) {
		mapper.applyCdccm01dFooterMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCM01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM01D_DELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelwin vo) {
		mapper.applyCdccm01dDelwinMiscIn(ctx, ctrl, vo);
		mapper.updateDelwinFromCdccm01dDelwin(ctx, ctrl, vo, ctx.getDelwin());
		inputDELWIN(ctx, ctrl);
	}

	/**
	 * Process operation toCDCCM01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_DELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelwin vo) {
		outputDELWIN(ctx, ctrl);
		mapper.updateCdccm01dDelwinFromDelwin(ctx, ctrl, ctx.getDelwin(), vo);
		mapper.applyCdccm01dDelwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCM01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM01D_DELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelerrwin vo) {
		mapper.applyCdccm01dDelerrwinMiscIn(ctx, ctrl, vo);
		mapper.updateDelerrwinFromCdccm01dDelerrwin(ctx, ctrl, vo, ctx.getDelerrwin());
		inputDELERRWIN(ctx, ctrl);
	}

	/**
	 * Process operation toCDCCM01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_DELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelerrwin vo) {
		outputDELERRWIN(ctx, ctrl);
		mapper.updateCdccm01dDelerrwinFromDelerrwin(ctx, ctrl, ctx.getDelerrwin(), vo);
		mapper.applyCdccm01dDelerrwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCCM01D_STATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCCM01D_STATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dStatuswin vo) {
		mapper.applyCdccm01dStatuswinMiscIn(ctx, ctrl, vo);
		mapper.updateStatuswinFromCdccm01dStatuswin(ctx, ctrl, vo, ctx.getStatuswin());
		inputSTATUSWIN(ctx, ctrl);
	}

	/**
	 * Process operation toCDCCM01D_STATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_STATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dStatuswin vo) {
		outputSTATUSWIN(ctx, ctrl);
		mapper.updateCdccm01dStatuswinFromStatuswin(ctx, ctrl, ctx.getStatuswin(), vo);
		mapper.applyCdccm01dStatuswinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCM01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_MSGSFL(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdccm01dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdccm01dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCM01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_MSGSFLC(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dMsgsflc vo) {
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
				WorkstationIO.newInstance(ctrl, ctx, Cdccm01dMsgsfl.class, "CDCCM01D")
				.fieldsToRecord(sbean -> toCDCCM01D_MSGSFL(ctx, ctrl, sbean))
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
		mapper.updateCdccm01dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdccm01dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCCM01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCCM01D_EMPTY(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dEmpty vo) {
		mapper.applyCdccm01dEmptyMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation inputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputSFL1(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getDcardnumReference().setValue(ctx.getSfl1().getDcardnumReference());
		ctx.getSharedRecordFields().getDcustidReference().setValue(ctx.getSfl1().getDcustidReference());
		ctx.getSharedRecordFields().getDacctnumReference().setValue(ctx.getSfl1().getDacctnumReference());
		ctx.getSharedRecordFields().getDstatusReference().setValue(ctx.getSfl1().getDstatusReference());
	}

	/**
	 * Process operation inputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputDELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getDcardnumReference().setValue(ctx.getDelwin().getDcardnumReference());
		ctx.getSharedRecordFields().getDstatusReference().setValue(ctx.getDelwin().getDstatusReference());
		ctx.getSharedRecordFields().getDcustidReference().setValue(ctx.getDelwin().getDcustidReference());
		ctx.getSharedRecordFields().getDacctnumReference().setValue(ctx.getDelwin().getDacctnumReference());
	}

	/**
	 * Process operation inputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputDELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getDcardnumReference().setValue(ctx.getDelerrwin().getDcardnumReference());
		ctx.getSharedRecordFields().getDstatusReference().setValue(ctx.getDelerrwin().getDstatusReference());
		ctx.getSharedRecordFields().getDcustidReference().setValue(ctx.getDelerrwin().getDcustidReference());
		ctx.getSharedRecordFields().getDacctnumReference().setValue(ctx.getDelerrwin().getDacctnumReference());
	}

	/**
	 * Process operation inputSTATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputSTATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getDcardnumReference().setValue(ctx.getStatuswin().getDcardnumReference());
		ctx.getSharedRecordFields().getDstatusReference().setValue(ctx.getStatuswin().getDstatusReference());
		ctx.getSharedRecordFields().getDcustidReference().setValue(ctx.getStatuswin().getDcustidReference());
		ctx.getSharedRecordFields().getDacctnumReference().setValue(ctx.getStatuswin().getDacctnumReference());
	}

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputSFL1(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getSfl1().getDcardnumReference().setValue(ctx.getSharedRecordFields().getDcardnumReference());
		ctx.getSfl1().getDcustidReference().setValue(ctx.getSharedRecordFields().getDcustidReference());
		ctx.getSfl1().getDacctnumReference().setValue(ctx.getSharedRecordFields().getDacctnumReference());
		ctx.getSfl1().getDstatusReference().setValue(ctx.getSharedRecordFields().getDstatusReference());
	}

	/**
	 * Process operation outputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputDELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getDelwin().getDcardnumReference().setValue(ctx.getSharedRecordFields().getDcardnumReference());
		ctx.getDelwin().getDstatusReference().setValue(ctx.getSharedRecordFields().getDstatusReference());
		ctx.getDelwin().getDcustidReference().setValue(ctx.getSharedRecordFields().getDcustidReference());
		ctx.getDelwin().getDacctnumReference().setValue(ctx.getSharedRecordFields().getDacctnumReference());
	}

	/**
	 * Process operation outputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputDELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getDelerrwin().getDcardnumReference().setValue(ctx.getSharedRecordFields().getDcardnumReference());
		ctx.getDelerrwin().getDstatusReference().setValue(ctx.getSharedRecordFields().getDstatusReference());
		ctx.getDelerrwin().getDcustidReference().setValue(ctx.getSharedRecordFields().getDcustidReference());
		ctx.getDelerrwin().getDacctnumReference().setValue(ctx.getSharedRecordFields().getDacctnumReference());
	}

	/**
	 * Process operation outputSTATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputSTATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getStatuswin().getDcardnumReference().setValue(ctx.getSharedRecordFields().getDcardnumReference());
		ctx.getStatuswin().getDstatusReference().setValue(ctx.getSharedRecordFields().getDstatusReference());
		ctx.getStatuswin().getDcustidReference().setValue(ctx.getSharedRecordFields().getDcustidReference());
		ctx.getStatuswin().getDacctnumReference().setValue(ctx.getSharedRecordFields().getDacctnumReference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdccm01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

}
