package aws.bluage.carddemo.cdcus02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Genderwin.
 * 
 * <p>About 'dselgen' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Genderwin extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dselgen = new Elementary(root,new ZonedType(2, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Genderwin with a default record.
	 * @param configuration the configuration
	 */
	public Genderwin(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Genderwin bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Genderwin(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dselgen.
	 * @return the dselgen attribute reference
	 */
	public ElementaryRangeReference getDselgenReference() {
		return dselgen.getReference();
	}

	/**
	 * Getter for dselgen attribute.
	 * @return dselgen attribute
	 */
	public int getDselgen() {
		return dselgen.getValue();
	}

	/**
	 * Setter for dselgen attribute.
	 * @param dselgen the new value of dselgen
	 */
	public void setDselgen(int dselgen) {
		this.dselgen.setValue(dselgen);
	}
}
