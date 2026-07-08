// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdmmf001p;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;


@Component
@Lazy
public class Cdmmf001pCdmmf001pMapper {
	/**
	 * Maps data from the JPA entity Cdmmf001pCdmmf001p to the DataSimplifier entity Cdmmf001p
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdmmf001pFromICdmmf001pCdmmf001p(final Blu4ivRuntimeContext ctx, ICdmmf001pCdmmf001p vo, Cdmmf001p dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getFldmmf1() != null) {
			dsEntity.setFldmmf1(stringConverter.apply(vo.getFldmmf1()));
		} else {
			dsEntity.setFldmmf1("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdmmf001p to the JPA entity Cdmmf001pCdmmf001p
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdmmf001pCdmmf001pFromCdmmf001p(final Blu4ivRuntimeContext ctx, Cdmmf001p dsEntity, ICdmmf001pCdmmf001p vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			final String fldmmf1 = dsEntity.getFldmmf1();
			if(fldmmf1 != null) {
				vo.setFldmmf1(stringConverter.apply(fldmmf1));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "FLDMMF1":
					final String fldmmf1 = dsEntity.getFldmmf1();
					if(fldmmf1 != null) {
						vo.setFldmmf1(stringConverter.apply(fldmmf1));
					}
					break;
				}
			});
		}
	}
}
