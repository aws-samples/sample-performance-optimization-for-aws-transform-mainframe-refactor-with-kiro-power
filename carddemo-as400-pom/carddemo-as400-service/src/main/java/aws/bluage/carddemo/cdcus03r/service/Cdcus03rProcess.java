package aws.bluage.carddemo.cdcus03r.service;

import aws.bluage.carddemo.cdcus03r.business.context.Cdcus03rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dHeader2;
import aws.bluage.carddemo.common.business.screen.support.Cdcus03dSfl1;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdcus03rProcess.
 * 
 * Defines application services for Cdcus03rProcess
 */
public interface Cdcus03rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdcus03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdcus03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADSUBFILE(final Cdcus03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PROCESSSFLOPT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PROCESSSFLOPT(final Cdcus03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CLEARSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CLEARSUBFILE(final Cdcus03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation toCDCUS03D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS03D_HEADER1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dHeader1 vo);

	/**
	 * Process operation fromCDCUS03D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS03D_HEADER2(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dHeader2 vo);

	/**
	 * Process operation toCDCUS03D_HEADER2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS03D_HEADER2(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dHeader2 vo);

	/**
	 * Process operation fromCDCUS03D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS03D_SFL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dSfl1 vo);

	/**
	 * Process operation toCDCUS03D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS03D_SFL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dSfl1 vo);

	/**
	 * Process operation fromCDCUS03D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCUS03D_CTL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dCtl1 vo);

	/**
	 * Process operation toCDCUS03D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS03D_CTL1(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dCtl1 vo);

	/**
	 * Process operation toCDCUS03D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCUS03D_FOOTER(final Cdcus03rContext ctx, final ExecutionController ctrl, final Cdcus03dFooter vo);

}
