package aws.bluage.carddemo.cdrpt01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Summary.
 * 
 * <p>About 'rmetric' field, <br>
 * </p>
 * 
 * <p>About 'rvalue' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Summary extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary rmetric = new Elementary(root,new AlphanumericType(20)," ");
	private final Elementary rvalue = new Elementary(root,new ZonedType(12, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Summary with a default record.
	 * @param configuration the configuration
	 */
	public Summary(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Summary bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Summary(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute rmetric.
	 * @return the rmetric attribute reference
	 */
	public ElementaryRangeReference getRmetricReference() {
		return rmetric.getReference();
	}

	/**
	 * Getter for rmetric attribute.
	 * @return rmetric attribute
	 */
	public String getRmetric() {
		return rmetric.getValue();
	}

	/**
	 * Setter for rmetric attribute.
	 * @param rmetric the new value of rmetric
	 */
	public void setRmetric(String rmetric) {
		this.rmetric.setValue(rmetric);
	}
	/**
	 * Gets the reference for attribute rvalue.
	 * @return the rvalue attribute reference
	 */
	public ElementaryRangeReference getRvalueReference() {
		return rvalue.getReference();
	}

	/**
	 * Getter for rvalue attribute.
	 * @return rvalue attribute
	 */
	public long getRvalue() {
		return rvalue.getValue();
	}

	/**
	 * Setter for rvalue attribute.
	 * @param rvalue the new value of rvalue
	 */
	public void setRvalue(long rvalue) {
		this.rvalue.setValue(rvalue);
	}
}
