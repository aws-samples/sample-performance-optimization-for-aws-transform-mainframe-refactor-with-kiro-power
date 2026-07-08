package aws.bluage.carddemo.cdbpl011m.business.context;
import aws.bluage.carddemo.cdbpl011m.business.model.Action;
import aws.bluage.carddemo.cdbpl011m.business.model.Approvedsts;
import aws.bluage.carddemo.cdbpl011m.business.model.Atct_root;
import aws.bluage.carddemo.cdbpl011m.business.model.Cdactpr;
import aws.bluage.carddemo.cdbpl011m.business.model.Cdautpr;
import aws.bluage.carddemo.cdbpl011m.business.model.Cdccmpr;
import aws.bluage.carddemo.cdbpl011m.business.model.Delay;
import aws.bluage.carddemo.cdbpl011m.business.model.Dlengtrnsts;
import aws.bluage.carddemo.cdbpl011m.business.model.Dly;
import aws.bluage.carddemo.cdbpl011m.business.model.Errorsts;
import aws.bluage.carddemo.cdbpl011m.business.model.GENAUTSHReturn;
import aws.bluage.carddemo.cdbpl011m.business.model.Generatedauth;
import aws.bluage.carddemo.cdbpl011m.business.model.Message;
import aws.bluage.carddemo.cdbpl011m.business.model.Mypsds;
import aws.bluage.carddemo.cdbpl011m.business.model.QCMDPRCSParam0;
import aws.bluage.carddemo.cdbpl011m.business.model.QCMDPRCSParam1;
import aws.bluage.carddemo.cdbpl011m.business.model.Rejectedsts;
import aws.bluage.carddemo.cdbpl011m.business.model.Reversedsts;
import aws.bluage.carddemo.cdbpl011m.business.model.Shutdown;
import aws.bluage.carddemo.cdbpl011m.business.model.Submitrevsts;
import aws.bluage.carddemo.cdbpl011m.business.model.Submitsts;
import aws.bluage.carddemo.common.business.database.cdtrnp.Cdtrnpr;
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
 * Data simplifier context Cdbpl011mContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdtrnpr' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Cdtrnpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'mypsds' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Mypsds
 * <br></p>
 * 
 * <p>About 'cdccmpr' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Cdccmpr
 * <br></p>
 * 
 * <p>About 'cdactpr' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Cdactpr
 * <br></p>
 * 
 * <p>About 'cdautpr' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Cdautpr
 * <br></p>
 * 
 * <p>About 'delay' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Delay
 * <br></p>
 * 
 * <p>About 'dly' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Dly
 * <br></p>
 * 
 * <p>About 'generatedauth' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Generatedauth
 * <br></p>
 * 
 * <p>About 'atct_root' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Atct_root
 * <br></p>
 * 
 * <p>About 'action' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Action
 * <br></p>
 * 
 * <p>About 'message' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Message
 * <br></p>
 * 
 * <p>About 'shutdown' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Shutdown
 * <br></p>
 * 
 * <p>About 'submitsts' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Submitsts
 * <br></p>
 * 
 * <p>About 'rejectedsts' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Rejectedsts
 * <br></p>
 * 
 * <p>About 'approvedsts' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Approvedsts
 * <br></p>
 * 
 * <p>About 'submitrevsts' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Submitrevsts
 * <br></p>
 * 
 * <p>About 'reversedsts' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Reversedsts
 * <br></p>
 * 
 * <p>About 'errorsts' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Errorsts
 * <br></p>
 * 
 * <p>About 'gENAUTSHReturn' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.GENAUTSHReturn
 * <br></p>
 * 
 * <p>About 'qCMDPRCSParam0' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.QCMDPRCSParam0
 * <br></p>
 * 
 * <p>About 'qCMDPRCSParam1' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.QCMDPRCSParam1
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'dlengtrnsts' field, <br>uml entity: aws.bluage.carddemo.cdbpl011m.business.model.Dlengtrnsts
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdbpl011m.business.context.Cdbpl011mContext")
@Lazy
@Scope("prototype")
public class Cdbpl011mContext extends Blu4ivRuntimeContext {
	
	private Cdtrnpr cdtrnpr;
	private Mypsds mypsds;
	private Cdccmpr cdccmpr;
	private Cdactpr cdactpr;
	private Cdautpr cdautpr;
	private Delay delay;
	private Dly dly;
	private Generatedauth generatedauth;
	private Atct_root atct_root;
	private Action action;
	private Message message;
	private Shutdown shutdown;
	private Submitsts submitsts;
	private Rejectedsts rejectedsts;
	private Approvedsts approvedsts;
	private Submitrevsts submitrevsts;
	private Reversedsts reversedsts;
	private Errorsts errorsts;
	private GENAUTSHReturn gENAUTSHReturn;
	private QCMDPRCSParam0 qCMDPRCSParam0;
	private QCMDPRCSParam1 qCMDPRCSParam1;
	private Dlengtrnsts dlengtrnsts;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdbpl011mContext (@Qualifier("Cdbpl011mContextConfiguration") Configuration configuration) {
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
	 * Getter for delay.
	 * @return the delay
	 */
	public Delay getDelay() {
		return this.delay;
	}

	/**
	 * Setter for delay.
	 * @param reference the new value for delay
	 */
	public void setDelay(RangeReference reference) {
		this.delay.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dly.
	 * @return the dly
	 */
	public Dly getDly() {
		return this.dly;
	}

	/**
	 * Setter for dly.
	 * @param reference the new value for dly
	 */
	public void setDly(RangeReference reference) {
		this.dly.setBytes(reference.getBytes());
	}

	/**
	 * Getter for generatedauth.
	 * @return the generatedauth
	 */
	public Generatedauth getGeneratedauth() {
		return this.generatedauth;
	}

	/**
	 * Setter for generatedauth.
	 * @param reference the new value for generatedauth
	 */
	public void setGeneratedauth(RangeReference reference) {
		this.generatedauth.setBytes(reference.getBytes());
	}

	/**
	 * Getter for atct_root.
	 * @return the atct_root
	 */
	public Atct_root getAtct_root() {
		return this.atct_root;
	}

	/**
	 * Setter for atct_root.
	 * @param reference the new value for atct_root
	 */
	public void setAtct_root(RangeReference reference) {
		this.atct_root.setBytes(reference.getBytes());
	}

	/**
	 * Getter for action.
	 * @return the action
	 */
	public Action getAction() {
		return this.action;
	}

	/**
	 * Setter for action.
	 * @param reference the new value for action
	 */
	public void setAction(RangeReference reference) {
		this.action.setBytes(reference.getBytes());
	}

	/**
	 * Getter for message.
	 * @return the message
	 */
	public Message getMessage() {
		return this.message;
	}

	/**
	 * Setter for message.
	 * @param reference the new value for message
	 */
	public void setMessage(RangeReference reference) {
		this.message.setBytes(reference.getBytes());
	}

	/**
	 * Getter for shutdown.
	 * @return the shutdown
	 */
	public Shutdown getShutdown() {
		return this.shutdown;
	}

	/**
	 * Setter for shutdown.
	 * @param reference the new value for shutdown
	 */
	public void setShutdown(RangeReference reference) {
		this.shutdown.setBytes(reference.getBytes());
	}

	/**
	 * Getter for submitsts.
	 * @return the submitsts
	 */
	public Submitsts getSubmitsts() {
		return this.submitsts;
	}

	/**
	 * Setter for submitsts.
	 * @param reference the new value for submitsts
	 */
	public void setSubmitsts(RangeReference reference) {
		this.submitsts.setBytes(reference.getBytes());
	}

	/**
	 * Getter for rejectedsts.
	 * @return the rejectedsts
	 */
	public Rejectedsts getRejectedsts() {
		return this.rejectedsts;
	}

	/**
	 * Setter for rejectedsts.
	 * @param reference the new value for rejectedsts
	 */
	public void setRejectedsts(RangeReference reference) {
		this.rejectedsts.setBytes(reference.getBytes());
	}

	/**
	 * Getter for approvedsts.
	 * @return the approvedsts
	 */
	public Approvedsts getApprovedsts() {
		return this.approvedsts;
	}

	/**
	 * Setter for approvedsts.
	 * @param reference the new value for approvedsts
	 */
	public void setApprovedsts(RangeReference reference) {
		this.approvedsts.setBytes(reference.getBytes());
	}

	/**
	 * Getter for submitrevsts.
	 * @return the submitrevsts
	 */
	public Submitrevsts getSubmitrevsts() {
		return this.submitrevsts;
	}

	/**
	 * Setter for submitrevsts.
	 * @param reference the new value for submitrevsts
	 */
	public void setSubmitrevsts(RangeReference reference) {
		this.submitrevsts.setBytes(reference.getBytes());
	}

	/**
	 * Getter for reversedsts.
	 * @return the reversedsts
	 */
	public Reversedsts getReversedsts() {
		return this.reversedsts;
	}

	/**
	 * Setter for reversedsts.
	 * @param reference the new value for reversedsts
	 */
	public void setReversedsts(RangeReference reference) {
		this.reversedsts.setBytes(reference.getBytes());
	}

	/**
	 * Getter for errorsts.
	 * @return the errorsts
	 */
	public Errorsts getErrorsts() {
		return this.errorsts;
	}

	/**
	 * Setter for errorsts.
	 * @param reference the new value for errorsts
	 */
	public void setErrorsts(RangeReference reference) {
		this.errorsts.setBytes(reference.getBytes());
	}

	/**
	 * Getter for gENAUTSHReturn.
	 * @return the gENAUTSHReturn
	 */
	public GENAUTSHReturn getGENAUTSHReturn() {
		return this.gENAUTSHReturn;
	}

	/**
	 * Setter for gENAUTSHReturn.
	 * @param reference the new value for gENAUTSHReturn
	 */
	public void setGENAUTSHReturn(RangeReference reference) {
		this.gENAUTSHReturn.setBytes(reference.getBytes());
	}

	/**
	 * Getter for qCMDPRCSParam0.
	 * @return the qCMDPRCSParam0
	 */
	public QCMDPRCSParam0 getQCMDPRCSParam0() {
		return this.qCMDPRCSParam0;
	}

	/**
	 * Setter for qCMDPRCSParam0.
	 * @param reference the new value for qCMDPRCSParam0
	 */
	public void setQCMDPRCSParam0(RangeReference reference) {
		this.qCMDPRCSParam0.setBytes(reference.getBytes());
	}

	/**
	 * Getter for qCMDPRCSParam1.
	 * @return the qCMDPRCSParam1
	 */
	public QCMDPRCSParam1 getQCMDPRCSParam1() {
		return this.qCMDPRCSParam1;
	}

	/**
	 * Setter for qCMDPRCSParam1.
	 * @param reference the new value for qCMDPRCSParam1
	 */
	public void setQCMDPRCSParam1(RangeReference reference) {
		this.qCMDPRCSParam1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dlengtrnsts.
	 * @return the dlengtrnsts
	 */
	public Dlengtrnsts getDlengtrnsts() {
		return this.dlengtrnsts;
	}

	/**
	 * Setter for dlengtrnsts.
	 * @param reference the new value for dlengtrnsts
	 */
	public void setDlengtrnsts(RangeReference reference) {
		this.dlengtrnsts.setBytes(reference.getBytes());
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
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdtrnpr = new Cdtrnpr(configuration);
		mypsds = new Mypsds(configuration);
		cdccmpr = new Cdccmpr(configuration);
		cdactpr = new Cdactpr(configuration);
		cdautpr = new Cdautpr(configuration);
		delay = new Delay(configuration);
		dly = new Dly(configuration);
		generatedauth = new Generatedauth(configuration);
		atct_root = new Atct_root(configuration);
		action = new Action(configuration);
		message = new Message(configuration);
		shutdown = new Shutdown(configuration);
		submitsts = new Submitsts(configuration);
		rejectedsts = new Rejectedsts(configuration);
		approvedsts = new Approvedsts(configuration);
		submitrevsts = new Submitrevsts(configuration);
		reversedsts = new Reversedsts(configuration);
		errorsts = new Errorsts(configuration);
		gENAUTSHReturn = new GENAUTSHReturn(configuration);
		qCMDPRCSParam0 = new QCMDPRCSParam0(configuration);
		qCMDPRCSParam1 = new QCMDPRCSParam1(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		dlengtrnsts = new Dlengtrnsts(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdtrnpr, mypsds, cdccmpr, cdactpr, cdautpr, delay, dly, generatedauth, atct_root, action, message, shutdown, submitsts, rejectedsts, approvedsts, submitrevsts, reversedsts, errorsts, gENAUTSHReturn, qCMDPRCSParam0, qCMDPRCSParam1);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdbpl011mContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Dlengtrnsts : [").append(dlengtrnsts.toString()).append("]\n");
		return toSB.toString();
	}

}
