package aws.bluage.carddemo.cdrpt02r.business.context;
import aws.bluage.carddemo.cdrpt02r.business.model.Pcustid;
import aws.bluage.carddemo.cdrpt02r.business.model.Presult;
import aws.bluage.carddemo.common.business.database.cdcusp.Cdcuspr;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context Cdrpt02rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdcuspr' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.Cdcuspr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'pcustid' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.Pcustid
 * <br></p>
 * 
 * <p>About 'presult' field, <br>uml entity: aws.bluage.carddemo.cdrpt02r.business.model.Presult
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdrpt02r.business.context.Cdrpt02rContext")
@Lazy
@Scope("prototype")
public class Cdrpt02rContext extends Blu4ivRuntimeContext {
	
	private Cdcuspr cdcuspr;
	private Pcustid pcustid;
	private Presult presult;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdrpt02rContext (@Qualifier("Cdrpt02rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	

	/**
	 * Getter for cdcuspr.
	 * @return the cdcuspr
	 */
	public Cdcuspr getCdcuspr() {
		return this.cdcuspr;
	}

	/**
	 * Setter for cdcuspr.
	 * @param reference the new value for cdcuspr
	 */
	public void setCdcuspr(RangeReference reference) {
		this.cdcuspr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pcustid.
	 * @return the pcustid
	 */
	public Pcustid getPcustid() {
		return this.pcustid;
	}

	/**
	 * Setter for pcustid.
	 * @param reference the new value for pcustid
	 */
	public void setPcustid(RangeReference reference) {
		this.pcustid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for presult.
	 * @return the presult
	 */
	public Presult getPresult() {
		return this.presult;
	}

	/**
	 * Setter for presult.
	 * @param reference the new value for presult
	 */
	public void setPresult(RangeReference reference) {
		this.presult.setBytes(reference.getBytes());
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
		cdcuspr = new Cdcuspr(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		pcustid = new Pcustid(configuration, EntityUtils.getUnlinkedRecord());
		presult = new Presult(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdcuspr);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdrpt02rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Pcustid : [").append(pcustid.toString()).append("]\n");
		toSB.append("Presult : [").append(presult.toString()).append("]\n");
		return toSB.toString();
	}

}
