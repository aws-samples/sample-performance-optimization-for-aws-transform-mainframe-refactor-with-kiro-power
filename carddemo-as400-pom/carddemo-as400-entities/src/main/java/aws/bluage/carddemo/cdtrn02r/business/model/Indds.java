package aws.bluage.carddemo.cdtrn02r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Indds.
 * 
 * <p>About 'f3' field, <br>
 * </p>
 * 
 * <p>About 'f4' field, <br>
 * </p>
 * 
 * <p>About 'f12' field, <br>
 * </p>
 * 
 * <p>About 'commandkey' field, <br>
 * </p>
 * 
 * <p>About 'revaudit' field, <br>
 * </p>
 * 
 * <p>About 'alwayson' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Indds extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(2));
	private final Elementary f3 = new Elementary(root,new AlphanumericType(1));
	private final Elementary f4 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(7));
	private final Elementary f12 = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(37));
	private final Elementary commandkey = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(28));
	private final Elementary revaudit = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(19));
	private final Elementary alwayson = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Instantiate a new Indds with a default record.
	 * @param configuration the configuration
	 */
	public Indds(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Indds bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Indds(Configuration configuration, RecordAdaptable record) {
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
	 * Gets the reference for attribute commandkey.
	 * @return the commandkey attribute reference
	 */
	public ElementaryRangeReference getCommandkeyReference() {
		return commandkey.getReference();
	}

	/**
	 * Getter for commandkey attribute.
	 * @return commandkey attribute
	 */
	public String getCommandkey() {
		return commandkey.getValue();
	}

	/**
	 * Setter for commandkey attribute.
	 * @param commandkey the new value of commandkey
	 */
	public void setCommandkey(String commandkey) {
		this.commandkey.setValue(commandkey);
	}
	/**
	 * Gets the reference for attribute revaudit.
	 * @return the revaudit attribute reference
	 */
	public ElementaryRangeReference getRevauditReference() {
		return revaudit.getReference();
	}

	/**
	 * Getter for revaudit attribute.
	 * @return revaudit attribute
	 */
	public String getRevaudit() {
		return revaudit.getValue();
	}

	/**
	 * Setter for revaudit attribute.
	 * @param revaudit the new value of revaudit
	 */
	public void setRevaudit(String revaudit) {
		this.revaudit.setValue(revaudit);
	}
	/**
	 * Gets the reference for attribute alwayson.
	 * @return the alwayson attribute reference
	 */
	public ElementaryRangeReference getAlwaysonReference() {
		return alwayson.getReference();
	}

	/**
	 * Getter for alwayson attribute.
	 * @return alwayson attribute
	 */
	public String getAlwayson() {
		return alwayson.getValue();
	}

	/**
	 * Setter for alwayson attribute.
	 * @param alwayson the new value of alwayson
	 */
	public void setAlwayson(String alwayson) {
		this.alwayson.setValue(alwayson);
	}
}
