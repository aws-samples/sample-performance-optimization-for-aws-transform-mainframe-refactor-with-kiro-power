package aws.bluage.carddemo.cdtrn03r.business.model;

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
 * <p>About 'dyesno' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Zconfirm extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dyesno = new Elementary(root,new AlphanumericType(1)," ");
	
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
	 * Gets the reference for attribute dyesno.
	 * @return the dyesno attribute reference
	 */
	public ElementaryRangeReference getDyesnoReference() {
		return dyesno.getReference();
	}

	/**
	 * Getter for dyesno attribute.
	 * @return dyesno attribute
	 */
	public String getDyesno() {
		return dyesno.getValue();
	}

	/**
	 * Setter for dyesno attribute.
	 * @param dyesno the new value of dyesno
	 */
	public void setDyesno(String dyesno) {
		this.dyesno.setValue(dyesno);
	}
}
