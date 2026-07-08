
package aws.bluage.carddemo.cdact01r.service.impl;

import aws.bluage.carddemo.cdact01r.business.context.Cdact01rContext;
import aws.bluage.carddemo.cdact01r.service.Cdact01rProcess;
import aws.bluage.carddemo.cdact01r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dDelerrwin;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dDelwin;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dFilterwin;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdact01dSfl1;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
import com.netfective.bluage.gapwalk.runtime.screen.WorkstationIO;
import com.netfective.bluage.gapwalk.runtime.statements.CallHandler;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.MessageHandlingBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.ScanHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdact01rProcessImpl
 * 
 * Defines application services for Cdact01rProcess
 * @see Cdact01rProcess
 */
@Service("aws.bluage.carddemo.cdact01r.service.Cdact01rProcess")
@Import({
aws.bluage.carddemo.cdact01r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdact01rProcessImpl implements Cdact01rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdact01rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdact01rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		<--START COPYBOOK *LIBL/QCPYSRC COPYUTILPR -->
		** Test Numeric */
		ctx.getPgmstatus().setArgumentsCount(ctx.getArguments().length);
		ctx.getPgmstatus().setJobName(SharedContext.get().getJobName());
		ctx.getPgmstatus().setUserid(SharedContext.get().getUserName());
		if (ctx.isFirstRun()) {
			WorkstationIO.newInstance(ctrl, ctx, "CDACT01D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCCMR02)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
			.open();
		} 
		ctx.setFirstRun(false);
		do {
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				break;
			} else {
				MAINCODE(ctx, ctrl);
			}
		} while (true);
		ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
		if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.close();
			DAOManager.getDAO(ctx, FileIds.CDCCMR02)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDACT01D")
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
	public void MAINCODE(final Cdact01rContext ctx, final ExecutionController ctrl) {
		NumberUtils.replaceDigits("13", ctx.getPagesize().getPagesizeReference(), false);
		DataUtils.setToBlank(ctx.getMsgid().getMsgidReference());
		ctx.getSkipflag().setSkipflag(" ");
		ctx.getScanpos().setScanpos(0);
		ctx.getApplyfltr().setApplyfltr(" ");
		ctx.getApplyfltsv().setApplyfltsv(" ");
		ctx.getTrigrefresh().setTrigrefresh(" ");
		ctx.getLoadstatus().setLoadstatus("ACTIVE");
		
		/* 
		***********************************************************************
		MAIN PROCESSING                                                      *
		*********************************************************************** */
		ctx.getSharedRecordFields().getPgmqReference().setValue(ctx.getPgmstatus().getPgmnameReference());
		WorkstationIO.newInstance(ctrl, ctx, Cdact01dMsgsflc.class, "CDACT01D")
		.fieldsToRecord(sbean -> toCDACT01D_MSGSFLC(ctx, ctrl, sbean))
		.write();
		if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withKeys(ctx.getWactivests().getWactivests())
			.setOnGreaterOrEqual();
		} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withLowValueKeys()
			.setOnGreaterOrEqual();
		} 
		DLPGDN(ctx, ctrl);
		while (1 == 1) {
			if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
				ctx.getFooter().setVaryft("F8=All  F9=Filter  F12=Cancel");
			} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
				ctx.getFooter().setVaryft("F8=Active  F9=Filter  F12=Cancel");
			} 
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dHeader1.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dHeader2.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_HEADER2(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dFooter.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_FOOTER(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dMsgsflc.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			ctx.getCtl1().setSflrrn(1);
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dCtl1.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_CTL1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dCtl1.class, "CDACT01D")
			.recordToFields(sbean -> fromCDACT01D_CTL1(ctx, ctrl, sbean))
			.read();
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.call("CDUTL02C");
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dHeader2.class, "CDACT01D")
			.recordToFields(sbean -> fromCDACT01D_HEADER2(ctx, ctrl, sbean))
			.read();
			ctx.getIndicatorsGroup().setIn80("0");
			ctx.getIndicatorsGroup().setIn81("0");
			if (DataUtils.compare(ctx.getIndicatorsGroup().getIn03Reference(), "1") == 0 || DataUtils.compare(ctx.getIndicatorsGroup().getIn12Reference(), "1") == 0) {
				break;
			} else {
				if (DataUtils.compare(ctx.getIndicatorsGroup().getIn05Reference(), "1") == 0) {
					DLREFRESH(ctx, ctrl);
					continue;
				} else {
					if (DataUtils.compare(ctx.getIndicatorsGroup().getIn06Reference(), "1") == 0) {
						DLADD(ctx, ctrl);
						if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
							DAOManager.getDAO(ctx, FileIds.CDACTR04)
							.withKeys(ctx.getWactivests().getWactivests(), ctx.getFirstkey().getFirstkey())
							.setOnGreaterOrEqual();
						} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
							DAOManager.getDAO(ctx, FileIds.CDACTU01)
							.withKeys(ctx.getFirstkey().getFirstkey())
							.setOnGreaterOrEqual();
						} 
						DLPGDN(ctx, ctrl);
						continue;
					} else {
						if (DataUtils.compare(ctx.getIndicatorsGroup().getIn08Reference(), "1") == 0) {
							if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
								ctx.getLoadstatus().setLoadstatus("ALL");
							} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
								ctx.getLoadstatus().setLoadstatus("ACTIVE");
							} 
							DLTOGGLE(ctx, ctrl);
							continue;
						} else {
							if (DataUtils.compare(ctx.getIndicatorsGroup().getIn09Reference(), "1") == 0) {
								DLSETFILTER(ctx, ctrl);
								continue;
							} else {
								if (DataUtils.compare(ctx.getIndicatorsGroup().getIn25Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn33Reference(), "0") == 0) {
									if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
										DAOManager.getDAO(ctx, FileIds.CDACTR04)
										.withKeys(ctx.getWactivests().getWactivests(), ctx.getLastkey().getLastkey())
										.setOnGreaterOrEqual();
									} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
										DAOManager.getDAO(ctx, FileIds.CDACTU01)
										.withKeys(ctx.getLastkey().getLastkey())
										.setOnGreaterOrEqual();
									} 
									DLPGDN(ctx, ctrl);
									continue;
								} else {
									if (DataUtils.compare(ctx.getIndicatorsGroup().getIn26Reference(), "1") == 0) {
										DLPGUP(ctx, ctrl);
										continue;
									} else {
										if (DataUtils.compare(ctx.getIndicatorsGroup().getIn50Reference(), "1") == 0) {
											continue;
										} else {
											if (!(DataUtils.isBlankOrLowValues(ctx.getHeader2().getPosition()))) {
												DLPOS(ctx, ctrl);
												continue;
											} else {
												if (DataUtils.compare(ctx.getIndicatorsGroup().getIn30Reference(), "0") == 0) {
													DLREADSFL(ctx, ctrl);
												} 
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		ctx.getInLR().setInLR("1");
		
		/* 
		************************************************************************
		$TOGGLE - Toggle between Active and All records                       *
		************************************************************************
		************************************************************************
		$REFRESH - Refresh subfile                                            *
		************************************************************************
		************************************************************************
		$PGUP - READ BACK TO PAGE UP                                          *
		************************************************************************
		************************************************************************
		SflTopLogic - Check for Pageup                                        *
		************************************************************************
		************************************************************************
		$POS - POSTION TO                                                     *
		************************************************************************
		************************************************************************
		$PGUP#ALL - READ BACK TO PAGE UP                                          *
		************************************************************************
		************************************************************************
		$PGUP#ACT - READ BACK TO PAGE UP                                          *
		************************************************************************
		************************************************************************
		$PGDN - ADVANCE TO NEXT PAGE                                          *
		************************************************************************
		************************************************************************
		$PGDNALL - ADVANCE TO NEXT PAGE                                          *
		************************************************************************
		************************************************************************
		$PGDNACT - ADVANCE TO NEXT PAGE                                          *
		************************************************************************
		************************************************************************
		$POSALL - POSITION TO RECORD                                             *
		************************************************************************
		************************************************************************
		$POSACT - POSITION TO RECORD                                             *
		************************************************************************
		************************************************************************
		$REFRESHALL - REFRESH SUBFILE CONTENTS                                   *
		************************************************************************
		************************************************************************
		$REFRESHACT - REFRESH SUBFILE CONTENTS                                   *
		************************************************************************
		************************************************************************
		$FILL - POPULATE SUBFILE DATA                                         *
		************************************************************************
		************************************************************************
		$READSFL - READ SUBFILE OPTIONS                                       *
		************************************************************************
		************************************************************************
		$DTL - SHOW ACCOUNT DETAILS                                           *
		************************************************************************
		************************************************************************
		$UPD - UPDATE ACCOUNT DETAILS                                         *
		************************************************************************
		************************************************************************
		$ADD - CREATE NEW ACCOUNT                                             *
		************************************************************************
		************************************************************************
		$SETFILTER - SHOW AND SET FILTER OPTIONS                              *
		************************************************************************
		************************************************************************
		$CHKFILTER - DETERMINE IF FILTER CRITERIA SHOULD BE APPLIED           *
		************************************************************************
		************************************************************************
		$FILTER - DETERMINE WHETHER RECORD MEETS FILTER CRITERIA              *
		************************************************************************
		************************************************************************
		$DELETE - CONFIRM DELETION OF ACCOUNT                                 *
		************************************************************************
		************************************************************************
		$ERR - WRITE TO MESSAGE SUBFILE                                       *
		************************************************************************ */
		return;
	}

	/**
	 * Process operation DLTOGGLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLTOGGLE(final Cdact01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withKeys(ctx.getWactivests().getWactivests(), ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
		} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withKeys(ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
		} 
		DLPGDN(ctx, ctrl);
	}

	/**
	 * Process operation DLREFRESH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLREFRESH(final Cdact01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
			DLREFRESHACT(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
			DLREFRESHALL(ctx, ctrl);
		}
	}

	/**
	 * Process operation DLPGUP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPGUP(final Cdact01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getWsflempty().getWsflemptyReference(), "Y") == 0) {
			DataUtils.setToHighValues(ctx.getFirstkey().getFirstkeyReference());
		} 
		SFLTOPLOGIC(ctx, ctrl);
		if (DataUtils.isBlankOrLowValues(ctx.getWsfltop().getWsfltop())) {
			if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
				DLPGUPSHACT(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
				DLPGUPSHALL(ctx, ctrl);
			} 
		}
	}

	/**
	 * Process operation SFLTOPLOGIC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void SFLTOPLOGIC(final Cdact01rContext ctx, final ExecutionController ctrl) {
		DataUtils.setToBlank(ctx.getWsfltop().getWsfltopReference());
		if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withKeys(ctx.getWactivests().getWactivests(), ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withRecord(ctx.getCdatr04())
			.withMapper(() -> this.inputCdR04(ctx, ctrl))
			.withKeys(ctx.getWactivests().getWactivests())
			.readPriorEqual();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTR04).getEofReference()) == 0) {
				ctx.getWsfltop().setWsfltop("Y");
			} 
		} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withKeys(ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withRecord(ctx.getCdactpr())
			.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
			.noLock()
			.readPriorRecord();
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTU01).getEofReference()) == 0) {
				ctx.getWsfltop().setWsfltop("Y");
			} 
		}
	}

	/**
	 * Process operation DLPOS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPOS(final Cdact01rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
			DLPOSACT(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
			DLPOSALL(ctx, ctrl);
		}
	}

	/**
	 * Process operation DLPGUPSHALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPGUPSHALL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn30("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdact01dCtl1.class, "CDACT01D")
		.fieldsToRecord(sbean -> toCDACT01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatorsGroup().setIn30("0");
		ctx.getCtl1().setSflrrn(0);
		DataUtils.initialize(ctx.getReadct().getReadctReference());
		DAOManager.getDAO(ctx, FileIds.CDACTU01)
		.withKeys(ctx.getFirstkey().getFirstkey())
		.setOnGreaterOrEqual();
		while (ctx.getReadct().getReadct() <= ctx.getPagesize().getPagesize()) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withRecord(ctx.getCdactpr())
			.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
			.noLock()
			.eofIndicator(ctx.getIndicatorsGroup().getIn90Reference())
			.readPriorRecord();
			if (DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") == 0) {
				DAOManager.getDAO(ctx, FileIds.CDACTU01)
				.withLowValueKeys()
				.setOnGreaterOrEqual();
				break;
			} else {
				ctx.getSkipflag().setSkipflag("0");
				DLFILTER(ctx, ctrl);
				if (DataUtils.compare(ctx.getSkipflag().getSkipflagReference(), "1") == 0) {
					DAOManager.getDAO(ctx, FileIds.CDACTU01)
					.withRecord(ctx.getCdactpr())
					.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
					.noLock()
					.readPriorRecord();
					continue;
				} else {
					ctx.getReadct().setReadct(ctx.getReadct().getReadct() + 1);
				}
			}
		}
		DLPGDN(ctx, ctrl);
	}

	/**
	 * Process operation DLPGUPSHACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPGUPSHACT(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn30("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdact01dCtl1.class, "CDACT01D")
		.fieldsToRecord(sbean -> toCDACT01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatorsGroup().setIn30("0");
		ctx.getCtl1().setSflrrn(0);
		DataUtils.initialize(ctx.getReadct().getReadctReference());
		DAOManager.getDAO(ctx, FileIds.CDACTR04)
		.withKeys(ctx.getWactivests().getWactivests(), ctx.getFirstkey().getFirstkey())
		.setOnGreaterOrEqual();
		while (ctx.getReadct().getReadct() <= ctx.getPagesize().getPagesize()) {
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withRecord(ctx.getCdatr04())
			.withMapper(() -> this.inputCdR04(ctx, ctrl))
			.withKeys(ctx.getWactivests().getWactivests())
			.eofIndicator(ctx.getIndicatorsGroup().getIn90Reference())
			.readPriorEqual();
			if (DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") == 0) {
				DAOManager.getDAO(ctx, FileIds.CDACTR04)
				.withKeys(ctx.getWactivests().getWactivests())
				.setOnGreaterOrEqual();
				break;
			} else {
				ctx.getSkipflag().setSkipflag("0");
				DLFILTER(ctx, ctrl);
				if (DataUtils.compare(ctx.getSkipflag().getSkipflagReference(), "1") == 0) {
					DAOManager.getDAO(ctx, FileIds.CDACTR04)
					.withRecord(ctx.getCdatr04())
					.withMapper(() -> this.inputCdR04(ctx, ctrl))
					.withKeys(ctx.getWactivests().getWactivests())
					.eofIndicator(ctx.getIndicatorsGroup().getIn90Reference())
					.readPriorEqual();
					continue;
				} else {
					ctx.getReadct().setReadct(ctx.getReadct().getReadct() + 1);
				}
			}
		}
		DLPGDN(ctx, ctrl);
	}

	/**
	 * Process operation DLPGDN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPGDN(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getWsflempty().setWsflempty("N");
		ctx.getIndicatorsGroup().setIn95("0");
		if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
			DLPGDNSHACT(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
			DLPGDNSHALL(ctx, ctrl);
		}
	}

	/**
	 * Process operation DLPGDNSHALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPGDNSHALL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn31("0");
		ctx.getIndicatorsGroup().setIn30("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdact01dCtl1.class, "CDACT01D")
		.fieldsToRecord(sbean -> toCDACT01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatorsGroup().setIn30("0");
		ctx.getCtl1().setSflrrn(0);
		ctx.getFirstkey().setFirstkey((long) 0);
		DAOManager.getDAO(ctx, FileIds.CDACTU01)
		.withRecord(ctx.getCdactpr())
		.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
		.noLock()
		.readCurrentRecord();
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTU01).getEofReference()) == 0)) {
			if (NumberUtils.eq(ctx.getCtl1().getSflrrnReference(), ctx.getPagesize().getPagesizeReference())) {
				ctx.getIndicatorsGroup().setIn33("0");
				break;
			} else {
				ctx.getSkipflag().setSkipflag("0");
				DLFILTER(ctx, ctrl);
				if (DataUtils.compare(ctx.getSkipflag().getSkipflagReference(), "1") == 0) {
					DAOManager.getDAO(ctx, FileIds.CDACTU01)
					.withRecord(ctx.getCdactpr())
					.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
					.noLock()
					.readCurrentRecord();
					continue;
				} else {
					if (ctx.getFirstkey().getFirstkey() == 0) {
						ctx.getFirstkey().getFirstkeyReference().setValue(ctx.getSharedRecordFields().getAcctnumReference());
					} 
					ctx.getCtl1().setSflrrn(ctx.getCtl1().getSflrrn() + 1);
					DLFILL(ctx, ctrl);
					WorkstationIO.newInstance(ctrl, ctx, Cdact01dSfl1.class, "CDACT01D")
					.withRRN(ctx.getCtl1().getSflrrnReference())
					.fieldsToRecord(sbean -> toCDACT01D_SFL1(ctx, ctrl, sbean))
					.write();
					DAOManager.getDAO(ctx, FileIds.CDACTU01)
					.withRecord(ctx.getCdactpr())
					.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
					.noLock()
					.readCurrentRecord();
				}
			}
		}
		if (NumberUtils.eq(ctx.getCtl1().getSflrrnReference(), 0)) {
			ctx.getIndicatorsGroup().setIn30("1");
			ctx.getIndicatorsGroup().setIn31("1");
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dEmpty.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_EMPTY(ctx, ctrl, sbean))
			.write();
			ctx.getWsflempty().setWsflempty("Y");
			ctx.getIndicatorsGroup().setIn95("1");
		} else {
			ctx.getIndicatorsGroup().setIn31("0");
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTU01).getEofReference()) == 0) {
				ctx.getIndicatorsGroup().setIn33("1");
			} 
		}
		ctx.getLastkey().getLastkeyReference().setValue(ctx.getSharedRecordFields().getAcctnumReference());
	}

	/**
	 * Process operation DLPGDNSHACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPGDNSHACT(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn31("0");
		ctx.getIndicatorsGroup().setIn30("1");
		WorkstationIO.newInstance(ctrl, ctx, Cdact01dCtl1.class, "CDACT01D")
		.fieldsToRecord(sbean -> toCDACT01D_CTL1(ctx, ctrl, sbean))
		.write();
		ctx.getIndicatorsGroup().setIn30("0");
		ctx.getCtl1().setSflrrn(0);
		ctx.getFirstkey().setFirstkey((long) 0);
		DAOManager.getDAO(ctx, FileIds.CDACTR04)
		.withRecord(ctx.getCdatr04())
		.withMapper(() -> this.inputCdR04(ctx, ctrl))
		.withKeys(ctx.getWactivests().getWactivests())
		.readNextEqual();
		while (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTR04).getEofReference()) == 0)) {
			if (NumberUtils.eq(ctx.getCtl1().getSflrrnReference(), ctx.getPagesize().getPagesizeReference())) {
				ctx.getIndicatorsGroup().setIn33("0");
				break;
			} else {
				ctx.getSkipflag().setSkipflag("0");
				DLFILTER(ctx, ctrl);
				if (DataUtils.compare(ctx.getSkipflag().getSkipflagReference(), "1") == 0) {
					DAOManager.getDAO(ctx, FileIds.CDACTR04)
					.withRecord(ctx.getCdatr04())
					.withMapper(() -> this.inputCdR04(ctx, ctrl))
					.withKeys(ctx.getWactivests().getWactivests())
					.readNextEqual();
					continue;
				} else {
					if (ctx.getFirstkey().getFirstkey() == 0) {
						ctx.getFirstkey().getFirstkeyReference().setValue(ctx.getSharedRecordFields().getAcctnumReference());
					} 
					ctx.getCtl1().setSflrrn(ctx.getCtl1().getSflrrn() + 1);
					DLFILL(ctx, ctrl);
					WorkstationIO.newInstance(ctrl, ctx, Cdact01dSfl1.class, "CDACT01D")
					.withRRN(ctx.getCtl1().getSflrrnReference())
					.fieldsToRecord(sbean -> toCDACT01D_SFL1(ctx, ctrl, sbean))
					.write();
					DAOManager.getDAO(ctx, FileIds.CDACTR04)
					.withRecord(ctx.getCdatr04())
					.withMapper(() -> this.inputCdR04(ctx, ctrl))
					.withKeys(ctx.getWactivests().getWactivests())
					.readNextEqual();
				}
			}
		}
		if (NumberUtils.eq(ctx.getCtl1().getSflrrnReference(), 0)) {
			ctx.getIndicatorsGroup().setIn30("1");
			ctx.getIndicatorsGroup().setIn31("1");
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dEmpty.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_EMPTY(ctx, ctrl, sbean))
			.write();
			ctx.getWsflempty().setWsflempty("Y");
			ctx.getIndicatorsGroup().setIn95("1");
		} else {
			ctx.getIndicatorsGroup().setIn31("0");
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDACTR04).getEofReference()) == 0) {
				ctx.getIndicatorsGroup().setIn33("1");
			} 
		}
		ctx.getLastkey().getLastkeyReference().setValue(ctx.getSharedRecordFields().getAcctnumReference());
	}

	/**
	 * Process operation DLPOSALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPOSALL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getHeader2().setPosition(ctx.getHeader2().getPosition().trim());
		ctx.getWteststring().setWteststring(ctx.getHeader2().getPosition());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getWteststring().getWteststringReference())
		.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
		.call("ISNUMERIC");
		if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
			ctx.getMsgid().setMsgid(StringUtils.overlay(ctx.getMsgid().getMsgid(), "ERR0016", 0, 7));
			ctx.getIndicatorsGroup().setIn81("1");
			DLERR(ctx, ctrl);
			return;
		} else {
			ctx.getFirstkey().setFirstkey(NumberUtils.toDecimal(ctx.getHeader2().getPosition(), 12, 0, false).longValue());
			DataUtils.initialize(ctx.getHeader2().getPositionReference());
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withKeys(ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
			DLPGDN(ctx, ctrl);
		}
	}

	/**
	 * Process operation DLPOSACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLPOSACT(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getHeader2().setPosition(ctx.getHeader2().getPosition().trim());
		ctx.getWteststring().setWteststring(ctx.getHeader2().getPosition());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getWteststring().getWteststringReference())
		.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
		.call("ISNUMERIC");
		if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
			ctx.getMsgid().setMsgid(StringUtils.overlay(ctx.getMsgid().getMsgid(), "ERR0016", 0, 7));
			ctx.getIndicatorsGroup().setIn81("1");
			DLERR(ctx, ctrl);
			return;
		} else {
			ctx.getFirstkey().setFirstkey(NumberUtils.toDecimal(ctx.getHeader2().getPosition(), 12, 0, false).longValue());
			DataUtils.initialize(ctx.getHeader2().getPositionReference());
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withKeys(ctx.getWactivests().getWactivests(), ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
			DLPGDN(ctx, ctrl);
		}
	}

	/**
	 * Process operation DLREFRESHALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLREFRESHALL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		DataUtils.initialize(ctx.getHeader2().getPositionReference());
		DataUtils.initialize(ctx.getFilterwin().getCustfltrReference());
		DataUtils.initialize(ctx.getApplyfltr().getApplyfltrReference());
		DAOManager.getDAO(ctx, FileIds.CDACTU01)
		.withLowValueKeys()
		.setOnGreaterOrEqual();
		DLPGDN(ctx, ctrl);
	}

	/**
	 * Process operation DLREFRESHACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLREFRESHACT(final Cdact01rContext ctx, final ExecutionController ctrl) {
		DataUtils.initialize(ctx.getHeader2().getPositionReference());
		DataUtils.initialize(ctx.getFilterwin().getCustfltrReference());
		DataUtils.initialize(ctx.getApplyfltr().getApplyfltrReference());
		DAOManager.getDAO(ctx, FileIds.CDACTR04)
		.withKeys(ctx.getWactivests().getWactivests())
		.setOnGreaterOrEqual();
		DLPGDN(ctx, ctrl);
	}

	/**
	 * Process operation DLFILL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLFILL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		DataUtils.setToBlank(ctx.getSfl1().getOptionReference());
		ctx.getSfl1().setSflpcust(NumberUtils.editC(ctx.getCdactpr().getPricustid(), "X", 9));
		ctx.getSfl1().setSflpcust(ctx.getSfl1().getSflpcust().trim());
		if (ctx.getCdactpr().getSeccustid() == 0) {
			ctx.getSfl1().setSflscust("-");
		} else {
			ctx.getSfl1().setSflscust(NumberUtils.editC(ctx.getCdactpr().getSeccustid(), "X", 9));
			ctx.getSfl1().setSflscust(ctx.getSfl1().getSflscust().trim());
		}
		if (NumberUtils.compare(ctx.getCdactpr().getBalance(), 0) == 0) {
			ctx.getSfl1().setSflbal("$0");
		} else {
			ctx.getSfl1().setSflbal(NumberUtils.editC(ctx.getCdactpr().getBalance(), "N", "$", 9));
			ctx.getSfl1().setSflbal(ctx.getSfl1().getSflbal().trim());
		}
		if (NumberUtils.compare(ctx.getCdactpr().getBalance(), 0) < 0) {
			ctx.getIndicatorsGroup().setIn92("1");
		} else {
			ctx.getIndicatorsGroup().setIn92("0");
		}
		ctx.getSfl1().setSflacct(NumberUtils.editC(ctx.getSharedRecordFields().getAcctnum(), "X", 12));
		ctx.getSfl1().setSflacct(ctx.getSfl1().getSflacct().trim());
		ctx.getSfl1().setSflsts(ctx.getCdactpr().getActive().trim());
	}

	/**
	 * Process operation DLREADSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLREADSFL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		DataUtils.setToBlank(ctx.getMsgid().getMsgidReference());
		WorkstationIO.newInstance(ctrl, ctx, Cdact01dSfl1.class, "CDACT01D")
		.withRRN(ctx.getCtl1().getSflrrnReference())
		.recordToFields(sbean -> fromCDACT01D_SFL1(ctx, ctrl, sbean))
		.eofIndicator(ctx.getIndicatorsGroup().getIn91Reference())
		.readNextChangedRecord();
		while (DataUtils.compare(ctx.getIndicatorsGroup().getIn91Reference(), "0") == 0) {
			if (DataUtils.compare(" ", ctx.getSfl1().getOptionReference()) != 0) {
				if (DataUtils.compare("2", ctx.getSfl1().getOptionReference()) == 0) {
					DLUPD(ctx, ctrl);
				} else {
					if (DataUtils.compare("4", ctx.getSfl1().getOptionReference()) == 0) {
						DLDELETE(ctx, ctrl);
					} else {
						if (DataUtils.compare("5", ctx.getSfl1().getOptionReference()) == 0) {
							DLDTL(ctx, ctrl);
						} else {
							ctx.getIndicatorsGroup().setIn34("1");
							ctx.getMsgid().setMsgid(StringUtils.overlay(ctx.getMsgid().getMsgid(), "ERR0001", 0, 7));
							ctx.getIndicatorsGroup().setIn60("1");
							DLERR(ctx, ctrl);
							break;
						}
					}
				}
			} 
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dSfl1.class, "CDACT01D")
			.withRRN(ctx.getCtl1().getSflrrnReference())
			.recordToFields(sbean -> fromCDACT01D_SFL1(ctx, ctrl, sbean))
			.eofIndicator(ctx.getIndicatorsGroup().getIn91Reference())
			.readNextChangedRecord();
		}
		if (DataUtils.isBlankOrLowValues(ctx.getMsgid().getMsgid()) && DataUtils.compare(ctx.getTrigrefresh().getTrigrefreshReference(), "1") == 0) {
			DLREFRESH(ctx, ctrl);
		} 
		ctx.getTrigrefresh().setTrigrefresh("0");
	}

	/**
	 * Process operation DLDTL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLDTL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().setAcctnum(NumberUtils.toDecimal(ctx.getSfl1().getSflacct(), 16, 0, false).longValue());
		ctx.getViewonly().setViewonly("1");
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getSharedRecordFields().getAcctnumReference(),
			ctx.getViewonly().getViewonlyReference())
		.call("CDACT02R");
		ctx.getTrigrefresh().setTrigrefresh("1");
	}

	/**
	 * Process operation DLUPD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLUPD(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicatorsGroup().setIn40("0");
		if (DataUtils.compare("A", ctx.getSfl1().getSflstsReference()) == 0) {
			ctx.getSharedRecordFields().setAcctnum(NumberUtils.toDecimal(ctx.getSfl1().getSflacct(), 16, 0, false).longValue());
			ctx.getViewonly().setViewonly("0");
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(ctx.getSharedRecordFields().getAcctnumReference(),
				ctx.getViewonly().getViewonlyReference())
			.call("CDACT02R");
		} else if (DataUtils.compare("I", ctx.getSfl1().getSflstsReference()) == 0) {
			ctx.getIndicatorsGroup().setIn32("1");
			ctx.getIndicatorsGroup().setIn40("1");
			ctx.getSharedRecordFields().getActidReference().setValue(ctx.getSfl1().getSflacctReference());
			ctx.getDelerrwin().setErrdelw("Cannot edit inactive account.");
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dHeader1.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelerrwin.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_DELERRWIN(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelerrwin.class, "CDACT01D")
			.recordToFields(sbean -> fromCDACT01D_DELERRWIN(ctx, ctrl, sbean))
			.read();
		} 
		ctx.getTrigrefresh().setTrigrefresh("1");
	}

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLADD(final Cdact01rContext ctx, final ExecutionController ctrl) {
		DataUtils.initialize(ctx.getSharedRecordFields().getAcctnumReference());
		DataUtils.initialize(ctx.getViewonly().getViewonlyReference());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getSharedRecordFields().getAcctnumReference(),
			ctx.getViewonly().getViewonlyReference())
		.call("CDACT02R");
		ctx.getTrigrefresh().setTrigrefresh("1");
	}

	/**
	 * Process operation DLSETFILTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLSETFILTER(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getCustfltsv().getCustfltsvReference().setValue(ctx.getFilterwin().getCustfltrReference());
		ctx.getApplyfltsv().getApplyfltsvReference().setValue(ctx.getApplyfltr().getApplyfltrReference());
		ctx.getIndicatorsGroup().setIn90("1");
		ctx.getIndicatorsGroup().setIn91("0");
		while (1 == 1) {
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dFilterwin.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_FILTERWIN(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dFilterwin.class, "CDACT01D")
			.recordToFields(sbean -> fromCDACT01D_FILTERWIN(ctx, ctrl, sbean))
			.read();
			ctx.getIndicatorsGroup().setIn90("1");
			if (DataUtils.compare(ctx.getIndicatorsGroup().getIn02Reference(), "1") == 0) {
				DataUtils.initialize(ctx.getFilterwin().getCustfltrReference());
				DataUtils.initialize(ctx.getApplyfltr().getApplyfltrReference());
				continue;
			} else {
				if (DataUtils.compare(ctx.getIndicatorsGroup().getIn12Reference(), "1") == 0) {
					DataUtils.initialize(ctx.getFilterwin().getCustfltrReference());
					ctx.getFilterwin().getCustfltrReference().setValue(ctx.getCustfltsv().getCustfltsvReference());
					DataUtils.initialize(ctx.getApplyfltr().getApplyfltrReference());
					ctx.getApplyfltr().getApplyfltrReference().setValue(ctx.getApplyfltsv().getApplyfltsvReference());
					break;
				} else {
					if (DataUtils.compare(ctx.getIndicatorsGroup().getIn50Reference(), "1") == 0) {
						continue;
					} else {
						if (!(DataUtils.isBlankOrLowValues(ctx.getFilterwin().getCustfltr()))) {
							ctx.getFilterwin().setCustfltr(ctx.getFilterwin().getCustfltr().trim());
							ctx.getWteststring().setWteststring(ctx.getFilterwin().getCustfltr().trim());
							CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
							.byReference(ctx.getWteststring().getWteststringReference())
							.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
							.call("ISNUMERIC");
							if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
								ctx.getIndicatorsGroup().setIn90("0");
								continue;
							} 
						} 
						DLCHKFILTER(ctx, ctrl);
						break;
					}
				}
			}
		}
	}

	/**
	 * Process operation DLCHKFILTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLCHKFILTER(final Cdact01rContext ctx, final ExecutionController ctrl) {
		if (!(DataUtils.isBlankOrLowValues(ctx.getFilterwin().getCustfltr()))) {
			ctx.getApplyfltr().setApplyfltr("1");
		} else {
			ctx.getApplyfltr().setApplyfltr("0");
		}
		if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ACTIVE") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTR04)
			.withKeys(ctx.getWactivests().getWactivests(), ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
		} else if (DataUtils.compare(ctx.getLoadstatus().getLoadstatusReference(), "ALL") == 0) {
			DAOManager.getDAO(ctx, FileIds.CDACTU01)
			.withKeys(ctx.getFirstkey().getFirstkey())
			.setOnGreaterOrEqual();
		} 
		DLPGDN(ctx, ctrl);
	}

	/**
	 * Process operation DLFILTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLFILTER(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getCustidc().setCustidc(NumberUtils.convertToPlainText(ctx.getCdactpr().getPricustid(), 9));
		ctx.getSkipflag().setSkipflag("0");
		if (!(DataUtils.isBlankOrLowValues(ctx.getFilterwin().getCustfltr()))) {
			ctx.getFilterstring().setFilterstring(ctx.getFilterwin().getCustfltr().trim());
			ScanHandler.newInstance(ctx).setResult(ctx.getScanpos().getScanposReference()).scan(ctx.getCustidc().getCustidc(), 0, ctx.getFilterstring().getFilterstring(), 0);
			if (ctx.getScanpos().getScanpos() == 0) {
				ctx.getSkipflag().setSkipflag("1");
				return;
			} 
		}
	}

	/**
	 * Process operation DLDELETE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLDELETE(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().setAcctnum(NumberUtils.toDecimal(ctx.getSfl1().getSflacct(), 16, 0, false).longValue());
		ctx.getWcreditcard().setWcreditcard("N");
		ctx.getWccmaccount().setWccmaccount((long) 0);
		ctx.getWccmpricust().setWccmpricust(0);
		ctx.getWccmseccust().setWccmseccust(0);
		ctx.getWccmaccount().setWccmaccount(NumberUtils.toDecimal(ctx.getSfl1().getSflacct(), 12, 0, false).longValue());
		DataUtils.setToBlank(ctx.getDelerrwin().getDpricustidReference());
		DataUtils.setToBlank(ctx.getDelerrwin().getDseccustidReference());
		ctx.getDelerrwin().setDpricredit((long) 0);
		ctx.getDelerrwin().setDseccredit((long) 0);
		if (!(DataUtils.isBlankOrLowValues(ctx.getSfl1().getSflpcust())) && DataUtils.compare("-", ctx.getSfl1().getSflpcust().trim()) != 0) {
			ctx.getWccmpricust().setWccmpricust(NumberUtils.toDecimal(ctx.getSfl1().getSflpcust(), 9, 0, false).intValue());
		} 
		if (!(DataUtils.isBlankOrLowValues(ctx.getSfl1().getSflscust())) && DataUtils.compare("-", ctx.getSfl1().getSflscust().trim()) != 0) {
			ctx.getWccmseccust().setWccmseccust(NumberUtils.toDecimal(ctx.getSfl1().getSflscust(), 9, 0, false).intValue());
		} 
		DAOManager.getDAO(ctx, FileIds.CDCCMR02)
		.withRecord(ctx.getCdccmpr())
		.withMapper(() -> this.inputCDCCMPR(ctx, ctrl))
		.withKeys(ctx.getWccmpricust().getWccmpricust(), ctx.getWccmaccount().getWccmaccount())
		.retrieve();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMR02).getFoundReference()) == 0) {
			ctx.getWcreditcard().setWcreditcard("Y");
			ctx.getDelerrwin().setDpricustid(NumberUtils.editC(ctx.getWccmpricust().getWccmpricust(), "X", 9));
			ctx.getDelerrwin().setDpricredit(ctx.getCdccmpr().getCardnum());
		} 
		DAOManager.getDAO(ctx, FileIds.CDCCMR02)
		.withRecord(ctx.getCdccmpr())
		.withMapper(() -> this.inputCDCCMPR(ctx, ctrl))
		.withKeys(ctx.getWccmseccust().getWccmseccust(), ctx.getWccmaccount().getWccmaccount())
		.retrieve();
		if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMR02).getFoundReference()) == 0) {
			ctx.getWcreditcard().setWcreditcard("Y");
			ctx.getDelerrwin().setDseccustid(NumberUtils.editC(ctx.getWccmseccust().getWccmseccust(), "X", 9));
			ctx.getDelerrwin().setDseccredit(ctx.getCdccmpr().getCardnum());
		} 
		ctx.getIndicatorsGroup().setIn40("0");
		if (DataUtils.compare("A", ctx.getSfl1().getSflstsReference()) == 0) {
			if (DataUtils.compare(ctx.getWcreditcard().getWcreditcardReference(), "N") == 0) {
				ctx.getIndicatorsGroup().setIn40("1");
				while (1 == 1) {
					ctx.getSharedRecordFields().getActidReference().setValue(ctx.getSfl1().getSflacctReference());
					WorkstationIO.newInstance(ctrl, ctx, Cdact01dHeader1.class, "CDACT01D")
					.fieldsToRecord(sbean -> toCDACT01D_HEADER1(ctx, ctrl, sbean))
					.write();
					WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelwin.class, "CDACT01D")
					.fieldsToRecord(sbean -> toCDACT01D_DELWIN(ctx, ctrl, sbean))
					.write();
					WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelwin.class, "CDACT01D")
					.recordToFields(sbean -> fromCDACT01D_DELWIN(ctx, ctrl, sbean))
					.read();
					if (DataUtils.compare(ctx.getIndicatorsGroup().getIn12Reference(), "1") == 0) {
						break;
					} else {
						if (DataUtils.compare(ctx.getIndicatorsGroup().getIn50Reference(), "1") == 0) {
							continue;
						} else {
							ctx.getSharedRecordFields().setAcctnum(NumberUtils.toDecimal(ctx.getSfl1().getSflacct(), 16, 0, false).longValue());
							DAOManager.getDAO(ctx, FileIds.CDACTU01)
							.withRecord(ctx.getCdactpr())
							.withMapper(() -> this.inputCDACTPR(ctx, ctrl))
							.withKeys(ctx.getSharedRecordFields().getAcctnum())
							.retrieve();
							ctx.getCdactpr().setActive("I");
							ctx.getCdactpr().setActchgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
							ctx.getCdactpr().setActchgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
							ctx.getCdactpr().getActchgusrReference().setValue(ctx.getPgmstatus().getUseridReference());
							ctx.getCdactpr().getActchgpgmReference().setValue(ctx.getPgmstatus().getPgmnameReference());
							DAOManager.getDAO(ctx, FileIds.CDACTU01)
							.withRecord(ctx.getCdactpr())
							.withMapper(() -> this.outputCDACTPR(ctx, ctrl))
							.update();
							ctx.getMsgid().setMsgid(StringUtils.overlay(ctx.getMsgid().getMsgid(), "MSG0009", 0, 7));
							DLERR(ctx, ctrl);
							DataUtils.initialize(ctx.getMsgid().getMsgidReference());
							break;
						}
					}
				}
			} else {
				ctx.getIndicatorsGroup().setIn32("0");
				ctx.getIndicatorsGroup().setIn40("0");
				ctx.getSharedRecordFields().getActidReference().setValue(ctx.getSfl1().getSflacctReference());
				ctx.getDelerrwin().setErrdelw(StringUtils.concat("Cannot inactivate this account ", "with credit card attached."));
				WorkstationIO.newInstance(ctrl, ctx, Cdact01dHeader1.class, "CDACT01D")
				.fieldsToRecord(sbean -> toCDACT01D_HEADER1(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelerrwin.class, "CDACT01D")
				.fieldsToRecord(sbean -> toCDACT01D_DELERRWIN(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelerrwin.class, "CDACT01D")
				.recordToFields(sbean -> fromCDACT01D_DELERRWIN(ctx, ctrl, sbean))
				.read();
			}
		} else if (DataUtils.compare("I", ctx.getSfl1().getSflstsReference()) == 0) {
			ctx.getIndicatorsGroup().setIn40("1");
			ctx.getIndicatorsGroup().setIn32("0");
			ctx.getSharedRecordFields().getActidReference().setValue(ctx.getSfl1().getSflacctReference());
			ctx.getDelerrwin().setErrdelw("Account is already inactive.");
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dHeader1.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_HEADER1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelerrwin.class, "CDACT01D")
			.fieldsToRecord(sbean -> toCDACT01D_DELERRWIN(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdact01dDelerrwin.class, "CDACT01D")
			.recordToFields(sbean -> fromCDACT01D_DELERRWIN(ctx, ctrl, sbean))
			.read();
		} 
		ctx.getTrigrefresh().setTrigrefresh("1");
	}

	/**
	 * Process operation DLERR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void DLERR(final Cdact01rContext ctx, final ExecutionController ctrl) {
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(ctx.getMsgid().getMsgidReference(),
			ctx.getSharedRecordFields().getPgmqReference())
		.call("CDUTL01C");
	}

	/**
	 * Process operation toCDACT01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_HEADER1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dHeader1 vo) {
		outputHEADER1(ctx, ctrl);
		mapper.updateCdact01dHeader1FromHeader1(ctx, ctrl, ctx.getHeader1(), vo);
		mapper.applyCdact01dHeader1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDACT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT01D_HEADER2(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dHeader2 vo) {
		mapper.applyCdact01dHeader2MiscIn(ctx, ctrl, vo);
		mapper.updateHeader2FromCdact01dHeader2(ctx, ctrl, vo, ctx.getHeader2());
	}

	/**
	 * Process operation toCDACT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_HEADER2(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dHeader2 vo) {
		mapper.updateCdact01dHeader2FromHeader2(ctx, ctrl, ctx.getHeader2(), vo);
		mapper.applyCdact01dHeader2MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDACT01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT01D_SFL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dSfl1 vo) {
		mapper.updateSfl1FromCdact01dSfl1(ctx, ctrl, vo, ctx.getSfl1());
		inputSFL1(ctx, ctrl);
	}

	/**
	 * Process operation toCDACT01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_SFL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dSfl1 vo) {
		outputSFL1(ctx, ctrl);
		mapper.updateCdact01dSfl1FromSfl1(ctx, ctrl, ctx.getSfl1(), vo);
		mapper.applyCdact01dSfl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDACT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT01D_CTL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dCtl1 vo) {
		mapper.applyCdact01dCtl1MiscIn(ctx, ctrl, vo);
		mapper.updateCtl1FromCdact01dCtl1(ctx, ctrl, vo, ctx.getCtl1());
	}

	/**
	 * Process operation toCDACT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_CTL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dCtl1 vo) {
		mapper.updateCdact01dCtl1FromCtl1(ctx, ctrl, ctx.getCtl1(), vo);
		mapper.applyCdact01dCtl1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDACT01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_FOOTER(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dFooter vo) {
		mapper.updateCdact01dFooterFromFooter(ctx, ctrl, ctx.getFooter(), vo);
		mapper.applyCdact01dFooterMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDACT01D_FILTERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT01D_FILTERWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dFilterwin vo) {
		mapper.applyCdact01dFilterwinMiscIn(ctx, ctrl, vo);
		mapper.updateFilterwinFromCdact01dFilterwin(ctx, ctrl, vo, ctx.getFilterwin());
	}

	/**
	 * Process operation toCDACT01D_FILTERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_FILTERWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dFilterwin vo) {
		mapper.updateCdact01dFilterwinFromFilterwin(ctx, ctrl, ctx.getFilterwin(), vo);
		mapper.applyCdact01dFilterwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDACT01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT01D_DELWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelwin vo) {
		mapper.applyCdact01dDelwinMiscIn(ctx, ctrl, vo);
		mapper.updateDelwinFromCdact01dDelwin(ctx, ctrl, vo, ctx.getDelwin());
		inputDELWIN(ctx, ctrl);
	}

	/**
	 * Process operation toCDACT01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_DELWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelwin vo) {
		outputDELWIN(ctx, ctrl);
		mapper.updateCdact01dDelwinFromDelwin(ctx, ctrl, ctx.getDelwin(), vo);
		mapper.applyCdact01dDelwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDACT01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDACT01D_DELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelerrwin vo) {
		mapper.applyCdact01dDelerrwinMiscIn(ctx, ctrl, vo);
		mapper.updateDelerrwinFromCdact01dDelerrwin(ctx, ctrl, vo, ctx.getDelerrwin());
		inputDELERRWIN(ctx, ctrl);
	}

	/**
	 * Process operation toCDACT01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_DELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelerrwin vo) {
		outputDELERRWIN(ctx, ctrl);
		mapper.updateCdact01dDelerrwinFromDelerrwin(ctx, ctrl, ctx.getDelerrwin(), vo);
		mapper.applyCdact01dDelerrwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDACT01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_MSGSFL(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdact01dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdact01dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDACT01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_MSGSFLC(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dMsgsflc vo) {
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
				WorkstationIO.newInstance(ctrl, ctx, Cdact01dMsgsfl.class, "CDACT01D")
				.fieldsToRecord(sbean -> toCDACT01D_MSGSFL(ctx, ctrl, sbean))
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
		mapper.updateCdact01dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdact01dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDACT01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDACT01D_EMPTY(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dEmpty vo) {
		mapper.applyCdact01dEmptyMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation inputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDACTPR(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getAcctnumReference().setValue(ctx.getCdactpr().getAcctnumReference());
		ctx.getSharedRecordFields().getOpendateReference().setValue(ctx.getCdactpr().getOpendateReference());
	}

	/**
	 * Process operation inputCdR04.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCdR04(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getAcctnumReference().setValue(ctx.getCdatr04().getAcctnumReference());
		ctx.getCdactpr().getActiveReference().setValue(ctx.getCdatr04().getActiveReference());
		ctx.getSharedRecordFields().getOpendateReference().setValue(ctx.getCdatr04().getOpendateReference());
		ctx.getCdactpr().getExpirydateReference().setValue(ctx.getCdatr04().getExpirydateReference());
		ctx.getCdactpr().getCredlimitReference().setValue(ctx.getCdatr04().getCredlimitReference());
		ctx.getCdactpr().getCashlimitReference().setValue(ctx.getCdatr04().getCashlimitReference());
		ctx.getCdactpr().getBalanceReference().setValue(ctx.getCdatr04().getBalanceReference());
		ctx.getCdactpr().getCurcreditReference().setValue(ctx.getCdatr04().getCurcreditReference());
		ctx.getCdactpr().getCurdebitReference().setValue(ctx.getCdatr04().getCurdebitReference());
		ctx.getCdactpr().getAcctgrpReference().setValue(ctx.getCdatr04().getAcctgrpReference());
		ctx.getCdactpr().getPricustidReference().setValue(ctx.getCdatr04().getPricustidReference());
		ctx.getCdactpr().getSeccustidReference().setValue(ctx.getCdatr04().getSeccustidReference());
		ctx.getCdactpr().getActcrtdtReference().setValue(ctx.getCdatr04().getActcrtdtReference());
		ctx.getCdactpr().getActcrttmReference().setValue(ctx.getCdatr04().getActcrttmReference());
		ctx.getCdactpr().getActcrtusrReference().setValue(ctx.getCdatr04().getActcrtusrReference());
		ctx.getCdactpr().getActcrtpgmReference().setValue(ctx.getCdatr04().getActcrtpgmReference());
		ctx.getCdactpr().getActchgdtReference().setValue(ctx.getCdatr04().getActchgdtReference());
		ctx.getCdactpr().getActchgtmReference().setValue(ctx.getCdatr04().getActchgtmReference());
		ctx.getCdactpr().getActchgusrReference().setValue(ctx.getCdatr04().getActchgusrReference());
		ctx.getCdactpr().getActchgpgmReference().setValue(ctx.getCdatr04().getActchgpgmReference());
	}

	/**
	 * Process operation inputCDCCMPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputCDCCMPR(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getAcctnumReference().setValue(ctx.getCdccmpr().getAcctnumReference());
	}

	/**
	 * Process operation inputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputSFL1(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getOpendateReference().setValue(ctx.getSfl1().getOpendateReference());
	}

	/**
	 * Process operation inputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputDELWIN(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getActidReference().setValue(ctx.getDelwin().getActidReference());
	}

	/**
	 * Process operation inputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void inputDELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSharedRecordFields().getActidReference().setValue(ctx.getDelerrwin().getActidReference());
	}

	/**
	 * Process operation outputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputCDACTPR(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getCdactpr().getAcctnumReference().setValue(ctx.getSharedRecordFields().getAcctnumReference());
		ctx.getCdactpr().getOpendateReference().setValue(ctx.getSharedRecordFields().getOpendateReference());
	}

	/**
	 * Process operation outputHEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputHEADER1(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getHeader1().getPgmnameReference().setValue(ctx.getPgmstatus().getPgmnameReference());
	}

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputSFL1(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getSfl1().getOpendateReference().setValue(ctx.getSharedRecordFields().getOpendateReference());
	}

	/**
	 * Process operation outputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputDELWIN(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getDelwin().getActidReference().setValue(ctx.getSharedRecordFields().getActidReference());
	}

	/**
	 * Process operation outputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputDELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getDelerrwin().getActidReference().setValue(ctx.getSharedRecordFields().getActidReference());
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getPgmqReference().setValue(ctx.getSharedRecordFields().getPgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdact01rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getPgmqReference().setValue(ctx.getSharedRecordFields().getPgmqReference());
	}

}
