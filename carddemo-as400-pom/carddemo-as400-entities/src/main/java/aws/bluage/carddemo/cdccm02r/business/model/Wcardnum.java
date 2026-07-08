package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wcardnum.
 * 
 * <p>About 'wcardnum' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcardnum extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wcardnum with a default record.
	 * @param configuration the configuration
	 */
	public Wcardnum(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcardnum bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcardnum(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcardnum.
	 * @return the wcardnum attribute reference
	 */
	public ElementaryRangeReference getWcardnumReference() {
		return wcardnum.getReference();
	}

	/**
	 * Getter for wcardnum attribute.
	 * @return wcardnum attribute
	 */
	public long getWcardnum() {
		return wcardnum.getValue();
	}

	/**
	 * Setter for wcardnum attribute.
	 * @param wcardnum the new value of wcardnum
	 */
	public void setWcardnum(long wcardnum) {
		this.wcardnum.setValue(wcardnum);
	}
}
