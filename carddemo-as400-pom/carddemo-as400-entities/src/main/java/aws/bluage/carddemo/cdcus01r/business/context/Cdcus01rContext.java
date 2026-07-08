package aws.bluage.carddemo.cdcus01r.business.context;
import aws.bluage.carddemo.cdcus01r.business.model.Cdactpr3;
import aws.bluage.carddemo.cdcus01r.business.model.Cpagesize;
import aws.bluage.carddemo.cdcus01r.business.model.Ctl1;
import aws.bluage.carddemo.cdcus01r.business.model.Delerrwin;
import aws.bluage.carddemo.cdcus01r.business.model.Delwin;
import aws.bluage.carddemo.cdcus01r.business.model.Header1;
import aws.bluage.carddemo.cdcus01r.business.model.Header2;
import aws.bluage.carddemo.cdcus01r.business.model.ISNUMERICReturn;
import aws.bluage.carddemo.cdcus01r.business.model.Indicatords;
import aws.bluage.carddemo.cdcus01r.business.model.Indicatords_pointer;
import aws.bluage.carddemo.cdcus01r.business.model.MESSAGEParam0;
import aws.bluage.carddemo.cdcus01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdcus01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdcus01r.business.model.Programstatus;
import aws.bluage.carddemo.cdcus01r.business.model.Sfl1;
import aws.bluage.carddemo.cdcus01r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdcus01r.business.model.Wfirstkey;
import aws.bluage.carddemo.cdcus01r.business.model.Wlastkey;
import aws.bluage.carddemo.cdcus01r.business.model.Wposition;
import aws.bluage.carddemo.common.business.database.cdactp.Cdactpr;
import aws.bluage.carddemo.common.business.database.cdcusp.Cdcuspr;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
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
 * Data simplifier context Cdcus01rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdcuspr' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Cdcuspr
 * <br></p>
 * 
 * <p>About 'cdactpr' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Cdactpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indicatords' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Indicatords
 * <br></p>
 * 
 * <p>About 'programstatus' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Programstatus
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'cdactpr3' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Cdactpr3
 * <br></p>
 * 
 * <p>About 'header1' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Header1
 * <br></p>
 * 
 * <p>About 'header2' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Header2
 * <br></p>
 * 
 * <p>About 'sfl1' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Sfl1
 * <br></p>
 * 
 * <p>About 'ctl1' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Ctl1
 * <br></p>
 * 
 * <p>About 'delwin' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Delwin
 * <br></p>
 * 
 * <p>About 'delerrwin' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Delerrwin
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'wfirstkey' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Wfirstkey
 * <br></p>
 * 
 * <p>About 'wlastkey' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Wlastkey
 * <br></p>
 * 
 * <p>About 'wposition' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Wposition
 * <br></p>
 * 
 * <p>About 'indicatords_pointer' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Indicatords_pointer
 * <br></p>
 * 
 * <p>About 'cpagesize' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.Cpagesize
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'iSNUMERICReturn' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.ISNUMERICReturn
 * <br></p>
 * 
 * <p>About 'mESSAGEParam0' field, <br>uml entity: aws.bluage.carddemo.cdcus01r.business.model.MESSAGEParam0
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdcus01r.business.context.Cdcus01rContext")
@Lazy
@Scope("prototype")
public class Cdcus01rContext extends Blu4ivRuntimeContext {
	
	private Cdcuspr cdcuspr;
	private Cdactpr cdactpr;
	private Indicatords indicatords;
	private Programstatus programstatus;
	private SharedRecordFields sharedRecordFields;
	private Cdactpr3 cdactpr3;
	private Header1 header1;
	private Header2 header2;
	private Sfl1 sfl1;
	private Ctl1 ctl1;
	private Delwin delwin;
	private Delerrwin delerrwin;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Wfirstkey wfirstkey;
	private Wlastkey wlastkey;
	private Wposition wposition;
	private Indicatords_pointer indicatords_pointer;
	private Cpagesize cpagesize;
	private ISNUMERICReturn iSNUMERICReturn;
	private MESSAGEParam0 mESSAGEParam0;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdcus01rContext (@Qualifier("Cdcus01rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
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
	 * Getter for cdactpr.
	 * @return the cdactpr
	 */
	public Cdactpr getCdactpr() {
		return this.cdactpr;
	}

	/**
	 * Setter for cdactpr.
	 * @param reference the new value for cdactpr
	 */
	public void setCdactpr(RangeReference reference) {
		this.cdactpr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for indicatords.
	 * @return the indicatords
	 */
	public Indicatords getIndicatords() {
		return this.indicatords;
	}

	/**
	 * Setter for indicatords.
	 * @param reference the new value for indicatords
	 */
	public void setIndicatords(RangeReference reference) {
		this.indicatords.setBytes(reference.getBytes());
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
	 * Getter for cdactpr3.
	 * @return the cdactpr3
	 */
	public Cdactpr3 getCdactpr3() {
		return this.cdactpr3;
	}

	/**
	 * Setter for cdactpr3.
	 * @param reference the new value for cdactpr3
	 */
	public void setCdactpr3(RangeReference reference) {
		this.cdactpr3.setBytes(reference.getBytes());
	}

	/**
	 * Getter for header1.
	 * @return the header1
	 */
	public Header1 getHeader1() {
		return this.header1;
	}

	/**
	 * Setter for header1.
	 * @param reference the new value for header1
	 */
	public void setHeader1(RangeReference reference) {
		this.header1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for header2.
	 * @return the header2
	 */
	public Header2 getHeader2() {
		return this.header2;
	}

	/**
	 * Setter for header2.
	 * @param reference the new value for header2
	 */
	public void setHeader2(RangeReference reference) {
		this.header2.setBytes(reference.getBytes());
	}

	/**
	 * Getter for sfl1.
	 * @return the sfl1
	 */
	public Sfl1 getSfl1() {
		return this.sfl1;
	}

	/**
	 * Setter for sfl1.
	 * @param reference the new value for sfl1
	 */
	public void setSfl1(RangeReference reference) {
		this.sfl1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ctl1.
	 * @return the ctl1
	 */
	public Ctl1 getCtl1() {
		return this.ctl1;
	}

	/**
	 * Setter for ctl1.
	 * @param reference the new value for ctl1
	 */
	public void setCtl1(RangeReference reference) {
		this.ctl1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for delwin.
	 * @return the delwin
	 */
	public Delwin getDelwin() {
		return this.delwin;
	}

	/**
	 * Setter for delwin.
	 * @param reference the new value for delwin
	 */
	public void setDelwin(RangeReference reference) {
		this.delwin.setBytes(reference.getBytes());
	}

	/**
	 * Getter for delerrwin.
	 * @return the delerrwin
	 */
	public Delerrwin getDelerrwin() {
		return this.delerrwin;
	}

	/**
	 * Setter for delerrwin.
	 * @param reference the new value for delerrwin
	 */
	public void setDelerrwin(RangeReference reference) {
		this.delerrwin.setBytes(reference.getBytes());
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
	 * Getter for wfirstkey.
	 * @return the wfirstkey
	 */
	public Wfirstkey getWfirstkey() {
		return this.wfirstkey;
	}

	/**
	 * Setter for wfirstkey.
	 * @param reference the new value for wfirstkey
	 */
	public void setWfirstkey(RangeReference reference) {
		this.wfirstkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wlastkey.
	 * @return the wlastkey
	 */
	public Wlastkey getWlastkey() {
		return this.wlastkey;
	}

	/**
	 * Setter for wlastkey.
	 * @param reference the new value for wlastkey
	 */
	public void setWlastkey(RangeReference reference) {
		this.wlastkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wposition.
	 * @return the wposition
	 */
	public Wposition getWposition() {
		return this.wposition;
	}

	/**
	 * Setter for wposition.
	 * @param reference the new value for wposition
	 */
	public void setWposition(RangeReference reference) {
		this.wposition.setBytes(reference.getBytes());
	}

	/**
	 * Getter for indicatords_pointer.
	 * @return the indicatords_pointer
	 */
	public Indicatords_pointer getIndicatords_pointer() {
		return this.indicatords_pointer;
	}

	/**
	 * Setter for indicatords_pointer.
	 * @param reference the new value for indicatords_pointer
	 */
	public void setIndicatords_pointer(RangeReference reference) {
		this.indicatords_pointer.setBytes(reference.getBytes());
	}

	/**
	 * Getter for cpagesize.
	 * @return the cpagesize
	 */
	public Cpagesize getCpagesize() {
		return this.cpagesize;
	}

	/**
	 * Setter for cpagesize.
	 * @param reference the new value for cpagesize
	 */
	public void setCpagesize(RangeReference reference) {
		this.cpagesize.setBytes(reference.getBytes());
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
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdcuspr = new Cdcuspr(configuration);
		cdactpr = new Cdactpr(configuration);
		indicatords = new Indicatords(configuration);
		programstatus = new Programstatus(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		cdactpr3 = new Cdactpr3(configuration);
		header1 = new Header1(configuration);
		header2 = new Header2(configuration);
		sfl1 = new Sfl1(configuration);
		ctl1 = new Ctl1(configuration);
		delwin = new Delwin(configuration);
		delerrwin = new Delerrwin(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		wfirstkey = new Wfirstkey(configuration);
		wlastkey = new Wlastkey(configuration);
		wposition = new Wposition(configuration);
		indicatords_pointer = new Indicatords_pointer(configuration);
		cpagesize = new Cpagesize(configuration);
		iSNUMERICReturn = new ISNUMERICReturn(configuration);
		mESSAGEParam0 = new MESSAGEParam0(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdcuspr, cdactpr, indicatords, programstatus, sharedRecordFields, cdactpr3, header1, header2, sfl1, ctl1, delwin, delerrwin, msgsfl, msgsflc, wfirstkey, wlastkey, wposition, indicatords_pointer, cpagesize, iSNUMERICReturn, mESSAGEParam0);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdcus01rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
