// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdccap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.commons.collections4.ListUtils;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import com.netfective.bluage.gapwalk.rt.blu4iv.EntityDao;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.AbstractEntityDao;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.KeyMetadata;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.KeyMetadata.EKeyOrder;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.KeyMetadata.EKeyType;
import com.netfective.bluage.gapwalk.rt.blu4iv.dao.ConditionMetadata;
import com.netfective.bluage.gapwalk.rt.blu4iv.exception.Blu4ivJpaException;
import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

import aws.bluage.carddemo.common.business.database.*;

/**
 * DAO for entity CdccapCdccapr.
 * 
 */
@Component
@Scope("prototype") 
public class CdccapCdccaprDao extends AbstractEntityDao<CdccapCdccapr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdccapCdccapr"))); 
	
	// Persistent entities
	private CdccapCdccapr cdccapCdccapr;

	// DS entities
	private Cdccapr cdccapr;
	
	// Mapper
	private final CdccapCdccaprMapper cdccapCdccaprMapper = new CdccapCdccaprMapper();

	static {
		keys.add(KeyMetadata.of("CdccapCdccapr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
	}
	
	@PostConstruct
	public void doInit(){
		super.init();
	}
	
	@PreDestroy
	@Override
	public void close() {
		super.close();
	}
	
	@Override
	public EntityDao<CdccapCdccapr> withRecord(RangeReference record) {
		if(cdccapr == null){
			cdccapr = new Cdccapr(configuration, record);
		} else {
			cdccapr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "CdccapCdccapr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDCCAP;
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
	protected Class<CdccapCdccapr> getRecordClass() {		
		return CdccapCdccapr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdccapCdccapr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getIdentifier());
		return retValue;
	}

	@Override
	protected Object[] getKeyLowValues() {
		return Arrays.asList().toArray();
	}
	
	@Override
	protected Object[] getKeyHighValues() {
		return Arrays.asList().toArray();
	}

	@Override
	protected List<Object> getConditionValues(CdccapCdccapr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdccapr != null ? cdccapr : new Cdccapr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdccapCdccapr != null) {
			res.add(cdccapCdccapr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		if (o instanceof CdccapCdccapr) {
			cdccapCdccapr = (CdccapCdccapr) o;
		} else {
		    throw new Blu4ivJpaException("Invalid Object type : " + o.getClass().getSimpleName() + " / CdccapCdccapr expected");
		}
	}
	
	@Override
	protected void clearJpaEntities() {
		cdccapCdccapr = null; 
	}


	@Override
	protected CdccapCdccapr newInstance() {
		cdccapCdccapr = new CdccapCdccapr();
		return cdccapCdccapr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdccapCdccapr != null){
	    	return cdccapCdccapr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdccapr != null) {
			cdccapCdccaprMapper.updateCdccaprFromICdccapCdccapr(ctx, cdccapCdccapr, cdccapr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdccapr != null) {
			cdccapCdccaprMapper.updateICdccapCdccaprFromCdccapr(ctx, cdccapr, cdccapCdccapr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}