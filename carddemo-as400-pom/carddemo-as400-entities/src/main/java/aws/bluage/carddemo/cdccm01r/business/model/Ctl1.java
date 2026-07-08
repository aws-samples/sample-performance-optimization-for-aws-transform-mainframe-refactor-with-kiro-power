package aws.bluage.carddemo.cdccm01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Ctl1.
 * 
 * <p>About 'drow' field, <br>
 * </p>
 * 
 * <p>About 'dcol' field, <br>
 * </p>
 * 
 * <p>About 'dsflrrn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ctl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary drow = new Elementary(root,new ZonedType(3, 0, true),Short.valueOf("0"));
	private final Elementary dcol = new Elementary(root,new ZonedType(3, 0, true),Short.valueOf("0"));
	private final Elementary dsflrrn = new Elementary(root,new ZonedType(4, 0, true),Short.valueOf("0"));
	
	/**
	 * Instantiate a new Ctl1 with a default record.
	 * @param configuration the configuration
	 */
	public Ctl1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Ctl1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Ctl1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute drow.
	 * @return the drow attribute reference
	 */
	public ElementaryRangeReference getDrowReference() {
		return drow.getReference();
	}

	/**
	 * Getter for drow attribute.
	 * @return drow attribute
	 */
	public int getDrow() {
		return drow.getValue();
	}

	/**
	 * Setter for drow attribute.
	 * @param drow the new value of drow
	 */
	public void setDrow(int drow) {
		this.drow.setValue(drow);
	}
	/**
	 * Gets the reference for attribute dcol.
	 * @return the dcol attribute reference
	 */
	public ElementaryRangeReference getDcolReference() {
		return dcol.getReference();
	}

	/**
	 * Getter for dcol attribute.
	 * @return dcol attribute
	 */
	public int getDcol() {
		return dcol.getValue();
	}

	/**
	 * Setter for dcol attribute.
	 * @param dcol the new value of dcol
	 */
	public void setDcol(int dcol) {
		this.dcol.setValue(dcol);
	}
	/**
	 * Gets the reference for attribute dsflrrn.
	 * @return the dsflrrn attribute reference
	 */
	public ElementaryRangeReference getDsflrrnReference() {
		return dsflrrn.getReference();
	}

	/**
	 * Getter for dsflrrn attribute.
	 * @return dsflrrn attribute
	 */
	public int getDsflrrn() {
		return dsflrrn.getValue();
	}

	/**
	 * Setter for dsflrrn attribute.
	 * @param dsflrrn the new value of dsflrrn
	 */
	public void setDsflrrn(int dsflrrn) {
		this.dsflrrn.setValue(dsflrrn);
	}
}
