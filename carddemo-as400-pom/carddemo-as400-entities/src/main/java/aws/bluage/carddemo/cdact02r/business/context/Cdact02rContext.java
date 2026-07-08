package aws.bluage.carddemo.cdact02r.business.context;
import aws.bluage.carddemo.cdact02r.business.model.Errorid;
import aws.bluage.carddemo.cdact02r.business.model.ISCURRENCYReturn;
import aws.bluage.carddemo.cdact02r.business.model.ISNUMERICReturn;
import aws.bluage.carddemo.cdact02r.business.model.Indds;
import aws.bluage.carddemo.cdact02r.business.model.Indds_pointer;
import aws.bluage.carddemo.cdact02r.business.model.Itemschanged;
import aws.bluage.carddemo.cdact02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdact02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdact02r.business.model.Pacctnum;
import aws.bluage.carddemo.cdact02r.business.model.Pgmstatus;
import aws.bluage.carddemo.cdact02r.business.model.Pviewonly;
import aws.bluage.carddemo.cdact02r.business.model.Screenstate;
import aws.bluage.carddemo.cdact02r.business.model.Scrn1;
import aws.bluage.carddemo.cdact02r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdact02r.business.model.Testnumeric;
import aws.bluage.carddemo.cdact02r.business.model.Teststring;
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
 * Data simplifier context Cdact02rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdactpr' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Cdactpr
 * <br></p>
 * 
 * <p>About 'cdcuspr' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Cdcuspr
 * <br></p>
 * 
 * <p>About 'cdccmpr' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Cdccmpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indds' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Indds
 * <br></p>
 * 
 * <p>About 'pgmstatus' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Pgmstatus
 * <br></p>
 * 
 * <p>About 'screenstate' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Screenstate
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'scrn1' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Scrn1
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'errorid' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Errorid
 * <br></p>
 * 
 * <p>About 'teststring' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Teststring
 * <br></p>
 * 
 * <p>About 'testnumeric' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Testnumeric
 * <br></p>
 * 
 * <p>About 'itemschanged' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Itemschanged
 * <br></p>
 * 
 * <p>About 'indds_pointer' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Indds_pointer
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'iSNUMERICReturn' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.ISNUMERICReturn
 * <br></p>
 * 
 * <p>About 'iSCURRENCYReturn' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.ISCURRENCYReturn
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'pacctnum' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Pacctnum
 * <br></p>
 * 
 * <p>About 'pviewonly' field, <br>uml entity: aws.bluage.carddemo.cdact02r.business.model.Pviewonly
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdact02r.business.context.Cdact02rContext")
@Lazy
@Scope("prototype")
public class Cdact02rContext extends Blu4ivRuntimeContext {
	
	private Cdactpr cdactpr;
	private Cdcuspr cdcuspr;
	private Cdccmpr cdccmpr;
	private Indds indds;
	private Pgmstatus pgmstatus;
	private Screenstate screenstate;
	private SharedRecordFields sharedRecordFields;
	private Scrn1 scrn1;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Errorid errorid;
	private Teststring teststring;
	private Testnumeric testnumeric;
	private Itemschanged itemschanged;
	private Indds_pointer indds_pointer;
	private ISNUMERICReturn iSNUMERICReturn;
	private ISCURRENCYReturn iSCURRENCYReturn;
	private Pacctnum pacctnum;
	private Pviewonly pviewonly;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdact02rContext (@Qualifier("Cdact02rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
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
		if (this.cdactpr == null) {
			throw new IllegalStateException("cdactpr is not initialized");
		}
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
		if (this.cdcuspr == null) {
			throw new IllegalStateException("cdcuspr is not initialized");
		}
		this.cdcuspr.setBytes(reference.getBytes());
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
		if (this.cdccmpr == null) {
			throw new IllegalStateException("cdccmpr is not initialized");
		}
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
		if (this.indds == null) {
			throw new IllegalStateException("indds is not initialized");
		}
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
	 * Getter for errorid.
	 * @return the errorid
	 */
	public Errorid getErrorid() {
		return this.errorid;
	}

	/**
	 * Setter for errorid.
	 * @param reference the new value for errorid
	 */
	public void setErrorid(RangeReference reference) {
		this.errorid.setBytes(reference.getBytes());
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
	 * Getter for testnumeric.
	 * @return the testnumeric
	 */
	public Testnumeric getTestnumeric() {
		return this.testnumeric;
	}

	/**
	 * Setter for testnumeric.
	 * @param reference the new value for testnumeric
	 */
	public void setTestnumeric(RangeReference reference) {
		this.testnumeric.setBytes(reference.getBytes());
	}

	/**
	 * Getter for itemschanged.
	 * @return the itemschanged
	 */
	public Itemschanged getItemschanged() {
		return this.itemschanged;
	}

	/**
	 * Setter for itemschanged.
	 * @param reference the new value for itemschanged
	 */
	public void setItemschanged(RangeReference reference) {
		this.itemschanged.setBytes(reference.getBytes());
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
	 * Getter for pacctnum.
	 * @return the pacctnum
	 */
	public Pacctnum getPacctnum() {
		return this.pacctnum;
	}

	/**
	 * Setter for pacctnum.
	 * @param reference the new value for pacctnum
	 */
	public void setPacctnum(RangeReference reference) {
		if (this.pacctnum == null) {
			throw new IllegalStateException("pacctnum is not initialized");
		}
		this.pacctnum.setBytes(reference.getBytes());
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
		if (this.pviewonly == null) {
			throw new IllegalStateException("pviewonly is not initialized");
		}
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
		if (recordEntities != null) {
			recordEntities.stream().forEach(e -> e.reset());
		}
		this.fieldsToUpdate = null;
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdcuspr = new Cdcuspr(configuration);
		cdccmpr = new Cdccmpr(configuration);
		cdactpr = new Cdactpr(configuration);
		indds = new Indds(configuration);
		pgmstatus = new Pgmstatus(configuration);
		screenstate = new Screenstate(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		scrn1 = new Scrn1(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		errorid = new Errorid(configuration);
		teststring = new Teststring(configuration);
		testnumeric = new Testnumeric(configuration);
		itemschanged = new Itemschanged(configuration);
		indds_pointer = new Indds_pointer(configuration);
		iSNUMERICReturn = new ISNUMERICReturn(configuration);
		iSCURRENCYReturn = new ISCURRENCYReturn(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		pacctnum = new Pacctnum(configuration, EntityUtils.getUnlinkedRecord());
		pviewonly = new Pviewonly(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdcuspr, cdccmpr, cdactpr, indds, pgmstatus, screenstate, sharedRecordFields, scrn1, msgsfl, msgsflc, errorid, teststring, testnumeric, itemschanged, indds_pointer, iSNUMERICReturn, iSCURRENCYReturn);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdact02rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Pacctnum : [").append(pacctnum.toString()).append("]\n");
		toSB.append("Pviewonly : [").append(pviewonly.toString()).append("]\n");
		return toSB.toString();
	}

}
