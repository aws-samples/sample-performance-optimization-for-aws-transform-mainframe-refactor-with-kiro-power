package aws.bluage.carddemo.cdtrn01r.business.model;

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
 * Data simplifier entity Header.
 * 
 * <p>About 'pgmname' field, <br>
 * </p>
 * 
 * <p>About 'd1posto' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Header extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pgmname = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary d1posto = new Elementary(root,new ZonedType(15, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Header with a default record.
	 * @param configuration the configuration
	 */
	public Header(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Header bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Header(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute pgmname.
	 * @return the pgmname attribute reference
	 */
	public ElementaryRangeReference getPgmnameReference() {
		return pgmname.getReference();
	}

	/**
	 * Getter for pgmname attribute.
	 * @return pgmname attribute
	 */
	public String getPgmname() {
		return pgmname.getValue();
	}

	/**
	 * Setter for pgmname attribute.
	 * @param pgmname the new value of pgmname
	 */
	public void setPgmname(String pgmname) {
		this.pgmname.setValue(pgmname);
	}
	/**
	 * Gets the reference for attribute d1posto.
	 * @return the d1posto attribute reference
	 */
	public ElementaryRangeReference getD1postoReference() {
		return d1posto.getReference();
	}

	/**
	 * Getter for d1posto attribute.
	 * @return d1posto attribute
	 */
	public long getD1posto() {
		return d1posto.getValue();
	}

	/**
	 * Setter for d1posto attribute.
	 * @param d1posto the new value of d1posto
	 */
	public void setD1posto(long d1posto) {
		this.d1posto.setValue(d1posto);
	}
}
