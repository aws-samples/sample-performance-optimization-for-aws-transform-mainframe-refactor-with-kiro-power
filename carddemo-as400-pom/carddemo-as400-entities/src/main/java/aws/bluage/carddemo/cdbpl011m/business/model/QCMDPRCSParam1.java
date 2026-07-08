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
 * Data simplifier entity QCMDPRCSParam1.
 * 
 * <p>About 'qCMDPRCSParam1' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class QCMDPRCSParam1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary qCMDPRCSParam1 = new Elementary(root,new PackedType(10, 5, true));
	
	/**
	 * Instantiate a new QCMDPRCSParam1 with a default record.
	 * @param configuration the configuration
	 */
	public QCMDPRCSParam1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new QCMDPRCSParam1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public QCMDPRCSParam1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute qCMDPRCSParam1.
	 * @return the qCMDPRCSParam1 attribute reference
	 */
	public ElementaryRangeReference getQCMDPRCSParam1Reference() {
		return qCMDPRCSParam1.getReference();
	}

	/**
	 * Getter for qCMDPRCSParam1 attribute.
	 * @return qCMDPRCSParam1 attribute
	 */
	public BigDecimal getQCMDPRCSParam1() {
		return qCMDPRCSParam1.getValue();
	}

	/**
	 * Setter for qCMDPRCSParam1 attribute.
	 * @param qCMDPRCSParam1 the new value of qCMDPRCSParam1
	 */
	public void setQCMDPRCSParam1(BigDecimal qCMDPRCSParam1) {
		this.qCMDPRCSParam1.setValue(qCMDPRCSParam1);
	}
}
