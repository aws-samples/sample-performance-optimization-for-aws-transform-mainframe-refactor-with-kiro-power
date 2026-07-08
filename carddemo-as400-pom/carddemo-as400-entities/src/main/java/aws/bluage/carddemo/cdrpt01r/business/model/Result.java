package aws.bluage.carddemo.cdrpt01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Result.
 * 
 * <p>About 'result' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Result extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary result = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Result with a default record.
	 * @param configuration the configuration
	 */
	public Result(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Result bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Result(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute result.
	 * @return the result attribute reference
	 */
	public ElementaryRangeReference getResultReference() {
		return result.getReference();
	}

	/**
	 * Getter for result attribute.
	 * @return result attribute
	 */
	public String getResult() {
		return result.getValue();
	}

	/**
	 * Setter for result attribute.
	 * @param result the new value of result
	 */
	public void setResult(String result) {
		this.result.setValue(result);
	}
}
