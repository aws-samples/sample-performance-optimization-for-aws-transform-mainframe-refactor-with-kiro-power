
package aws.bluage.carddemo.cdrpt01r.service.impl;

import aws.bluage.carddemo.cdrpt01r.business.context.Cdrpt01rContext;
import aws.bluage.carddemo.cdrpt01r.service.Cdrpt01rProcess;
import aws.bluage.carddemo.cdrpt01r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpDetail;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpHeader;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpSeparator;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpSummary;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import com.netfective.bluage.gapwalk.runtime.statements.PrintHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdrpt01rProcessImpl
 * 
 * Defines application services for Cdrpt01rProcess
 * @see Cdrpt01rProcess
 */
@Service("aws.bluage.carddemo.cdrpt01r.service.Cdrpt01rProcess")
@Import({
aws.bluage.carddemo.cdrpt01r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdrpt01rProcessImpl implements Cdrpt01rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdrpt01rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdrpt01rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		if (ctx.isFirstRun()) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			ctx.setCdrptp(PrintHandler.newInstance(ctrl, ctx.getErrorContext()).setPrinterName("CDRPTP"));
		} 
		ctx.setFirstRun(false);
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
			ctx.getCdrptp().close();
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
	public void MAINCODE(final Cdrpt01rContext ctx, final ExecutionController ctrl) {
		/* 
		Main processing */
		ctx.getCdrptp().writeReport(CdrptpSeparator.class, report -> toCDRPTP_SEPARATOR(ctx, ctrl, report));
		ctx.getCdrptp().writeReport(CdrptpHeader.class, report -> toCDRPTP_HEADER(ctx, ctrl, report));
		ctx.getCdrptp().writeReport(CdrptpSeparator.class, report -> toCDRPTP_SEPARATOR(ctx, ctrl, report));
		READACT(ctx, ctrl);
		ctx.getCdrptp().writeReport(CdrptpSeparator.class, report -> toCDRPTP_SEPARATOR(ctx, ctrl, report));
		WRITESUM(ctx, ctrl);
		ctx.getCdrptp().writeReport(CdrptpSeparator.class, report -> toCDRPTP_SEPARATOR(ctx, ctrl, report));
		ctx.getInLR().setInLR("1");
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation READACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void READACT(final Cdrpt01rContext ctx, final ExecutionController ctrl) {
		DAOManager.getDAO(ctx, FileIds.CDACTU01)
		.withLowValueKeys()
		.setOnGreaterOrEqual();
		while (true) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withRecord(ctx.getCdactpr())
			.readCurrentRecord();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTU01).getEofReference()) == 0) {
				break;
			} else {
				CHKPRI(ctx, ctrl);
				CHKSEC(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation CHKPRI.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CHKPRI(final Cdrpt01rContext ctx, final ExecutionController ctrl) {
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getCdactpr().getPricustidReference(),
			ctx.getResult().getResultReference())
		.call("CDRPT02R");
		ctx.getDetail().setRcus(ctx.getCdactpr().getPricustid());
		ctx.getDetail().setRtype("PRIMARY");
		WRITEDET(ctx, ctrl);
	}

	/**
	 * Process operation CHKSEC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CHKSEC(final Cdrpt01rContext ctx, final ExecutionController ctrl) {
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getCdactpr().getSeccustidReference(),
			ctx.getResult().getResultReference())
		.call("CDRPT02R");
		ctx.getDetail().setRcus(ctx.getCdactpr().getSeccustid());
		ctx.getDetail().setRtype("SECONDARY");
		WRITEDET(ctx, ctrl);
	}

	/**
	 * Process operation WRITEDET.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void WRITEDET(final Cdrpt01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getResult().getResultReference(), "FOUND") == 0) {
			ctx.getCountfd().setCountfd(ctx.getCountfd().getCountfd() + 1);
		} else {
			ctx.getCountntfd().setCountntfd(ctx.getCountntfd().getCountntfd() + 1);
			ctx.getDetail().setRacct(ctx.getCdactpr().getAcctnum());
			ctx.getDetail().getRcheckReference().setValue(ctx.getResult().getResultReference());
			ctx.getCdrptp().writeReport(CdrptpDetail.class, report -> toCDRPTP_DETAIL(ctx, ctrl, report));
		}
	}

	/**
	 * Process operation WRITESUM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void WRITESUM(final Cdrpt01rContext ctx, final ExecutionController ctrl) {
		ctx.getSummary().setRmetric("FOUND");
		ctx.getSummary().setRvalue(ctx.getCountfd().getCountfd());
		ctx.getCdrptp().writeReport(CdrptpSummary.class, report -> toCDRPTP_SUMMARY(ctx, ctrl, report));
		ctx.getSummary().setRmetric("NOT FOUND");
		ctx.getSummary().setRvalue(ctx.getCountntfd().getCountntfd());
		ctx.getCdrptp().writeReport(CdrptpSummary.class, report -> toCDRPTP_SUMMARY(ctx, ctrl, report));
	}

	/**
	 * Process operation toCDRPTP_SUMMARY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDRPTP_SUMMARY(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpSummary vo) {
		mapper.updateCdrptpSummaryFromSummary(ctx, ctrl, ctx.getSummary(), vo);
		mapper.applyCdrptpSummaryMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDRPTP_HEADER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDRPTP_HEADER(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpHeader vo) {
		mapper.applyCdrptpHeaderMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDRPTP_DETAIL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDRPTP_DETAIL(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpDetail vo) {
		mapper.updateCdrptpDetailFromDetail(ctx, ctrl, ctx.getDetail(), vo);
		mapper.applyCdrptpDetailMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDRPTP_SEPARATOR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDRPTP_SEPARATOR(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpSeparator vo) {
		mapper.applyCdrptpSeparatorMiscOut(ctx, ctrl, vo);
	}

}
