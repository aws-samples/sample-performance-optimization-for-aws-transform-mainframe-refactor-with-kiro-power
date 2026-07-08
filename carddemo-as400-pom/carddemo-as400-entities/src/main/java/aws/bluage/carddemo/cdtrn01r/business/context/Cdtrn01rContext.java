package aws.bluage.carddemo.cdtrn01r.business.context;
import aws.bluage.carddemo.cdtrn01r.business.model.Cpagesize;
import aws.bluage.carddemo.cdtrn01r.business.model.Dsshindds;
import aws.bluage.carddemo.cdtrn01r.business.model.Dsshindds_pointer;
import aws.bluage.carddemo.cdtrn01r.business.model.Header;
import aws.bluage.carddemo.cdtrn01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdtrn01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdtrn01r.business.model.Optarr;
import aws.bluage.carddemo.cdtrn01r.business.model.ProgramStatus;
import aws.bluage.carddemo.cdtrn01r.business.model.Sfl1;
import aws.bluage.carddemo.cdtrn01r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdtrn01r.business.model.Wcallstkcntr;
import aws.bluage.carddemo.cdtrn01r.business.model.Wcallstkent;
import aws.bluage.carddemo.cdtrn01r.business.model.Wcntr;
import aws.bluage.carddemo.cdtrn01r.business.model.Werror;
import aws.bluage.carddemo.cdtrn01r.business.model.Wfkey;
import aws.bluage.carddemo.cdtrn01r.business.model.Widx;
import aws.bluage.carddemo.cdtrn01r.business.model.Wleaveprogram;
import aws.bluage.carddemo.cdtrn01r.business.model.Wlkey;
import aws.bluage.carddemo.cdtrn01r.business.model.Wmessage;
import aws.bluage.carddemo.cdtrn01r.business.model.Wmessageid;
import aws.bluage.carddemo.cdtrn01r.business.model.Wmessagekey;
import aws.bluage.carddemo.cdtrn01r.business.model.Wmessagermv;
import aws.bluage.carddemo.cdtrn01r.business.model.Wmsgdata;
import aws.bluage.carddemo.cdtrn01r.business.model.Wmsgdtalen;
import aws.bluage.carddemo.cdtrn01r.business.model.Wmsgtype;
import aws.bluage.carddemo.cdtrn01r.business.model.Wpos;
import aws.bluage.carddemo.cdtrn01r.business.model.Wposto;
import aws.bluage.carddemo.cdtrn01r.business.model.Wqualmsgf;
import aws.bluage.carddemo.cdtrn01r.business.model.Wrrn;
import aws.bluage.carddemo.cdtrn01r.business.model.Wtrnkey;
import aws.bluage.carddemo.common.business.database.cdtrnp.Cdtrnpr;
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
 * Data simplifier context Cdtrn01rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdtrnpr' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Cdtrnpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'dsshindds' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Dsshindds
 * <br></p>
 * 
 * <p>About 'programStatus' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.ProgramStatus
 * <br></p>
 * 
 * <p>About 'optarr' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Optarr
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'header' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Header
 * <br></p>
 * 
 * <p>About 'sfl1' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Sfl1
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'wmessageid' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wmessageid
 * <br></p>
 * 
 * <p>About 'wqualmsgf' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wqualmsgf
 * <br></p>
 * 
 * <p>About 'wmsgdata' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wmsgdata
 * <br></p>
 * 
 * <p>About 'wmsgdtalen' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wmsgdtalen
 * <br></p>
 * 
 * <p>About 'wmsgtype' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wmsgtype
 * <br></p>
 * 
 * <p>About 'wcallstkent' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wcallstkent
 * <br></p>
 * 
 * <p>About 'wcallstkcntr' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wcallstkcntr
 * <br></p>
 * 
 * <p>About 'wmessagekey' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wmessagekey
 * <br></p>
 * 
 * <p>About 'wmessagermv' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wmessagermv
 * <br></p>
 * 
 * <p>About 'wrrn' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wrrn
 * <br></p>
 * 
 * <p>About 'wpos' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wpos
 * <br></p>
 * 
 * <p>About 'widx' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Widx
 * <br></p>
 * 
 * <p>About 'wcntr' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wcntr
 * <br></p>
 * 
 * <p>About 'wleaveprogram' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wleaveprogram
 * <br></p>
 * 
 * <p>About 'werror' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Werror
 * <br></p>
 * 
 * <p>About 'wmessage' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wmessage
 * <br></p>
 * 
 * <p>About 'wfkey' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wfkey
 * <br></p>
 * 
 * <p>About 'wlkey' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wlkey
 * <br></p>
 * 
 * <p>About 'wtrnkey' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wtrnkey
 * <br></p>
 * 
 * <p>About 'wposto' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Wposto
 * <br></p>
 * 
 * <p>About 'dsshindds_pointer' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Dsshindds_pointer
 * <br></p>
 * 
 * <p>About 'cpagesize' field, <br>uml entity: aws.bluage.carddemo.cdtrn01r.business.model.Cpagesize
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdtrn01r.business.context.Cdtrn01rContext")
@Lazy
@Scope("prototype")
public class Cdtrn01rContext extends Blu4ivRuntimeContext {
	
	private Cdtrnpr cdtrnpr;
	private Dsshindds dsshindds;
	private ProgramStatus programStatus;
	private Optarr optarr;
	private SharedRecordFields sharedRecordFields;
	private Header header;
	private Sfl1 sfl1;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Wmessageid wmessageid;
	private Wqualmsgf wqualmsgf;
	private Wmsgdata wmsgdata;
	private Wmsgdtalen wmsgdtalen;
	private Wmsgtype wmsgtype;
	private Wcallstkent wcallstkent;
	private Wcallstkcntr wcallstkcntr;
	private Wmessagekey wmessagekey;
	private Wmessagermv wmessagermv;
	private Wrrn wrrn;
	private Wpos wpos;
	private Widx widx;
	private Wcntr wcntr;
	private Wleaveprogram wleaveprogram;
	private Werror werror;
	private Wmessage wmessage;
	private Wfkey wfkey;
	private Wlkey wlkey;
	private Wtrnkey wtrnkey;
	private Wposto wposto;
	private Dsshindds_pointer dsshindds_pointer;
	private Cpagesize cpagesize;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdtrn01rContext (@Qualifier("Cdtrn01rContextConfiguration") Configuration configuration) {
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
	 * Getter for dsshindds.
	 * @return the dsshindds
	 */
	public Dsshindds getDsshindds() {
		return this.dsshindds;
	}

	/**
	 * Setter for dsshindds.
	 * @param reference the new value for dsshindds
	 */
	public void setDsshindds(RangeReference reference) {
		this.dsshindds.setBytes(reference.getBytes());
	}

	/**
	 * Getter for programStatus.
	 * @return the programStatus
	 */
	public ProgramStatus getProgramStatus() {
		return this.programStatus;
	}

	/**
	 * Setter for programStatus.
	 * @param reference the new value for programStatus
	 */
	public void setProgramStatus(RangeReference reference) {
		this.programStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for optarr.
	 * @return the optarr
	 */
	public Optarr getOptarr() {
		return this.optarr;
	}

	/**
	 * Setter for optarr.
	 * @param reference the new value for optarr
	 */
	public void setOptarr(RangeReference reference) {
		this.optarr.setBytes(reference.getBytes());
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
	 * Getter for header.
	 * @return the header
	 */
	public Header getHeader() {
		return this.header;
	}

	/**
	 * Setter for header.
	 * @param reference the new value for header
	 */
	public void setHeader(RangeReference reference) {
		this.header.setBytes(reference.getBytes());
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
	 * Getter for wmessageid.
	 * @return the wmessageid
	 */
	public Wmessageid getWmessageid() {
		return this.wmessageid;
	}

	/**
	 * Setter for wmessageid.
	 * @param reference the new value for wmessageid
	 */
	public void setWmessageid(RangeReference reference) {
		this.wmessageid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wqualmsgf.
	 * @return the wqualmsgf
	 */
	public Wqualmsgf getWqualmsgf() {
		return this.wqualmsgf;
	}

	/**
	 * Setter for wqualmsgf.
	 * @param reference the new value for wqualmsgf
	 */
	public void setWqualmsgf(RangeReference reference) {
		this.wqualmsgf.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wmsgdata.
	 * @return the wmsgdata
	 */
	public Wmsgdata getWmsgdata() {
		return this.wmsgdata;
	}

	/**
	 * Setter for wmsgdata.
	 * @param reference the new value for wmsgdata
	 */
	public void setWmsgdata(RangeReference reference) {
		this.wmsgdata.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wmsgdtalen.
	 * @return the wmsgdtalen
	 */
	public Wmsgdtalen getWmsgdtalen() {
		return this.wmsgdtalen;
	}

	/**
	 * Setter for wmsgdtalen.
	 * @param reference the new value for wmsgdtalen
	 */
	public void setWmsgdtalen(RangeReference reference) {
		this.wmsgdtalen.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wmsgtype.
	 * @return the wmsgtype
	 */
	public Wmsgtype getWmsgtype() {
		return this.wmsgtype;
	}

	/**
	 * Setter for wmsgtype.
	 * @param reference the new value for wmsgtype
	 */
	public void setWmsgtype(RangeReference reference) {
		this.wmsgtype.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcallstkent.
	 * @return the wcallstkent
	 */
	public Wcallstkent getWcallstkent() {
		return this.wcallstkent;
	}

	/**
	 * Setter for wcallstkent.
	 * @param reference the new value for wcallstkent
	 */
	public void setWcallstkent(RangeReference reference) {
		this.wcallstkent.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcallstkcntr.
	 * @return the wcallstkcntr
	 */
	public Wcallstkcntr getWcallstkcntr() {
		return this.wcallstkcntr;
	}

	/**
	 * Setter for wcallstkcntr.
	 * @param reference the new value for wcallstkcntr
	 */
	public void setWcallstkcntr(RangeReference reference) {
		this.wcallstkcntr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wmessagekey.
	 * @return the wmessagekey
	 */
	public Wmessagekey getWmessagekey() {
		return this.wmessagekey;
	}

	/**
	 * Setter for wmessagekey.
	 * @param reference the new value for wmessagekey
	 */
	public void setWmessagekey(RangeReference reference) {
		this.wmessagekey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wmessagermv.
	 * @return the wmessagermv
	 */
	public Wmessagermv getWmessagermv() {
		return this.wmessagermv;
	}

	/**
	 * Setter for wmessagermv.
	 * @param reference the new value for wmessagermv
	 */
	public void setWmessagermv(RangeReference reference) {
		this.wmessagermv.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wrrn.
	 * @return the wrrn
	 */
	public Wrrn getWrrn() {
		return this.wrrn;
	}

	/**
	 * Setter for wrrn.
	 * @param reference the new value for wrrn
	 */
	public void setWrrn(RangeReference reference) {
		this.wrrn.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wpos.
	 * @return the wpos
	 */
	public Wpos getWpos() {
		return this.wpos;
	}

	/**
	 * Setter for wpos.
	 * @param reference the new value for wpos
	 */
	public void setWpos(RangeReference reference) {
		this.wpos.setBytes(reference.getBytes());
	}

	/**
	 * Getter for widx.
	 * @return the widx
	 */
	public Widx getWidx() {
		return this.widx;
	}

	/**
	 * Setter for widx.
	 * @param reference the new value for widx
	 */
	public void setWidx(RangeReference reference) {
		this.widx.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcntr.
	 * @return the wcntr
	 */
	public Wcntr getWcntr() {
		return this.wcntr;
	}

	/**
	 * Setter for wcntr.
	 * @param reference the new value for wcntr
	 */
	public void setWcntr(RangeReference reference) {
		this.wcntr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wleaveprogram.
	 * @return the wleaveprogram
	 */
	public Wleaveprogram getWleaveprogram() {
		return this.wleaveprogram;
	}

	/**
	 * Setter for wleaveprogram.
	 * @param reference the new value for wleaveprogram
	 */
	public void setWleaveprogram(RangeReference reference) {
		this.wleaveprogram.setBytes(reference.getBytes());
	}

	/**
	 * Getter for werror.
	 * @return the werror
	 */
	public Werror getWerror() {
		return this.werror;
	}

	/**
	 * Setter for werror.
	 * @param reference the new value for werror
	 */
	public void setWerror(RangeReference reference) {
		this.werror.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wmessage.
	 * @return the wmessage
	 */
	public Wmessage getWmessage() {
		return this.wmessage;
	}

	/**
	 * Setter for wmessage.
	 * @param reference the new value for wmessage
	 */
	public void setWmessage(RangeReference reference) {
		this.wmessage.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wfkey.
	 * @return the wfkey
	 */
	public Wfkey getWfkey() {
		return this.wfkey;
	}

	/**
	 * Setter for wfkey.
	 * @param reference the new value for wfkey
	 */
	public void setWfkey(RangeReference reference) {
		this.wfkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wlkey.
	 * @return the wlkey
	 */
	public Wlkey getWlkey() {
		return this.wlkey;
	}

	/**
	 * Setter for wlkey.
	 * @param reference the new value for wlkey
	 */
	public void setWlkey(RangeReference reference) {
		this.wlkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wtrnkey.
	 * @return the wtrnkey
	 */
	public Wtrnkey getWtrnkey() {
		return this.wtrnkey;
	}

	/**
	 * Setter for wtrnkey.
	 * @param reference the new value for wtrnkey
	 */
	public void setWtrnkey(RangeReference reference) {
		this.wtrnkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wposto.
	 * @return the wposto
	 */
	public Wposto getWposto() {
		return this.wposto;
	}

	/**
	 * Setter for wposto.
	 * @param reference the new value for wposto
	 */
	public void setWposto(RangeReference reference) {
		this.wposto.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dsshindds_pointer.
	 * @return the dsshindds_pointer
	 */
	public Dsshindds_pointer getDsshindds_pointer() {
		return this.dsshindds_pointer;
	}

	/**
	 * Setter for dsshindds_pointer.
	 * @param reference the new value for dsshindds_pointer
	 */
	public void setDsshindds_pointer(RangeReference reference) {
		this.dsshindds_pointer.setBytes(reference.getBytes());
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
		cdtrnpr = new Cdtrnpr(configuration);
		dsshindds = new Dsshindds(configuration);
		programStatus = new ProgramStatus(configuration);
		optarr = new Optarr(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		header = new Header(configuration);
		sfl1 = new Sfl1(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		wmessageid = new Wmessageid(configuration);
		wqualmsgf = new Wqualmsgf(configuration);
		wmsgdata = new Wmsgdata(configuration);
		wmsgdtalen = new Wmsgdtalen(configuration);
		wmsgtype = new Wmsgtype(configuration);
		wcallstkent = new Wcallstkent(configuration);
		wcallstkcntr = new Wcallstkcntr(configuration);
		wmessagekey = new Wmessagekey(configuration);
		wmessagermv = new Wmessagermv(configuration);
		wrrn = new Wrrn(configuration);
		wpos = new Wpos(configuration);
		widx = new Widx(configuration);
		wcntr = new Wcntr(configuration);
		wleaveprogram = new Wleaveprogram(configuration);
		werror = new Werror(configuration);
		wmessage = new Wmessage(configuration);
		wfkey = new Wfkey(configuration);
		wlkey = new Wlkey(configuration);
		wtrnkey = new Wtrnkey(configuration);
		wposto = new Wposto(configuration);
		dsshindds_pointer = new Dsshindds_pointer(configuration);
		cpagesize = new Cpagesize(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdtrnpr, dsshindds, programStatus, optarr, sharedRecordFields, header, sfl1, msgsfl, msgsflc, wmessageid, wqualmsgf, wmsgdata, wmsgdtalen, wmsgtype, wcallstkent, wcallstkcntr, wmessagekey, wmessagermv, wrrn, wpos, widx, wcntr, wleaveprogram, werror, wmessage, wfkey, wlkey, wtrnkey, wposto, dsshindds_pointer, cpagesize);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdtrn01rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
