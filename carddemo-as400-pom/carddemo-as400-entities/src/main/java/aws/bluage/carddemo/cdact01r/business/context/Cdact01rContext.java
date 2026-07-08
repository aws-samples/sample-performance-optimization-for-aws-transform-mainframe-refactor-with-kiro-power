package aws.bluage.carddemo.cdact01r.business.context;
import aws.bluage.carddemo.cdact01r.business.model.Applyfltr;
import aws.bluage.carddemo.cdact01r.business.model.Applyfltsv;
import aws.bluage.carddemo.cdact01r.business.model.Cdatr04;
import aws.bluage.carddemo.cdact01r.business.model.Ctl1;
import aws.bluage.carddemo.cdact01r.business.model.Custfltsv;
import aws.bluage.carddemo.cdact01r.business.model.Custidc;
import aws.bluage.carddemo.cdact01r.business.model.Delerrwin;
import aws.bluage.carddemo.cdact01r.business.model.Delwin;
import aws.bluage.carddemo.cdact01r.business.model.Filterstring;
import aws.bluage.carddemo.cdact01r.business.model.Filterwin;
import aws.bluage.carddemo.cdact01r.business.model.Firstkey;
import aws.bluage.carddemo.cdact01r.business.model.Footer;
import aws.bluage.carddemo.cdact01r.business.model.Header1;
import aws.bluage.carddemo.cdact01r.business.model.Header2;
import aws.bluage.carddemo.cdact01r.business.model.ISNUMERICReturn;
import aws.bluage.carddemo.cdact01r.business.model.Lastkey;
import aws.bluage.carddemo.cdact01r.business.model.Loadstatus;
import aws.bluage.carddemo.cdact01r.business.model.Msgid;
import aws.bluage.carddemo.cdact01r.business.model.Msgsfl;
import aws.bluage.carddemo.cdact01r.business.model.Msgsflc;
import aws.bluage.carddemo.cdact01r.business.model.Pagesize;
import aws.bluage.carddemo.cdact01r.business.model.Pgmstatus;
import aws.bluage.carddemo.cdact01r.business.model.Poskey;
import aws.bluage.carddemo.cdact01r.business.model.Prefiltkey;
import aws.bluage.carddemo.cdact01r.business.model.Readct;
import aws.bluage.carddemo.cdact01r.business.model.Scanpos;
import aws.bluage.carddemo.cdact01r.business.model.Sfl1;
import aws.bluage.carddemo.cdact01r.business.model.SharedRecordFields;
import aws.bluage.carddemo.cdact01r.business.model.Skipflag;
import aws.bluage.carddemo.cdact01r.business.model.Trigrefresh;
import aws.bluage.carddemo.cdact01r.business.model.Viewonly;
import aws.bluage.carddemo.cdact01r.business.model.Waccount;
import aws.bluage.carddemo.cdact01r.business.model.Wactivests;
import aws.bluage.carddemo.cdact01r.business.model.Wccmaccount;
import aws.bluage.carddemo.cdact01r.business.model.Wccmpricust;
import aws.bluage.carddemo.cdact01r.business.model.Wccmseccust;
import aws.bluage.carddemo.cdact01r.business.model.Wcreditcard;
import aws.bluage.carddemo.cdact01r.business.model.Widx;
import aws.bluage.carddemo.cdact01r.business.model.Wsflempty;
import aws.bluage.carddemo.cdact01r.business.model.Wsfltop;
import aws.bluage.carddemo.cdact01r.business.model.Wteststring;
import aws.bluage.carddemo.common.business.database.cdactp.Cdactpr;
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
 * Data simplifier context Cdact01rContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'cdactpr' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Cdactpr
 * <br></p>
 * 
 * <p>About 'cdccmpr' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Cdccmpr
 * <br></p>
 * 
 * <p>About 'inLR' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.InLR
 * <br></p>
 * 
 * <p>About 'indicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.IndicatorsGroup
 * <br></p>
 * 
 * <p>About 'fkeyIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.FkeyIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'controlLevelGroup' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.ControlLevelGroup
 * <br></p>
 * 
 * <p>About 'overflowIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.OverflowIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'haltIndicatorsGroup' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.HaltIndicatorsGroup
 * <br></p>
 * 
 * <p>About 'pgmstatus' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Pgmstatus
 * <br></p>
 * 
 * <p>About 'sharedRecordFields' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.SharedRecordFields
 * <br></p>
 * 
 * <p>About 'cdatr04' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Cdatr04
 * <br></p>
 * 
 * <p>About 'header1' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Header1
 * <br></p>
 * 
 * <p>About 'header2' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Header2
 * <br></p>
 * 
 * <p>About 'sfl1' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Sfl1
 * <br></p>
 * 
 * <p>About 'ctl1' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Ctl1
 * <br></p>
 * 
 * <p>About 'footer' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Footer
 * <br></p>
 * 
 * <p>About 'filterwin' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Filterwin
 * <br></p>
 * 
 * <p>About 'delwin' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Delwin
 * <br></p>
 * 
 * <p>About 'delerrwin' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Delerrwin
 * <br></p>
 * 
 * <p>About 'msgsfl' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Msgsfl
 * <br></p>
 * 
 * <p>About 'msgsflc' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Msgsflc
 * <br></p>
 * 
 * <p>About 'filterstring' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Filterstring
 * <br></p>
 * 
 * <p>About 'loadstatus' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Loadstatus
 * <br></p>
 * 
 * <p>About 'wactivests' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wactivests
 * <br></p>
 * 
 * <p>About 'wcreditcard' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wcreditcard
 * <br></p>
 * 
 * <p>About 'wteststring' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wteststring
 * <br></p>
 * 
 * <p>About 'wsfltop' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wsfltop
 * <br></p>
 * 
 * <p>About 'widx' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Widx
 * <br></p>
 * 
 * <p>About 'wccmaccount' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wccmaccount
 * <br></p>
 * 
 * <p>About 'wccmpricust' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wccmpricust
 * <br></p>
 * 
 * <p>About 'wccmseccust' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wccmseccust
 * <br></p>
 * 
 * <p>About 'wsflempty' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Wsflempty
 * <br></p>
 * 
 * <p>About 'waccount' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Waccount
 * <br></p>
 * 
 * <p>About 'firstkey' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Firstkey
 * <br></p>
 * 
 * <p>About 'lastkey' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Lastkey
 * <br></p>
 * 
 * <p>About 'poskey' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Poskey
 * <br></p>
 * 
 * <p>About 'prefiltkey' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Prefiltkey
 * <br></p>
 * 
 * <p>About 'custfltsv' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Custfltsv
 * <br></p>
 * 
 * <p>About 'pagesize' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Pagesize
 * <br></p>
 * 
 * <p>About 'msgid' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Msgid
 * <br></p>
 * 
 * <p>About 'skipflag' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Skipflag
 * <br></p>
 * 
 * <p>About 'scanpos' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Scanpos
 * <br></p>
 * 
 * <p>About 'applyfltr' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Applyfltr
 * <br></p>
 * 
 * <p>About 'applyfltsv' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Applyfltsv
 * <br></p>
 * 
 * <p>About 'trigrefresh' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Trigrefresh
 * <br></p>
 * 
 * <p>About 'readct' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Readct
 * <br></p>
 * 
 * <p>About 'viewonly' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Viewonly
 * <br></p>
 * 
 * <p>About 'custidc' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.Custidc
 * <br></p>
 * 
 * <p>About 'fieldsToUpdate' field, <br>uml entity: gwtype.List<String>
 * <br></p>
 * 
 * <p>About 'iSNUMERICReturn' field, <br>uml entity: aws.bluage.carddemo.cdact01r.business.model.ISNUMERICReturn
 * <br></p>
 * 
 * <p>About 'firstRun' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.carddemo.cdact01r.business.context.Cdact01rContext")
@Lazy
@Scope("prototype")
public class Cdact01rContext extends Blu4ivRuntimeContext {
	
	private Cdactpr cdactpr;
	private Cdccmpr cdccmpr;
	private Pgmstatus pgmstatus;
	private SharedRecordFields sharedRecordFields;
	private Cdatr04 cdatr04;
	private Header1 header1;
	private Header2 header2;
	private Sfl1 sfl1;
	private Ctl1 ctl1;
	private Footer footer;
	private Filterwin filterwin;
	private Delwin delwin;
	private Delerrwin delerrwin;
	private Msgsfl msgsfl;
	private Msgsflc msgsflc;
	private Filterstring filterstring;
	private Loadstatus loadstatus;
	private Wactivests wactivests;
	private Wcreditcard wcreditcard;
	private Wteststring wteststring;
	private Wsfltop wsfltop;
	private Widx widx;
	private Wccmaccount wccmaccount;
	private Wccmpricust wccmpricust;
	private Wccmseccust wccmseccust;
	private Wsflempty wsflempty;
	private Waccount waccount;
	private Firstkey firstkey;
	private Lastkey lastkey;
	private Poskey poskey;
	private Prefiltkey prefiltkey;
	private Custfltsv custfltsv;
	private Pagesize pagesize;
	private Msgid msgid;
	private Skipflag skipflag;
	private Scanpos scanpos;
	private Applyfltr applyfltr;
	private Applyfltsv applyfltsv;
	private Trigrefresh trigrefresh;
	private Readct readct;
	private Viewonly viewonly;
	private Custidc custidc;
	private ISNUMERICReturn iSNUMERICReturn;

	private List<String> fieldsToUpdate;

	private boolean firstRun;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cdact01rContext (@Qualifier("Cdact01rContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
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
		this.cdactpr.setBytes(reference.getBytes());
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
	 * Getter for cdatr04.
	 * @return the cdatr04
	 */
	public Cdatr04 getCdatr04() {
		return this.cdatr04;
	}

	/**
	 * Setter for cdatr04.
	 * @param reference the new value for cdatr04
	 */
	public void setCdatr04(RangeReference reference) {
		this.cdatr04.setBytes(reference.getBytes());
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
	 * Getter for filterwin.
	 * @return the filterwin
	 */
	public Filterwin getFilterwin() {
		return this.filterwin;
	}

	/**
	 * Setter for filterwin.
	 * @param reference the new value for filterwin
	 */
	public void setFilterwin(RangeReference reference) {
		this.filterwin.setBytes(reference.getBytes());
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
	 * Getter for filterstring.
	 * @return the filterstring
	 */
	public Filterstring getFilterstring() {
		return this.filterstring;
	}

	/**
	 * Setter for filterstring.
	 * @param reference the new value for filterstring
	 */
	public void setFilterstring(RangeReference reference) {
		this.filterstring.setBytes(reference.getBytes());
	}

	/**
	 * Getter for loadstatus.
	 * @return the loadstatus
	 */
	public Loadstatus getLoadstatus() {
		return this.loadstatus;
	}

	/**
	 * Setter for loadstatus.
	 * @param reference the new value for loadstatus
	 */
	public void setLoadstatus(RangeReference reference) {
		this.loadstatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wactivests.
	 * @return the wactivests
	 */
	public Wactivests getWactivests() {
		return this.wactivests;
	}

	/**
	 * Setter for wactivests.
	 * @param reference the new value for wactivests
	 */
	public void setWactivests(RangeReference reference) {
		this.wactivests.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wcreditcard.
	 * @return the wcreditcard
	 */
	public Wcreditcard getWcreditcard() {
		return this.wcreditcard;
	}

	/**
	 * Setter for wcreditcard.
	 * @param reference the new value for wcreditcard
	 */
	public void setWcreditcard(RangeReference reference) {
		this.wcreditcard.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wteststring.
	 * @return the wteststring
	 */
	public Wteststring getWteststring() {
		return this.wteststring;
	}

	/**
	 * Setter for wteststring.
	 * @param reference the new value for wteststring
	 */
	public void setWteststring(RangeReference reference) {
		this.wteststring.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsfltop.
	 * @return the wsfltop
	 */
	public Wsfltop getWsfltop() {
		return this.wsfltop;
	}

	/**
	 * Setter for wsfltop.
	 * @param reference the new value for wsfltop
	 */
	public void setWsfltop(RangeReference reference) {
		this.wsfltop.setBytes(reference.getBytes());
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
	 * Getter for wccmaccount.
	 * @return the wccmaccount
	 */
	public Wccmaccount getWccmaccount() {
		return this.wccmaccount;
	}

	/**
	 * Setter for wccmaccount.
	 * @param reference the new value for wccmaccount
	 */
	public void setWccmaccount(RangeReference reference) {
		this.wccmaccount.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wccmpricust.
	 * @return the wccmpricust
	 */
	public Wccmpricust getWccmpricust() {
		return this.wccmpricust;
	}

	/**
	 * Setter for wccmpricust.
	 * @param reference the new value for wccmpricust
	 */
	public void setWccmpricust(RangeReference reference) {
		this.wccmpricust.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wccmseccust.
	 * @return the wccmseccust
	 */
	public Wccmseccust getWccmseccust() {
		return this.wccmseccust;
	}

	/**
	 * Setter for wccmseccust.
	 * @param reference the new value for wccmseccust
	 */
	public void setWccmseccust(RangeReference reference) {
		this.wccmseccust.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsflempty.
	 * @return the wsflempty
	 */
	public Wsflempty getWsflempty() {
		return this.wsflempty;
	}

	/**
	 * Setter for wsflempty.
	 * @param reference the new value for wsflempty
	 */
	public void setWsflempty(RangeReference reference) {
		this.wsflempty.setBytes(reference.getBytes());
	}

	/**
	 * Getter for waccount.
	 * @return the waccount
	 */
	public Waccount getWaccount() {
		return this.waccount;
	}

	/**
	 * Setter for waccount.
	 * @param reference the new value for waccount
	 */
	public void setWaccount(RangeReference reference) {
		this.waccount.setBytes(reference.getBytes());
	}

	/**
	 * Getter for firstkey.
	 * @return the firstkey
	 */
	public Firstkey getFirstkey() {
		return this.firstkey;
	}

	/**
	 * Setter for firstkey.
	 * @param reference the new value for firstkey
	 */
	public void setFirstkey(RangeReference reference) {
		this.firstkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for lastkey.
	 * @return the lastkey
	 */
	public Lastkey getLastkey() {
		return this.lastkey;
	}

	/**
	 * Setter for lastkey.
	 * @param reference the new value for lastkey
	 */
	public void setLastkey(RangeReference reference) {
		this.lastkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for poskey.
	 * @return the poskey
	 */
	public Poskey getPoskey() {
		return this.poskey;
	}

	/**
	 * Setter for poskey.
	 * @param reference the new value for poskey
	 */
	public void setPoskey(RangeReference reference) {
		this.poskey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for prefiltkey.
	 * @return the prefiltkey
	 */
	public Prefiltkey getPrefiltkey() {
		return this.prefiltkey;
	}

	/**
	 * Setter for prefiltkey.
	 * @param reference the new value for prefiltkey
	 */
	public void setPrefiltkey(RangeReference reference) {
		this.prefiltkey.setBytes(reference.getBytes());
	}

	/**
	 * Getter for custfltsv.
	 * @return the custfltsv
	 */
	public Custfltsv getCustfltsv() {
		return this.custfltsv;
	}

	/**
	 * Setter for custfltsv.
	 * @param reference the new value for custfltsv
	 */
	public void setCustfltsv(RangeReference reference) {
		this.custfltsv.setBytes(reference.getBytes());
	}

	/**
	 * Getter for pagesize.
	 * @return the pagesize
	 */
	public Pagesize getPagesize() {
		return this.pagesize;
	}

	/**
	 * Setter for pagesize.
	 * @param reference the new value for pagesize
	 */
	public void setPagesize(RangeReference reference) {
		this.pagesize.setBytes(reference.getBytes());
	}

	/**
	 * Getter for msgid.
	 * @return the msgid
	 */
	public Msgid getMsgid() {
		return this.msgid;
	}

	/**
	 * Setter for msgid.
	 * @param reference the new value for msgid
	 */
	public void setMsgid(RangeReference reference) {
		this.msgid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for skipflag.
	 * @return the skipflag
	 */
	public Skipflag getSkipflag() {
		return this.skipflag;
	}

	/**
	 * Setter for skipflag.
	 * @param reference the new value for skipflag
	 */
	public void setSkipflag(RangeReference reference) {
		this.skipflag.setBytes(reference.getBytes());
	}

	/**
	 * Getter for scanpos.
	 * @return the scanpos
	 */
	public Scanpos getScanpos() {
		return this.scanpos;
	}

	/**
	 * Setter for scanpos.
	 * @param reference the new value for scanpos
	 */
	public void setScanpos(RangeReference reference) {
		this.scanpos.setBytes(reference.getBytes());
	}

	/**
	 * Getter for applyfltr.
	 * @return the applyfltr
	 */
	public Applyfltr getApplyfltr() {
		return this.applyfltr;
	}

	/**
	 * Setter for applyfltr.
	 * @param reference the new value for applyfltr
	 */
	public void setApplyfltr(RangeReference reference) {
		this.applyfltr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for applyfltsv.
	 * @return the applyfltsv
	 */
	public Applyfltsv getApplyfltsv() {
		return this.applyfltsv;
	}

	/**
	 * Setter for applyfltsv.
	 * @param reference the new value for applyfltsv
	 */
	public void setApplyfltsv(RangeReference reference) {
		this.applyfltsv.setBytes(reference.getBytes());
	}

	/**
	 * Getter for trigrefresh.
	 * @return the trigrefresh
	 */
	public Trigrefresh getTrigrefresh() {
		return this.trigrefresh;
	}

	/**
	 * Setter for trigrefresh.
	 * @param reference the new value for trigrefresh
	 */
	public void setTrigrefresh(RangeReference reference) {
		this.trigrefresh.setBytes(reference.getBytes());
	}

	/**
	 * Getter for readct.
	 * @return the readct
	 */
	public Readct getReadct() {
		return this.readct;
	}

	/**
	 * Setter for readct.
	 * @param reference the new value for readct
	 */
	public void setReadct(RangeReference reference) {
		this.readct.setBytes(reference.getBytes());
	}

	/**
	 * Getter for viewonly.
	 * @return the viewonly
	 */
	public Viewonly getViewonly() {
		return this.viewonly;
	}

	/**
	 * Setter for viewonly.
	 * @param reference the new value for viewonly
	 */
	public void setViewonly(RangeReference reference) {
		this.viewonly.setBytes(reference.getBytes());
	}

	/**
	 * Getter for custidc.
	 * @return the custidc
	 */
	public Custidc getCustidc() {
		return this.custidc;
	}

	/**
	 * Setter for custidc.
	 * @param reference the new value for custidc
	 */
	public void setCustidc(RangeReference reference) {
		this.custidc.setBytes(reference.getBytes());
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
		cdactpr = new Cdactpr(configuration);
		pgmstatus = new Pgmstatus(configuration);
		sharedRecordFields = new SharedRecordFields(configuration);
		cdatr04 = new Cdatr04(configuration);
		header1 = new Header1(configuration);
		header2 = new Header2(configuration);
		sfl1 = new Sfl1(configuration);
		ctl1 = new Ctl1(configuration);
		footer = new Footer(configuration);
		filterwin = new Filterwin(configuration);
		delwin = new Delwin(configuration);
		delerrwin = new Delerrwin(configuration);
		msgsfl = new Msgsfl(configuration);
		msgsflc = new Msgsflc(configuration);
		filterstring = new Filterstring(configuration);
		loadstatus = new Loadstatus(configuration);
		wactivests = new Wactivests(configuration);
		wcreditcard = new Wcreditcard(configuration);
		wteststring = new Wteststring(configuration);
		wsfltop = new Wsfltop(configuration);
		widx = new Widx(configuration);
		wccmaccount = new Wccmaccount(configuration);
		wccmpricust = new Wccmpricust(configuration);
		wccmseccust = new Wccmseccust(configuration);
		wsflempty = new Wsflempty(configuration);
		waccount = new Waccount(configuration);
		firstkey = new Firstkey(configuration);
		lastkey = new Lastkey(configuration);
		poskey = new Poskey(configuration);
		prefiltkey = new Prefiltkey(configuration);
		custfltsv = new Custfltsv(configuration);
		pagesize = new Pagesize(configuration);
		msgid = new Msgid(configuration);
		skipflag = new Skipflag(configuration);
		scanpos = new Scanpos(configuration);
		applyfltr = new Applyfltr(configuration);
		applyfltsv = new Applyfltsv(configuration);
		trigrefresh = new Trigrefresh(configuration);
		readct = new Readct(configuration);
		viewonly = new Viewonly(configuration);
		custidc = new Custidc(configuration);
		iSNUMERICReturn = new ISNUMERICReturn(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(cdccmpr, cdactpr, pgmstatus, sharedRecordFields, cdatr04, header1, header2, sfl1, ctl1, footer, filterwin, delwin, delerrwin, msgsfl, msgsflc, filterstring, loadstatus, wactivests, wcreditcard, wteststring, wsfltop, widx, wccmaccount, wccmpricust, wccmseccust, wsflempty, waccount, firstkey, lastkey, poskey, prefiltkey, custfltsv, pagesize, msgid, skipflag, scanpos, applyfltr, applyfltsv, trigrefresh, readct, viewonly, custidc, iSNUMERICReturn);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCdact01rContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
