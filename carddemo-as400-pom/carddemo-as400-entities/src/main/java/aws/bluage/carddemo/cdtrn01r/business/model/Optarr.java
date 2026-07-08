package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Optarr.
 * 
 * <p>About 'array' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.array
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Optarr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group array = new Group(root,new FixedArray(9999));
	private final Elementary sflkey = new Elementary(array,new AlphanumericType(15)," ");
	private final Elementary sflopt = new Elementary(array,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Optarr with a default record.
	 * @param configuration the configuration
	 */
	public Optarr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Optarr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Optarr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Indexed getter for group array attribute.
	 * @param indexes the indexes
	 * @return array attribute
	 */
	public RangeReference getItemFromArrayReference(Integer... indexes){
		return array.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group array attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromArray( RangeReference rangeReference, Integer... indexes){
		array.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group array attribute.
	 * @return  the collection size for attribute array
	 */
	public int getArraySize(){	
		return array.getRepetition().getCount();
	}	
	
	/**
	 * Gets the reference for attribute array.
	 * @return the array attribute reference
	 */
	public RangeReference getArrayReference() {
		return array.getReference();
	}			
	
	/**
	 * Indexed getter for sflkey attribute.
	 * @param indexes the indexes
	 * @return sflkey attribute
	 */
	public ElementaryRangeReference getItemFromSflkeyReference(Integer... indexes) {
		return sflkey.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for sflkey attribute.
	 * @param indexes the indexes
	 * @return sflkey attribute
	 */
	public String getItemFromSflkey(Integer... indexes) {
		return sflkey.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for sflkey attribute.
	 * @param sflkey the new value of sflkey for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSflkey(String sflkey,Integer... indexes) {
		this.sflkey.setIndexedValue(sflkey,indexes);
	}
	
	/**
	 * Collection size getter for sflkey attribute.
	 * @return  the collection size for attributesflkey
	 */
	public int getSflkeySize(){
		return sflkey.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for sflkey attribute.
	 * @param indexes the indexes
	 * @return sflkey attribute
	 */
	public ElementaryRangeReference getSflkeyReference() {
		return sflkey.getReference();
	}
	
	/**
	 * Indexed getter for sflkey attribute.
	 * @param indexes the indexes
	 * @return sflkey attribute
	 */
	public String getSflkey() {
		return sflkey.getValue();
	}
	
	/**
	 * Indexed setter for sflkey attribute.
	 * @param sflkey the new value of sflkey for given indexes
	 * @param indexes the indexes
	 */
	public void setSflkey(String sflkey) {
		this.sflkey.setValue(sflkey);
	}
	
	/**
	 * Indexed getter for sflopt attribute.
	 * @param indexes the indexes
	 * @return sflopt attribute
	 */
	public ElementaryRangeReference getItemFromSfloptReference(Integer... indexes) {
		return sflopt.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for sflopt attribute.
	 * @param indexes the indexes
	 * @return sflopt attribute
	 */
	public String getItemFromSflopt(Integer... indexes) {
		return sflopt.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for sflopt attribute.
	 * @param sflopt the new value of sflopt for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSflopt(String sflopt,Integer... indexes) {
		this.sflopt.setIndexedValue(sflopt,indexes);
	}
	
	/**
	 * Collection size getter for sflopt attribute.
	 * @return  the collection size for attributesflopt
	 */
	public int getSfloptSize(){
		return sflopt.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for sflopt attribute.
	 * @param indexes the indexes
	 * @return sflopt attribute
	 */
	public ElementaryRangeReference getSfloptReference() {
		return sflopt.getReference();
	}
	
	/**
	 * Indexed getter for sflopt attribute.
	 * @param indexes the indexes
	 * @return sflopt attribute
	 */
	public String getSflopt() {
		return sflopt.getValue();
	}
	
	/**
	 * Indexed setter for sflopt attribute.
	 * @param sflopt the new value of sflopt for given indexes
	 * @param indexes the indexes
	 */
	public void setSflopt(String sflopt) {
		this.sflopt.setValue(sflopt);
	}
	
}
