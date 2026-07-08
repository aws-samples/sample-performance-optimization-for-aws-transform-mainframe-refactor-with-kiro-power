package aws.bluage.carddemo.cdutl02c.service;

import aws.bluage.carddemo.cdutl02c.business.context.Cdutl02cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdutl02cProcess.
 * 
 * Defines application services for Cdutl02cProcess
 */
public interface Cdutl02cProcess {

	/**
	 * Process operation mainline.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainline(final Cdutl02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdutl02cContext ctx, final ExecutionController ctrl);

}
