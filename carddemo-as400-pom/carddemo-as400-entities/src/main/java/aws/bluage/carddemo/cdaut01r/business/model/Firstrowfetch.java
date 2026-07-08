package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Firstrowfetch.
 * 
 * <p>About 'firstrowfetch' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Firstrowfetch extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary firstrowfetch = new Elementary(root,new AlphanumericType(5)," ");
	
	/**
	 * Instantiate a new Firstrowfetch with a default record.
	 * @param configuration the configuration
	 */
	public Firstrowfetch(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Firstrowfetch bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Firstrowfetch(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute firstrowfetch.
	 * @return the firstrowfetch attribute reference
	 */
	public ElementaryRangeReference getFirstrowfetchReference() {
		return firstrowfetch.getReference();
	}

	/**
	 * Getter for firstrowfetch attribute.
	 * @return firstrowfetch attribute
	 */
	public String getFirstrowfetch() {
		return firstrowfetch.getValue();
	}

	/**
	 * Setter for firstrowfetch attribute.
	 * @param firstrowfetch the new value of firstrowfetch
	 */
	public void setFirstrowfetch(String firstrowfetch) {
		this.firstrowfetch.setValue(firstrowfetch);
	}
}
