package aws.bluage.carddemo.cdact01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Sfl1.
 * 
 * <p>About 'option' field, <br>
 * </p>
 * 
 * <p>About 'sflacct' field, <br>
 * </p>
 * 
 * <p>About 'opendate' field, <br>
 * </p>
 * 
 * <p>About 'sflpcust' field, <br>
 * </p>
 * 
 * <p>About 'sflscust' field, <br>
 * </p>
 * 
 * <p>About 'sflbal' field, <br>
 * </p>
 * 
 * <p>About 'sflsts' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Sfl1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary option = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary sflacct = new Elementary(root,new AlphanumericType(12)," ");
	private final Elementary opendate = new Elementary(root,new AlphanumericType(10));
	private final Elementary sflpcust = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary sflscust = new Elementary(root,new AlphanumericType(9)," ");
	private final Elementary sflbal = new Elementary(root,new AlphanumericType(15)," ");
	private final Elementary sflsts = new Elementary(root,new AlphanumericType(1)," ");
	
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
	 * Gets the reference for attribute option.
	 * @return the option attribute reference
	 */
	public ElementaryRangeReference getOptionReference() {
		return option.getReference();
	}

	/**
	 * Getter for option attribute.
	 * @return option attribute
	 */
	public String getOption() {
		return option.getValue();
	}

	/**
	 * Setter for option attribute.
	 * @param option the new value of option
	 */
	public void setOption(String option) {
		this.option.setValue(option);
	}
	/**
	 * Gets the reference for attribute sflacct.
	 * @return the sflacct attribute reference
	 */
	public ElementaryRangeReference getSflacctReference() {
		return sflacct.getReference();
	}

	/**
	 * Getter for sflacct attribute.
	 * @return sflacct attribute
	 */
	public String getSflacct() {
		return sflacct.getValue();
	}

	/**
	 * Setter for sflacct attribute.
	 * @param sflacct the new value of sflacct
	 */
	public void setSflacct(String sflacct) {
		this.sflacct.setValue(sflacct);
	}
	/**
	 * Gets the reference for attribute opendate.
	 * @return the opendate attribute reference
	 */
	public ElementaryRangeReference getOpendateReference() {
		return opendate.getReference();
	}

	/**
	 * Getter for opendate attribute.
	 * @return opendate attribute
	 */
	public String getOpendate() {
		return opendate.getValue();
	}

	/**
	 * Setter for opendate attribute.
	 * @param opendate the new value of opendate
	 */
	public void setOpendate(String opendate) {
		this.opendate.setValue(opendate);
	}
	/**
	 * Gets the reference for attribute sflpcust.
	 * @return the sflpcust attribute reference
	 */
	public ElementaryRangeReference getSflpcustReference() {
		return sflpcust.getReference();
	}

	/**
	 * Getter for sflpcust attribute.
	 * @return sflpcust attribute
	 */
	public String getSflpcust() {
		return sflpcust.getValue();
	}

	/**
	 * Setter for sflpcust attribute.
	 * @param sflpcust the new value of sflpcust
	 */
	public void setSflpcust(String sflpcust) {
		this.sflpcust.setValue(sflpcust);
	}
	/**
	 * Gets the reference for attribute sflscust.
	 * @return the sflscust attribute reference
	 */
	public ElementaryRangeReference getSflscustReference() {
		return sflscust.getReference();
	}

	/**
	 * Getter for sflscust attribute.
	 * @return sflscust attribute
	 */
	public String getSflscust() {
		return sflscust.getValue();
	}

	/**
	 * Setter for sflscust attribute.
	 * @param sflscust the new value of sflscust
	 */
	public void setSflscust(String sflscust) {
		this.sflscust.setValue(sflscust);
	}
	/**
	 * Gets the reference for attribute sflbal.
	 * @return the sflbal attribute reference
	 */
	public ElementaryRangeReference getSflbalReference() {
		return sflbal.getReference();
	}

	/**
	 * Getter for sflbal attribute.
	 * @return sflbal attribute
	 */
	public String getSflbal() {
		return sflbal.getValue();
	}

	/**
	 * Setter for sflbal attribute.
	 * @param sflbal the new value of sflbal
	 */
	public void setSflbal(String sflbal) {
		this.sflbal.setValue(sflbal);
	}
	/**
	 * Gets the reference for attribute sflsts.
	 * @return the sflsts attribute reference
	 */
	public ElementaryRangeReference getSflstsReference() {
		return sflsts.getReference();
	}

	/**
	 * Getter for sflsts attribute.
	 * @return sflsts attribute
	 */
	public String getSflsts() {
		return sflsts.getValue();
	}

	/**
	 * Setter for sflsts attribute.
	 * @param sflsts the new value of sflsts
	 */
	public void setSflsts(String sflsts) {
		this.sflsts.setValue(sflsts);
	}
}
