package aws.bluage.carddemo.cdaut01r.service;

import aws.bluage.carddemo.cdaut01r.business.context.Cdaut01rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dEmpty;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdaut01dSfl1;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdaut01rProcess.
 * 
 * Defines application services for Cdaut01rProcess
 */
public interface Cdaut01rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation REFRESH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void REFRESH(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation SETCURSORDN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void SETCURSORDN(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation SETCURSORUP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void SETCURSORUP(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPARM1 
	 */
	void LOADSFL(final Cdaut01rContext ctx, final ExecutionController ctrl, final Record pPARM1);

	/**
	 * Process operation FETCHNEXTDN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void FETCHNEXTDN(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation FETCHNEXTUP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void FETCHNEXTUP(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation RESETSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void RESETSFL(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADNEXT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADNEXT(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADPREV.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADPREV(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PROMPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PROMPT(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation toCDAUT01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_HEADER1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dHeader1 vo);

	/**
	 * Process operation fromCDAUT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDAUT01D_HEADER2(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dHeader2 vo);

	/**
	 * Process operation toCDAUT01D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_HEADER2(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dHeader2 vo);

	/**
	 * Process operation toCDAUT01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_SFL1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dSfl1 vo);

	/**
	 * Process operation fromCDAUT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDAUT01D_CTL1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dCtl1 vo);

	/**
	 * Process operation toCDAUT01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_CTL1(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dCtl1 vo);

	/**
	 * Process operation toCDAUT01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_FOOTER(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dFooter vo);

	/**
	 * Process operation toCDAUT01D_MSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_MSGSFL(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dMsgsfl vo);

	/**
	 * Process operation toCDAUT01D_MSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_MSGSFLC(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dMsgsflc vo);

	/**
	 * Process operation toCDAUT01D_EMPTY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDAUT01D_EMPTY(final Cdaut01rContext ctx, final ExecutionController ctrl, final Cdaut01dEmpty vo);

	/**
	 * Process operation outputSFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputSFL1(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFL(final Cdaut01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation outputMSGSFLC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void outputMSGSFLC(final Cdaut01rContext ctx, final ExecutionController ctrl);

}
