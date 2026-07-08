package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Ctl1.
 * 
 * <p>About 'sflrrn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ctl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary sflrrn = new Elementary(root,new ZonedType(4, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Ctl1 with a default record.
	 * @param configuration the configuration
	 */
	public Ctl1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Ctl1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Ctl1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute sflrrn.
	 * @return the sflrrn attribute reference
	 */
	public ElementaryRangeReference getSflrrnReference() {
		return sflrrn.getReference();
	}

	/**
	 * Getter for sflrrn attribute.
	 * @return sflrrn attribute
	 */
	public int getSflrrn() {
		return sflrrn.getValue();
	}

	/**
	 * Setter for sflrrn attribute.
	 * @param sflrrn the new value of sflrrn
	 */
	public void setSflrrn(int sflrrn) {
		this.sflrrn.setValue(sflrrn);
	}
}
