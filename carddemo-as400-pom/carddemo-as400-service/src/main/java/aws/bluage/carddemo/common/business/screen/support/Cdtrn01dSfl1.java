// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdtrn01dSfl1.
 */
public class Cdtrn01dSfl1 extends ArrayScreenField {

	public Cdtrn01dSfl1() {
		super("sfl1", "d1soption", "d1stranid", "d1sdate", "d1sdess", "d1samount", "d1sstatus");
		
		

	}

	public String getComponentId() {
		return "cdtrn01d-sfl1";
	}

	/**
	* return the d1soption.
	* @return the d1soption.
	*/
	public SimpleScreenField getD1soptionField(){
		return getField("d1soption");
	}

	/**
	* return the d1soption value.
	* @return the d1soption value.
	*/
	public String getD1soption(){
		return getField("d1soption").getValue(String.class);
	}

	/**
	* sets the value for d1soption.
	* @param value the new d1soption.
	*/
	public void setD1soption(String value){
		getField("d1soption").setValue(value);
	}
	/**
	* return the d1stranid.
	* @return the d1stranid.
	*/
	public SimpleScreenField getD1stranidField(){
		return getField("d1stranid");
	}

	/**
	* return the d1stranid value.
	* @return the d1stranid value.
	*/
	public String getD1stranid(){
		return getField("d1stranid").getValue(String.class);
	}

	/**
	* sets the value for d1stranid.
	* @param value the new d1stranid.
	*/
	public void setD1stranid(String value){
		getField("d1stranid").setValue(value);
	}
	/**
	* return the d1sdate.
	* @return the d1sdate.
	*/
	public SimpleScreenField getD1sdateField(){
		return getField("d1sdate");
	}

	/**
	* return the d1sdate value.
	* @return the d1sdate value.
	*/
	public Integer getD1sdate(){
		return getField("d1sdate").getValue(Integer.class);
	}

	/**
	* sets the value for d1sdate.
	* @param value the new d1sdate.
	*/
	public void setD1sdate(Integer value){
		getField("d1sdate").setValue(value);
	}
	/**
	* return the d1sdess.
	* @return the d1sdess.
	*/
	public SimpleScreenField getD1sdessField(){
		return getField("d1sdess");
	}

	/**
	* return the d1sdess value.
	* @return the d1sdess value.
	*/
	public String getD1sdess(){
		return getField("d1sdess").getValue(String.class);
	}

	/**
	* sets the value for d1sdess.
	* @param value the new d1sdess.
	*/
	public void setD1sdess(String value){
		getField("d1sdess").setValue(value);
	}
	/**
	* return the d1samount.
	* @return the d1samount.
	*/
	public SimpleScreenField getD1samountField(){
		return getField("d1samount");
	}

	/**
	* return the d1samount value.
	* @return the d1samount value.
	*/
	public String getD1samount(){
		return getField("d1samount").getValue(String.class);
	}

	/**
	* sets the value for d1samount.
	* @param value the new d1samount.
	*/
	public void setD1samount(String value){
		getField("d1samount").setValue(value);
	}
	/**
	* return the d1sstatus.
	* @return the d1sstatus.
	*/
	public SimpleScreenField getD1sstatusField(){
		return getField("d1sstatus");
	}

	/**
	* return the d1sstatus value.
	* @return the d1sstatus value.
	*/
	public String getD1sstatus(){
		return getField("d1sstatus").getValue(String.class);
	}

	/**
	* sets the value for d1sstatus.
	* @param value the new d1sstatus.
	*/
	public void setD1sstatus(String value){
		getField("d1sstatus").setValue(value);
	}
}