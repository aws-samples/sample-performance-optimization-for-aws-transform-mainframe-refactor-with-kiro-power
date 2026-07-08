
package aws.bluage.carddemo.cdcus02r.service.impl;

import aws.bluage.carddemo.cdcus02r.business.BuildPhone.Numteststring;
import aws.bluage.carddemo.cdcus02r.business.CheckInput.Wnumteststring;
import aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rContext;
import aws.bluage.carddemo.cdcus02r.service.Cdcus02rProcess;
import aws.bluage.carddemo.cdcus02r.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dAddwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dGenderwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dScrn1;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
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
 * Class Cdcus02rProcessImpl
 * 
 * Defines application services for Cdcus02rProcess
 * @see Cdcus02rProcess
 */
@Service("aws.bluage.carddemo.cdcus02r.service.Cdcus02rProcess")
@Import({
aws.bluage.carddemo.cdcus02r.service.DataHolderMapper.class 
}) 	
@Lazy

public class Cdcus02rProcessImpl implements Cdcus02rProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdcus02rProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		** External Program Prototypes *** */
		ctx.getPcustid().bind(ArgUtils.get(ctx, 0));
		ctx.getPviewonly().bind(ArgUtils.get(ctx, 1));
		ctx.getProgramstatus().setArgumentsCount(ctx.getArguments().length);
		ctx.getProgramstatus().setJobName(SharedContext.get().getJobName());
		ctx.getProgramstatus().setUserid(SharedContext.get().getUserName());
		if (ctx.isFirstRun()) {
			ctx.getIndicators_pointer().setIndicators_pointer(ctrl.getExecutionContext().getAddress(ctx.getIndicatorsGroup().getIndicatorsReference()));
			WorkstationIO.newInstance(ctrl, ctx, "CDCus02D")
			.open();
			DAOManager.getDAO(ctx, FileIds.CDSTCP)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			DAOManager.getDAO(ctx, FileIds.CDCUSU01)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
			.withFileAddition()
			.open();
			ctx.setIndicatorsSnapshot(DataUtils.asRecord(ctx.getIndicators()).clone());
			ctx.setChangeCompleteSnapshot(DataUtils.asRecord(ctx.getChangecomplete().getChangecompleteReference()).clone());
			ctx.setStateChangedSnapshot(DataUtils.asRecord(ctx.getStatechanged().getStatechangedReference()).clone());
		} 
		ctx.setFirstRun(false);
		EntityUtils.track(ctx.getIndicators(), ctx.getIndicators_pointer().getIndicators_pointerReference(), ctrl);
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
			DAOManager.getDAO(ctx, FileIds.CDSTCP)
			.close();
			WorkstationIO.newInstance(ctrl, ctx, "CDCus02D")
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
	public void MAINCODE(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicators().setBytes(ctx.getIndicatorsSnapshot().getBytes());
		ctx.getChangecomplete().getChangecompleteReference().setBytes(ctx.getChangeCompleteSnapshot().getBytes());
		ctx.getStatechanged().getStatechangedReference().setBytes(ctx.getStateChangedSnapshot().getBytes());
		CLEARSCREEN(ctx, ctrl);
		if (ctx.getPcustid().getPcustid() == 0) {
			ctx.getIndicators().setAddmode("1");
		} else {
			FILLSCREEN(ctx, ctrl);
			SAVESTATEDB(ctx, ctrl);
		}
		ctx.getIndicators().getViewonlyReference().setValue(ctx.getPviewonly().getPviewonlyReference());
		ctx.getScrn1().getDpgmnameReference().setValue(ctx.getProgramstatus().getPgmnameReference());
		ctx.getSharedRecordFields().getDpgmqReference().setValue(ctx.getProgramstatus().getPgmnameReference());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.call("CDUTL02C");
		while (0 == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdcus02dMsgsflc.class, "CDCUS02D")
			.fieldsToRecord(sbean -> toCDCUS02D_MSGSFLC(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus02dScrn1.class, "CDCUS02D")
			.fieldsToRecord(sbean -> toCDCUS02D_SCRN1(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus02dScrn1.class, "CDCUS02D")
			.recordToFields(sbean -> fromCDCUS02D_SCRN1(ctx, ctrl, sbean))
			.read();
			if (DataUtils.compare(ctx.getIndicators().getF3Reference(), "1") == 0 || DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0) {
				break;
			} else if (DataUtils.compare(ctx.getIndicators().getF4Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0) {
				PROMPT(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getIndicators().getCommandkeyReference(), "1") == 0) {
			} else if (DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0) {
				CLEARINDS(ctx, ctrl);
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDUTL02C");
				ADDCUSTOMER(ctx, ctrl);
				if (DataUtils.compare(ctx.getChangecomplete().getChangecompleteReference(), "1") == 0) {
					break;
				} 
			} else if (DataUtils.compare(ctx.getIndicators().getViewonlyReference(), "1") == 0) {
				break;
			} else {
				CLEARINDS(ctx, ctrl);
				CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
				.call("CDUTL02C");
				CHECKCHANGE(ctx, ctrl);
				if (DataUtils.compare(ctx.getStatechanged().getStatechangedReference(), "1") == 0) {
					UPDATECUSTOMER(ctx, ctrl);
					if (DataUtils.compare(ctx.getChangecomplete().getChangecompleteReference(), "1") == 0) {
						break;
					} 
				} 
			}
		}
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation CLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CLEARSCREEN(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		DataUtils.setToBlank(ctx.getScrn1().getDcustidReference());
		DataUtils.setToBlank(ctx.getScrn1().getDssnReference());
		DataUtils.setToBlank(ctx.getScrn1().getDbirthyrReference());
		DataUtils.setToBlank(ctx.getScrn1().getDbirthmoReference());
		DataUtils.setToBlank(ctx.getScrn1().getDbirthdayReference());
		DataUtils.setToBlank(ctx.getScrn1().getDdobReference());
		DataUtils.setToBlank(ctx.getScrn1().getDgenderReference());
		DataUtils.setToBlank(ctx.getScrn1().getDficoscoreReference());
		DataUtils.setToBlank(ctx.getScrn1().getDfirstnameReference());
		DataUtils.setToBlank(ctx.getScrn1().getDmiddlenameReference());
		DataUtils.setToBlank(ctx.getScrn1().getDlastnameReference());
		DataUtils.setToBlank(ctx.getScrn1().getDaddress1Reference());
		DataUtils.setToBlank(ctx.getScrn1().getDaddress2Reference());
		DataUtils.setToBlank(ctx.getScrn1().getDcityReference());
		DataUtils.setToBlank(ctx.getScrn1().getDstateReference());
		DataUtils.setToBlank(ctx.getScrn1().getDzipReference());
		DataUtils.setToBlank(ctx.getScrn1().getDcountryReference());
		DataUtils.setToBlank(ctx.getScrn1().getDphone1areaReference());
		DataUtils.setToBlank(ctx.getScrn1().getDphone1f3Reference());
		DataUtils.setToBlank(ctx.getScrn1().getDphone1l4Reference());
		DataUtils.setToBlank(ctx.getScrn1().getDphone2areaReference());
		DataUtils.setToBlank(ctx.getScrn1().getDphone2f3Reference());
		DataUtils.setToBlank(ctx.getScrn1().getDphone2l4Reference());
		ctx.getScrn1().setDcuscrtdt(0);
		ctx.getScrn1().setDcuscrttm(0);
		DataUtils.setToBlank(ctx.getScrn1().getDcuscrtusrReference());
		DataUtils.setToBlank(ctx.getScrn1().getDcuscrtpgmReference());
		ctx.getScrn1().setDcuschgdt(0);
		ctx.getScrn1().setDcuschgtm(0);
		DataUtils.setToBlank(ctx.getScrn1().getDcuschgusrReference());
		DataUtils.setToBlank(ctx.getScrn1().getDcuschgpgmReference());
	}

	/**
	 * Process operation CLEARINDS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CLEARINDS(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		ctx.getIndicators().setCustiderr("0");
		ctx.getIndicators().setSsnerr("0");
		ctx.getIndicators().setBirthdayerr("0");
		ctx.getIndicators().setFicoscoreerr("0");
		ctx.getIndicators().setGendererr("0");
		ctx.getIndicators().setFirstnameerr("0");
		ctx.getIndicators().setLastnameerr("0");
		ctx.getIndicators().setAddresserr("0");
		ctx.getIndicators().setCityerr("0");
		ctx.getIndicators().setStateerr("0");
		ctx.getIndicators().setZiperr("0");
		ctx.getIndicators().setCountryerr("0");
		ctx.getIndicators().setPhone1err("0");
		ctx.getIndicators().setPhone2err("0");
	}

	/**
	 * Process operation SAVESTATEDB.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void SAVESTATEDB(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		ctx.getScreenstate().getDcustidReference().setValue(ctx.getScrn1().getDcustidReference());
		ctx.getScreenstate().getDssnReference().setValue(ctx.getScrn1().getDssnReference());
		ctx.getScreenstate().getDbirthyrReference().setValue(ctx.getScrn1().getDbirthyrReference());
		ctx.getScreenstate().getDbirthmoReference().setValue(ctx.getScrn1().getDbirthmoReference());
		ctx.getScreenstate().getDbirthdayReference().setValue(ctx.getScrn1().getDbirthdayReference());
		ctx.getScreenstate().getDfirstnameReference().setValue(ctx.getScrn1().getDfirstnameReference());
		ctx.getScreenstate().getDlastnameReference().setValue(ctx.getScrn1().getDlastnameReference());
		ctx.getScreenstate().getDmiddlenameReference().setValue(ctx.getScrn1().getDmiddlenameReference());
		ctx.getScreenstate().getDaddress1Reference().setValue(ctx.getScrn1().getDaddress1Reference());
		ctx.getScreenstate().getDaddress2Reference().setValue(ctx.getScrn1().getDaddress2Reference());
		ctx.getScreenstate().getDcityReference().setValue(ctx.getScrn1().getDcityReference());
		ctx.getScreenstate().getDstateReference().setValue(ctx.getScrn1().getDstateReference());
		ctx.getScreenstate().getDzipReference().setValue(ctx.getScrn1().getDzipReference());
		ctx.getScreenstate().getDcountryReference().setValue(ctx.getScrn1().getDcountryReference());
		ctx.getScreenstate().getDphone1areaReference().setValue(ctx.getScrn1().getDphone1areaReference());
		ctx.getScreenstate().getDphone1f3Reference().setValue(ctx.getScrn1().getDphone1f3Reference());
		ctx.getScreenstate().getDphone1l4Reference().setValue(ctx.getScrn1().getDphone1l4Reference());
		ctx.getScreenstate().getDphone2areaReference().setValue(ctx.getScrn1().getDphone2areaReference());
		ctx.getScreenstate().getDphone2f3Reference().setValue(ctx.getScrn1().getDphone2f3Reference());
		ctx.getScreenstate().getDphone2l4Reference().setValue(ctx.getScrn1().getDphone2l4Reference());
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDficoscore())) {
			ctx.getScreenstate().setDficoscore("0");
		} else {
			ctx.getScreenstate().getDficoscoreReference().setValue(ctx.getScrn1().getDficoscoreReference());
		}
	}

	/**
	 * Process operation CHECKCHANGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CHECKCHANGE(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDficoscore())) {
			ctx.getScrn1().setDficoscore("0");
			ctx.getIndicatorsGroup().setIn55("1");
		} 
		if (DataUtils.compare(ctx.getScreenstate().getDcustidReference(), ctx.getScrn1().getDcustidReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDssnReference(), ctx.getScrn1().getDssnReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDbirthyrReference(), ctx.getScrn1().getDbirthyrReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDbirthmoReference(), ctx.getScrn1().getDbirthmoReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDbirthdayReference(), ctx.getScrn1().getDbirthdayReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDfirstnameReference(), ctx.getScrn1().getDfirstnameReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDlastnameReference(), ctx.getScrn1().getDlastnameReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDmiddlenameReference(), ctx.getScrn1().getDmiddlenameReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDaddress1Reference(), ctx.getScrn1().getDaddress1Reference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDaddress2Reference(), ctx.getScrn1().getDaddress2Reference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDcityReference(), ctx.getScrn1().getDcityReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDstateReference(), ctx.getScrn1().getDstateReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDzipReference(), ctx.getScrn1().getDzipReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDcountryReference(), ctx.getScrn1().getDcountryReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDphone1areaReference(), ctx.getScrn1().getDphone1areaReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDphone1f3Reference(), ctx.getScrn1().getDphone1f3Reference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDphone1l4Reference(), ctx.getScrn1().getDphone1l4Reference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDphone2areaReference(), ctx.getScrn1().getDphone2areaReference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDphone2f3Reference(), ctx.getScrn1().getDphone2f3Reference()) != 0 || DataUtils.compare(ctx.getScreenstate().getDphone2l4Reference(), ctx.getScrn1().getDphone2l4Reference()) != 0) {
			ctx.getStatechanged().setStatechanged("1");
		} else {
			try {
				if (NumberUtils.compare(NumberUtils.toDecimal(ctx.getScreenstate().getDficoscore(), 3, 0, false), NumberUtils.toDecimal(ctx.getScrn1().getDficoscore(), 3, 0, false)) != 0) {
					ctx.getStatechanged().setStatechanged("1");
				} else {
					ctx.getStatechanged().setStatechanged("0");
				}
			} catch (RuntimeException e) {
				ctx.getStatechanged().setStatechanged("1");
			}
		}
		if (DataUtils.compare(ctx.getIndicatorsGroup().getIn55Reference(), "1") == 0) {
			DataUtils.setToBlank(ctx.getScrn1().getDficoscoreReference());
			ctx.getIndicatorsGroup().setIn55("0");
		}
	}

	/**
	 * Process operation FILLSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void FILLSCREEN(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		Alphanumeric wPHONECHAR = new Alphanumeric(10, " ");
		DAOManager.getDAO(ctx, FileIds.CDCUSU01)
		.withRecord(ctx.getCdcuspr())
		.withKeys(ctx.getPcustid().getPcustid())
		.noLock()
		.retrieve();
		ctx.getScrn1().setDcustid(NumberUtils.editC(ctx.getCdcuspr().getCustid(), "X", 9).trim());
		if (ctx.getCdcuspr().getSsn() == 0) {
			DataUtils.initialize(ctx.getScrn1().getDssnReference());
		} else {
			ctx.getScrn1().setDssn(NumberUtils.editC(ctx.getCdcuspr().getSsn(), "X", 9));
		}
		if (ctx.getCdcuspr().getBirthyr() == 0) {
			DataUtils.initialize(ctx.getScrn1().getDbirthyrReference());
		} else {
			ctx.getScrn1().setDbirthyr(NumberUtils.editC(ctx.getCdcuspr().getBirthyr(), "X", 4));
		}
		if (ctx.getCdcuspr().getBirthmo() == 0) {
			DataUtils.initialize(ctx.getScrn1().getDbirthmoReference());
		} else {
			ctx.getScrn1().setDbirthmo(NumberUtils.editC(ctx.getCdcuspr().getBirthmo(), "X", 2));
		}
		if (ctx.getCdcuspr().getBirthday() == 0) {
			DataUtils.initialize(ctx.getScrn1().getDbirthdayReference());
		} else {
			ctx.getScrn1().setDbirthday(NumberUtils.editC(ctx.getCdcuspr().getBirthday(), "X", 2));
		}
		if (ctx.getCdcuspr().getBirthyr() != 0 && ctx.getCdcuspr().getBirthmo() != 0 && ctx.getCdcuspr().getBirthday() != 0) {
			ctx.getScrn1().setDdob(StringUtils.concat(StringUtils.concat(StringUtils.concat(StringUtils.concat(ctx.getScrn1().getDbirthyr(), "-"), ctx.getScrn1().getDbirthmo()), "-"), ctx.getScrn1().getDbirthday()));
		} else {
			DataUtils.initialize(ctx.getScrn1().getDdobReference());
		}
		if (ctx.getCdcuspr().getFicoscore() == 0) {
			DataUtils.initialize(ctx.getScrn1().getDficoscoreReference());
		} else {
			ctx.getScrn1().setDficoscore(NumberUtils.editC(ctx.getCdcuspr().getFicoscore(), "X", 3));
		}
		ctx.getScrn1().getDgenderReference().setValue(ctx.getCdcuspr().getGenderReference());
		ctx.getScrn1().setDfirstname(ctx.getCdcuspr().getFirstname().trim());
		ctx.getScrn1().setDmiddlename(ctx.getCdcuspr().getMidname().trim());
		ctx.getScrn1().setDlastname(ctx.getCdcuspr().getLastname().trim());
		ctx.getScrn1().setDaddress1(ctx.getCdcuspr().getAddress1().trim());
		ctx.getScrn1().setDaddress2(ctx.getCdcuspr().getAddress2().trim());
		ctx.getScrn1().setDcity(ctx.getCdcuspr().getCity().trim());
		ctx.getScrn1().getDstateReference().setValue(ctx.getCdcuspr().getStateReference());
		if (ctx.getCdcuspr().getZip() == 0) {
			DataUtils.initialize(ctx.getScrn1().getDzipReference());
		} else {
			ctx.getScrn1().setDzip(NumberUtils.editC(ctx.getCdcuspr().getZip(), "X", 5));
		}
		ctx.getScrn1().getDcountryReference().setValue(ctx.getCdcuspr().getCountryReference());
		if (ctx.getCdcuspr().getPhone1() != 0) {
			wPHONECHAR.set(NumberUtils.editC(ctx.getCdcuspr().getPhone1(), "X", 10));
			ctx.getScrn1().getDphone1areaReference().setBytes(DataUtils.getBytes(wPHONECHAR.getBytes(), 0, 3));
			ctx.getScrn1().getDphone1f3Reference().setBytes(DataUtils.getBytes(wPHONECHAR.getBytes(), 3, 3));
			ctx.getScrn1().getDphone1l4Reference().setBytes(DataUtils.getBytes(wPHONECHAR.getBytes(), 6, 4));
		} else {
			DataUtils.initialize(ctx.getScrn1().getDphone1areaReference());
			DataUtils.initialize(ctx.getScrn1().getDphone1f3Reference());
			DataUtils.initialize(ctx.getScrn1().getDphone1l4Reference());
		}
		if (ctx.getCdcuspr().getPhone2() != 0) {
			wPHONECHAR.set(NumberUtils.editC(ctx.getCdcuspr().getPhone2(), "X", 10));
			ctx.getScrn1().getDphone2areaReference().setBytes(DataUtils.getBytes(wPHONECHAR.getBytes(), 0, 3));
			ctx.getScrn1().getDphone2f3Reference().setBytes(DataUtils.getBytes(wPHONECHAR.getBytes(), 3, 3));
			ctx.getScrn1().getDphone2l4Reference().setBytes(DataUtils.getBytes(wPHONECHAR.getBytes(), 6, 4));
		} else {
			DataUtils.initialize(ctx.getScrn1().getDphone2areaReference());
			DataUtils.initialize(ctx.getScrn1().getDphone2f3Reference());
			DataUtils.initialize(ctx.getScrn1().getDphone2l4Reference());
		}
		if (ctx.getCdcuspr().getCuscrtdt() != 0) {
			ctx.getScrn1().setDcuscrtdt(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getCdcuspr().getCuscrtdt(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
			ctx.getScrn1().setDcuscrttm(ctx.getCdcuspr().getCuscrttm());
			ctx.getScrn1().getDcuscrtusrReference().setValue(ctx.getCdcuspr().getCuscrtusrReference());
			ctx.getScrn1().getDcuscrtpgmReference().setValue(ctx.getCdcuspr().getCuscrtpgmReference());
		} 
		if (ctx.getCdcuspr().getCuschgdt() != 0) {
			ctx.getScrn1().setDcuschgdt(NumberUtils.toDecimal(DateHelper.convertDate(DateHelper.convertDate(ctx.getCdcuspr().getCuschgdt(), "*CYMD", "*ISO"), "*ISO", "*ISO0"), 8, 0, false).intValue());
			ctx.getScrn1().setDcuschgtm(ctx.getCdcuspr().getCuschgtm());
			ctx.getScrn1().getDcuschgusrReference().setValue(ctx.getCdcuspr().getCuschgusrReference());
			ctx.getScrn1().getDcuschgpgmReference().setValue(ctx.getCdcuspr().getCuschgpgmReference());
			ctx.getIndicators().setHidechgtm("0");
		} else {
			ctx.getIndicators().setHidechgtm("1");
		}
	}

	/**
	 * Process operation UPDATECUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void UPDATECUSTOMER(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		if (!(DataUtils.compare("1", CHECKINPUT(ctx, ctrl)) == 0)) {
			return;
		} else {
			while (!(DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0)) {
				WorkstationIO.newInstance(ctrl, ctx, Cdcus02dAddwin.class, "CDCUS02D")
				.fieldsToRecord(sbean -> toCDCUS02D_ADDWIN(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdcus02dAddwin.class, "CDCUS02D")
				.recordToFields(sbean -> fromCDCUS02D_ADDWIN(ctx, ctrl, sbean))
				.read();
				if (!(DataUtils.compare(ctx.getIndicators().getCommandkeyReference(), "1") == 0)) {
					DAOManager.getDAO(ctx, FileIds.CDCUSU01)
					.withRecord(ctx.getCdcuspr())
					.withKeys(ctx.getPcustid().getPcustid())
					.handleErrors()
					.retrieve();
					if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0) && DataUtils.compare("1", ctx.getFileReadIndicators().getFoundReference()) == 0) {
						FILLTABLE(ctx, ctrl);
						ctx.getCdcuspr().setCuschgdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
						ctx.getCdcuspr().setCuschgtm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
						ctx.getCdcuspr().getCuschgusrReference().setValue(ctx.getProgramstatus().getUseridReference());
						ctx.getCdcuspr().getCuschgpgmReference().setValue(ctx.getProgramstatus().getPgmnameReference());
						DAOManager.getDAO(ctx, FileIds.CDCUSU01)
						.withRecord(ctx.getCdcuspr())
						.update();
						ctx.getChangecomplete().setChangecomplete("1");
						break;
					} 
				} 
			}
		}
	}

	/**
	 * Process operation ADDCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void ADDCUSTOMER(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		if (!(DataUtils.compare("1", CHECKINPUT(ctx, ctrl)) == 0)) {
			return;
		} else {
			while (!(DataUtils.compare(ctx.getIndicators().getF12Reference(), "1") == 0)) {
				WorkstationIO.newInstance(ctrl, ctx, Cdcus02dAddwin.class, "CDCUS02D")
				.fieldsToRecord(sbean -> toCDCUS02D_ADDWIN(ctx, ctrl, sbean))
				.write();
				WorkstationIO.newInstance(ctrl, ctx, Cdcus02dAddwin.class, "CDCUS02D")
				.recordToFields(sbean -> fromCDCUS02D_ADDWIN(ctx, ctrl, sbean))
				.read();
				if (!(DataUtils.compare(ctx.getIndicators().getCommandkeyReference(), "1") == 0)) {
					FILLTABLE(ctx, ctrl);
					ctx.getCdcuspr().setCuscrtdt(DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue());
					ctx.getCdcuspr().setCuscrttm(DateHelper.toDecimal(DateHelper.toTime()).intValue());
					ctx.getCdcuspr().getCuscrtusrReference().setValue(ctx.getProgramstatus().getUseridReference());
					ctx.getCdcuspr().getCuscrtpgmReference().setValue(ctx.getProgramstatus().getPgmnameReference());
					DAOManager.getDAO(ctx, FileIds.CDCUSU01)
					.withRecord(ctx.getCdcuspr())
					.handleErrors()
					.write();
					if (!(DataUtils.compare("1", ctx.getErrorContext().getError()) == 0)) {
						ctx.getChangecomplete().setChangecomplete("1");
					} 
					break;
				} 
			}
		}
	}

	/**
	 * Process operation FILLTABLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void FILLTABLE(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		ctx.getCdcuspr().setCustid(NumberUtils.toDecimal(ctx.getScrn1().getDcustid(), 9, 0, false).intValue());
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDssn())) {
			ctx.getCdcuspr().setSsn(0);
		} else {
			ctx.getCdcuspr().setSsn(NumberUtils.toDecimal(ctx.getScrn1().getDssn(), 9, 0, false).intValue());
		}
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDbirthyr())) {
			ctx.getCdcuspr().setBirthyr(0);
		} else {
			ctx.getCdcuspr().setBirthyr(NumberUtils.toDecimal(ctx.getScrn1().getDbirthyr(), 4, 0, false).intValue());
		}
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDbirthmo())) {
			ctx.getCdcuspr().setBirthmo(0);
		} else {
			ctx.getCdcuspr().setBirthmo(NumberUtils.toDecimal(ctx.getScrn1().getDbirthmo(), 2, 0, false).intValue());
		}
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDbirthday())) {
			ctx.getCdcuspr().setBirthday(0);
		} else {
			ctx.getCdcuspr().setBirthday(NumberUtils.toDecimal(ctx.getScrn1().getDbirthday(), 2, 0, false).intValue());
		}
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDficoscore())) {
			ctx.getCdcuspr().setFicoscore(0);
		} else {
			ctx.getCdcuspr().setFicoscore(NumberUtils.toDecimal(ctx.getScrn1().getDficoscore(), 3, 0, false).intValue());
		}
		ctx.getCdcuspr().getGenderReference().setValue(ctx.getScrn1().getDgenderReference());
		ctx.getCdcuspr().setFirstname(ctx.getScrn1().getDfirstname().trim());
		ctx.getCdcuspr().setMidname(ctx.getScrn1().getDmiddlename().trim());
		ctx.getCdcuspr().setLastname(ctx.getScrn1().getDlastname().trim());
		ctx.getCdcuspr().setAddress1(ctx.getScrn1().getDaddress1().trim());
		ctx.getCdcuspr().setAddress2(ctx.getScrn1().getDaddress2().trim());
		ctx.getCdcuspr().setCity(ctx.getScrn1().getDcity().trim());
		ctx.getCdcuspr().setState(ctx.getScrn1().getDstate().trim());
		ctx.getCdcuspr().setZip(NumberUtils.toDecimal(ctx.getScrn1().getDzip(), 5, 0, false).intValue());
		ctx.getCdcuspr().setCountry(ctx.getScrn1().getDcountry().trim());
		ctx.getCdcuspr().setPhone1(BUILDPHONE(ctx, ctrl, ctx.getScrn1().getDphone1areaReference().getRecord(), ctx.getScrn1().getDphone1f3Reference().getRecord(), ctx.getScrn1().getDphone1l4Reference().getRecord()));
		ctx.getCdcuspr().setPhone2(BUILDPHONE(ctx, ctrl, ctx.getScrn1().getDphone2areaReference().getRecord(), ctx.getScrn1().getDphone2f3Reference().getRecord(), ctx.getScrn1().getDphone2l4Reference().getRecord()));
	}

	/**
	 * Process operation CHECKINPUT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @return 
	 */
	@Override
	public String CHECKINPUT(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		String returnValue = "";
		Wnumteststring wNUMTESTSTRING = new Wnumteststring(ctx.getConfiguration());
		PackedInt wTESTID = PackedDecimal.build(9, 0, true, 0);
		Alphanumeric eRRORFLAG = new Alphanumeric(1, " ");
		Alphanumeric wDATESTRING = new Alphanumeric(10, " ");
		Alphanumeric wTESTDATE = new Alphanumeric(10, "0001-01-01");
		Alphanumeric wPHONE = new Alphanumeric(10, " ");
		if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcustid())) {
			ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0010");
			MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
			ctx.getIndicators().setCustiderr("1");
			returnValue = "0";
			return returnValue;
		} else {
			wNUMTESTSTRING.setWnumteststring(ctx.getScrn1().getDcustid().trim());
			CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
			.byReference(wNUMTESTSTRING.getWnumteststringReference())
			.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
			.call("ISNUMERIC");
			if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
				ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0004");
				MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
				ctx.getIndicators().setCustiderr("1");
				returnValue = "0";
				return returnValue;
			} else {
				if (NumberUtils.compare(NumberUtils.toDecimal(wNUMTESTSTRING.getWnumteststring(), 9, 0, false), 0) == 0) {
					ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0010");
					MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
					ctx.getIndicators().setCustiderr("1");
					returnValue = "0";
					return returnValue;
				} else {
					if (DataUtils.compare(ctx.getIndicators().getAddmodeReference(), "1") == 0) {
						wTESTID.set(NumberUtils.toDecimal(ctx.getScrn1().getDcustid(), 9, 0, false).intValue());
						DAOManager.getDAO(ctx, FileIds.CDCUSU01)
						.withKeys(wTESTID.get())
						.setOnGreaterOrEqual();
						if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCUSU01).getEqualReference()) == 0) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0021");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setCustiderr("1");
							eRRORFLAG.set("Y");
						} 
					} 
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDssn()) || DataUtils.compare("0", ctx.getScrn1().getDssnReference()) == 0) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0028");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setSsnerr("1");
						eRRORFLAG.set("Y");
					} else if (ctx.getScrn1().getDssn().trim().length() < 9) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0029");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setSsnerr("1");
						eRRORFLAG.set("Y");
					} else {
						wNUMTESTSTRING.setWnumteststring(ctx.getScrn1().getDssn().trim());
						CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
						.byReference(wNUMTESTSTRING.getWnumteststringReference())
						.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
						.call("ISNUMERIC");
						if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0004");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setSsnerr("1");
							eRRORFLAG.set("Y");
						} 
					}
					wNUMTESTSTRING.setWnumteststring(StringUtils.concat(StringUtils.concat(ctx.getScrn1().getDbirthyr(), ctx.getScrn1().getDbirthmo()), ctx.getScrn1().getDbirthday()));
					if (!(DataUtils.isBlankOrLowValues(wNUMTESTSTRING.getWnumteststring()))) {
						CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
						.byReference(wNUMTESTSTRING.getWnumteststringReference())
						.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
						.call("ISNUMERIC");
						if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0004");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setBirthdayerr("1");
							eRRORFLAG.set("Y");
						} else {
							wDATESTRING.set(StringUtils.concat(StringUtils.concat(StringUtils.concat(StringUtils.concat(ctx.getScrn1().getDbirthyr(), "-"), ctx.getScrn1().getDbirthmo()), "-"), ctx.getScrn1().getDbirthday()));
							try {
								wTESTDATE.set(DateHelper.convertDate(wDATESTRING.get(), "*ISO", "*ISO"));
							} catch (RuntimeException e) {
								ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0011");
								MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
								ctx.getIndicators().setBirthdayerr("1");
								eRRORFLAG.set("Y");
							}
							if (DataUtils.compare(wTESTDATE.get(), DateHelper.getDate("*ISO")) > 0) {
								ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0065");
								MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
								ctx.getIndicators().setBirthdayerr("1");
								eRRORFLAG.set("Y");
							} 
						}
					} else {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0031");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setBirthdayerr("1");
						eRRORFLAG.set("Y");
					}
					if (DataUtils.compare("M", ctx.getScrn1().getDgenderReference()) == 0 || DataUtils.compare("F", ctx.getScrn1().getDgenderReference()) == 0 || DataUtils.compare("U", ctx.getScrn1().getDgenderReference()) == 0) {
					} else {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0049");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setGendererr("1");
						eRRORFLAG.set("Y");
					}
					wNUMTESTSTRING.setWnumteststring(ctx.getScrn1().getDficoscore().trim());
					CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
					.byReference(wNUMTESTSTRING.getWnumteststringReference())
					.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
					.call("ISNUMERIC");
					if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDficoscore())) && !(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0032");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setFicoscoreerr("1");
						eRRORFLAG.set("Y");
					} 
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDfirstname())) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0022");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setFirstnameerr("1");
						eRRORFLAG.set("Y");
					} 
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDlastname())) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0023");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setLastnameerr("1");
						eRRORFLAG.set("Y");
					} 
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDaddress1())) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0024");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setAddresserr("1");
						eRRORFLAG.set("Y");
					} 
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDcity())) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0025");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setCityerr("1");
						eRRORFLAG.set("Y");
					} 
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDstate())) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0027");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setStateerr("1");
						eRRORFLAG.set("Y");
					} else {
						DAOManager.getDAO(ctx, FileIds.CDSTCP)
						.withKeys(ctx.getScrn1().getDstate())
						.setOnGreaterOrEqual();
						if (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDSTCP).getEqualReference()) == 0)) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0013");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setStateerr("1");
							eRRORFLAG.set("Y");
						} 
					}
					if (DataUtils.isBlankOrLowValues(ctx.getScrn1().getDzip()) || DataUtils.compare("0", ctx.getScrn1().getDzipReference()) == 0) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0026");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setZiperr("1");
						eRRORFLAG.set("Y");
					} else if (ctx.getScrn1().getDzip().trim().length() < 5) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0030");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setZiperr("1");
						eRRORFLAG.set("Y");
					} else {
						wNUMTESTSTRING.setWnumteststring(ctx.getScrn1().getDzip().trim());
						CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
						.byReference(wNUMTESTSTRING.getWnumteststringReference())
						.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
						.call("ISNUMERIC");
						if (!(DataUtils.isBlankOrLowValues(ctx.getScrn1().getDzip())) && !(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0004");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setZiperr("1");
							eRRORFLAG.set("Y");
						} 
					}
					DAOManager.getDAO(ctx, FileIds.CDSTCP)
					.withKeys(ctx.getScrn1().getDstate(), ctx.getScrn1().getDcountry())
					.setOnGreaterOrEqual();
					if (!(DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDSTCP).getEqualReference()) == 0)) {
						ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0062");
						MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
						ctx.getIndicators().setCountryerr("1");
						eRRORFLAG.set("Y");
					} 
					wPHONE.set(StringUtils.concat(StringUtils.concat(ctx.getScrn1().getDphone1area(), ctx.getScrn1().getDphone1f3()), ctx.getScrn1().getDphone1l4()));
					wNUMTESTSTRING.setWnumteststring(wPHONE.get());
					if (!(DataUtils.isBlankOrLowValues(wPHONE.get()))) {
						CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
						.byReference(wNUMTESTSTRING.getWnumteststringReference())
						.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
						.call("ISNUMERIC");
						if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0004");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setPhone1err("1");
							eRRORFLAG.set("Y");
						} else if (wPHONE.get().trim().length() < 10) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0014");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setPhone1err("1");
							eRRORFLAG.set("Y");
						} 
					} else {
						DataUtils.setToBlank(ctx.getScrn1().getDphone1areaReference());
						DataUtils.setToBlank(ctx.getScrn1().getDphone1f3Reference());
						DataUtils.setToBlank(ctx.getScrn1().getDphone1l4Reference());
					}
					wPHONE.set(StringUtils.concat(StringUtils.concat(ctx.getScrn1().getDphone2area(), ctx.getScrn1().getDphone2f3()), ctx.getScrn1().getDphone2l4()));
					wNUMTESTSTRING.setWnumteststring(wPHONE.get());
					if (!(DataUtils.isBlankOrLowValues(wPHONE.get()))) {
						CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
						.byReference(wNUMTESTSTRING.getWnumteststringReference())
						.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
						.call("ISNUMERIC");
						if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0004");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setPhone2err("1");
							eRRORFLAG.set("Y");
						} else if (wPHONE.get().trim().length() < 10) {
							ctx.getMESSAGEParam0().setMESSAGEParam0("ERR0014");
							MESSAGE(ctx, ctrl, ctx.getMESSAGEParam0().getMESSAGEParam0Reference().getRecord());
							ctx.getIndicators().setPhone2err("1");
							eRRORFLAG.set("Y");
						} 
					} else {
						DataUtils.setToBlank(ctx.getScrn1().getDphone2areaReference());
						DataUtils.setToBlank(ctx.getScrn1().getDphone2f3Reference());
						DataUtils.setToBlank(ctx.getScrn1().getDphone2l4Reference());
					}
					if (DataUtils.compare("Y", eRRORFLAG.get()) == 0) {
						returnValue = "0";
						return returnValue;
					} else {
						returnValue = "1";
						return returnValue;
					}
				}
			}
		}

	}

	/**
	 * Process operation BUILDPHONE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pCHARAREA 
	 * @param pCHARFIRST3 
	 * @param pCHARLAST4 
	 * @return 
	 */
	@Override
	public long BUILDPHONE(final Cdcus02rContext ctx, final ExecutionController ctrl, final Record pCHARAREA, final Record pCHARFIRST3, final Record pCHARLAST4) {
		long returnValue = 0;
		Alphanumeric cHARAREA = new Alphanumeric(3, pCHARAREA);
		Alphanumeric cHARFIRST3 = new Alphanumeric(3, pCHARFIRST3);
		Alphanumeric cHARLAST4 = new Alphanumeric(4, pCHARLAST4);
		Alphanumeric nEWPHONE = new Alphanumeric(10, " ");
		Numteststring nUMTESTSTRING = new Numteststring(ctx.getConfiguration());
		PackedLong pHONENUM = PackedDecimal.build(10, 0, true, 0);
		nEWPHONE.set(StringUtils.concat(StringUtils.concat(cHARAREA.get(), cHARFIRST3.get()), cHARLAST4.get()));
		nUMTESTSTRING.setNumteststring(nEWPHONE.get().trim());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(nUMTESTSTRING.getNumteststringReference())
		.byReference(ctx.getISNUMERICReturn().getISNUMERICReturnReference())
		.call("ISNUMERIC");
		if (!(DataUtils.compare(ctx.getISNUMERICReturn().getISNUMERICReturnReference(), "1") == 0)) {
			pHONENUM.set(0);
		} else if (nEWPHONE.get().trim().length() != 10) {
			pHONENUM.set(0);
		} else {
			pHONENUM.set(NumberUtils.toDecimal(nEWPHONE.get(), 10, 0, false).longValue());
		}
		returnValue = NumberUtils.convert(pHONENUM.get()).longValue();
		return returnValue;

	}

	/**
	 * Process operation MESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pMESSAGEID 
	 */
	@Override
	public void MESSAGE(final Cdcus02rContext ctx, final ExecutionController ctrl, final Record pMESSAGEID) {
		Alphanumeric mESSAGEID = new Alphanumeric(8, DataUtils.asRecord(pMESSAGEID).clone());
		Alphanumeric wMESSAGEID = new Alphanumeric(8, " ");
		wMESSAGEID.set(mESSAGEID.get());
		CallHandler.newInstance(ctrl, ctx, ctx.getErrorContext())
		.byReference(wMESSAGEID,
			ctx.getSharedRecordFields().getDpgmqReference())
		.call("CDUTL01C");
	}

	/**
	 * Process operation PROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PROMPT(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare("GENDER", ctx.getScrn1().getDcsrfldReference()) == 0) {
			WorkstationIO.newInstance(ctrl, ctx, Cdcus02dGenderwin.class, "CDCUS02D")
			.fieldsToRecord(sbean -> toCDCUS02D_GENDERWIN(ctx, ctrl, sbean))
			.write();
			WorkstationIO.newInstance(ctrl, ctx, Cdcus02dGenderwin.class, "CDCUS02D")
			.recordToFields(sbean -> fromCDCUS02D_GENDERWIN(ctx, ctrl, sbean))
			.read();
			if (NumberUtils.eq(ctx.getGenderwin().getDselgenReference(), 1)) {
				ctx.getScrn1().setDgender("M");
			} else if (NumberUtils.eq(ctx.getGenderwin().getDselgenReference(), 2)) {
				ctx.getScrn1().setDgender("F");
			} else if (NumberUtils.eq(ctx.getGenderwin().getDselgenReference(), 3)) {
				ctx.getScrn1().setDgender("U");
			} else {
				ctx.getScrn1().setDgender(" ");
			}
		}
	}

	/**
	 * Process operation fromCDCUS02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS02D_SCRN1(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dScrn1 vo) {
		mapper.applyCdcus02dScrn1MiscIn(ctx, ctrl, vo);
		mapper.updateScrn1FromCdcus02dScrn1(ctx, ctrl, vo, ctx.getScrn1());
	}

	/**
	 * Process operation toCDCUS02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS02D_SCRN1(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dScrn1 vo) {
		mapper.updateCdcus02dScrn1FromScrn1(ctx, ctrl, ctx.getScrn1(), vo);
		mapper.applyCdcus02dScrn1MiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS02D_ADDWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS02D_ADDWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dAddwin vo) {
		mapper.applyCdcus02dAddwinMiscIn(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS02D_ADDWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS02D_ADDWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dAddwin vo) {
		mapper.applyCdcus02dAddwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation fromCDCUS02D_GENDERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void fromCDCUS02D_GENDERWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dGenderwin vo) {
		mapper.applyCdcus02dGenderwinMiscIn(ctx, ctrl, vo);
		mapper.updateGenderwinFromCdcus02dGenderwin(ctx, ctrl, vo, ctx.getGenderwin());
	}

	/**
	 * Process operation toCDCUS02D_GENDERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS02D_GENDERWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dGenderwin vo) {
		mapper.updateCdcus02dGenderwinFromGenderwin(ctx, ctrl, ctx.getGenderwin(), vo);
		mapper.applyCdcus02dGenderwinMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS02D_MSGSFL(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dMsgsfl vo) {
		outputMSGSFL(ctx, ctrl);
		mapper.updateCdcus02dMsgsflFromMsgsfl(ctx, ctrl, ctx.getMsgsfl(), vo);
		mapper.applyCdcus02dMsgsflMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation toCDCUS02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	@Override
	public void toCDCUS02D_MSGSFLC(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dMsgsflc vo) {
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
				WorkstationIO.newInstance(ctrl, ctx, Cdcus02dMsgsfl.class, "CDCUS02D")
				.fieldsToRecord(sbean -> toCDCUS02D_MSGSFL(ctx, ctrl, sbean))
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
		mapper.updateCdcus02dMsgsflcFromMsgsflc(ctx, ctrl, ctx.getMsgsflc(), vo);
		mapper.applyCdcus02dMsgsflcMiscOut(ctx, ctrl, vo);
	}

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFL(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsfl().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void outputMSGSFLC(final Cdcus02rContext ctx, final ExecutionController ctrl) {
		ctx.getMsgsflc().getDpgmqReference().setValue(ctx.getSharedRecordFields().getDpgmqReference());
	}

}
