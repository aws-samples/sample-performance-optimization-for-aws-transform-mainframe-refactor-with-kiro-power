package aws.bluage.carddemo.cdact01r.service;

import aws.bluage.carddemo.cdact01r.business.context.Cdact01rContext;
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
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdact01rProcess.
 * 
 * Defines application services for Cdact01rProcess
 */
public interface Cdact01rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLTOGGLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLTOGGLE(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLREFRESH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLREFRESH(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPGUP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPGUP(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation SFLTOPLOGIC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void SFLTOPLOGIC(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPOS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPOS(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPGUPSHALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPGUPSHALL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPGUPSHACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPGUPSHACT(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPGDN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPGDN(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPGDNSHALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPGDNSHALL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPGDNSHACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPGDNSHACT(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPOSALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPOSALL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPOSACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPOSACT(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLREFRESHALL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLREFRESHALL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLREFRESHACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLREFRESHACT(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLFILL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLFILL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLREADSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLREADSFL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLDTL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLDTL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLUPD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLUPD(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLADD(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLSETFILTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLSETFILTER(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCHKFILTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCHKFILTER(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLFILTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLFILTER(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLDELETE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLDELETE(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLERR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLERR(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation toCDACT01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_HEADER1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dHeader1 vo);

	/**
	 * Process operation fromCDACT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT01D_HEADER2(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dHeader2 vo);

	/**
	 * Process operation toCDACT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_HEADER2(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dHeader2 vo);

	/**
	 * Process operation fromCDACT01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT01D_SFL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dSfl1 vo);

	/**
	 * Process operation toCDACT01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_SFL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dSfl1 vo);

	/**
	 * Process operation fromCDACT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT01D_CTL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dCtl1 vo);

	/**
	 * Process operation toCDACT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_CTL1(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dCtl1 vo);

	/**
	 * Process operation toCDACT01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_FOOTER(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dFooter vo);

	/**
	 * Process operation fromCDACT01D_FILTERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT01D_FILTERWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dFilterwin vo);

	/**
	 * Process operation toCDACT01D_FILTERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_FILTERWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dFilterwin vo);

	/**
	 * Process operation fromCDACT01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT01D_DELWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelwin vo);

	/**
	 * Process operation toCDACT01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_DELWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelwin vo);

	/**
	 * Process operation fromCDACT01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT01D_DELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelerrwin vo);

	/**
	 * Process operation toCDACT01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_DELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dDelerrwin vo);

	/**
	 * Process operation toCDACT01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_MSGSFL(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dMsgsfl vo);

	/**
	 * Process operation toCDACT01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_MSGSFLC(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dMsgsflc vo);

	/**
	 * Process operation toCDACT01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT01D_EMPTY(final Cdact01rContext ctx, final ExecutionController ctrl, final Cdact01dEmpty vo);

	/**
	 * Process operation inputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDACTPR(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputCdR04.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCdR04(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputCDCCMPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDCCMPR(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputSFL1(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputDELWIN(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputDELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputCDACTPR(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputHEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputHEADER1(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputSFL1(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputDELWIN(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputDELERRWIN(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdact01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdact01rContext ctx, final ExecutionController ctrl);

}
