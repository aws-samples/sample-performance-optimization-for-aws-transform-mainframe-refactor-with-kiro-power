// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdstcp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;


@Component
@Lazy
public class CdstcpCdstaprMapper {
	/**
	 * Maps data from the JPA entity CdstcpCdstapr to the DataSimplifier entity Cdstapr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdstaprFromICdstcpCdstapr(final Blu4ivRuntimeContext ctx, ICdstcpCdstapr vo, Cdstapr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getStatecd() != null) {
			dsEntity.setStatecd(stringConverter.apply(vo.getStatecd()));
		} else {
			dsEntity.setStatecd("");
		}
		if(vo.getStatenm() != null) {
			dsEntity.setStatenm(stringConverter.apply(vo.getStatenm()));
		} else {
			dsEntity.setStatenm("");
		}
		if(vo.getCountrycd() != null) {
			dsEntity.setCountrycd(stringConverter.apply(vo.getCountrycd()));
		} else {
			dsEntity.setCountrycd("");
		}
		if(vo.getCountrynm() != null) {
			dsEntity.setCountrynm(stringConverter.apply(vo.getCountrynm()));
		} else {
			dsEntity.setCountrynm("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdstapr to the JPA entity CdstcpCdstapr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdstcpCdstaprFromCdstapr(final Blu4ivRuntimeContext ctx, Cdstapr dsEntity, ICdstcpCdstapr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			final String statecd = dsEntity.getStatecd();
			if(statecd != null) {
				vo.setStatecd(stringConverter.apply(statecd));
			}
			final String statenm = dsEntity.getStatenm();
			if(statenm != null) {
				vo.setStatenm(stringConverter.apply(statenm));
			}
			final String countrycd = dsEntity.getCountrycd();
			if(countrycd != null) {
				vo.setCountrycd(stringConverter.apply(countrycd));
			}
			final String countrynm = dsEntity.getCountrynm();
			if(countrynm != null) {
				vo.setCountrynm(stringConverter.apply(countrynm));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "STATECD":
					final String statecd = dsEntity.getStatecd();
					if(statecd != null) {
						vo.setStatecd(stringConverter.apply(statecd));
					}
					break;
				case "STATENM":
					final String statenm = dsEntity.getStatenm();
					if(statenm != null) {
						vo.setStatenm(stringConverter.apply(statenm));
					}
					break;
				case "COUNTRYCD":
					final String countrycd = dsEntity.getCountrycd();
					if(countrycd != null) {
						vo.setCountrycd(stringConverter.apply(countrycd));
					}
					break;
				case "COUNTRYNM":
					final String countrynm = dsEntity.getCountrynm();
					if(countrynm != null) {
						vo.setCountrynm(stringConverter.apply(countrynm));
					}
					break;
				}
			});
		}
	}
}
