package aws.bluage.carddemo.cdcus02r.business.context;
import aws.bluage.carddemo.cdcus02r.business.model.Changecomplete;
import aws.bluage.carddemo.cdcus02r.business.model.Genderwin;
import aws.bluage.carddemo.cdcus02r.business.model.ISNUMERICReturn;
import aws.bluage.carddemo.cdcus02r.business.model.Indicators;
import aws.bluage.carddemo.cdcus02r.business.model.Indicators_pointer;
import aws.bluage.carddemo.cdcus02r.business.model.MESSAGEParam0;
import aws.bluage.carddemo.cdcus02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdcus02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdcus02r.business.model.Pcustid;
import aws.bluage.carddemo.cdcus02r.business.model.Programstatus;
import aws.bluage.carddemo.cdcus02r.business.model.Pviewonly;
import aws.bluage.carddemo.cdcus02r.business.model.Screenstate;
import aws.bluage.carddemo.cdcus02r.business.model.Scrn1;
import aws.bluage.carddemo.cdcus02r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdcus02r.business.model.Statechanged;
import aws.bluage.carddemo.common.business.database.cdcusp.Cdcuspr;
import aws.bluage.carddemo.common.business.database.cdstcp.Cdstapr;
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
 * Data simplifier context Cdcus02rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdcuspr' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Cdcuspr
 * <br></p>
 * 
 * <p>About 'cdstapr' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Cdstapr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'screenstate' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Screenstate
 * <br></p>
 * 
 * <p>About 'indicators' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Indicators
 * <br></p>
 * 
 * <p>About 'programstatus' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Programstatus
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'scrn1' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Scrn1
 * <br></p>
 * 
 * <p>About 'genderwin' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Genderwin
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'changecomplete' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Changecomplete
 * <br></p>
 * 
 * <p>About 'statechanged' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Statechanged
 * <br></p>
 * 
 * <p>About 'indicators_pointer' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Indicators_pointer
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'indicatorsSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'changeCompleteSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'stateChangedSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'mESSAGEParam0' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.MESSAGEParam0
 * <br></p>
 * 
 * <p>About 'iSNUMERICReturn' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.ISNUMERICReturn
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'pcustid' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Pcustid
 * <br></p>
 * 
 * <p>About 'pviewonly' field, <br>uml entity: aws.bluage.carddemo.cdcus02r.business.model.Pviewonly
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rContext")
@Lazy
@Scope("prototype")
public class Cdcus02rContext extends Blu4ivRuntimeContext {
	
	private Cdcuspr cdcuspr;
	private Cdstapr cdstapr;
	private Screenstate screenstate;
	private Indicators indicators;
	private Programstatus programstatus;
	private SharedRecordFields sharedRecordFields;
	private Scrn1 scrn1;
	private Genderwin genderwin;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Changecomplete changecomplete;
	private Statechanged statechanged;
	private Indicators_pointer indicators_pointer;
	private MESSAGEParam0 mESSAGEParam0;
	private ISNUMERICReturn iSNUMERICReturn;
	private Pcustid pcustid;
	private Pviewonly pviewonly;

	private List<String> fieldsToUpdate;

	private Record indicatorsSnapshot;

	private Record changeCompleteSnapshot;

	private Record stateChangedSnapshot;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdcus02rContext (@Qualifier("Cdcus02rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	

	/**
	 * Getter for cdcuspr.
	 * @return the cdcuspr
	 */
	public Cdcuspr getCdcuspr() {
		return this.cdcuspr;
	}

	/**
	 * Setter for cdcuspr.
	 * @param reference the new value for cdcuspr
	 */
	public void setCdcuspr(RangeReference reference) {
		this.cdcuspr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for cdstapr.
	 * @return the cdstapr
	 */
	public Cdstapr getCdstapr() {
		return this.cdstapr;
	}

	/**
	 * Setter for cdstapr.
	 * @param reference the new value for cdstapr
	 */
	public void setCdstapr(RangeReference reference) {
		this.cdstapr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for screenstate.
	 * @return the screenstate
	 */
	public Screenstate getScreenstate() {
		return this.screenstate;
	}

	/**
	 * Setter for screenstate.
	 * @param reference the new value for screenstate
	 */
	public void setScreenstate(RangeReference reference) {
		this.screenstate.setBytes(reference.getBytes());
	}

	/**
	 * Getter for indicators.
	 * @return the indicators
	 */
	public Indicators getIndicators() {
		return this.indicators;
	}

	/**
	 * Setter for indicators.
	 * @param reference the new value for indicators
	 */
	public void setIndicators(RangeReference reference) {
		this.indicators.setBytes(reference.getBytes());
	}

	/**
	 * Getter for programstatus.
	 * @return the programstatus
	 */
	public Programstatus getProgramstatus() {
		return this.programstatus;
	}

	/**
	 * Setter for programstatus.
	 * @param reference the new value for programstatus
	 */
	public void setProgramstatus(RangeReference reference) {
		this.programstatus.setBytes(reference.getBytes());
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
	 * Getter for genderwin.
	 * @return the genderwin
	 */
	public Genderwin getGenderwin() {
		return this.genderwin;
	}

	/**
	 * Setter for genderwin.
	 * @param reference the new value for genderwin
	 */
	public void setGenderwin(RangeReference reference) {
		this.genderwin.setBytes(reference.getBytes());
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
	 * Getter for changecomplete.
	 * @return the changecomplete
	 */
	public Changecomplete getChangecomplete() {
		return this.changecomplete;
	}

	/**
	 * Setter for changecomplete.
	 * @param reference the new value for changecomplete
	 */
	public void setChangecomplete(RangeReference reference) {
		this.changecomplete.setBytes(reference.getBytes());
	}

	/**
	 * Getter for statechanged.
	 * @return the statechanged
	 */
	public Statechanged getStatechanged() {
		return this.statechanged;
	}

	/**
	 * Setter for statechanged.
	 * @param reference the new value for statechanged
	 */
	public void setStatechanged(RangeReference reference) {
		this.statechanged.setBytes(reference.getBytes());
	}

	/**
	 * Getter for indicators_pointer.
	 * @return the indicators_pointer
	 */
	public Indicators_pointer getIndicators_pointer() {
		return this.indicators_pointer;
	}

	/**
	 * Setter for indicators_pointer.
	 * @param reference the new value for indicators_pointer
	 */
	public void setIndicators_pointer(RangeReference reference) {
		this.indicators_pointer.setBytes(reference.getBytes());
	}

	/**
	 * Getter for mESSAGEParam0.
	 * @return the mESSAGEParam0
	 */
	public MESSAGEParam0 getMESSAGEParam0() {
		return this.mESSAGEParam0;
	}

	/**
	 * Setter for mESSAGEParam0.
	 * @param reference the new value for mESSAGEParam0
	 */
	public void setMESSAGEParam0(RangeReference reference) {
		this.mESSAGEParam0.setBytes(reference.getBytes());
	}

	/**
	 * Getter for iSNUMERICReturn.
	 * @return the iSNUMERICReturn
	 */
	public ISNUMERICReturn getISNUMERICReturn() {
		return this.iSNUMERICReturn;
	}

	/**
	 * Setter for iSNUMERICReturn.
	 * @param reference the new value for iSNUMERICReturn
	 */
	public void setISNUMERICReturn(RangeReference reference) {
		this.iSNUMERICReturn.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pcustid.
	 * @return the pcustid
	 */
	public Pcustid getPcustid() {
		return this.pcustid;
	}

	/**
	 * Setter for pcustid.
	 * @param reference the new value for pcustid
	 */
	public void setPcustid(RangeReference reference) {
		this.pcustid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pviewonly.
	 * @return the pviewonly
	 */
	public Pviewonly getPviewonly() {
		return this.pviewonly;
	}

	/**
	 * Setter for pviewonly.
	 * @param reference the new value for pviewonly
	 */
	public void setPviewonly(RangeReference reference) {
		this.pviewonly.setBytes(reference.getBytes());
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
	 * Getter for indicatorsSnapshot.
	 * @return the indicatorsSnapshot
	 */
	public Record getIndicatorsSnapshot() {
		return this.indicatorsSnapshot;
	}

	/**
	 * Setter for indicatorsSnapshot.
	 * @param value the new value for indicatorsSnapshot
	 */
	public void setIndicatorsSnapshot(Record value) {
		this.indicatorsSnapshot = value;
	}

	

	/**
	 * Getter for changeCompleteSnapshot.
	 * @return the changeCompleteSnapshot
	 */
	public Record getChangeCompleteSnapshot() {
		return this.changeCompleteSnapshot;
	}

	/**
	 * Setter for changeCompleteSnapshot.
	 * @param value the new value for changeCompleteSnapshot
	 */
	public void setChangeCompleteSnapshot(Record value) {
		this.changeCompleteSnapshot = value;
	}

	

	/**
	 * Getter for stateChangedSnapshot.
	 * @return the stateChangedSnapshot
	 */
	public Record getStateChangedSnapshot() {
		return this.stateChangedSnapshot;
	}

	/**
	 * Setter for stateChangedSnapshot.
	 * @param value the new value for stateChangedSnapshot
	 */
	public void setStateChangedSnapshot(Record value) {
		this.stateChangedSnapshot = value;
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
		this.indicatorsSnapshot = null;
		this.changeCompleteSnapshot = null;
		this.stateChangedSnapshot = null;
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdcuspr = new Cdcuspr(configuration);
		cdstapr = new Cdstapr(configuration);
		screenstate = new Screenstate(configuration);
		indicators = new Indicators(configuration);
		programstatus = new Programstatus(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		scrn1 = new Scrn1(configuration);
		genderwin = new Genderwin(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		changecomplete = new Changecomplete(configuration);
		statechanged = new Statechanged(configuration);
		indicators_pointer = new Indicators_pointer(configuration);
		mESSAGEParam0 = new MESSAGEParam0(configuration);
		iSNUMERICReturn = new ISNUMERICReturn(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		pcustid = new Pcustid(configuration, EntityUtils.getUnlinkedRecord());
		pviewonly = new Pviewonly(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdcuspr, cdstapr, screenstate, indicators, programstatus, sharedRecordFields, scrn1, genderwin, msgsfl, msgsflc, changecomplete, statechanged, indicators_pointer, mESSAGEParam0, iSNUMERICReturn);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdcus02rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Pcustid : [").append(pcustid.toString()).append("]\n");
		toSB.append("Pviewonly : [").append(pviewonly.toString()).append("]\n");
		return toSB.toString();
	}

}
