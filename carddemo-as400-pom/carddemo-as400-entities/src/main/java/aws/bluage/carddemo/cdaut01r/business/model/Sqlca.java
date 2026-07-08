package aws.bluage.carddemo.cdaut01r.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryIntegerType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity Sqlca.
 * 
 * <p>About 'sqlcaid' field, <br>
 * </p>
 * 
 * <p>About 'sqlaid' field, <br>
 * </p>
 * 
 * <p>About 'sqlcabc' field, <br>
 * </p>
 * 
 * <p>About 'sqlabc' field, <br>
 * </p>
 * 
 * <p>About 'sqlcode' field, <br>
 * </p>
 * 
 * <p>About 'sqlcod' field, <br>
 * </p>
 * 
 * <p>About 'sqlerrml' field, <br>
 * </p>
 * 
 * <p>About 'sqlerl' field, <br>
 * </p>
 * 
 * <p>About 'sqlerrmc' field, <br>
 * </p>
 * 
 * <p>About 'sqlerm' field, <br>
 * </p>
 * 
 * <p>About 'sqlerrp' field, <br>
 * </p>
 * 
 * <p>About 'sqlerp' field, <br>
 * </p>
 * 
 * <p>About 'sqlerr' field, <br>
 * </p>
 * 
 * <p>About 'sqler1' field, <br>
 * </p>
 * 
 * <p>About 'sqler2' field, <br>
 * </p>
 * 
 * <p>About 'sqler3' field, <br>
 * </p>
 * 
 * <p>About 'sqler4' field, <br>
 * </p>
 * 
 * <p>About 'sqler5' field, <br>
 * </p>
 * 
 * <p>About 'sqler6' field, <br>
 * </p>
 * 
 * <p>About 'sqlerrd' field, <br>
 * </p>
 * 
 * <p>About 'sqlwrn' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn0' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn1' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn2' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn3' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn4' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn5' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn6' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn7' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn8' field, <br>
 * </p>
 * 
 * <p>About 'sqlwn9' field, <br>
 * </p>
 * 
 * <p>About 'sqlwna' field, <br>
 * </p>
 * 
 * <p>About 'sqlwarn' field, <br>
 * </p>
 * 
 * <p>About 'sqlstate' field, <br>
 * </p>
 * 
 * <p>About 'sqlstt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Sqlca extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	private final Elementary sqlcaid = new Elementary(union,new AlphanumericType(8),"X'0000000000000000'");
	private final Elementary sqlaid = new Elementary(union,new AlphanumericType(8));
	private final Union union1 = new Union(root);
	private final Elementary sqlcabc = new Elementary(union1,new BinaryIntegerType(4, true));
	private final Elementary sqlabc = new Elementary(union1,new BinaryType(9, 0, "STD", true));
	private final Union union2 = new Union(root);
	private final Elementary sqlcode = new Elementary(union2,new BinaryIntegerType(4, true));
	private final Elementary sqlcod = new Elementary(union2,new BinaryType(9, 0, "STD", true));
	private final Union union3 = new Union(root);
	private final Elementary sqlerrml = new Elementary(union3,new BinaryIntegerType(2, true));
	private final Elementary sqlerl = new Elementary(union3,new BinaryType(4, 0, "STD", true));
	private final Union union4 = new Union(root);
	private final Elementary sqlerrmc = new Elementary(union4,new AlphanumericType(70));
	private final Elementary sqlerm = new Elementary(union4,new AlphanumericType(70));
	private final Union union5 = new Union(root);
	private final Elementary sqlerrp = new Elementary(union5,new AlphanumericType(8));
	private final Elementary sqlerp = new Elementary(union5,new AlphanumericType(8));
	private final Union union6 = new Union(root);
	private final Elementary sqlerr = new Elementary(union6,new AlphanumericType(24));
	private final Group group = new Group(union6);
	private final Elementary sqler1 = new Elementary(group,new BinaryType(9, 0, "STD", true));
	private final Elementary sqler2 = new Elementary(group,new BinaryType(9, 0, "STD", true));
	private final Elementary sqler3 = new Elementary(group,new BinaryType(9, 0, "STD", true));
	private final Elementary sqler4 = new Elementary(group,new BinaryType(9, 0, "STD", true));
	private final Elementary sqler5 = new Elementary(group,new BinaryType(9, 0, "STD", true));
	private final Elementary sqler6 = new Elementary(group,new BinaryType(9, 0, "STD", true));
	private final Elementary sqlerrd = new Elementary(union6,new FixedArray(6),new BinaryIntegerType(4, true));
	private final Union union7 = new Union(root);
	private final Elementary sqlwrn = new Elementary(union7,new AlphanumericType(11));
	private final Group group1 = new Group(union7);
	private final Elementary sqlwn0 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn1 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn2 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn3 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn4 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn5 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn6 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn7 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn8 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwn9 = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwna = new Elementary(group1,new AlphanumericType(1));
	private final Elementary sqlwarn = new Elementary(union7,new FixedArray(11),new AlphanumericType(1));
	private final Union union8 = new Union(root);
	private final Elementary sqlstate = new Elementary(union8,new AlphanumericType(5));
	private final Elementary sqlstt = new Elementary(union8,new AlphanumericType(5));
	
	/**
	 * Instantiate a new Sqlca with a default record.
	 * @param configuration the configuration
	 */
	public Sqlca(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}

	/**
	 * Instantiate a new Sqlca bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Sqlca(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute sqlcaid.
	 * @return the sqlcaid attribute reference
	 */
	public ElementaryRangeReference getSqlcaidReference() {
		return sqlcaid.getReference();
	}

	/**
	 * Getter for sqlcaid attribute.
	 * @return sqlcaid attribute
	 */
	public String getSqlcaid() {
		return sqlcaid.getValue();
	}

	/**
	 * Setter for sqlcaid attribute.
	 * @param sqlcaid the new value of sqlcaid
	 */
	public void setSqlcaid(String sqlcaid) {
		this.sqlcaid.setValue(sqlcaid);
	}
	/**
	 * Gets the reference for attribute sqlaid.
	 * @return the sqlaid attribute reference
	 */
	public ElementaryRangeReference getSqlaidReference() {
		return sqlaid.getReference();
	}

	/**
	 * Getter for sqlaid attribute.
	 * @return sqlaid attribute
	 */
	public String getSqlaid() {
		return sqlaid.getValue();
	}

	/**
	 * Setter for sqlaid attribute.
	 * @param sqlaid the new value of sqlaid
	 */
	public void setSqlaid(String sqlaid) {
		this.sqlaid.setValue(sqlaid);
	}
	/**
	 * Gets the reference for attribute sqlcabc.
	 * @return the sqlcabc attribute reference
	 */
	public ElementaryRangeReference getSqlcabcReference() {
		return sqlcabc.getReference();
	}

	/**
	 * Getter for sqlcabc attribute.
	 * @return sqlcabc attribute
	 */
	public int getSqlcabc() {
		return sqlcabc.getValue();
	}

	/**
	 * Setter for sqlcabc attribute.
	 * @param sqlcabc the new value of sqlcabc
	 */
	public void setSqlcabc(int sqlcabc) {
		this.sqlcabc.setValue(sqlcabc);
	}
	/**
	 * Gets the reference for attribute sqlabc.
	 * @return the sqlabc attribute reference
	 */
	public ElementaryRangeReference getSqlabcReference() {
		return sqlabc.getReference();
	}

	/**
	 * Getter for sqlabc attribute.
	 * @return sqlabc attribute
	 */
	public int getSqlabc() {
		return sqlabc.getValue();
	}

	/**
	 * Setter for sqlabc attribute.
	 * @param sqlabc the new value of sqlabc
	 */
	public void setSqlabc(int sqlabc) {
		this.sqlabc.setValue(sqlabc);
	}
	/**
	 * Gets the reference for attribute sqlcode.
	 * @return the sqlcode attribute reference
	 */
	public ElementaryRangeReference getSqlcodeReference() {
		return sqlcode.getReference();
	}

	/**
	 * Getter for sqlcode attribute.
	 * @return sqlcode attribute
	 */
	public int getSqlcode() {
		return sqlcode.getValue();
	}

	/**
	 * Setter for sqlcode attribute.
	 * @param sqlcode the new value of sqlcode
	 */
	public void setSqlcode(int sqlcode) {
		this.sqlcode.setValue(sqlcode);
	}
	/**
	 * Gets the reference for attribute sqlcod.
	 * @return the sqlcod attribute reference
	 */
	public ElementaryRangeReference getSqlcodReference() {
		return sqlcod.getReference();
	}

	/**
	 * Getter for sqlcod attribute.
	 * @return sqlcod attribute
	 */
	public int getSqlcod() {
		return sqlcod.getValue();
	}

	/**
	 * Setter for sqlcod attribute.
	 * @param sqlcod the new value of sqlcod
	 */
	public void setSqlcod(int sqlcod) {
		this.sqlcod.setValue(sqlcod);
	}
	/**
	 * Gets the reference for attribute sqlerrml.
	 * @return the sqlerrml attribute reference
	 */
	public ElementaryRangeReference getSqlerrmlReference() {
		return sqlerrml.getReference();
	}

	/**
	 * Getter for sqlerrml attribute.
	 * @return sqlerrml attribute
	 */
	public short getSqlerrml() {
		return sqlerrml.getValue();
	}

	/**
	 * Setter for sqlerrml attribute.
	 * @param sqlerrml the new value of sqlerrml
	 */
	public void setSqlerrml(short sqlerrml) {
		this.sqlerrml.setValue(sqlerrml);
	}
	/**
	 * Gets the reference for attribute sqlerl.
	 * @return the sqlerl attribute reference
	 */
	public ElementaryRangeReference getSqlerlReference() {
		return sqlerl.getReference();
	}

	/**
	 * Getter for sqlerl attribute.
	 * @return sqlerl attribute
	 */
	public int getSqlerl() {
		return sqlerl.getValue();
	}

	/**
	 * Setter for sqlerl attribute.
	 * @param sqlerl the new value of sqlerl
	 */
	public void setSqlerl(int sqlerl) {
		this.sqlerl.setValue(sqlerl);
	}
	/**
	 * Gets the reference for attribute sqlerrmc.
	 * @return the sqlerrmc attribute reference
	 */
	public ElementaryRangeReference getSqlerrmcReference() {
		return sqlerrmc.getReference();
	}

	/**
	 * Getter for sqlerrmc attribute.
	 * @return sqlerrmc attribute
	 */
	public String getSqlerrmc() {
		return sqlerrmc.getValue();
	}

	/**
	 * Setter for sqlerrmc attribute.
	 * @param sqlerrmc the new value of sqlerrmc
	 */
	public void setSqlerrmc(String sqlerrmc) {
		this.sqlerrmc.setValue(sqlerrmc);
	}
	/**
	 * Gets the reference for attribute sqlerm.
	 * @return the sqlerm attribute reference
	 */
	public ElementaryRangeReference getSqlermReference() {
		return sqlerm.getReference();
	}

	/**
	 * Getter for sqlerm attribute.
	 * @return sqlerm attribute
	 */
	public String getSqlerm() {
		return sqlerm.getValue();
	}

	/**
	 * Setter for sqlerm attribute.
	 * @param sqlerm the new value of sqlerm
	 */
	public void setSqlerm(String sqlerm) {
		this.sqlerm.setValue(sqlerm);
	}
	/**
	 * Gets the reference for attribute sqlerrp.
	 * @return the sqlerrp attribute reference
	 */
	public ElementaryRangeReference getSqlerrpReference() {
		return sqlerrp.getReference();
	}

	/**
	 * Getter for sqlerrp attribute.
	 * @return sqlerrp attribute
	 */
	public String getSqlerrp() {
		return sqlerrp.getValue();
	}

	/**
	 * Setter for sqlerrp attribute.
	 * @param sqlerrp the new value of sqlerrp
	 */
	public void setSqlerrp(String sqlerrp) {
		this.sqlerrp.setValue(sqlerrp);
	}
	/**
	 * Gets the reference for attribute sqlerp.
	 * @return the sqlerp attribute reference
	 */
	public ElementaryRangeReference getSqlerpReference() {
		return sqlerp.getReference();
	}

	/**
	 * Getter for sqlerp attribute.
	 * @return sqlerp attribute
	 */
	public String getSqlerp() {
		return sqlerp.getValue();
	}

	/**
	 * Setter for sqlerp attribute.
	 * @param sqlerp the new value of sqlerp
	 */
	public void setSqlerp(String sqlerp) {
		this.sqlerp.setValue(sqlerp);
	}
	/**
	 * Gets the reference for attribute sqlerr.
	 * @return the sqlerr attribute reference
	 */
	public ElementaryRangeReference getSqlerrReference() {
		return sqlerr.getReference();
	}

	/**
	 * Getter for sqlerr attribute.
	 * @return sqlerr attribute
	 */
	public String getSqlerr() {
		return sqlerr.getValue();
	}

	/**
	 * Setter for sqlerr attribute.
	 * @param sqlerr the new value of sqlerr
	 */
	public void setSqlerr(String sqlerr) {
		this.sqlerr.setValue(sqlerr);
	}
	/**
	 * Gets the reference for attribute sqler1.
	 * @return the sqler1 attribute reference
	 */
	public ElementaryRangeReference getSqler1Reference() {
		return sqler1.getReference();
	}

	/**
	 * Getter for sqler1 attribute.
	 * @return sqler1 attribute
	 */
	public int getSqler1() {
		return sqler1.getValue();
	}

	/**
	 * Setter for sqler1 attribute.
	 * @param sqler1 the new value of sqler1
	 */
	public void setSqler1(int sqler1) {
		this.sqler1.setValue(sqler1);
	}
	/**
	 * Gets the reference for attribute sqler2.
	 * @return the sqler2 attribute reference
	 */
	public ElementaryRangeReference getSqler2Reference() {
		return sqler2.getReference();
	}

	/**
	 * Getter for sqler2 attribute.
	 * @return sqler2 attribute
	 */
	public int getSqler2() {
		return sqler2.getValue();
	}

	/**
	 * Setter for sqler2 attribute.
	 * @param sqler2 the new value of sqler2
	 */
	public void setSqler2(int sqler2) {
		this.sqler2.setValue(sqler2);
	}
	/**
	 * Gets the reference for attribute sqler3.
	 * @return the sqler3 attribute reference
	 */
	public ElementaryRangeReference getSqler3Reference() {
		return sqler3.getReference();
	}

	/**
	 * Getter for sqler3 attribute.
	 * @return sqler3 attribute
	 */
	public int getSqler3() {
		return sqler3.getValue();
	}

	/**
	 * Setter for sqler3 attribute.
	 * @param sqler3 the new value of sqler3
	 */
	public void setSqler3(int sqler3) {
		this.sqler3.setValue(sqler3);
	}
	/**
	 * Gets the reference for attribute sqler4.
	 * @return the sqler4 attribute reference
	 */
	public ElementaryRangeReference getSqler4Reference() {
		return sqler4.getReference();
	}

	/**
	 * Getter for sqler4 attribute.
	 * @return sqler4 attribute
	 */
	public int getSqler4() {
		return sqler4.getValue();
	}

	/**
	 * Setter for sqler4 attribute.
	 * @param sqler4 the new value of sqler4
	 */
	public void setSqler4(int sqler4) {
		this.sqler4.setValue(sqler4);
	}
	/**
	 * Gets the reference for attribute sqler5.
	 * @return the sqler5 attribute reference
	 */
	public ElementaryRangeReference getSqler5Reference() {
		return sqler5.getReference();
	}

	/**
	 * Getter for sqler5 attribute.
	 * @return sqler5 attribute
	 */
	public int getSqler5() {
		return sqler5.getValue();
	}

	/**
	 * Setter for sqler5 attribute.
	 * @param sqler5 the new value of sqler5
	 */
	public void setSqler5(int sqler5) {
		this.sqler5.setValue(sqler5);
	}
	/**
	 * Gets the reference for attribute sqler6.
	 * @return the sqler6 attribute reference
	 */
	public ElementaryRangeReference getSqler6Reference() {
		return sqler6.getReference();
	}

	/**
	 * Getter for sqler6 attribute.
	 * @return sqler6 attribute
	 */
	public int getSqler6() {
		return sqler6.getValue();
	}

	/**
	 * Setter for sqler6 attribute.
	 * @param sqler6 the new value of sqler6
	 */
	public void setSqler6(int sqler6) {
		this.sqler6.setValue(sqler6);
	}
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public ElementaryRangeReference getItemFromSqlerrdReference(Integer... indexes) {
		return sqlerrd.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public int getItemFromSqlerrd(Integer... indexes) {
		return sqlerrd.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for sqlerrd attribute.
	 * @param sqlerrd the new value of sqlerrd for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSqlerrd(int sqlerrd,Integer... indexes) {
		this.sqlerrd.setIndexedValue(sqlerrd,indexes);
	}
	
	/**
	 * Collection size getter for sqlerrd attribute.
	 * @return  the collection size for attributesqlerrd
	 */
	public int getSqlerrdSize(){
		return sqlerrd.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public ElementaryRangeReference getSqlerrdReference() {
		return sqlerrd.getReference();
	}
	
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public int getSqlerrd() {
		return sqlerrd.getValue();
	}
	
	/**
	 * Indexed setter for sqlerrd attribute.
	 * @param sqlerrd the new value of sqlerrd for given indexes
	 * @param indexes the indexes
	 */
	public void setSqlerrd(int sqlerrd) {
		this.sqlerrd.setValue(sqlerrd);
	}
	
	/**
	 * Gets the reference for attribute sqlwrn.
	 * @return the sqlwrn attribute reference
	 */
	public ElementaryRangeReference getSqlwrnReference() {
		return sqlwrn.getReference();
	}

	/**
	 * Getter for sqlwrn attribute.
	 * @return sqlwrn attribute
	 */
	public String getSqlwrn() {
		return sqlwrn.getValue();
	}

	/**
	 * Setter for sqlwrn attribute.
	 * @param sqlwrn the new value of sqlwrn
	 */
	public void setSqlwrn(String sqlwrn) {
		this.sqlwrn.setValue(sqlwrn);
	}
	/**
	 * Gets the reference for attribute sqlwn0.
	 * @return the sqlwn0 attribute reference
	 */
	public ElementaryRangeReference getSqlwn0Reference() {
		return sqlwn0.getReference();
	}

	/**
	 * Getter for sqlwn0 attribute.
	 * @return sqlwn0 attribute
	 */
	public String getSqlwn0() {
		return sqlwn0.getValue();
	}

	/**
	 * Setter for sqlwn0 attribute.
	 * @param sqlwn0 the new value of sqlwn0
	 */
	public void setSqlwn0(String sqlwn0) {
		this.sqlwn0.setValue(sqlwn0);
	}
	/**
	 * Gets the reference for attribute sqlwn1.
	 * @return the sqlwn1 attribute reference
	 */
	public ElementaryRangeReference getSqlwn1Reference() {
		return sqlwn1.getReference();
	}

	/**
	 * Getter for sqlwn1 attribute.
	 * @return sqlwn1 attribute
	 */
	public String getSqlwn1() {
		return sqlwn1.getValue();
	}

	/**
	 * Setter for sqlwn1 attribute.
	 * @param sqlwn1 the new value of sqlwn1
	 */
	public void setSqlwn1(String sqlwn1) {
		this.sqlwn1.setValue(sqlwn1);
	}
	/**
	 * Gets the reference for attribute sqlwn2.
	 * @return the sqlwn2 attribute reference
	 */
	public ElementaryRangeReference getSqlwn2Reference() {
		return sqlwn2.getReference();
	}

	/**
	 * Getter for sqlwn2 attribute.
	 * @return sqlwn2 attribute
	 */
	public String getSqlwn2() {
		return sqlwn2.getValue();
	}

	/**
	 * Setter for sqlwn2 attribute.
	 * @param sqlwn2 the new value of sqlwn2
	 */
	public void setSqlwn2(String sqlwn2) {
		this.sqlwn2.setValue(sqlwn2);
	}
	/**
	 * Gets the reference for attribute sqlwn3.
	 * @return the sqlwn3 attribute reference
	 */
	public ElementaryRangeReference getSqlwn3Reference() {
		return sqlwn3.getReference();
	}

	/**
	 * Getter for sqlwn3 attribute.
	 * @return sqlwn3 attribute
	 */
	public String getSqlwn3() {
		return sqlwn3.getValue();
	}

	/**
	 * Setter for sqlwn3 attribute.
	 * @param sqlwn3 the new value of sqlwn3
	 */
	public void setSqlwn3(String sqlwn3) {
		this.sqlwn3.setValue(sqlwn3);
	}
	/**
	 * Gets the reference for attribute sqlwn4.
	 * @return the sqlwn4 attribute reference
	 */
	public ElementaryRangeReference getSqlwn4Reference() {
		return sqlwn4.getReference();
	}

	/**
	 * Getter for sqlwn4 attribute.
	 * @return sqlwn4 attribute
	 */
	public String getSqlwn4() {
		return sqlwn4.getValue();
	}

	/**
	 * Setter for sqlwn4 attribute.
	 * @param sqlwn4 the new value of sqlwn4
	 */
	public void setSqlwn4(String sqlwn4) {
		this.sqlwn4.setValue(sqlwn4);
	}
	/**
	 * Gets the reference for attribute sqlwn5.
	 * @return the sqlwn5 attribute reference
	 */
	public ElementaryRangeReference getSqlwn5Reference() {
		return sqlwn5.getReference();
	}

	/**
	 * Getter for sqlwn5 attribute.
	 * @return sqlwn5 attribute
	 */
	public String getSqlwn5() {
		return sqlwn5.getValue();
	}

	/**
	 * Setter for sqlwn5 attribute.
	 * @param sqlwn5 the new value of sqlwn5
	 */
	public void setSqlwn5(String sqlwn5) {
		this.sqlwn5.setValue(sqlwn5);
	}
	/**
	 * Gets the reference for attribute sqlwn6.
	 * @return the sqlwn6 attribute reference
	 */
	public ElementaryRangeReference getSqlwn6Reference() {
		return sqlwn6.getReference();
	}

	/**
	 * Getter for sqlwn6 attribute.
	 * @return sqlwn6 attribute
	 */
	public String getSqlwn6() {
		return sqlwn6.getValue();
	}

	/**
	 * Setter for sqlwn6 attribute.
	 * @param sqlwn6 the new value of sqlwn6
	 */
	public void setSqlwn6(String sqlwn6) {
		this.sqlwn6.setValue(sqlwn6);
	}
	/**
	 * Gets the reference for attribute sqlwn7.
	 * @return the sqlwn7 attribute reference
	 */
	public ElementaryRangeReference getSqlwn7Reference() {
		return sqlwn7.getReference();
	}

	/**
	 * Getter for sqlwn7 attribute.
	 * @return sqlwn7 attribute
	 */
	public String getSqlwn7() {
		return sqlwn7.getValue();
	}

	/**
	 * Setter for sqlwn7 attribute.
	 * @param sqlwn7 the new value of sqlwn7
	 */
	public void setSqlwn7(String sqlwn7) {
		this.sqlwn7.setValue(sqlwn7);
	}
	/**
	 * Gets the reference for attribute sqlwn8.
	 * @return the sqlwn8 attribute reference
	 */
	public ElementaryRangeReference getSqlwn8Reference() {
		return sqlwn8.getReference();
	}

	/**
	 * Getter for sqlwn8 attribute.
	 * @return sqlwn8 attribute
	 */
	public String getSqlwn8() {
		return sqlwn8.getValue();
	}

	/**
	 * Setter for sqlwn8 attribute.
	 * @param sqlwn8 the new value of sqlwn8
	 */
	public void setSqlwn8(String sqlwn8) {
		this.sqlwn8.setValue(sqlwn8);
	}
	/**
	 * Gets the reference for attribute sqlwn9.
	 * @return the sqlwn9 attribute reference
	 */
	public ElementaryRangeReference getSqlwn9Reference() {
		return sqlwn9.getReference();
	}

	/**
	 * Getter for sqlwn9 attribute.
	 * @return sqlwn9 attribute
	 */
	public String getSqlwn9() {
		return sqlwn9.getValue();
	}

	/**
	 * Setter for sqlwn9 attribute.
	 * @param sqlwn9 the new value of sqlwn9
	 */
	public void setSqlwn9(String sqlwn9) {
		this.sqlwn9.setValue(sqlwn9);
	}
	/**
	 * Gets the reference for attribute sqlwna.
	 * @return the sqlwna attribute reference
	 */
	public ElementaryRangeReference getSqlwnaReference() {
		return sqlwna.getReference();
	}

	/**
	 * Getter for sqlwna attribute.
	 * @return sqlwna attribute
	 */
	public String getSqlwna() {
		return sqlwna.getValue();
	}

	/**
	 * Setter for sqlwna attribute.
	 * @param sqlwna the new value of sqlwna
	 */
	public void setSqlwna(String sqlwna) {
		this.sqlwna.setValue(sqlwna);
	}
	/**
	 * Indexed getter for sqlwarn attribute.
	 * @param indexes the indexes
	 * @return sqlwarn attribute
	 */
	public ElementaryRangeReference getItemFromSqlwarnReference(Integer... indexes) {
		return sqlwarn.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for sqlwarn attribute.
	 * @param indexes the indexes
	 * @return sqlwarn attribute
	 */
	public String getItemFromSqlwarn(Integer... indexes) {
		return sqlwarn.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for sqlwarn attribute.
	 * @param sqlwarn the new value of sqlwarn for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSqlwarn(String sqlwarn,Integer... indexes) {
		this.sqlwarn.setIndexedValue(sqlwarn,indexes);
	}
	
	/**
	 * Collection size getter for sqlwarn attribute.
	 * @return  the collection size for attributesqlwarn
	 */
	public int getSqlwarnSize(){
		return sqlwarn.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for sqlwarn attribute.
	 * @param indexes the indexes
	 * @return sqlwarn attribute
	 */
	public ElementaryRangeReference getSqlwarnReference() {
		return sqlwarn.getReference();
	}
	
	/**
	 * Indexed getter for sqlwarn attribute.
	 * @param indexes the indexes
	 * @return sqlwarn attribute
	 */
	public String getSqlwarn() {
		return sqlwarn.getValue();
	}
	
	/**
	 * Indexed setter for sqlwarn attribute.
	 * @param sqlwarn the new value of sqlwarn for given indexes
	 * @param indexes the indexes
	 */
	public void setSqlwarn(String sqlwarn) {
		this.sqlwarn.setValue(sqlwarn);
	}
	
	/**
	 * Gets the reference for attribute sqlstate.
	 * @return the sqlstate attribute reference
	 */
	public ElementaryRangeReference getSqlstateReference() {
		return sqlstate.getReference();
	}

	/**
	 * Getter for sqlstate attribute.
	 * @return sqlstate attribute
	 */
	public String getSqlstate() {
		return sqlstate.getValue();
	}

	/**
	 * Setter for sqlstate attribute.
	 * @param sqlstate the new value of sqlstate
	 */
	public void setSqlstate(String sqlstate) {
		this.sqlstate.setValue(sqlstate);
	}
	/**
	 * Gets the reference for attribute sqlstt.
	 * @return the sqlstt attribute reference
	 */
	public ElementaryRangeReference getSqlsttReference() {
		return sqlstt.getReference();
	}

	/**
	 * Getter for sqlstt attribute.
	 * @return sqlstt attribute
	 */
	public String getSqlstt() {
		return sqlstt.getValue();
	}

	/**
	 * Setter for sqlstt attribute.
	 * @param sqlstt the new value of sqlstt
	 */
	public void setSqlstt(String sqlstt) {
		this.sqlstt.setValue(sqlstt);
	}
}
