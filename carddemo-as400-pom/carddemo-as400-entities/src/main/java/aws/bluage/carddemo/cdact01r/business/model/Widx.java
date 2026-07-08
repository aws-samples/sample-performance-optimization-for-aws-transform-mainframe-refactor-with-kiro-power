package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Widx.
 * 
 * <p>About 'widx' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Widx extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary widx = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Widx with a default record.
	 * @param configuration the configuration
	 */
	public Widx(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Widx bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Widx(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute widx.
	 * @return the widx attribute reference
	 */
	public ElementaryRangeReference getWidxReference() {
		return widx.getReference();
	}

	/**
	 * Getter for widx attribute.
	 * @return widx attribute
	 */
	public int getWidx() {
		return widx.getValue();
	}

	/**
	 * Setter for widx attribute.
	 * @param widx the new value of widx
	 */
	public void setWidx(int widx) {
		this.widx.setValue(widx);
	}
}
