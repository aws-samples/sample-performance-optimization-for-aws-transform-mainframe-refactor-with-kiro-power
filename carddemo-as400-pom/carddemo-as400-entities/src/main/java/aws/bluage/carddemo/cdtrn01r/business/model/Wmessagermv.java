package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wmessagermv.
 * 
 * <p>About 'wmessagermv' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wmessagermv extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wmessagermv = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Wmessagermv with a default record.
	 * @param configuration the configuration
	 */
	public Wmessagermv(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wmessagermv bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wmessagermv(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wmessagermv.
	 * @return the wmessagermv attribute reference
	 */
	public ElementaryRangeReference getWmessagermvReference() {
		return wmessagermv.getReference();
	}

	/**
	 * Getter for wmessagermv attribute.
	 * @return wmessagermv attribute
	 */
	public String getWmessagermv() {
		return wmessagermv.getValue();
	}

	/**
	 * Setter for wmessagermv attribute.
	 * @param wmessagermv the new value of wmessagermv
	 */
	public void setWmessagermv(String wmessagermv) {
		this.wmessagermv.setValue(wmessagermv);
	}
}
