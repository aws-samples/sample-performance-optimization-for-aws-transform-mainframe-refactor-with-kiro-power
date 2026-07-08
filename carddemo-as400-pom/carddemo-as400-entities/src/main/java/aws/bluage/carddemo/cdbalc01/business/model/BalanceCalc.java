package aws.bluage.carddemo.cdbalc01.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;

/**
 * Data simplifier entity BalanceCalc.
 * Holds balance calculation data for a single card.
 * 
 * @see RecordEntity
 */
public class BalanceCalc extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cardnum = new Elementary(root, new PackedType(16, 0, true), new BigDecimal("0"));
	private final Elementary custid = new Elementary(root, new PackedType(9, 0, true), new BigDecimal("0"));
	private final Elementary acctnum = new Elementary(root, new PackedType(11, 0, true), new BigDecimal("0"));
	private final Elementary totpurchase = new Elementary(root, new PackedType(11, 2, true), new BigDecimal("0.00"));
	private final Elementary totpayment = new Elementary(root, new PackedType(11, 2, true), new BigDecimal("0.00"));
	private final Elementary totcashadvance = new Elementary(root, new PackedType(11, 2, true), new BigDecimal("0.00"));
	private final Elementary totrefund = new Elementary(root, new PackedType(11, 2, true), new BigDecimal("0.00"));
	private final Elementary outstandbal = new Elementary(root, new PackedType(11, 2, true), new BigDecimal("0.00"));
	private final Elementary duedate = new Elementary(root, new AlphanumericType(10), "");
	private final Elementary paymentstatus = new Elementary(root, new AlphanumericType(1), "U");
	
	/**
	 * Instantiate a new BalanceCalc with a default record.
	 * @param configuration the configuration
	 */
	public BalanceCalc(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new BalanceCalc bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public BalanceCalc(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	// Cardnum
	public ElementaryRangeReference getCardnumReference() {
		return cardnum.getReference();
	}

	public long getCardnum() {
		return cardnum.getValue();
	}

	public void setCardnum(long cardnum) {
		this.cardnum.setValue(cardnum);
	}

	// Custid
	public ElementaryRangeReference getCustidReference() {
		return custid.getReference();
	}

	public int getCustid() {
		return ((Number) custid.getValue()).intValue();
	}

	public void setCustid(int custid) {
		this.custid.setValue(custid);
	}

	// Acctnum
	public ElementaryRangeReference getAcctnumReference() {
		return acctnum.getReference();
	}

	public long getAcctnum() {
		return acctnum.getValue();
	}

	public void setAcctnum(long acctnum) {
		this.acctnum.setValue(acctnum);
	}

	// Totpurchase
	public ElementaryRangeReference getTotpurchaseReference() {
		return totpurchase.getReference();
	}

	public BigDecimal getTotpurchase() {
		return totpurchase.getValue();
	}

	public void setTotpurchase(BigDecimal totpurchase) {
		this.totpurchase.setValue(totpurchase);
	}

	// Totpayment
	public ElementaryRangeReference getTotpaymentReference() {
		return totpayment.getReference();
	}

	public BigDecimal getTotpayment() {
		return totpayment.getValue();
	}

	public void setTotpayment(BigDecimal totpayment) {
		this.totpayment.setValue(totpayment);
	}

	// Totcashadvance
	public ElementaryRangeReference getTotcashadvanceReference() {
		return totcashadvance.getReference();
	}

	public BigDecimal getTotcashadvance() {
		return totcashadvance.getValue();
	}

	public void setTotcashadvance(BigDecimal totcashadvance) {
		this.totcashadvance.setValue(totcashadvance);
	}

	// Totrefund
	public ElementaryRangeReference getTotrefundReference() {
		return totrefund.getReference();
	}

	public BigDecimal getTotrefund() {
		return totrefund.getValue();
	}

	public void setTotrefund(BigDecimal totrefund) {
		this.totrefund.setValue(totrefund);
	}

	// Outstandbal
	public ElementaryRangeReference getOutstandbalReference() {
		return outstandbal.getReference();
	}

	public BigDecimal getOutstandbal() {
		return outstandbal.getValue();
	}

	public void setOutstandbal(BigDecimal outstandbal) {
		this.outstandbal.setValue(outstandbal);
	}

	// Duedate
	public ElementaryRangeReference getDuedateReference() {
		return duedate.getReference();
	}

	public String getDuedate() {
		return duedate.getValue();
	}

	public void setDuedate(String duedate) {
		this.duedate.setValue(duedate);
	}

	// Paymentstatus
	public ElementaryRangeReference getPaymentstatusReference() {
		return paymentstatus.getReference();
	}

	public String getPaymentstatus() {
		return paymentstatus.getValue();
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus.setValue(paymentstatus);
	}
}
