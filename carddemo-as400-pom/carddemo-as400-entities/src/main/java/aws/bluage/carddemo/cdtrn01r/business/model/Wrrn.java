package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wrrn.
 * 
 * <p>About 'wrrn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wrrn extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wrrn = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Wrrn with a default record.
	 * @param configuration the configuration
	 */
	public Wrrn(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wrrn bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wrrn(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wrrn.
	 * @return the wrrn attribute reference
	 */
	public ElementaryRangeReference getWrrnReference() {
		return wrrn.getReference();
	}

	/**
	 * Getter for wrrn attribute.
	 * @return wrrn attribute
	 */
	public int getWrrn() {
		return wrrn.getValue();
	}

	/**
	 * Setter for wrrn attribute.
	 * @param wrrn the new value of wrrn
	 */
	public void setWrrn(int wrrn) {
		this.wrrn.setValue(wrrn);
	}
}
