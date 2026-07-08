
package aws.bluage.carddemo.cdcus03r.service.impl;

import aws.bluage.carddemo.cdcus03r.business.context.Cdcus03rContext;
import aws.bluage.carddemo.cdcus03r.service.Cdcus03rProcess;
import aws.bluage.carddemo.cdcus03r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dSfl1;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import com.netfective.bluage.gapwalk.runtime.screen.WorkstationIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdcus03rProcessImpl
 * 
 * Defines application services for Cdcus03rProcess
 * @see Cdcus03rProcess
 */
@Service("aws.bluage.carddemo.cdcus03r.service.Cdcus03rProcess")
@Import({
aws.bluage.carddemo.cdcus03r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdcus03rProcessImpl implements Cdcus03rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdcus03rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdcus03rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		ctx.getPcustid().bind(ArgUtils.get(ctx, 0));
		if (ctx.isFirstRun()) {
			ctx.getIndicatords_pointer().setIndicatords_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDCUS03D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCUSR01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
		} 
		ctx.setFirstRun(false);
		EntityUtils.track(ctx.getIndicatords(), ctx.getIndicatords_pointer().getIndicatords_pointerReference(), ctrl);
		do {
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				break;
			} else {
				MAINCODE(ctx, ctrl);
			}
		} while (true);
		ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
		if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDCUSR01)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDCUS03D")
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
	public void MAINCODE(final Cdcus03rContext ctx, final ExecutionController ctrl) {
		ctx.getHeader1().setPgmname("CDCUS03R");
		DAOManager.getDAO(ctx, FileIds.CDCUSR01)
		.withLowValueKeys()
		.setOnGreaterOrEqual();
		LOADSUBFILE(ctx, ctrl);
		ctx.getWleaveprogram().setWleaveprogram("N");
		while (DataUtils.compare(ctx.getWleaveprogram().getWleaveprogramReference(), "N") == 0) {
			ctx.getHeader2().setPosition(0);
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dHeader1.class, "CDCUS03D")
			.fieldsToRecord(sbean -> toCDCUS03D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dHeader2.class, "CDCUS03D")
			.fieldsToRecord(sbean -> toCDCUS03D_HEADER2(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dFooter.class, "CDCUS03D")
			.fieldsToRecord(sbean -> toCDCUS03D_FOOTER(ctx, ctrl, sbean))
			.write();
			ctx.getIndicatords().setIsfldspctl("1");
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dCtl1.class, "CDCUS03D")
			.fieldsToRecord(sbean -> toCDCUS03D_CTL1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dCtl1.class, "CDCUS03D")
			.recordToFields(sbean -> fromCDCUS03D_CTL1(ctx, ctrl, sbean))
			.read();
			ctx.getIndicatords().setIsfldspctl("0");
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dHeader2.class, "CDCUS03D")
			.recordToFields(sbean -> fromCDCUS03D_HEADER2(ctx, ctrl, sbean))
			.read();
			if (DataUtils.compare(ctx.getIndicatords().getIexitReference(), "1") == 0 || DataUtils.compare(ctx.getIndicatords().getIpreviousReference(), "1") == 0) {
				ctx.getWleaveprogram().setWleaveprogram("Y");
			} else if (DataUtils.compare(ctx.getIndicatords().getIrefreshReference(), "1") == 0) {
				ctx.getIndicatords().setIrefresh("0");
				DAOManager.getDAO(ctx, FileIds.CDCUSR01)
				.withLowValueKeys()
				.setOnGreaterOrEqual();
				LOADSUBFILE(ctx, ctrl);
			} else {
				if (NumberUtils.eq(ctx.getHeader2().getPositionReference(), 0)) {
					PROCESSSFLOPT(ctx, ctrl);
					if (DataUtils.compare(ctx.getWrcdselected().getWrcdselectedReference(), "Y") == 0) {
						ctx.getWleaveprogram().setWleaveprogram("Y");
					} 
				} else {
					DAOManager.getDAO(ctx, FileIds.CDCUSR01)
					.withKeys(ctx.getHeader2().getPosition())
					.setOnGreaterOrEqual();
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
	public void LOADSUBFILE(final Cdcus03rContext ctx, final ExecutionController ctrl) {
		CLEARSUBFILE(ctx, ctrl);
		DAOManager.getDAO(ctx, FileIds.CDCUSR01)
		.withRecord(ctx.getCdcuspr())
		.readCurrentRecord();
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSR01).getEofReference()) == 0) && ctx.getWrrn().getWrrn() < 9999) {
			ctx.getSfl1().setCustid(NumberUtils.editC(ctx.getCdcuspr().getR1shcustid(), "X", 9));
			ctx.getSfl1().getFirstnameReference().setValue(ctx.getCdcuspr().getR1shfirstnameReference());
			ctx.getSfl1().getLastnameReference().setValue(ctx.getCdcuspr().getR1shlastnameReference());
			ctx.getWrrn().setWrrn(ctx.getWrrn().getWrrn() + 1);
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dSfl1.class, "CDCUS03D")
			.withRRN(ctx.getWrrn().getWrrnReference())
			.fieldsToRecord(sbean -> toCDCUS03D_SFL1(ctx, ctrl, sbean))
			.write();
			DAOManager.getDAO(ctx, FileIds.CDCUSR01)
			.withRecord(ctx.getCdcuspr())
			.readCurrentRecord();
		}
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSR01).getEofReference()) == 0) {
			ctx.getIndicatords().setIsflend("1");
		} else {
			ctx.getIndicatords().setIsflend("0");
		}
		if (ctx.getWrrn().getWrrn() > 0) {
			ctx.getIndicatords().setIsfldsp("1");
		} else {
			ctx.getIndicatords().setIsfldsp("0");
		}
	}

	/**
	 * Process operation PROCESSSFLOPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PROCESSSFLOPT(final Cdcus03rContext ctx, final ExecutionController ctrl) {
		ctx.getWrcdselected().setWrcdselected("N");
		if (DataUtils.compare(ctx.getIndicatords().getIsfldspReference(), "1") == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdcus03dSfl1.class, "CDCUS03D")
			.withRRN(ctx.getWrrn().getWrrnReference())
			.recordToFields(sbean -> fromCDCUS03D_SFL1(ctx, ctrl, sbean))
			.readNextChangedRecord();
			while (!(DataUtils.compare("1", ctx.getFileReadIndicators().getEofReference()) == 0)) {
				if (DataUtils.compare("X", ctx.getSfl1().getOptionReference()) == 0) {
					ctx.getPcustid().getPcustidReference().setValue(ctx.getSfl1().getCustidReference());
					ctx.getWrcdselected().setWrcdselected("Y");
					return;
				} else {
					WorkstationIO.newInstance(ctrl, ctx, Cdcus03dSfl1.class, "CDCUS03D")
					.withRRN(ctx.getWrrn().getWrrnReference())
					.recordToFields(sbean -> fromCDCUS03D_SFL1(ctx, ctrl, sbean))
					.readNextChangedRecord();
				}
			}
		}
	}

	/**
	 * Process operation CLEARSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CLEARSUBFILE(final Cdcus03rContext ctx, final ExecutionController ctrl) {
		ctx.getWrrn().setWrrn(0);
		ctx.getIndicatords().setIsflclr("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdcus03dCtl1.class, "CDCUS03D")
		.fieldsToRecord(sbean -> toCDCUS03D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatords().setIsflclr("0");
		ctx.getIndicatords().setIsflend("0");
	}

	/**
	 * Process operation toCDCUS03D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS03D_HEADER1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dHeader1 vo) {
		mapper.updateCdcus03dHeader1FromHeader1(ctx, ctrl, ctx.getHeader1(), vo);
		mapper.applyCdcus03dHeader1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS03D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS03D_HEADER2(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dHeader2 vo) {
		mapper.updateHeader2FromCdcus03dHeader2(ctx, ctrl, vo, ctx.getHeader2());
	}

	/**
	 * Process operation toCDCUS03D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS03D_HEADER2(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dHeader2 vo) {
		mapper.updateCdcus03dHeader2FromHeader2(ctx, ctrl, ctx.getHeader2(), vo);
		mapper.applyCdcus03dHeader2MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS03D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS03D_SFL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dSfl1 vo) {
		mapper.updateSfl1FromCdcus03dSfl1(ctx, ctrl, vo, ctx.getSfl1());
	}

	/**
	 * Process operation toCDCUS03D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS03D_SFL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dSfl1 vo) {
		mapper.updateCdcus03dSfl1FromSfl1(ctx, ctrl, ctx.getSfl1(), vo);
		mapper.applyCdcus03dSfl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS03D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS03D_CTL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dCtl1 vo) {
		mapper.applyCdcus03dCtl1MiscIn(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS03D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS03D_CTL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dCtl1 vo) {
		mapper.applyCdcus03dCtl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS03D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS03D_FOOTER(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dFooter vo) {
		mapper.applyCdcus03dFooterMiscOut(ctx, ctrl, vo);
	}

}
