package aws.bluage.carddemo.cdcus01r.service;

import aws.bluage.carddemo.cdcus01r.business.context.Cdcus01rContext;
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
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdcus01rProcess.
 * 
 * Defines application services for Cdcus01rProcess
 */
public interface Cdcus01rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADSFL(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADNEXT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADNEXT(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADPREV.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADPREV(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation REFRESH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void REFRESH(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation HANDLEENTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void HANDLEENTER(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation VALSRCCTL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @return 
	 */
	String VALSRCCTL(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation POSITIONTO.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void POSITIONTO(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation SFLOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void SFLOPTIONS(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation ADDCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void ADDCUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation EDITCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void EDITCUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DELETECUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DELETECUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation VIEWCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void VIEWCUSTOMER(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation HANDLEOPTIONS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void HANDLEOPTIONS(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pMESSAGEID 
	 */
	void MESSAGE(final Cdcus01rContext ctx, final ExecutionController ctrl, final Record pMESSAGEID);

	/**
	 * Process operation toCDCUS01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_HEADER1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dHeader1 vo);

	/**
	 * Process operation fromCDCUS01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS01D_HEADER2(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dHeader2 vo);

	/**
	 * Process operation toCDCUS01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_HEADER2(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dHeader2 vo);

	/**
	 * Process operation fromCDCUS01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS01D_SFL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dSfl1 vo);

	/**
	 * Process operation toCDCUS01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_SFL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dSfl1 vo);

	/**
	 * Process operation fromCDCUS01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS01D_CTL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dCtl1 vo);

	/**
	 * Process operation toCDCUS01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_CTL1(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dCtl1 vo);

	/**
	 * Process operation toCDCUS01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_FOOTER(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dFooter vo);

	/**
	 * Process operation fromCDCUS01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS01D_DELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelwin vo);

	/**
	 * Process operation toCDCUS01D_DELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_DELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelwin vo);

	/**
	 * Process operation fromCDCUS01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS01D_DELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelerrwin vo);

	/**
	 * Process operation toCDCUS01D_DELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_DELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dDelerrwin vo);

	/**
	 * Process operation toCDCUS01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_MSGSFL(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dMsgsfl vo);

	/**
	 * Process operation toCDCUS01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_MSGSFLC(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dMsgsflc vo);

	/**
	 * Process operation toCDCUS01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS01D_EMPTY(final Cdcus01rContext ctx, final ExecutionController ctrl, final Cdcus01dEmpty vo);

	/**
	 * Process operation inputCDACTPR3.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDACTPR3(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputSFL1(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputDELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputDELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputSFL1(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputDELWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputDELWIN(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputDELERRWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputDELERRWIN(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdcus01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdcus01rContext ctx, final ExecutionController ctrl);

}
