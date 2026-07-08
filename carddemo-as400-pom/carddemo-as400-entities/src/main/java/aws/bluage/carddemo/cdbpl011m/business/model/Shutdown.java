package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Shutdown.
 * 
 * <p>About 'shutdown' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Shutdown extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary shutdown = new Elementary(root,new PackedType(1, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Shutdown with a default record.
	 * @param configuration the configuration
	 */
	public Shutdown(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Shutdown bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Shutdown(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute shutdown.
	 * @return the shutdown attribute reference
	 */
	public ElementaryRangeReference getShutdownReference() {
		return shutdown.getReference();
	}

	/**
	 * Getter for shutdown attribute.
	 * @return shutdown attribute
	 */
	public int getShutdown() {
		return shutdown.getValue();
	}

	/**
	 * Setter for shutdown attribute.
	 * @param shutdown the new value of shutdown
	 */
	public void setShutdown(int shutdown) {
		this.shutdown.setValue(shutdown);
	}
}
