package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Werror.
 * 
 * <p>About 'werror' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Werror extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary werror = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Werror with a default record.
	 * @param configuration the configuration
	 */
	public Werror(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Werror bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Werror(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute werror.
	 * @return the werror attribute reference
	 */
	public ElementaryRangeReference getWerrorReference() {
		return werror.getReference();
	}

	/**
	 * Getter for werror attribute.
	 * @return werror attribute
	 */
	public String getWerror() {
		return werror.getValue();
	}

	/**
	 * Setter for werror attribute.
	 * @param werror the new value of werror
	 */
	public void setWerror(String werror) {
		this.werror.setValue(werror);
	}
}
