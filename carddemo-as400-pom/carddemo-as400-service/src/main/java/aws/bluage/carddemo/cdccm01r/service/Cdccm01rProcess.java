package aws.bluage.carddemo.cdccm01r.service;

import aws.bluage.carddemo.cdccm01r.business.context.Cdccm01rContext;
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
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdccm01rProcess.
 * 
 * Defines application services for Cdccm01rProcess
 */
public interface Cdccm01rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADSFL(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADNEXT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADNEXT(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADPREV.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADPREV(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation REFRESH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void REFRESH(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation HANDLEENTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void HANDLEENTER(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation VALSRCCTL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pERRSRCCTL 
	 */
	void VALSRCCTL(final Cdccm01rContext ctx, final ExecutionController ctrl, final Record pERRSRCCTL);

	/**
	 * Process operation POSITIONTO.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void POSITIONTO(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation SFLOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void SFLOPTIONS(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation ADDCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void ADDCARD(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation EDITCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void EDITCARD(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DEACTIVATECARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DEACTIVATECARD(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation VIEWCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void VIEWCARD(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CARDSTATUS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CARDSTATUS(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation HANDLEOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void HANDLEOPTIONS(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation toCDCCM01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_HEADER1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dHeader1 vo);

	/**
	 * Process operation fromCDCCM01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM01D_HEADER2(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dHeader2 vo);

	/**
	 * Process operation toCDCCM01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_HEADER2(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dHeader2 vo);

	/**
	 * Process operation fromCDCCM01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM01D_SFL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dSfl1 vo);

	/**
	 * Process operation toCDCCM01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_SFL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dSfl1 vo);

	/**
	 * Process operation fromCDCCM01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM01D_CTL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dCtl1 vo);

	/**
	 * Process operation toCDCCM01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_CTL1(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dCtl1 vo);

	/**
	 * Process operation toCDCCM01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_FOOTER(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dFooter vo);

	/**
	 * Process operation fromCDCCM01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM01D_DELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelwin vo);

	/**
	 * Process operation toCDCCM01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_DELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelwin vo);

	/**
	 * Process operation fromCDCCM01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM01D_DELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelerrwin vo);

	/**
	 * Process operation toCDCCM01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_DELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dDelerrwin vo);

	/**
	 * Process operation fromCDCCM01D_STATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM01D_STATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dStatuswin vo);

	/**
	 * Process operation toCDCCM01D_STATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_STATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dStatuswin vo);

	/**
	 * Process operation toCDCCM01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_MSGSFL(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dMsgsfl vo);

	/**
	 * Process operation toCDCCM01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_MSGSFLC(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dMsgsflc vo);

	/**
	 * Process operation toCDCCM01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM01D_EMPTY(final Cdccm01rContext ctx, final ExecutionController ctrl, final Cdccm01dEmpty vo);

	/**
	 * Process operation inputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputSFL1(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputDELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputDELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputSTATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputSTATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputSFL1(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputDELWIN(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputDELERRWIN(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputSTATUSWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputSTATUSWIN(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdccm01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdccm01rContext ctx, final ExecutionController ctrl);

}
