package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Dlengtrnsts.
 * 
 * <p>About 'dlengtrnsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dlengtrnsts extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dlengtrnsts = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Instantiate a new Dlengtrnsts with a default record.
	 * @param configuration the configuration
	 */
	public Dlengtrnsts(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Dlengtrnsts bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dlengtrnsts(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dlengtrnsts.
	 * @return the dlengtrnsts attribute reference
	 */
	public ElementaryRangeReference getDlengtrnstsReference() {
		return dlengtrnsts.getReference();
	}

	/**
	 * Getter for dlengtrnsts attribute.
	 * @return dlengtrnsts attribute
	 */
	public String getDlengtrnsts() {
		return dlengtrnsts.getValue();
	}

	/**
	 * Setter for dlengtrnsts attribute.
	 * @param dlengtrnsts the new value of dlengtrnsts
	 */
	public void setDlengtrnsts(String dlengtrnsts) {
		this.dlengtrnsts.setValue(dlengtrnsts);
	}
}
