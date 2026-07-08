package aws.bluage.carddemo.cdact02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Testnumeric.
 * 
 * <p>About 'testnumeric' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Testnumeric extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary testnumeric = new Elementary(root,new PackedType(13, 2, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Testnumeric with a default record.
	 * @param configuration the configuration
	 */
	public Testnumeric(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Testnumeric bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Testnumeric(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute testnumeric.
	 * @return the testnumeric attribute reference
	 */
	public ElementaryRangeReference getTestnumericReference() {
		return testnumeric.getReference();
	}

	/**
	 * Getter for testnumeric attribute.
	 * @return testnumeric attribute
	 */
	public BigDecimal getTestnumeric() {
		return testnumeric.getValue();
	}

	/**
	 * Setter for testnumeric attribute.
	 * @param testnumeric the new value of testnumeric
	 */
	public void setTestnumeric(BigDecimal testnumeric) {
		this.testnumeric.setValue(testnumeric);
	}
}
