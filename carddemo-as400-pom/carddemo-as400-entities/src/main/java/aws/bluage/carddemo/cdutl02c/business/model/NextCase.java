package aws.bluage.carddemo.cdutl02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity NextCase.
 * 
 * <p>About 'nextCase' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class NextCase extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary nextCase = new Elementary(root,new AlphanumericType(100),"                                                                                                    ");
	
	/**
	 * Instantiate a new NextCase with a default record.
	 * @param configuration the configuration
	 */
	public NextCase(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new NextCase bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public NextCase(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute nextCase.
	 * @return the nextCase attribute reference
	 */
	public ElementaryRangeReference getNextCaseReference() {
		return nextCase.getReference();
	}

	/**
	 * Getter for nextCase attribute.
	 * @return nextCase attribute
	 */
	public String getNextCase() {
		return nextCase.getValue();
	}

	/**
	 * Setter for nextCase attribute.
	 * @param nextCase the new value of nextCase
	 */
	public void setNextCase(String nextCase) {
		this.nextCase.setValue(nextCase);
	}
}
