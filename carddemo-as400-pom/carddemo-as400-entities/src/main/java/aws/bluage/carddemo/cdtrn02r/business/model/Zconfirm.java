package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Zconfirm.
 * 
 * <p>About 'syesno' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Zconfirm extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary syesno = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Zconfirm with a default record.
	 * @param configuration the configuration
	 */
	public Zconfirm(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Zconfirm bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Zconfirm(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute syesno.
	 * @return the syesno attribute reference
	 */
	public ElementaryRangeReference getSyesnoReference() {
		return syesno.getReference();
	}

	/**
	 * Getter for syesno attribute.
	 * @return syesno attribute
	 */
	public String getSyesno() {
		return syesno.getValue();
	}

	/**
	 * Setter for syesno attribute.
	 * @param syesno the new value of syesno
	 */
	public void setSyesno(String syesno) {
		this.syesno.setValue(syesno);
	}
}
