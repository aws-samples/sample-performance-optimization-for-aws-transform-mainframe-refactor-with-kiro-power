// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdccmr01;

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
import aws.bluage.carddemo.common.business.database.cdccmp.CdccmpCdccmpr;
import aws.bluage.carddemo.common.business.database.cdccmp.Cdccmpr;
import aws.bluage.carddemo.common.business.database.cdccmp.CdccmpCdccmprMapper;
import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

import aws.bluage.carddemo.common.business.database.*;

/**
 * DAO for entity Cdccmr01Cdccmpr.
 * 
 * Used persistent entities are :
 * 
 * @see aws.bluage.carddemo.common.business.database.CdccmpCdccmpr
 * 
 * 
 */
@Component
@Scope("prototype") 
public class Cdccmr01CdccmprDao extends AbstractEntityDao<CdccmpCdccmpr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdccmpCdccmpr")));
	
	// Persistent entities
	private CdccmpCdccmpr cdccmpCdccmpr;

	// DS entities
	private Cdccmpr cdccmpr;
	
	// Mapper
	private final CdccmpCdccmprMapper cdccmpCdccmprMapper = new CdccmpCdccmprMapper();

	static {
		keys.add(KeyMetadata.of("CdccmpCdccmpr.cardnum", EKeyOrder.ASC, 16, EKeyType.Long, 0, true));
		keys.add(KeyMetadata.of("CdccmpCdccmpr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
	}
	
	@PostConstruct
	public void doInit(){
		super.init();
    	OverrideManager.getInstance().putFileMapping("CdccmpCdccmpr", "CDCCMP");
	}
	
	@PreDestroy
	@Override
	public void close() {
		super.close();
	}
	
	@Override
	public EntityDao<CdccmpCdccmpr> withRecord(RangeReference record) {
		if(cdccmpr == null){
			cdccmpr = new Cdccmpr(configuration, record);
		} else {
			cdccmpr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "Cdccmr01Cdccmpr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDCCMR01;
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
	protected Class<CdccmpCdccmpr> getRecordClass() {		
		return CdccmpCdccmpr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdccmpCdccmpr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getCardnum());
		return retValue;
	}

	@Override
	protected Object[] getKeyLowValues() {
		return Arrays.asList(-9999999999999999l).toArray();
	}
	
	@Override
	protected Object[] getKeyHighValues() {
		return Arrays.asList(9999999999999999l).toArray();
	}

	@Override
	protected List<Object> getConditionValues(CdccmpCdccmpr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdccmpr != null ? cdccmpr : new Cdccmpr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdccmpCdccmpr != null) {
			res.add(cdccmpCdccmpr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		cdccmpCdccmpr = (CdccmpCdccmpr) o;
	}
	
	@Override
	protected void clearJpaEntities() {
		cdccmpCdccmpr = null; 
	}


	@Override
	protected CdccmpCdccmpr newInstance() {
		cdccmpCdccmpr = new CdccmpCdccmpr();
		return cdccmpCdccmpr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdccmpCdccmpr != null){
	    	return cdccmpCdccmpr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdccmpr != null) {
			cdccmpCdccmprMapper.updateCdccmprFromICdccmpCdccmpr(ctx, cdccmpCdccmpr, cdccmpr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdccmpr != null) {
			cdccmpCdccmprMapper.updateICdccmpCdccmprFromCdccmpr(ctx, cdccmpr, cdccmpCdccmpr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}