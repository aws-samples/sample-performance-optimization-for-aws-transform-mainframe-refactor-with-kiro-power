package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Pagesize.
 * 
 * <p>About 'pagesize' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Pagesize extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pagesize = new Elementary(root,new PackedType(2, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Pagesize with a default record.
	 * @param configuration the configuration
	 */
	public Pagesize(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Pagesize bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Pagesize(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pagesize.
	 * @return the pagesize attribute reference
	 */
	public ElementaryRangeReference getPagesizeReference() {
		return pagesize.getReference();
	}

	/**
	 * Getter for pagesize attribute.
	 * @return pagesize attribute
	 */
	public int getPagesize() {
		return pagesize.getValue();
	}

	/**
	 * Setter for pagesize attribute.
	 * @param pagesize the new value of pagesize
	 */
	public void setPagesize(int pagesize) {
		this.pagesize.setValue(pagesize);
	}
}
