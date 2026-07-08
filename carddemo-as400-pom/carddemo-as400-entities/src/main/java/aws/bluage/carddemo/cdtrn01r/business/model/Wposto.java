package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wposto.
 * 
 * <p>About 'wposto' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wposto extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wposto = new Elementary(root,new AlphanumericType(15)," ");
	
	/**
	 * Instantiate a new Wposto with a default record.
	 * @param configuration the configuration
	 */
	public Wposto(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wposto bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wposto(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wposto.
	 * @return the wposto attribute reference
	 */
	public ElementaryRangeReference getWpostoReference() {
		return wposto.getReference();
	}

	/**
	 * Getter for wposto attribute.
	 * @return wposto attribute
	 */
	public String getWposto() {
		return wposto.getValue();
	}

	/**
	 * Setter for wposto attribute.
	 * @param wposto the new value of wposto
	 */
	public void setWposto(String wposto) {
		this.wposto.setValue(wposto);
	}
}
