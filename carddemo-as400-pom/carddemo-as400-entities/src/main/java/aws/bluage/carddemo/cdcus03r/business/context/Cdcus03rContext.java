package aws.bluage.carddemo.cdcus03r.business.context;
import aws.bluage.carddemo.cdcus03r.business.model.Cdcuspr;
import aws.bluage.carddemo.cdcus03r.business.model.Header1;
import aws.bluage.carddemo.cdcus03r.business.model.Header2;
import aws.bluage.carddemo.cdcus03r.business.model.Indicatords;
import aws.bluage.carddemo.cdcus03r.business.model.Indicatords_pointer;
import aws.bluage.carddemo.cdcus03r.business.model.Msgsfl;
import aws.bluage.carddemo.cdcus03r.business.model.Msgsflc;
import aws.bluage.carddemo.cdcus03r.business.model.Pcustid;
import aws.bluage.carddemo.cdcus03r.business.model.Sfl1;
import aws.bluage.carddemo.cdcus03r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdcus03r.business.model.Wcustid;
import aws.bluage.carddemo.cdcus03r.business.model.Wleaveprogram;
import aws.bluage.carddemo.cdcus03r.business.model.Wrcdselected;
import aws.bluage.carddemo.cdcus03r.business.model.Wrrn;
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
 * Data simplifier context Cdcus03rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indicatords' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Indicatords
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'cdcuspr' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Cdcuspr
 * <br></p>
 * 
 * <p>About 'header1' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Header1
 * <br></p>
 * 
 * <p>About 'header2' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Header2
 * <br></p>
 * 
 * <p>About 'sfl1' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Sfl1
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'wrrn' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Wrrn
 * <br></p>
 * 
 * <p>About 'wleaveprogram' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Wleaveprogram
 * <br></p>
 * 
 * <p>About 'wrcdselected' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Wrcdselected
 * <br></p>
 * 
 * <p>About 'indicatords_pointer' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Indicatords_pointer
 * <br></p>
 * 
 * <p>About 'wcustid' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Wcustid
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'pcustid' field, <br>uml entity: aws.bluage.carddemo.cdcus03r.business.model.Pcustid
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdcus03r.business.context.Cdcus03rContext")
@Lazy
@Scope("prototype")
public class Cdcus03rContext extends Blu4ivRuntimeContext {
	
	private Indicatords indicatords;
	private SharedRecordFields sharedRecordFields;
	private Cdcuspr cdcuspr;
	private Header1 header1;
	private Header2 header2;
	private Sfl1 sfl1;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Wrrn wrrn;
	private Wleaveprogram wleaveprogram;
	private Wrcdselected wrcdselected;
	private Indicatords_pointer indicatords_pointer;
	private Wcustid wcustid;
	private Pcustid pcustid;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdcus03rContext (@Qualifier("Cdcus03rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
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
	 * Getter for wrcdselected.
	 * @return the wrcdselected
	 */
	public Wrcdselected getWrcdselected() {
		return this.wrcdselected;
	}

	/**
	 * Setter for wrcdselected.
	 * @param reference the new value for wrcdselected
	 */
	public void setWrcdselected(RangeReference reference) {
		this.wrcdselected.setBytes(reference.getBytes());
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
		indicatords = new Indicatords(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		cdcuspr = new Cdcuspr(configuration);
		header1 = new Header1(configuration);
		header2 = new Header2(configuration);
		sfl1 = new Sfl1(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		wrrn = new Wrrn(configuration);
		wleaveprogram = new Wleaveprogram(configuration);
		wrcdselected = new Wrcdselected(configuration);
		indicatords_pointer = new Indicatords_pointer(configuration);
		wcustid = new Wcustid(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		pcustid = new Pcustid(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(indicatords, sharedRecordFields, cdcuspr, header1, header2, sfl1, msgsfl, msgsflc, wrrn, wleaveprogram, wrcdselected, indicatords_pointer, wcustid);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdcus03rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Pcustid : [").append(pcustid.toString()).append("]\n");
		return toSB.toString();
	}

}
