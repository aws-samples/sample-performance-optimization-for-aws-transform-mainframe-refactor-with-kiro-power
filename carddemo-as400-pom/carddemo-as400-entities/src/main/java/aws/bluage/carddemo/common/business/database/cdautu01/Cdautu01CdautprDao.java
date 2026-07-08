// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdautu01;

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
import aws.bluage.carddemo.common.business.database.cdautp.CdautpCdautpr;
import aws.bluage.carddemo.common.business.database.cdautp.Cdautpr;
import aws.bluage.carddemo.common.business.database.cdautp.CdautpCdautprMapper;
import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

import aws.bluage.carddemo.common.business.database.*;

/**
 * DAO for entity Cdautu01Cdautpr.
 * 
 * Used persistent entities are :
 * 
 * @see aws.bluage.carddemo.common.business.database.CdautpCdautpr
 * 
 * 
 */
@Component
@Scope("prototype") 
public class Cdautu01CdautprDao extends AbstractEntityDao<CdautpCdautpr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdautpCdautpr")));
	
	// Persistent entities
	private CdautpCdautpr cdautpCdautpr;

	// DS entities
	private Cdautpr cdautpr;
	
	// Mapper
	private final CdautpCdautprMapper cdautpCdautprMapper = new CdautpCdautprMapper();

	static {
		keys.add(KeyMetadata.of("CdautpCdautpr.authid", EKeyOrder.ASC, 18, EKeyType.Long, 0, true));
		keys.add(KeyMetadata.of("CdautpCdautpr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
	}
	
	@PostConstruct
	public void doInit(){
		super.init();
    	OverrideManager.getInstance().putFileMapping("CdautpCdautpr", "CDAUTP");
	}
	
	@PreDestroy
	@Override
	public void close() {
		super.close();
	}
	
	@Override
	public EntityDao<CdautpCdautpr> withRecord(RangeReference record) {
		if(cdautpr == null){
			cdautpr = new Cdautpr(configuration, record);
		} else {
			cdautpr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "Cdautu01Cdautpr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDAUTU01;
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
	protected Class<CdautpCdautpr> getRecordClass() {		
		return CdautpCdautpr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdautpCdautpr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getAuthid());
		return retValue;
	}

	@Override
	protected Object[] getKeyLowValues() {
		return Arrays.asList(-999999999999999999l).toArray();
	}
	
	@Override
	protected Object[] getKeyHighValues() {
		return Arrays.asList(999999999999999999l).toArray();
	}

	@Override
	protected List<Object> getConditionValues(CdautpCdautpr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdautpr != null ? cdautpr : new Cdautpr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdautpCdautpr != null) {
			res.add(cdautpCdautpr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		cdautpCdautpr = (CdautpCdautpr) o;
	}
	
	@Override
	protected void clearJpaEntities() {
		cdautpCdautpr = null; 
	}


	@Override
	protected CdautpCdautpr newInstance() {
		cdautpCdautpr = new CdautpCdautpr();
		return cdautpCdautpr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdautpCdautpr != null){
	    	return cdautpCdautpr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdautpr != null) {
			cdautpCdautprMapper.updateCdautprFromICdautpCdautpr(ctx, cdautpCdautpr, cdautpr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdautpr != null) {
			cdautpCdautprMapper.updateICdautpCdautprFromCdautpr(ctx, cdautpr, cdautpCdautpr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}