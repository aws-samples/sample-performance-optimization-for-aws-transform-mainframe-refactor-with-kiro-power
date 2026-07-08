package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Errflg.
 * 
 * <p>About 'errflg' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Errflg extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary errflg = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Errflg with a default record.
	 * @param configuration the configuration
	 */
	public Errflg(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Errflg bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Errflg(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute errflg.
	 * @return the errflg attribute reference
	 */
	public ElementaryRangeReference getErrflgReference() {
		return errflg.getReference();
	}

	/**
	 * Getter for errflg attribute.
	 * @return errflg attribute
	 */
	public String getErrflg() {
		return errflg.getValue();
	}

	/**
	 * Setter for errflg attribute.
	 * @param errflg the new value of errflg
	 */
	public void setErrflg(String errflg) {
		this.errflg.setValue(errflg);
	}
}
