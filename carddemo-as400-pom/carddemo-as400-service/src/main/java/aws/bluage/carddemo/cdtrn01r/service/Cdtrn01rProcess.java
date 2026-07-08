package aws.bluage.carddemo.cdtrn01r.service;

import aws.bluage.carddemo.cdtrn01r.business.context.Cdtrn01rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dHeader;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdtrn01dSfl1;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdtrn01rProcess.
 * 
 * Defines application services for Cdtrn01rProcess
 */
public interface Cdtrn01rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PROCESSSFLOPTS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PROCESSSFLOPTS(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADSUBFILEOPTS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADSUBFILEOPTS(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PAGEUPSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PAGEUPSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PAGEDOWNSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PAGEDOWNSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation REFRESHSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void REFRESHSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CLEARERRSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CLEARERRSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation WRITEERRTOSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void WRITEERRTOSFL(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CLEARSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CLEARSUBFILE(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation fromCDTRN01D_HEADER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDTRN01D_HEADER(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dHeader vo);

	/**
	 * Process operation toCDTRN01D_HEADER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN01D_HEADER(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dHeader vo);

	/**
	 * Process operation fromCDTRN01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDTRN01D_SFL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dSfl1 vo);

	/**
	 * Process operation toCDTRN01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN01D_SFL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dSfl1 vo);

	/**
	 * Process operation fromCDTRN01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDTRN01D_CTL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dCtl1 vo);

	/**
	 * Process operation toCDTRN01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN01D_CTL1(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dCtl1 vo);

	/**
	 * Process operation toCDTRN01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN01D_FOOTER(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dFooter vo);

	/**
	 * Process operation toCDTRN01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN01D_MSGSFL(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dMsgsfl vo);

	/**
	 * Process operation toCDTRN01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDTRN01D_MSGSFLC(final Cdtrn01rContext ctx, final ExecutionController ctrl, final Cdtrn01dMsgsflc vo);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdtrn01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdtrn01rContext ctx, final ExecutionController ctrl);

}
