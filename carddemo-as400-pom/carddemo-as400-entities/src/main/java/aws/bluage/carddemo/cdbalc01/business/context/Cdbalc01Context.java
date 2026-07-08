package aws.bluage.carddemo.cdbalc01.business.context;

import aws.bluage.carddemo.cdbalc01.business.model.BalanceCalc;
import aws.bluage.carddemo.cdbalc01.business.model.ProcessStats;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context Cdbalc01Context.
 * Context for Card Balance Calculation batch job.
 */
@Component("aws.bluage.carddemo.cdbalc01.business.context.Cdbalc01Context")
@Lazy
@Scope("prototype")
public class Cdbalc01Context extends Blu4ivRuntimeContext {
	
	private BalanceCalc balanceCalc;
	private ProcessStats processStats;

	private List<String> fieldsToUpdate;
	private boolean firstRun;
	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdbalc01Context(@Qualifier("Cdbalc01ContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initRecordEntities();
	}

	/**
	 * Getter for balanceCalc.
	 * @return the balanceCalc
	 */
	public BalanceCalc getBalanceCalc() {
		return this.balanceCalc;
	}

	/**
	 * Setter for balanceCalc.
	 * @param reference the new value for balanceCalc
	 */
	public void setBalanceCalc(RangeReference reference) {
		this.balanceCalc.setBytes(reference.getBytes());
	}

	/**
	 * Getter for processStats.
	 * @return the processStats
	 */
	public ProcessStats getProcessStats() {
		return this.processStats;
	}

	/**
	 * Setter for processStats.
	 * @param reference the new value for processStats
	 */
	public void setProcessStats(RangeReference reference) {
		this.processStats.setBytes(reference.getBytes());
	}

	/**
	 * Getter for fieldsToUpdate.
	 * @return the fieldsToUpdate
	 */
	public List<String> getFieldsToUpdate() {
		return this.fieldsToUpdate;
	}

	/**
	 * Setter for fieldsToUpdate.
	 * @param value the new value for fieldsToUpdate
	 */
	public void setFieldsToUpdate(List<String> value) {
		this.fieldsToUpdate = value;
	}

	/**
	 * Getter for firstRun.
	 * @return the firstRun
	 */
	public boolean isFirstRun() {
		return this.firstRun;
	}

	/**
	 * Setter for firstRun.
	 * @param value the new value for firstRun
	 */
	public void setFirstRun(boolean value) {
		this.firstRun = value;
	}

	@Override 
	public void cleanUp() {
	}

	@Override
	protected void doReset() {
		cleanUp();
		recordEntities.stream().forEach(e -> e.reset());
		this.fieldsToUpdate = null;
		this.firstRun = true;
	}

	private void initWorking(Configuration configuration) {
		balanceCalc = new BalanceCalc(configuration);
		processStats = new ProcessStats(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(balanceCalc, processStats);
	}

	@Override
	public String toString() {
		StringBuilder toSB = new StringBuilder("\nCdbalc01Context:\n");
		if (!this.recordEntities.isEmpty()) {
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}
}
