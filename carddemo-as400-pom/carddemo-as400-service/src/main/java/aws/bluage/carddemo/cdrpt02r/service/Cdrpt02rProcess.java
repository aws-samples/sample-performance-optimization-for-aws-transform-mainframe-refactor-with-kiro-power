package aws.bluage.carddemo.cdrpt02r.service;

import aws.bluage.carddemo.cdrpt02r.business.context.Cdrpt02rContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdrpt02rProcess.
 * 
 * Defines application services for Cdrpt02rProcess
 */
public interface Cdrpt02rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdrpt02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdrpt02rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation READCUS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void READCUS(final Cdrpt02rContext ctx, final ExecutionController ctrl);

}
