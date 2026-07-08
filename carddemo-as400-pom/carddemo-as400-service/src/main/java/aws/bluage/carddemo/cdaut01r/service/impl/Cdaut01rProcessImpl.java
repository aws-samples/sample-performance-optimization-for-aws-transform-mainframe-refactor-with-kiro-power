
package aws.bluage.carddemo.cdaut01r.service.impl;

import aws.bluage.carddemo.cdaut01r.business.context.Cdaut01rContext;
import aws.bluage.carddemo.cdaut01r.service.Cdaut01rProcess;
import aws.bluage.carddemo.cdaut01r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dSfl1;
import com.netfective.bluage.gapwalk.database.support.central.ESQLAttribute;
import com.netfective.bluage.gapwalk.database.support.central.SQLExecutorBuilder;
import com.netfective.bluage.gapwalk.database.support.central.SQLParameterBuilder;
import com.netfective.bluage.gapwalk.database.support.diagnostics.DiagnosticsBuilder;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import com.netfective.bluage.gapwalk.runtime.screen.WorkstationIO;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import com.netfective.bluage.gapwalk.runtime.statements.MessageHandlingBuilder;
import java.sql.JDBCType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdaut01rProcessImpl
 * 
 * Defines application services for Cdaut01rProcess
 * @see Cdaut01rProcess
 */
@Service("aws.bluage.carddemo.cdaut01r.service.Cdaut01rProcess")
@Import({
aws.bluage.carddemo.cdaut01r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdaut01rProcessImpl implements Cdaut01rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdaut01rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		if (ctx.isFirstRun()) {
			ctx.getSqlca().getSqlcaidReference().setBytes(new byte[]{ 0, 0, 0, 0, 0, 0, 0, 0 });
			ctx.getPtr_ind().setPtr_ind(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			ctx.getIndicatords_pointer().setIndicatords_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDAUT01D")
			.open();
		} 
		ctx.setFirstRun(false);
		EntityUtils.track(ctx.getIndicatords(), ctx.getIndicatords_pointer().getIndicatords_pointerReference(), ctrl);
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.setAttribute(ESQLAttribute.SCROLL)
			.setAttribute(ESQLAttribute.FOR_READ_ONLY)
			.mapInParameter(SQLParameterBuilder.newInstance(ctx.getWcursorkey().getWcursorkeyReference()))
			.execute("CDAUT01R_2");
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.setAttribute(ESQLAttribute.SCROLL)
			.setAttribute(ESQLAttribute.FOR_READ_ONLY)
			.mapInParameter(SQLParameterBuilder.newInstance(ctx.getWcursorkey().getWcursorkeyReference()).type(JDBCType.DECIMAL))
			.execute("CDAUT01R_5");
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
			WorkstationIO.newInstance(ctrl, ctx, "CDAUT01D")
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
	public void MAINCODE(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().setPgmq("CDAUT01R");
		ctx.getFooter().setDashes(StringUtils.repeat("-", 130));
		ctx.getIndicatords().setF5("1");
		do {
			if (DataUtils.compare(ctx.getIndicatords().getF5Reference(), "1") == 0) {
				ctx.getCtl1().setRow(4);
				ctx.getCtl1().setCol(43);
				REFRESH(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getPagedownReference(), "1") == 0) {
				LOADNEXT(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getPageupReference(), "1") == 0) {
				LOADPREV(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicatords().getF4Reference(), "1") == 0) {
				PROMPT(ctx, ctrl);
			} else {
				if (NumberUtils.ne(ctx.getHeader2().getPositionReference(), 0)) {
					REFRESH(ctx, ctrl);
				} 
			}
			DataUtils.initialize(ctx.getHeader2().getPositionReference());
			WorkstationIO.newInstance(ctrl, ctx, Cdaut01dHeader1.class, "CDAUT01D")
			.fieldsToRecord(sbean -> toCDAUT01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdaut01dHeader2.class, "CDAUT01D")
			.fieldsToRecord(sbean -> toCDAUT01D_HEADER2(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdaut01dFooter.class, "CDAUT01D")
			.fieldsToRecord(sbean -> toCDAUT01D_FOOTER(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdaut01dMsgsflc.class, "CDAUT01D")
			.fieldsToRecord(sbean -> toCDAUT01D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			if (DataUtils.compare(ctx.getIndicatords().getSflemptyReference(), "1") == 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdaut01dEmpty.class, "CDAUT01D")
				.fieldsToRecord(sbean -> toCDAUT01D_EMPTY(ctx, ctrl, sbean))
				.write();
			} 
			WorkstationIO.newInstance(ctrl, ctx, Cdaut01dCtl1.class, "CDAUT01D")
			.fieldsToRecord(sbean -> toCDAUT01D_CTL1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdaut01dCtl1.class, "CDAUT01D")
			.recordToFields(sbean -> fromCDAUT01D_CTL1(ctx, ctrl, sbean))
			.read();
			WorkstationIO.newInstance(ctrl, ctx, Cdaut01dHeader2.class, "CDAUT01D")
			.recordToFields(sbean -> fromCDAUT01D_HEADER2(ctx, ctrl, sbean))
			.read();
		} while (!(DataUtils.compare(ctx.getIndicatords().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndicatords().getF12Reference(), "1") == 0));
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation REFRESH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void REFRESH(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getIndicatords().getPageupReference(), "1") == 0) {
		} else if (DataUtils.compare(ctx.getIndicatords().getF5Reference(), "0") == 0) {
			ctx.getWcursorkey().setWcursorkey(ctx.getHeader2().getPosition());
		} else {
			ctx.getWcursorkey().setWcursorkey((long) 999999999999999999L);
		}
		SETCURSORDN(ctx, ctrl);
		DataUtils.initialize(ctx.getWtopkey().getWtopkeyReference());
		LOADSFL(ctx, ctrl, ctx.getDown().getDownReference().getRecord());
		return;
	}

	/**
	 * Process operation SETCURSORDN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void SETCURSORDN(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.execute("CDAUT01R_1");
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.execute("CDAUT01R_3");
	}

	/**
	 * Process operation SETCURSORUP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void SETCURSORUP(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.execute("CDAUT01R_4");
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.execute("CDAUT01R_6");
	}

	/**
	 * Process operation LOADSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPARM1 
	 */
	@Override
	public void LOADSFL(final Cdaut01rContext ctx, final ExecutionController ctrl, final Record pPARM1) {
		Alphanumeric pARM1 = new Alphanumeric(1, DataUtils.asRecord(pPARM1).clone());
		if (DataUtils.compare(pARM1.get(), ctx.getDown().getDownReference()) == 0) {
			ctx.getPmtarr().getField().initialize();
			RESETSFL(ctx, ctrl);
			FETCHNEXTDN(ctx, ctrl);
			while (ctx.getSqlca().getSqlcode() >= 0 && ctx.getSqlca().getSqlcode() < 100) {
				if (ctx.getRrn().getRrn() == 0) {
					ctx.getWtopkey().getWtopkeyReference().setValue(ctx.getDbloadds().getAuthidReference());
				} 
				ctx.getRrn().setRrn(ctx.getRrn().getRrn() + 1);
				ctx.getPmtarr().getItemFromSfltrnReference(ctx.getRrn().getRrn() - 1).setValue(ctx.getDbloadds().getTrnidReference());
				ctx.getPmtarr().getItemFromSflccmReference(ctx.getRrn().getRrn() - 1).setValue(ctx.getDbloadds().getCardnumReference());
				WorkstationIO.newInstance(ctrl, ctx, Cdaut01dSfl1.class, "CDAUT01D")
				.withRRN(ctx.getRrn().getRrnReference())
				.fieldsToRecord(sbean -> toCDAUT01D_SFL1(ctx, ctrl, sbean))
				.write();
				if (ctx.getRrn().getRrn() == ctx.getCpagesize().getCpagesize()) {
					if (DataUtils.compare(pARM1.get(), ctx.getDown().getDownReference()) == 0) {
						FETCHNEXTDN(ctx, ctrl);
						if (ctx.getSqlca().getSqlcode() == 100) {
							ctx.getIndicatords().setSflend("1");
						} else {
							SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
								.mapOutParameter(SQLParameterBuilder.newInstance(ctx.getDbloadds()))
								.execute("CDAUT01R_7");
						}
					} 
					break;
				} else {
					FETCHNEXTDN(ctx, ctrl);
				}
			}
			if (ctx.getRrn().getRrn() < ctx.getCpagesize().getCpagesize()) {
				ctx.getIndicatords().setSflend("1");
			} 
			if (ctx.getRrn().getRrn() == 0) {
				ctx.getIndicatords().setSflreset("1");
				ctx.getIndicatords().setSflinit("1");
				ctx.getIndicatords().setSflempty("1");
			} else {
				ctx.getIndicatords().setSflinit("0");
			}
		} else {
			SETCURSORUP(ctx, ctrl);
			FETCHNEXTUP(ctx, ctrl);
			if (DataUtils.compare(ctx.getLastrowfetch().getLastrowfetchReference(), 1) == 0) {
				ctx.getWcursorkey().getWcursorkeyReference().setValue(ctx.getDbloadds().getAuthidReference());
				REFRESH(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getFirstrowfetch().getFirstrowfetchReference(), 1) == 0) {
				ctx.getWcursorkey().setWcursorkey((long) 999999999999999999L);
				REFRESH(ctx, ctrl);
			} 
			return;
		}
	}

	/**
	 * Process operation FETCHNEXTDN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void FETCHNEXTDN(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.mapOutParameter(SQLParameterBuilder.newInstance(ctx.getDbloadds()))
			.execute("CDAUT01R_8");
	}

	/**
	 * Process operation FETCHNEXTUP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void FETCHNEXTUP(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.mapOutParameter(SQLParameterBuilder.newInstance(ctx.getDbloadds()))
			.execute("CDAUT01R_9");
		DiagnosticsBuilder.newInstance(ctx, ctrl.getExecutionContext(), ctx.getSqlca())
		.bind(ctx.getFirstrowfetch().getFirstrowfetchReference(), "Row_Count")
		.execute();
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.mapOutParameter(SQLParameterBuilder.newInstance(ctx.getDbloadds()))
			.execute("CDAUT01R_10");
		DiagnosticsBuilder.newInstance(ctx, ctrl.getExecutionContext(), ctx.getSqlca())
		.bind(ctx.getLastrowfetch().getLastrowfetchReference(), "Row_Count")
		.execute();
	}

	/**
	 * Process operation RESETSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void RESETSFL(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatords().setSflinit("0");
		ctx.getIndicatords().setSflreset("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdaut01dCtl1.class, "CDAUT01D")
		.fieldsToRecord(sbean -> toCDAUT01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatords().setSflreset("0");
		ctx.getIndicatords().setSflempty("0");
		ctx.getIndicatords().setSflend("0");
		ctx.getRrn().setRrn(0);
	}

	/**
	 * Process operation LOADNEXT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADNEXT(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getIndicatords().getSflendReference(), "1") == 0) {
			return;
		} else {
			LOADSFL(ctx, ctrl, ctx.getDown().getDownReference().getRecord());
			return;
		}
	}

	/**
	 * Process operation LOADPREV.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOADPREV(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		ctx.getWcursorkey().getWcursorkeyReference().setValue(ctx.getWtopkey().getWtopkeyReference());
		LOADSFL(ctx, ctrl, ctx.getUp().getUpReference().getRecord());
		return;
	}

	/**
	 * Process operation PROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PROMPT(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare("TRNID", ctx.getCtl1().getCsrfldReference()) == 0) {
			if (ctx.getPmtarr().getItemFromSfltrn(ctx.getCtl1().getRow() - 6 - 1) > 0) {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.byReference(ctx.getPmtarr().getItemFromSfltrnReference(ctx.getCtl1().getRow() - 6 - 1))
				.call("CDTRN02R");
			} 
		} else if (DataUtils.compare("CARDNUM", ctx.getCtl1().getCsrfldReference()) == 0) {
			if (ctx.getPmtarr().getItemFromSflccm(ctx.getCtl1().getRow() - 6 - 1) > 0) {
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.byReference(ctx.getPmtarr().getItemFromSflccmReference(ctx.getCtl1().getRow() - 6 - 1),
					ctx.getAlwayson().getAlwaysonReference())
				.call("CDCCM02R");
			} 
		}
	}

	/**
	 * Process operation toCDAUT01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_HEADER1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dHeader1 vo) {
		mapper.updateCdaut01dHeader1FromHeader1(ctx, ctrl, ctx.getHeader1(), vo);
		mapper.applyCdaut01dHeader1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDAUT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDAUT01D_HEADER2(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dHeader2 vo) {
		mapper.applyCdaut01dHeader2MiscIn(ctx, ctrl, vo);
		mapper.updateHeader2FromCdaut01dHeader2(ctx, ctrl, vo, ctx.getHeader2());
	}

	/**
	 * Process operation toCDAUT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_HEADER2(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dHeader2 vo) {
		mapper.updateCdaut01dHeader2FromHeader2(ctx, ctrl, ctx.getHeader2(), vo);
		mapper.applyCdaut01dHeader2MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDAUT01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_SFL1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dSfl1 vo) {
		outputSFL1(ctx, ctrl);
		mapper.updateCdaut01dSfl1FromSfl1(ctx, ctrl, ctx.getSfl1(), vo);
		mapper.applyCdaut01dSfl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDAUT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDAUT01D_CTL1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dCtl1 vo) {
		mapper.applyCdaut01dCtl1MiscIn(ctx, ctrl, vo);
		mapper.updateCtl1FromCdaut01dCtl1(ctx, ctrl, vo, ctx.getCtl1());
	}

	/**
	 * Process operation toCDAUT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_CTL1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dCtl1 vo) {
		mapper.updateCdaut01dCtl1FromCtl1(ctx, ctrl, ctx.getCtl1(), vo);
		mapper.applyCdaut01dCtl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDAUT01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_FOOTER(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dFooter vo) {
		mapper.updateCdaut01dFooterFromFooter(ctx, ctrl, ctx.getFooter(), vo);
		mapper.applyCdaut01dFooterMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDAUT01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_MSGSFL(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdaut01dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdaut01dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDAUT01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_MSGSFLC(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dMsgsflc vo) {
		PackedInt MSGDATALENGTH = PackedDecimal.build(8, 0, false);
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilesecondmessagelineReference());
		DataUtils.initialize(ctx.getMsgsfl().getSubfilemessageidReference());
		MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
		.withSubfileMsgInfo(ctx.getMsgsfl().getSubfilemessagelineReference())
		.withSubfileSecondMsgInfo(ctx.getMsgsfl().getSubfilesecondmessagelineReference())
		.withSubfileMsgId(ctx.getMsgsfl().getSubfilemessageidReference())
		.withCallStackEntry(ctx.getSharedRecordFields().getPgmqReference())
		.withMsgKey(ctx.getMsgsfl().getSflmsgkeyReference())
		.withMsgInfoLength(MSGDATALENGTH)
		.receiveProgMsg();
		if (MSGDATALENGTH.get() > 0) {
			while (MSGDATALENGTH.get() > 0) {
				WorkstationIO.newInstance(ctrl, ctx, Cdaut01dMsgsfl.class, "CDAUT01D")
				.fieldsToRecord(sbean -> toCDAUT01D_MSGSFL(ctx, ctrl, sbean))
				.write();
				MessageHandlingBuilder.newInstance(ctx, ctrl.getExecutionContext())
				.withSubfileMsgInfo(ctx.getMsgsfl().getSubfilemessagelineReference())
				.withSubfileSecondMsgInfo(ctx.getMsgsfl().getSubfilesecondmessagelineReference())
				.withSubfileMsgId(ctx.getMsgsfl().getSubfilemessageidReference())
				.withCallStackEntry(ctx.getSharedRecordFields().getPgmqReference())
				.withMsgKey(ctx.getMsgsfl().getSflmsgkeyReference())
				.withMsgInfoLength(MSGDATALENGTH)
				.receiveProgMsg();
			}
		} else {
			vo.getMsgsflField().subfileClear();
		}
		outputMSGSFLC(ctx, ctrl);
		mapper.updateCdaut01dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdaut01dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDAUT01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDAUT01D_EMPTY(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dEmpty vo) {
		mapper.applyCdaut01dEmptyMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputSFL1(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		ctx.getSfl1().getAuthidReference().setValue(ctx.getDbloadds().getAuthidReference());
		ctx.getSfl1().getTrnidReference().setValue(ctx.getDbloadds().getTrnidReference());
		ctx.getSfl1().getCardnumReference().setValue(ctx.getDbloadds().getCardnumReference());
		ctx.getSfl1().getRspreasonReference().setValue(ctx.getDbloadds().getRspreasonReference());
		ctx.getSfl1().getFraudflagReference().setValue(ctx.getDbloadds().getFraudflagReference());
		ctx.getSfl1().getAuthdateReference().setValue(ctx.getDbloadds().getAuthdateReference());
		ctx.getSfl1().getAuthtimeReference().setValue(ctx.getDbloadds().getAuthtimeReference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getPgmqReference().setValue(ctx.getSharedRecordFields().getPgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdaut01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getPgmqReference().setValue(ctx.getSharedRecordFields().getPgmqReference());
	}

}
