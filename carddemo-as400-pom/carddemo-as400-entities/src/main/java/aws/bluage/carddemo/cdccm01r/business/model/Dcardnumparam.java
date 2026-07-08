package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Dcardnumparam.
 * 
 * <p>About 'dcardnumparam' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dcardnumparam extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dcardnumparam = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Dcardnumparam with a default record.
	 * @param configuration the configuration
	 */
	public Dcardnumparam(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Dcardnumparam bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dcardnumparam(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dcardnumparam.
	 * @return the dcardnumparam attribute reference
	 */
	public ElementaryRangeReference getDcardnumparamReference() {
		return dcardnumparam.getReference();
	}

	/**
	 * Getter for dcardnumparam attribute.
	 * @return dcardnumparam attribute
	 */
	public long getDcardnumparam() {
		return dcardnumparam.getValue();
	}

	/**
	 * Setter for dcardnumparam attribute.
	 * @param dcardnumparam the new value of dcardnumparam
	 */
	public void setDcardnumparam(long dcardnumparam) {
		this.dcardnumparam.setValue(dcardnumparam);
	}
}
