package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Readct.
 * 
 * <p>About 'readct' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Readct extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary readct = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Readct with a default record.
	 * @param configuration the configuration
	 */
	public Readct(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Readct bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Readct(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute readct.
	 * @return the readct attribute reference
	 */
	public ElementaryRangeReference getReadctReference() {
		return readct.getReference();
	}

	/**
	 * Getter for readct attribute.
	 * @return readct attribute
	 */
	public int getReadct() {
		return readct.getValue();
	}

	/**
	 * Setter for readct attribute.
	 * @param readct the new value of readct
	 */
	public void setReadct(int readct) {
		this.readct.setValue(readct);
	}
}
