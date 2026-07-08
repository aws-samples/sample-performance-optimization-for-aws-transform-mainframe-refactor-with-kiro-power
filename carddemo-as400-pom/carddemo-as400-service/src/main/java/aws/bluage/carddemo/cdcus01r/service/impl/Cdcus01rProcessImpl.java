
package aws.bluage.carddemo.cdcus01r.service.impl;

import aws.bluage.carddemo.cdcus01r.business.ValSrcCtl.Wteststring;
import aws.bluage.carddemo.cdcus01r.business.context.Cdcus01rContext;
import aws.bluage.carddemo.cdcus01r.service.Cdcus01rProcess;
import aws.bluage.carddemo.cdcus01r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dDelerrwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dDelwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdcus01dSfl1;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import com.netfective.bluage.gapwalk.runtime.screen.WorkstationIO;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import com.netfective.bluage.gapwalk.runtime.statements.MessageHandlingBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdcus01rProcessImpl
 * 
 * Defines application services for Cdcus01rProcess
 * @see Cdcus01rProcess
 */
@Service("aws.bluage.carddemo.cdcus01r.service.Cdcus01rProcess")
@Import({
aws.bluage.carddemo.cdcus01r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdcus01rProcessImpl implements Cdcus01rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdcus01rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		****************************************************************
		Procedure Definitions                                         *
		**************************************************************** */
		if (ctx.isFirstRun()) {
			ctx.getIndicatords_pointer().setIndicatords_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDCus01D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDACTR03)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDACTR02)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
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
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDACTR02)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDACTR03)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDCus01D")
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
	public void MAINCODE(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getHeader1().getDpgmnameReference().setValue(ctx.getProgramstatus().getPgmnameReference());
		ctx.getSharedRecordFields().getDpgmqReference().setValue(ctx.getProgramstatus().getPgmnameReference());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.call("CDUTL02C");
		DAOManager.getDAO(ctx, FileIds.CDCUSU01)
		.withLowValueKeys()
		.setOnGreaterOrEqual();
		LOADSFL(ctx, ctrl);
		while (0 == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dHeader1.class, "CDCUS01D")
			.fieldsToRecord(sbean -> toCDCUS01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dHeader2.class, "CDCUS01D")
			.fieldsToRecord(sbean -> toCDCUS01D_HEADER2(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dFooter.class, "CDCUS01D")
			.fieldsToRecord(sbean -> toCDCUS01D_FOOTER(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dMsgsflc.class, "CDCUS01D")
			.fieldsToRecord(sbean -> toCDCUS01D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			if (DataUtils.compare(ctx.getIndicatords().getSflemptyReference(), "1") == 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdcus01dEmpty.class, "CDCUS01D")
				.fieldsToRecord(sbean -> toCDCUS01D_EMPTY(ctx, ctrl, sbean))
				.write();
			} 
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dCtl1.class, "CDCUS01D")
			.fieldsToRecord(sbean -> toCDCUS01D_CTL1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dCtl1.class, "CDCUS01D")
			.recordToFields(sbean -> fromCDCUS01D_CTL1(ctx, ctrl, sbean))
			.read();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dHeader2.class, "CDCUS01D")
			.recordToFields(sbean -> fromCDCUS01D_HEADER2(ctx, ctrl, sbean))
			.read();
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.call("CDUTL02C");
			ctx.getIndicatords().setPositionerror("0");
			if (DataUtils.compare(ctx.getIndicatords().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndicatords().getF12Reference(), "1") == 0) {
				break;
			} else if (DataUtils.compare(ctx.getIndicatords().getF5Reference(), "1") == 0) {
				ctx.getWfirstkey().getWfirstkeyReference().setBytes(Record.LOW_VALUES);
				REFRESH(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getF6Reference(), "1") == 0) {
				ADDCUSTOMER(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getPagedownReference(), "1") == 0) {
				LOADNEXT(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getPageupReference(), "1") == 0) {
				LOADPREV(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getCommandkeyReference(), "1") == 0) {
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
	public void LOADSFL(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatords().setSflinit("0");
		ctx.getIndicatords().setSflreset("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdcus01dCtl1.class, "CDCUS01D")
		.fieldsToRecord(sbean -> toCDCUS01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatords().setSflreset("0");
		ctx.getIndicatords().setSflempty("0");
		ctx.getCtl1().setDsflrrn(1);
		DAOManager.getDAO(ctx, FileIds.CDCUSU01)
		.withRecord(ctx.getCdcuspr())
		.noLock()
		.readCurrentRecord();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSU01).getEofReference()) == 0) {
			ctx.getCtl1().setDsflrrn(0);
			ctx.getCdcuspr().getCustidReference().setValue(ctx.getWfirstkey().getWfirstkeyReference());
		} 
		ctx.getWfirstkey().getWfirstkeyReference().setValue(ctx.getCdcuspr().getCustidReference());
		DataUtils.setToHighValues(ctx.getWlastkey().getWlastkeyReference());
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSU01).getEofReference()) == 0) && NumberUtils.le(ctx.getCtl1().getDsflrrnReference(), ctx.getCpagesize().getCpagesizeReference())) {
			ctx.getSharedRecordFields().setDcustid(NumberUtils.editC(ctx.getCdcuspr().getCustid(), "X", 9).trim());
			ctx.getSfl1().setDfirstname(ctx.getCdcuspr().getFirstname().trim());
			ctx.getSfl1().setDlastname(ctx.getCdcuspr().getLastname().trim());
			DataUtils.setToBlank(ctx.getSfl1().getDoptionReference());
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dSfl1.class, "CDCUS01D")
			.withRRN(ctx.getCtl1().getDsflrrnReference())
			.fieldsToRecord(sbean -> toCDCUS01D_SFL1(ctx, ctrl, sbean))
			.write();
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
			.withRecord(ctx.getCdcuspr())
			.noLock()
			.readCurrentRecord();
			ctx.getCtl1().setDsflrrn(ctx.getCtl1().getDsflrrn() + 1);
			ctx.getWlastkey().getWlastkeyReference().setValue(ctx.getCdcuspr().getCustidReference());
		}
		ctx.getIndicatords().getSflendReference().setBytes(ctx.getFileReadIndicators(FileIds.CDCUSU01).getEofReference().getBytes());
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
	public void LOADNEXT(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getIndicatords().getSflendReference(), "1") == 0) {
			return;
		} else {
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
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
	public void LOADPREV(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		PackedInt i = PackedDecimal.build(2, 0, true, 0);
		Alphanumeric sFLTOP = new Alphanumeric(1, " ");
		DAOManager.getDAO(ctx, FileIds.CDCUSU01)
		.withKeys(ctx.getWfirstkey().getWfirstkey())
		.setOnGreaterOrEqual();
		i.set(0);
		while (i.get() <= ctx.getCpagesize().getCpagesize()) {
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
			.withRecord(ctx.getCdcuspr())
			.noLock()
			.readPriorRecord();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSU01).getEofReference()) == 0) {
				DAOManager.getDAO(ctx, FileIds.CDCUSU01)
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
	public void REFRESH(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		DataUtils.initialize(ctx.getHeader2().getDpositionReference());
		DAOManager.getDAO(ctx, FileIds.CDCUSU01)
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
	public void HANDLEENTER(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getWposition().getWpositionReference().setValue(ctx.getHeader2().getDpositionReference());
		if (DataUtils.compare("1", VALSRCCTL(ctx, ctrl)) == 0) {
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
	 * @return 
	 */
	@Override
	public String VALSRCCTL(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		String returnValue = "";
		Wteststring wTESTSTRING = new Wteststring(ctx.getConfiguration());
		wTESTSTRING.setWteststring(ctx.getWposition().getWposition());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wTESTSTRING.getWteststringReference())
		.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
		.call("ISNUMERIC");
		if (DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0) {
			ctx.getCtl1().setDrow(0);
			ctx.getCtl1().setDcol(0);
			returnValue = "1";
			return returnValue;
		} else {
			ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0016");
			MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
			ctx.getIndicatords().setPositionerror("1");
			ctx.getCtl1().setDrow(5);
			ctx.getCtl1().setDcol(5);
			returnValue = "0";
			return returnValue;
		}

	}

	/**
	 * Process operation POSITIONTO.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void POSITIONTO(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getWfirstkey().setWfirstkey(NumberUtils.toDecimal(ctx.getWposition().getWposition(), 9, 0, false).intValue());
		REFRESH(ctx, ctrl);
	}

	/**
	 * Process operation SFLOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void SFLOPTIONS(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		WorkstationIO.newInstance(ctrl, ctx, Cdcus01dSfl1.class, "CDCUS01D")
		.withRRN(ctx.getCtl1().getDsflrrnReference())
		.recordToFields(sbean -> fromCDCUS01D_SFL1(ctx, ctrl, sbean))
		.readNextChangedRecord();
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators().getEofReference()) == 0)) {
			HANDLEOPTIONS(ctx, ctrl);
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dSfl1.class, "CDCUS01D")
			.withRRN(ctx.getCtl1().getDsflrrnReference())
			.recordToFields(sbean -> fromCDCUS01D_SFL1(ctx, ctrl, sbean))
			.readNextChangedRecord();
		}
		REFRESH(ctx, ctrl);
	}

	/**
	 * Process operation ADDCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void ADDCUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		PackedInt wCUSTOMERID = PackedDecimal.build(9, 0, true, 0);
		Alphanumeric wVIEWONLY = new Alphanumeric(1, "0");
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wCUSTOMERID,
			wVIEWONLY)
		.call("CDCUS02R");
		REFRESH(ctx, ctrl);
	}

	/**
	 * Process operation EDITCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void EDITCUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		PackedInt wCUSTOMERID = PackedDecimal.build(9, 0, true, 0);
		Alphanumeric wVIEWONLY = new Alphanumeric(1, "0");
		wCUSTOMERID.set(NumberUtils.toDecimal(ctx.getSharedRecordFields().getDcustid(), 9, 0, false).intValue());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wCUSTOMERID,
			wVIEWONLY)
		.call("CDCUS02R");
	}

	/**
	 * Process operation DELETECUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DELETECUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		PackedInt wCUSTOMERID = PackedDecimal.build(9, 0, true, 0);
		WorkstationIO.newInstance(ctrl, ctx, Cdcus01dHeader1.class, "CDCUS01D")
		.fieldsToRecord(sbean -> toCDCUS01D_HEADER1(ctx, ctrl, sbean))
		.write();
		wCUSTOMERID.set(NumberUtils.toDecimal(ctx.getSharedRecordFields().getDcustid(), 9, 0, false).intValue());
		DAOManager.getDAO(ctx, FileIds.CDACTR02)
		.withKeys(wCUSTOMERID.get())
		.setOnGreaterOrEqual();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTR02).getEqualReference()) == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTR02)
			.withRecord(ctx.getCdactpr())
			.withKeys(wCUSTOMERID.get())
			.readNextEqual();
			ctx.getDelerrwin().setDactid(NumberUtils.editC(ctx.getCdactpr().getAcctnum(), "X", 12));
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dDelerrwin.class, "CDCUS01D")
			.fieldsToRecord(sbean -> toCDCUS01D_DELERRWIN(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus01dDelerrwin.class, "CDCUS01D")
			.recordToFields(sbean -> fromCDCUS01D_DELERRWIN(ctx, ctrl, sbean))
			.read();
			return;
		} else {
			DAOManager.getDAO(ctx, FileIds.CDACTR03)
			.withKeys(wCUSTOMERID.get())
			.setOnGreaterOrEqual();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTR03).getEqualReference()) == 0) {
				DAOManager.getDAO(ctx, FileIds.CDACTR03)
				.withRecord(ctx.getCdactpr3())
				.withMapper(() -> this.inputCDACTPR3(ctx, ctrl))
				.withKeys(wCUSTOMERID.get())
				.readNextEqual();
				ctx.getDelerrwin().setDactid(NumberUtils.editC(ctx.getCdactpr().getAcctnum(), "X", 12));
				WorkstationIO.newInstance(ctrl, ctx, Cdcus01dDelerrwin.class, "CDCUS01D")
				.fieldsToRecord(sbean -> toCDCUS01D_DELERRWIN(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdcus01dDelerrwin.class, "CDCUS01D")
				.recordToFields(sbean -> fromCDCUS01D_DELERRWIN(ctx, ctrl, sbean))
				.read();
				return;
			} else {
				while (!(DataUtils.compare(ctx.getIndicatords().getF12Reference(), "1") == 0)) {
					WorkstationIO.newInstance(ctrl, ctx, Cdcus01dDelwin.class, "CDCUS01D")
					.fieldsToRecord(sbean -> toCDCUS01D_DELWIN(ctx, ctrl, sbean))
					.write();
					WorkstationIO.newInstance(ctrl, ctx, Cdcus01dDelwin.class, "CDCUS01D")
					.recordToFields(sbean -> fromCDCUS01D_DELWIN(ctx, ctrl, sbean))
					.read();
					if (DataUtils.compare(ctx.getIndicatords().getCommandkeyReference(), "1") == 0) {
						continue;
					} else {
						DAOManager.getDAO(ctx, FileIds.CDCUSU01)
						.withRecord(ctx.getCdcuspr())
						.withKeys(wCUSTOMERID.get())
						.handleErrors()
						.retrieve();
						if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0)) {
							DAOManager.getDAO(ctx, FileIds.CDCUSU01)
							.delete();
							break;
						} else {
							continue;
						}
					}
				}
			}
		}
	}

	/**
	 * Process operation VIEWCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void VIEWCUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		PackedInt wCUSTOMERID = PackedDecimal.build(9, 0, true, 0);
		Alphanumeric wVIEWONLY = new Alphanumeric(1, "1");
		wCUSTOMERID.set(NumberUtils.toDecimal(ctx.getSharedRecordFields().getDcustid(), 9, 0, false).intValue());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wCUSTOMERID,
			wVIEWONLY)
		.call("CDCUS02R");
	}

	/**
	 * Process operation HANDLEOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void HANDLEOPTIONS(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "2") == 0) {
			EDITCUSTOMER(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "4") == 0) {
			DELETECUSTOMER(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getSfl1().getDoptionReference(), "5") == 0) {
			VIEWCUSTOMER(ctx, ctrl);
		}
	}

	/**
	 * Process operation MESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pMESSAGEID 
	 */
	@Override
	public void MESSAGE(final Cdcus01rContext ctx, final ExecutionController ctrl, final Record pMESSAGEID) {
		Alphanumeric mESSAGEID = new Alphanumeric(8, DataUtils.asRecord(pMESSAGEID).clone());
		Alphanumeric wMESSAGEID = new Alphanumeric(8, " ");
		wMESSAGEID.set(mESSAGEID.get());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wMESSAGEID,
			ctx.getSharedRecordFields().getDpgmqReference())
		.call("CDUTL01C");
	}

	/**
	 * Process operation toCDCUS01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_HEADER1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dHeader1 vo) {
		mapper.updateCdcus01dHeader1FromHeader1(ctx, ctrl, ctx.getHeader1(), vo);
		mapper.applyCdcus01dHeader1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS01D_HEADER2(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dHeader2 vo) {
		mapper.applyCdcus01dHeader2MiscIn(ctx, ctrl, vo);
		mapper.updateHeader2FromCdcus01dHeader2(ctx, ctrl, vo, ctx.getHeader2());
	}

	/**
	 * Process operation toCDCUS01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_HEADER2(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dHeader2 vo) {
		mapper.updateCdcus01dHeader2FromHeader2(ctx, ctrl, ctx.getHeader2(), vo);
		mapper.applyCdcus01dHeader2MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS01D_SFL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dSfl1 vo) {
		mapper.updateSfl1FromCdcus01dSfl1(ctx, ctrl, vo, ctx.getSfl1());
		inputSFL1(ctx, ctrl);
	}

	/**
	 * Process operation toCDCUS01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_SFL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dSfl1 vo) {
		outputSFL1(ctx, ctrl);
		mapper.updateCdcus01dSfl1FromSfl1(ctx, ctrl, ctx.getSfl1(), vo);
		mapper.applyCdcus01dSfl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS01D_CTL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dCtl1 vo) {
		mapper.applyCdcus01dCtl1MiscIn(ctx, ctrl, vo);
		mapper.updateCtl1FromCdcus01dCtl1(ctx, ctrl, vo, ctx.getCtl1());
	}

	/**
	 * Process operation toCDCUS01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_CTL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dCtl1 vo) {
		mapper.updateCdcus01dCtl1FromCtl1(ctx, ctrl, ctx.getCtl1(), vo);
		mapper.applyCdcus01dCtl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_FOOTER(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dFooter vo) {
		mapper.applyCdcus01dFooterMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS01D_DELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelwin vo) {
		mapper.applyCdcus01dDelwinMiscIn(ctx, ctrl, vo);
		mapper.updateDelwinFromCdcus01dDelwin(ctx, ctrl, vo, ctx.getDelwin());
		inputDELWIN(ctx, ctrl);
	}

	/**
	 * Process operation toCDCUS01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_DELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelwin vo) {
		outputDELWIN(ctx, ctrl);
		mapper.updateCdcus01dDelwinFromDelwin(ctx, ctrl, ctx.getDelwin(), vo);
		mapper.applyCdcus01dDelwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS01D_DELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelerrwin vo) {
		mapper.applyCdcus01dDelerrwinMiscIn(ctx, ctrl, vo);
		mapper.updateDelerrwinFromCdcus01dDelerrwin(ctx, ctrl, vo, ctx.getDelerrwin());
		inputDELERRWIN(ctx, ctrl);
	}

	/**
	 * Process operation toCDCUS01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_DELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelerrwin vo) {
		outputDELERRWIN(ctx, ctrl);
		mapper.updateCdcus01dDelerrwinFromDelerrwin(ctx, ctrl, ctx.getDelerrwin(), vo);
		mapper.applyCdcus01dDelerrwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_MSGSFL(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdcus01dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdcus01dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_MSGSFLC(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dMsgsflc vo) {
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
				WorkstationIO.newInstance(ctrl, ctx, Cdcus01dMsgsfl.class, "CDCUS01D")
				.fieldsToRecord(sbean -> toCDCUS01D_MSGSFL(ctx, ctrl, sbean))
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
		mapper.updateCdcus01dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdcus01dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS01D_EMPTY(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dEmpty vo) {
		mapper.applyCdcus01dEmptyMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation inputCDACTPR3.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDACTPR3(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getCdactpr().getAcctnumReference().setValue(ctx.getCdactpr3().getAcctnumReference());
		ctx.getCdactpr().getActiveReference().setValue(ctx.getCdactpr3().getActiveReference());
		ctx.getCdactpr().getOpendateReference().setValue(ctx.getCdactpr3().getOpendateReference());
		ctx.getCdactpr().getExpirydateReference().setValue(ctx.getCdactpr3().getExpirydateReference());
		ctx.getCdactpr().getCredlimitReference().setValue(ctx.getCdactpr3().getCredlimitReference());
		ctx.getCdactpr().getCashlimitReference().setValue(ctx.getCdactpr3().getCashlimitReference());
		ctx.getCdactpr().getBalanceReference().setValue(ctx.getCdactpr3().getBalanceReference());
		ctx.getCdactpr().getCurcreditReference().setValue(ctx.getCdactpr3().getCurcreditReference());
		ctx.getCdactpr().getCurdebitReference().setValue(ctx.getCdactpr3().getCurdebitReference());
		ctx.getCdactpr().getAcctgrpReference().setValue(ctx.getCdactpr3().getAcctgrpReference());
		ctx.getCdactpr().getPricustidReference().setValue(ctx.getCdactpr3().getPricustidReference());
		ctx.getCdactpr().getSeccustidReference().setValue(ctx.getCdactpr3().getSeccustidReference());
		ctx.getCdactpr().getActcrtdtReference().setValue(ctx.getCdactpr3().getActcrtdtReference());
		ctx.getCdactpr().getActcrttmReference().setValue(ctx.getCdactpr3().getActcrttmReference());
		ctx.getCdactpr().getActcrtusrReference().setValue(ctx.getCdactpr3().getActcrtusrReference());
		ctx.getCdactpr().getActcrtpgmReference().setValue(ctx.getCdactpr3().getActcrtpgmReference());
		ctx.getCdactpr().getActchgdtReference().setValue(ctx.getCdactpr3().getActchgdtReference());
		ctx.getCdactpr().getActchgtmReference().setValue(ctx.getCdactpr3().getActchgtmReference());
		ctx.getCdactpr().getActchgusrReference().setValue(ctx.getCdactpr3().getActchgusrReference());
		ctx.getCdactpr().getActchgpgmReference().setValue(ctx.getCdactpr3().getActchgpgmReference());
	}

	/**
	 * Process operation inputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputSFL1(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getDcustidReference().setValue(ctx.getSfl1().getDcustidReference());
	}

	/**
	 * Process operation inputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputDELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getDcustidReference().setValue(ctx.getDelwin().getDcustidReference());
	}

	/**
	 * Process operation inputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputDELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getDcustidReference().setValue(ctx.getDelerrwin().getDcustidReference());
	}

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputSFL1(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getSfl1().getDcustidReference().setValue(ctx.getSharedRecordFields().getDcustidReference());
	}

	/**
	 * Process operation outputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputDELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getDelwin().getDcustidReference().setValue(ctx.getSharedRecordFields().getDcustidReference());
	}

	/**
	 * Process operation outputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputDELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getDelerrwin().getDcustidReference().setValue(ctx.getSharedRecordFields().getDcustidReference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdcus01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

}
