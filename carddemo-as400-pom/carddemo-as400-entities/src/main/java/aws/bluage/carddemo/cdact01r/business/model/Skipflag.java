package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Skipflag.
 * 
 * <p>About 'skipflag' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Skipflag extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary skipflag = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Skipflag with a default record.
	 * @param configuration the configuration
	 */
	public Skipflag(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Skipflag bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Skipflag(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute skipflag.
	 * @return the skipflag attribute reference
	 */
	public ElementaryRangeReference getSkipflagReference() {
		return skipflag.getReference();
	}

	/**
	 * Getter for skipflag attribute.
	 * @return skipflag attribute
	 */
	public String getSkipflag() {
		return skipflag.getValue();
	}

	/**
	 * Setter for skipflag attribute.
	 * @param skipflag the new value of skipflag
	 */
	public void setSkipflag(String skipflag) {
		this.skipflag.setValue(skipflag);
	}
}
