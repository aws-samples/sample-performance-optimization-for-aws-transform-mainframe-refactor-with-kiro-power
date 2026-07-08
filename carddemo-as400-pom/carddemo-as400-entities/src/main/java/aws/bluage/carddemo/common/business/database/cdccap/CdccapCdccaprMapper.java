// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdccap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;

@Component
@Lazy
public class CdccapCdccaprMapper {
	/**
	 * Maps data from the JPA entity CdccapCdccapr to the DataSimplifier entity Cdccapr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdccaprFromICdccapCdccapr(final Blu4ivRuntimeContext ctx, ICdccapCdccapr vo, Cdccapr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getCardnum() != null) {
			dsEntity.setCardnum(vo.getCardnum());
		} else {
			dsEntity.setCardnum(0);
		}
		if(vo.getCcaseqno() != null) {
			dsEntity.setCcaseqno(vo.getCcaseqno());
		} else {
			dsEntity.setCcaseqno(0);
		}
		if(vo.getActivity() != null) {
			dsEntity.setActivity(stringConverter.apply(vo.getActivity()));
		} else {
			dsEntity.setActivity("");
		}
		if(vo.getDess() != null) {
			dsEntity.setDess(stringConverter.apply(vo.getDess()));
		} else {
			dsEntity.setDess("");
		}
		if(vo.getCcauser() != null) {
			dsEntity.setCcauser(stringConverter.apply(vo.getCcauser()));
		} else {
			dsEntity.setCcauser("");
		}
		if(vo.getCcatmstamp() != null) {
			dsEntity.setCcatmstamp(DateHelper.convertToString(vo.getCcatmstamp()));
		} else {
			dsEntity.setCcatmstamp("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdccapr to the JPA entity CdccapCdccapr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdccapCdccaprFromCdccapr(final Blu4ivRuntimeContext ctx, Cdccapr dsEntity, ICdccapCdccapr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			vo.setCardnum(dsEntity.getCardnum());
			vo.setCcaseqno(dsEntity.getCcaseqno());
			final String activity = dsEntity.getActivity();
			if(activity != null) {
				vo.setActivity(stringConverter.apply(activity));
			}
			final String dess = dsEntity.getDess();
			if(dess != null) {
				vo.setDess(stringConverter.apply(dess));
			}
			final String ccauser = dsEntity.getCcauser();
			if(ccauser != null) {
				vo.setCcauser(stringConverter.apply(ccauser));
			}
			final String ccatmstamp = dsEntity.getCcatmstamp();
			if(ccatmstamp != null) {
				vo.setCcatmstamp(DateHelper.convertToTimestamp(ccatmstamp));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "CARDNUM":
					vo.setCardnum(dsEntity.getCardnum());
					break;
				case "CCASEQNO":
					vo.setCcaseqno(dsEntity.getCcaseqno());
					break;
				case "ACTIVITY":
					final String activity = dsEntity.getActivity();
					if(activity != null) {
						vo.setActivity(stringConverter.apply(activity));
					}
					break;
				case "DESS":
					final String dess = dsEntity.getDess();
					if(dess != null) {
						vo.setDess(stringConverter.apply(dess));
					}
					break;
				case "CCAUSER":
					final String ccauser = dsEntity.getCcauser();
					if(ccauser != null) {
						vo.setCcauser(stringConverter.apply(ccauser));
					}
					break;
				case "CCATMSTAMP":
					final String ccatmstamp = dsEntity.getCcatmstamp();
					if(ccatmstamp != null) {
						vo.setCcatmstamp(DateHelper.convertToTimestamp(ccatmstamp));
					}
					break;
				}
			});
		}
	}
}
