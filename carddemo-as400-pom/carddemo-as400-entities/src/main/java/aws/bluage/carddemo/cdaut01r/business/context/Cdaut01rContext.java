package aws.bluage.carddemo.cdaut01r.business.context;
import aws.bluage.carddemo.cdaut01r.business.model.Alwayson;
import aws.bluage.carddemo.cdaut01r.business.model.Cpagesize;
import aws.bluage.carddemo.cdaut01r.business.model.Ctl1;
import aws.bluage.carddemo.cdaut01r.business.model.Dbloadds;
import aws.bluage.carddemo.cdaut01r.business.model.Down;
import aws.bluage.carddemo.cdaut01r.business.model.Firstrowfetch;
import aws.bluage.carddemo.cdaut01r.business.model.Footer;
import aws.bluage.carddemo.cdaut01r.business.model.Header1;
import aws.bluage.carddemo.cdaut01r.business.model.Header2;
import aws.bluage.carddemo.cdaut01r.business.model.Indicatords;
import aws.bluage.carddemo.cdaut01r.business.model.Indicatords_pointer;
import aws.bluage.carddemo.cdaut01r.business.model.Lastrowfetch;
import aws.bluage.carddemo.cdaut01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdaut01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdaut01r.business.model.Pmtarr;
import aws.bluage.carddemo.cdaut01r.business.model.Ptr_ind;
import aws.bluage.carddemo.cdaut01r.business.model.Rrn;
import aws.bluage.carddemo.cdaut01r.business.model.Sfl1;
import aws.bluage.carddemo.cdaut01r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdaut01r.business.model.Sqlca;
import aws.bluage.carddemo.cdaut01r.business.model.Up;
import aws.bluage.carddemo.cdaut01r.business.model.Wcursorkey;
import aws.bluage.carddemo.cdaut01r.business.model.Wtopkey;
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
 * Data simplifier context Cdaut01rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'indicatords' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Indicatords
 * <br></p>
 * 
 * <p>About 'dbloadds' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Dbloadds
 * <br></p>
 * 
 * <p>About 'pmtarr' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Pmtarr
 * <br></p>
 * 
 * <p>About 'sqlca' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Sqlca
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'header1' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Header1
 * <br></p>
 * 
 * <p>About 'header2' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Header2
 * <br></p>
 * 
 * <p>About 'sfl1' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Sfl1
 * <br></p>
 * 
 * <p>About 'ctl1' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Ctl1
 * <br></p>
 * 
 * <p>About 'footer' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Footer
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'ptr_ind' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Ptr_ind
 * <br></p>
 * 
 * <p>About 'alwayson' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Alwayson
 * <br></p>
 * 
 * <p>About 'rrn' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Rrn
 * <br></p>
 * 
 * <p>About 'wtopkey' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Wtopkey
 * <br></p>
 * 
 * <p>About 'wcursorkey' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Wcursorkey
 * <br></p>
 * 
 * <p>About 'firstrowfetch' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Firstrowfetch
 * <br></p>
 * 
 * <p>About 'lastrowfetch' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Lastrowfetch
 * <br></p>
 * 
 * <p>About 'indicatords_pointer' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Indicatords_pointer
 * <br></p>
 * 
 * <p>About 'cpagesize' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Cpagesize
 * <br></p>
 * 
 * <p>About 'down' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Down
 * <br></p>
 * 
 * <p>About 'up' field, <br>uml entity: aws.bluage.carddemo.cdaut01r.business.model.Up
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdaut01r.business.context.Cdaut01rContext")
@Lazy
@Scope("prototype")
public class Cdaut01rContext extends Blu4ivRuntimeContext {
	
	private Indicatords indicatords;
	private Dbloadds dbloadds;
	private Pmtarr pmtarr;
	private Sqlca sqlca;
	private SharedRecordFields sharedRecordFields;
	private Header1 header1;
	private Header2 header2;
	private Sfl1 sfl1;
	private Ctl1 ctl1;
	private Footer footer;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Ptr_ind ptr_ind;
	private Alwayson alwayson;
	private Rrn rrn;
	private Wtopkey wtopkey;
	private Wcursorkey wcursorkey;
	private Firstrowfetch firstrowfetch;
	private Lastrowfetch lastrowfetch;
	private Indicatords_pointer indicatords_pointer;
	private Cpagesize cpagesize;
	private Down down;
	private Up up;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdaut01rContext (@Qualifier("Cdaut01rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
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
	 * Getter for dbloadds.
	 * @return the dbloadds
	 */
	public Dbloadds getDbloadds() {
		return this.dbloadds;
	}

	/**
	 * Setter for dbloadds.
	 * @param reference the new value for dbloadds
	 */
	public void setDbloadds(RangeReference reference) {
		this.dbloadds.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pmtarr.
	 * @return the pmtarr
	 */
	public Pmtarr getPmtarr() {
		return this.pmtarr;
	}

	/**
	 * Setter for pmtarr.
	 * @param reference the new value for pmtarr
	 */
	public void setPmtarr(RangeReference reference) {
		this.pmtarr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for sqlca.
	 * @return the sqlca
	 */
	public Sqlca getSqlca() {
		return this.sqlca;
	}

	/**
	 * Setter for sqlca.
	 * @param reference the new value for sqlca
	 */
	public void setSqlca(RangeReference reference) {
		this.sqlca.setBytes(reference.getBytes());
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
	 * Getter for footer.
	 * @return the footer
	 */
	public Footer getFooter() {
		return this.footer;
	}

	/**
	 * Setter for footer.
	 * @param reference the new value for footer
	 */
	public void setFooter(RangeReference reference) {
		this.footer.setBytes(reference.getBytes());
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
	 * Getter for ptr_ind.
	 * @return the ptr_ind
	 */
	public Ptr_ind getPtr_ind() {
		return this.ptr_ind;
	}

	/**
	 * Setter for ptr_ind.
	 * @param reference the new value for ptr_ind
	 */
	public void setPtr_ind(RangeReference reference) {
		this.ptr_ind.setBytes(reference.getBytes());
	}

	/**
	 * Getter for alwayson.
	 * @return the alwayson
	 */
	public Alwayson getAlwayson() {
		return this.alwayson;
	}

	/**
	 * Setter for alwayson.
	 * @param reference the new value for alwayson
	 */
	public void setAlwayson(RangeReference reference) {
		this.alwayson.setBytes(reference.getBytes());
	}

	/**
	 * Getter for rrn.
	 * @return the rrn
	 */
	public Rrn getRrn() {
		return this.rrn;
	}

	/**
	 * Setter for rrn.
	 * @param reference the new value for rrn
	 */
	public void setRrn(RangeReference reference) {
		this.rrn.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wtopkey.
	 * @return the wtopkey
	 */
	public Wtopkey getWtopkey() {
		return this.wtopkey;
	}

	/**
	 * Setter for wtopkey.
	 * @param reference the new value for wtopkey
	 */
	public void setWtopkey(RangeReference reference) {
		this.wtopkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcursorkey.
	 * @return the wcursorkey
	 */
	public Wcursorkey getWcursorkey() {
		return this.wcursorkey;
	}

	/**
	 * Setter for wcursorkey.
	 * @param reference the new value for wcursorkey
	 */
	public void setWcursorkey(RangeReference reference) {
		this.wcursorkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for firstrowfetch.
	 * @return the firstrowfetch
	 */
	public Firstrowfetch getFirstrowfetch() {
		return this.firstrowfetch;
	}

	/**
	 * Setter for firstrowfetch.
	 * @param reference the new value for firstrowfetch
	 */
	public void setFirstrowfetch(RangeReference reference) {
		this.firstrowfetch.setBytes(reference.getBytes());
	}

	/**
	 * Getter for lastrowfetch.
	 * @return the lastrowfetch
	 */
	public Lastrowfetch getLastrowfetch() {
		return this.lastrowfetch;
	}

	/**
	 * Setter for lastrowfetch.
	 * @param reference the new value for lastrowfetch
	 */
	public void setLastrowfetch(RangeReference reference) {
		this.lastrowfetch.setBytes(reference.getBytes());
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
	 * Getter for down.
	 * @return the down
	 */
	public Down getDown() {
		return this.down;
	}

	/**
	 * Setter for down.
	 * @param reference the new value for down
	 */
	public void setDown(RangeReference reference) {
		this.down.setBytes(reference.getBytes());
	}

	/**
	 * Getter for up.
	 * @return the up
	 */
	public Up getUp() {
		return this.up;
	}

	/**
	 * Setter for up.
	 * @param reference the new value for up
	 */
	public void setUp(RangeReference reference) {
		this.up.setBytes(reference.getBytes());
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
		dbloadds = new Dbloadds(configuration);
		pmtarr = new Pmtarr(configuration);
		sqlca = new Sqlca(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		header1 = new Header1(configuration);
		header2 = new Header2(configuration);
		sfl1 = new Sfl1(configuration);
		ctl1 = new Ctl1(configuration);
		footer = new Footer(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		ptr_ind = new Ptr_ind(configuration);
		alwayson = new Alwayson(configuration);
		rrn = new Rrn(configuration);
		wtopkey = new Wtopkey(configuration);
		wcursorkey = new Wcursorkey(configuration);
		firstrowfetch = new Firstrowfetch(configuration);
		lastrowfetch = new Lastrowfetch(configuration);
		indicatords_pointer = new Indicatords_pointer(configuration);
		cpagesize = new Cpagesize(configuration);
		down = new Down(configuration);
		up = new Up(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(indicatords, dbloadds, pmtarr, sqlca, sharedRecordFields, header1, header2, sfl1, ctl1, footer, msgsfl, msgsflc, ptr_ind, alwayson, rrn, wtopkey, wcursorkey, firstrowfetch, lastrowfetch, indicatords_pointer, cpagesize, down, up);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdaut01rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
