
package aws.bluage.carddemo.cdutl01c.service.impl;

import aws.bluage.carddemo.cdutl01c.business.context.Cdutl01cContext;
import aws.bluage.carddemo.cdutl01c.service.Cdutl01cProcess;
import com.netfective.bluage.gapwalk.clrunner.msgmon.ClCallerHandler;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdutl01cProcessImpl
 * 
 * Defines application services for Cdutl01cProcess
 * @see Cdutl01cProcess
 */
@Service("aws.bluage.carddemo.cdutl01c.service.Cdutl01cProcess")
@Lazy

public class Cdutl01cProcessImpl implements Cdutl01cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdutl01cProcessImpl.class);


	/**
	 * Process operation mainline.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainline(final Cdutl01cContext ctx, final ExecutionController ctrl) {
		ctx.getErrorid().bind(ArgUtils.get(ctx, 0));
		ctx.getPgmq().bind(ArgUtils.get(ctx, 1));
		main(ctx, ctrl);
	}

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdutl01cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(" ", ctx.getPgmq().getPgmqReference()) == 0) {
			ctx.getPgmq().setPgmq("*");
		} 
		ClCallerHandler.newInstance(ctrl, ctx)
		.withParam("MSGID", ctx.getErrorid().getErroridReference())
		.withParam("MSGF", "*LIBL/CDMSGF01")
		.withParam("TOPGMQ", "*SAME", ctx.getPgmq().getPgmqReference())
		.callProgram("SNDPGMMSG");
	}

}
