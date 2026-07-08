package aws.bluage.carddemo.cdcus01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Delerrwin.
 * 
 * <p>About 'dcustid' field, <br>
 * </p>
 * 
 * <p>About 'dactid' field, <br>
 * </p>
 * 
 * <p>About 'derrdelw' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Delerrwin extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dcustid = new Elementary(root,new AlphanumericType(9));
	private final Elementary dactid = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary derrdelw = new Elementary(root,new AlphanumericType(50)," ");
	
	/**
	 * Instantiate a new Delerrwin with a default record.
	 * @param configuration the configuration
	 */
	public Delerrwin(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Delerrwin bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Delerrwin(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
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
	 * Gets the reference for attribute dactid.
	 * @return the dactid attribute reference
	 */
	public ElementaryRangeReference getDactidReference() {
		return dactid.getReference();
	}

	/**
	 * Getter for dactid attribute.
	 * @return dactid attribute
	 */
	public String getDactid() {
		return dactid.getValue();
	}

	/**
	 * Setter for dactid attribute.
	 * @param dactid the new value of dactid
	 */
	public void setDactid(String dactid) {
		this.dactid.setValue(dactid);
	}
	/**
	 * Gets the reference for attribute derrdelw.
	 * @return the derrdelw attribute reference
	 */
	public ElementaryRangeReference getDerrdelwReference() {
		return derrdelw.getReference();
	}

	/**
	 * Getter for derrdelw attribute.
	 * @return derrdelw attribute
	 */
	public String getDerrdelw() {
		return derrdelw.getValue();
	}

	/**
	 * Setter for derrdelw attribute.
	 * @param derrdelw the new value of derrdelw
	 */
	public void setDerrdelw(String derrdelw) {
		this.derrdelw.setValue(derrdelw);
	}
}
