package aws.bluage.carddemo.cdtrn03r.service;

import aws.bluage.carddemo.cdtrn03r.business.context.Cdtrn03rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dScrn1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn02dZconfirm;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdtrn03rProcess.
 * 
 * Defines application services for Cdtrn03rProcess
 */
public interface Cdtrn03rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCLEARSCREEN(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLADD(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCHECKINPUT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCHECKINPUT(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCLEARINDS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCLEARINDS(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLMESSAGE(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation STINZSR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void STINZSR(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation fromCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDTRN02D_SCRN1(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo);

	/**
	 * Process operation toCDTRN02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN02D_SCRN1(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dScrn1 vo);

	/**
	 * Process operation fromCDTRN02D_ZCONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDTRN02D_ZCONFIRM(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dZconfirm vo);

	/**
	 * Process operation toCDTRN02D_ZCONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN02D_ZCONFIRM(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dZconfirm vo);

	/**
	 * Process operation toCDTRN02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN02D_MSGSFL(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsfl vo);

	/**
	 * Process operation toCDTRN02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN02D_MSGSFLC(final Cdtrn03rContext ctx, final ExecutionController ctrl, final Cdtrn02dMsgsflc vo);

	/**
	 * Process operation outputCDTRNPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputCDTRNPR(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdtrn03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdtrn03rContext ctx, final ExecutionController ctrl);

}
