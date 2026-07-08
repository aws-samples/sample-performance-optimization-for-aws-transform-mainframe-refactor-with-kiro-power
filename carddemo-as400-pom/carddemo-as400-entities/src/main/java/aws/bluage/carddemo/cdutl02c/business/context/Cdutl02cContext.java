package aws.bluage.carddemo.cdutl02c.business.context;
import aws.bluage.carddemo.cdutl02c.business.model.NextCase;
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
 * Data simplifier context Cdutl02cContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdutl02c.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdutl02c.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'nextCase' field, <br>uml entity: aws.bluage.carddemo.cdutl02c.business.model.NextCase
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdutl02c.business.context.Cdutl02cContext")
@Lazy
@Scope("prototype")
public class Cdutl02cContext extends Blu4ivRuntimeContext {
	
	private NextCase nextCase;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdutl02cContext (@Qualifier("Cdutl02cContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
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
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(nextCase);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdutl02cContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
