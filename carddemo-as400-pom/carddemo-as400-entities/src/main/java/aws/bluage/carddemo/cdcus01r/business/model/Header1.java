package aws.bluage.carddemo.cdcus01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Header1.
 * 
 * <p>About 'dpgmname' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Header1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dpgmname = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Header1 with a default record.
	 * @param configuration the configuration
	 */
	public Header1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Header1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Header1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dpgmname.
	 * @return the dpgmname attribute reference
	 */
	public ElementaryRangeReference getDpgmnameReference() {
		return dpgmname.getReference();
	}

	/**
	 * Getter for dpgmname attribute.
	 * @return dpgmname attribute
	 */
	public String getDpgmname() {
		return dpgmname.getValue();
	}

	/**
	 * Setter for dpgmname attribute.
	 * @param dpgmname the new value of dpgmname
	 */
	public void setDpgmname(String dpgmname) {
		this.dpgmname.setValue(dpgmname);
	}
}
