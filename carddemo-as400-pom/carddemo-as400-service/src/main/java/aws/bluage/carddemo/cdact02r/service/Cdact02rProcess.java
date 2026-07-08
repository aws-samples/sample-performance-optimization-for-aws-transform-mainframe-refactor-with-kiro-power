package aws.bluage.carddemo.cdact02r.service;

import aws.bluage.carddemo.cdact02r.business.context.Cdact02rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dConfirm;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdact02dScrn1;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdact02rProcess.
 * 
 * Defines application services for Cdact02rProcess
 */
public interface Cdact02rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLSAVESTATE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLSAVESTATE(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCHECKCHANGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCHECKCHANGE(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLFILLSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLFILLSCREEN(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCLEARSCREEN(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCLEARINDS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCLEARINDS(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLUPDATE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLUPDATE(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLADD.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLADD(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLFILLTABLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLFILLTABLE(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLCHECKINPUTS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLCHECKINPUTS(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPROMPT(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLPROMPTSEL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLPROMPTSEL(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation DLERROR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void DLERROR(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation fromCDACT02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT02D_SCRN1(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dScrn1 vo);

	/**
	 * Process operation toCDACT02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT02D_SCRN1(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dScrn1 vo);

	/**
	 * Process operation fromCDACT02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDACT02D_CONFIRM(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dConfirm vo);

	/**
	 * Process operation toCDACT02D_CONFIRM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT02D_CONFIRM(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dConfirm vo);

	/**
	 * Process operation toCDACT02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT02D_MSGSFL(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dMsgsfl vo);

	/**
	 * Process operation toCDACT02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDACT02D_MSGSFLC(final Cdact02rContext ctx, final ExecutionController ctrl, final Cdact02dMsgsflc vo);

	/**
	 * Process operation inputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDACTPR(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation inputCDCUSPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void inputCDCUSPR(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputCDACTPR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputCDACTPR(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdact02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdact02rContext ctx, final ExecutionController ctrl);

}
