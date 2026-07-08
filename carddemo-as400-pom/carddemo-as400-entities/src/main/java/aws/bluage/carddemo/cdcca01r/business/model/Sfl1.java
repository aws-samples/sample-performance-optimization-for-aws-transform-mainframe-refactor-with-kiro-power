package aws.bluage.carddemo.cdcca01r.business.model;

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
 * <p>About 'activity' field, <br>
 * </p>
 * 
 * <p>About 'dess' field, <br>
 * </p>
 * 
 * <p>About 'ccauser' field, <br>
 * </p>
 * 
 * <p>About 'ccatmstamp' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Sfl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary activity = new Elementary(root,new AlphanumericType(5)," ");
	private final Elementary dess = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary ccauser = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary ccatmstamp = new Elementary(root,new AlphanumericType(26),"0001-01-01-00.00.00.000000");
	
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
	 * Gets the reference for attribute activity.
	 * @return the activity attribute reference
	 */
	public ElementaryRangeReference getActivityReference() {
		return activity.getReference();
	}

	/**
	 * Getter for activity attribute.
	 * @return activity attribute
	 */
	public String getActivity() {
		return activity.getValue();
	}

	/**
	 * Setter for activity attribute.
	 * @param activity the new value of activity
	 */
	public void setActivity(String activity) {
		this.activity.setValue(activity);
	}
	/**
	 * Gets the reference for attribute dess.
	 * @return the dess attribute reference
	 */
	public ElementaryRangeReference getDessReference() {
		return dess.getReference();
	}

	/**
	 * Getter for dess attribute.
	 * @return dess attribute
	 */
	public String getDess() {
		return dess.getValue();
	}

	/**
	 * Setter for dess attribute.
	 * @param dess the new value of dess
	 */
	public void setDess(String dess) {
		this.dess.setValue(dess);
	}
	/**
	 * Gets the reference for attribute ccauser.
	 * @return the ccauser attribute reference
	 */
	public ElementaryRangeReference getCcauserReference() {
		return ccauser.getReference();
	}

	/**
	 * Getter for ccauser attribute.
	 * @return ccauser attribute
	 */
	public String getCcauser() {
		return ccauser.getValue();
	}

	/**
	 * Setter for ccauser attribute.
	 * @param ccauser the new value of ccauser
	 */
	public void setCcauser(String ccauser) {
		this.ccauser.setValue(ccauser);
	}
	/**
	 * Gets the reference for attribute ccatmstamp.
	 * @return the ccatmstamp attribute reference
	 */
	public ElementaryRangeReference getCcatmstampReference() {
		return ccatmstamp.getReference();
	}

	/**
	 * Getter for ccatmstamp attribute.
	 * @return ccatmstamp attribute
	 */
	public String getCcatmstamp() {
		return ccatmstamp.getValue();
	}

	/**
	 * Setter for ccatmstamp attribute.
	 * @param ccatmstamp the new value of ccatmstamp
	 */
	public void setCcatmstamp(String ccatmstamp) {
		this.ccatmstamp.setValue(ccatmstamp);
	}
}
