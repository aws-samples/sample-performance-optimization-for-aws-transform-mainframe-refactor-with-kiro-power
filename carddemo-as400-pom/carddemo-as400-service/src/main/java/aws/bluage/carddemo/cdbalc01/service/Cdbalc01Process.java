package aws.bluage.carddemo.cdbalc01.service;

import aws.bluage.carddemo.cdbalc01.business.context.Cdbalc01Context;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cdbalc01Process.
 * 
 * Defines application services for Card Balance Calculation batch job.
 */
public interface Cdbalc01Process {

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final Cdbalc01Context ctx, final ExecutionController ctrl);

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void MAINCODE(final Cdbalc01Context ctx, final ExecutionController ctrl);

	/**
	 * Process operation CLEARTABLE.
	 * Clears all records from CDBALP table.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CLEARTABLE(final Cdbalc01Context ctx, final ExecutionController ctrl);

	/**
	 * Process operation READCARDS.
	 * Reads all cards from CDCCMP and processes each one.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void READCARDS(final Cdbalc01Context ctx, final ExecutionController ctrl);

	/**
	 * Process operation PROCESSCARD.
	 * Processes a single card - calculates balance and writes to CDBALP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void PROCESSCARD(final Cdbalc01Context ctx, final ExecutionController ctrl);

	/**
	 * Process operation CALCTOTALS.
	 * Calculates transaction totals for a card.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void CALCTOTALS(final Cdbalc01Context ctx, final ExecutionController ctrl);

	/**
	 * Process operation WRITEBALANCE.
	 * Writes balance record to CDBALP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void WRITEBALANCE(final Cdbalc01Context ctx, final ExecutionController ctrl);

	/**
	 * Process operation LOGSTATS.
	 * Logs processing statistics.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void LOGSTATS(final Cdbalc01Context ctx, final ExecutionController ctrl);
}
