package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wmsgtype.
 * 
 * <p>About 'wmsgtype' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wmsgtype extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wmsgtype = new Elementary(root,new AlphanumericType(10),"*DIAG");
	
	/**
	 * Instantiate a new Wmsgtype with a default record.
	 * @param configuration the configuration
	 */
	public Wmsgtype(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wmsgtype bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wmsgtype(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wmsgtype.
	 * @return the wmsgtype attribute reference
	 */
	public ElementaryRangeReference getWmsgtypeReference() {
		return wmsgtype.getReference();
	}

	/**
	 * Getter for wmsgtype attribute.
	 * @return wmsgtype attribute
	 */
	public String getWmsgtype() {
		return wmsgtype.getValue();
	}

	/**
	 * Setter for wmsgtype attribute.
	 * @param wmsgtype the new value of wmsgtype
	 */
	public void setWmsgtype(String wmsgtype) {
		this.wmsgtype.setValue(wmsgtype);
	}
}
