package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Action.
 * 
 * <p>About 'action' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Action extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary action = new Elementary(root,new AlphanumericType(5)," ");
	
	/**
	 * Instantiate a new Action with a default record.
	 * @param configuration the configuration
	 */
	public Action(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Action bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Action(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute action.
	 * @return the action attribute reference
	 */
	public ElementaryRangeReference getActionReference() {
		return action.getReference();
	}

	/**
	 * Getter for action attribute.
	 * @return action attribute
	 */
	public String getAction() {
		return action.getValue();
	}

	/**
	 * Setter for action attribute.
	 * @param action the new value of action
	 */
	public void setAction(String action) {
		this.action.setValue(action);
	}
}
