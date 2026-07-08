package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wmsgdata.
 * 
 * <p>About 'wmsgdata' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wmsgdata extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wmsgdata = new Elementary(root,new AlphanumericType(256)," ");
	
	/**
	 * Instantiate a new Wmsgdata with a default record.
	 * @param configuration the configuration
	 */
	public Wmsgdata(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wmsgdata bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wmsgdata(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wmsgdata.
	 * @return the wmsgdata attribute reference
	 */
	public ElementaryRangeReference getWmsgdataReference() {
		return wmsgdata.getReference();
	}

	/**
	 * Getter for wmsgdata attribute.
	 * @return wmsgdata attribute
	 */
	public String getWmsgdata() {
		return wmsgdata.getValue();
	}

	/**
	 * Setter for wmsgdata attribute.
	 * @param wmsgdata the new value of wmsgdata
	 */
	public void setWmsgdata(String wmsgdata) {
		this.wmsgdata.setValue(wmsgdata);
	}
}
