package aws.bluage.carddemo.cdbalc01.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;

/**
 * Data simplifier entity ProcessStats.
 * Holds processing statistics for the batch job.
 * 
 * @see RecordEntity
 */
public class ProcessStats extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cardsprocessed = new Elementary(root, new PackedType(12, 0, true), new BigDecimal("0"));
	private final Elementary cardsfailed = new Elementary(root, new PackedType(12, 0, true), new BigDecimal("0"));
	private final Elementary balanceswritten = new Elementary(root, new PackedType(12, 0, true), new BigDecimal("0"));
	private final Elementary transactionsread = new Elementary(root, new PackedType(12, 0, true), new BigDecimal("0"));
	
	/**
	 * Instantiate a new ProcessStats with a default record.
	 * @param configuration the configuration
	 */
	public ProcessStats(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new ProcessStats bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ProcessStats(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	// Cardsprocessed
	public ElementaryRangeReference getCardsprocessedReference() {
		return cardsprocessed.getReference();
	}

	public long getCardsprocessed() {
		return cardsprocessed.getValue();
	}

	public void setCardsprocessed(long cardsprocessed) {
		this.cardsprocessed.setValue(cardsprocessed);
	}

	// Cardsfailed
	public ElementaryRangeReference getCardsfailedReference() {
		return cardsfailed.getReference();
	}

	public long getCardsfailed() {
		return cardsfailed.getValue();
	}

	public void setCardsfailed(long cardsfailed) {
		this.cardsfailed.setValue(cardsfailed);
	}

	// Balanceswritten
	public ElementaryRangeReference getBalanceswrittenReference() {
		return balanceswritten.getReference();
	}

	public long getBalanceswritten() {
		return balanceswritten.getValue();
	}

	public void setBalanceswritten(long balanceswritten) {
		this.balanceswritten.setValue(balanceswritten);
	}

	// Transactionsread
	public ElementaryRangeReference getTransactionsreadReference() {
		return transactionsread.getReference();
	}

	public long getTransactionsread() {
		return transactionsread.getValue();
	}

	public void setTransactionsread(long transactionsread) {
		this.transactionsread.setValue(transactionsread);
	}
}
