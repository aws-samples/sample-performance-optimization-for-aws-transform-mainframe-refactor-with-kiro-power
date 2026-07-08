package aws.bluage.carddemo.cdccm03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Returncode1.
 * 
 * <p>About 'returncode1' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Returncode1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary returncode1 = new Elementary(root,new AlphanumericType(12)," ");
	
	/**
	 * Instantiate a new Returncode1 with a default record.
	 * @param configuration the configuration
	 */
	public Returncode1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Returncode1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Returncode1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute returncode1.
	 * @return the returncode1 attribute reference
	 */
	public ElementaryRangeReference getReturncode1Reference() {
		return returncode1.getReference();
	}

	/**
	 * Getter for returncode1 attribute.
	 * @return returncode1 attribute
	 */
	public String getReturncode1() {
		return returncode1.getValue();
	}

	/**
	 * Setter for returncode1 attribute.
	 * @param returncode1 the new value of returncode1
	 */
	public void setReturncode1(String returncode1) {
		this.returncode1.setValue(returncode1);
	}
}
