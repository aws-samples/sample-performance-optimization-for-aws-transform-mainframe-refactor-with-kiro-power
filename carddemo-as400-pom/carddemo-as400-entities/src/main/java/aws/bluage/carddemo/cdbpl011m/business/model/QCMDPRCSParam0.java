package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity QCMDPRCSParam0.
 * 
 * <p>About 'qCMDPRCSParam0' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class QCMDPRCSParam0 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary qCMDPRCSParam0 = new Elementary(root,new AlphanumericType(3000));
	
	/**
	 * Instantiate a new QCMDPRCSParam0 with a default record.
	 * @param configuration the configuration
	 */
	public QCMDPRCSParam0(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new QCMDPRCSParam0 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public QCMDPRCSParam0(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute qCMDPRCSParam0.
	 * @return the qCMDPRCSParam0 attribute reference
	 */
	public ElementaryRangeReference getQCMDPRCSParam0Reference() {
		return qCMDPRCSParam0.getReference();
	}

	/**
	 * Getter for qCMDPRCSParam0 attribute.
	 * @return qCMDPRCSParam0 attribute
	 */
	public String getQCMDPRCSParam0() {
		return qCMDPRCSParam0.getValue();
	}

	/**
	 * Setter for qCMDPRCSParam0 attribute.
	 * @param qCMDPRCSParam0 the new value of qCMDPRCSParam0
	 */
	public void setQCMDPRCSParam0(String qCMDPRCSParam0) {
		this.qCMDPRCSParam0.setValue(qCMDPRCSParam0);
	}
}
