package aws.bluage.carddemo.cdbpl011m.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity GENAUTSHReturn.
 * 
 * <p>About 'gENAUTSHReturn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class GENAUTSHReturn extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary gENAUTSHReturn = new Elementary(root,new PackedType(18, 0, true));
	
	/**
	 * Instantiate a new GENAUTSHReturn with a default record.
	 * @param configuration the configuration
	 */
	public GENAUTSHReturn(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new GENAUTSHReturn bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public GENAUTSHReturn(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute gENAUTSHReturn.
	 * @return the gENAUTSHReturn attribute reference
	 */
	public ElementaryRangeReference getGENAUTSHReturnReference() {
		return gENAUTSHReturn.getReference();
	}

	/**
	 * Getter for gENAUTSHReturn attribute.
	 * @return gENAUTSHReturn attribute
	 */
	public long getGENAUTSHReturn() {
		return gENAUTSHReturn.getValue();
	}

	/**
	 * Setter for gENAUTSHReturn attribute.
	 * @param gENAUTSHReturn the new value of gENAUTSHReturn
	 */
	public void setGENAUTSHReturn(long gENAUTSHReturn) {
		this.gENAUTSHReturn.setValue(gENAUTSHReturn);
	}
}
