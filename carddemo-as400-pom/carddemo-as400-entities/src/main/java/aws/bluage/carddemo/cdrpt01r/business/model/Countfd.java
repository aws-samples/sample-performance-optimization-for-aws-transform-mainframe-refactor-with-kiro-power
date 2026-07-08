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
 * Data simplifier entity Countfd.
 * 
 * <p>About 'countfd' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Countfd extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary countfd = new Elementary(root,new PackedType(12, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Countfd with a default record.
	 * @param configuration the configuration
	 */
	public Countfd(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Countfd bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Countfd(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute countfd.
	 * @return the countfd attribute reference
	 */
	public ElementaryRangeReference getCountfdReference() {
		return countfd.getReference();
	}

	/**
	 * Getter for countfd attribute.
	 * @return countfd attribute
	 */
	public long getCountfd() {
		return countfd.getValue();
	}

	/**
	 * Setter for countfd attribute.
	 * @param countfd the new value of countfd
	 */
	public void setCountfd(long countfd) {
		this.countfd.setValue(countfd);
	}
}
