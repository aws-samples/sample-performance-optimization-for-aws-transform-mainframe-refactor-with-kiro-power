package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Header2.
 * 
 * <p>About 'dposition' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Header2 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dposition = new Elementary(root,new AlphanumericType(19)," ");
	
	/**
	 * Instantiate a new Header2 with a default record.
	 * @param configuration the configuration
	 */
	public Header2(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Header2 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Header2(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dposition.
	 * @return the dposition attribute reference
	 */
	public ElementaryRangeReference getDpositionReference() {
		return dposition.getReference();
	}

	/**
	 * Getter for dposition attribute.
	 * @return dposition attribute
	 */
	public String getDposition() {
		return dposition.getValue();
	}

	/**
	 * Setter for dposition attribute.
	 * @param dposition the new value of dposition
	 */
	public void setDposition(String dposition) {
		this.dposition.setValue(dposition);
	}
}
