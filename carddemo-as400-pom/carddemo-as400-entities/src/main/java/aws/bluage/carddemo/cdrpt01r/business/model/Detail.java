package aws.bluage.carddemo.cdrpt01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Detail.
 * 
 * <p>About 'racct' field, <br>
 * </p>
 * 
 * <p>About 'rcus' field, <br>
 * </p>
 * 
 * <p>About 'rtype' field, <br>
 * </p>
 * 
 * <p>About 'rcheck' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Detail extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary racct = new Elementary(root,new ZonedType(12, 0, true),new BigDecimal("0"));
	private final Elementary rcus = new Elementary(root,new ZonedType(9, 0, true),Integer.valueOf("0"));
	private final Elementary rtype = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary rcheck = new Elementary(root,new AlphanumericType(10)," ");
	
	/**
	 * Instantiate a new Detail with a default record.
	 * @param configuration the configuration
	 */
	public Detail(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Detail bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Detail(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute racct.
	 * @return the racct attribute reference
	 */
	public ElementaryRangeReference getRacctReference() {
		return racct.getReference();
	}

	/**
	 * Getter for racct attribute.
	 * @return racct attribute
	 */
	public long getRacct() {
		return racct.getValue();
	}

	/**
	 * Setter for racct attribute.
	 * @param racct the new value of racct
	 */
	public void setRacct(long racct) {
		this.racct.setValue(racct);
	}
	/**
	 * Gets the reference for attribute rcus.
	 * @return the rcus attribute reference
	 */
	public ElementaryRangeReference getRcusReference() {
		return rcus.getReference();
	}

	/**
	 * Getter for rcus attribute.
	 * @return rcus attribute
	 */
	public int getRcus() {
		return rcus.getValue();
	}

	/**
	 * Setter for rcus attribute.
	 * @param rcus the new value of rcus
	 */
	public void setRcus(int rcus) {
		this.rcus.setValue(rcus);
	}
	/**
	 * Gets the reference for attribute rtype.
	 * @return the rtype attribute reference
	 */
	public ElementaryRangeReference getRtypeReference() {
		return rtype.getReference();
	}

	/**
	 * Getter for rtype attribute.
	 * @return rtype attribute
	 */
	public String getRtype() {
		return rtype.getValue();
	}

	/**
	 * Setter for rtype attribute.
	 * @param rtype the new value of rtype
	 */
	public void setRtype(String rtype) {
		this.rtype.setValue(rtype);
	}
	/**
	 * Gets the reference for attribute rcheck.
	 * @return the rcheck attribute reference
	 */
	public ElementaryRangeReference getRcheckReference() {
		return rcheck.getReference();
	}

	/**
	 * Getter for rcheck attribute.
	 * @return rcheck attribute
	 */
	public String getRcheck() {
		return rcheck.getValue();
	}

	/**
	 * Setter for rcheck attribute.
	 * @param rcheck the new value of rcheck
	 */
	public void setRcheck(String rcheck) {
		this.rcheck.setValue(rcheck);
	}
}
