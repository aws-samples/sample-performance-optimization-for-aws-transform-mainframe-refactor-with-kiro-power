package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wname.
 * 
 * <p>About 'wname' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wname extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wname = new Elementary(root,new AlphanumericType(25)," ");
	
	/**
	 * Instantiate a new Wname with a default record.
	 * @param configuration the configuration
	 */
	public Wname(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wname bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wname(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wname.
	 * @return the wname attribute reference
	 */
	public ElementaryRangeReference getWnameReference() {
		return wname.getReference();
	}

	/**
	 * Getter for wname attribute.
	 * @return wname attribute
	 */
	public String getWname() {
		return wname.getValue();
	}

	/**
	 * Setter for wname attribute.
	 * @param wname the new value of wname
	 */
	public void setWname(String wname) {
		this.wname.setValue(wname);
	}
}
