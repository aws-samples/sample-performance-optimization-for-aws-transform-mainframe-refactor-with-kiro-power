// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdaut01dSfl1.
 */
public class Cdaut01dSfl1 extends ArrayScreenField {

	public Cdaut01dSfl1() {
		super("sfl1", "authid", "trnid", "cardnum", "rspreason", "fraudflag", "authdate", "authtime");
		
		addFKeys("03", "04", "05", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdaut01d-sfl1";
	}

	/**
	* return the authid.
	* @return the authid.
	*/
	public SimpleScreenField getAuthidField(){
		return getField("authid");
	}

	/**
	* return the authid value.
	* @return the authid value.
	*/
	public Long getAuthid(){
		return getField("authid").getValue(Long.class);
	}

	/**
	* sets the value for authid.
	* @param value the new authid.
	*/
	public void setAuthid(Long value){
		getField("authid").setValue(value);
	}
	/**
	* return the trnid.
	* @return the trnid.
	*/
	public SimpleScreenField getTrnidField(){
		return getField("trnid");
	}

	/**
	* return the trnid value.
	* @return the trnid value.
	*/
	public Long getTrnid(){
		return getField("trnid").getValue(Long.class);
	}

	/**
	* sets the value for trnid.
	* @param value the new trnid.
	*/
	public void setTrnid(Long value){
		getField("trnid").setValue(value);
	}
	/**
	* return the cardnum.
	* @return the cardnum.
	*/
	public SimpleScreenField getCardnumField(){
		return getField("cardnum");
	}

	/**
	* return the cardnum value.
	* @return the cardnum value.
	*/
	public Long getCardnum(){
		return getField("cardnum").getValue(Long.class);
	}

	/**
	* sets the value for cardnum.
	* @param value the new cardnum.
	*/
	public void setCardnum(Long value){
		getField("cardnum").setValue(value);
	}
	/**
	* return the rspreason.
	* @return the rspreason.
	*/
	public SimpleScreenField getRspreasonField(){
		return getField("rspreason");
	}

	/**
	* return the rspreason value.
	* @return the rspreason value.
	*/
	public String getRspreason(){
		return getField("rspreason").getValue(String.class);
	}

	/**
	* sets the value for rspreason.
	* @param value the new rspreason.
	*/
	public void setRspreason(String value){
		getField("rspreason").setValue(value);
	}
	/**
	* return the fraudflag.
	* @return the fraudflag.
	*/
	public SimpleScreenField getFraudflagField(){
		return getField("fraudflag");
	}

	/**
	* return the fraudflag value.
	* @return the fraudflag value.
	*/
	public String getFraudflag(){
		return getField("fraudflag").getValue(String.class);
	}

	/**
	* sets the value for fraudflag.
	* @param value the new fraudflag.
	*/
	public void setFraudflag(String value){
		getField("fraudflag").setValue(value);
	}
	/**
	* return the authdate.
	* @return the authdate.
	*/
	public SimpleScreenField getAuthdateField(){
		return getField("authdate");
	}

	/**
	* return the authdate value.
	* @return the authdate value.
	*/
	public String getAuthdate(){
		return getField("authdate").getValue(String.class);
	}

	/**
	* sets the value for authdate.
	* @param value the new authdate.
	*/
	public void setAuthdate(String value){
		getField("authdate").setValue(value);
	}
	/**
	* return the authtime.
	* @return the authtime.
	*/
	public SimpleScreenField getAuthtimeField(){
		return getField("authtime");
	}

	/**
	* return the authtime value.
	* @return the authtime value.
	*/
	public String getAuthtime(){
		return getField("authtime").getValue(String.class);
	}

	/**
	* sets the value for authtime.
	* @param value the new authtime.
	*/
	public void setAuthtime(String value){
		getField("authtime").setValue(value);
	}
}