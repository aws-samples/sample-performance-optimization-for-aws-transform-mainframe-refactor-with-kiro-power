// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdtrnu01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.commons.collections4.ListUtils;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import com.netfective.bluage.gapwalk.rt.blu4iv.cmd.OverrideManager;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.AbstractEntityDao;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.KeyMetadata;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.KeyMetadata.EKeyOrder;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.KeyMetadata.EKeyType;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.ConditionMetadata;
import aws.bluage.carddemo.common.business.database.cdtrnp.CdtrnpCdtrnpr;
import aws.bluage.carddemo.common.business.database.cdtrnp.Cdtrnpr;
import aws.bluage.carddemo.common.business.database.cdtrnp.CdtrnpCdtrnprMapper;
import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

import aws.bluage.carddemo.common.business.database.*;

/**
 * DAO for entity Cdtrnu01Cdtrnpr.
 * 
 * Used persistent entities are :
 * 
 * @see aws.bluage.carddemo.common.business.database.CdtrnpCdtrnpr
 * 
 * 
 */
@Component
@Scope("prototype") 
public class Cdtrnu01CdtrnprDao extends AbstractEntityDao<CdtrnpCdtrnpr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdtrnpCdtrnpr")));
	
	// Persistent entities
	private CdtrnpCdtrnpr cdtrnpCdtrnpr;

	// DS entities
	private Cdtrnpr cdtrnpr;
	
	// Mapper
	private final CdtrnpCdtrnprMapper cdtrnpCdtrnprMapper = new CdtrnpCdtrnprMapper();

	static {
		keys.add(KeyMetadata.of("CdtrnpCdtrnpr.trnid", EKeyOrder.ASC, 15, EKeyType.Long, 0, true));
		keys.add(KeyMetadata.of("CdtrnpCdtrnpr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
	}
	
	@PostConstruct
	public void doInit(){
		super.init();
    	OverrideManager.getInstance().putFileMapping("CdtrnpCdtrnpr", "CDTRNP");
	}
	
	@PreDestroy
	@Override
	public void close() {
		super.close();
	}
	
	@Override
	public EntityDao<CdtrnpCdtrnpr> withRecord(RangeReference record) {
		if(cdtrnpr == null){
			cdtrnpr = new Cdtrnpr(configuration, record);
		} else {
			cdtrnpr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "Cdtrnu01Cdtrnpr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDTRNU01;
	}
	
	@Override
	protected List<KeyMetadata> getKeyMetadatas() {
		return keys;
	}
	
	@Override
	public List<ConditionMetadata> getConditionMetadata() {
		return conditions;
	}


	@Override
	protected Class<CdtrnpCdtrnpr> getRecordClass() {		
		return CdtrnpCdtrnpr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdtrnpCdtrnpr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getTrnid());
		return retValue;
	}

	@Override
	protected Object[] getKeyLowValues() {
		return Arrays.asList(-999999999999999l).toArray();
	}
	
	@Override
	protected Object[] getKeyHighValues() {
		return Arrays.asList(999999999999999l).toArray();
	}

	@Override
	protected List<Object> getConditionValues(CdtrnpCdtrnpr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdtrnpr != null ? cdtrnpr : new Cdtrnpr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdtrnpCdtrnpr != null) {
			res.add(cdtrnpCdtrnpr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		cdtrnpCdtrnpr = (CdtrnpCdtrnpr) o;
	}
	
	@Override
	protected void clearJpaEntities() {
		cdtrnpCdtrnpr = null; 
	}


	@Override
	protected CdtrnpCdtrnpr newInstance() {
		cdtrnpCdtrnpr = new CdtrnpCdtrnpr();
		return cdtrnpCdtrnpr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdtrnpCdtrnpr != null){
	    	return cdtrnpCdtrnpr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdtrnpr != null) {
			cdtrnpCdtrnprMapper.updateCdtrnprFromICdtrnpCdtrnpr(ctx, cdtrnpCdtrnpr, cdtrnpr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdtrnpr != null) {
			cdtrnpCdtrnprMapper.updateICdtrnpCdtrnprFromCdtrnpr(ctx, cdtrnpr, cdtrnpCdtrnpr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}