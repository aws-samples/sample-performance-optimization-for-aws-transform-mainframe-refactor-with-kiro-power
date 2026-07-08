package aws.bluage.carddemo.cdbalc01.service;

import aws.bluage.carddemo.cdbalc01.business.context.Cdbalc01Context;
import aws.bluage.carddemo.cdbalc01.business.model.BalanceCalc;
import aws.bluage.carddemo.common.business.database.cdbalp.Cdbalpr;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import org.springframework.stereotype.Component;

/**
 * DataHolderMapper for CDBALC01.
 * Maps between BalanceCalc model and CDBALP entity.
 */
@Component
public class DataHolderMapper {
	
	/**
	 * Maps BalanceCalc to Cdbalpr entity for writing to database.
	 * 
	 * @param ctx the context
	 * @param ctrl the execution controller
	 * @param balanceCalc the source balance calculation
	 * @param cdbalpr the target database entity
	 */
	public void updateCdbalpFromBalanceCalc(final Cdbalc01Context ctx, final ExecutionController ctrl, 
			BalanceCalc balanceCalc, Cdbalpr cdbalpr) {
		if (balanceCalc == null) {
			return;
		}
		
		cdbalpr.setCardnum(balanceCalc.getCardnum());
		cdbalpr.setCustid(balanceCalc.getCustid());
		cdbalpr.setAcctnum(balanceCalc.getAcctnum());
		cdbalpr.setOutstandbal(balanceCalc.getOutstandbal());
		cdbalpr.setTotpurchase(balanceCalc.getTotpurchase());
		cdbalpr.setTotpayment(balanceCalc.getTotpayment());
		cdbalpr.setTotcashadvance(balanceCalc.getTotcashadvance());
		cdbalpr.setTotrefund(balanceCalc.getTotrefund());
		
		if (balanceCalc.getDuedate() != null) {
			cdbalpr.setDuedate(balanceCalc.getDuedate());
		}
		
		if (balanceCalc.getPaymentstatus() != null) {
			cdbalpr.setPaymentstatus(balanceCalc.getPaymentstatus());
		}
	}
}
