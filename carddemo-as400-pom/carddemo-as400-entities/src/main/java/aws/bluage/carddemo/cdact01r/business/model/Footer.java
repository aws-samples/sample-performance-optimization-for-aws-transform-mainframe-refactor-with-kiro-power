package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Footer.
 * 
 * <p>About 'varyft' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Footer extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary varyft = new Elementary(root,new AlphanumericType(35)," ");
	
	/**
	 * Instantiate a new Footer with a default record.
	 * @param configuration the configuration
	 */
	public Footer(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Footer bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Footer(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute varyft.
	 * @return the varyft attribute reference
	 */
	public ElementaryRangeReference getVaryftReference() {
		return varyft.getReference();
	}

	/**
	 * Getter for varyft attribute.
	 * @return varyft attribute
	 */
	public String getVaryft() {
		return varyft.getValue();
	}

	/**
	 * Setter for varyft attribute.
	 * @param varyft the new value of varyft
	 */
	public void setVaryft(String varyft) {
		this.varyft.setValue(varyft);
	}
}
