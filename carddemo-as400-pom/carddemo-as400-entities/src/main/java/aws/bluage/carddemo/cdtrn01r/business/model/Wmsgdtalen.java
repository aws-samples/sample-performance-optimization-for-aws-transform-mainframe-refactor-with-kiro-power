package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryIntegerType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wmsgdtalen.
 * 
 * <p>About 'wmsgdtalen' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wmsgdtalen extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wmsgdtalen = new Elementary(root,new BinaryIntegerType(4, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wmsgdtalen with a default record.
	 * @param configuration the configuration
	 */
	public Wmsgdtalen(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wmsgdtalen bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wmsgdtalen(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wmsgdtalen.
	 * @return the wmsgdtalen attribute reference
	 */
	public ElementaryRangeReference getWmsgdtalenReference() {
		return wmsgdtalen.getReference();
	}

	/**
	 * Getter for wmsgdtalen attribute.
	 * @return wmsgdtalen attribute
	 */
	public int getWmsgdtalen() {
		return wmsgdtalen.getValue();
	}

	/**
	 * Setter for wmsgdtalen attribute.
	 * @param wmsgdtalen the new value of wmsgdtalen
	 */
	public void setWmsgdtalen(int wmsgdtalen) {
		this.wmsgdtalen.setValue(wmsgdtalen);
	}
}
