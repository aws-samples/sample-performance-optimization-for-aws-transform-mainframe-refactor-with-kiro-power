package aws.bluage.carddemo.cdbpl011m.service;

import aws.bluage.carddemo.cdbpl011m.business.context.Cdbpl011mContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdbpl011mProcess.
 * 
 * Defines application services for Cdbpl011mProcess
 */
public interface Cdbpl011mProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation STINZSR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void STINZSR(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PROCESS_TRN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PROCESS_TRN(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation WRTAUT_UPDTRN_UPDACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void WRTAUT_UPDTRN_UPDACT(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation RCDLCK_TRN.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void RCDLCK_TRN(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation SLEEP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void SLEEP(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CALCUPDDLBAL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CALCUPDDLBAL(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation GETACTION.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void GETACTION(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation GETMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void GETMESSAGE(final Cdbpl011mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation PUTMESSAGE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PUTMESSAGE(final Cdbpl011mContext ctx, final ExecutionController ctrl);

}
