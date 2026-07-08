package aws.bluage.carddemo.cdtrn02r.business.context;
import aws.bluage.carddemo.cdtrn02r.business.model.Errflg;
import aws.bluage.carddemo.cdtrn02r.business.model.Indds;
import aws.bluage.carddemo.cdtrn02r.business.model.Indds_pointer;
import aws.bluage.carddemo.cdtrn02r.business.model.Modifiedds;
import aws.bluage.carddemo.cdtrn02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdtrn02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdtrn02r.business.model.Origloadds;
import aws.bluage.carddemo.cdtrn02r.business.model.Ptrnid;
import aws.bluage.carddemo.cdtrn02r.business.model.Scrn1;
import aws.bluage.carddemo.cdtrn02r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdtrn02r.business.model.Tcardnum;
import aws.bluage.carddemo.cdtrn02r.business.model.Zconfirm;
import aws.bluage.carddemo.common.business.database.cdautp.Cdautpr;
import aws.bluage.carddemo.common.business.database.cdtrnp.Cdtrnpr;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context Cdtrn02rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdtrnpr' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Cdtrnpr
 * <br></p>
 * 
 * <p>About 'cdautpr' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Cdautpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indds' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Indds
 * <br></p>
 * 
 * <p>About 'origloadds' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Origloadds
 * <br></p>
 * 
 * <p>About 'modifiedds' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Modifiedds
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'scrn1' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Scrn1
 * <br></p>
 * 
 * <p>About 'zconfirm' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Zconfirm
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'errflg' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Errflg
 * <br></p>
 * 
 * <p>About 'tcardnum' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Tcardnum
 * <br></p>
 * 
 * <p>About 'indds_pointer' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Indds_pointer
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'inddsSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'errflgSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'ptrnid' field, <br>uml entity: aws.bluage.carddemo.cdtrn02r.business.model.Ptrnid
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdtrn02r.business.context.Cdtrn02rContext")
@Lazy
@Scope("prototype")
public class Cdtrn02rContext extends Blu4ivRuntimeContext {
	
	private Cdtrnpr cdtrnpr;
	private Cdautpr cdautpr;
	private Indds indds;
	private Origloadds origloadds;
	private Modifiedds modifiedds;
	private SharedRecordFields sharedRecordFields;
	private Scrn1 scrn1;
	private Zconfirm zconfirm;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Errflg errflg;
	private Tcardnum tcardnum;
	private Indds_pointer indds_pointer;
	private Ptrnid ptrnid;

	private List<String> fieldsToUpdate;

	private Record inddsSnapshot;

	private Record errflgSnapshot;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdtrn02rContext (@Qualifier("Cdtrn02rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	

	/**
	 * Getter for cdtrnpr.
	 * @return the cdtrnpr
	 */
	public Cdtrnpr getCdtrnpr() {
		return this.cdtrnpr;
	}

	/**
	 * Setter for cdtrnpr.
	 * @param reference the new value for cdtrnpr
	 */
	public void setCdtrnpr(RangeReference reference) {
		this.cdtrnpr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for cdautpr.
	 * @return the cdautpr
	 */
	public Cdautpr getCdautpr() {
		return this.cdautpr;
	}

	/**
	 * Setter for cdautpr.
	 * @param reference the new value for cdautpr
	 */
	public void setCdautpr(RangeReference reference) {
		this.cdautpr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for indds.
	 * @return the indds
	 */
	public Indds getIndds() {
		return this.indds;
	}

	/**
	 * Setter for indds.
	 * @param reference the new value for indds
	 */
	public void setIndds(RangeReference reference) {
		this.indds.setBytes(reference.getBytes());
	}

	/**
	 * Getter for origloadds.
	 * @return the origloadds
	 */
	public Origloadds getOrigloadds() {
		return this.origloadds;
	}

	/**
	 * Setter for origloadds.
	 * @param reference the new value for origloadds
	 */
	public void setOrigloadds(RangeReference reference) {
		this.origloadds.setBytes(reference.getBytes());
	}

	/**
	 * Getter for modifiedds.
	 * @return the modifiedds
	 */
	public Modifiedds getModifiedds() {
		return this.modifiedds;
	}

	/**
	 * Setter for modifiedds.
	 * @param reference the new value for modifiedds
	 */
	public void setModifiedds(RangeReference reference) {
		this.modifiedds.setBytes(reference.getBytes());
	}

	/**
	 * Getter for sharedRecordFields.
	 * @return the sharedRecordFields
	 */
	public SharedRecordFields getSharedRecordFields() {
		return this.sharedRecordFields;
	}

	/**
	 * Setter for sharedRecordFields.
	 * @param reference the new value for sharedRecordFields
	 */
	public void setSharedRecordFields(RangeReference reference) {
		this.sharedRecordFields.setBytes(reference.getBytes());
	}

	/**
	 * Getter for scrn1.
	 * @return the scrn1
	 */
	public Scrn1 getScrn1() {
		return this.scrn1;
	}

	/**
	 * Setter for scrn1.
	 * @param reference the new value for scrn1
	 */
	public void setScrn1(RangeReference reference) {
		this.scrn1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for zconfirm.
	 * @return the zconfirm
	 */
	public Zconfirm getZconfirm() {
		return this.zconfirm;
	}

	/**
	 * Setter for zconfirm.
	 * @param reference the new value for zconfirm
	 */
	public void setZconfirm(RangeReference reference) {
		this.zconfirm.setBytes(reference.getBytes());
	}

	/**
	 * Getter for msgsfl.
	 * @return the msgsfl
	 */
	public Msgsfl getMsgsfl() {
		return this.msgsfl;
	}

	/**
	 * Setter for msgsfl.
	 * @param reference the new value for msgsfl
	 */
	public void setMsgsfl(RangeReference reference) {
		this.msgsfl.setBytes(reference.getBytes());
	}

	/**
	 * Getter for msgsflc.
	 * @return the msgsflc
	 */
	public Msgsflc getMsgsflc() {
		return this.msgsflc;
	}

	/**
	 * Setter for msgsflc.
	 * @param reference the new value for msgsflc
	 */
	public void setMsgsflc(RangeReference reference) {
		this.msgsflc.setBytes(reference.getBytes());
	}

	/**
	 * Getter for errflg.
	 * @return the errflg
	 */
	public Errflg getErrflg() {
		return this.errflg;
	}

	/**
	 * Setter for errflg.
	 * @param reference the new value for errflg
	 */
	public void setErrflg(RangeReference reference) {
		this.errflg.setBytes(reference.getBytes());
	}

	/**
	 * Getter for tcardnum.
	 * @return the tcardnum
	 */
	public Tcardnum getTcardnum() {
		return this.tcardnum;
	}

	/**
	 * Setter for tcardnum.
	 * @param reference the new value for tcardnum
	 */
	public void setTcardnum(RangeReference reference) {
		this.tcardnum.setBytes(reference.getBytes());
	}

	/**
	 * Getter for indds_pointer.
	 * @return the indds_pointer
	 */
	public Indds_pointer getIndds_pointer() {
		return this.indds_pointer;
	}

	/**
	 * Setter for indds_pointer.
	 * @param reference the new value for indds_pointer
	 */
	public void setIndds_pointer(RangeReference reference) {
		this.indds_pointer.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ptrnid.
	 * @return the ptrnid
	 */
	public Ptrnid getPtrnid() {
		return this.ptrnid;
	}

	/**
	 * Setter for ptrnid.
	 * @param reference the new value for ptrnid
	 */
	public void setPtrnid(RangeReference reference) {
		this.ptrnid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for fieldsToUpdate.
	 * @return the fieldsToUpdate
	 */
	public List<String> getFieldsToUpdate() {
		return this.fieldsToUpdate;
	}

	/**
	 * Setter for fieldsToUpdate.
	 * @param value the new value for fieldsToUpdate
	 */
	public void setFieldsToUpdate(List<String> value) {
		this.fieldsToUpdate = value;
	}

	

	/**
	 * Getter for inddsSnapshot.
	 * @return the inddsSnapshot
	 */
	public Record getInddsSnapshot() {
		return this.inddsSnapshot;
	}

	/**
	 * Setter for inddsSnapshot.
	 * @param value the new value for inddsSnapshot
	 */
	public void setInddsSnapshot(Record value) {
		this.inddsSnapshot = value;
	}

	

	/**
	 * Getter for errflgSnapshot.
	 * @return the errflgSnapshot
	 */
	public Record getErrflgSnapshot() {
		return this.errflgSnapshot;
	}

	/**
	 * Setter for errflgSnapshot.
	 * @param value the new value for errflgSnapshot
	 */
	public void setErrflgSnapshot(Record value) {
		this.errflgSnapshot = value;
	}

	

	/**
	 * Getter for firstRun.
	 * @return the firstRun
	 */
	public boolean isFirstRun() {
		return this.firstRun;
	}

	/**
	 * Setter for firstRun.
	 * @param value the new value for firstRun
	 */
	public void setFirstRun(boolean value) {
		this.firstRun = value;
	}

	

	@Override 
	public void cleanUp(){
	}

	@Override
	protected void doReset() {
		cleanUp();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
		this.fieldsToUpdate = null;
		this.inddsSnapshot = null;
		this.errflgSnapshot = null;
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdtrnpr = new Cdtrnpr(configuration);
		cdautpr = new Cdautpr(configuration);
		indds = new Indds(configuration);
		origloadds = new Origloadds(configuration);
		modifiedds = new Modifiedds(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		scrn1 = new Scrn1(configuration);
		zconfirm = new Zconfirm(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		errflg = new Errflg(configuration);
		tcardnum = new Tcardnum(configuration);
		indds_pointer = new Indds_pointer(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		ptrnid = new Ptrnid(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdtrnpr, cdautpr, indds, origloadds, modifiedds, sharedRecordFields, scrn1, zconfirm, msgsfl, msgsflc, errflg, tcardnum, indds_pointer);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdtrn02rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Ptrnid : [").append(ptrnid.toString()).append("]\n");
		return toSB.toString();
	}

}
