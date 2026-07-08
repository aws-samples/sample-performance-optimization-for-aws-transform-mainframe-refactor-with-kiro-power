package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Custidc.
 * 
 * <p>About 'custidc' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Custidc extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary custidc = new Elementary(root,new AlphanumericType(9)," ");
	
	/**
	 * Instantiate a new Custidc with a default record.
	 * @param configuration the configuration
	 */
	public Custidc(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Custidc bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Custidc(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute custidc.
	 * @return the custidc attribute reference
	 */
	public ElementaryRangeReference getCustidcReference() {
		return custidc.getReference();
	}

	/**
	 * Getter for custidc attribute.
	 * @return custidc attribute
	 */
	public String getCustidc() {
		return custidc.getValue();
	}

	/**
	 * Setter for custidc attribute.
	 * @param custidc the new value of custidc
	 */
	public void setCustidc(String custidc) {
		this.custidc.setValue(custidc);
	}
}
