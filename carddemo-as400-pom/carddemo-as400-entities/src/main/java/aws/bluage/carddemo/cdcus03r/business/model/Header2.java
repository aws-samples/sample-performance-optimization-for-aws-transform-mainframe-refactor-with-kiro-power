package aws.bluage.carddemo.cdcus03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Header2.
 * 
 * <p>About 'position' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Header2 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary position = new Elementary(root,new ZonedType(9, 0, true),Integer.valueOf("0"));
	
	/**
	 * Instantiate a new Header2 with a default record.
	 * @param configuration the configuration
	 */
	public Header2(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Header2 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Header2(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute position.
	 * @return the position attribute reference
	 */
	public ElementaryRangeReference getPositionReference() {
		return position.getReference();
	}

	/**
	 * Getter for position attribute.
	 * @return position attribute
	 */
	public int getPosition() {
		return position.getValue();
	}

	/**
	 * Setter for position attribute.
	 * @param position the new value of position
	 */
	public void setPosition(int position) {
		this.position.setValue(position);
	}
}
