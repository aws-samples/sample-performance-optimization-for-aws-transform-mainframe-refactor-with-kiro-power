package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Ctl1.
 * 
 * <p>About 'row' field, <br>
 * </p>
 * 
 * <p>About 'col' field, <br>
 * </p>
 * 
 * <p>About 'csrrec' field, <br>
 * </p>
 * 
 * <p>About 'csrfld' field, <br>
 * </p>
 * 
 * <p>About 'csrpos' field, <br>
 * </p>
 * 
 * <p>About 'sflrrn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Ctl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary row = new Elementary(root,new ZonedType(3, 0, true),Short.valueOf("0"));
	private final Elementary col = new Elementary(root,new ZonedType(3, 0, true),Short.valueOf("0"));
	private final Elementary csrrec = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary csrfld = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary csrpos = new Elementary(root,new ZonedType(4, 0, true),Short.valueOf("0"));
	private final Elementary sflrrn = new Elementary(root,new ZonedType(4, 0, true),Short.valueOf("0"));
	
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
	 * Gets the reference for attribute row.
	 * @return the row attribute reference
	 */
	public ElementaryRangeReference getRowReference() {
		return row.getReference();
	}

	/**
	 * Getter for row attribute.
	 * @return row attribute
	 */
	public int getRow() {
		return row.getValue();
	}

	/**
	 * Setter for row attribute.
	 * @param row the new value of row
	 */
	public void setRow(int row) {
		this.row.setValue(row);
	}
	/**
	 * Gets the reference for attribute col.
	 * @return the col attribute reference
	 */
	public ElementaryRangeReference getColReference() {
		return col.getReference();
	}

	/**
	 * Getter for col attribute.
	 * @return col attribute
	 */
	public int getCol() {
		return col.getValue();
	}

	/**
	 * Setter for col attribute.
	 * @param col the new value of col
	 */
	public void setCol(int col) {
		this.col.setValue(col);
	}
	/**
	 * Gets the reference for attribute csrrec.
	 * @return the csrrec attribute reference
	 */
	public ElementaryRangeReference getCsrrecReference() {
		return csrrec.getReference();
	}

	/**
	 * Getter for csrrec attribute.
	 * @return csrrec attribute
	 */
	public String getCsrrec() {
		return csrrec.getValue();
	}

	/**
	 * Setter for csrrec attribute.
	 * @param csrrec the new value of csrrec
	 */
	public void setCsrrec(String csrrec) {
		this.csrrec.setValue(csrrec);
	}
	/**
	 * Gets the reference for attribute csrfld.
	 * @return the csrfld attribute reference
	 */
	public ElementaryRangeReference getCsrfldReference() {
		return csrfld.getReference();
	}

	/**
	 * Getter for csrfld attribute.
	 * @return csrfld attribute
	 */
	public String getCsrfld() {
		return csrfld.getValue();
	}

	/**
	 * Setter for csrfld attribute.
	 * @param csrfld the new value of csrfld
	 */
	public void setCsrfld(String csrfld) {
		this.csrfld.setValue(csrfld);
	}
	/**
	 * Gets the reference for attribute csrpos.
	 * @return the csrpos attribute reference
	 */
	public ElementaryRangeReference getCsrposReference() {
		return csrpos.getReference();
	}

	/**
	 * Getter for csrpos attribute.
	 * @return csrpos attribute
	 */
	public int getCsrpos() {
		return csrpos.getValue();
	}

	/**
	 * Setter for csrpos attribute.
	 * @param csrpos the new value of csrpos
	 */
	public void setCsrpos(int csrpos) {
		this.csrpos.setValue(csrpos);
	}
	/**
	 * Gets the reference for attribute sflrrn.
	 * @return the sflrrn attribute reference
	 */
	public ElementaryRangeReference getSflrrnReference() {
		return sflrrn.getReference();
	}

	/**
	 * Getter for sflrrn attribute.
	 * @return sflrrn attribute
	 */
	public int getSflrrn() {
		return sflrrn.getValue();
	}

	/**
	 * Setter for sflrrn attribute.
	 * @param sflrrn the new value of sflrrn
	 */
	public void setSflrrn(int sflrrn) {
		this.sflrrn.setValue(sflrrn);
	}
}
