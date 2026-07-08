package aws.bluage.carddemo.cdbpl012m.service;

import aws.bluage.carddemo.cdbpl012m.business.context.Cdbpl012mContext;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdbpl012mProcess.
 * 
 * Defines application services for Cdbpl012mProcess
 */
public interface Cdbpl012mProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdbpl012mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation GENAUTSH.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pGENERATEDSH 
	 * @return 
	 */
	long GENAUTSH(final Cdbpl012mContext ctx, final ExecutionController ctrl, final Record pGENERATEDSH);

}
