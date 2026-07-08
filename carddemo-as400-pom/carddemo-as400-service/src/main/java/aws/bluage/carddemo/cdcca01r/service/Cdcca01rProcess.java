package aws.bluage.carddemo.cdcca01r.service;

import aws.bluage.carddemo.cdcca01r.business.context.Cdcca01rContext;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dCtl1;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dFooter;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dHeader1;
import aws.bluage.carddemo.common.business.screen.support.Cdcca01dSfl1;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdcca01rProcess.
 * 
 * Defines application services for Cdcca01rProcess
 */
public interface Cdcca01rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdcca01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdcca01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOADSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOADSUBFILE(final Cdcca01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CLEARSUBFILE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CLEARSUBFILE(final Cdcca01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation toCDCCA01D_HEADER1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCA01D_HEADER1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dHeader1 vo);

	/**
	 * Process operation toCDCCA01D_SFL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCA01D_SFL1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dSfl1 vo);

	/**
	 * Process operation fromCDCCA01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void fromCDCCA01D_CTL1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dCtl1 vo);

	/**
	 * Process operation toCDCCA01D_CTL1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCA01D_CTL1(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dCtl1 vo);

	/**
	 * Process operation toCDCCA01D_FOOTER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDCCA01D_FOOTER(final Cdcca01rContext ctx, final ExecutionController ctrl, final Cdcca01dFooter vo);

}
