package aws.bluage.carddemo.cdcus01r.business.model;

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
 * <p>About 'doption' field, <br>
 * </p>
 * 
 * <p>About 'dcustid' field, <br>
 * </p>
 * 
 * <p>About 'dfirstname' field, <br>
 * </p>
 * 
 * <p>About 'dlastname' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Sfl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary doption = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary dcustid = new Elementary(root,new AlphanumericType(9));
	private final Elementary dfirstname = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary dlastname = new Elementary(root,new AlphanumericType(25)," ");
	
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
	 * Gets the reference for attribute doption.
	 * @return the doption attribute reference
	 */
	public ElementaryRangeReference getDoptionReference() {
		return doption.getReference();
	}

	/**
	 * Getter for doption attribute.
	 * @return doption attribute
	 */
	public String getDoption() {
		return doption.getValue();
	}

	/**
	 * Setter for doption attribute.
	 * @param doption the new value of doption
	 */
	public void setDoption(String doption) {
		this.doption.setValue(doption);
	}
	/**
	 * Gets the reference for attribute dcustid.
	 * @return the dcustid attribute reference
	 */
	public ElementaryRangeReference getDcustidReference() {
		return dcustid.getReference();
	}

	/**
	 * Getter for dcustid attribute.
	 * @return dcustid attribute
	 */
	public String getDcustid() {
		return dcustid.getValue();
	}

	/**
	 * Setter for dcustid attribute.
	 * @param dcustid the new value of dcustid
	 */
	public void setDcustid(String dcustid) {
		this.dcustid.setValue(dcustid);
	}
	/**
	 * Gets the reference for attribute dfirstname.
	 * @return the dfirstname attribute reference
	 */
	public ElementaryRangeReference getDfirstnameReference() {
		return dfirstname.getReference();
	}

	/**
	 * Getter for dfirstname attribute.
	 * @return dfirstname attribute
	 */
	public String getDfirstname() {
		return dfirstname.getValue();
	}

	/**
	 * Setter for dfirstname attribute.
	 * @param dfirstname the new value of dfirstname
	 */
	public void setDfirstname(String dfirstname) {
		this.dfirstname.setValue(dfirstname);
	}
	/**
	 * Gets the reference for attribute dlastname.
	 * @return the dlastname attribute reference
	 */
	public ElementaryRangeReference getDlastnameReference() {
		return dlastname.getReference();
	}

	/**
	 * Getter for dlastname attribute.
	 * @return dlastname attribute
	 */
	public String getDlastname() {
		return dlastname.getValue();
	}

	/**
	 * Setter for dlastname attribute.
	 * @param dlastname the new value of dlastname
	 */
	public void setDlastname(String dlastname) {
		this.dlastname.setValue(dlastname);
	}
}
