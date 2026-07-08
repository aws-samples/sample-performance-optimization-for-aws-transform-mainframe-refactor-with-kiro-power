package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Wcallstkent.
 * 
 * <p>About 'wcallstkent' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Wcallstkent extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wcallstkent = new Elementary(root,new AlphanumericType(10),"*");
	
	/**
	 * Instantiate a new Wcallstkent with a default record.
	 * @param configuration the configuration
	 */
	public Wcallstkent(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Wcallstkent bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Wcallstkent(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wcallstkent.
	 * @return the wcallstkent attribute reference
	 */
	public ElementaryRangeReference getWcallstkentReference() {
		return wcallstkent.getReference();
	}

	/**
	 * Getter for wcallstkent attribute.
	 * @return wcallstkent attribute
	 */
	public String getWcallstkent() {
		return wcallstkent.getValue();
	}

	/**
	 * Setter for wcallstkent attribute.
	 * @param wcallstkent the new value of wcallstkent
	 */
	public void setWcallstkent(String wcallstkent) {
		this.wcallstkent.setValue(wcallstkent);
	}
}
