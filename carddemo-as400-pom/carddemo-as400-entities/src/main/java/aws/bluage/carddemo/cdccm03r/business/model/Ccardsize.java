package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Ccardsize.
 * 
 * <p>About 'ccardsize' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ccardsize extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ccardsize = new Elementary(root,new PackedType(15, 0, true),new BigDecimal("100000000000000"));
	
	/**
	 * Instantiate a new Ccardsize with a default record.
	 * @param configuration the configuration
	 */
	public Ccardsize(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Ccardsize bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Ccardsize(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ccardsize.
	 * @return the ccardsize attribute reference
	 */
	public ElementaryRangeReference getCcardsizeReference() {
		return ccardsize.getReference();
	}

	/**
	 * Getter for ccardsize attribute.
	 * @return ccardsize attribute
	 */
	public long getCcardsize() {
		return ccardsize.getValue();
	}

	/**
	 * Setter for ccardsize attribute.
	 * @param ccardsize the new value of ccardsize
	 */
	public void setCcardsize(long ccardsize) {
		this.ccardsize.setValue(ccardsize);
	}
}
