// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdmmf001p;

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
 * DAO for entity Cdmmf001pCdmmf001p.
 * 
 */
@Component
@Scope("prototype") 
public class Cdmmf001pCdmmf001pDao extends AbstractEntityDao<Cdmmf001pCdmmf001p> {

	private static final List<KeyMetadata> keys = new ArrayList<>();
	private static final List<ConditionMetadata> conditions = new ArrayList<>();

	private List<String> entities = ListUtils.unmodifiableList(new ArrayList<String>(Arrays.asList("Cdmmf001pCdmmf001p"))); 
	
	// Persistent entities
	private Cdmmf001pCdmmf001p cdmmf001pCdmmf001p;

	// DS entities
	private Cdmmf001p cdmmf001p;
	
	// Mapper
	private final Cdmmf001pCdmmf001pMapper cdmmf001pCdmmf001pMapper = new Cdmmf001pCdmmf001pMapper();

	static {
		keys.add(KeyMetadata.of("Cdmmf001pCdmmf001p.identifier", EKeyOrder.ASC, 0, EKeyType.Long));
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
	public EntityDao<Cdmmf001pCdmmf001p> withRecord(RangeReference record) {
		if(cdmmf001p == null){
			cdmmf001p = new Cdmmf001p(configuration, record);
		} else {
			cdmmf001p.setRecord(record);
		}
		return this;
	}
	

	@Override
	protected String getFileName() {
		return "Cdmmf001pCdmmf001p";
	}

	@Override
	protected String getFileID() {
		return FileIds.CDMMF001P;
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
	protected Class<Cdmmf001pCdmmf001p> getRecordClass() {		
		return Cdmmf001pCdmmf001p.class;
	}

	@Override
	protected List<Object> getKeyValues(Cdmmf001pCdmmf001p t) {
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
	protected List<Object> getConditionValues(Cdmmf001pCdmmf001p t) {
		List<Object> retValue = new ArrayList<>();
		return retValue;
	}

	@Override
	public List<String> getEntityList() {		
		return entities;
	}
	
	@Override
	protected RecordEntity getRecordEntity () {
		return cdmmf001p != null ? cdmmf001p : new Cdmmf001p(configuration);
	}

	@Override
	protected List<IRecordObject> getJpaEntities() {
		List<IRecordObject> res = new ArrayList<>();
		if (cdmmf001pCdmmf001p != null) {
			res.add(cdmmf001pCdmmf001p);
		}
		return ListUtils.unmodifiableList(res);
	}
	
	@Override
	public void updateJpaEntities(Object o) {
		if (o instanceof Cdmmf001pCdmmf001p) {
			cdmmf001pCdmmf001p = (Cdmmf001pCdmmf001p) o;
		} else {
		    throw new Blu4ivJpaException("Invalid Object type : " + o.getClass().getSimpleName() + " / Cdmmf001pCdmmf001p expected");
		}
	}
	
	@Override
	protected void clearJpaEntities() {
		cdmmf001pCdmmf001p = null; 
	}


	@Override
	protected Cdmmf001pCdmmf001p newInstance() {
		cdmmf001pCdmmf001p = new Cdmmf001pCdmmf001p();
		return cdmmf001pCdmmf001p;
	}
	
	@Override
	protected long getIdentifier() {
	    // Consider only the first file for now
		if(cdmmf001pCdmmf001p != null){
	    	return cdmmf001pCdmmf001p.getIdentifier();
		} else {
			return 0;
		}
	}
	
	@Override
	public void inputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdmmf001p != null) {
			cdmmf001pCdmmf001pMapper.updateCdmmf001pFromICdmmf001pCdmmf001p(ctx, cdmmf001pCdmmf001p, cdmmf001p, getInStringConverter());
		}
	}

	@Override
	public void outputMapping(final Blu4ivRuntimeContext ctx) {
		if(cdmmf001p != null) {
			cdmmf001pCdmmf001pMapper.updateICdmmf001pCdmmf001pFromCdmmf001p(ctx, cdmmf001p, cdmmf001pCdmmf001p, getOutStringConverter(), getFieldsToUpdate());
		}
	}
}