package aws.bluage.carddemo.cdccm02r.service;

import aws.bluage.carddemo.cdccm02r.business.context.Cdccm02rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dConfirm;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdccm02dScrn1;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdccm02rProcess.
 * 
 * Defines application services for Cdccm02rProcess
 */
public interface Cdccm02rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLFILL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLFILL(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLFILLTABLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLFILLTABLE(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCLEARSCREEN(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCLRINDSMSG.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCLRINDSMSG(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLADD(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLUPDATE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLUPDATE(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCHECKINPUT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCHECKINPUT(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLGENCARD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLGENCARD(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLNAME.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLNAME(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPROMPT(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLSTATUSDES.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLSTATUSDES(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLMESSAGE(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation fromCDCCM02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM02D_SCRN1(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dScrn1 vo);

	/**
	 * Process operation toCDCCM02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM02D_SCRN1(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dScrn1 vo);

	/**
	 * Process operation fromCDCCM02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCM02D_CONFIRM(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dConfirm vo);

	/**
	 * Process operation toCDCCM02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM02D_CONFIRM(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dConfirm vo);

	/**
	 * Process operation toCDCCM02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM02D_MSGSFL(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dMsgsfl vo);

	/**
	 * Process operation toCDCCM02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCM02D_MSGSFLC(final Cdccm02rContext ctx, final ExecutionController ctrl, final Cdccm02dMsgsflc vo);

	/**
	 * Process operation inputCDCCMPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDCCMPR(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDACTPR(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputCDCUSPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDCUSPR(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputCDCCMPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputCDCCMPR(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdccm02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdccm02rContext ctx, final ExecutionController ctrl);

}
