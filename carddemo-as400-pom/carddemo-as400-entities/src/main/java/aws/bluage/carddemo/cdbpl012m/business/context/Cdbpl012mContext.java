package aws.bluage.carddemo.cdbpl012m.business.context;
import aws.bluage.carddemo.cdbpl012m.business.model.ProgramStatus;
import aws.bluage.carddemo.common.business.database.cdautp.Cdautpr;
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
 * Data simplifier context Cdbpl012mContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdautpr' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.Cdautpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'programStatus' field, <br>uml entity: aws.bluage.carddemo.cdbpl012m.business.model.ProgramStatus
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdbpl012m.business.context.Cdbpl012mContext")
@Lazy
@Scope("prototype")
public class Cdbpl012mContext extends Blu4ivRuntimeContext {
	
	private Cdautpr cdautpr;
	private ProgramStatus programStatus;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdbpl012mContext (@Qualifier("Cdbpl012mContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
		initRecordEntities();
	}
	
	

	/**
	 * Getter for cdautpr.
	 * @return the cdautpr
	 */
	public Cdautpr getCdautpr() {
		return this.cdautpr;
	}

	/**
	 * Setter for cdautpr.
	 * @param reference the new value for cdautpr
	 */
	public void setCdautpr(RangeReference reference) {
		this.cdautpr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for programStatus.
	 * @return the programStatus
	 */
	public ProgramStatus getProgramStatus() {
		return this.programStatus;
	}

	/**
	 * Setter for programStatus.
	 * @param reference the new value for programStatus
	 */
	public void setProgramStatus(RangeReference reference) {
		this.programStatus.setBytes(reference.getBytes());
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
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdautpr = new Cdautpr(configuration);
		programStatus = new ProgramStatus(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdautpr, programStatus);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdbpl012mContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
