
package aws.bluage.carddemo.cdutl02c.service.impl;

import aws.bluage.carddemo.cdutl02c.business.context.Cdutl02cContext;
import aws.bluage.carddemo.cdutl02c.service.Cdutl02cProcess;
import com.netfective.bluage.gapwalk.clrunner.msgmon.ClCallerHandler;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdutl02cProcessImpl
 * 
 * Defines application services for Cdutl02cProcess
 * @see Cdutl02cProcess
 */
@Service("aws.bluage.carddemo.cdutl02c.service.Cdutl02cProcess")
@Lazy

public class Cdutl02cProcessImpl implements Cdutl02cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdutl02cProcessImpl.class);


	/**
	 * Process operation mainline.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainline(final Cdutl02cContext ctx, final ExecutionController ctrl) {
		main(ctx, ctrl);
	}

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdutl02cContext ctx, final ExecutionController ctrl) {
		ClCallerHandler.newInstance(ctrl, ctx)
		.withParam("PGMQ", "*PRV", "*")
		.withParam("CLEAR", "*ALL")
		.callProgram("RMVMSG");
	}

}
