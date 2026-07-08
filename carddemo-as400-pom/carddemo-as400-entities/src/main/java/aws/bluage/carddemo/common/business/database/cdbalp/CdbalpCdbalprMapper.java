// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdbalp;

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
public class CdbalpCdbalprMapper {
	/**
	 * Maps data from the JPA entity CdbalpCdbalpr to the DataSimplifier entity Cdbalpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdbalprFromICdbalpCdbalpr(final Blu4ivRuntimeContext ctx, ICdbalpCdbalpr vo, Cdbalpr dsEntity, Function<String, String> stringConverter){
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
		if(vo.getOutstandbal() != null) {
			dsEntity.setOutstandbal(vo.getOutstandbal());
		} else {
			dsEntity.setOutstandbal(BigDecimal.ZERO);
		}
		if(vo.getTotpurchase() != null) {
			dsEntity.setTotpurchase(vo.getTotpurchase());
		} else {
			dsEntity.setTotpurchase(BigDecimal.ZERO);
		}
		if(vo.getTotpayment() != null) {
			dsEntity.setTotpayment(vo.getTotpayment());
		} else {
			dsEntity.setTotpayment(BigDecimal.ZERO);
		}
		if(vo.getTotcashadvance() != null) {
			dsEntity.setTotcashadvance(vo.getTotcashadvance());
		} else {
			dsEntity.setTotcashadvance(BigDecimal.ZERO);
		}
		if(vo.getTotrefund() != null) {
			dsEntity.setTotrefund(vo.getTotrefund());
		} else {
			dsEntity.setTotrefund(BigDecimal.ZERO);
		}
		if(vo.getDuedate() != null) {
			dsEntity.setDuedate(DateHelper.convertToString(vo.getDuedate(), "*ISO"));
		} else {
			dsEntity.setDuedate("");
		}
		if(vo.getPaymentstatus() != null) {
			dsEntity.setPaymentstatus(stringConverter.apply(vo.getPaymentstatus()));
		} else {
			dsEntity.setPaymentstatus("");
		}
		if(vo.getLastupddate() != null) {
			dsEntity.setLastupddate(DateHelper.convertToString(vo.getLastupddate(), "*ISO"));
		} else {
			dsEntity.setLastupddate("");
		}
		if(vo.getLastupdtime() != null) {
			dsEntity.setLastupdtime(vo.getLastupdtime().toString());
		} else {
			dsEntity.setLastupdtime("");
		}
		if(vo.getBalcrtdt() != null) {
			dsEntity.setBalcrtdt(vo.getBalcrtdt());
		} else {
			dsEntity.setBalcrtdt(0);
		}
		if(vo.getBalcrttm() != null) {
			dsEntity.setBalcrttm(vo.getBalcrttm());
		} else {
			dsEntity.setBalcrttm(0);
		}
		if(vo.getBalchgdt() != null) {
			dsEntity.setBalchgdt(vo.getBalchgdt());
		} else {
			dsEntity.setBalchgdt(0);
		}
		if(vo.getBalchgtm() != null) {
			dsEntity.setBalchgtm(vo.getBalchgtm());
		} else {
			dsEntity.setBalchgtm(0);
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdbalpr to the JPA entity CdbalpCdbalpr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdbalpCdbalprFromCdbalpr(final Blu4ivRuntimeContext ctx, Cdbalpr dsEntity, ICdbalpCdbalpr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			vo.setCardnum(dsEntity.getCardnum());
			vo.setCustid(dsEntity.getCustid());
			vo.setAcctnum(dsEntity.getAcctnum());
			final BigDecimal outstandbal = dsEntity.getOutstandbal();
			if(outstandbal != null) {
				vo.setOutstandbal(outstandbal);
			}
			final BigDecimal totpurchase = dsEntity.getTotpurchase();
			if(totpurchase != null) {
				vo.setTotpurchase(totpurchase);
			}
			final BigDecimal totpayment = dsEntity.getTotpayment();
			if(totpayment != null) {
				vo.setTotpayment(totpayment);
			}
			final BigDecimal totcashadvance = dsEntity.getTotcashadvance();
			if(totcashadvance != null) {
				vo.setTotcashadvance(totcashadvance);
			}
			final BigDecimal totrefund = dsEntity.getTotrefund();
			if(totrefund != null) {
				vo.setTotrefund(totrefund);
			}
			final String duedate = dsEntity.getDuedate();
			if(duedate != null) {
				vo.setDuedate(DateHelper.convertToDate(duedate, "*ISO"));
			}
			final String paymentstatus = dsEntity.getPaymentstatus();
			if(paymentstatus != null) {
				vo.setPaymentstatus(stringConverter.apply(paymentstatus));
			}
			final String lastupddate = dsEntity.getLastupddate();
			if(lastupddate != null) {
				vo.setLastupddate(DateHelper.convertToDate(lastupddate, "*ISO"));
			}
			final String lastupdtime = dsEntity.getLastupdtime();
			if(lastupdtime != null) {
				vo.setLastupdtime(java.sql.Timestamp.valueOf(lastupdtime));
			}
			vo.setBalcrtdt(dsEntity.getBalcrtdt());
			vo.setBalcrttm(dsEntity.getBalcrttm());
			vo.setBalchgdt(dsEntity.getBalchgdt());
			vo.setBalchgtm(dsEntity.getBalchgtm());
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
				case "OUTSTANDBAL":
					final BigDecimal outstandbal = dsEntity.getOutstandbal();
					if(outstandbal != null) {
						vo.setOutstandbal(outstandbal);
					}
					break;
				case "TOTPURCHASE":
					final BigDecimal totpurchase = dsEntity.getTotpurchase();
					if(totpurchase != null) {
						vo.setTotpurchase(totpurchase);
					}
					break;
				case "TOTPAYMENT":
					final BigDecimal totpayment = dsEntity.getTotpayment();
					if(totpayment != null) {
						vo.setTotpayment(totpayment);
					}
					break;
				case "TOTCASHADVANCE":
					final BigDecimal totcashadvance = dsEntity.getTotcashadvance();
					if(totcashadvance != null) {
						vo.setTotcashadvance(totcashadvance);
					}
					break;
				case "TOTREFUND":
					final BigDecimal totrefund = dsEntity.getTotrefund();
					if(totrefund != null) {
						vo.setTotrefund(totrefund);
					}
					break;
				case "DUEDATE":
					final String duedate = dsEntity.getDuedate();
					if(duedate != null) {
						vo.setDuedate(DateHelper.convertToDate(duedate, "*ISO"));
					}
					break;
				case "PAYMENTSTATUS":
					final String paymentstatus = dsEntity.getPaymentstatus();
					if(paymentstatus != null) {
						vo.setPaymentstatus(stringConverter.apply(paymentstatus));
					}
					break;
				case "LASTUPDDATE":
					final String lastupddate = dsEntity.getLastupddate();
					if(lastupddate != null) {
						vo.setLastupddate(DateHelper.convertToDate(lastupddate, "*ISO"));
					}
					break;
				case "LASTUPDTIME":
					final String lastupdtime = dsEntity.getLastupdtime();
					if(lastupdtime != null) {
						vo.setLastupdtime(java.sql.Timestamp.valueOf(lastupdtime));
					}
					break;
				case "BALCRTDT":
					vo.setBalcrtdt(dsEntity.getBalcrtdt());
					break;
				case "BALCRTTM":
					vo.setBalcrttm(dsEntity.getBalcrttm());
					break;
				case "BALCHGDT":
					vo.setBalchgdt(dsEntity.getBalchgdt());
					break;
				case "BALCHGTM":
					vo.setBalchgtm(dsEntity.getBalchgtm());
					break;
				}
			});
		}
	}
}
