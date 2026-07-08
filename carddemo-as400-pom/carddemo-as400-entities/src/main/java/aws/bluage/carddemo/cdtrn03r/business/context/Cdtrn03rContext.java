package aws.bluage.carddemo.cdtrn03r.business.context;
import aws.bluage.carddemo.cdtrn03r.business.model.ISCURRENCYReturn;
import aws.bluage.carddemo.cdtrn03r.business.model.Indds;
import aws.bluage.carddemo.cdtrn03r.business.model.Indds_pointer;
import aws.bluage.carddemo.cdtrn03r.business.model.Messageid;
import aws.bluage.carddemo.cdtrn03r.business.model.Msgsfl;
import aws.bluage.carddemo.cdtrn03r.business.model.Msgsflc;
import aws.bluage.carddemo.cdtrn03r.business.model.Pgmstatus;
import aws.bluage.carddemo.cdtrn03r.business.model.Scrn1;
import aws.bluage.carddemo.cdtrn03r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdtrn03r.business.model.Teststring;
import aws.bluage.carddemo.cdtrn03r.business.model.Wcategcd;
import aws.bluage.carddemo.cdtrn03r.business.model.Wtodaydt;
import aws.bluage.carddemo.cdtrn03r.business.model.Zconfirm;
import aws.bluage.carddemo.common.business.database.cdccmp.Cdccmpr;
import aws.bluage.carddemo.common.business.database.cdtrnp.Cdtrnpr;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context Cdtrn03rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdtrnpr' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Cdtrnpr
 * <br></p>
 * 
 * <p>About 'cdccmpr' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Cdccmpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indds' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Indds
 * <br></p>
 * 
 * <p>About 'pgmstatus' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Pgmstatus
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'scrn1' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Scrn1
 * <br></p>
 * 
 * <p>About 'zconfirm' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Zconfirm
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'wtodaydt' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Wtodaydt
 * <br></p>
 * 
 * <p>About 'wcategcd' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Wcategcd
 * <br></p>
 * 
 * <p>About 'messageid' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Messageid
 * <br></p>
 * 
 * <p>About 'teststring' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Teststring
 * <br></p>
 * 
 * <p>About 'indds_pointer' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.Indds_pointer
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'wtodaydtSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'dfltvalSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'iSCURRENCYReturn' field, <br>uml entity: aws.bluage.carddemo.cdtrn03r.business.model.ISCURRENCYReturn
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdtrn03r.business.context.Cdtrn03rContext")
@Lazy
@Scope("prototype")
public class Cdtrn03rContext extends Blu4ivRuntimeContext {
	
	private Cdtrnpr cdtrnpr;
	private Cdccmpr cdccmpr;
	private Indds indds;
	private Pgmstatus pgmstatus;
	private SharedRecordFields sharedRecordFields;
	private Scrn1 scrn1;
	private Zconfirm zconfirm;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Wtodaydt wtodaydt;
	private Wcategcd wcategcd;
	private Messageid messageid;
	private Teststring teststring;
	private Indds_pointer indds_pointer;
	private ISCURRENCYReturn iSCURRENCYReturn;

	private List<String> fieldsToUpdate;

	private Record wtodaydtSnapshot;

	private Record dfltvalSnapshot;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdtrn03rContext (@Qualifier("Cdtrn03rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
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
	 * Getter for cdccmpr.
	 * @return the cdccmpr
	 */
	public Cdccmpr getCdccmpr() {
		return this.cdccmpr;
	}

	/**
	 * Setter for cdccmpr.
	 * @param reference the new value for cdccmpr
	 */
	public void setCdccmpr(RangeReference reference) {
		this.cdccmpr.setBytes(reference.getBytes());
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
	 * Getter for pgmstatus.
	 * @return the pgmstatus
	 */
	public Pgmstatus getPgmstatus() {
		return this.pgmstatus;
	}

	/**
	 * Setter for pgmstatus.
	 * @param reference the new value for pgmstatus
	 */
	public void setPgmstatus(RangeReference reference) {
		this.pgmstatus.setBytes(reference.getBytes());
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
	 * Getter for wtodaydt.
	 * @return the wtodaydt
	 */
	public Wtodaydt getWtodaydt() {
		return this.wtodaydt;
	}

	/**
	 * Setter for wtodaydt.
	 * @param reference the new value for wtodaydt
	 */
	public void setWtodaydt(RangeReference reference) {
		this.wtodaydt.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcategcd.
	 * @return the wcategcd
	 */
	public Wcategcd getWcategcd() {
		return this.wcategcd;
	}

	/**
	 * Setter for wcategcd.
	 * @param reference the new value for wcategcd
	 */
	public void setWcategcd(RangeReference reference) {
		this.wcategcd.setBytes(reference.getBytes());
	}

	/**
	 * Getter for messageid.
	 * @return the messageid
	 */
	public Messageid getMessageid() {
		return this.messageid;
	}

	/**
	 * Setter for messageid.
	 * @param reference the new value for messageid
	 */
	public void setMessageid(RangeReference reference) {
		this.messageid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for teststring.
	 * @return the teststring
	 */
	public Teststring getTeststring() {
		return this.teststring;
	}

	/**
	 * Setter for teststring.
	 * @param reference the new value for teststring
	 */
	public void setTeststring(RangeReference reference) {
		this.teststring.setBytes(reference.getBytes());
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
	 * Getter for iSCURRENCYReturn.
	 * @return the iSCURRENCYReturn
	 */
	public ISCURRENCYReturn getISCURRENCYReturn() {
		return this.iSCURRENCYReturn;
	}

	/**
	 * Setter for iSCURRENCYReturn.
	 * @param reference the new value for iSCURRENCYReturn
	 */
	public void setISCURRENCYReturn(RangeReference reference) {
		this.iSCURRENCYReturn.setBytes(reference.getBytes());
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
	 * Getter for wtodaydtSnapshot.
	 * @return the wtodaydtSnapshot
	 */
	public Record getWtodaydtSnapshot() {
		return this.wtodaydtSnapshot;
	}

	/**
	 * Setter for wtodaydtSnapshot.
	 * @param value the new value for wtodaydtSnapshot
	 */
	public void setWtodaydtSnapshot(Record value) {
		this.wtodaydtSnapshot = value;
	}

	

	/**
	 * Getter for dfltvalSnapshot.
	 * @return the dfltvalSnapshot
	 */
	public Record getDfltvalSnapshot() {
		return this.dfltvalSnapshot;
	}

	/**
	 * Setter for dfltvalSnapshot.
	 * @param value the new value for dfltvalSnapshot
	 */
	public void setDfltvalSnapshot(Record value) {
		this.dfltvalSnapshot = value;
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
		this.wtodaydtSnapshot = null;
		this.dfltvalSnapshot = null;
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdtrnpr = new Cdtrnpr(configuration);
		cdccmpr = new Cdccmpr(configuration);
		indds = new Indds(configuration);
		pgmstatus = new Pgmstatus(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		scrn1 = new Scrn1(configuration);
		zconfirm = new Zconfirm(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		wtodaydt = new Wtodaydt(configuration);
		wcategcd = new Wcategcd(configuration);
		messageid = new Messageid(configuration);
		teststring = new Teststring(configuration);
		indds_pointer = new Indds_pointer(configuration);
		iSCURRENCYReturn = new ISCURRENCYReturn(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdtrnpr, cdccmpr, indds, pgmstatus, sharedRecordFields, scrn1, zconfirm, msgsfl, msgsflc, wtodaydt, wcategcd, messageid, teststring, indds_pointer, iSCURRENCYReturn);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdtrn03rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
