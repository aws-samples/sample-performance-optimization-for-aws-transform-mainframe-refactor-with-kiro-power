package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Lastrowfetch.
 * 
 * <p>About 'lastrowfetch' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Lastrowfetch extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary lastrowfetch = new Elementary(root,new AlphanumericType(5)," ");
	
	/**
	 * Instantiate a new Lastrowfetch with a default record.
	 * @param configuration the configuration
	 */
	public Lastrowfetch(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Lastrowfetch bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Lastrowfetch(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute lastrowfetch.
	 * @return the lastrowfetch attribute reference
	 */
	public ElementaryRangeReference getLastrowfetchReference() {
		return lastrowfetch.getReference();
	}

	/**
	 * Getter for lastrowfetch attribute.
	 * @return lastrowfetch attribute
	 */
	public String getLastrowfetch() {
		return lastrowfetch.getValue();
	}

	/**
	 * Setter for lastrowfetch attribute.
	 * @param lastrowfetch the new value of lastrowfetch
	 */
	public void setLastrowfetch(String lastrowfetch) {
		this.lastrowfetch.setValue(lastrowfetch);
	}
}
