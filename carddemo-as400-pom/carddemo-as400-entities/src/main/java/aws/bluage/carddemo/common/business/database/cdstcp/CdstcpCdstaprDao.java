// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdstcp;

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
 * DAO for entity CdstcpCdstapr.
 * 
 */
@Component
@Scope("prototype") 
public class CdstcpCdstaprDao extends AbstractEntityDao<CdstcpCdstapr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdstcpCdstapr"))); 
	
	// Persistent entities
	private CdstcpCdstapr cdstcpCdstapr;

	// DS entities
	private Cdstapr cdstapr;
	
	// Mapper
	private final CdstcpCdstaprMapper cdstcpCdstaprMapper = new CdstcpCdstaprMapper();

	static {
		keys.add(KeyMetadata.of("CdstcpCdstapr.statecd", EKeyOrder.ASC, 2, EKeyType.String));
		keys.add(KeyMetadata.of("CdstcpCdstapr.countrycd", EKeyOrder.ASC, 3, EKeyType.String));
		keys.add(KeyMetadata.of("CdstcpCdstapr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
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
	public EntityDao<CdstcpCdstapr> withRecord(RangeReference record) {
		if(cdstapr == null){
			cdstapr = new Cdstapr(configuration, record);
		} else {
			cdstapr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "CdstcpCdstapr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDSTCP;
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
	protected Class<CdstcpCdstapr> getRecordClass() {		
		return CdstcpCdstapr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdstcpCdstapr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getStatecd());
		retValue.add(t.getCountrycd());
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
	protected List<Object> getConditionValues(CdstcpCdstapr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdstapr != null ? cdstapr : new Cdstapr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdstcpCdstapr != null) {
			res.add(cdstcpCdstapr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		if (o instanceof CdstcpCdstapr) {
			cdstcpCdstapr = (CdstcpCdstapr) o;
		} else {
		    throw new Blu4ivJpaException("Invalid Object type : " + o.getClass().getSimpleName() + " / CdstcpCdstapr expected");
		}
	}
	
	@Override
	protected void clearJpaEntities() {
		cdstcpCdstapr = null; 
	}


	@Override
	protected CdstcpCdstapr newInstance() {
		cdstcpCdstapr = new CdstcpCdstapr();
		return cdstcpCdstapr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdstcpCdstapr != null){
	    	return cdstcpCdstapr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdstapr != null) {
			cdstcpCdstaprMapper.updateCdstaprFromICdstcpCdstapr(ctx, cdstcpCdstapr, cdstapr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdstapr != null) {
			cdstcpCdstaprMapper.updateICdstcpCdstaprFromCdstapr(ctx, cdstapr, cdstcpCdstapr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}