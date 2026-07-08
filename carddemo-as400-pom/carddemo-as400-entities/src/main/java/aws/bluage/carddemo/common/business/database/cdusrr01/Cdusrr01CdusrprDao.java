// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdusrr01;

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
import aws.bluage.carddemo.common.business.database.cdusrp.CdusrpCdusrpr;
import aws.bluage.carddemo.common.business.database.cdusrp.Cdusrpr;
import aws.bluage.carddemo.common.business.database.cdusrp.CdusrpCdusrprMapper;
import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

import aws.bluage.carddemo.common.business.database.*;

/**
 * DAO for entity Cdusrr01Cdusrpr.
 * 
 * Used persistent entities are :
 * 
 * @see aws.bluage.carddemo.common.business.database.CdusrpCdusrpr
 * 
 * 
 */
@Component
@Scope("prototype") 
public class Cdusrr01CdusrprDao extends AbstractEntityDao<CdusrpCdusrpr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdusrpCdusrpr")));
	
	// Persistent entities
	private CdusrpCdusrpr cdusrpCdusrpr;

	// DS entities
	private Cdusrpr cdusrpr;
	
	// Mapper
	private final CdusrpCdusrprMapper cdusrpCdusrprMapper = new CdusrpCdusrprMapper();

	static {
		keys.add(KeyMetadata.of("CdusrpCdusrpr.userid", EKeyOrder.ASC, 10, EKeyType.String));
		keys.add(KeyMetadata.of("CdusrpCdusrpr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
	}
	
	@PostConstruct
	public void doInit(){
		super.init();
    	OverrideManager.getInstance().putFileMapping("CdusrpCdusrpr", "CDUSRP");
	}
	
	@PreDestroy
	@Override
	public void close() {
		super.close();
	}
	
	@Override
	public EntityDao<CdusrpCdusrpr> withRecord(RangeReference record) {
		if(cdusrpr == null){
			cdusrpr = new Cdusrpr(configuration, record);
		} else {
			cdusrpr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "Cdusrr01Cdusrpr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDUSRR01;
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
	protected Class<CdusrpCdusrpr> getRecordClass() {		
		return CdusrpCdusrpr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdusrpCdusrpr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getUserid());
		return retValue;
	}

	@Override
	protected Object[] getKeyLowValues() {
		return Arrays.asList("").toArray();
	}
	
	@Override
	protected Object[] getKeyHighValues() {
		return Arrays.asList("ZZZZZZZZZZ").toArray();
	}

	@Override
	protected List<Object> getConditionValues(CdusrpCdusrpr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdusrpr != null ? cdusrpr : new Cdusrpr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdusrpCdusrpr != null) {
			res.add(cdusrpCdusrpr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		cdusrpCdusrpr = (CdusrpCdusrpr) o;
	}
	
	@Override
	protected void clearJpaEntities() {
		cdusrpCdusrpr = null; 
	}


	@Override
	protected CdusrpCdusrpr newInstance() {
		cdusrpCdusrpr = new CdusrpCdusrpr();
		return cdusrpCdusrpr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdusrpCdusrpr != null){
	    	return cdusrpCdusrpr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdusrpr != null) {
			cdusrpCdusrprMapper.updateCdusrprFromICdusrpCdusrpr(ctx, cdusrpCdusrpr, cdusrpr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdusrpr != null) {
			cdusrpCdusrprMapper.updateICdusrpCdusrprFromCdusrpr(ctx, cdusrpr, cdusrpCdusrpr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}