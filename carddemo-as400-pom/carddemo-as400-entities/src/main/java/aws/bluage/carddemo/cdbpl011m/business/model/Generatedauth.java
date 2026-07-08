package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Generatedauth.
 * 
 * <p>About 'generatedauth' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Generatedauth extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary generatedauth = new Elementary(root,new PackedType(18, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Generatedauth with a default record.
	 * @param configuration the configuration
	 */
	public Generatedauth(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Generatedauth bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Generatedauth(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute generatedauth.
	 * @return the generatedauth attribute reference
	 */
	public ElementaryRangeReference getGeneratedauthReference() {
		return generatedauth.getReference();
	}

	/**
	 * Getter for generatedauth attribute.
	 * @return generatedauth attribute
	 */
	public long getGeneratedauth() {
		return generatedauth.getValue();
	}

	/**
	 * Setter for generatedauth attribute.
	 * @param generatedauth the new value of generatedauth
	 */
	public void setGeneratedauth(long generatedauth) {
		this.generatedauth.setValue(generatedauth);
	}
}
