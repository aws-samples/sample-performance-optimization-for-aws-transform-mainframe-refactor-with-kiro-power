package aws.bluage.carddemo.cdccm03r.business.context;
import aws.bluage.carddemo.cdccm03r.business.model.Ccardprefix;
import aws.bluage.carddemo.cdccm03r.business.model.Ccardsize;
import aws.bluage.carddemo.cdccm03r.business.model.Ccvvsize;
import aws.bluage.carddemo.cdccm03r.business.model.Pcardnumber;
import aws.bluage.carddemo.cdccm03r.business.model.Pcvv;
import aws.bluage.carddemo.cdccm03r.business.model.Randomin;
import aws.bluage.carddemo.cdccm03r.business.model.Randomout;
import aws.bluage.carddemo.cdccm03r.business.model.Randomseed;
import aws.bluage.carddemo.cdccm03r.business.model.Returncode1;
import aws.bluage.carddemo.cdccm03r.business.model.Unique;
import aws.bluage.carddemo.common.business.database.cdccmp.Cdccmpr;
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
 * Data simplifier context Cdccm03rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdccmpr' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Cdccmpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'randomseed' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Randomseed
 * <br></p>
 * 
 * <p>About 'randomin' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Randomin
 * <br></p>
 * 
 * <p>About 'randomout' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Randomout
 * <br></p>
 * 
 * <p>About 'returncode1' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Returncode1
 * <br></p>
 * 
 * <p>About 'unique' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Unique
 * <br></p>
 * 
 * <p>About 'ccardsize' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Ccardsize
 * <br></p>
 * 
 * <p>About 'ccvvsize' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Ccvvsize
 * <br></p>
 * 
 * <p>About 'ccardprefix' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Ccardprefix
 * <br></p>
 * 
 * <p>About 'randomOutSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'returnCodeSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'uniqueSnapshot' field, <br>uml entity: gwtype.Record
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 * <p>About 'pcardnumber' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Pcardnumber
 * <br></p>
 * 
 * <p>About 'pcvv' field, <br>uml entity: aws.bluage.carddemo.cdccm03r.business.model.Pcvv
 * <br></p>
 * 
 */
@Component("aws.bluage.carddemo.cdccm03r.business.context.Cdccm03rContext")
@Lazy
@Scope("prototype")
public class Cdccm03rContext extends Blu4ivRuntimeContext {
	
	private Cdccmpr cdccmpr;
	private Randomseed randomseed;
	private Randomin randomin;
	private Randomout randomout;
	private Returncode1 returncode1;
	private Unique unique;
	private Ccardsize ccardsize;
	private Ccvvsize ccvvsize;
	private Ccardprefix ccardprefix;
	private Pcardnumber pcardnumber;
	private Pcvv pcvv;

	private Record randomOutSnapshot;

	private Record returnCodeSnapshot;

	private Record uniqueSnapshot;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdccm03rContext (@Qualifier("Cdccm03rContextConfiguration") Configuration configuration) {
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
	 * Getter for randomseed.
	 * @return the randomseed
	 */
	public Randomseed getRandomseed() {
		return this.randomseed;
	}

	/**
	 * Setter for randomseed.
	 * @param reference the new value for randomseed
	 */
	public void setRandomseed(RangeReference reference) {
		this.randomseed.setBytes(reference.getBytes());
	}

	/**
	 * Getter for randomin.
	 * @return the randomin
	 */
	public Randomin getRandomin() {
		return this.randomin;
	}

	/**
	 * Setter for randomin.
	 * @param reference the new value for randomin
	 */
	public void setRandomin(RangeReference reference) {
		this.randomin.setBytes(reference.getBytes());
	}

	/**
	 * Getter for randomout.
	 * @return the randomout
	 */
	public Randomout getRandomout() {
		return this.randomout;
	}

	/**
	 * Setter for randomout.
	 * @param reference the new value for randomout
	 */
	public void setRandomout(RangeReference reference) {
		this.randomout.setBytes(reference.getBytes());
	}

	/**
	 * Getter for returncode1.
	 * @return the returncode1
	 */
	public Returncode1 getReturncode1() {
		return this.returncode1;
	}

	/**
	 * Setter for returncode1.
	 * @param reference the new value for returncode1
	 */
	public void setReturncode1(RangeReference reference) {
		this.returncode1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for unique.
	 * @return the unique
	 */
	public Unique getUnique() {
		return this.unique;
	}

	/**
	 * Setter for unique.
	 * @param reference the new value for unique
	 */
	public void setUnique(RangeReference reference) {
		this.unique.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ccardsize.
	 * @return the ccardsize
	 */
	public Ccardsize getCcardsize() {
		return this.ccardsize;
	}

	/**
	 * Setter for ccardsize.
	 * @param reference the new value for ccardsize
	 */
	public void setCcardsize(RangeReference reference) {
		this.ccardsize.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ccvvsize.
	 * @return the ccvvsize
	 */
	public Ccvvsize getCcvvsize() {
		return this.ccvvsize;
	}

	/**
	 * Setter for ccvvsize.
	 * @param reference the new value for ccvvsize
	 */
	public void setCcvvsize(RangeReference reference) {
		this.ccvvsize.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ccardprefix.
	 * @return the ccardprefix
	 */
	public Ccardprefix getCcardprefix() {
		return this.ccardprefix;
	}

	/**
	 * Setter for ccardprefix.
	 * @param reference the new value for ccardprefix
	 */
	public void setCcardprefix(RangeReference reference) {
		this.ccardprefix.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pcardnumber.
	 * @return the pcardnumber
	 */
	public Pcardnumber getPcardnumber() {
		return this.pcardnumber;
	}

	/**
	 * Setter for pcardnumber.
	 * @param reference the new value for pcardnumber
	 */
	public void setPcardnumber(RangeReference reference) {
		this.pcardnumber.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pcvv.
	 * @return the pcvv
	 */
	public Pcvv getPcvv() {
		return this.pcvv;
	}

	/**
	 * Setter for pcvv.
	 * @param reference the new value for pcvv
	 */
	public void setPcvv(RangeReference reference) {
		this.pcvv.setBytes(reference.getBytes());
	}

	/**
	 * Getter for randomOutSnapshot.
	 * @return the randomOutSnapshot
	 */
	public Record getRandomOutSnapshot() {
		return this.randomOutSnapshot;
	}

	/**
	 * Setter for randomOutSnapshot.
	 * @param value the new value for randomOutSnapshot
	 */
	public void setRandomOutSnapshot(Record value) {
		this.randomOutSnapshot = value;
	}

	

	/**
	 * Getter for returnCodeSnapshot.
	 * @return the returnCodeSnapshot
	 */
	public Record getReturnCodeSnapshot() {
		return this.returnCodeSnapshot;
	}

	/**
	 * Setter for returnCodeSnapshot.
	 * @param value the new value for returnCodeSnapshot
	 */
	public void setReturnCodeSnapshot(Record value) {
		this.returnCodeSnapshot = value;
	}

	

	/**
	 * Getter for uniqueSnapshot.
	 * @return the uniqueSnapshot
	 */
	public Record getUniqueSnapshot() {
		return this.uniqueSnapshot;
	}

	/**
	 * Setter for uniqueSnapshot.
	 * @param value the new value for uniqueSnapshot
	 */
	public void setUniqueSnapshot(Record value) {
		this.uniqueSnapshot = value;
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
		this.randomOutSnapshot = null;
		this.returnCodeSnapshot = null;
		this.uniqueSnapshot = null;
		this.firstRun = true;
	}

	
	private void initWorking(Configuration configuration) {
		cdccmpr = new Cdccmpr(configuration);
		randomseed = new Randomseed(configuration);
		randomin = new Randomin(configuration);
		randomout = new Randomout(configuration);
		returncode1 = new Returncode1(configuration);
		unique = new Unique(configuration);
		ccardsize = new Ccardsize(configuration);
		ccvvsize = new Ccvvsize(configuration);
		ccardprefix = new Ccardprefix(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		pcardnumber = new Pcardnumber(configuration, EntityUtils.getUnlinkedRecord());
		pcvv = new Pcvv(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdccmpr, randomseed, randomin, randomout, returncode1, unique, ccardsize, ccvvsize, ccardprefix);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdccm03rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Pcardnumber : [").append(pcardnumber.toString()).append("]\n");
		toSB.append("Pcvv : [").append(pcvv.toString()).append("]\n");
		return toSB.toString();
	}

}
