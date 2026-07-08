package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Msgsflc.
 * 
 * <p>About 'spgmq' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Msgsflc extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary spgmq = new Elementary(root,new AlphanumericType(10));
	
	/**
	 * Instantiate a new Msgsflc with a default record.
	 * @param configuration the configuration
	 */
	public Msgsflc(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Msgsflc bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Msgsflc(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute spgmq.
	 * @return the spgmq attribute reference
	 */
	public ElementaryRangeReference getSpgmqReference() {
		return spgmq.getReference();
	}

	/**
	 * Getter for spgmq attribute.
	 * @return spgmq attribute
	 */
	public String getSpgmq() {
		return spgmq.getValue();
	}

	/**
	 * Setter for spgmq attribute.
	 * @param spgmq the new value of spgmq
	 */
	public void setSpgmq(String spgmq) {
		this.spgmq.setValue(spgmq);
	}
}
