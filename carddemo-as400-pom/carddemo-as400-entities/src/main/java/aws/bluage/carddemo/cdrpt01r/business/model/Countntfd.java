package aws.bluage.carddemo.cdrpt01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Countntfd.
 * 
 * <p>About 'countntfd' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Countntfd extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary countntfd = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Countntfd with a default record.
	 * @param configuration the configuration
	 */
	public Countntfd(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Countntfd bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Countntfd(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute countntfd.
	 * @return the countntfd attribute reference
	 */
	public ElementaryRangeReference getCountntfdReference() {
		return countntfd.getReference();
	}

	/**
	 * Getter for countntfd attribute.
	 * @return countntfd attribute
	 */
	public long getCountntfd() {
		return countntfd.getValue();
	}

	/**
	 * Setter for countntfd attribute.
	 * @param countntfd the new value of countntfd
	 */
	public void setCountntfd(long countntfd) {
		this.countntfd.setValue(countntfd);
	}
}
