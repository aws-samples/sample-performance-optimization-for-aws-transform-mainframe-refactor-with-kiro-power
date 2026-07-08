package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wsflempty.
 * 
 * <p>About 'wsflempty' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wsflempty extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsflempty = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Wsflempty with a default record.
	 * @param configuration the configuration
	 */
	public Wsflempty(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wsflempty bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wsflempty(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsflempty.
	 * @return the wsflempty attribute reference
	 */
	public ElementaryRangeReference getWsflemptyReference() {
		return wsflempty.getReference();
	}

	/**
	 * Getter for wsflempty attribute.
	 * @return wsflempty attribute
	 */
	public String getWsflempty() {
		return wsflempty.getValue();
	}

	/**
	 * Setter for wsflempty attribute.
	 * @param wsflempty the new value of wsflempty
	 */
	public void setWsflempty(String wsflempty) {
		this.wsflempty.setValue(wsflempty);
	}
}
