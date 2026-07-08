package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Atct_root.
 * 
 * <p>About 'atct' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Atct_root extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary atct = new Elementary(root,new FixedArray(7),new AlphanumericType(30));
	
	/**
	 * Instantiate a new Atct_root with a default record.
	 * @param configuration the configuration
	 */
	public Atct_root(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Atct_root bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Atct_root(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Indexed getter for atct attribute.
	 * @param indexes the indexes
	 * @return atct attribute
	 */
	public ElementaryRangeReference getItemFromAtctReference(Integer... indexes) {
		return atct.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for atct attribute.
	 * @param indexes the indexes
	 * @return atct attribute
	 */
	public String getItemFromAtct(Integer... indexes) {
		return atct.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for atct attribute.
	 * @param atct the new value of atct for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromAtct(String atct,Integer... indexes) {
		this.atct.setIndexedValue(atct,indexes);
	}
	
	/**
	 * Collection size getter for atct attribute.
	 * @return  the collection size for attributeatct
	 */
	public int getAtctSize(){
		return atct.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for atct attribute.
	 * @param indexes the indexes
	 * @return atct attribute
	 */
	public ElementaryRangeReference getAtctReference() {
		return atct.getReference();
	}
	
	/**
	 * Indexed getter for atct attribute.
	 * @param indexes the indexes
	 * @return atct attribute
	 */
	public String getAtct() {
		return atct.getValue();
	}
	
	/**
	 * Indexed setter for atct attribute.
	 * @param atct the new value of atct for given indexes
	 * @param indexes the indexes
	 */
	public void setAtct(String atct) {
		this.atct.setValue(atct);
	}
	
}
