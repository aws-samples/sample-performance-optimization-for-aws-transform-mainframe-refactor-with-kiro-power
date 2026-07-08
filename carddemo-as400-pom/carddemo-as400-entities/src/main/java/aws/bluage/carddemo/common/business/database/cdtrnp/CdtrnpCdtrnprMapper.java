// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdtrnp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

import java.math.BigDecimal;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;

@Component
@Lazy
public class CdtrnpCdtrnprMapper {
	/**
	 * Maps data from the JPA entity CdtrnpCdtrnpr to the DataSimplifier entity Cdtrnpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdtrnprFromICdtrnpCdtrnpr(final Blu4ivRuntimeContext ctx, ICdtrnpCdtrnpr vo, Cdtrnpr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
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
		if(vo.getTypecd() != null) {
			dsEntity.setTypecd(stringConverter.apply(vo.getTypecd()));
		} else {
			dsEntity.setTypecd("");
		}
		if(vo.getCategcd() != null) {
			dsEntity.setCategcd(stringConverter.apply(vo.getCategcd()));
		} else {
			dsEntity.setCategcd("");
		}
		if(vo.getSource() != null) {
			dsEntity.setSource(stringConverter.apply(vo.getSource()));
		} else {
			dsEntity.setSource("");
		}
		if(vo.getDess() != null) {
			dsEntity.setDess(stringConverter.apply(vo.getDess()));
		} else {
			dsEntity.setDess("");
		}
		if(vo.getAmount() != null) {
			dsEntity.setAmount(vo.getAmount());
		} else {
			dsEntity.setAmount(BigDecimal.ZERO);
		}
		if(vo.getOrigdate() != null) {
			dsEntity.setOrigdate(DateHelper.convertToString(vo.getOrigdate(), "*ISO"));
		} else {
			dsEntity.setOrigdate("");
		}
		if(vo.getProcdate() != null) {
			dsEntity.setProcdate(DateHelper.convertToString(vo.getProcdate(), "*ISO"));
		} else {
			dsEntity.setProcdate("");
		}
		if(vo.getMerchid() != null) {
			dsEntity.setMerchid(vo.getMerchid());
		} else {
			dsEntity.setMerchid(0);
		}
		if(vo.getTrnstatus() != null) {
			dsEntity.setTrnstatus(stringConverter.apply(vo.getTrnstatus()));
		} else {
			dsEntity.setTrnstatus("");
		}
		if(vo.getTrncrtdt() != null) {
			dsEntity.setTrncrtdt(vo.getTrncrtdt());
		} else {
			dsEntity.setTrncrtdt(0);
		}
		if(vo.getTrncrttm() != null) {
			dsEntity.setTrncrttm(vo.getTrncrttm());
		} else {
			dsEntity.setTrncrttm(0);
		}
		if(vo.getTrncrtusr() != null) {
			dsEntity.setTrncrtusr(stringConverter.apply(vo.getTrncrtusr()));
		} else {
			dsEntity.setTrncrtusr("");
		}
		if(vo.getTrncrtpgm() != null) {
			dsEntity.setTrncrtpgm(stringConverter.apply(vo.getTrncrtpgm()));
		} else {
			dsEntity.setTrncrtpgm("");
		}
		if(vo.getTrnchgdt() != null) {
			dsEntity.setTrnchgdt(vo.getTrnchgdt());
		} else {
			dsEntity.setTrnchgdt(0);
		}
		if(vo.getTrnchgtm() != null) {
			dsEntity.setTrnchgtm(vo.getTrnchgtm());
		} else {
			dsEntity.setTrnchgtm(0);
		}
		if(vo.getTrnchgusr() != null) {
			dsEntity.setTrnchgusr(stringConverter.apply(vo.getTrnchgusr()));
		} else {
			dsEntity.setTrnchgusr("");
		}
		if(vo.getTrnchgpgm() != null) {
			dsEntity.setTrnchgpgm(stringConverter.apply(vo.getTrnchgpgm()));
		} else {
			dsEntity.setTrnchgpgm("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdtrnpr to the JPA entity CdtrnpCdtrnpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdtrnpCdtrnprFromCdtrnpr(final Blu4ivRuntimeContext ctx, Cdtrnpr dsEntity, ICdtrnpCdtrnpr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			vo.setTrnid(dsEntity.getTrnid());
			vo.setCardnum(dsEntity.getCardnum());
			final String typecd = dsEntity.getTypecd();
			if(typecd != null) {
				vo.setTypecd(stringConverter.apply(typecd));
			}
			final String categcd = dsEntity.getCategcd();
			if(categcd != null) {
				vo.setCategcd(stringConverter.apply(categcd));
			}
			final String source = dsEntity.getSource();
			if(source != null) {
				vo.setSource(stringConverter.apply(source));
			}
			final String dess = dsEntity.getDess();
			if(dess != null) {
				vo.setDess(stringConverter.apply(dess));
			}
			final BigDecimal amount = dsEntity.getAmount();
			if(amount != null) {
				vo.setAmount(amount);
			}
			final String origdate = dsEntity.getOrigdate();
			if(origdate != null) {
				vo.setOrigdate(DateHelper.convertToDate(origdate, "*ISO"));
			}
			final String procdate = dsEntity.getProcdate();
			if(procdate != null) {
				vo.setProcdate(DateHelper.convertToDate(procdate, "*ISO"));
			}
			vo.setMerchid(dsEntity.getMerchid());
			final String trnstatus = dsEntity.getTrnstatus();
			if(trnstatus != null) {
				vo.setTrnstatus(stringConverter.apply(trnstatus));
			}
			vo.setTrncrtdt(dsEntity.getTrncrtdt());
			vo.setTrncrttm(dsEntity.getTrncrttm());
			final String trncrtusr = dsEntity.getTrncrtusr();
			if(trncrtusr != null) {
				vo.setTrncrtusr(stringConverter.apply(trncrtusr));
			}
			final String trncrtpgm = dsEntity.getTrncrtpgm();
			if(trncrtpgm != null) {
				vo.setTrncrtpgm(stringConverter.apply(trncrtpgm));
			}
			vo.setTrnchgdt(dsEntity.getTrnchgdt());
			vo.setTrnchgtm(dsEntity.getTrnchgtm());
			final String trnchgusr = dsEntity.getTrnchgusr();
			if(trnchgusr != null) {
				vo.setTrnchgusr(stringConverter.apply(trnchgusr));
			}
			final String trnchgpgm = dsEntity.getTrnchgpgm();
			if(trnchgpgm != null) {
				vo.setTrnchgpgm(stringConverter.apply(trnchgpgm));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "TRNID":
					vo.setTrnid(dsEntity.getTrnid());
					break;
				case "CARDNUM":
					vo.setCardnum(dsEntity.getCardnum());
					break;
				case "TYPECD":
					final String typecd = dsEntity.getTypecd();
					if(typecd != null) {
						vo.setTypecd(stringConverter.apply(typecd));
					}
					break;
				case "CATEGCD":
					final String categcd = dsEntity.getCategcd();
					if(categcd != null) {
						vo.setCategcd(stringConverter.apply(categcd));
					}
					break;
				case "SOURCE":
					final String source = dsEntity.getSource();
					if(source != null) {
						vo.setSource(stringConverter.apply(source));
					}
					break;
				case "DESS":
					final String dess = dsEntity.getDess();
					if(dess != null) {
						vo.setDess(stringConverter.apply(dess));
					}
					break;
				case "AMOUNT":
					final BigDecimal amount = dsEntity.getAmount();
					if(amount != null) {
						vo.setAmount(amount);
					}
					break;
				case "ORIGDATE":
					final String origdate = dsEntity.getOrigdate();
					if(origdate != null) {
						vo.setOrigdate(DateHelper.convertToDate(origdate, "*ISO"));
					}
					break;
				case "PROCDATE":
					final String procdate = dsEntity.getProcdate();
					if(procdate != null) {
						vo.setProcdate(DateHelper.convertToDate(procdate, "*ISO"));
					}
					break;
				case "MERCHID":
					vo.setMerchid(dsEntity.getMerchid());
					break;
				case "TRNSTATUS":
					final String trnstatus = dsEntity.getTrnstatus();
					if(trnstatus != null) {
						vo.setTrnstatus(stringConverter.apply(trnstatus));
					}
					break;
				case "TRNCRTDT":
					vo.setTrncrtdt(dsEntity.getTrncrtdt());
					break;
				case "TRNCRTTM":
					vo.setTrncrttm(dsEntity.getTrncrttm());
					break;
				case "TRNCRTUSR":
					final String trncrtusr = dsEntity.getTrncrtusr();
					if(trncrtusr != null) {
						vo.setTrncrtusr(stringConverter.apply(trncrtusr));
					}
					break;
				case "TRNCRTPGM":
					final String trncrtpgm = dsEntity.getTrncrtpgm();
					if(trncrtpgm != null) {
						vo.setTrncrtpgm(stringConverter.apply(trncrtpgm));
					}
					break;
				case "TRNCHGDT":
					vo.setTrnchgdt(dsEntity.getTrnchgdt());
					break;
				case "TRNCHGTM":
					vo.setTrnchgtm(dsEntity.getTrnchgtm());
					break;
				case "TRNCHGUSR":
					final String trnchgusr = dsEntity.getTrnchgusr();
					if(trnchgusr != null) {
						vo.setTrnchgusr(stringConverter.apply(trnchgusr));
					}
					break;
				case "TRNCHGPGM":
					final String trnchgpgm = dsEntity.getTrnchgpgm();
					if(trnchgpgm != null) {
						vo.setTrnchgpgm(stringConverter.apply(trnchgpgm));
					}
					break;
				}
			});
		}
	}
}
