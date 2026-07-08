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
 * Data simplifier entity Ccardprefix.
 * 
 * <p>About 'ccardprefix' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ccardprefix extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ccardprefix = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("3300000000000000"));
	
	/**
	 * Instantiate a new Ccardprefix with a default record.
	 * @param configuration the configuration
	 */
	public Ccardprefix(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Ccardprefix bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Ccardprefix(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ccardprefix.
	 * @return the ccardprefix attribute reference
	 */
	public ElementaryRangeReference getCcardprefixReference() {
		return ccardprefix.getReference();
	}

	/**
	 * Getter for ccardprefix attribute.
	 * @return ccardprefix attribute
	 */
	public long getCcardprefix() {
		return ccardprefix.getValue();
	}

	/**
	 * Setter for ccardprefix attribute.
	 * @param ccardprefix the new value of ccardprefix
	 */
	public void setCcardprefix(long ccardprefix) {
		this.ccardprefix.setValue(ccardprefix);
	}
}
