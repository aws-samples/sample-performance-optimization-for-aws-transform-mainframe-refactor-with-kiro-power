// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdccmp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;


@Component
@Lazy
public class CdccmpCdccmprMapper {
	/**
	 * Maps data from the JPA entity CdccmpCdccmpr to the DataSimplifier entity Cdccmpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdccmprFromICdccmpCdccmpr(final Blu4ivRuntimeContext ctx, ICdccmpCdccmpr vo, Cdccmpr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getCardnum() != null) {
			dsEntity.setCardnum(vo.getCardnum());
		} else {
			dsEntity.setCardnum(0);
		}
		if(vo.getCustid() != null) {
			dsEntity.setCustid(vo.getCustid());
		} else {
			dsEntity.setCustid(0);
		}
		if(vo.getAcctnum() != null) {
			dsEntity.setAcctnum(vo.getAcctnum());
		} else {
			dsEntity.setAcctnum(0);
		}
		if(vo.getPrimarysec() != null) {
			dsEntity.setPrimarysec(stringConverter.apply(vo.getPrimarysec()));
		} else {
			dsEntity.setPrimarysec("");
		}
		if(vo.getName() != null) {
			dsEntity.setName(stringConverter.apply(vo.getName()));
		} else {
			dsEntity.setName("");
		}
		if(vo.getExpirymo() != null) {
			dsEntity.setExpirymo(vo.getExpirymo());
		} else {
			dsEntity.setExpirymo(0);
		}
		if(vo.getExpiryyr() != null) {
			dsEntity.setExpiryyr(vo.getExpiryyr());
		} else {
			dsEntity.setExpiryyr(0);
		}
		if(vo.getCvv() != null) {
			dsEntity.setCvv(vo.getCvv());
		} else {
			dsEntity.setCvv(0);
		}
		if(vo.getStatus() != null) {
			dsEntity.setStatus(stringConverter.apply(vo.getStatus()));
		} else {
			dsEntity.setStatus("");
		}
		if(vo.getCcmcrtdt() != null) {
			dsEntity.setCcmcrtdt(vo.getCcmcrtdt());
		} else {
			dsEntity.setCcmcrtdt(0);
		}
		if(vo.getCcmcrttm() != null) {
			dsEntity.setCcmcrttm(vo.getCcmcrttm());
		} else {
			dsEntity.setCcmcrttm(0);
		}
		if(vo.getCcmcrtusr() != null) {
			dsEntity.setCcmcrtusr(stringConverter.apply(vo.getCcmcrtusr()));
		} else {
			dsEntity.setCcmcrtusr("");
		}
		if(vo.getCcmcrtpgm() != null) {
			dsEntity.setCcmcrtpgm(stringConverter.apply(vo.getCcmcrtpgm()));
		} else {
			dsEntity.setCcmcrtpgm("");
		}
		if(vo.getCcmchgdt() != null) {
			dsEntity.setCcmchgdt(vo.getCcmchgdt());
		} else {
			dsEntity.setCcmchgdt(0);
		}
		if(vo.getCcmchgtm() != null) {
			dsEntity.setCcmchgtm(vo.getCcmchgtm());
		} else {
			dsEntity.setCcmchgtm(0);
		}
		if(vo.getCcmchgusr() != null) {
			dsEntity.setCcmchgusr(stringConverter.apply(vo.getCcmchgusr()));
		} else {
			dsEntity.setCcmchgusr("");
		}
		if(vo.getCcmchgpgm() != null) {
			dsEntity.setCcmchgpgm(stringConverter.apply(vo.getCcmchgpgm()));
		} else {
			dsEntity.setCcmchgpgm("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdccmpr to the JPA entity CdccmpCdccmpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdccmpCdccmprFromCdccmpr(final Blu4ivRuntimeContext ctx, Cdccmpr dsEntity, ICdccmpCdccmpr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			vo.setCardnum(dsEntity.getCardnum());
			vo.setCustid(dsEntity.getCustid());
			vo.setAcctnum(dsEntity.getAcctnum());
			final String primarysec = dsEntity.getPrimarysec();
			if(primarysec != null) {
				vo.setPrimarysec(stringConverter.apply(primarysec));
			}
			final String name = dsEntity.getName();
			if(name != null) {
				vo.setName(stringConverter.apply(name));
			}
			vo.setExpirymo(dsEntity.getExpirymo());
			vo.setExpiryyr(dsEntity.getExpiryyr());
			vo.setCvv(dsEntity.getCvv());
			final String status = dsEntity.getStatus();
			if(status != null) {
				vo.setStatus(stringConverter.apply(status));
			}
			vo.setCcmcrtdt(dsEntity.getCcmcrtdt());
			vo.setCcmcrttm(dsEntity.getCcmcrttm());
			final String ccmcrtusr = dsEntity.getCcmcrtusr();
			if(ccmcrtusr != null) {
				vo.setCcmcrtusr(stringConverter.apply(ccmcrtusr));
			}
			final String ccmcrtpgm = dsEntity.getCcmcrtpgm();
			if(ccmcrtpgm != null) {
				vo.setCcmcrtpgm(stringConverter.apply(ccmcrtpgm));
			}
			vo.setCcmchgdt(dsEntity.getCcmchgdt());
			vo.setCcmchgtm(dsEntity.getCcmchgtm());
			final String ccmchgusr = dsEntity.getCcmchgusr();
			if(ccmchgusr != null) {
				vo.setCcmchgusr(stringConverter.apply(ccmchgusr));
			}
			final String ccmchgpgm = dsEntity.getCcmchgpgm();
			if(ccmchgpgm != null) {
				vo.setCcmchgpgm(stringConverter.apply(ccmchgpgm));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "CARDNUM":
					vo.setCardnum(dsEntity.getCardnum());
					break;
				case "CUSTID":
					vo.setCustid(dsEntity.getCustid());
					break;
				case "ACCTNUM":
					vo.setAcctnum(dsEntity.getAcctnum());
					break;
				case "PRIMARYSEC":
					final String primarysec = dsEntity.getPrimarysec();
					if(primarysec != null) {
						vo.setPrimarysec(stringConverter.apply(primarysec));
					}
					break;
				case "NAME":
					final String name = dsEntity.getName();
					if(name != null) {
						vo.setName(stringConverter.apply(name));
					}
					break;
				case "EXPIRYMO":
					vo.setExpirymo(dsEntity.getExpirymo());
					break;
				case "EXPIRYYR":
					vo.setExpiryyr(dsEntity.getExpiryyr());
					break;
				case "CVV":
					vo.setCvv(dsEntity.getCvv());
					break;
				case "STATUS":
					final String status = dsEntity.getStatus();
					if(status != null) {
						vo.setStatus(stringConverter.apply(status));
					}
					break;
				case "CCMCRTDT":
					vo.setCcmcrtdt(dsEntity.getCcmcrtdt());
					break;
				case "CCMCRTTM":
					vo.setCcmcrttm(dsEntity.getCcmcrttm());
					break;
				case "CCMCRTUSR":
					final String ccmcrtusr = dsEntity.getCcmcrtusr();
					if(ccmcrtusr != null) {
						vo.setCcmcrtusr(stringConverter.apply(ccmcrtusr));
					}
					break;
				case "CCMCRTPGM":
					final String ccmcrtpgm = dsEntity.getCcmcrtpgm();
					if(ccmcrtpgm != null) {
						vo.setCcmcrtpgm(stringConverter.apply(ccmcrtpgm));
					}
					break;
				case "CCMCHGDT":
					vo.setCcmchgdt(dsEntity.getCcmchgdt());
					break;
				case "CCMCHGTM":
					vo.setCcmchgtm(dsEntity.getCcmchgtm());
					break;
				case "CCMCHGUSR":
					final String ccmchgusr = dsEntity.getCcmchgusr();
					if(ccmchgusr != null) {
						vo.setCcmchgusr(stringConverter.apply(ccmchgusr));
					}
					break;
				case "CCMCHGPGM":
					final String ccmchgpgm = dsEntity.getCcmchgpgm();
					if(ccmchgpgm != null) {
						vo.setCcmchgpgm(stringConverter.apply(ccmchgpgm));
					}
					break;
				}
			});
		}
	}
}
