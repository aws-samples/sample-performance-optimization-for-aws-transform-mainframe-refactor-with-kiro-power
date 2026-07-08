package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryIntegerType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Wcallstkcntr.
 * 
 * <p>About 'wcallstkcntr' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcallstkcntr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcallstkcntr = new Elementary(root,new BinaryIntegerType(4, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Wcallstkcntr with a default record.
	 * @param configuration the configuration
	 */
	public Wcallstkcntr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcallstkcntr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcallstkcntr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcallstkcntr.
	 * @return the wcallstkcntr attribute reference
	 */
	public ElementaryRangeReference getWcallstkcntrReference() {
		return wcallstkcntr.getReference();
	}

	/**
	 * Getter for wcallstkcntr attribute.
	 * @return wcallstkcntr attribute
	 */
	public int getWcallstkcntr() {
		return wcallstkcntr.getValue();
	}

	/**
	 * Setter for wcallstkcntr attribute.
	 * @param wcallstkcntr the new value of wcallstkcntr
	 */
	public void setWcallstkcntr(int wcallstkcntr) {
		this.wcallstkcntr.setValue(wcallstkcntr);
	}
}
