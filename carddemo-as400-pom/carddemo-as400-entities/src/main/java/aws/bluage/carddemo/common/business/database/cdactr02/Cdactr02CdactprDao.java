// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdactr02;

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
import aws.bluage.carddemo.common.business.database.cdactp.CdactpCdactpr;
import aws.bluage.carddemo.common.business.database.cdactp.Cdactpr;
import aws.bluage.carddemo.common.business.database.cdactp.CdactpCdactprMapper;
import com.netfective.bluage.gapwalk.rt.blu4iv.type.IRecordObject;

import aws.bluage.carddemo.common.business.database.*;

/**
 * DAO for entity Cdactr02Cdactpr.
 * 
 * Used persistent entities are :
 * 
 * @see aws.bluage.carddemo.common.business.database.CdactpCdactpr
 * 
 * 
 */
@Component
@Scope("prototype") 
public class Cdactr02CdactprDao extends AbstractEntityDao<CdactpCdactpr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdactpCdactpr")));
	
	// Persistent entities
	private CdactpCdactpr cdactpCdactpr;

	// DS entities
	private Cdactpr cdactpr;
	
	// Mapper
	private final CdactpCdactprMapper cdactpCdactprMapper = new CdactpCdactprMapper();

	static {
		keys.add(KeyMetadata.of("CdactpCdactpr.pricustid", EKeyOrder.ASC, 9, EKeyType.Integer, 0, true));
		keys.add(KeyMetadata.of("CdactpCdactpr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
	}
	
	@PostConstruct
	public void doInit(){
		super.init();
    	OverrideManager.getInstance().putFileMapping("CdactpCdactpr", "CDACTP");
	}
	
	@PreDestroy
	@Override
	public void close() {
		super.close();
	}
	
	@Override
	public EntityDao<CdactpCdactpr> withRecord(RangeReference record) {
		if(cdactpr == null){
			cdactpr = new Cdactpr(configuration, record);
		} else {
			cdactpr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "Cdactr02Cdactpr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDACTR02;
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
	protected Class<CdactpCdactpr> getRecordClass() {		
		return CdactpCdactpr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdactpCdactpr t) {
		List<Object> retValue = new ArrayList<>();
		retValue.add(t.getPricustid());
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
	protected List<Object> getConditionValues(CdactpCdactpr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdactpr != null ? cdactpr : new Cdactpr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdactpCdactpr != null) {
			res.add(cdactpCdactpr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		cdactpCdactpr = (CdactpCdactpr) o;
	}
	
	@Override
	protected void clearJpaEntities() {
		cdactpCdactpr = null; 
	}


	@Override
	protected CdactpCdactpr newInstance() {
		cdactpCdactpr = new CdactpCdactpr();
		return cdactpCdactpr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdactpCdactpr != null){
	    	return cdactpCdactpr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdactpr != null) {
			cdactpCdactprMapper.updateCdactprFromICdactpCdactpr(ctx, cdactpCdactpr, cdactpr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdactpr != null) {
			cdactpCdactprMapper.updateICdactpCdactprFromCdactpr(ctx, cdactpr, cdactpCdactpr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}