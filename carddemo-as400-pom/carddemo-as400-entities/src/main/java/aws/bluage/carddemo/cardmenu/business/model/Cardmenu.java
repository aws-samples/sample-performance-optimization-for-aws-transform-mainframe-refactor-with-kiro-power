package aws.bluage.carddemo.cardmenu.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Cardmenu.
 * 
 * <p>About 'cmdprompt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cardmenu extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cmdprompt = new Elementary(root,new AlphanumericType(5)," ");
	
	/**
	 * Instantiate a new Cardmenu with a default record.
	 * @param configuration the configuration
	 */
	public Cardmenu(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cardmenu bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cardmenu(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cmdprompt.
	 * @return the cmdprompt attribute reference
	 */
	public ElementaryRangeReference getCmdpromptReference() {
		return cmdprompt.getReference();
	}

	/**
	 * Getter for cmdprompt attribute.
	 * @return cmdprompt attribute
	 */
	public String getCmdprompt() {
		return cmdprompt.getValue();
	}

	/**
	 * Setter for cmdprompt attribute.
	 * @param cmdprompt the new value of cmdprompt
	 */
	public void setCmdprompt(String cmdprompt) {
		this.cmdprompt.setValue(cmdprompt);
	}
}
