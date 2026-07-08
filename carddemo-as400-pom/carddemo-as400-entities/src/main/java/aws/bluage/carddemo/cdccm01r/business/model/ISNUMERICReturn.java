package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity ISNUMERICReturn.
 * 
 * <p>About 'iSNUMERICReturn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ISNUMERICReturn extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary iSNUMERICReturn = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Instantiate a new ISNUMERICReturn with a default record.
	 * @param configuration the configuration
	 */
	public ISNUMERICReturn(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new ISNUMERICReturn bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ISNUMERICReturn(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute iSNUMERICReturn.
	 * @return the iSNUMERICReturn attribute reference
	 */
	public ElementaryRangeReference getISNUMERICReturnReference() {
		return iSNUMERICReturn.getReference();
	}

	/**
	 * Getter for iSNUMERICReturn attribute.
	 * @return iSNUMERICReturn attribute
	 */
	public String getISNUMERICReturn() {
		return iSNUMERICReturn.getValue();
	}

	/**
	 * Setter for iSNUMERICReturn attribute.
	 * @param iSNUMERICReturn the new value of iSNUMERICReturn
	 */
	public void setISNUMERICReturn(String iSNUMERICReturn) {
		this.iSNUMERICReturn.setValue(iSNUMERICReturn);
	}
}
