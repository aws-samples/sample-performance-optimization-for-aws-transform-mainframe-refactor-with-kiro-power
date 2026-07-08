package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Indicatords.
 * 
 * <p>About 'f3' field, <br>
 * </p>
 * 
 * <p>About 'f4' field, <br>
 * </p>
 * 
 * <p>About 'f5' field, <br>
 * </p>
 * 
 * <p>About 'f12' field, <br>
 * </p>
 * 
 * <p>About 'pagedown' field, <br>
 * </p>
 * 
 * <p>About 'pageup' field, <br>
 * </p>
 * 
 * <p>About 'sflreset' field, <br>
 * </p>
 * 
 * <p>About 'sflinit' field, <br>
 * </p>
 * 
 * <p>About 'sflend' field, <br>
 * </p>
 * 
 * <p>About 'sflempty' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indicatords extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(2));
	private final Elementary f3 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f4 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f5 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(6));
	private final Elementary f12 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(12));
	private final Elementary pagedown = new Elementary(root,new AlphanumericType(1));
	private final Elementary pageup = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(3));
	private final Elementary sflreset = new Elementary(root,new AlphanumericType(1));
	private final Elementary sflinit = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(1));
	private final Elementary sflend = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(56));
	private final Elementary sflempty = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Instantiate a new Indicatords with a default record.
	 * @param configuration the configuration
	 */
	public Indicatords(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indicatords bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indicatords(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute f3.
	 * @return the f3 attribute reference
	 */
	public ElementaryRangeReference getF3Reference() {
		return f3.getReference();
	}

	/**
	 * Getter for f3 attribute.
	 * @return f3 attribute
	 */
	public String getF3() {
		return f3.getValue();
	}

	/**
	 * Setter for f3 attribute.
	 * @param f3 the new value of f3
	 */
	public void setF3(String f3) {
		this.f3.setValue(f3);
	}
	/**
	 * Gets the reference for attribute f4.
	 * @return the f4 attribute reference
	 */
	public ElementaryRangeReference getF4Reference() {
		return f4.getReference();
	}

	/**
	 * Getter for f4 attribute.
	 * @return f4 attribute
	 */
	public String getF4() {
		return f4.getValue();
	}

	/**
	 * Setter for f4 attribute.
	 * @param f4 the new value of f4
	 */
	public void setF4(String f4) {
		this.f4.setValue(f4);
	}
	/**
	 * Gets the reference for attribute f5.
	 * @return the f5 attribute reference
	 */
	public ElementaryRangeReference getF5Reference() {
		return f5.getReference();
	}

	/**
	 * Getter for f5 attribute.
	 * @return f5 attribute
	 */
	public String getF5() {
		return f5.getValue();
	}

	/**
	 * Setter for f5 attribute.
	 * @param f5 the new value of f5
	 */
	public void setF5(String f5) {
		this.f5.setValue(f5);
	}
	/**
	 * Gets the reference for attribute f12.
	 * @return the f12 attribute reference
	 */
	public ElementaryRangeReference getF12Reference() {
		return f12.getReference();
	}

	/**
	 * Getter for f12 attribute.
	 * @return f12 attribute
	 */
	public String getF12() {
		return f12.getValue();
	}

	/**
	 * Setter for f12 attribute.
	 * @param f12 the new value of f12
	 */
	public void setF12(String f12) {
		this.f12.setValue(f12);
	}
	/**
	 * Gets the reference for attribute pagedown.
	 * @return the pagedown attribute reference
	 */
	public ElementaryRangeReference getPagedownReference() {
		return pagedown.getReference();
	}

	/**
	 * Getter for pagedown attribute.
	 * @return pagedown attribute
	 */
	public String getPagedown() {
		return pagedown.getValue();
	}

	/**
	 * Setter for pagedown attribute.
	 * @param pagedown the new value of pagedown
	 */
	public void setPagedown(String pagedown) {
		this.pagedown.setValue(pagedown);
	}
	/**
	 * Gets the reference for attribute pageup.
	 * @return the pageup attribute reference
	 */
	public ElementaryRangeReference getPageupReference() {
		return pageup.getReference();
	}

	/**
	 * Getter for pageup attribute.
	 * @return pageup attribute
	 */
	public String getPageup() {
		return pageup.getValue();
	}

	/**
	 * Setter for pageup attribute.
	 * @param pageup the new value of pageup
	 */
	public void setPageup(String pageup) {
		this.pageup.setValue(pageup);
	}
	/**
	 * Gets the reference for attribute sflreset.
	 * @return the sflreset attribute reference
	 */
	public ElementaryRangeReference getSflresetReference() {
		return sflreset.getReference();
	}

	/**
	 * Getter for sflreset attribute.
	 * @return sflreset attribute
	 */
	public String getSflreset() {
		return sflreset.getValue();
	}

	/**
	 * Setter for sflreset attribute.
	 * @param sflreset the new value of sflreset
	 */
	public void setSflreset(String sflreset) {
		this.sflreset.setValue(sflreset);
	}
	/**
	 * Gets the reference for attribute sflinit.
	 * @return the sflinit attribute reference
	 */
	public ElementaryRangeReference getSflinitReference() {
		return sflinit.getReference();
	}

	/**
	 * Getter for sflinit attribute.
	 * @return sflinit attribute
	 */
	public String getSflinit() {
		return sflinit.getValue();
	}

	/**
	 * Setter for sflinit attribute.
	 * @param sflinit the new value of sflinit
	 */
	public void setSflinit(String sflinit) {
		this.sflinit.setValue(sflinit);
	}
	/**
	 * Gets the reference for attribute sflend.
	 * @return the sflend attribute reference
	 */
	public ElementaryRangeReference getSflendReference() {
		return sflend.getReference();
	}

	/**
	 * Getter for sflend attribute.
	 * @return sflend attribute
	 */
	public String getSflend() {
		return sflend.getValue();
	}

	/**
	 * Setter for sflend attribute.
	 * @param sflend the new value of sflend
	 */
	public void setSflend(String sflend) {
		this.sflend.setValue(sflend);
	}
	/**
	 * Gets the reference for attribute sflempty.
	 * @return the sflempty attribute reference
	 */
	public ElementaryRangeReference getSflemptyReference() {
		return sflempty.getReference();
	}

	/**
	 * Getter for sflempty attribute.
	 * @return sflempty attribute
	 */
	public String getSflempty() {
		return sflempty.getValue();
	}

	/**
	 * Setter for sflempty attribute.
	 * @param sflempty the new value of sflempty
	 */
	public void setSflempty(String sflempty) {
		this.sflempty.setValue(sflempty);
	}
}
