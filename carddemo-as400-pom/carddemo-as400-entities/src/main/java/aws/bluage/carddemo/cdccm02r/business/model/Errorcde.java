package aws.bluage.carddemo.cdccm02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryIntegerType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Errorcde.
 * 
 * <p>About 'bytesprov' field, <br>
 * </p>
 * 
 * <p>About 'bytesavail' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Errorcde extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary bytesprov = new Elementary(root,new BinaryIntegerType(4, true),new BigDecimal("0"));
	private final Elementary bytesavail = new Elementary(root,new BinaryIntegerType(4, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Errorcde with a default record.
	 * @param configuration the configuration
	 */
	public Errorcde(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Errorcde bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Errorcde(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute bytesprov.
	 * @return the bytesprov attribute reference
	 */
	public ElementaryRangeReference getBytesprovReference() {
		return bytesprov.getReference();
	}

	/**
	 * Getter for bytesprov attribute.
	 * @return bytesprov attribute
	 */
	public int getBytesprov() {
		return bytesprov.getValue();
	}

	/**
	 * Setter for bytesprov attribute.
	 * @param bytesprov the new value of bytesprov
	 */
	public void setBytesprov(int bytesprov) {
		this.bytesprov.setValue(bytesprov);
	}
	/**
	 * Gets the reference for attribute bytesavail.
	 * @return the bytesavail attribute reference
	 */
	public ElementaryRangeReference getBytesavailReference() {
		return bytesavail.getReference();
	}

	/**
	 * Getter for bytesavail attribute.
	 * @return bytesavail attribute
	 */
	public int getBytesavail() {
		return bytesavail.getValue();
	}

	/**
	 * Setter for bytesavail attribute.
	 * @param bytesavail the new value of bytesavail
	 */
	public void setBytesavail(int bytesavail) {
		this.bytesavail.setValue(bytesavail);
	}
}
