package aws.bluage.carddemo.cdact02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.SizePrefixedAlphanumericType;
/**
 * Data simplifier entity Teststring.
 * 
 * <p>About 'teststring' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Teststring extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary teststring = new Elementary(root,new SizePrefixedAlphanumericType(1000, 2),"");
	
	/**
	 * Instantiate a new Teststring with a default record.
	 * @param configuration the configuration
	 */
	public Teststring(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Teststring bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Teststring(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute teststring.
	 * @return the teststring attribute reference
	 */
	public ElementaryRangeReference getTeststringReference() {
		return teststring.getReference();
	}

	/**
	 * Getter for teststring attribute.
	 * @return teststring attribute
	 */
	public String getTeststring() {
		return teststring.getValue();
	}

	/**
	 * Setter for teststring attribute.
	 * @param teststring the new value of teststring
	 */
	public void setTeststring(String teststring) {
		this.teststring.setValue(teststring);
	}
}
