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
 * Data simplifier entity Duperrmsgl.
 * 
 * <p>About 'duperrmsgl' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Duperrmsgl extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary duperrmsgl = new Elementary(root,new PackedType(10, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Duperrmsgl with a default record.
	 * @param configuration the configuration
	 */
	public Duperrmsgl(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Duperrmsgl bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Duperrmsgl(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute duperrmsgl.
	 * @return the duperrmsgl attribute reference
	 */
	public ElementaryRangeReference getDuperrmsglReference() {
		return duperrmsgl.getReference();
	}

	/**
	 * Getter for duperrmsgl attribute.
	 * @return duperrmsgl attribute
	 */
	public long getDuperrmsgl() {
		return duperrmsgl.getValue();
	}

	/**
	 * Setter for duperrmsgl attribute.
	 * @param duperrmsgl the new value of duperrmsgl
	 */
	public void setDuperrmsgl(long duperrmsgl) {
		this.duperrmsgl.setValue(duperrmsgl);
	}
}
