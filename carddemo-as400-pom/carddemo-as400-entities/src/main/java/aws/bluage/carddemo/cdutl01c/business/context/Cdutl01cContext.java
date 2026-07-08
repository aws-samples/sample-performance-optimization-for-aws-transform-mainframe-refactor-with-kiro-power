package aws.bluage.carddemo.cdutl01c.business.context;
import aws.bluage.carddemo.cdutl01c.business.model.Errorid;
import aws.bluage.carddemo.cdutl01c.business.model.NextCase;
import aws.bluage.carddemo.cdutl01c.business.model.Pgmq;
import aws.bluage.carddemo.cdutl01c.business.model.Work;
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
 * Data simplifier context Cdutl01cContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdutl01c.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdutl01c.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'nextCase' field, <br>uml entity: aws.bluage.carddemo.cdutl01c.business.model.NextCase
 * <br></p>
 * 
 * <p>About 'work' field, <br>uml entity: aws.bluage.carddemo.cdutl01c.business.model.Work
 * <br></p>
 * 
 * <p>About 'errorid' field, <br>uml entity: aws.bluage.carddemo.cdutl01c.business.model.Errorid
 * <br></p>
 * 
 * <p>About 'pgmq' field, <br>uml entity: aws.bluage.carddemo.cdutl01c.business.model.Pgmq
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdutl01c.business.context.Cdutl01cContext")
@Lazy
@Scope("prototype")
public class Cdutl01cContext extends Blu4ivRuntimeContext {
	
	private NextCase nextCase;
	private Work work;
	private Errorid errorid;
	private Pgmq pgmq;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdutl01cContext (@Qualifier("Cdutl01cContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	

	/**
	 * Getter for nextCase.
	 * @return the nextCase
	 */
	public NextCase getNextCase() {
		return this.nextCase;
	}

	/**
	 * Setter for nextCase.
	 * @param reference the new value for nextCase
	 */
	public void setNextCase(RangeReference reference) {
		this.nextCase.setBytes(reference.getBytes());
	}

	/**
	 * Getter for work.
	 * @return the work
	 */
	public Work getWork() {
		return this.work;
	}

	/**
	 * Setter for work.
	 * @param reference the new value for work
	 */
	public void setWork(RangeReference reference) {
		this.work.setBytes(reference.getBytes());
	}

	/**
	 * Getter for errorid.
	 * @return the errorid
	 */
	public Errorid getErrorid() {
		return this.errorid;
	}

	/**
	 * Setter for errorid.
	 * @param reference the new value for errorid
	 */
	public void setErrorid(RangeReference reference) {
		this.errorid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pgmq.
	 * @return the pgmq
	 */
	public Pgmq getPgmq() {
		return this.pgmq;
	}

	/**
	 * Setter for pgmq.
	 * @param reference the new value for pgmq
	 */
	public void setPgmq(RangeReference reference) {
		this.pgmq.setBytes(reference.getBytes());
	}

	@Override 
	public void cleanUp(){
	}

	@Override
	protected void doReset() {
		cleanUp();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
	}

	
	private void initWorking(Configuration configuration) {
		nextCase = new NextCase(configuration);
		work = new Work(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		errorid = new Errorid(configuration, EntityUtils.getUnlinkedRecord());
		pgmq = new Pgmq(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(nextCase, work);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdutl01cContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Errorid : [").append(errorid.toString()).append("]\n");
		toSB.append("Pgmq : [").append(pgmq.toString()).append("]\n");
		return toSB.toString();
	}

}
