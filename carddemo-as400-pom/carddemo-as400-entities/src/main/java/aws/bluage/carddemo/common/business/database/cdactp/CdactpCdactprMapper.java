// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdactp;

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
public class CdactpCdactprMapper {
	/**
	 * Maps data from the JPA entity CdactpCdactpr to the DataSimplifier entity Cdactpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdactprFromICdactpCdactpr(final Blu4ivRuntimeContext ctx, ICdactpCdactpr vo, Cdactpr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getAcctnum() != null) {
			dsEntity.setAcctnum(vo.getAcctnum());
		} else {
			dsEntity.setAcctnum(0);
		}
		if(vo.getActive() != null) {
			dsEntity.setActive(stringConverter.apply(vo.getActive()));
		} else {
			dsEntity.setActive("");
		}
		if(vo.getOpendate() != null) {
			dsEntity.setOpendate(DateHelper.convertToString(vo.getOpendate(), "*ISO"));
		} else {
			dsEntity.setOpendate("");
		}
		if(vo.getExpirydate() != null) {
			dsEntity.setExpirydate(DateHelper.convertToString(vo.getExpirydate(), "*ISO"));
		} else {
			dsEntity.setExpirydate("");
		}
		if(vo.getCredlimit() != null) {
			dsEntity.setCredlimit(vo.getCredlimit());
		} else {
			dsEntity.setCredlimit(BigDecimal.ZERO);
		}
		if(vo.getCashlimit() != null) {
			dsEntity.setCashlimit(vo.getCashlimit());
		} else {
			dsEntity.setCashlimit(BigDecimal.ZERO);
		}
		if(vo.getBalance() != null) {
			dsEntity.setBalance(vo.getBalance());
		} else {
			dsEntity.setBalance(BigDecimal.ZERO);
		}
		if(vo.getCurcredit() != null) {
			dsEntity.setCurcredit(vo.getCurcredit());
		} else {
			dsEntity.setCurcredit(BigDecimal.ZERO);
		}
		if(vo.getCurdebit() != null) {
			dsEntity.setCurdebit(vo.getCurdebit());
		} else {
			dsEntity.setCurdebit(BigDecimal.ZERO);
		}
		if(vo.getAcctgrp() != null) {
			dsEntity.setAcctgrp(stringConverter.apply(vo.getAcctgrp()));
		} else {
			dsEntity.setAcctgrp("");
		}
		if(vo.getPricustid() != null) {
			dsEntity.setPricustid(vo.getPricustid());
		} else {
			dsEntity.setPricustid(0);
		}
		if(vo.getSeccustid() != null) {
			dsEntity.setSeccustid(vo.getSeccustid());
		} else {
			dsEntity.setSeccustid(0);
		}
		if(vo.getActcrtdt() != null) {
			dsEntity.setActcrtdt(vo.getActcrtdt());
		} else {
			dsEntity.setActcrtdt(0);
		}
		if(vo.getActcrttm() != null) {
			dsEntity.setActcrttm(vo.getActcrttm());
		} else {
			dsEntity.setActcrttm(0);
		}
		if(vo.getActcrtusr() != null) {
			dsEntity.setActcrtusr(stringConverter.apply(vo.getActcrtusr()));
		} else {
			dsEntity.setActcrtusr("");
		}
		if(vo.getActcrtpgm() != null) {
			dsEntity.setActcrtpgm(stringConverter.apply(vo.getActcrtpgm()));
		} else {
			dsEntity.setActcrtpgm("");
		}
		if(vo.getActchgdt() != null) {
			dsEntity.setActchgdt(vo.getActchgdt());
		} else {
			dsEntity.setActchgdt(0);
		}
		if(vo.getActchgtm() != null) {
			dsEntity.setActchgtm(vo.getActchgtm());
		} else {
			dsEntity.setActchgtm(0);
		}
		if(vo.getActchgusr() != null) {
			dsEntity.setActchgusr(stringConverter.apply(vo.getActchgusr()));
		} else {
			dsEntity.setActchgusr("");
		}
		if(vo.getActchgpgm() != null) {
			dsEntity.setActchgpgm(stringConverter.apply(vo.getActchgpgm()));
		} else {
			dsEntity.setActchgpgm("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdactpr to the JPA entity CdactpCdactpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdactpCdactprFromCdactpr(final Blu4ivRuntimeContext ctx, Cdactpr dsEntity, ICdactpCdactpr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			vo.setAcctnum(dsEntity.getAcctnum());
			final String active = dsEntity.getActive();
			if(active != null) {
				vo.setActive(stringConverter.apply(active));
			}
			final String opendate = dsEntity.getOpendate();
			if(opendate != null) {
				vo.setOpendate(DateHelper.convertToDate(opendate, "*ISO"));
			}
			final String expirydate = dsEntity.getExpirydate();
			if(expirydate != null) {
				vo.setExpirydate(DateHelper.convertToDate(expirydate, "*ISO"));
			}
			final BigDecimal credlimit = dsEntity.getCredlimit();
			if(credlimit != null) {
				vo.setCredlimit(credlimit);
			}
			final BigDecimal cashlimit = dsEntity.getCashlimit();
			if(cashlimit != null) {
				vo.setCashlimit(cashlimit);
			}
			final BigDecimal balance = dsEntity.getBalance();
			if(balance != null) {
				vo.setBalance(balance);
			}
			final BigDecimal curcredit = dsEntity.getCurcredit();
			if(curcredit != null) {
				vo.setCurcredit(curcredit);
			}
			final BigDecimal curdebit = dsEntity.getCurdebit();
			if(curdebit != null) {
				vo.setCurdebit(curdebit);
			}
			final String acctgrp = dsEntity.getAcctgrp();
			if(acctgrp != null) {
				vo.setAcctgrp(stringConverter.apply(acctgrp));
			}
			vo.setPricustid(dsEntity.getPricustid());
			vo.setSeccustid(dsEntity.getSeccustid());
			vo.setActcrtdt(dsEntity.getActcrtdt());
			vo.setActcrttm(dsEntity.getActcrttm());
			final String actcrtusr = dsEntity.getActcrtusr();
			if(actcrtusr != null) {
				vo.setActcrtusr(stringConverter.apply(actcrtusr));
			}
			final String actcrtpgm = dsEntity.getActcrtpgm();
			if(actcrtpgm != null) {
				vo.setActcrtpgm(stringConverter.apply(actcrtpgm));
			}
			vo.setActchgdt(dsEntity.getActchgdt());
			vo.setActchgtm(dsEntity.getActchgtm());
			final String actchgusr = dsEntity.getActchgusr();
			if(actchgusr != null) {
				vo.setActchgusr(stringConverter.apply(actchgusr));
			}
			final String actchgpgm = dsEntity.getActchgpgm();
			if(actchgpgm != null) {
				vo.setActchgpgm(stringConverter.apply(actchgpgm));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "ACCTNUM":
					vo.setAcctnum(dsEntity.getAcctnum());
					break;
				case "ACTIVE":
					final String active = dsEntity.getActive();
					if(active != null) {
						vo.setActive(stringConverter.apply(active));
					}
					break;
				case "OPENDATE":
					final String opendate = dsEntity.getOpendate();
					if(opendate != null) {
						vo.setOpendate(DateHelper.convertToDate(opendate, "*ISO"));
					}
					break;
				case "EXPIRYDATE":
					final String expirydate = dsEntity.getExpirydate();
					if(expirydate != null) {
						vo.setExpirydate(DateHelper.convertToDate(expirydate, "*ISO"));
					}
					break;
				case "CREDLIMIT":
					final BigDecimal credlimit = dsEntity.getCredlimit();
					if(credlimit != null) {
						vo.setCredlimit(credlimit);
					}
					break;
				case "CASHLIMIT":
					final BigDecimal cashlimit = dsEntity.getCashlimit();
					if(cashlimit != null) {
						vo.setCashlimit(cashlimit);
					}
					break;
				case "BALANCE":
					final BigDecimal balance = dsEntity.getBalance();
					if(balance != null) {
						vo.setBalance(balance);
					}
					break;
				case "CURCREDIT":
					final BigDecimal curcredit = dsEntity.getCurcredit();
					if(curcredit != null) {
						vo.setCurcredit(curcredit);
					}
					break;
				case "CURDEBIT":
					final BigDecimal curdebit = dsEntity.getCurdebit();
					if(curdebit != null) {
						vo.setCurdebit(curdebit);
					}
					break;
				case "ACCTGRP":
					final String acctgrp = dsEntity.getAcctgrp();
					if(acctgrp != null) {
						vo.setAcctgrp(stringConverter.apply(acctgrp));
					}
					break;
				case "PRICUSTID":
					vo.setPricustid(dsEntity.getPricustid());
					break;
				case "SECCUSTID":
					vo.setSeccustid(dsEntity.getSeccustid());
					break;
				case "ACTCRTDT":
					vo.setActcrtdt(dsEntity.getActcrtdt());
					break;
				case "ACTCRTTM":
					vo.setActcrttm(dsEntity.getActcrttm());
					break;
				case "ACTCRTUSR":
					final String actcrtusr = dsEntity.getActcrtusr();
					if(actcrtusr != null) {
						vo.setActcrtusr(stringConverter.apply(actcrtusr));
					}
					break;
				case "ACTCRTPGM":
					final String actcrtpgm = dsEntity.getActcrtpgm();
					if(actcrtpgm != null) {
						vo.setActcrtpgm(stringConverter.apply(actcrtpgm));
					}
					break;
				case "ACTCHGDT":
					vo.setActchgdt(dsEntity.getActchgdt());
					break;
				case "ACTCHGTM":
					vo.setActchgtm(dsEntity.getActchgtm());
					break;
				case "ACTCHGUSR":
					final String actchgusr = dsEntity.getActchgusr();
					if(actchgusr != null) {
						vo.setActchgusr(stringConverter.apply(actchgusr));
					}
					break;
				case "ACTCHGPGM":
					final String actchgpgm = dsEntity.getActchgpgm();
					if(actchgpgm != null) {
						vo.setActchgpgm(stringConverter.apply(actchgpgm));
					}
					break;
				}
			});
		}
	}
}
