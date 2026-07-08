package aws.bluage.carddemo.cdrpt01r.business.context;
import aws.bluage.carddemo.cdrpt01r.business.model.Countfd;
import aws.bluage.carddemo.cdrpt01r.business.model.Countntfd;
import aws.bluage.carddemo.cdrpt01r.business.model.Detail;
import aws.bluage.carddemo.cdrpt01r.business.model.Result;
import aws.bluage.carddemo.cdrpt01r.business.model.Summary;
import aws.bluage.carddemo.common.business.database.cdactp.Cdactpr;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import com.netfective.bluage.gapwalk.runtime.statements.PrintHandler;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context Cdrpt01rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdactpr' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.Cdactpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'summary' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.Summary
 * <br></p>
 * 
 * <p>About 'detail' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.Detail
 * <br></p>
 * 
 * <p>About 'result' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.Result
 * <br></p>
 * 
 * <p>About 'countfd' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.Countfd
 * <br></p>
 * 
 * <p>About 'countntfd' field, <br>uml entity: aws.bluage.carddemo.cdrpt01r.business.model.Countntfd
 * <br></p>
 * 
 * <p>About 'cdrptp' field, <br>uml entity: gwtype.PrintHandler
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdrpt01r.business.context.Cdrpt01rContext")
@Lazy
@Scope("prototype")
public class Cdrpt01rContext extends Blu4ivRuntimeContext {
	
	private Cdactpr cdactpr;
	private Summary summary;
	private Detail detail;
	private Result result;
	private Countfd countfd;
	private Countntfd countntfd;

	private PrintHandler cdrptp;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdrpt01rContext (@Qualifier("Cdrpt01rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
		initRecordEntities();
	}
	
	

	/**
	 * Getter for cdactpr.
	 * @return the cdactpr
	 */
	public Cdactpr getCdactpr() {
		return this.cdactpr;
	}

	/**
	 * Setter for cdactpr.
	 * @param reference the new value for cdactpr
	 */
	public void setCdactpr(RangeReference reference) {
		this.cdactpr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for summary.
	 * @return the summary
	 */
	public Summary getSummary() {
		return this.summary;
	}

	/**
	 * Setter for summary.
	 * @param reference the new value for summary
	 */
	public void setSummary(RangeReference reference) {
		this.summary.setBytes(reference.getBytes());
	}

	/**
	 * Getter for detail.
	 * @return the detail
	 */
	public Detail getDetail() {
		return this.detail;
	}

	/**
	 * Setter for detail.
	 * @param reference the new value for detail
	 */
	public void setDetail(RangeReference reference) {
		this.detail.setBytes(reference.getBytes());
	}

	/**
	 * Getter for result.
	 * @return the result
	 */
	public Result getResult() {
		return this.result;
	}

	/**
	 * Setter for result.
	 * @param reference the new value for result
	 */
	public void setResult(RangeReference reference) {
		this.result.setBytes(reference.getBytes());
	}

	/**
	 * Getter for countfd.
	 * @return the countfd
	 */
	public Countfd getCountfd() {
		return this.countfd;
	}

	/**
	 * Setter for countfd.
	 * @param reference the new value for countfd
	 */
	public void setCountfd(RangeReference reference) {
		this.countfd.setBytes(reference.getBytes());
	}

	/**
	 * Getter for countntfd.
	 * @return the countntfd
	 */
	public Countntfd getCountntfd() {
		return this.countntfd;
	}

	/**
	 * Setter for countntfd.
	 * @param reference the new value for countntfd
	 */
	public void setCountntfd(RangeReference reference) {
		this.countntfd.setBytes(reference.getBytes());
	}

	/**
	 * Getter for cdrptp.
	 * @return the cdrptp
	 */
	public PrintHandler getCdrptp() {
		return this.cdrptp;
	}

	/**
	 * Setter for cdrptp.
	 * @param value the new value for cdrptp
	 */
	public void setCdrptp(PrintHandler value) {
		this.cdrptp = value;
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
	public void cleanUp(){
	}

	@Override
	protected void doReset() {
		cleanUp();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
		this.cdrptp = null;
		this.fieldsToUpdate = null;
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdactpr = new Cdactpr(configuration);
		summary = new Summary(configuration);
		detail = new Detail(configuration);
		result = new Result(configuration);
		countfd = new Countfd(configuration);
		countntfd = new Countntfd(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdactpr, summary, detail, result, countfd, countntfd);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdrpt01rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
