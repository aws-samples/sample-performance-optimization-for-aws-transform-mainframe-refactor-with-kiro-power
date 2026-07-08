// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdbalp;

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
 * DAO for entity CdbalpCdbalpr.
 * 
 */
@Component
@Scope("prototype") 
public class CdbalpCdbalprDao extends AbstractEntityDao<CdbalpCdbalpr> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("CdbalpCdbalpr"))); 
	
	// Persistent entities
	private CdbalpCdbalpr cdbalpCdbalpr;

	// DS entities
	private Cdbalpr cdbalpr;
	
	// Mapper
	private final CdbalpCdbalprMapper cdbalpCdbalprMapper = new CdbalpCdbalprMapper();

	static {
		keys.add(KeyMetadata.of("CdbalpCdbalpr.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
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
	public EntityDao<CdbalpCdbalpr> withRecord(RangeReference record) {
		if(cdbalpr == null){
			cdbalpr = new Cdbalpr(configuration, record);
		} else {
			cdbalpr.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "CdbalpCdbalpr";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDBALP;
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
	protected Class<CdbalpCdbalpr> getRecordClass() {		
		return CdbalpCdbalpr.class;
	}

	@Override
	protected List<Object> getKeyValues(CdbalpCdbalpr t) {
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
	protected List<Object> getConditionValues(CdbalpCdbalpr t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdbalpr != null ? cdbalpr : new Cdbalpr(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdbalpCdbalpr != null) {
			res.add(cdbalpCdbalpr);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		if (o instanceof CdbalpCdbalpr) {
			cdbalpCdbalpr = (CdbalpCdbalpr) o;
		} else {
		    throw new Blu4ivJpaException("Invalid Object type : " + o.getClass().getSimpleName() + " / CdbalpCdbalpr expected");
		}
	}
	
	@Override
	protected void clearJpaEntities() {
		cdbalpCdbalpr = null; 
	}


	@Override
	protected CdbalpCdbalpr newInstance() {
		cdbalpCdbalpr = new CdbalpCdbalpr();
		return cdbalpCdbalpr;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdbalpCdbalpr != null){
	    	return cdbalpCdbalpr.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdbalpr != null) {
			cdbalpCdbalprMapper.updateCdbalprFromICdbalpCdbalpr(ctx, cdbalpCdbalpr, cdbalpr, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdbalpr != null) {
			cdbalpCdbalprMapper.updateICdbalpCdbalprFromCdbalpr(ctx, cdbalpr, cdbalpCdbalpr, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}
