package aws.bluage.carddemo.cdcca01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Header1.
 * 
 * <p>About 'pgmname' field, <br>
 * </p>
 * 
 * <p>About 'cardnum' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Header1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary pgmname = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary cardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Header1 with a default record.
	 * @param configuration the configuration
	 */
	public Header1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Header1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Header1(Configuration configuration, RecordAdaptable record) {
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
	 * Gets the reference for attribute cardnum.
	 * @return the cardnum attribute reference
	 */
	public ElementaryRangeReference getCardnumReference() {
		return cardnum.getReference();
	}

	/**
	 * Getter for cardnum attribute.
	 * @return cardnum attribute
	 */
	public long getCardnum() {
		return cardnum.getValue();
	}

	/**
	 * Setter for cardnum attribute.
	 * @param cardnum the new value of cardnum
	 */
	public void setCardnum(long cardnum) {
		this.cardnum.setValue(cardnum);
	}
}
