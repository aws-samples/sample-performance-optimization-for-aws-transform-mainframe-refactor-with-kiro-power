package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Wpos.
 * 
 * <p>About 'wpos' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wpos extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wpos = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Wpos with a default record.
	 * @param configuration the configuration
	 */
	public Wpos(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wpos bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wpos(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wpos.
	 * @return the wpos attribute reference
	 */
	public ElementaryRangeReference getWposReference() {
		return wpos.getReference();
	}

	/**
	 * Getter for wpos attribute.
	 * @return wpos attribute
	 */
	public int getWpos() {
		return wpos.getValue();
	}

	/**
	 * Setter for wpos attribute.
	 * @param wpos the new value of wpos
	 */
	public void setWpos(int wpos) {
		this.wpos.setValue(wpos);
	}
}
