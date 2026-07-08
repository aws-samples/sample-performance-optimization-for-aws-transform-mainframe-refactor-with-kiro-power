package aws.bluage.carddemo.cdcus02r.service;

import aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dAddwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dGenderwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dScrn1;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdcus02rProcess.
 * 
 * Defines application services for Cdcus02rProcess
 */
public interface Cdcus02rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CLEARSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CLEARSCREEN(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CLEARINDS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CLEARINDS(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation SAVESTATEDB.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void SAVESTATEDB(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CHECKCHANGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CHECKCHANGE(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation FILLSCREEN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void FILLSCREEN(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation UPDATECUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void UPDATECUSTOMER(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation ADDCUSTOMER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void ADDCUSTOMER(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation FILLTABLE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void FILLTABLE(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CHECKINPUT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @return 
	 */
	String CHECKINPUT(final Cdcus02rContext ctx, final ExecutionController ctrl);

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
	long BUILDPHONE(final Cdcus02rContext ctx, final ExecutionController ctrl, final Record pCHARAREA, final Record pCHARFIRST3, final Record pCHARLAST4);

	/**
	 * Process operation MESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pMESSAGEID 
	 */
	void MESSAGE(final Cdcus02rContext ctx, final ExecutionController ctrl, final Record pMESSAGEID);

	/**
	 * Process operation PROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PROMPT(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation fromCDCUS02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS02D_SCRN1(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dScrn1 vo);

	/**
	 * Process operation toCDCUS02D_SCRN1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS02D_SCRN1(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dScrn1 vo);

	/**
	 * Process operation fromCDCUS02D_ADDWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS02D_ADDWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dAddwin vo);

	/**
	 * Process operation toCDCUS02D_ADDWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS02D_ADDWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dAddwin vo);

	/**
	 * Process operation fromCDCUS02D_GENDERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS02D_GENDERWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dGenderwin vo);

	/**
	 * Process operation toCDCUS02D_GENDERWIN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS02D_GENDERWIN(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dGenderwin vo);

	/**
	 * Process operation toCDCUS02D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS02D_MSGSFL(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dMsgsfl vo);

	/**
	 * Process operation toCDCUS02D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS02D_MSGSFLC(final Cdcus02rContext ctx, final ExecutionController ctrl, final Cdcus02dMsgsflc vo);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdcus02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdcus02rContext ctx, final ExecutionController ctrl);

}
