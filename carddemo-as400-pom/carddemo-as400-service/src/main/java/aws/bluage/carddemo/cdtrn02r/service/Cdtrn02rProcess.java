package aws.bluage.carddemo.cdtrn02r.service;

import aws.bluage.carddemo.cdtrn02r.business.context.Cdtrn02rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dScrn1;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdtrn02rProcess.
 * 
 * Defines application services for Cdtrn02rProcess
 */
public interface Cdtrn02rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADDSP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADDSP(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PROMPT(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation STATUSDTL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void STATUSDTL(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation STINZSR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void STINZSR(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation fromCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDTRN02D_SCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo);

	/**
	 * Process operation toCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN02D_SCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo);

	/**
	 * Process operation toCDTRN02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN02D_MSGSFL(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsfl vo);

	/**
	 * Process operation toCDTRN02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN02D_MSGSFLC(final Cdtrn02rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsflc vo);

	/**
	 * Process operation inputCDTRNPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDTRNPR(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputCDAUTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDAUTPR(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputSCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputSCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputSCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputSCRN1(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdtrn02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdtrn02rContext ctx, final ExecutionController ctrl);

}
