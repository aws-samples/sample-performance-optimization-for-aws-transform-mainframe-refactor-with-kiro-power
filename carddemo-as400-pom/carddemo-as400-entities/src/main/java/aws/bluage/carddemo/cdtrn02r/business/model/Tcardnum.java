package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Tcardnum.
 * 
 * <p>About 'tcardnum' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Tcardnum extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary tcardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Tcardnum with a default record.
	 * @param configuration the configuration
	 */
	public Tcardnum(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Tcardnum bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Tcardnum(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute tcardnum.
	 * @return the tcardnum attribute reference
	 */
	public ElementaryRangeReference getTcardnumReference() {
		return tcardnum.getReference();
	}

	/**
	 * Getter for tcardnum attribute.
	 * @return tcardnum attribute
	 */
	public long getTcardnum() {
		return tcardnum.getValue();
	}

	/**
	 * Setter for tcardnum attribute.
	 * @param tcardnum the new value of tcardnum
	 */
	public void setTcardnum(long tcardnum) {
		this.tcardnum.setValue(tcardnum);
	}
}
