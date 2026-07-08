package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Msgsfl.
 * 
 * <p>About 'ssflmsgkey' field, <br>
 * </p>
 * 
 * <p>About 'spgmq' field, <br>
 * </p>
 * 
 * <p>About 'subfilemessageline' field, <br>
 * </p>
 * 
 * <p>About 'subfilesecondmessageline' field, <br>
 * </p>
 * 
 * <p>About 'subfilemessageid' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Msgsfl extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ssflmsgkey = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary spgmq = new Elementary(root,new AlphanumericType(10));
	private final Elementary subfilemessageline = new Elementary(root,new AlphanumericType(76));
	private final Elementary subfilesecondmessageline = new Elementary(root,new AlphanumericType(2924));
	private final Elementary subfilemessageid = new Elementary(root,new AlphanumericType(10));
	
	/**
	 * Instantiate a new Msgsfl with a default record.
	 * @param configuration the configuration
	 */
	public Msgsfl(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Msgsfl bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Msgsfl(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ssflmsgkey.
	 * @return the ssflmsgkey attribute reference
	 */
	public ElementaryRangeReference getSsflmsgkeyReference() {
		return ssflmsgkey.getReference();
	}

	/**
	 * Getter for ssflmsgkey attribute.
	 * @return ssflmsgkey attribute
	 */
	public String getSsflmsgkey() {
		return ssflmsgkey.getValue();
	}

	/**
	 * Setter for ssflmsgkey attribute.
	 * @param ssflmsgkey the new value of ssflmsgkey
	 */
	public void setSsflmsgkey(String ssflmsgkey) {
		this.ssflmsgkey.setValue(ssflmsgkey);
	}
	/**
	 * Gets the reference for attribute spgmq.
	 * @return the spgmq attribute reference
	 */
	public ElementaryRangeReference getSpgmqReference() {
		return spgmq.getReference();
	}

	/**
	 * Getter for spgmq attribute.
	 * @return spgmq attribute
	 */
	public String getSpgmq() {
		return spgmq.getValue();
	}

	/**
	 * Setter for spgmq attribute.
	 * @param spgmq the new value of spgmq
	 */
	public void setSpgmq(String spgmq) {
		this.spgmq.setValue(spgmq);
	}
	/**
	 * Gets the reference for attribute subfilemessageline.
	 * @return the subfilemessageline attribute reference
	 */
	public ElementaryRangeReference getSubfilemessagelineReference() {
		return subfilemessageline.getReference();
	}

	/**
	 * Getter for subfilemessageline attribute.
	 * @return subfilemessageline attribute
	 */
	public String getSubfilemessageline() {
		return subfilemessageline.getValue();
	}

	/**
	 * Setter for subfilemessageline attribute.
	 * @param subfilemessageline the new value of subfilemessageline
	 */
	public void setSubfilemessageline(String subfilemessageline) {
		this.subfilemessageline.setValue(subfilemessageline);
	}
	/**
	 * Gets the reference for attribute subfilesecondmessageline.
	 * @return the subfilesecondmessageline attribute reference
	 */
	public ElementaryRangeReference getSubfilesecondmessagelineReference() {
		return subfilesecondmessageline.getReference();
	}

	/**
	 * Getter for subfilesecondmessageline attribute.
	 * @return subfilesecondmessageline attribute
	 */
	public String getSubfilesecondmessageline() {
		return subfilesecondmessageline.getValue();
	}

	/**
	 * Setter for subfilesecondmessageline attribute.
	 * @param subfilesecondmessageline the new value of subfilesecondmessageline
	 */
	public void setSubfilesecondmessageline(String subfilesecondmessageline) {
		this.subfilesecondmessageline.setValue(subfilesecondmessageline);
	}
	/**
	 * Gets the reference for attribute subfilemessageid.
	 * @return the subfilemessageid attribute reference
	 */
	public ElementaryRangeReference getSubfilemessageidReference() {
		return subfilemessageid.getReference();
	}

	/**
	 * Getter for subfilemessageid attribute.
	 * @return subfilemessageid attribute
	 */
	public String getSubfilemessageid() {
		return subfilemessageid.getValue();
	}

	/**
	 * Setter for subfilemessageid attribute.
	 * @param subfilemessageid the new value of subfilemessageid
	 */
	public void setSubfilemessageid(String subfilemessageid) {
		this.subfilemessageid.setValue(subfilemessageid);
	}
}
