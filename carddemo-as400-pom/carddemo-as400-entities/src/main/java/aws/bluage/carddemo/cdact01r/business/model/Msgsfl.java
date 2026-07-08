package aws.bluage.carddemo.cdact01r.business.model;

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
 * <p>About 'sflmsgkey' field, <br>
 * </p>
 * 
 * <p>About 'pgmq' field, <br>
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
	private final Elementary sflmsgkey = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary pgmq = new Elementary(root,new AlphanumericType(10));
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
	 * Gets the reference for attribute sflmsgkey.
	 * @return the sflmsgkey attribute reference
	 */
	public ElementaryRangeReference getSflmsgkeyReference() {
		return sflmsgkey.getReference();
	}

	/**
	 * Getter for sflmsgkey attribute.
	 * @return sflmsgkey attribute
	 */
	public String getSflmsgkey() {
		return sflmsgkey.getValue();
	}

	/**
	 * Setter for sflmsgkey attribute.
	 * @param sflmsgkey the new value of sflmsgkey
	 */
	public void setSflmsgkey(String sflmsgkey) {
		this.sflmsgkey.setValue(sflmsgkey);
	}
	/**
	 * Gets the reference for attribute pgmq.
	 * @return the pgmq attribute reference
	 */
	public ElementaryRangeReference getPgmqReference() {
		return pgmq.getReference();
	}

	/**
	 * Getter for pgmq attribute.
	 * @return pgmq attribute
	 */
	public String getPgmq() {
		return pgmq.getValue();
	}

	/**
	 * Setter for pgmq attribute.
	 * @param pgmq the new value of pgmq
	 */
	public void setPgmq(String pgmq) {
		this.pgmq.setValue(pgmq);
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
