package aws.bluage.carddemo.cdutl001m.service;

import aws.bluage.carddemo.cdutl001m.business.context.Cdutl001mContext;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdutl001mProcess.
 * 
 * Defines application services for Cdutl001mProcess
 */
public interface Cdutl001mProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdutl001mContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation ISNUMERIC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPSTRING 
	 * @return 
	 */
	String ISNUMERIC(final Cdutl001mContext ctx, final ExecutionController ctrl, final Record pPSTRING);

	/**
	 * Process operation ISCURRENCY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPSTRING 
	 * @return 
	 */
	String ISCURRENCY(final Cdutl001mContext ctx, final ExecutionController ctrl, final Record pPSTRING);

	/**
	 * Process operation ISCURNUM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param pPSTRING 
	 * @return 
	 */
	String ISCURNUM(final Cdutl001mContext ctx, final ExecutionController ctrl, final Record pPSTRING);

}
