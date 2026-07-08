package aws.bluage.carddemo.cdccm01r.business.context;
import aws.bluage.carddemo.cdccm01r.business.model.Csflsize;
import aws.bluage.carddemo.cdccm01r.business.model.Ctl1;
import aws.bluage.carddemo.cdccm01r.business.model.Dcardnumparam;
import aws.bluage.carddemo.cdccm01r.business.model.Delerrwin;
import aws.bluage.carddemo.cdccm01r.business.model.Delwin;
import aws.bluage.carddemo.cdccm01r.business.model.Header1;
import aws.bluage.carddemo.cdccm01r.business.model.Header2;
import aws.bluage.carddemo.cdccm01r.business.model.ISNUMERICReturn;
import aws.bluage.carddemo.cdccm01r.business.model.Indicatords;
import aws.bluage.carddemo.cdccm01r.business.model.Indicatords_pointer;
import aws.bluage.carddemo.cdccm01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdccm01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdccm01r.business.model.Mypsds;
import aws.bluage.carddemo.cdccm01r.business.model.SHOWMESSAGEParam0;
import aws.bluage.carddemo.cdccm01r.business.model.Sfl1;
import aws.bluage.carddemo.cdccm01r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdccm01r.business.model.Statuswin;
import aws.bluage.carddemo.cdccm01r.business.model.Wfirstkey;
import aws.bluage.carddemo.cdccm01r.business.model.Wlastkey;
import aws.bluage.carddemo.cdccm01r.business.model.Wposition;
import aws.bluage.carddemo.common.business.database.cdccmp.Cdccmpr;
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
 * Data simplifier context Cdccm01rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdccmpr' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Cdccmpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'mypsds' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Mypsds
 * <br></p>
 * 
 * <p>About 'indicatords' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Indicatords
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'header1' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Header1
 * <br></p>
 * 
 * <p>About 'header2' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Header2
 * <br></p>
 * 
 * <p>About 'sfl1' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Sfl1
 * <br></p>
 * 
 * <p>About 'ctl1' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Ctl1
 * <br></p>
 * 
 * <p>About 'delwin' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Delwin
 * <br></p>
 * 
 * <p>About 'delerrwin' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Delerrwin
 * <br></p>
 * 
 * <p>About 'statuswin' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Statuswin
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'dcardnumparam' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Dcardnumparam
 * <br></p>
 * 
 * <p>About 'wfirstkey' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Wfirstkey
 * <br></p>
 * 
 * <p>About 'wlastkey' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Wlastkey
 * <br></p>
 * 
 * <p>About 'wposition' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Wposition
 * <br></p>
 * 
 * <p>About 'indicatords_pointer' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Indicatords_pointer
 * <br></p>
 * 
 * <p>About 'csflsize' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.Csflsize
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'iSNUMERICReturn' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.ISNUMERICReturn
 * <br></p>
 * 
 * <p>About 'sHOWMESSAGEParam0' field, <br>uml entity: aws.bluage.carddemo.cdccm01r.business.model.SHOWMESSAGEParam0
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdccm01r.business.context.Cdccm01rContext")
@Lazy
@Scope("prototype")
public class Cdccm01rContext extends Blu4ivRuntimeContext {
	
	private Cdccmpr cdccmpr;
	private Mypsds mypsds;
	private Indicatords indicatords;
	private SharedRecordFields sharedRecordFields;
	private Header1 header1;
	private Header2 header2;
	private Sfl1 sfl1;
	private Ctl1 ctl1;
	private Delwin delwin;
	private Delerrwin delerrwin;
	private Statuswin statuswin;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Dcardnumparam dcardnumparam;
	private Wfirstkey wfirstkey;
	private Wlastkey wlastkey;
	private Wposition wposition;
	private Indicatords_pointer indicatords_pointer;
	private Csflsize csflsize;
	private ISNUMERICReturn iSNUMERICReturn;
	private SHOWMESSAGEParam0 sHOWMESSAGEParam0;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdccm01rContext (@Qualifier("Cdccm01rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
		initRecordEntities();
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
	 * Getter for mypsds.
	 * @return the mypsds
	 */
	public Mypsds getMypsds() {
		return this.mypsds;
	}

	/**
	 * Setter for mypsds.
	 * @param reference the new value for mypsds
	 */
	public void setMypsds(RangeReference reference) {
		this.mypsds.setBytes(reference.getBytes());
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
	 * Getter for statuswin.
	 * @return the statuswin
	 */
	public Statuswin getStatuswin() {
		return this.statuswin;
	}

	/**
	 * Setter for statuswin.
	 * @param reference the new value for statuswin
	 */
	public void setStatuswin(RangeReference reference) {
		this.statuswin.setBytes(reference.getBytes());
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
	 * Getter for dcardnumparam.
	 * @return the dcardnumparam
	 */
	public Dcardnumparam getDcardnumparam() {
		return this.dcardnumparam;
	}

	/**
	 * Setter for dcardnumparam.
	 * @param reference the new value for dcardnumparam
	 */
	public void setDcardnumparam(RangeReference reference) {
		this.dcardnumparam.setBytes(reference.getBytes());
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
	 * Getter for csflsize.
	 * @return the csflsize
	 */
	public Csflsize getCsflsize() {
		return this.csflsize;
	}

	/**
	 * Setter for csflsize.
	 * @param reference the new value for csflsize
	 */
	public void setCsflsize(RangeReference reference) {
		this.csflsize.setBytes(reference.getBytes());
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
	 * Getter for sHOWMESSAGEParam0.
	 * @return the sHOWMESSAGEParam0
	 */
	public SHOWMESSAGEParam0 getSHOWMESSAGEParam0() {
		return this.sHOWMESSAGEParam0;
	}

	/**
	 * Setter for sHOWMESSAGEParam0.
	 * @param reference the new value for sHOWMESSAGEParam0
	 */
	public void setSHOWMESSAGEParam0(RangeReference reference) {
		this.sHOWMESSAGEParam0.setBytes(reference.getBytes());
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
		cdccmpr = new Cdccmpr(configuration);
		mypsds = new Mypsds(configuration);
		indicatords = new Indicatords(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		header1 = new Header1(configuration);
		header2 = new Header2(configuration);
		sfl1 = new Sfl1(configuration);
		ctl1 = new Ctl1(configuration);
		delwin = new Delwin(configuration);
		delerrwin = new Delerrwin(configuration);
		statuswin = new Statuswin(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		dcardnumparam = new Dcardnumparam(configuration);
		wfirstkey = new Wfirstkey(configuration);
		wlastkey = new Wlastkey(configuration);
		wposition = new Wposition(configuration);
		indicatords_pointer = new Indicatords_pointer(configuration);
		csflsize = new Csflsize(configuration);
		iSNUMERICReturn = new ISNUMERICReturn(configuration);
		sHOWMESSAGEParam0 = new SHOWMESSAGEParam0(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdccmpr, mypsds, indicatords, sharedRecordFields, header1, header2, sfl1, ctl1, delwin, delerrwin, statuswin, msgsfl, msgsflc, dcardnumparam, wfirstkey, wlastkey, wposition, indicatords_pointer, csflsize, iSNUMERICReturn, sHOWMESSAGEParam0);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdccm01rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
