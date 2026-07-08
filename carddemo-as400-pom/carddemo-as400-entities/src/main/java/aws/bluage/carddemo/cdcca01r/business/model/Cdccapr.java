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
 * Data simplifier entity Cdccapr.
 * 
 * <p>About 'r1shcardnum' field, <br>
 * </p>
 * 
 * <p>About 'r1shccaseqno' field, <br>
 * </p>
 * 
 * <p>About 'r1shactivity' field, <br>
 * </p>
 * 
 * <p>About 'r1shdess' field, <br>
 * </p>
 * 
 * <p>About 'r1shccauser' field, <br>
 * </p>
 * 
 * <p>About 'r1shccatmstamp' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Cdccapr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary r1shcardnum = new Elementary(root,new PackedType(16, 0, true),new BigDecimal("0"));
	private final Elementary r1shccaseqno = new Elementary(root,new PackedType(4, 0, true),Short.valueOf("0"));
	private final Elementary r1shactivity = new Elementary(root,new AlphanumericType(5)," ");
	private final Elementary r1shdess = new Elementary(root,new AlphanumericType(25)," ");
	private final Elementary r1shccauser = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary r1shccatmstamp = new Elementary(root,new AlphanumericType(26),"0001-01-01-00.00.00.000000");
	
	/**
	 * Instantiate a new Cdccapr with a default record.
	 * @param configuration the configuration
	 */
	public Cdccapr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Cdccapr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Cdccapr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute r1shcardnum.
	 * @return the r1shcardnum attribute reference
	 */
	public ElementaryRangeReference getR1shcardnumReference() {
		return r1shcardnum.getReference();
	}

	/**
	 * Getter for r1shcardnum attribute.
	 * @return r1shcardnum attribute
	 */
	public long getR1shcardnum() {
		return r1shcardnum.getValue();
	}

	/**
	 * Setter for r1shcardnum attribute.
	 * @param r1shcardnum the new value of r1shcardnum
	 */
	public void setR1shcardnum(long r1shcardnum) {
		this.r1shcardnum.setValue(r1shcardnum);
	}
	/**
	 * Gets the reference for attribute r1shccaseqno.
	 * @return the r1shccaseqno attribute reference
	 */
	public ElementaryRangeReference getR1shccaseqnoReference() {
		return r1shccaseqno.getReference();
	}

	/**
	 * Getter for r1shccaseqno attribute.
	 * @return r1shccaseqno attribute
	 */
	public int getR1shccaseqno() {
		return r1shccaseqno.getValue();
	}

	/**
	 * Setter for r1shccaseqno attribute.
	 * @param r1shccaseqno the new value of r1shccaseqno
	 */
	public void setR1shccaseqno(int r1shccaseqno) {
		this.r1shccaseqno.setValue(r1shccaseqno);
	}
	/**
	 * Gets the reference for attribute r1shactivity.
	 * @return the r1shactivity attribute reference
	 */
	public ElementaryRangeReference getR1shactivityReference() {
		return r1shactivity.getReference();
	}

	/**
	 * Getter for r1shactivity attribute.
	 * @return r1shactivity attribute
	 */
	public String getR1shactivity() {
		return r1shactivity.getValue();
	}

	/**
	 * Setter for r1shactivity attribute.
	 * @param r1shactivity the new value of r1shactivity
	 */
	public void setR1shactivity(String r1shactivity) {
		this.r1shactivity.setValue(r1shactivity);
	}
	/**
	 * Gets the reference for attribute r1shdess.
	 * @return the r1shdess attribute reference
	 */
	public ElementaryRangeReference getR1shdessReference() {
		return r1shdess.getReference();
	}

	/**
	 * Getter for r1shdess attribute.
	 * @return r1shdess attribute
	 */
	public String getR1shdess() {
		return r1shdess.getValue();
	}

	/**
	 * Setter for r1shdess attribute.
	 * @param r1shdess the new value of r1shdess
	 */
	public void setR1shdess(String r1shdess) {
		this.r1shdess.setValue(r1shdess);
	}
	/**
	 * Gets the reference for attribute r1shccauser.
	 * @return the r1shccauser attribute reference
	 */
	public ElementaryRangeReference getR1shccauserReference() {
		return r1shccauser.getReference();
	}

	/**
	 * Getter for r1shccauser attribute.
	 * @return r1shccauser attribute
	 */
	public String getR1shccauser() {
		return r1shccauser.getValue();
	}

	/**
	 * Setter for r1shccauser attribute.
	 * @param r1shccauser the new value of r1shccauser
	 */
	public void setR1shccauser(String r1shccauser) {
		this.r1shccauser.setValue(r1shccauser);
	}
	/**
	 * Gets the reference for attribute r1shccatmstamp.
	 * @return the r1shccatmstamp attribute reference
	 */
	public ElementaryRangeReference getR1shccatmstampReference() {
		return r1shccatmstamp.getReference();
	}

	/**
	 * Getter for r1shccatmstamp attribute.
	 * @return r1shccatmstamp attribute
	 */
	public String getR1shccatmstamp() {
		return r1shccatmstamp.getValue();
	}

	/**
	 * Setter for r1shccatmstamp attribute.
	 * @param r1shccatmstamp the new value of r1shccatmstamp
	 */
	public void setR1shccatmstamp(String r1shccatmstamp) {
		this.r1shccatmstamp.setValue(r1shccatmstamp);
	}
}
