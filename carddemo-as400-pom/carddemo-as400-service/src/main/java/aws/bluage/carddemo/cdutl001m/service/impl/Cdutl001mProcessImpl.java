
package aws.bluage.carddemo.cdutl001m.service.impl;

import aws.bluage.carddemo.cdutl001m.business.IsCurNum.Pstring2;
import aws.bluage.carddemo.cdutl001m.business.IsCurNum.Wteststring2;
import aws.bluage.carddemo.cdutl001m.business.IsCurrency.Pstring1;
import aws.bluage.carddemo.cdutl001m.business.IsCurrency.Wteststring1;
import aws.bluage.carddemo.cdutl001m.business.IsNumeric.Pstring;
import aws.bluage.carddemo.cdutl001m.business.IsNumeric.Wteststring;
import aws.bluage.carddemo.cdutl001m.business.context.Cdutl001mContext;
import aws.bluage.carddemo.cdutl001m.service.Cdutl001mProcess;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.BinaryInt;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.BinaryInteger;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdutl001mProcessImpl
 * 
 * Defines application services for Cdutl001mProcess
 * @see Cdutl001mProcess
 */
@Service("aws.bluage.carddemo.cdutl001m.service.Cdutl001mProcess")
@Lazy

public class Cdutl001mProcessImpl implements Cdutl001mProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdutl001mProcessImpl.class);


	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdutl001mContext ctx, final ExecutionController ctrl) {
		String programId = ""; 
		/* 
		<--START COPYBOOK *LIBL/QCPYSRC COPYUTILPR -->
		** Test Numeric */
		if (DataUtils.compare("ISNUMERIC", ctx.getUsedProgramIdentifier()) == 0) {
			Alphanumeric iSNUMERICReturn = new Alphanumeric(1, ArgUtils.get(ctx, ctx.getArguments().length - 1));
			iSNUMERICReturn.set(ISNUMERIC(ctx, ctrl, DataUtils.asRecord(ArgUtils.get(ctx, 0))));
			return;
		} else if (DataUtils.compare("ISCURRENCY", ctx.getUsedProgramIdentifier()) == 0) {
			Alphanumeric iSCURRENCYReturn = new Alphanumeric(1, ArgUtils.get(ctx, ctx.getArguments().length - 1));
			iSCURRENCYReturn.set(ISCURRENCY(ctx, ctrl, DataUtils.asRecord(ArgUtils.get(ctx, 0))));
			return;
		} else if (DataUtils.compare("ISCURNUM", ctx.getUsedProgramIdentifier()) == 0) {
			Alphanumeric iSCURNUMReturn = new Alphanumeric(1, ArgUtils.get(ctx, ctx.getArguments().length - 1));
			iSCURNUMReturn.set(ISCURNUM(ctx, ctrl, DataUtils.asRecord(ArgUtils.get(ctx, 0))));
			return;
		} else {
			ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				programId = ctx.getProgramIdentifier();
				ctrl.setNeedReset(programId);
			} 
		}
	}

	/**
	 * Process operation ISNUMERIC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPSTRING 
	 * @return 
	 */
	@Override
	public String ISNUMERIC(final Cdutl001mContext ctx, final ExecutionController ctrl, final Record pPSTRING) {
		String returnValue = "";
		Pstring pSTRING = new Pstring(ctx.getConfiguration(), pPSTRING);
		Wteststring wTESTSTRING = new Wteststring(ctx.getConfiguration());
		BinaryInt wSCANPOSITION = BinaryInteger.build(4, true, 0);
		Alphanumeric cVALIDNUMBERS = new Alphanumeric(10, "0123456789");
		wTESTSTRING.setWteststring(pSTRING.getPstring().trim());
		wSCANPOSITION.set(StringUtils.check(cVALIDNUMBERS.get(), wTESTSTRING.getWteststring()));
		if (wSCANPOSITION.get() == 0) {
			returnValue = "1";
			return returnValue;
		} else {
			returnValue = "0";
			return returnValue;
		}

	}

	/**
	 * Process operation ISCURRENCY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPSTRING 
	 * @return 
	 */
	@Override
	public String ISCURRENCY(final Cdutl001mContext ctx, final ExecutionController ctrl, final Record pPSTRING) {
		String returnValue = "";
		Pstring1 pSTRING = new Pstring1(ctx.getConfiguration(), pPSTRING);
		Wteststring1 wTESTSTRING = new Wteststring1(ctx.getConfiguration());
		BinaryInt wDECIMALPOSITION = BinaryInteger.build(4, true, 0);
		BinaryInt wENDPOSITION = BinaryInteger.build(4, true, 0);
		wTESTSTRING.setWteststring1(pSTRING.getPstring1().trim());
		if (!(DataUtils.compare("1", ISCURNUM(ctx, ctrl, wTESTSTRING.getWteststring1Reference().getRecord())) == 0)) {
			returnValue = "0";
			return returnValue;
		} else {
			wDECIMALPOSITION.set(wTESTSTRING.getWteststring1().indexOf(".") + 1);
			if (wDECIMALPOSITION.get() == 0) {
				returnValue = "1";
				return returnValue;
			} else {
				wENDPOSITION.set(DataUtils.currentSizeOfVarying(wTESTSTRING.getWteststring1Reference()));
				if (wENDPOSITION.get() - wDECIMALPOSITION.get() > 2) {
					returnValue = "0";
					return returnValue;
				} else {
					returnValue = "1";
					return returnValue;
				}
			}
		}

	}

	/**
	 * Process operation ISCURNUM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPSTRING 
	 * @return 
	 */
	@Override
	public String ISCURNUM(final Cdutl001mContext ctx, final ExecutionController ctrl, final Record pPSTRING) {
		String returnValue = "";
		Pstring2 pSTRING = new Pstring2(ctx.getConfiguration(), pPSTRING);
		Wteststring2 wTESTSTRING = new Wteststring2(ctx.getConfiguration());
		BinaryInt wSCANPOSITION = BinaryInteger.build(4, true, 0);
		Alphanumeric cVALIDNUMBERS = new Alphanumeric(11, "0123456789.");
		wTESTSTRING.setWteststring2(pSTRING.getPstring2().trim());
		wSCANPOSITION.set(StringUtils.check(cVALIDNUMBERS.get(), wTESTSTRING.getWteststring2()));
		if (wSCANPOSITION.get() == 0) {
			returnValue = "1";
			return returnValue;
		} else {
			returnValue = "0";
			return returnValue;
		}

	}

}
