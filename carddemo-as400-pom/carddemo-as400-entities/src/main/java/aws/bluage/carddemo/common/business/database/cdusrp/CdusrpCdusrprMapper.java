// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdusrp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;


@Component
@Lazy
public class CdusrpCdusrprMapper {
	/**
	 * Maps data from the JPA entity CdusrpCdusrpr to the DataSimplifier entity Cdusrpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdusrprFromICdusrpCdusrpr(final Blu4ivRuntimeContext ctx, ICdusrpCdusrpr vo, Cdusrpr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getUserid() != null) {
			dsEntity.setUserid(stringConverter.apply(vo.getUserid()));
		} else {
			dsEntity.setUserid("");
		}
		if(vo.getFirstname() != null) {
			dsEntity.setFirstname(stringConverter.apply(vo.getFirstname()));
		} else {
			dsEntity.setFirstname("");
		}
		if(vo.getLastname() != null) {
			dsEntity.setLastname(stringConverter.apply(vo.getLastname()));
		} else {
			dsEntity.setLastname("");
		}
		if(vo.getType() != null) {
			dsEntity.setType(stringConverter.apply(vo.getType()));
		} else {
			dsEntity.setType("");
		}
		if(vo.getEmail() != null) {
			dsEntity.setEmail(stringConverter.apply(vo.getEmail()));
		} else {
			dsEntity.setEmail("");
		}
		if(vo.getStatus() != null) {
			dsEntity.setStatus(stringConverter.apply(vo.getStatus()));
		} else {
			dsEntity.setStatus("");
		}
		if(vo.getUsrcrtdt() != null) {
			dsEntity.setUsrcrtdt(vo.getUsrcrtdt());
		} else {
			dsEntity.setUsrcrtdt(0);
		}
		if(vo.getUsrcrttm() != null) {
			dsEntity.setUsrcrttm(vo.getUsrcrttm());
		} else {
			dsEntity.setUsrcrttm(0);
		}
		if(vo.getUsrcrtusr() != null) {
			dsEntity.setUsrcrtusr(stringConverter.apply(vo.getUsrcrtusr()));
		} else {
			dsEntity.setUsrcrtusr("");
		}
		if(vo.getUsrcrtpgm() != null) {
			dsEntity.setUsrcrtpgm(stringConverter.apply(vo.getUsrcrtpgm()));
		} else {
			dsEntity.setUsrcrtpgm("");
		}
		if(vo.getUsrchgdt() != null) {
			dsEntity.setUsrchgdt(vo.getUsrchgdt());
		} else {
			dsEntity.setUsrchgdt(0);
		}
		if(vo.getUsrchgtm() != null) {
			dsEntity.setUsrchgtm(vo.getUsrchgtm());
		} else {
			dsEntity.setUsrchgtm(0);
		}
		if(vo.getUsrchgusr() != null) {
			dsEntity.setUsrchgusr(stringConverter.apply(vo.getUsrchgusr()));
		} else {
			dsEntity.setUsrchgusr("");
		}
		if(vo.getUsrchgpgm() != null) {
			dsEntity.setUsrchgpgm(stringConverter.apply(vo.getUsrchgpgm()));
		} else {
			dsEntity.setUsrchgpgm("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdusrpr to the JPA entity CdusrpCdusrpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdusrpCdusrprFromCdusrpr(final Blu4ivRuntimeContext ctx, Cdusrpr dsEntity, ICdusrpCdusrpr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			final String userid = dsEntity.getUserid();
			if(userid != null) {
				vo.setUserid(stringConverter.apply(userid));
			}
			final String firstname = dsEntity.getFirstname();
			if(firstname != null) {
				vo.setFirstname(stringConverter.apply(firstname));
			}
			final String lastname = dsEntity.getLastname();
			if(lastname != null) {
				vo.setLastname(stringConverter.apply(lastname));
			}
			final String type = dsEntity.getType();
			if(type != null) {
				vo.setType(stringConverter.apply(type));
			}
			final String email = dsEntity.getEmail();
			if(email != null) {
				vo.setEmail(stringConverter.apply(email));
			}
			final String status = dsEntity.getStatus();
			if(status != null) {
				vo.setStatus(stringConverter.apply(status));
			}
			vo.setUsrcrtdt(dsEntity.getUsrcrtdt());
			vo.setUsrcrttm(dsEntity.getUsrcrttm());
			final String usrcrtusr = dsEntity.getUsrcrtusr();
			if(usrcrtusr != null) {
				vo.setUsrcrtusr(stringConverter.apply(usrcrtusr));
			}
			final String usrcrtpgm = dsEntity.getUsrcrtpgm();
			if(usrcrtpgm != null) {
				vo.setUsrcrtpgm(stringConverter.apply(usrcrtpgm));
			}
			vo.setUsrchgdt(dsEntity.getUsrchgdt());
			vo.setUsrchgtm(dsEntity.getUsrchgtm());
			final String usrchgusr = dsEntity.getUsrchgusr();
			if(usrchgusr != null) {
				vo.setUsrchgusr(stringConverter.apply(usrchgusr));
			}
			final String usrchgpgm = dsEntity.getUsrchgpgm();
			if(usrchgpgm != null) {
				vo.setUsrchgpgm(stringConverter.apply(usrchgpgm));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "USERID":
					final String userid = dsEntity.getUserid();
					if(userid != null) {
						vo.setUserid(stringConverter.apply(userid));
					}
					break;
				case "FIRSTNAME":
					final String firstname = dsEntity.getFirstname();
					if(firstname != null) {
						vo.setFirstname(stringConverter.apply(firstname));
					}
					break;
				case "LASTNAME":
					final String lastname = dsEntity.getLastname();
					if(lastname != null) {
						vo.setLastname(stringConverter.apply(lastname));
					}
					break;
				case "TYPE":
					final String type = dsEntity.getType();
					if(type != null) {
						vo.setType(stringConverter.apply(type));
					}
					break;
				case "EMAIL":
					final String email = dsEntity.getEmail();
					if(email != null) {
						vo.setEmail(stringConverter.apply(email));
					}
					break;
				case "STATUS":
					final String status = dsEntity.getStatus();
					if(status != null) {
						vo.setStatus(stringConverter.apply(status));
					}
					break;
				case "USRCRTDT":
					vo.setUsrcrtdt(dsEntity.getUsrcrtdt());
					break;
				case "USRCRTTM":
					vo.setUsrcrttm(dsEntity.getUsrcrttm());
					break;
				case "USRCRTUSR":
					final String usrcrtusr = dsEntity.getUsrcrtusr();
					if(usrcrtusr != null) {
						vo.setUsrcrtusr(stringConverter.apply(usrcrtusr));
					}
					break;
				case "USRCRTPGM":
					final String usrcrtpgm = dsEntity.getUsrcrtpgm();
					if(usrcrtpgm != null) {
						vo.setUsrcrtpgm(stringConverter.apply(usrcrtpgm));
					}
					break;
				case "USRCHGDT":
					vo.setUsrchgdt(dsEntity.getUsrchgdt());
					break;
				case "USRCHGTM":
					vo.setUsrchgtm(dsEntity.getUsrchgtm());
					break;
				case "USRCHGUSR":
					final String usrchgusr = dsEntity.getUsrchgusr();
					if(usrchgusr != null) {
						vo.setUsrchgusr(stringConverter.apply(usrchgusr));
					}
					break;
				case "USRCHGPGM":
					final String usrchgpgm = dsEntity.getUsrchgpgm();
					if(usrchgpgm != null) {
						vo.setUsrchgpgm(stringConverter.apply(usrchgpgm));
					}
					break;
				}
			});
		}
	}
}
