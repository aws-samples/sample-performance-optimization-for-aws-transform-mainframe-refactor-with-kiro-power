
package aws.bluage.carddemo.cdtrn01r.service.impl;

import aws.bluage.carddemo.cdtrn01r.business.context.Cdtrn01rContext;
import aws.bluage.carddemo.cdtrn01r.service.Cdtrn01rProcess;
import aws.bluage.carddemo.cdtrn01r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dHeader;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dSfl1;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
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
 * Class Cdtrn01rProcessImpl
 * 
 * Defines application services for Cdtrn01rProcess
 * @see Cdtrn01rProcess
 */
@Service("aws.bluage.carddemo.cdtrn01r.service.Cdtrn01rProcess")
@Import({
aws.bluage.carddemo.cdtrn01r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdtrn01rProcessImpl implements Cdtrn01rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdtrn01rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		if (ctx.isFirstRun()) {
			ctx.getDsshindds_pointer().setDsshindds_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			WorkstationIO.newInstance(ctrl, ctx, "CDTRN01D")
			.open();
		} 
		ctx.setFirstRun(false);
		EntityUtils.track(ctx.getDsshindds(), ctx.getDsshindds_pointer().getDsshindds_pointerReference(), ctrl);
		do {
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				break;
			} else {
				MAINCODE(ctx, ctrl);
			}
		} while (true);
		ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
		if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
			WorkstationIO.newInstance(ctrl, ctx, "CDTRN01D")
			.keep()
			.close();
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
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
	public void MAINCODE(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getHeader().getPgmnameReference().setValue(ctx.getProgramStatus().getWprogramnameReference());
		ctx.getSharedRecordFields().getPgmqReference().setValue(ctx.getProgramStatus().getWprogramnameReference());
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withHighValueKeys()
		.setOnGreater();
		LOADSUBFILE(ctx, ctrl);
		ctx.getWleaveprogram().setWleaveprogram("N");
		while (DataUtils.compare(ctx.getWleaveprogram().getWleaveprogramReference(), "N") == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dHeader.class, "CDTRN01D")
			.fieldsToRecord(sbean -> toCDTRN01D_HEADER(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dFooter.class, "CDTRN01D")
			.fieldsToRecord(sbean -> toCDTRN01D_FOOTER(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dMsgsflc.class, "CDTRN01D")
			.fieldsToRecord(sbean -> toCDTRN01D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			ctx.getDsshindds().setIsfldspctl("1");
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dCtl1.class, "CDTRN01D")
			.fieldsToRecord(sbean -> toCDTRN01D_CTL1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dCtl1.class, "CDTRN01D")
			.recordToFields(sbean -> fromCDTRN01D_CTL1(ctx, ctrl, sbean))
			.read();
			ctx.getDsshindds().setIsfldspctl("0");
			CLEARERRSUBFILE(ctx, ctrl);
			if (DataUtils.compare(ctx.getDsshindds().getIexitReference(), "1") == 0 || DataUtils.compare(ctx.getDsshindds().getIcancelReference(), "1") == 0) {
				ctx.getDsshindds().setIexit("0");
				ctx.getDsshindds().setIcancel("0");
				ctx.getWleaveprogram().setWleaveprogram("Y");
			} else if (DataUtils.compare(ctx.getDsshindds().getIrefreshReference(), "1") == 0) {
				ctx.getDsshindds().setIrefresh("0");
				REFRESHSUBFILE(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getDsshindds().getIpageupReference(), "1") == 0) {
				LOADSUBFILEOPTS(ctx, ctrl);
				if (DataUtils.compare(ctx.getWerror().getWerrorReference(), "N") == 0) {
					PAGEUPSUBFILE(ctx, ctrl);
				} 
				ctx.getDsshindds().setIpageup("0");
			} else if (DataUtils.compare(ctx.getDsshindds().getIpagedownReference(), "1") == 0) {
				LOADSUBFILEOPTS(ctx, ctrl);
				if (DataUtils.compare(ctx.getWerror().getWerrorReference(), "N") == 0) {
					PAGEDOWNSUBFILE(ctx, ctrl);
				} 
				ctx.getDsshindds().setIpagedown("0");
			} else if (DataUtils.compare(ctx.getDsshindds().getIaddReference(), "1") == 0) {
				ctx.getDsshindds().setIadd("0");
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDTRN03R");
			} else {
				LOADSUBFILEOPTS(ctx, ctrl);
				if (DataUtils.compare(ctx.getWerror().getWerrorReference(), "N") == 0) {
					PROCESSSFLOPTS(ctx, ctrl);
					if (NumberUtils.gt(ctx.getHeader().getD1postoReference(), 0)) {
						ctx.getWposto().setWposto(String.valueOf(ctx.getHeader().getD1posto()));
						ctx.getWposto().setWposto(StringUtils.replace(ctx.getWposto().getWposto()," ","9"));
						ctx.getHeader().setD1posto(NumberUtils.toDecimal(ctx.getWposto().getWposto(), 15, 0, false).longValue());
						DAOManager.getDAO(ctx, FileIds.CDTRNR01)
						.withKeys(ctx.getHeader().getD1posto())
						.setOnGreater();
						ctx.getHeader().setD1posto((long) 0);
					} else {
						DAOManager.getDAO(ctx, FileIds.CDTRNR01)
						.withKeys(ctx.getWfkey().getWfkey())
						.setOnGreater();
					}
					LOADSUBFILE(ctx, ctrl);
				} 
			}
		}
		ctx.getInLR().setInLR("1");
	}

	/**
	 * Process operation LOADSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		CLEARSUBFILE(ctx, ctrl);
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withRecord(ctx.getCdtrnpr())
		.readPriorRecord();
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDTRNR01).getEofReference()) == 0) && ctx.getWrrn().getWrrn() < ctx.getCpagesize().getCpagesize()) {
			if (ctx.getWfkey().getWfkey() == 0) {
				ctx.getWfkey().getWfkeyReference().setValue(ctx.getCdtrnpr().getTrnidReference());
				ctx.getDsshindds().setIsfldsp("1");
			} 
			ctx.getWlkey().getWlkeyReference().setValue(ctx.getCdtrnpr().getTrnidReference());
			ctx.getSfl1().setD1stranid(NumberUtils.editC(ctx.getCdtrnpr().getTrnid(), "X", 15));
			ctx.getWpos().setWpos(DataUtils.indexOf(ctx.getSfl1().getD1stranid(), ctx.getOptarr()::getItemFromSflkeyReference,0, ctx.getWidx().getWidx()) + 1);
			if (ctx.getWpos().getWpos() == 0) {
				DataUtils.setToBlank(ctx.getSfl1().getD1soptionReference());
			} else {
				ctx.getSfl1().getD1soptionReference().setValue(ctx.getOptarr().getItemFromSfloptReference(ctx.getWpos().getWpos() - 1));
			}
			ctx.getSfl1().setD1sdate(DateHelper.toDecimal(ctx.getCdtrnpr().getProcdate()).intValue());
			ctx.getSfl1().setD1samount(NumberUtils.editC(ctx.getCdtrnpr().getAmount(), "3", "$", 11).trim());
			ctx.getSfl1().getD1sdessReference().setValue(ctx.getCdtrnpr().getDessReference());
			ctx.getSfl1().getD1sstatusReference().setValue(ctx.getCdtrnpr().getTrnstatusReference());
			ctx.getWrrn().setWrrn(ctx.getWrrn().getWrrn() + 1);
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dSfl1.class, "CDTRN01D")
			.withRRN(ctx.getWrrn().getWrrnReference())
			.fieldsToRecord(sbean -> toCDTRN01D_SFL1(ctx, ctrl, sbean))
			.write();
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
			.withRecord(ctx.getCdtrnpr())
			.readPriorRecord();
		}
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDTRNR01).getEofReference()) == 0) {
			ctx.getDsshindds().setIsflend("1");
		} else {
			ctx.getDsshindds().setIsflend("0");
		}
	}

	/**
	 * Process operation PROCESSSFLOPTS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PROCESSSFLOPTS(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getOptarr().getItemFromSflkeyReference(ctx.getWidx().getWidx() + 1 - 1).setBytes(new byte[]{ 0 });
		ctx.getWcntr().setWcntr(1);
		while (ctx.getWcntr().getWcntr() <= ctx.getWidx().getWidx()) {
			if (DataUtils.compare("5", ctx.getOptarr().getItemFromSfloptReference(ctx.getWcntr().getWcntr() - 1)) == 0) {
				ctx.getWtrnkey().setWtrnkey(NumberUtils.integerPart(NumberUtils.convert(ctx.getOptarr().getItemFromSflkey(ctx.getWcntr().getWcntr() - 1))).longValue());
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.byReference(ctx.getWtrnkey().getWtrnkeyReference())
				.call("CDTRN02R");
			} 
			ctx.getWcntr().setWcntr(ctx.getWcntr().getWcntr() + 1);
		}
		ctx.getOptarr().getField().initialize();
		ctx.getWidx().setWidx(0);
		WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dHeader.class, "CDTRN01D")
		.recordToFields(sbean -> fromCDTRN01D_HEADER(ctx, ctrl, sbean))
		.read();
	}

	/**
	 * Process operation LOADSUBFILEOPTS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADSUBFILEOPTS(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getWerror().setWerror("N");
		if (DataUtils.compare(ctx.getDsshindds().getIsfldspReference(), "1") == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dSfl1.class, "CDTRN01D")
			.withRRN(ctx.getWrrn().getWrrnReference())
			.recordToFields(sbean -> fromCDTRN01D_SFL1(ctx, ctrl, sbean))
			.readNextChangedRecord();
			while (!(DataUtils.compare("1", ctx.getFileReadIndicators().getEofReference()) == 0)) {
				if (DataUtils.compare(" ", ctx.getSfl1().getD1soptionReference()) != 0 && DataUtils.compare("5", ctx.getSfl1().getD1soptionReference()) != 0) {
					ctx.getWerror().setWerror("Y");
					ctx.getDsshindds().setIsflopterr("1");
					ctx.getDsshindds().setIsflnxtchg("1");
					WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dSfl1.class, "CDTRN01D")
					.fieldsToRecord(sbean -> toCDTRN01D_SFL1(ctx, ctrl, sbean))
					.updateSubfileRecord();
					ctx.getDsshindds().setIsflnxtchg("0");
					ctx.getDsshindds().setIsflopterr("0");
					ctx.getWmessage().setWmessage("Invalid option");
					WRITEERRTOSFL(ctx, ctrl);
				} else {
					ctx.getDsshindds().setIsflopterr("0");
					WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dSfl1.class, "CDTRN01D")
					.fieldsToRecord(sbean -> toCDTRN01D_SFL1(ctx, ctrl, sbean))
					.updateSubfileRecord();
					ctx.getWpos().setWpos(DataUtils.indexOf(ctx.getSfl1().getD1stranid(), ctx.getOptarr()::getItemFromSflkeyReference,0, ctx.getWidx().getWidx()) + 1);
					if (DataUtils.isBlankOrLowValues(ctx.getSfl1().getD1soption())) {
						if (ctx.getWpos().getWpos() != 0) {
							ctx.getOptarr().getItemFromArrayReference(ctx.getWpos().getWpos() - 1).getField().initialize();
						} 
					} else if (DataUtils.compare("5", ctx.getSfl1().getD1soptionReference()) == 0) {
						if (ctx.getWpos().getWpos() == 0) {
							ctx.getWidx().setWidx(ctx.getWidx().getWidx() + 1);
							ctx.getOptarr().getItemFromSfloptReference(ctx.getWidx().getWidx() - 1).setValue(ctx.getSfl1().getD1soptionReference());
							ctx.getOptarr().getItemFromSflkeyReference(ctx.getWidx().getWidx() - 1).setValue(ctx.getSfl1().getD1stranidReference());
						} else {
							ctx.getOptarr().getItemFromSfloptReference(ctx.getWpos().getWpos() - 1).setValue(ctx.getSfl1().getD1soptionReference());
							ctx.getOptarr().getItemFromSflkeyReference(ctx.getWpos().getWpos() - 1).setValue(ctx.getSfl1().getD1stranidReference());
						}
					} 
				}
				WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dSfl1.class, "CDTRN01D")
				.withRRN(ctx.getWrrn().getWrrnReference())
				.recordToFields(sbean -> fromCDTRN01D_SFL1(ctx, ctrl, sbean))
				.readNextChangedRecord();
			}
		}
	}

	/**
	 * Process operation PAGEUPSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PAGEUPSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withKeys(ctx.getWfkey().getWfkey())
		.setOnGreater();
		ctx.getWcntr().setWcntr(1);
		while (ctx.getWcntr().getWcntr() <= ctx.getCpagesize().getCpagesize()) {
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
			.withRecord(ctx.getCdtrnpr())
			.readCurrentRecord();
			ctx.getWtrnkey().getWtrnkeyReference().setValue(ctx.getCdtrnpr().getTrnidReference());
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDTRNR01).getEofReference()) == 0) {
				if (ctx.getWcntr().getWcntr() == 1) {
					ctx.getWmessage().setWmessage("You have reached the top of the page");
					WRITEERRTOSFL(ctx, ctrl);
				} 
				DAOManager.getDAO(ctx, FileIds.CDTRNR01)
				.withHighValueKeys()
				.setOnGreater();
				LOADSUBFILE(ctx, ctrl);
				return;
			} else {
				ctx.getWcntr().setWcntr(ctx.getWcntr().getWcntr() + 1);
			}
		}
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withKeys(ctx.getWtrnkey().getWtrnkey())
		.setOnGreater();
		LOADSUBFILE(ctx, ctrl);
	}

	/**
	 * Process operation PAGEDOWNSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PAGEDOWNSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withKeys(ctx.getWlkey().getWlkey())
		.setOnGreaterOrEqual();
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withRecord(ctx.getCdtrnpr())
		.readPriorRecord();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDTRNR01).getEofReference()) == 0) {
			ctx.getWmessage().setWmessage("You have reached the bottom of the page");
			WRITEERRTOSFL(ctx, ctrl);
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
			.withKeys(ctx.getWfkey().getWfkey())
			.setOnGreater();
		} else {
			DAOManager.getDAO(ctx, FileIds.CDTRNR01)
			.withKeys(ctx.getWlkey().getWlkey())
			.setOnGreaterOrEqual();
		}
		LOADSUBFILE(ctx, ctrl);
	}

	/**
	 * Process operation REFRESHSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void REFRESHSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDTRNR01)
		.withHighValueKeys()
		.setOnGreaterOrEqual();
		LOADSUBFILE(ctx, ctrl);
	}

	/**
	 * Process operation CLEARERRSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CLEARERRSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getWmessagermv().setWmessagermv("*ALL");
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withCallStackEntry(ctx.getWcallstkent().getWcallstkentReference())
		.withCallStackCounter(ctx.getWcallstkcntr().getWcallstkcntrReference())
		.withMsgKey(ctx.getWmessagekey().getWmessagekeyReference())
		.withMsgsToRemove(ctx.getWmessagermv().getWmessagermvReference())
		.removeProgMsg();
	}

	/**
	 * Process operation WRITEERRTOSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void WRITEERRTOSFL(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getWmsgdata().setWmsgdata(ctx.getWmessage().getWmessage().trim());
		ctx.getWmsgdtalen().setWmsgdtalen(ctx.getWmessage().getWmessage().trim().length());
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withMsgId(ctx.getWmessageid().getWmessageidReference())
		.withMsgFileName(ctx.getWqualmsgf().getWqualmsgfReference())
		.withData(ctx.getWmsgdata().getWmsgdataReference())
		.withDataLength(ctx.getWmsgdtalen().getWmsgdtalenReference())
		.withMsgType(ctx.getWmsgtype().getWmsgtypeReference())
		.withCallStackEntry(ctx.getWcallstkent().getWcallstkentReference())
		.withCallStackCounter(ctx.getWcallstkcntr().getWcallstkcntrReference())
		.withMsgKey(ctx.getWmessagermv().getWmessagermvReference())
		.sendProgMsg();
	}

	/**
	 * Process operation CLEARSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CLEARSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getWrrn().setWrrn(0);
		ctx.getWfkey().setWfkey((long) 0);
		ctx.getWlkey().setWlkey((long) 0);
		ctx.getDsshindds().setIsflclr("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dCtl1.class, "CDTRN01D")
		.fieldsToRecord(sbean -> toCDTRN01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getDsshindds().setIsflclr("0");
		ctx.getDsshindds().setIsflend("0");
		if (DataUtils.compare(ctx.getDsshindds().getIpageupReference(), "1") == 0 || DataUtils.compare(ctx.getDsshindds().getIpagedownReference(), "1") == 0) {
		} else {
			ctx.getOptarr().getField().initialize();
			ctx.getWidx().setWidx(0);
		}
	}

	/**
	 * Process operation fromCDTRN01D_HEADER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDTRN01D_HEADER(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dHeader vo) {
		mapper.updateHeaderFromCdtrn01dHeader(ctx, ctrl, vo, ctx.getHeader());
	}

	/**
	 * Process operation toCDTRN01D_HEADER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN01D_HEADER(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dHeader vo) {
		mapper.updateCdtrn01dHeaderFromHeader(ctx, ctrl, ctx.getHeader(), vo);
		mapper.applyCdtrn01dHeaderMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDTRN01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDTRN01D_SFL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dSfl1 vo) {
		mapper.updateSfl1FromCdtrn01dSfl1(ctx, ctrl, vo, ctx.getSfl1());
	}

	/**
	 * Process operation toCDTRN01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN01D_SFL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dSfl1 vo) {
		mapper.updateCdtrn01dSfl1FromSfl1(ctx, ctrl, ctx.getSfl1(), vo);
		mapper.applyCdtrn01dSfl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDTRN01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDTRN01D_CTL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dCtl1 vo) {
		mapper.applyCdtrn01dCtl1MiscIn(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDTRN01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN01D_CTL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dCtl1 vo) {
		mapper.applyCdtrn01dCtl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDTRN01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN01D_FOOTER(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dFooter vo) {
		mapper.applyCdtrn01dFooterMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDTRN01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN01D_MSGSFL(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdtrn01dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdtrn01dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDTRN01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDTRN01D_MSGSFLC(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dMsgsflc vo) {
		PackedInt MSGDATALENGTH = PackedDecimal.build(8, 0, false);
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilesecondmessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessageidReference());
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withSubfileMsgInfo(ctx.getMsgsfl().getSubfilemessagelineReference())
		.withSubfileSecondMsgInfo(ctx.getMsgsfl().getSubfilesecondmessagelineReference())
		.withSubfileMsgId(ctx.getMsgsfl().getSubfilemessageidReference())
		.withCallStackEntry(ctx.getSharedRecordFields().getPgmqReference())
		.withMsgKey(ctx.getMsgsfl().getMsgkeyReference())
		.withMsgInfoLength(MSGDATALENGTH)
		.receiveProgMsg();
		if (MSGDATALENGTH.get() > 0) {
			while (MSGDATALENGTH.get() > 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdtrn01dMsgsfl.class, "CDTRN01D")
				.fieldsToRecord(sbean -> toCDTRN01D_MSGSFL(ctx, ctrl, sbean))
				.write();
				MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
				.withSubfileMsgInfo(ctx.getMsgsfl().getSubfilemessagelineReference())
				.withSubfileSecondMsgInfo(ctx.getMsgsfl().getSubfilesecondmessagelineReference())
				.withSubfileMsgId(ctx.getMsgsfl().getSubfilemessageidReference())
				.withCallStackEntry(ctx.getSharedRecordFields().getPgmqReference())
				.withMsgKey(ctx.getMsgsfl().getMsgkeyReference())
				.withMsgInfoLength(MSGDATALENGTH)
				.receiveProgMsg();
			}
		} else {
			vo.getMsgsflField().subfileClear();
		}
		outputMSGSFLC(ctx, ctrl);
		mapper.updateCdtrn01dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdtrn01dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getPgmqReference().setValue(ctx.getSharedRecordFields().getPgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdtrn01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getPgmqReference().setValue(ctx.getSharedRecordFields().getPgmqReference());
	}

}
