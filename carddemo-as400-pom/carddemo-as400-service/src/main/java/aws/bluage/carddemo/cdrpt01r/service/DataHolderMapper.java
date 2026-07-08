package aws.bluage.carddemo.cdrpt01r.service;

import aws.bluage.carddemo.cdrpt01r.business.context.Cdrpt01rContext;
import aws.bluage.carddemo.cdrpt01r.business.model.Detail;
import aws.bluage.carddemo.cdrpt01r.business.model.Summary;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpDetail;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpHeader;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpSeparator;
import aws.bluage.carddemo.common.business.report.cdrptp.CdrptpSummary;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import org.springframework.stereotype.Component;

@Component
public class DataHolderMapper {
	
	public void updateCdrptpSummaryFromSummary(final Cdrpt01rContext ctx, final ExecutionController ctrl, Summary dsEntity, CdrptpSummary vo){
		if ( dsEntity == null ) {
			return;
		}
		if(dsEntity.getRmetric() != null ) {
			vo.setRmetric(dsEntity.getRmetric());
		}

		vo.setRvalue(StringUtils.removeSign(dsEntity.getRvalueReference().getValue(String.class)));

	}
	
	public void applyCdrptpSummaryMiscOut(final Cdrpt01rContext ctx, final ExecutionController ctrl, CdrptpSummary vo){
	}
	
	public void applyCdrptpHeaderMiscOut(final Cdrpt01rContext ctx, final ExecutionController ctrl, CdrptpHeader vo){
	}
	
	public void updateCdrptpDetailFromDetail(final Cdrpt01rContext ctx, final ExecutionController ctrl, Detail dsEntity, CdrptpDetail vo){
		if ( dsEntity == null ) {
			return;
		}
		vo.setRacct(StringUtils.removeSign(dsEntity.getRacctReference().getValue(String.class)));

		vo.setRcus(StringUtils.removeSign(dsEntity.getRcusReference().getValue(String.class)));

		if(dsEntity.getRtype() != null ) {
			vo.setRtype(dsEntity.getRtype());
		}

		if(dsEntity.getRcheck() != null ) {
			vo.setRcheck(dsEntity.getRcheck());
		}

	}
	
	public void applyCdrptpDetailMiscOut(final Cdrpt01rContext ctx, final ExecutionController ctrl, CdrptpDetail vo){
	}
	
	public void applyCdrptpSeparatorMiscOut(final Cdrpt01rContext ctx, final ExecutionController ctrl, CdrptpSeparator vo){
	}
	

}
