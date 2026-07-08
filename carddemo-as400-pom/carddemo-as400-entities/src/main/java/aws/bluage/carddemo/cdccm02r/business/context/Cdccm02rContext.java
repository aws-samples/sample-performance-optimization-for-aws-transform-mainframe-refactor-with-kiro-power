package aws.bluage.carddemo.cdccm02r.business.context;
import aws.bluage.carddemo.cdccm02r.business.model.Cdccmpr02;
import aws.bluage.carddemo.cdccm02r.business.model.Dcardnumparam;
import aws.bluage.carddemo.cdccm02r.business.model.Dcvvparam;
import aws.bluage.carddemo.cdccm02r.business.model.Duperrmsg;
import aws.bluage.carddemo.cdccm02r.business.model.Duperrmsgl;
import aws.bluage.carddemo.cdccm02r.business.model.Errorcde;
import aws.bluage.carddemo.cdccm02r.business.model.ISNUMERICReturn;
import aws.bluage.carddemo.cdccm02r.business.model.Indicators;
import aws.bluage.carddemo.cdccm02r.business.model.Indicators_pointer;
import aws.bluage.carddemo.cdccm02r.business.model.Messageid;
import aws.bluage.carddemo.cdccm02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdccm02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdccm02r.business.model.Pcardnum;
import aws.bluage.carddemo.cdccm02r.business.model.Pgmstatus;
import aws.bluage.carddemo.cdccm02r.business.model.Pviewonly;
import aws.bluage.carddemo.cdccm02r.business.model.Scrn1;
import aws.bluage.carddemo.cdccm02r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdccm02r.business.model.Teststring;
import aws.bluage.carddemo.cdccm02r.business.model.Wacctnum;
import aws.bluage.carddemo.cdccm02r.business.model.Wcardnum;
import aws.bluage.carddemo.cdccm02r.business.model.Wcustid;
import aws.bluage.carddemo.cdccm02r.business.model.Wcvv;
import aws.bluage.carddemo.cdccm02r.business.model.Wname;
import aws.bluage.carddemo.common.business.database.cdactp.Cdactpr;
import aws.bluage.carddemo.common.business.database.cdccmp.Cdccmpr;
import aws.bluage.carddemo.common.business.database.cdcusp.Cdcuspr;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
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
 * Data simplifier context Cdccm02rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdccmpr' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Cdccmpr
 * <br></p>
 * 
 * <p>About 'cdactpr' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Cdactpr
 * <br></p>
 * 
 * <p>About 'cdcuspr' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Cdcuspr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indicators' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Indicators
 * <br></p>
 * 
 * <p>About 'pgmstatus' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Pgmstatus
 * <br></p>
 * 
 * <p>About 'errorcde' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Errorcde
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'cdccmpr02' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Cdccmpr02
 * <br></p>
 * 
 * <p>About 'scrn1' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Scrn1
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'wcardnum' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Wcardnum
 * <br></p>
 * 
 * <p>About 'wcvv' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Wcvv
 * <br></p>
 * 
 * <p>About 'wcustid' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Wcustid
 * <br></p>
 * 
 * <p>About 'wacctnum' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Wacctnum
 * <br></p>
 * 
 * <p>About 'messageid' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Messageid
 * <br></p>
 * 
 * <p>About 'duperrmsg' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Duperrmsg
 * <br></p>
 * 
 * <p>About 'duperrmsgl' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Duperrmsgl
 * <br></p>
 * 
 * <p>About 'teststring' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Teststring
 * <br></p>
 * 
 * <p>About 'dcardnumparam' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Dcardnumparam
 * <br></p>
 * 
 * <p>About 'dcvvparam' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Dcvvparam
 * <br></p>
 * 
 * <p>About 'indicators_pointer' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Indicators_pointer
 * <br></p>
 * 
 * <p>About 'wname' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Wname
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'iSNUMERICReturn' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.ISNUMERICReturn
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'pcardnum' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Pcardnum
 * <br></p>
 * 
 * <p>About 'pviewonly' field, <br>uml entity: aws.bluage.carddemo.cdccm02r.business.model.Pviewonly
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdccm02r.business.context.Cdccm02rContext")
@Lazy
@Scope("prototype")
public class Cdccm02rContext extends Blu4ivRuntimeContext {
	
	private Cdccmpr cdccmpr;
	private Cdactpr cdactpr;
	private Cdcuspr cdcuspr;
	private Indicators indicators;
	private Pgmstatus pgmstatus;
	private Errorcde errorcde;
	private SharedRecordFields sharedRecordFields;
	private Cdccmpr02 cdccmpr02;
	private Scrn1 scrn1;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Wcardnum wcardnum;
	private Wcvv wcvv;
	private Wcustid wcustid;
	private Wacctnum wacctnum;
	private Messageid messageid;
	private Duperrmsg duperrmsg;
	private Duperrmsgl duperrmsgl;
	private Teststring teststring;
	private Dcardnumparam dcardnumparam;
	private Dcvvparam dcvvparam;
	private Indicators_pointer indicators_pointer;
	private Wname wname;
	private ISNUMERICReturn iSNUMERICReturn;
	private Pcardnum pcardnum;
	private Pviewonly pviewonly;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdccm02rContext (@Qualifier("Cdccm02rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
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
	 * Getter for errorcde.
	 * @return the errorcde
	 */
	public Errorcde getErrorcde() {
		return this.errorcde;
	}

	/**
	 * Setter for errorcde.
	 * @param reference the new value for errorcde
	 */
	public void setErrorcde(RangeReference reference) {
		this.errorcde.setBytes(reference.getBytes());
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
	 * Getter for cdccmpr02.
	 * @return the cdccmpr02
	 */
	public Cdccmpr02 getCdccmpr02() {
		return this.cdccmpr02;
	}

	/**
	 * Setter for cdccmpr02.
	 * @param reference the new value for cdccmpr02
	 */
	public void setCdccmpr02(RangeReference reference) {
		this.cdccmpr02.setBytes(reference.getBytes());
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
	 * Getter for wcardnum.
	 * @return the wcardnum
	 */
	public Wcardnum getWcardnum() {
		return this.wcardnum;
	}

	/**
	 * Setter for wcardnum.
	 * @param reference the new value for wcardnum
	 */
	public void setWcardnum(RangeReference reference) {
		this.wcardnum.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcvv.
	 * @return the wcvv
	 */
	public Wcvv getWcvv() {
		return this.wcvv;
	}

	/**
	 * Setter for wcvv.
	 * @param reference the new value for wcvv
	 */
	public void setWcvv(RangeReference reference) {
		this.wcvv.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcustid.
	 * @return the wcustid
	 */
	public Wcustid getWcustid() {
		return this.wcustid;
	}

	/**
	 * Setter for wcustid.
	 * @param reference the new value for wcustid
	 */
	public void setWcustid(RangeReference reference) {
		this.wcustid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wacctnum.
	 * @return the wacctnum
	 */
	public Wacctnum getWacctnum() {
		return this.wacctnum;
	}

	/**
	 * Setter for wacctnum.
	 * @param reference the new value for wacctnum
	 */
	public void setWacctnum(RangeReference reference) {
		this.wacctnum.setBytes(reference.getBytes());
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
	 * Getter for duperrmsg.
	 * @return the duperrmsg
	 */
	public Duperrmsg getDuperrmsg() {
		return this.duperrmsg;
	}

	/**
	 * Setter for duperrmsg.
	 * @param reference the new value for duperrmsg
	 */
	public void setDuperrmsg(RangeReference reference) {
		this.duperrmsg.setBytes(reference.getBytes());
	}

	/**
	 * Getter for duperrmsgl.
	 * @return the duperrmsgl
	 */
	public Duperrmsgl getDuperrmsgl() {
		return this.duperrmsgl;
	}

	/**
	 * Setter for duperrmsgl.
	 * @param reference the new value for duperrmsgl
	 */
	public void setDuperrmsgl(RangeReference reference) {
		this.duperrmsgl.setBytes(reference.getBytes());
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
	 * Getter for dcvvparam.
	 * @return the dcvvparam
	 */
	public Dcvvparam getDcvvparam() {
		return this.dcvvparam;
	}

	/**
	 * Setter for dcvvparam.
	 * @param reference the new value for dcvvparam
	 */
	public void setDcvvparam(RangeReference reference) {
		this.dcvvparam.setBytes(reference.getBytes());
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
	 * Getter for wname.
	 * @return the wname
	 */
	public Wname getWname() {
		return this.wname;
	}

	/**
	 * Setter for wname.
	 * @param reference the new value for wname
	 */
	public void setWname(RangeReference reference) {
		this.wname.setBytes(reference.getBytes());
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
	 * Getter for pcardnum.
	 * @return the pcardnum
	 */
	public Pcardnum getPcardnum() {
		return this.pcardnum;
	}

	/**
	 * Setter for pcardnum.
	 * @param reference the new value for pcardnum
	 */
	public void setPcardnum(RangeReference reference) {
		this.pcardnum.setBytes(reference.getBytes());
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
		cdccmpr = new Cdccmpr(configuration);
		cdactpr = new Cdactpr(configuration);
		indicators = new Indicators(configuration);
		pgmstatus = new Pgmstatus(configuration);
		errorcde = new Errorcde(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		cdccmpr02 = new Cdccmpr02(configuration);
		scrn1 = new Scrn1(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		wcardnum = new Wcardnum(configuration);
		wcvv = new Wcvv(configuration);
		wcustid = new Wcustid(configuration);
		wacctnum = new Wacctnum(configuration);
		messageid = new Messageid(configuration);
		duperrmsg = new Duperrmsg(configuration);
		duperrmsgl = new Duperrmsgl(configuration);
		teststring = new Teststring(configuration);
		dcardnumparam = new Dcardnumparam(configuration);
		dcvvparam = new Dcvvparam(configuration);
		indicators_pointer = new Indicators_pointer(configuration);
		wname = new Wname(configuration);
		iSNUMERICReturn = new ISNUMERICReturn(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		pcardnum = new Pcardnum(configuration, EntityUtils.getUnlinkedRecord());
		pviewonly = new Pviewonly(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdcuspr, cdccmpr, cdactpr, indicators, pgmstatus, errorcde, sharedRecordFields, cdccmpr02, scrn1, msgsfl, msgsflc, wcardnum, wcvv, wcustid, wacctnum, messageid, duperrmsg, duperrmsgl, teststring, dcardnumparam, dcvvparam, indicators_pointer, wname, iSNUMERICReturn);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdccm02rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Pcardnum : [").append(pcardnum.toString()).append("]\n");
		toSB.append("Pviewonly : [").append(pviewonly.toString()).append("]\n");
		return toSB.toString();
	}

}
