package aws.bluage.carddemo.cdact01r.business.model;

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
 * Data simplifier entity Delerrwin.
 * 
 * <p>About 'actid' field, <br>
 * </p>
 * 
 * <p>About 'errdelw' field, <br>
 * </p>
 * 
 * <p>About 'dpricustid' field, <br>
 * </p>
 * 
 * <p>About 'dseccustid' field, <br>
 * </p>
 * 
 * <p>About 'dpricredit' field, <br>
 * </p>
 * 
 * <p>About 'dseccredit' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Delerrwin extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary actid = new Elementary(root,new AlphanumericType(12));
	private final Elementary errdelw = new Elementary(root,new AlphanumericType(62)," ");
	private final Elementary dpricustid = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary dseccustid = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary dpricredit = new Elementary(root,new ZonedType(16, 0, true),new BigDecimal("0"));
	private final Elementary dseccredit = new Elementary(root,new ZonedType(16, 0, true),new BigDecimal("0"));
	
	/**
	 * Instantiate a new Delerrwin with a default record.
	 * @param configuration the configuration
	 */
	public Delerrwin(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Delerrwin bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Delerrwin(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute actid.
	 * @return the actid attribute reference
	 */
	public ElementaryRangeReference getActidReference() {
		return actid.getReference();
	}

	/**
	 * Getter for actid attribute.
	 * @return actid attribute
	 */
	public String getActid() {
		return actid.getValue();
	}

	/**
	 * Setter for actid attribute.
	 * @param actid the new value of actid
	 */
	public void setActid(String actid) {
		this.actid.setValue(actid);
	}
	/**
	 * Gets the reference for attribute errdelw.
	 * @return the errdelw attribute reference
	 */
	public ElementaryRangeReference getErrdelwReference() {
		return errdelw.getReference();
	}

	/**
	 * Getter for errdelw attribute.
	 * @return errdelw attribute
	 */
	public String getErrdelw() {
		return errdelw.getValue();
	}

	/**
	 * Setter for errdelw attribute.
	 * @param errdelw the new value of errdelw
	 */
	public void setErrdelw(String errdelw) {
		this.errdelw.setValue(errdelw);
	}
	/**
	 * Gets the reference for attribute dpricustid.
	 * @return the dpricustid attribute reference
	 */
	public ElementaryRangeReference getDpricustidReference() {
		return dpricustid.getReference();
	}

	/**
	 * Getter for dpricustid attribute.
	 * @return dpricustid attribute
	 */
	public String getDpricustid() {
		return dpricustid.getValue();
	}

	/**
	 * Setter for dpricustid attribute.
	 * @param dpricustid the new value of dpricustid
	 */
	public void setDpricustid(String dpricustid) {
		this.dpricustid.setValue(dpricustid);
	}
	/**
	 * Gets the reference for attribute dseccustid.
	 * @return the dseccustid attribute reference
	 */
	public ElementaryRangeReference getDseccustidReference() {
		return dseccustid.getReference();
	}

	/**
	 * Getter for dseccustid attribute.
	 * @return dseccustid attribute
	 */
	public String getDseccustid() {
		return dseccustid.getValue();
	}

	/**
	 * Setter for dseccustid attribute.
	 * @param dseccustid the new value of dseccustid
	 */
	public void setDseccustid(String dseccustid) {
		this.dseccustid.setValue(dseccustid);
	}
	/**
	 * Gets the reference for attribute dpricredit.
	 * @return the dpricredit attribute reference
	 */
	public ElementaryRangeReference getDpricreditReference() {
		return dpricredit.getReference();
	}

	/**
	 * Getter for dpricredit attribute.
	 * @return dpricredit attribute
	 */
	public long getDpricredit() {
		return dpricredit.getValue();
	}

	/**
	 * Setter for dpricredit attribute.
	 * @param dpricredit the new value of dpricredit
	 */
	public void setDpricredit(long dpricredit) {
		this.dpricredit.setValue(dpricredit);
	}
	/**
	 * Gets the reference for attribute dseccredit.
	 * @return the dseccredit attribute reference
	 */
	public ElementaryRangeReference getDseccreditReference() {
		return dseccredit.getReference();
	}

	/**
	 * Getter for dseccredit attribute.
	 * @return dseccredit attribute
	 */
	public long getDseccredit() {
		return dseccredit.getValue();
	}

	/**
	 * Setter for dseccredit attribute.
	 * @param dseccredit the new value of dseccredit
	 */
	public void setDseccredit(long dseccredit) {
		this.dseccredit.setValue(dseccredit);
	}
}
