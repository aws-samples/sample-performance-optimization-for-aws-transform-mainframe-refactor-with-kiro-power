package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Pmtarr.
 * 
 * <p>About 'array' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.array
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Pmtarr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group array = new Group(root,new FixedArray(16));
	private final Elementary sfltrn = new Elementary(array,new PackedType(15, 0, true),new BigDecimal("0"));
	private final Elementary sflccm = new Elementary(array,new PackedType(16, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Pmtarr with a default record.
	 * @param configuration the configuration
	 */
	public Pmtarr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pmtarr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pmtarr(Configuration configuration, RecordAdaptable record) {
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
	 * Indexed getter for sfltrn attribute.
	 * @param indexes the indexes
	 * @return sfltrn attribute
	 */
	public ElementaryRangeReference getItemFromSfltrnReference(Integer... indexes) {
		return sfltrn.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for sfltrn attribute.
	 * @param indexes the indexes
	 * @return sfltrn attribute
	 */
	public long getItemFromSfltrn(Integer... indexes) {
		return sfltrn.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for sfltrn attribute.
	 * @param sfltrn the new value of sfltrn for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSfltrn(long sfltrn,Integer... indexes) {
		this.sfltrn.setIndexedValue(sfltrn,indexes);
	}
	
	/**
	 * Collection size getter for sfltrn attribute.
	 * @return  the collection size for attributesfltrn
	 */
	public int getSfltrnSize(){
		return sfltrn.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for sfltrn attribute.
	 * @param indexes the indexes
	 * @return sfltrn attribute
	 */
	public ElementaryRangeReference getSfltrnReference() {
		return sfltrn.getReference();
	}
	
	/**
	 * Indexed getter for sfltrn attribute.
	 * @param indexes the indexes
	 * @return sfltrn attribute
	 */
	public long getSfltrn() {
		return sfltrn.getValue();
	}
	
	/**
	 * Indexed setter for sfltrn attribute.
	 * @param sfltrn the new value of sfltrn for given indexes
	 * @param indexes the indexes
	 */
	public void setSfltrn(long sfltrn) {
		this.sfltrn.setValue(sfltrn);
	}
	
	/**
	 * Indexed getter for sflccm attribute.
	 * @param indexes the indexes
	 * @return sflccm attribute
	 */
	public ElementaryRangeReference getItemFromSflccmReference(Integer... indexes) {
		return sflccm.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for sflccm attribute.
	 * @param indexes the indexes
	 * @return sflccm attribute
	 */
	public long getItemFromSflccm(Integer... indexes) {
		return sflccm.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for sflccm attribute.
	 * @param sflccm the new value of sflccm for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSflccm(long sflccm,Integer... indexes) {
		this.sflccm.setIndexedValue(sflccm,indexes);
	}
	
	/**
	 * Collection size getter for sflccm attribute.
	 * @return  the collection size for attributesflccm
	 */
	public int getSflccmSize(){
		return sflccm.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for sflccm attribute.
	 * @param indexes the indexes
	 * @return sflccm attribute
	 */
	public ElementaryRangeReference getSflccmReference() {
		return sflccm.getReference();
	}
	
	/**
	 * Indexed getter for sflccm attribute.
	 * @param indexes the indexes
	 * @return sflccm attribute
	 */
	public long getSflccm() {
		return sflccm.getValue();
	}
	
	/**
	 * Indexed setter for sflccm attribute.
	 * @param sflccm the new value of sflccm for given indexes
	 * @param indexes the indexes
	 */
	public void setSflccm(long sflccm) {
		this.sflccm.setValue(sflccm);
	}
	
}
