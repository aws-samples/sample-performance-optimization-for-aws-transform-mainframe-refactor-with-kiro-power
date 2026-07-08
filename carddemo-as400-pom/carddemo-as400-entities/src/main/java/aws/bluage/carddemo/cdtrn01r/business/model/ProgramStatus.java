package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity ProgramStatus.
 * 
 * <p>About 'wprogramname' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ProgramStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wprogramname = new Elementary(root,new AlphanumericType(10),"Cdtrn01r");
	
	/**
	 * Instantiate a new ProgramStatus with a default record.
	 * @param configuration the configuration
	 */
	public ProgramStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new ProgramStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ProgramStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wprogramname.
	 * @return the wprogramname attribute reference
	 */
	public ElementaryRangeReference getWprogramnameReference() {
		return wprogramname.getReference();
	}

	/**
	 * Getter for wprogramname attribute.
	 * @return wprogramname attribute
	 */
	public String getWprogramname() {
		return wprogramname.getValue();
	}

	/**
	 * Setter for wprogramname attribute.
	 * @param wprogramname the new value of wprogramname
	 */
	public void setWprogramname(String wprogramname) {
		this.wprogramname.setValue(wprogramname);
	}
}
