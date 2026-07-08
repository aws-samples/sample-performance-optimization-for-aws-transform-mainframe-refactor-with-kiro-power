package aws.bluage.carddemo.cdrpt01r.service;

import aws.bluage.carddemo.cdrpt01r.business.context.Cdrpt01rContext;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpDetail;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpHeader;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpSeparator;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpSummary;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdrpt01rProcess.
 * 
 * Defines application services for Cdrpt01rProcess
 */
public interface Cdrpt01rProcess {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdrpt01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdrpt01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation READACT.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void READACT(final Cdrpt01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CHKPRI.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CHKPRI(final Cdrpt01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation CHKSEC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CHKSEC(final Cdrpt01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation WRITEDET.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void WRITEDET(final Cdrpt01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation WRITESUM.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void WRITESUM(final Cdrpt01rContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation toCDRPTP_SUMMARY.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDRPTP_SUMMARY(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpSummary vo);

	/**
	 * Process operation toCDRPTP_HEADER.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDRPTP_HEADER(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpHeader vo);

	/**
	 * Process operation toCDRPTP_DETAIL.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDRPTP_DETAIL(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpDetail vo);

	/**
	 * Process operation toCDRPTP_SEPARATOR.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 * @param vo 
	 */
	void toCDRPTP_SEPARATOR(final Cdrpt01rContext ctx, final ExecutionController ctrl, final CdrptpSeparator vo);

}
