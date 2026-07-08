package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wsfltop.
 * 
 * <p>About 'wsfltop' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wsfltop extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsfltop = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Wsfltop with a default record.
	 * @param configuration the configuration
	 */
	public Wsfltop(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wsfltop bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wsfltop(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsfltop.
	 * @return the wsfltop attribute reference
	 */
	public ElementaryRangeReference getWsfltopReference() {
		return wsfltop.getReference();
	}

	/**
	 * Getter for wsfltop attribute.
	 * @return wsfltop attribute
	 */
	public String getWsfltop() {
		return wsfltop.getValue();
	}

	/**
	 * Setter for wsfltop attribute.
	 * @param wsfltop the new value of wsfltop
	 */
	public void setWsfltop(String wsfltop) {
		this.wsfltop.setValue(wsfltop);
	}
}
