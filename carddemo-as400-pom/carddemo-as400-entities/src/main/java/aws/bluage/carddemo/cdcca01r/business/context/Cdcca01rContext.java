package aws.bluage.carddemo.cdcca01r.business.context;
import aws.bluage.carddemo.cdcca01r.business.model.Cdccapr;
import aws.bluage.carddemo.cdcca01r.business.model.Header1;
import aws.bluage.carddemo.cdcca01r.business.model.Indicatords;
import aws.bluage.carddemo.cdcca01r.business.model.Indicatords_pointer;
import aws.bluage.carddemo.cdcca01r.business.model.Pcardnum;
import aws.bluage.carddemo.cdcca01r.business.model.Sfl1;
import aws.bluage.carddemo.cdcca01r.business.model.Wleaveprogram;
import aws.bluage.carddemo.cdcca01r.business.model.Wrrn;
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
 * Data simplifier context Cdcca01rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indicatords' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Indicatords
 * <br></p>
 * 
 * <p>About 'cdccapr' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Cdccapr
 * <br></p>
 * 
 * <p>About 'header1' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Header1
 * <br></p>
 * 
 * <p>About 'sfl1' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Sfl1
 * <br></p>
 * 
 * <p>About 'wleaveprogram' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Wleaveprogram
 * <br></p>
 * 
 * <p>About 'wrrn' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Wrrn
 * <br></p>
 * 
 * <p>About 'indicatords_pointer' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Indicatords_pointer
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'pcardnum' field, <br>uml entity: aws.bluage.carddemo.cdcca01r.business.model.Pcardnum
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdcca01r.business.context.Cdcca01rContext")
@Lazy
@Scope("prototype")
public class Cdcca01rContext extends Blu4ivRuntimeContext {
	
	private Indicatords indicatords;
	private Cdccapr cdccapr;
	private Header1 header1;
	private Sfl1 sfl1;
	private Wleaveprogram wleaveprogram;
	private Wrrn wrrn;
	private Indicatords_pointer indicatords_pointer;
	private Pcardnum pcardnum;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdcca01rContext (@Qualifier("Cdcca01rContextConfiguration") Configuration configuration) {
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
	 * Getter for cdccapr.
	 * @return the cdccapr
	 */
	public Cdccapr getCdccapr() {
		return this.cdccapr;
	}

	/**
	 * Setter for cdccapr.
	 * @param reference the new value for cdccapr
	 */
	public void setCdccapr(RangeReference reference) {
		this.cdccapr.setBytes(reference.getBytes());
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
		cdccapr = new Cdccapr(configuration);
		header1 = new Header1(configuration);
		sfl1 = new Sfl1(configuration);
		wleaveprogram = new Wleaveprogram(configuration);
		wrrn = new Wrrn(configuration);
		indicatords_pointer = new Indicatords_pointer(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		pcardnum = new Pcardnum(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(indicatords, cdccapr, header1, sfl1, wleaveprogram, wrrn, indicatords_pointer);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdcca01rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Pcardnum : [").append(pcardnum.toString()).append("]\n");
		return toSB.toString();
	}

}
