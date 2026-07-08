package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Alwayson.
 * 
 * <p>About 'alwayson' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Alwayson extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary alwayson = new Elementary(root,new AlphanumericType(1),"1");
	
	/**
	 * Instantiate a new Alwayson with a default record.
	 * @param configuration the configuration
	 */
	public Alwayson(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Alwayson bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Alwayson(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute alwayson.
	 * @return the alwayson attribute reference
	 */
	public ElementaryRangeReference getAlwaysonReference() {
		return alwayson.getReference();
	}

	/**
	 * Getter for alwayson attribute.
	 * @return alwayson attribute
	 */
	public String getAlwayson() {
		return alwayson.getValue();
	}

	/**
	 * Setter for alwayson attribute.
	 * @param alwayson the new value of alwayson
	 */
	public void setAlwayson(String alwayson) {
		this.alwayson.setValue(alwayson);
	}
}
