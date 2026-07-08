package aws.bluage.carddemo.cdtrn01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Sfl1.
 * 
 * <p>About 'd1soption' field, <br>
 * </p>
 * 
 * <p>About 'd1stranid' field, <br>
 * </p>
 * 
 * <p>About 'd1sdate' field, <br>
 * </p>
 * 
 * <p>About 'd1sdess' field, <br>
 * </p>
 * 
 * <p>About 'd1samount' field, <br>
 * </p>
 * 
 * <p>About 'd1sstatus' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Sfl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary d1soption = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary d1stranid = new Elementary(root,new AlphanumericType(15)," ");
	private final Elementary d1sdate = new Elementary(root,new ZonedType(8, 0, true),Integer.valueOf("0"));
	private final Elementary d1sdess = new Elementary(root,new AlphanumericType(30)," ");
	private final Elementary d1samount = new Elementary(root,new AlphanumericType(13)," ");
	private final Elementary d1sstatus = new Elementary(root,new AlphanumericType(1)," ");
	
	/**
	 * Instantiate a new Sfl1 with a default record.
	 * @param configuration the configuration
	 */
	public Sfl1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Sfl1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Sfl1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute d1soption.
	 * @return the d1soption attribute reference
	 */
	public ElementaryRangeReference getD1soptionReference() {
		return d1soption.getReference();
	}

	/**
	 * Getter for d1soption attribute.
	 * @return d1soption attribute
	 */
	public String getD1soption() {
		return d1soption.getValue();
	}

	/**
	 * Setter for d1soption attribute.
	 * @param d1soption the new value of d1soption
	 */
	public void setD1soption(String d1soption) {
		this.d1soption.setValue(d1soption);
	}
	/**
	 * Gets the reference for attribute d1stranid.
	 * @return the d1stranid attribute reference
	 */
	public ElementaryRangeReference getD1stranidReference() {
		return d1stranid.getReference();
	}

	/**
	 * Getter for d1stranid attribute.
	 * @return d1stranid attribute
	 */
	public String getD1stranid() {
		return d1stranid.getValue();
	}

	/**
	 * Setter for d1stranid attribute.
	 * @param d1stranid the new value of d1stranid
	 */
	public void setD1stranid(String d1stranid) {
		this.d1stranid.setValue(d1stranid);
	}
	/**
	 * Gets the reference for attribute d1sdate.
	 * @return the d1sdate attribute reference
	 */
	public ElementaryRangeReference getD1sdateReference() {
		return d1sdate.getReference();
	}

	/**
	 * Getter for d1sdate attribute.
	 * @return d1sdate attribute
	 */
	public int getD1sdate() {
		return d1sdate.getValue();
	}

	/**
	 * Setter for d1sdate attribute.
	 * @param d1sdate the new value of d1sdate
	 */
	public void setD1sdate(int d1sdate) {
		this.d1sdate.setValue(d1sdate);
	}
	/**
	 * Gets the reference for attribute d1sdess.
	 * @return the d1sdess attribute reference
	 */
	public ElementaryRangeReference getD1sdessReference() {
		return d1sdess.getReference();
	}

	/**
	 * Getter for d1sdess attribute.
	 * @return d1sdess attribute
	 */
	public String getD1sdess() {
		return d1sdess.getValue();
	}

	/**
	 * Setter for d1sdess attribute.
	 * @param d1sdess the new value of d1sdess
	 */
	public void setD1sdess(String d1sdess) {
		this.d1sdess.setValue(d1sdess);
	}
	/**
	 * Gets the reference for attribute d1samount.
	 * @return the d1samount attribute reference
	 */
	public ElementaryRangeReference getD1samountReference() {
		return d1samount.getReference();
	}

	/**
	 * Getter for d1samount attribute.
	 * @return d1samount attribute
	 */
	public String getD1samount() {
		return d1samount.getValue();
	}

	/**
	 * Setter for d1samount attribute.
	 * @param d1samount the new value of d1samount
	 */
	public void setD1samount(String d1samount) {
		this.d1samount.setValue(d1samount);
	}
	/**
	 * Gets the reference for attribute d1sstatus.
	 * @return the d1sstatus attribute reference
	 */
	public ElementaryRangeReference getD1sstatusReference() {
		return d1sstatus.getReference();
	}

	/**
	 * Getter for d1sstatus attribute.
	 * @return d1sstatus attribute
	 */
	public String getD1sstatus() {
		return d1sstatus.getValue();
	}

	/**
	 * Setter for d1sstatus attribute.
	 * @param d1sstatus the new value of d1sstatus
	 */
	public void setD1sstatus(String d1sstatus) {
		this.d1sstatus.setValue(d1sstatus);
	}
}
