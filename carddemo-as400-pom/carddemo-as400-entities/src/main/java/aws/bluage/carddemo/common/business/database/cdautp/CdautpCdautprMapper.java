// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdautp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;

@Component
@Lazy
public class CdautpCdautprMapper {
	/**
	 * Maps data from the JPA entity CdautpCdautpr to the DataSimplifier entity Cdautpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdautprFromICdautpCdautpr(final Blu4ivRuntimeContext ctx, ICdautpCdautpr vo, Cdautpr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getAuthid() != null) {
			dsEntity.setAuthid(vo.getAuthid());
		} else {
			dsEntity.setAuthid(0);
		}
		if(vo.getTrnid() != null) {
			dsEntity.setTrnid(vo.getTrnid());
		} else {
			dsEntity.setTrnid(0);
		}
		if(vo.getCardnum() != null) {
			dsEntity.setCardnum(vo.getCardnum());
		} else {
			dsEntity.setCardnum(0);
		}
		if(vo.getResponse() != null) {
			dsEntity.setResponse(stringConverter.apply(vo.getResponse()));
		} else {
			dsEntity.setResponse("");
		}
		if(vo.getRspreason() != null) {
			dsEntity.setRspreason(stringConverter.apply(vo.getRspreason()));
		} else {
			dsEntity.setRspreason("");
		}
		if(vo.getFraudflag() != null) {
			dsEntity.setFraudflag(stringConverter.apply(vo.getFraudflag()));
		} else {
			dsEntity.setFraudflag("");
		}
		if(vo.getAuthdate() != null) {
			dsEntity.setAuthdate(DateHelper.convertToString(vo.getAuthdate(), "*ISO"));
		} else {
			dsEntity.setAuthdate("");
		}
		if(vo.getAuthtime() != null) {
			dsEntity.setAuthtime(DateHelper.convertToString(vo.getAuthtime(), "*ISO"));
		} else {
			dsEntity.setAuthtime("");
		}
		if(vo.getAuthuser() != null) {
			dsEntity.setAuthuser(stringConverter.apply(vo.getAuthuser()));
		} else {
			dsEntity.setAuthuser("");
		}
		if(vo.getAuthpgm() != null) {
			dsEntity.setAuthpgm(stringConverter.apply(vo.getAuthpgm()));
		} else {
			dsEntity.setAuthpgm("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdautpr to the JPA entity CdautpCdautpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdautpCdautprFromCdautpr(final Blu4ivRuntimeContext ctx, Cdautpr dsEntity, ICdautpCdautpr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			vo.setAuthid(dsEntity.getAuthid());
			vo.setTrnid(dsEntity.getTrnid());
			vo.setCardnum(dsEntity.getCardnum());
			final String response = dsEntity.getResponse();
			if(response != null) {
				vo.setResponse(stringConverter.apply(response));
			}
			final String rspreason = dsEntity.getRspreason();
			if(rspreason != null) {
				vo.setRspreason(stringConverter.apply(rspreason));
			}
			final String fraudflag = dsEntity.getFraudflag();
			if(fraudflag != null) {
				vo.setFraudflag(stringConverter.apply(fraudflag));
			}
			final String authdate = dsEntity.getAuthdate();
			if(authdate != null) {
				vo.setAuthdate(DateHelper.convertToDate(authdate, "*ISO"));
			}
			final String authtime = dsEntity.getAuthtime();
			if(authtime != null) {
				vo.setAuthtime(DateHelper.convertToTime(authtime, "*ISO"));
			}
			final String authuser = dsEntity.getAuthuser();
			if(authuser != null) {
				vo.setAuthuser(stringConverter.apply(authuser));
			}
			final String authpgm = dsEntity.getAuthpgm();
			if(authpgm != null) {
				vo.setAuthpgm(stringConverter.apply(authpgm));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "AUTHID":
					vo.setAuthid(dsEntity.getAuthid());
					break;
				case "TRNID":
					vo.setTrnid(dsEntity.getTrnid());
					break;
				case "CARDNUM":
					vo.setCardnum(dsEntity.getCardnum());
					break;
				case "RESPONSE":
					final String response = dsEntity.getResponse();
					if(response != null) {
						vo.setResponse(stringConverter.apply(response));
					}
					break;
				case "RSPREASON":
					final String rspreason = dsEntity.getRspreason();
					if(rspreason != null) {
						vo.setRspreason(stringConverter.apply(rspreason));
					}
					break;
				case "FRAUDFLAG":
					final String fraudflag = dsEntity.getFraudflag();
					if(fraudflag != null) {
						vo.setFraudflag(stringConverter.apply(fraudflag));
					}
					break;
				case "AUTHDATE":
					final String authdate = dsEntity.getAuthdate();
					if(authdate != null) {
						vo.setAuthdate(DateHelper.convertToDate(authdate, "*ISO"));
					}
					break;
				case "AUTHTIME":
					final String authtime = dsEntity.getAuthtime();
					if(authtime != null) {
						vo.setAuthtime(DateHelper.convertToTime(authtime, "*ISO"));
					}
					break;
				case "AUTHUSER":
					final String authuser = dsEntity.getAuthuser();
					if(authuser != null) {
						vo.setAuthuser(stringConverter.apply(authuser));
					}
					break;
				case "AUTHPGM":
					final String authpgm = dsEntity.getAuthpgm();
					if(authpgm != null) {
						vo.setAuthpgm(stringConverter.apply(authpgm));
					}
					break;
				}
			});
		}
	}
}
