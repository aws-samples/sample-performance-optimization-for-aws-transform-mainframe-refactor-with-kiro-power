package aws.bluage.carddemo.cdccm03r.service;

import aws.bluage.carddemo.cdccm03r.business.context.Cdccm03rContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdccm03rProcess.
 * 
 * Defines application services for Cdccm03rProcess
 */
public interface Cdccm03rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdccm03rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdccm03rContext ctx, final ExecutionController ctrl);

}
