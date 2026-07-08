package aws.bluage.carddemo.cdcus02r.service;

import aws.bluage.carddemo.cdcus02r.business.context.Cdcus02rContext;
import aws.bluage.carddemo.cdcus02r.business.model.Genderwin;
import aws.bluage.carddemo.cdcus02r.business.model.Msgsfl;
import aws.bluage.carddemo.cdcus02r.business.model.Msgsflc;
import aws.bluage.carddemo.cdcus02r.business.model.Scrn1;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dAddwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dGenderwin;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dMsgsfl;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dMsgsflc;
import aws.bluage.carddemo.common.business.screen.support.Cdcus02dScrn1;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.shared.SharedContext;
import com.netfective.bluage.gapwalk.runtime.screen.ColorMode;
import com.netfective.bluage.gapwalk.runtime.screen.HilightMode;
import com.netfective.bluage.gapwalk.runtime.screen.IntensityMode;
import com.netfective.bluage.gapwalk.runtime.screen.PageDownMode;
import com.netfective.bluage.gapwalk.runtime.screen.ProtectionMode;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import org.springframework.stereotype.Component;

@Component
public class DataHolderMapper {
	
	public void applyCdcus02dScrn1MiscIn(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dScrn1 vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn01("0");
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn07("0");
		ctx.getIndicatorsGroup().setIn08("0");
		ctx.getIndicatorsGroup().setIn09("0");
		ctx.getIndicatorsGroup().setIn10("0");
		ctx.getIndicatorsGroup().setIn11("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn13("0");
		ctx.getIndicatorsGroup().setIn14("0");
		ctx.getIndicatorsGroup().setIn15("0");
		ctx.getIndicatorsGroup().setIn16("0");
		ctx.getIndicatorsGroup().setIn17("0");
		ctx.getIndicatorsGroup().setIn18("0");
		ctx.getIndicatorsGroup().setIn19("0");
		ctx.getIndicatorsGroup().setIn20("0");
		ctx.getIndicatorsGroup().setIn21("0");
		ctx.getIndicatorsGroup().setIn22("0");
		ctx.getIndicatorsGroup().setIn23("0");
		ctx.getIndicatorsGroup().setIn24("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "1": {
				ctx.getFkeyIndicatorsGroup().setInKA("1");
				ctx.getIndicatorsGroup().setIn01("1");
				break;
			}
			case "2": {
				ctx.getFkeyIndicatorsGroup().setInKB("1");
				ctx.getIndicatorsGroup().setIn02("1");
				break;
			}
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "4": {
				ctx.getFkeyIndicatorsGroup().setInKD("1");
				ctx.getIndicatorsGroup().setIn04("1");
				break;
			}
			case "5": {
				ctx.getFkeyIndicatorsGroup().setInKE("1");
				ctx.getIndicatorsGroup().setIn05("1");
				break;
			}
			case "6": {
				ctx.getFkeyIndicatorsGroup().setInKF("1");
				ctx.getIndicatorsGroup().setIn06("1");
				break;
			}
			case "7": {
				ctx.getFkeyIndicatorsGroup().setInKG("1");
				ctx.getIndicatorsGroup().setIn07("1");
				break;
			}
			case "8": {
				ctx.getFkeyIndicatorsGroup().setInKH("1");
				ctx.getIndicatorsGroup().setIn08("1");
				break;
			}
			case "9": {
				ctx.getFkeyIndicatorsGroup().setInKI("1");
				ctx.getIndicatorsGroup().setIn09("1");
				break;
			}
			case "10": {
				ctx.getFkeyIndicatorsGroup().setInKJ("1");
				ctx.getIndicatorsGroup().setIn10("1");
				break;
			}
			case "11": {
				ctx.getFkeyIndicatorsGroup().setInKK("1");
				ctx.getIndicatorsGroup().setIn11("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
			case "13": {
				ctx.getFkeyIndicatorsGroup().setInKM("1");
				ctx.getIndicatorsGroup().setIn13("1");
				break;
			}
			case "14": {
				ctx.getFkeyIndicatorsGroup().setInKN("1");
				ctx.getIndicatorsGroup().setIn14("1");
				break;
			}
			case "15": {
				ctx.getFkeyIndicatorsGroup().setInKP("1");
				ctx.getIndicatorsGroup().setIn15("1");
				break;
			}
			case "16": {
				ctx.getFkeyIndicatorsGroup().setInKQ("1");
				ctx.getIndicatorsGroup().setIn16("1");
				break;
			}
			case "17": {
				ctx.getFkeyIndicatorsGroup().setInKR("1");
				ctx.getIndicatorsGroup().setIn17("1");
				break;
			}
			case "18": {
				ctx.getFkeyIndicatorsGroup().setInKS("1");
				ctx.getIndicatorsGroup().setIn18("1");
				break;
			}
			case "19": {
				ctx.getFkeyIndicatorsGroup().setInKT("1");
				ctx.getIndicatorsGroup().setIn19("1");
				break;
			}
			case "20": {
				ctx.getFkeyIndicatorsGroup().setInKU("1");
				ctx.getIndicatorsGroup().setIn20("1");
				break;
			}
			case "21": {
				ctx.getFkeyIndicatorsGroup().setInKV("1");
				ctx.getIndicatorsGroup().setIn21("1");
				break;
			}
			case "22": {
				ctx.getFkeyIndicatorsGroup().setInKW("1");
				ctx.getIndicatorsGroup().setIn22("1");
				break;
			}
			case "23": {
				ctx.getFkeyIndicatorsGroup().setInKX("1");
				ctx.getIndicatorsGroup().setIn23("1");
				break;
			}
			case "24": {
				ctx.getFkeyIndicatorsGroup().setInKY("1");
				ctx.getIndicatorsGroup().setIn24("1");
				break;
			}
		}
		vo.setCsrrec(vo.getCursorRecordName());
		vo.setCsrfld(vo.getCursorFieldName());
		vo.setCsrpos(vo.getCursorPosition());
	}
	
	public void updateScrn1FromCdcus02dScrn1(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dScrn1 vo, Scrn1 dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getCsrrec() != null ) {
			dsEntity.setDcsrrec(vo.getCsrrec());
		} else {
			dsEntity.setDcsrrec("");
		}
		if(vo.getCsrfld() != null ) {
			dsEntity.setDcsrfld(vo.getCsrfld());
		} else {
			dsEntity.setDcsrfld("");
		}
		if(vo.getCsrpos() != null ) {
			dsEntity.setDcsrpos(vo.getCsrpos());
		} else {
			dsEntity.setDcsrpos(0);
		}
		if(vo.getPgmname() != null ) {
			dsEntity.setDpgmname(vo.getPgmname());
		} else {
			dsEntity.setDpgmname("");
		}
		if(vo.getCustid() != null ) {
			dsEntity.setDcustid(vo.getCustid());
		} else {
			dsEntity.setDcustid("");
		}
		if(vo.getSsn() != null ) {
			dsEntity.setDssn(vo.getSsn());
		} else {
			dsEntity.setDssn("");
		}
		if(vo.getFicoscore() != null ) {
			dsEntity.setDficoscore(vo.getFicoscore());
		} else {
			dsEntity.setDficoscore("");
		}
		if(vo.getDob() != null ) {
			dsEntity.setDdob(vo.getDob());
		} else {
			dsEntity.setDdob("");
		}
		if(vo.getBirthyr() != null ) {
			dsEntity.setDbirthyr(vo.getBirthyr());
		} else {
			dsEntity.setDbirthyr("");
		}
		if(vo.getBirthmo() != null ) {
			dsEntity.setDbirthmo(vo.getBirthmo());
		} else {
			dsEntity.setDbirthmo("");
		}
		if(vo.getBirthday() != null ) {
			dsEntity.setDbirthday(vo.getBirthday());
		} else {
			dsEntity.setDbirthday("");
		}
		if(vo.getGender() != null ) {
			dsEntity.setDgender(vo.getGender());
		} else {
			dsEntity.setDgender("");
		}
		if(vo.getFirstname() != null ) {
			dsEntity.setDfirstname(vo.getFirstname());
		} else {
			dsEntity.setDfirstname("");
		}
		if(vo.getMiddlename() != null ) {
			dsEntity.setDmiddlename(vo.getMiddlename());
		} else {
			dsEntity.setDmiddlename("");
		}
		if(vo.getLastname() != null ) {
			dsEntity.setDlastname(vo.getLastname());
		} else {
			dsEntity.setDlastname("");
		}
		if(vo.getAddress1() != null ) {
			dsEntity.setDaddress1(vo.getAddress1());
		} else {
			dsEntity.setDaddress1("");
		}
		if(vo.getAddress2() != null ) {
			dsEntity.setDaddress2(vo.getAddress2());
		} else {
			dsEntity.setDaddress2("");
		}
		if(vo.getCity() != null ) {
			dsEntity.setDcity(vo.getCity());
		} else {
			dsEntity.setDcity("");
		}
		if(vo.getState() != null ) {
			dsEntity.setDstate(vo.getState());
		} else {
			dsEntity.setDstate("");
		}
		if(vo.getZip() != null ) {
			dsEntity.setDzip(vo.getZip());
		} else {
			dsEntity.setDzip("");
		}
		if(vo.getCountry() != null ) {
			dsEntity.setDcountry(vo.getCountry());
		} else {
			dsEntity.setDcountry("");
		}
		if(vo.getPhone1area() != null ) {
			dsEntity.setDphone1area(vo.getPhone1area());
		} else {
			dsEntity.setDphone1area("");
		}
		if(vo.getPhone1f3() != null ) {
			dsEntity.setDphone1f3(vo.getPhone1f3());
		} else {
			dsEntity.setDphone1f3("");
		}
		if(vo.getPhone1l4() != null ) {
			dsEntity.setDphone1l4(vo.getPhone1l4());
		} else {
			dsEntity.setDphone1l4("");
		}
		if(vo.getPhone2area() != null ) {
			dsEntity.setDphone2area(vo.getPhone2area());
		} else {
			dsEntity.setDphone2area("");
		}
		if(vo.getPhone2f3() != null ) {
			dsEntity.setDphone2f3(vo.getPhone2f3());
		} else {
			dsEntity.setDphone2f3("");
		}
		if(vo.getPhone2l4() != null ) {
			dsEntity.setDphone2l4(vo.getPhone2l4());
		} else {
			dsEntity.setDphone2l4("");
		}
		if(vo.getCuscrtusr() != null ) {
			dsEntity.setDcuscrtusr(vo.getCuscrtusr());
		} else {
			dsEntity.setDcuscrtusr("");
		}
		if(vo.getCuscrtdt() != null ) {
			dsEntity.setDcuscrtdt(vo.getCuscrtdt());
		} else {
			dsEntity.setDcuscrtdt(0);
		}
		if(vo.getCuscrttm() != null ) {
			dsEntity.setDcuscrttm(vo.getCuscrttm());
		} else {
			dsEntity.setDcuscrttm(0);
		}
		if(vo.getCuscrtpgm() != null ) {
			dsEntity.setDcuscrtpgm(vo.getCuscrtpgm());
		} else {
			dsEntity.setDcuscrtpgm("");
		}
		if(vo.getCuschgusr() != null ) {
			dsEntity.setDcuschgusr(vo.getCuschgusr());
		} else {
			dsEntity.setDcuschgusr("");
		}
		if(vo.getCuschgdt() != null ) {
			dsEntity.setDcuschgdt(vo.getCuschgdt());
		} else {
			dsEntity.setDcuschgdt(0);
		}
		if(vo.getCuschgtm() != null ) {
			dsEntity.setDcuschgtm(vo.getCuschgtm());
		} else {
			dsEntity.setDcuschgtm(0);
		}
		if(vo.getCuschgpgm() != null ) {
			dsEntity.setDcuschgpgm(vo.getCuschgpgm());
		} else {
			dsEntity.setDcuschgpgm("");
		}
		vo.setDate1(StringUtils.replaceChars(vo.getDate1Field().getValue(String.class), "/", ""));
	}
	
	public void updateCdcus02dScrn1FromScrn1(final Cdcus02rContext ctx, final ExecutionController ctrl, Scrn1 dsEntity, Cdcus02dScrn1 vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDcsrrec() != null ) {
			vo.setCsrrec(dsEntity.getDcsrrec());
		}

		if(dsEntity.getDcsrfld() != null ) {
			vo.setCsrfld(dsEntity.getDcsrfld());
		}

		try {
			vo.setCsrpos(dsEntity.getDcsrpos());
		} catch (Exception e) {
			vo.getCsrposField().setValue(StringUtils.removeSign(dsEntity.getDcsrposReference().getValue(String.class)));
		}
		vo.getCsrposField().setNumerical(true);

		if(dsEntity.getDpgmname() != null ) {
			vo.setPgmname(dsEntity.getDpgmname());
		}

		if(dsEntity.getDcustid() != null ) {
			vo.setCustid(dsEntity.getDcustid());
		}

		if(dsEntity.getDssn() != null ) {
			vo.setSsn(dsEntity.getDssn());
		}

		if(dsEntity.getDficoscore() != null ) {
			vo.setFicoscore(dsEntity.getDficoscore());
		}

		if(dsEntity.getDdob() != null ) {
			vo.setDob(dsEntity.getDdob());
		}

		if(dsEntity.getDbirthyr() != null ) {
			vo.setBirthyr(dsEntity.getDbirthyr());
		}

		if(dsEntity.getDbirthmo() != null ) {
			vo.setBirthmo(dsEntity.getDbirthmo());
		}

		if(dsEntity.getDbirthday() != null ) {
			vo.setBirthday(dsEntity.getDbirthday());
		}

		if(dsEntity.getDgender() != null ) {
			vo.setGender(dsEntity.getDgender());
		}

		if(dsEntity.getDfirstname() != null ) {
			vo.setFirstname(dsEntity.getDfirstname());
		}

		if(dsEntity.getDmiddlename() != null ) {
			vo.setMiddlename(dsEntity.getDmiddlename());
		}

		if(dsEntity.getDlastname() != null ) {
			vo.setLastname(dsEntity.getDlastname());
		}

		if(dsEntity.getDaddress1() != null ) {
			vo.setAddress1(dsEntity.getDaddress1());
		}

		if(dsEntity.getDaddress2() != null ) {
			vo.setAddress2(dsEntity.getDaddress2());
		}

		if(dsEntity.getDcity() != null ) {
			vo.setCity(dsEntity.getDcity());
		}

		if(dsEntity.getDstate() != null ) {
			vo.setState(dsEntity.getDstate());
		}

		if(dsEntity.getDzip() != null ) {
			vo.setZip(dsEntity.getDzip());
		}

		if(dsEntity.getDcountry() != null ) {
			vo.setCountry(dsEntity.getDcountry());
		}

		if(dsEntity.getDphone1area() != null ) {
			vo.setPhone1area(dsEntity.getDphone1area());
		}

		if(dsEntity.getDphone1f3() != null ) {
			vo.setPhone1f3(dsEntity.getDphone1f3());
		}

		if(dsEntity.getDphone1l4() != null ) {
			vo.setPhone1l4(dsEntity.getDphone1l4());
		}

		if(dsEntity.getDphone2area() != null ) {
			vo.setPhone2area(dsEntity.getDphone2area());
		}

		if(dsEntity.getDphone2f3() != null ) {
			vo.setPhone2f3(dsEntity.getDphone2f3());
		}

		if(dsEntity.getDphone2l4() != null ) {
			vo.setPhone2l4(dsEntity.getDphone2l4());
		}

		if(dsEntity.getDcuscrtusr() != null ) {
			vo.setCuscrtusr(dsEntity.getDcuscrtusr());
		}

		try {
			vo.setCuscrtdt(dsEntity.getDcuscrtdt());
		} catch (Exception e) {
			vo.getCuscrtdtField().setValue(StringUtils.removeSign(dsEntity.getDcuscrtdtReference().getValue(String.class)));
		}
		vo.getCuscrtdtField().setNumerical(true);

		try {
			vo.setCuscrttm(dsEntity.getDcuscrttm());
		} catch (Exception e) {
			vo.getCuscrttmField().setValue(StringUtils.removeSign(dsEntity.getDcuscrttmReference().getValue(String.class)));
		}
		vo.getCuscrttmField().setNumerical(true);

		if(dsEntity.getDcuscrtpgm() != null ) {
			vo.setCuscrtpgm(dsEntity.getDcuscrtpgm());
		}

		if(dsEntity.getDcuschgusr() != null ) {
			vo.setCuschgusr(dsEntity.getDcuschgusr());
		}

		try {
			vo.setCuschgdt(dsEntity.getDcuschgdt());
		} catch (Exception e) {
			vo.getCuschgdtField().setValue(StringUtils.removeSign(dsEntity.getDcuschgdtReference().getValue(String.class)));
		}
		vo.getCuschgdtField().setNumerical(true);

		try {
			vo.setCuschgtm(dsEntity.getDcuschgtm());
		} catch (Exception e) {
			vo.getCuschgtmField().setValue(StringUtils.removeSign(dsEntity.getDcuschgtmReference().getValue(String.class)));
		}
		vo.getCuschgtmField().setNumerical(true);

		if(dsEntity.getDcuschgpgm() != null ) {
			vo.setCuschgpgm(dsEntity.getDcuschgpgm());
		}

	}
	
	public void applyCdcus02dScrn1MiscOut(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dScrn1 vo){
		vo.setDspMode("*DS3");
		vo.setOverlay(true);
		vo.getCsrrecField().setIntensity(IntensityMode.DRK);
		vo.getCsrrecField().setProtection(ProtectionMode.PROT);
		vo.getCsrfldField().setIntensity(IntensityMode.DRK);
		vo.getCsrfldField().setProtection(ProtectionMode.PROT);
		vo.getCsrposField().setIntensity(IntensityMode.DRK);
		vo.getCsrposField().setProtection(ProtectionMode.PROT);
		vo.setLabelViewCustomer("View Customer");
		vo.getLabelViewCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelViewCustomerField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0)) {
			vo.getLabelViewCustomerField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelAddCustomer("Add Customer");
		vo.getLabelAddCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelAddCustomerField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelAddCustomerField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdateCustomer("Update Customer");
		vo.getLabelUpdateCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelUpdateCustomerField().setHilight(HilightMode.REVERSE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelUpdateCustomerField().setIntensity(IntensityMode.DRK);
		}
		vo.getDate1Field().setProtection(ProtectionMode.PROT);
		vo.setDate1(DateHelper.getFormattedDate("MM/dd/yy"));
		vo.getTime1Field().setProtection(ProtectionMode.PROT);
		vo.setTime1(String.valueOf(DateHelper.getTimeHHhmmss()));
		vo.getLabelUserField().setProtection(ProtectionMode.PROT);
		vo.setLabelUser(SharedContext.get().getUserid());
		vo.getPgmnameField().setProtection(ProtectionMode.PROT);
		vo.getPgmnameField().setColor(ColorMode.BLUE);
		vo.getCustidField().setProtection(ProtectionMode.UNPROT);
		vo.getCustidField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0) {
			vo.getCustidField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) {
			vo.getCustidField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getCustidField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn81Reference(), "1") == 0) {
			vo.getCustidField().setHilight(HilightMode.REVERSE);
		}
		vo.getSsnField().setProtection(ProtectionMode.UNPROT);
		vo.getSsnField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getSsnField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getSsnField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn82Reference(), "1") == 0) {
			vo.getSsnField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn82Reference(), "1") == 0) {
			vo.getSsnField().setHilight(HilightMode.REVERSE);
		}
		vo.getFicoscoreField().setProtection(ProtectionMode.UNPROT);
		vo.getFicoscoreField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getFicoscoreField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getFicoscoreField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn84Reference(), "1") == 0) {
			vo.getFicoscoreField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn84Reference(), "1") == 0) {
			vo.getFicoscoreField().setHilight(HilightMode.REVERSE);
		}
		vo.getDobField().setProtection(ProtectionMode.PROT);
		vo.getDobField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getDobField().setIntensity(IntensityMode.DRK);
		}
		vo.getBirthyrField().setProtection(ProtectionMode.UNPROT);
		vo.getBirthyrField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getBirthyrField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getBirthyrField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getBirthyrField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getBirthyrField().setHilight(HilightMode.REVERSE);
		}
		vo.getBirthmoField().setProtection(ProtectionMode.UNPROT);
		vo.getBirthmoField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getBirthmoField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getBirthmoField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getBirthmoField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getBirthmoField().setHilight(HilightMode.REVERSE);
		}
		vo.getBirthdayField().setProtection(ProtectionMode.UNPROT);
		vo.getBirthdayField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getBirthdayField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getBirthdayField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getBirthdayField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn83Reference(), "1") == 0) {
			vo.getBirthdayField().setHilight(HilightMode.REVERSE);
		}
		vo.getGenderField().setProtection(ProtectionMode.UNPROT);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0) {
			vo.getGenderField().setColor(ColorMode.WHITE);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) {
			vo.getGenderField().setColor(ColorMode.PINK);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0) {
			vo.getGenderField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0) {
			vo.getGenderField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") == 0) {
			vo.getGenderField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn95Reference(), "1") == 0) {
			vo.getGenderField().setHilight(HilightMode.REVERSE);
		}
		vo.getFirstnameField().setProtection(ProtectionMode.UNPROT);
		vo.getFirstnameField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getFirstnameField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getFirstnameField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn85Reference(), "1") == 0) {
			vo.getFirstnameField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn85Reference(), "1") == 0) {
			vo.getFirstnameField().setHilight(HilightMode.REVERSE);
		}
		vo.getMiddlenameField().setProtection(ProtectionMode.UNPROT);
		vo.getMiddlenameField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getMiddlenameField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getMiddlenameField().setUnderline(true);
		}
		vo.getLastnameField().setProtection(ProtectionMode.UNPROT);
		vo.getLastnameField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getLastnameField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getLastnameField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn86Reference(), "1") == 0) {
			vo.getLastnameField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn86Reference(), "1") == 0) {
			vo.getLastnameField().setHilight(HilightMode.REVERSE);
		}
		vo.getAddress1Field().setProtection(ProtectionMode.UNPROT);
		vo.getAddress1Field().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getAddress1Field().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getAddress1Field().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn87Reference(), "1") == 0) {
			vo.getAddress1Field().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn87Reference(), "1") == 0) {
			vo.getAddress1Field().setHilight(HilightMode.REVERSE);
		}
		vo.getAddress2Field().setProtection(ProtectionMode.UNPROT);
		vo.getAddress2Field().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getAddress2Field().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getAddress2Field().setUnderline(true);
		}
		vo.getCityField().setProtection(ProtectionMode.UNPROT);
		vo.getCityField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getCityField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getCityField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn88Reference(), "1") == 0) {
			vo.getCityField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn88Reference(), "1") == 0) {
			vo.getCityField().setHilight(HilightMode.REVERSE);
		}
		vo.getStateField().setProtection(ProtectionMode.UNPROT);
		vo.getStateField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getStateField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getStateField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn89Reference(), "1") == 0) {
			vo.getStateField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn89Reference(), "1") == 0) {
			vo.getStateField().setHilight(HilightMode.REVERSE);
		}
		vo.getZipField().setProtection(ProtectionMode.UNPROT);
		vo.getZipField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getZipField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getZipField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") == 0) {
			vo.getZipField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn90Reference(), "1") == 0) {
			vo.getZipField().setHilight(HilightMode.REVERSE);
		}
		vo.getCountryField().setProtection(ProtectionMode.UNPROT);
		vo.getCountryField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getCountryField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getCountryField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn91Reference(), "1") == 0) {
			vo.getCountryField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn91Reference(), "1") == 0) {
			vo.getCountryField().setHilight(HilightMode.REVERSE);
		}
		vo.getPhone1areaField().setProtection(ProtectionMode.UNPROT);
		vo.getPhone1areaField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getPhone1areaField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getPhone1areaField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getPhone1areaField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getPhone1areaField().setHilight(HilightMode.REVERSE);
		}
		vo.getPhone1f3Field().setProtection(ProtectionMode.UNPROT);
		vo.getPhone1f3Field().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getPhone1f3Field().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getPhone1f3Field().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getPhone1f3Field().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getPhone1f3Field().setHilight(HilightMode.REVERSE);
		}
		vo.getPhone1l4Field().setProtection(ProtectionMode.UNPROT);
		vo.getPhone1l4Field().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getPhone1l4Field().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getPhone1l4Field().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getPhone1l4Field().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn92Reference(), "1") == 0) {
			vo.getPhone1l4Field().setHilight(HilightMode.REVERSE);
		}
		vo.getPhone2areaField().setProtection(ProtectionMode.UNPROT);
		vo.getPhone2areaField().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getPhone2areaField().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getPhone2areaField().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn93Reference(), "1") == 0) {
			vo.getPhone2areaField().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn93Reference(), "1") == 0) {
			vo.getPhone2areaField().setHilight(HilightMode.REVERSE);
		}
		vo.getPhone2f3Field().setProtection(ProtectionMode.UNPROT);
		vo.getPhone2f3Field().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getPhone2f3Field().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getPhone2f3Field().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn93Reference(), "1") == 0) {
			vo.getPhone2f3Field().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn93Reference(), "1") == 0) {
			vo.getPhone2f3Field().setHilight(HilightMode.REVERSE);
		}
		vo.getPhone2l4Field().setProtection(ProtectionMode.UNPROT);
		vo.getPhone2l4Field().setColor(ColorMode.WHITE);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") == 0) {
			vo.getPhone2l4Field().setProtection(ProtectionMode.PROT);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn80Reference(), "1") != 0) {
			vo.getPhone2l4Field().setUnderline(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn93Reference(), "1") == 0) {
			vo.getPhone2l4Field().setIc(true);
		}

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn93Reference(), "1") == 0) {
			vo.getPhone2l4Field().setHilight(HilightMode.REVERSE);
		}
		vo.setLabelCreatedBy("Created By:");
		vo.getLabelCreatedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelCreatedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getCuscrtusrField().setProtection(ProtectionMode.PROT);
		vo.getCuscrtusrField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCuscrtusrField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn("On:");
		vo.getLabelOnField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelOnField().setIntensity(IntensityMode.DRK);
		}
		vo.getCuscrtdtField().setProtection(ProtectionMode.PROT);
		vo.getCuscrtdtField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCuscrtdtField().setIntensity(IntensityMode.DRK);
		}
		vo.getCuscrttmField().setProtection(ProtectionMode.PROT);
		vo.getCuscrttmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCuscrttmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram("Program:");
		vo.getLabelProgramField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelProgramField().setIntensity(IntensityMode.DRK);
		}
		vo.getCuscrtpgmField().setProtection(ProtectionMode.PROT);
		vo.getCuscrtpgmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCuscrtpgmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdatedBy("Updated By:");
		vo.getLabelUpdatedByField().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelUpdatedByField().setIntensity(IntensityMode.DRK);
		}
		vo.getCuschgusrField().setProtection(ProtectionMode.PROT);
		vo.getCuschgusrField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCuschgusrField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelOn1("On:");
		vo.getLabelOn1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelOn1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getCuschgdtField().setProtection(ProtectionMode.PROT);
		vo.getCuschgdtField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCuschgdtField().setIntensity(IntensityMode.DRK);
		}
		vo.getCuschgtmField().setProtection(ProtectionMode.PROT);
		vo.getCuschgtmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0 && DataUtils.compare(ctx.getIndicatorsGroup().getIn94Reference(), "1") != 0)) {
			vo.getCuschgtmField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelProgram1("Program:");
		vo.getLabelProgram1Field().setProtection(ProtectionMode.PROT);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelProgram1Field().setIntensity(IntensityMode.DRK);
		}
		vo.getCuschgpgmField().setProtection(ProtectionMode.PROT);
		vo.getCuschgpgmField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getCuschgpgmField().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void applyCdcus02dAddwinMiscIn(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dAddwin vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn01("0");
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn07("0");
		ctx.getIndicatorsGroup().setIn08("0");
		ctx.getIndicatorsGroup().setIn09("0");
		ctx.getIndicatorsGroup().setIn10("0");
		ctx.getIndicatorsGroup().setIn11("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn13("0");
		ctx.getIndicatorsGroup().setIn14("0");
		ctx.getIndicatorsGroup().setIn15("0");
		ctx.getIndicatorsGroup().setIn16("0");
		ctx.getIndicatorsGroup().setIn17("0");
		ctx.getIndicatorsGroup().setIn18("0");
		ctx.getIndicatorsGroup().setIn19("0");
		ctx.getIndicatorsGroup().setIn20("0");
		ctx.getIndicatorsGroup().setIn21("0");
		ctx.getIndicatorsGroup().setIn22("0");
		ctx.getIndicatorsGroup().setIn23("0");
		ctx.getIndicatorsGroup().setIn24("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "1": {
				ctx.getFkeyIndicatorsGroup().setInKA("1");
				ctx.getIndicatorsGroup().setIn01("1");
				break;
			}
			case "2": {
				ctx.getFkeyIndicatorsGroup().setInKB("1");
				ctx.getIndicatorsGroup().setIn02("1");
				break;
			}
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "4": {
				ctx.getFkeyIndicatorsGroup().setInKD("1");
				ctx.getIndicatorsGroup().setIn04("1");
				break;
			}
			case "5": {
				ctx.getFkeyIndicatorsGroup().setInKE("1");
				ctx.getIndicatorsGroup().setIn05("1");
				break;
			}
			case "6": {
				ctx.getFkeyIndicatorsGroup().setInKF("1");
				ctx.getIndicatorsGroup().setIn06("1");
				break;
			}
			case "7": {
				ctx.getFkeyIndicatorsGroup().setInKG("1");
				ctx.getIndicatorsGroup().setIn07("1");
				break;
			}
			case "8": {
				ctx.getFkeyIndicatorsGroup().setInKH("1");
				ctx.getIndicatorsGroup().setIn08("1");
				break;
			}
			case "9": {
				ctx.getFkeyIndicatorsGroup().setInKI("1");
				ctx.getIndicatorsGroup().setIn09("1");
				break;
			}
			case "10": {
				ctx.getFkeyIndicatorsGroup().setInKJ("1");
				ctx.getIndicatorsGroup().setIn10("1");
				break;
			}
			case "11": {
				ctx.getFkeyIndicatorsGroup().setInKK("1");
				ctx.getIndicatorsGroup().setIn11("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
			case "13": {
				ctx.getFkeyIndicatorsGroup().setInKM("1");
				ctx.getIndicatorsGroup().setIn13("1");
				break;
			}
			case "14": {
				ctx.getFkeyIndicatorsGroup().setInKN("1");
				ctx.getIndicatorsGroup().setIn14("1");
				break;
			}
			case "15": {
				ctx.getFkeyIndicatorsGroup().setInKP("1");
				ctx.getIndicatorsGroup().setIn15("1");
				break;
			}
			case "16": {
				ctx.getFkeyIndicatorsGroup().setInKQ("1");
				ctx.getIndicatorsGroup().setIn16("1");
				break;
			}
			case "17": {
				ctx.getFkeyIndicatorsGroup().setInKR("1");
				ctx.getIndicatorsGroup().setIn17("1");
				break;
			}
			case "18": {
				ctx.getFkeyIndicatorsGroup().setInKS("1");
				ctx.getIndicatorsGroup().setIn18("1");
				break;
			}
			case "19": {
				ctx.getFkeyIndicatorsGroup().setInKT("1");
				ctx.getIndicatorsGroup().setIn19("1");
				break;
			}
			case "20": {
				ctx.getFkeyIndicatorsGroup().setInKU("1");
				ctx.getIndicatorsGroup().setIn20("1");
				break;
			}
			case "21": {
				ctx.getFkeyIndicatorsGroup().setInKV("1");
				ctx.getIndicatorsGroup().setIn21("1");
				break;
			}
			case "22": {
				ctx.getFkeyIndicatorsGroup().setInKW("1");
				ctx.getIndicatorsGroup().setIn22("1");
				break;
			}
			case "23": {
				ctx.getFkeyIndicatorsGroup().setInKX("1");
				ctx.getIndicatorsGroup().setIn23("1");
				break;
			}
			case "24": {
				ctx.getFkeyIndicatorsGroup().setInKY("1");
				ctx.getIndicatorsGroup().setIn24("1");
				break;
			}
		}
	}
	
	public void applyCdcus02dAddwinMiscOut(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dAddwin vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(5);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(45);
		vo.setHeight(9);
		vo.setWidth(20);

		vo.setBorder(true);
		vo.setBorderColor(ColorMode.BLUE);
		vo.setBorderHilight(HilightMode.REVERSE);
		vo.setLabelAddCustomer("Add Customer");
		vo.getLabelAddCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelAddCustomerField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") == 0)) {
			vo.getLabelAddCustomerField().setIntensity(IntensityMode.DRK);
		}
		vo.setLabelUpdateCustomer("Update Customer");
		vo.getLabelUpdateCustomerField().setProtection(ProtectionMode.PROT);
		vo.getLabelUpdateCustomerField().setColor(ColorMode.WHITE);

		if(!(DataUtils.compare(ctx.getIndicatorsGroup().getIn70Reference(), "1") != 0)) {
			vo.getLabelUpdateCustomerField().setIntensity(IntensityMode.DRK);
		}
	}
	
	public void applyCdcus02dGenderwinMiscIn(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dGenderwin vo){
		ctx.setOffFkeyIndicators();
		ctx.getIndicatorsGroup().setIn01("0");
		ctx.getIndicatorsGroup().setIn02("0");
		ctx.getIndicatorsGroup().setIn03("0");
		ctx.getIndicatorsGroup().setIn04("0");
		ctx.getIndicatorsGroup().setIn05("0");
		ctx.getIndicatorsGroup().setIn06("0");
		ctx.getIndicatorsGroup().setIn07("0");
		ctx.getIndicatorsGroup().setIn08("0");
		ctx.getIndicatorsGroup().setIn09("0");
		ctx.getIndicatorsGroup().setIn10("0");
		ctx.getIndicatorsGroup().setIn11("0");
		ctx.getIndicatorsGroup().setIn12("0");
		ctx.getIndicatorsGroup().setIn13("0");
		ctx.getIndicatorsGroup().setIn14("0");
		ctx.getIndicatorsGroup().setIn15("0");
		ctx.getIndicatorsGroup().setIn16("0");
		ctx.getIndicatorsGroup().setIn17("0");
		ctx.getIndicatorsGroup().setIn18("0");
		ctx.getIndicatorsGroup().setIn19("0");
		ctx.getIndicatorsGroup().setIn20("0");
		ctx.getIndicatorsGroup().setIn21("0");
		ctx.getIndicatorsGroup().setIn22("0");
		ctx.getIndicatorsGroup().setIn23("0");
		ctx.getIndicatorsGroup().setIn24("0");
		ctx.getIndicatorsGroup().setIn50((DataUtils.compare("ENTER", vo.getAttentionKey()) != 0 ? "1" : "0"));
		switch (vo.getAttentionKey()) {
			case "1": {
				ctx.getFkeyIndicatorsGroup().setInKA("1");
				ctx.getIndicatorsGroup().setIn01("1");
				break;
			}
			case "2": {
				ctx.getFkeyIndicatorsGroup().setInKB("1");
				ctx.getIndicatorsGroup().setIn02("1");
				break;
			}
			case "3": {
				ctx.getFkeyIndicatorsGroup().setInKC("1");
				ctx.getIndicatorsGroup().setIn03("1");
				break;
			}
			case "4": {
				ctx.getFkeyIndicatorsGroup().setInKD("1");
				ctx.getIndicatorsGroup().setIn04("1");
				break;
			}
			case "5": {
				ctx.getFkeyIndicatorsGroup().setInKE("1");
				ctx.getIndicatorsGroup().setIn05("1");
				break;
			}
			case "6": {
				ctx.getFkeyIndicatorsGroup().setInKF("1");
				ctx.getIndicatorsGroup().setIn06("1");
				break;
			}
			case "7": {
				ctx.getFkeyIndicatorsGroup().setInKG("1");
				ctx.getIndicatorsGroup().setIn07("1");
				break;
			}
			case "8": {
				ctx.getFkeyIndicatorsGroup().setInKH("1");
				ctx.getIndicatorsGroup().setIn08("1");
				break;
			}
			case "9": {
				ctx.getFkeyIndicatorsGroup().setInKI("1");
				ctx.getIndicatorsGroup().setIn09("1");
				break;
			}
			case "10": {
				ctx.getFkeyIndicatorsGroup().setInKJ("1");
				ctx.getIndicatorsGroup().setIn10("1");
				break;
			}
			case "11": {
				ctx.getFkeyIndicatorsGroup().setInKK("1");
				ctx.getIndicatorsGroup().setIn11("1");
				break;
			}
			case "12": {
				ctx.getFkeyIndicatorsGroup().setInKL("1");
				ctx.getIndicatorsGroup().setIn12("1");
				break;
			}
			case "13": {
				ctx.getFkeyIndicatorsGroup().setInKM("1");
				ctx.getIndicatorsGroup().setIn13("1");
				break;
			}
			case "14": {
				ctx.getFkeyIndicatorsGroup().setInKN("1");
				ctx.getIndicatorsGroup().setIn14("1");
				break;
			}
			case "15": {
				ctx.getFkeyIndicatorsGroup().setInKP("1");
				ctx.getIndicatorsGroup().setIn15("1");
				break;
			}
			case "16": {
				ctx.getFkeyIndicatorsGroup().setInKQ("1");
				ctx.getIndicatorsGroup().setIn16("1");
				break;
			}
			case "17": {
				ctx.getFkeyIndicatorsGroup().setInKR("1");
				ctx.getIndicatorsGroup().setIn17("1");
				break;
			}
			case "18": {
				ctx.getFkeyIndicatorsGroup().setInKS("1");
				ctx.getIndicatorsGroup().setIn18("1");
				break;
			}
			case "19": {
				ctx.getFkeyIndicatorsGroup().setInKT("1");
				ctx.getIndicatorsGroup().setIn19("1");
				break;
			}
			case "20": {
				ctx.getFkeyIndicatorsGroup().setInKU("1");
				ctx.getIndicatorsGroup().setIn20("1");
				break;
			}
			case "21": {
				ctx.getFkeyIndicatorsGroup().setInKV("1");
				ctx.getIndicatorsGroup().setIn21("1");
				break;
			}
			case "22": {
				ctx.getFkeyIndicatorsGroup().setInKW("1");
				ctx.getIndicatorsGroup().setIn22("1");
				break;
			}
			case "23": {
				ctx.getFkeyIndicatorsGroup().setInKX("1");
				ctx.getIndicatorsGroup().setIn23("1");
				break;
			}
			case "24": {
				ctx.getFkeyIndicatorsGroup().setInKY("1");
				ctx.getIndicatorsGroup().setIn24("1");
				break;
			}
		}
	}
	
	public void updateGenderwinFromCdcus02dGenderwin(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dGenderwin vo, Genderwin dsEntity){
		if ( vo == null ) {
			return;
		}
		if(vo.getSelgen() != null ) {
			dsEntity.setDselgen(vo.getSelgen());
		} else {
			dsEntity.setDselgen(0);
		}
	}
	
	public void updateCdcus02dGenderwinFromGenderwin(final Cdcus02rContext ctx, final ExecutionController ctrl, Genderwin dsEntity, Cdcus02dGenderwin vo){
		if ( dsEntity == null ) {
			return;
		}
		try {
			vo.setSelgen(dsEntity.getDselgen());
		} catch (Exception e) {
			vo.getSelgenField().setValue(StringUtils.removeSign(dsEntity.getDselgenReference().getValue(String.class)));
		}
		vo.getSelgenField().setNumerical(true);

	}
	
	public void applyCdcus02dGenderwinMiscOut(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dGenderwin vo){
		vo.setDspMode("*DS3");
		vo.setPositionTop(8);
		vo.setMessageLine(true);
		vo.setPositionCursor(false);
		vo.setPositionLeft(37);
		vo.setHeight(6);
		vo.setWidth(38);

		vo.getSelgenField().setProtection(ProtectionMode.UNPROT);
		vo.getSelgenField().setUnderline(true);
		vo.getSelgenField().setColor(ColorMode.WHITE);
	}
	
	public void updateCdcus02dMsgsflFromMsgsfl(final Cdcus02rContext ctx, final ExecutionController ctrl, Msgsfl dsEntity, Cdcus02dMsgsfl vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDsflmsgkey() != null ) {
			vo.setSflmsgkey(dsEntity.getDsflmsgkey());
		}

		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdcus02dMsgsflMiscOut(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dMsgsfl vo){
		vo.getSubfileMessageLineField().setProtection(ProtectionMode.PROT);
		vo.setSubfileMessageLine(ctx.getMsgsfl().getSubfilemessageline());
		vo.setSubfileSecondMessageLine(ctx.getMsgsfl().getSubfilesecondmessageline());
		vo.setSubfileMessageId(ctx.getMsgsfl().getSubfilemessageid());
		vo.getSflmsgkeyField().setProtection(ProtectionMode.PROT);
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	
	public void updateCdcus02dMsgsflcFromMsgsflc(final Cdcus02rContext ctx, final ExecutionController ctrl, Msgsflc dsEntity, Cdcus02dMsgsflc vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getDpgmq() != null ) {
			vo.setPgmq(dsEntity.getDpgmq());
		}

	}
	
	public void applyCdcus02dMsgsflcMiscOut(final Cdcus02rContext ctx, final ExecutionController ctrl, Cdcus02dMsgsflc vo){
		vo.setDspMode("*DS3");
		vo.getMsgsflField().setDspMode("*DS3");
		vo.getMsgsflField().setMessageSubfile();
		vo.setOverlay(true);
		vo.getMsgsflField().setSize(15);
		vo.getMsgsflField().setNumberOfRecordsPerPage(1);
		vo.getMsgsflField().display(true);
		vo.getMsgsflField().displayControl(true);
		vo.getMsgsflField().initializeRecord(true);
		vo.getMsgsflField().setPageDown(PageDownMode.PLUS);
		vo.getMsgsflField().setEnd(false);

		if(DataUtils.compare(ctx.getIndicatorsGroup().getIn99Reference(), "1") != 0) {
			vo.getMsgsflField().setEnd(true);
		}
		vo.getPgmqField().setProtection(ProtectionMode.PROT);
	}
	

}
