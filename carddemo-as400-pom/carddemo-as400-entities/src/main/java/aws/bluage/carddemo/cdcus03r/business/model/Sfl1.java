package aws.bluage.carddemo.cdcus03r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Sfl1.
 * 
 * <p>About 'option' field, <br>
 * </p>
 * 
 * <p>About 'custid' field, <br>
 * </p>
 * 
 * <p>About 'firstname' field, <br>
 * </p>
 * 
 * <p>About 'lastname' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Sfl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary option = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary custid = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary firstname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary lastname = new Elementary(root,new AlphanumericType(25)," ");
	
	/**
	 * Instantiate a new Sfl1 with a default record.
	 * @param configuration the configuration
	 */
	public Sfl1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Sfl1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Sfl1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute option.
	 * @return the option attribute reference
	 */
	public ElementaryRangeReference getOptionReference() {
		return option.getReference();
	}

	/**
	 * Getter for option attribute.
	 * @return option attribute
	 */
	public String getOption() {
		return option.getValue();
	}

	/**
	 * Setter for option attribute.
	 * @param option the new value of option
	 */
	public void setOption(String option) {
		this.option.setValue(option);
	}
	/**
	 * Gets the reference for attribute custid.
	 * @return the custid attribute reference
	 */
	public ElementaryRangeReference getCustidReference() {
		return custid.getReference();
	}

	/**
	 * Getter for custid attribute.
	 * @return custid attribute
	 */
	public String getCustid() {
		return custid.getValue();
	}

	/**
	 * Setter for custid attribute.
	 * @param custid the new value of custid
	 */
	public void setCustid(String custid) {
		this.custid.setValue(custid);
	}
	/**
	 * Gets the reference for attribute firstname.
	 * @return the firstname attribute reference
	 */
	public ElementaryRangeReference getFirstnameReference() {
		return firstname.getReference();
	}

	/**
	 * Getter for firstname attribute.
	 * @return firstname attribute
	 */
	public String getFirstname() {
		return firstname.getValue();
	}

	/**
	 * Setter for firstname attribute.
	 * @param firstname the new value of firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname.setValue(firstname);
	}
	/**
	 * Gets the reference for attribute lastname.
	 * @return the lastname attribute reference
	 */
	public ElementaryRangeReference getLastnameReference() {
		return lastname.getReference();
	}

	/**
	 * Getter for lastname attribute.
	 * @return lastname attribute
	 */
	public String getLastname() {
		return lastname.getValue();
	}

	/**
	 * Setter for lastname attribute.
	 * @param lastname the new value of lastname
	 */
	public void setLastname(String lastname) {
		this.lastname.setValue(lastname);
	}
}
