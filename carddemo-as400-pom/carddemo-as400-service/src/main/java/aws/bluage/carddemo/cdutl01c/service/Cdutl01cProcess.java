package aws.bluage.carddemo.cdutl01c.service;

import aws.bluage.carddemo.cdutl01c.business.context.Cdutl01cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdutl01cProcess.
 * 
 * Defines application services for Cdutl01cProcess
 */
public interface Cdutl01cProcess {

	/**
	 * Process operation mainline.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainline(final Cdutl01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdutl01cContext ctx, final ExecutionController ctrl);

}
