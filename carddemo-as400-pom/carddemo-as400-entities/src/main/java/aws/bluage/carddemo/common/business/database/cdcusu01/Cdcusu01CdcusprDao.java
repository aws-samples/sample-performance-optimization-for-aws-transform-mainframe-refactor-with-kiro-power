// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdcusu01;

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
import aws.bluage.carddemo.common.business.database.cdcusp.CdcuspCdcuspr;
import aws.bluage.carddemo.common.business.database.cdcusp.Cdcuspr;
import aws.bluage.carddemo.common.business.database.cdcusp.CdcuspCdcusprMapper;
import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

import aws.bluage.carddemo.common.business.database.*;

/**
 * DAO for entity Cdcusu01Cdcuspr.
 * 
 * Used persistent entities are :
 * 
 * @see aws.bluage.carddemo.common.business.database.CdcuspCdcuspr
 * 
 * 
 */
@Component
@Scope("prototype") 
public class Cdcusu01CdcusprDao extends AbstractEntityDao<CdcuspCdcuspr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdcuspCdcuspr")));
	
	// Persistent entities
	private CdcuspCdcuspr cdcuspCdcuspr;

	// DS entities
	private Cdcuspr cdcuspr;
	
	// Mapper
	private final CdcuspCdcusprMapper cdcuspCdcusprMapper = new CdcuspCdcusprMapper();

	static {
		keys.add(KeyMetadata.of("CdcuspCdcuspr.custid", EKeyOrder.ASC, 9, EKeyType.Integer, 0, true));
		keys.add(KeyMetadata.of("CdcuspCdcuspr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
	}
	
	@PostConstruct
	public void doInit(){
		super.init();
    	OverrideManager.getInstance().putFileMapping("CdcuspCdcuspr", "CDCUSP");
	}
	
	@PreDestroy
	@Override
	public void close() {
		super.close();
	}
	
	@Override
	public EntityDao<CdcuspCdcuspr> withRecord(RangeReference record) {
		if(cdcuspr == null){
			cdcuspr = new Cdcuspr(configuration, record);
		} else {
			cdcuspr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "Cdcusu01Cdcuspr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDCUSU01;
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
	protected Class<CdcuspCdcuspr> getRecordClass() {		
		return CdcuspCdcuspr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdcuspCdcuspr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getCustid());
		return retValue;
	}

	@Override
	protected Object[] getKeyLowValues() {
		return Arrays.asList(-999999999).toArray();
	}
	
	@Override
	protected Object[] getKeyHighValues() {
		return Arrays.asList(999999999).toArray();
	}

	@Override
	protected List<Object> getConditionValues(CdcuspCdcuspr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdcuspr != null ? cdcuspr : new Cdcuspr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdcuspCdcuspr != null) {
			res.add(cdcuspCdcuspr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		cdcuspCdcuspr = (CdcuspCdcuspr) o;
	}
	
	@Override
	protected void clearJpaEntities() {
		cdcuspCdcuspr = null; 
	}


	@Override
	protected CdcuspCdcuspr newInstance() {
		cdcuspCdcuspr = new CdcuspCdcuspr();
		return cdcuspCdcuspr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdcuspCdcuspr != null){
	    	return cdcuspCdcuspr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdcuspr != null) {
			cdcuspCdcusprMapper.updateCdcusprFromICdcuspCdcuspr(ctx, cdcuspCdcuspr, cdcuspr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdcuspr != null) {
			cdcuspCdcusprMapper.updateICdcuspCdcusprFromCdcuspr(ctx, cdcuspr, cdcuspCdcuspr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}