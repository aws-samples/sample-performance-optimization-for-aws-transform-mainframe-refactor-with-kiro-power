package aws.bluage.carddemo.cdbalc01.service.impl;

import aws.bluage.carddemo.cdbalc01.business.context.Cdbalc01Context;
import aws.bluage.carddemo.cdbalc01.service.Cdbalc01Process;
import aws.bluage.carddemo.cdbalc01.service.DataHolderMapper;
import aws.bluage.carddemo.common.business.database.FileIds;
import aws.bluage.carddemo.common.business.database.cdbalp.Cdbalpr;
import aws.bluage.carddemo.common.business.database.cdccmp.Cdccmpr;
import aws.bluage.carddemo.common.business.database.cdtrnp.Cdtrnpr;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.Alphanumeric;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedBigDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedDecimal;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedInt;
import com.netfective.bluage.gapwalk.datasimplifier.elementary.PackedLong;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.blu4iv.DAOManager;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao.EOpenMode;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Class Cdbalc01ProcessImpl
 * 
 * Defines application services for Card Balance Calculation batch job.
 * Processes transactions and calculates outstanding balances for all cards.
 * 
 * @see Cdbalc01Process
 */
@Service("aws.bluage.carddemo.cdbalc01.service.Cdbalc01Process")
@Import({
	aws.bluage.carddemo.cdbalc01.service.DataHolderMapper.class 
})
@Lazy
public class Cdbalc01ProcessImpl implements Cdbalc01Process {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cdbalc01ProcessImpl.class);

	@Autowired
	private DataHolderMapper mapper;

	@Value("${cdbalc01.process-start-date}")
	private String processStartDate;

	@Value("${cdbalc01.process-end-date}")
	private String processEndDate;

	@Value("${cdbalc01.card-limit}")
	private int cardLimit;

	/**
	 * Process operation main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		String programId = ""; 
		if (ctx.isFirstRun()) {
			LOGGER.info("[CDBALC01] Starting Balance Calculation Batch Job");
			LOGGER.info("[CDBALC01] Processing transactions from {} to {}", processStartDate, processEndDate);
			
			// Open required files
			DAOManager.getDAO(ctx, FileIds.CDCCMP)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			
			DAOManager.getDAO(ctx, FileIds.CDTRNR03)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Input)
			.open();
			
			DAOManager.getDAO(ctx, FileIds.CDBALP)
			.withContext(ctx, ctrl.getExecutionContext())
			.withOpenMode(EOpenMode.Update)
			.open();
		} 
		ctx.setFirstRun(false);
		try {
			do {
				if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
					break;
				} else {
					MAINCODE(ctx, ctrl);
					if (ctx.isMainReturned()) {
						ctx.setMainReturned(false);
						break;
					} 
				}
			} while (true);
			ctx.setLastRecordProcessed(DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0);
			if (DataUtils.compare(ctx.getInLR().getInLRReference(), "1") == 0) {
				DAOManager.getDAO(ctx, FileIds.CDCCMP)
				.close();
				
				DAOManager.getDAO(ctx, FileIds.CDTRNR03)
				.close();
				
				DAOManager.getDAO(ctx, FileIds.CDBALP)
				.close();
				
				programId = ctx.getProgramIdentifier();
				ctrl.setNeedReset(programId);
				
				LOGGER.info("[CDBALC01] Balance Calculation Batch Job completed");
			}
		} catch (Exception e) {
			// Ensure DAOs are closed on exception to prevent resource leaks
			LOGGER.error("[CDBALC01] Exception during processing, closing DAOs", e);
			safeCloseDao(ctx, FileIds.CDCCMP);
			safeCloseDao(ctx, FileIds.CDTRNR03);
			safeCloseDao(ctx, FileIds.CDBALP);
			throw e;
		}
	}

	/**
	 * Process operation MAINCODE.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void MAINCODE(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		/* 
		Main processing */
		LOGGER.info("[CDBALC01] Starting main processing");
		
		// Step 1: Clear CDBALP table
		CLEARTABLE(ctx, ctrl);
		
		// Step 2: Read and process all cards
		READCARDS(ctx, ctrl);
		
		// Step 3: Log statistics
		LOGSTATS(ctx, ctrl);
		
		ctx.getInLR().setInLR("1");
		ctx.setMainReturned(true);
		return;
	}

	/**
	 * Process operation CLEARTABLE.
	 * Clears all records from CDBALP table.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CLEARTABLE(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		LOGGER.info("[CDBALC01] Clearing CDBALP table");
		
		PackedInt deletedCount = PackedDecimal.build(9, 0, true, 0);
		
		// Read and delete all records from CDBALP
		DAOManager.getDAO(ctx, FileIds.CDBALP)
		.withLowValueKeys()
		.setOnGreaterOrEqual();
		
		while (true) {
			DAOManager.getDAO(ctx, FileIds.CDBALP)
			.readCurrentRecord();
			
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDBALP).getEofReference()) == 0) {
				break;
			}
			
			DAOManager.getDAO(ctx, FileIds.CDBALP)
			.delete();
			
			deletedCount.set(deletedCount.get() + 1);
		}
		
		LOGGER.info("[CDBALC01] Deleted {} records from CDBALP", deletedCount.get());
	}

	/**
	 * Process operation READCARDS.
	 * Reads all cards from CDCCMP and processes each one.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void READCARDS(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		LOGGER.info("[CDBALC01] Reading cards from CDCCMP");
		
		int cardsRead = 0;
		
		// Create entity for reading cards
		Cdccmpr cdccmpr = new Cdccmpr(ctx.getConfiguration());
		
		// Read all cards from CDCCMP
		DAOManager.getDAO(ctx, FileIds.CDCCMP)
		.withLowValueKeys()
		.setOnGreaterOrEqual();
		
		while (true) {
			DAOManager.getDAO(ctx, FileIds.CDCCMP)
			.withRecord(cdccmpr)
			.readCurrentRecord();
			
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDCCMP).getEofReference()) == 0) {
				break;
			}
			
			if (cardsRead >= cardLimit) {
				LOGGER.info("[CDBALC01] Reached card limit of {}, stopping", cardLimit);
				break;
			}
			cardsRead++;
			
			try {
				// Set card info in context
				ctx.getBalanceCalc().setCardnum(cdccmpr.getCardnum());
				ctx.getBalanceCalc().setCustid(cdccmpr.getCustid());
				ctx.getBalanceCalc().setAcctnum(cdccmpr.getAcctnum());
				
				// Process this card
				PROCESSCARD(ctx, ctrl);
				
				// Increment processed count
				ctx.getProcessStats().setCardsprocessed(
					ctx.getProcessStats().getCardsprocessed() + 1
				);
				
			} catch (Exception e) {
				LOGGER.error("[CDBALC01] Error processing card {}", maskCardNumber(cdccmpr.getCardnum()), e);
				ctx.getProcessStats().setCardsfailed(
					ctx.getProcessStats().getCardsfailed() + 1
				);
				// Reset BalanceCalc to prevent stale data from failed card affecting next iteration
				ctx.getBalanceCalc().reset();
			}
		}
		
		LOGGER.info("[CDBALC01] Processed {} cards", ctx.getProcessStats().getCardsprocessed());
	}

	/**
	 * Process operation PROCESSCARD.
	 * Processes a single card - calculates balance and writes to CDBALP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void PROCESSCARD(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		// Calculate transaction totals
		CALCTOTALS(ctx, ctrl);
		
		// Calculate outstanding balance using PackedBigDecimal
		PackedBigDecimal outstandBal = PackedDecimal.build(11, 2, true, 0);
		outstandBal.set(ctx.getBalanceCalc().getTotpurchase()
			.add(ctx.getBalanceCalc().getTotcashadvance())
			.subtract(ctx.getBalanceCalc().getTotpayment())
			.subtract(ctx.getBalanceCalc().getTotrefund()));
		
		ctx.getBalanceCalc().setOutstandbal(outstandBal.get());
		
		// Calculate due date (last day of month + 21 days)
		// Convert PROCESS_END_DATE string to date and add 21 days
		Alphanumeric dueDateStr = new Alphanumeric(10, " ");
		dueDateStr.set(DateHelper.addDuration(processEndDate, "*DAYS", 21));
		ctx.getBalanceCalc().setDuedate(dueDateStr.get());
		
		// Set payment status to Unpaid
		ctx.getBalanceCalc().setPaymentstatus("U");
		
		// Write balance record
		WRITEBALANCE(ctx, ctrl);
	}

	/**
	 * Process operation CALCTOTALS.
	 * Calculates transaction totals for a card.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void CALCTOTALS(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		PackedLong cardnum = PackedDecimal.build(16, 0, true, 0);
		cardnum.set(ctx.getBalanceCalc().getCardnum());
		
		// Initialize totals using PackedBigDecimal (11,2 precision to match DB NUMERIC(11,2))
		PackedBigDecimal totPurchase = PackedDecimal.build(11, 2, true, 0);
		PackedBigDecimal totPayment = PackedDecimal.build(11, 2, true, 0);
		PackedBigDecimal totCashAdvance = PackedDecimal.build(11, 2, true, 0);
		PackedBigDecimal totRefund = PackedDecimal.build(11, 2, true, 0);
		
		// Create entity for reading transactions
		Cdtrnpr cdtrnpr = new Cdtrnpr(ctx.getConfiguration());
		
		// Read all transactions for this card using CDTRNR03 (ordered by CARDNUM)
		DAOManager.getDAO(ctx, FileIds.CDTRNR03)
		.withKeys(cardnum.get())
		.setOnGreaterOrEqual();
		
		while (true) {
			DAOManager.getDAO(ctx, FileIds.CDTRNR03)
			.withRecord(cdtrnpr)
			.withKeys(cardnum.get())
			.readNextEqual();
			
			if (DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDTRNR03).getEofReference()) == 0 ||
				DataUtils.compare("1", ctx.getFileReadIndicators(FileIds.CDTRNR03).getFoundReference()) != 0) {
				break;
			}
			
			ctx.getProcessStats().setTransactionsread(
				ctx.getProcessStats().getTransactionsread() + 1
			);
			
			// Check if transaction is approved
			if (DataUtils.compare(cdtrnpr.getTrnstatus(), "A") != 0) {
				continue;  // Skip non-approved transactions
			}
			
			// Check if transaction is in date range using DataUtils.compare
			Alphanumeric trnDate = new Alphanumeric(10, " ");
			trnDate.set(cdtrnpr.getOrigdate());
			
			if (DataUtils.compare(trnDate.get(), processStartDate) < 0 || 
				DataUtils.compare(trnDate.get(), processEndDate) > 0) {
				continue;  // Skip transactions outside date range
			}
			
			// Accumulate by transaction type using BigDecimal.add()
			Alphanumeric trnType = new Alphanumeric(2, " ");
			trnType.set(cdtrnpr.getTypecd());
			
			if (DataUtils.compare(trnType.get(), "PU") == 0) {
				totPurchase.set(totPurchase.get().add(cdtrnpr.getAmount()));
			} else if (DataUtils.compare(trnType.get(), "PM") == 0) {
				totPayment.set(totPayment.get().add(cdtrnpr.getAmount()));
			} else if (DataUtils.compare(trnType.get(), "CA") == 0) {
				totCashAdvance.set(totCashAdvance.get().add(cdtrnpr.getAmount()));
			} else if (DataUtils.compare(trnType.get(), "RF") == 0) {
				totRefund.set(totRefund.get().add(cdtrnpr.getAmount()));
			}
		}
		
		// Set totals in context
		ctx.getBalanceCalc().setTotpurchase(totPurchase.get());
		ctx.getBalanceCalc().setTotpayment(totPayment.get());
		ctx.getBalanceCalc().setTotcashadvance(totCashAdvance.get());
		ctx.getBalanceCalc().setTotrefund(totRefund.get());
	}

	/**
	 * Process operation WRITEBALANCE.
	 * Writes balance record to CDBALP.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void WRITEBALANCE(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		// Create new CDBALP entity
		Cdbalpr cdbalpr = new Cdbalpr(ctx.getConfiguration());
		
		// Map from BalanceCalc to Cdbalpr
		mapper.updateCdbalpFromBalanceCalc(ctx, ctrl, ctx.getBalanceCalc(), cdbalpr);
		
		// Set audit fields - convert dates to integer format
		int currentDate = DateHelper.toDecimal(DateHelper.convertDate(DateHelper.getDate("*ISO"), "*ISO", "*CYMD")).intValue();
		int currentTime = DateHelper.toDecimal(DateHelper.toTime()).intValue();
		
		cdbalpr.setBalcrtdt(currentDate);
		cdbalpr.setBalcrttm(currentTime);
		cdbalpr.setBalchgdt(currentDate);
		cdbalpr.setBalchgtm(currentTime);
		cdbalpr.setLastupddate(DateHelper.getDate("*ISO"));
		cdbalpr.setLastupdtime(DateHelper.getTimeStamp().toString());
		
		// Write to CDBALP
		try {
			DAOManager.getDAO(ctx, FileIds.CDBALP)
			.withRecord(cdbalpr)
			.write();
			ctx.getProcessStats().setBalanceswritten(
				ctx.getProcessStats().getBalanceswritten() + 1
			);
		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().contains("CDBALP_UNIQUE_CARD")) {
				LOGGER.warn("[CDBALC01] Duplicate card {} found, updating existing record",
					maskCardNumber(ctx.getBalanceCalc().getCardnum()));
				DAOManager.getDAO(ctx, FileIds.CDBALP)
				.withRecord(cdbalpr)
				.update();
				ctx.getProcessStats().setBalanceswritten(
					ctx.getProcessStats().getBalanceswritten() + 1
				);
			} else {
				throw e;
			}
		}
	}

	/**
	 * Process operation LOGSTATS.
	 * Logs processing statistics.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void LOGSTATS(final Cdbalc01Context ctx, final ExecutionController ctrl) {
		LOGGER.info("[CDBALC01] ========== Processing Statistics ==========");
		LOGGER.info("[CDBALC01] Cards Processed: {}", ctx.getProcessStats().getCardsprocessed());
		LOGGER.info("[CDBALC01] Cards Failed: {}", ctx.getProcessStats().getCardsfailed());
		LOGGER.info("[CDBALC01] Balances Written: {}", ctx.getProcessStats().getBalanceswritten());
		LOGGER.info("[CDBALC01] Transactions Read: {}", ctx.getProcessStats().getTransactionsread());
		LOGGER.info("[CDBALC01] ==========================================");
	}

	/**
	 * Masks a card number for PCI-DSS compliant logging.
	 * Returns first 6 and last 4 digits, masking the middle.
	 *
	 * @param cardnum the card number to mask
	 * @return masked card number string (e.g., "411111******1234")
	 */
	private String maskCardNumber(long cardnum) {
		String s = String.valueOf(cardnum);
		if (s.length() <= 10) {
			return "****";
		}
		return s.substring(0, 6) + "******" + s.substring(s.length() - 4);
	}

	/**
	 * Closes a DAO without throwing if already closed or close fails.
	 * Used in exception handling to ensure resources are released.
	 */
	private void safeCloseDao(Cdbalc01Context ctx, String fileId) {
		try {
			DAOManager.getDAO(ctx, fileId).close();
		} catch (Exception ex) {
			LOGGER.warn("[CDBALC01] Failed to close DAO {}: {}", fileId, ex.getMessage());
		}
	}
}
