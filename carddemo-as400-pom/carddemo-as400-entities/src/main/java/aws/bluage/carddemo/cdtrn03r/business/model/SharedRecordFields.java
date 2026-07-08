package aws.bluage.carddemo.cdtrn03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity SharedRecordFields.
 * 
 * <p>About 'cardnum' field, <br>
 * </p>
 * 
 * <p>About 'dpgmq' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class SharedRecordFields extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	private final Elementary dpgmq = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new SharedRecordFields with a default record.
	 * @param configuration the configuration
	 */
	public SharedRecordFields(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new SharedRecordFields bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public SharedRecordFields(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cardnum.
	 * @return the cardnum attribute reference
	 */
	public ElementaryRangeReference getCardnumReference() {
		return cardnum.getReference();
	}

	/**
	 * Getter for cardnum attribute.
	 * @return cardnum attribute
	 */
	public long getCardnum() {
		return cardnum.getValue();
	}

	/**
	 * Setter for cardnum attribute.
	 * @param cardnum the new value of cardnum
	 */
	public void setCardnum(long cardnum) {
		this.cardnum.setValue(cardnum);
	}
	/**
	 * Gets the reference for attribute dpgmq.
	 * @return the dpgmq attribute reference
	 */
	public ElementaryRangeReference getDpgmqReference() {
		return dpgmq.getReference();
	}

	/**
	 * Getter for dpgmq attribute.
	 * @return dpgmq attribute
	 */
	public String getDpgmq() {
		return dpgmq.getValue();
	}

	/**
	 * Setter for dpgmq attribute.
	 * @param dpgmq the new value of dpgmq
	 */
	public void setDpgmq(String dpgmq) {
		this.dpgmq.setValue(dpgmq);
	}
}
