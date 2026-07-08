// Generated with Blu Age version  [unknown version]
package aws.bluage.carddemo.common.business.database.cdcusp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import com.netfective.bluage.gapwalk.rt.blu4iv.context.Blu4ivRuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;


@Component
@Lazy
public class CdcuspCdcusprMapper {
	/**
	 * Maps data from the JPA entity CdcuspCdcuspr to the DataSimplifier entity Cdcuspr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param vo the JPA entity
	 * @param dsEntity the DataSimplifier entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 */
	public void updateCdcusprFromICdcuspCdcuspr(final Blu4ivRuntimeContext ctx, ICdcuspCdcuspr vo, Cdcuspr dsEntity, Function<String, String> stringConverter){
		if ( vo == null ) {
			return;
		}
		
		if(vo.getCustid() != null) {
			dsEntity.setCustid(vo.getCustid());
		} else {
			dsEntity.setCustid(0);
		}
		if(vo.getSsn() != null) {
			dsEntity.setSsn(vo.getSsn());
		} else {
			dsEntity.setSsn(0);
		}
		if(vo.getBirthday() != null) {
			dsEntity.setBirthday(vo.getBirthday());
		} else {
			dsEntity.setBirthday(0);
		}
		if(vo.getBirthmo() != null) {
			dsEntity.setBirthmo(vo.getBirthmo());
		} else {
			dsEntity.setBirthmo(0);
		}
		if(vo.getBirthyr() != null) {
			dsEntity.setBirthyr(vo.getBirthyr());
		} else {
			dsEntity.setBirthyr(0);
		}
		if(vo.getGender() != null) {
			dsEntity.setGender(stringConverter.apply(vo.getGender()));
		} else {
			dsEntity.setGender("");
		}
		if(vo.getFicoscore() != null) {
			dsEntity.setFicoscore(vo.getFicoscore());
		} else {
			dsEntity.setFicoscore(0);
		}
		if(vo.getFirstname() != null) {
			dsEntity.setFirstname(stringConverter.apply(vo.getFirstname()));
		} else {
			dsEntity.setFirstname("");
		}
		if(vo.getMidname() != null) {
			dsEntity.setMidname(stringConverter.apply(vo.getMidname()));
		} else {
			dsEntity.setMidname("");
		}
		if(vo.getLastname() != null) {
			dsEntity.setLastname(stringConverter.apply(vo.getLastname()));
		} else {
			dsEntity.setLastname("");
		}
		if(vo.getAddress1() != null) {
			dsEntity.setAddress1(stringConverter.apply(vo.getAddress1()));
		} else {
			dsEntity.setAddress1("");
		}
		if(vo.getAddress2() != null) {
			dsEntity.setAddress2(stringConverter.apply(vo.getAddress2()));
		} else {
			dsEntity.setAddress2("");
		}
		if(vo.getCity() != null) {
			dsEntity.setCity(stringConverter.apply(vo.getCity()));
		} else {
			dsEntity.setCity("");
		}
		if(vo.getState() != null) {
			dsEntity.setState(stringConverter.apply(vo.getState()));
		} else {
			dsEntity.setState("");
		}
		if(vo.getZip() != null) {
			dsEntity.setZip(vo.getZip());
		} else {
			dsEntity.setZip(0);
		}
		if(vo.getCountry() != null) {
			dsEntity.setCountry(stringConverter.apply(vo.getCountry()));
		} else {
			dsEntity.setCountry("");
		}
		if(vo.getPhone1() != null) {
			dsEntity.setPhone1(vo.getPhone1());
		} else {
			dsEntity.setPhone1(0);
		}
		if(vo.getPhone2() != null) {
			dsEntity.setPhone2(vo.getPhone2());
		} else {
			dsEntity.setPhone2(0);
		}
		if(vo.getCuscrtdt() != null) {
			dsEntity.setCuscrtdt(vo.getCuscrtdt());
		} else {
			dsEntity.setCuscrtdt(0);
		}
		if(vo.getCuscrttm() != null) {
			dsEntity.setCuscrttm(vo.getCuscrttm());
		} else {
			dsEntity.setCuscrttm(0);
		}
		if(vo.getCuscrtusr() != null) {
			dsEntity.setCuscrtusr(stringConverter.apply(vo.getCuscrtusr()));
		} else {
			dsEntity.setCuscrtusr("");
		}
		if(vo.getCuscrtpgm() != null) {
			dsEntity.setCuscrtpgm(stringConverter.apply(vo.getCuscrtpgm()));
		} else {
			dsEntity.setCuscrtpgm("");
		}
		if(vo.getCuschgdt() != null) {
			dsEntity.setCuschgdt(vo.getCuschgdt());
		} else {
			dsEntity.setCuschgdt(0);
		}
		if(vo.getCuschgtm() != null) {
			dsEntity.setCuschgtm(vo.getCuschgtm());
		} else {
			dsEntity.setCuschgtm(0);
		}
		if(vo.getCuschgusr() != null) {
			dsEntity.setCuschgusr(stringConverter.apply(vo.getCuschgusr()));
		} else {
			dsEntity.setCuschgusr("");
		}
		if(vo.getCuschgpgm() != null) {
			dsEntity.setCuschgpgm(stringConverter.apply(vo.getCuschgpgm()));
		} else {
			dsEntity.setCuschgpgm("");
		}
	}
	
	/**
	 * Maps data from the DataSimplifier entity Cdcuspr to the JPA entity CdcuspCdcuspr
	 *  
	 * @param ctx the runtime context of the running program
	 * @param dsEntity the DataSimplifier entity
	 * @param vo the JPA entity
	 * @param stringConverter Conversion function to ensure control character are correctly converted 
	 * @param fieldsToUpdate Array of name of the fields to be mapped. All fields will be mapped if it is empty. 
	 */
	public void updateICdcuspCdcusprFromCdcuspr(final Blu4ivRuntimeContext ctx, Cdcuspr dsEntity, ICdcuspCdcuspr vo, Function<String, String> stringConverter, String... fieldsToUpdate){
		if ( dsEntity == null ) {
			return;
		}
		
		// If no specific fields to update, update all fields
		if(fieldsToUpdate.length==0) {
			vo.setCustid(dsEntity.getCustid());
			vo.setSsn(dsEntity.getSsn());
			vo.setBirthday(dsEntity.getBirthday());
			vo.setBirthmo(dsEntity.getBirthmo());
			vo.setBirthyr(dsEntity.getBirthyr());
			final String gender = dsEntity.getGender();
			if(gender != null) {
				vo.setGender(stringConverter.apply(gender));
			}
			vo.setFicoscore(dsEntity.getFicoscore());
			final String firstname = dsEntity.getFirstname();
			if(firstname != null) {
				vo.setFirstname(stringConverter.apply(firstname));
			}
			final String midname = dsEntity.getMidname();
			if(midname != null) {
				vo.setMidname(stringConverter.apply(midname));
			}
			final String lastname = dsEntity.getLastname();
			if(lastname != null) {
				vo.setLastname(stringConverter.apply(lastname));
			}
			final String address1 = dsEntity.getAddress1();
			if(address1 != null) {
				vo.setAddress1(stringConverter.apply(address1));
			}
			final String address2 = dsEntity.getAddress2();
			if(address2 != null) {
				vo.setAddress2(stringConverter.apply(address2));
			}
			final String city = dsEntity.getCity();
			if(city != null) {
				vo.setCity(stringConverter.apply(city));
			}
			final String state = dsEntity.getState();
			if(state != null) {
				vo.setState(stringConverter.apply(state));
			}
			vo.setZip(dsEntity.getZip());
			final String country = dsEntity.getCountry();
			if(country != null) {
				vo.setCountry(stringConverter.apply(country));
			}
			vo.setPhone1(dsEntity.getPhone1());
			vo.setPhone2(dsEntity.getPhone2());
			vo.setCuscrtdt(dsEntity.getCuscrtdt());
			vo.setCuscrttm(dsEntity.getCuscrttm());
			final String cuscrtusr = dsEntity.getCuscrtusr();
			if(cuscrtusr != null) {
				vo.setCuscrtusr(stringConverter.apply(cuscrtusr));
			}
			final String cuscrtpgm = dsEntity.getCuscrtpgm();
			if(cuscrtpgm != null) {
				vo.setCuscrtpgm(stringConverter.apply(cuscrtpgm));
			}
			vo.setCuschgdt(dsEntity.getCuschgdt());
			vo.setCuschgtm(dsEntity.getCuschgtm());
			final String cuschgusr = dsEntity.getCuschgusr();
			if(cuschgusr != null) {
				vo.setCuschgusr(stringConverter.apply(cuschgusr));
			}
			final String cuschgpgm = dsEntity.getCuschgpgm();
			if(cuschgpgm != null) {
				vo.setCuschgpgm(stringConverter.apply(cuschgpgm));
			}
		} else {
			List<String> fieldList = Arrays.asList(fieldsToUpdate);
			fieldList.forEach(field -> {
				switch (field) {
				case "CUSTID":
					vo.setCustid(dsEntity.getCustid());
					break;
				case "SSN":
					vo.setSsn(dsEntity.getSsn());
					break;
				case "BIRTHDAY":
					vo.setBirthday(dsEntity.getBirthday());
					break;
				case "BIRTHMO":
					vo.setBirthmo(dsEntity.getBirthmo());
					break;
				case "BIRTHYR":
					vo.setBirthyr(dsEntity.getBirthyr());
					break;
				case "GENDER":
					final String gender = dsEntity.getGender();
					if(gender != null) {
						vo.setGender(stringConverter.apply(gender));
					}
					break;
				case "FICOSCORE":
					vo.setFicoscore(dsEntity.getFicoscore());
					break;
				case "FIRSTNAME":
					final String firstname = dsEntity.getFirstname();
					if(firstname != null) {
						vo.setFirstname(stringConverter.apply(firstname));
					}
					break;
				case "MIDNAME":
					final String midname = dsEntity.getMidname();
					if(midname != null) {
						vo.setMidname(stringConverter.apply(midname));
					}
					break;
				case "LASTNAME":
					final String lastname = dsEntity.getLastname();
					if(lastname != null) {
						vo.setLastname(stringConverter.apply(lastname));
					}
					break;
				case "ADDRESS1":
					final String address1 = dsEntity.getAddress1();
					if(address1 != null) {
						vo.setAddress1(stringConverter.apply(address1));
					}
					break;
				case "ADDRESS2":
					final String address2 = dsEntity.getAddress2();
					if(address2 != null) {
						vo.setAddress2(stringConverter.apply(address2));
					}
					break;
				case "CITY":
					final String city = dsEntity.getCity();
					if(city != null) {
						vo.setCity(stringConverter.apply(city));
					}
					break;
				case "STATE":
					final String state = dsEntity.getState();
					if(state != null) {
						vo.setState(stringConverter.apply(state));
					}
					break;
				case "ZIP":
					vo.setZip(dsEntity.getZip());
					break;
				case "COUNTRY":
					final String country = dsEntity.getCountry();
					if(country != null) {
						vo.setCountry(stringConverter.apply(country));
					}
					break;
				case "PHONE1":
					vo.setPhone1(dsEntity.getPhone1());
					break;
				case "PHONE2":
					vo.setPhone2(dsEntity.getPhone2());
					break;
				case "CUSCRTDT":
					vo.setCuscrtdt(dsEntity.getCuscrtdt());
					break;
				case "CUSCRTTM":
					vo.setCuscrttm(dsEntity.getCuscrttm());
					break;
				case "CUSCRTUSR":
					final String cuscrtusr = dsEntity.getCuscrtusr();
					if(cuscrtusr != null) {
						vo.setCuscrtusr(stringConverter.apply(cuscrtusr));
					}
					break;
				case "CUSCRTPGM":
					final String cuscrtpgm = dsEntity.getCuscrtpgm();
					if(cuscrtpgm != null) {
						vo.setCuscrtpgm(stringConverter.apply(cuscrtpgm));
					}
					break;
				case "CUSCHGDT":
					vo.setCuschgdt(dsEntity.getCuschgdt());
					break;
				case "CUSCHGTM":
					vo.setCuschgtm(dsEntity.getCuschgtm());
					break;
				case "CUSCHGUSR":
					final String cuschgusr = dsEntity.getCuschgusr();
					if(cuschgusr != null) {
						vo.setCuschgusr(stringConverter.apply(cuschgusr));
					}
					break;
				case "CUSCHGPGM":
					final String cuschgpgm = dsEntity.getCuschgpgm();
					if(cuschgpgm != null) {
						vo.setCuschgpgm(stringConverter.apply(cuschgpgm));
					}
					break;
				}
			});
		}
	}
}
