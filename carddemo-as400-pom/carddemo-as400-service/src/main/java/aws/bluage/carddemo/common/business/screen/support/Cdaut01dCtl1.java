// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdaut01dCtl1.
 */
public class Cdaut01dCtl1 extends BaseScreenBean {

	public Cdaut01dCtl1() {
		super(new Cdaut01dSfl1(), "row", "col", "csrrec", "csrfld", "csrpos", "sflrrn");
		setDspMode("*DS4");
		
		addFKeys("03", "04", "05", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdaut01d-ctl1";
	}

	/**
	* return the row.
	* @return the row.
	*/
	public SimpleScreenField getRowField(){
		return getField("row");
	}

	/**
	* return the row value.
	* @return the row value.
	*/
	public Integer getRow(){
		return getField("row").getValue(Integer.class);
	}

	/**
	* sets the value for row.
	* @param value the new row.
	*/
	public void setRow(Integer value){
		getField("row").setValue(value);
	}
	/**
	* return the col.
	* @return the col.
	*/
	public SimpleScreenField getColField(){
		return getField("col");
	}

	/**
	* return the col value.
	* @return the col value.
	*/
	public Integer getCol(){
		return getField("col").getValue(Integer.class);
	}

	/**
	* sets the value for col.
	* @param value the new col.
	*/
	public void setCol(Integer value){
		getField("col").setValue(value);
	}
	/**
	* return the csrrec.
	* @return the csrrec.
	*/
	public SimpleScreenField getCsrrecField(){
		return getField("csrrec");
	}

	/**
	* return the csrrec value.
	* @return the csrrec value.
	*/
	public String getCsrrec(){
		return getField("csrrec").getValue(String.class);
	}

	/**
	* sets the value for csrrec.
	* @param value the new csrrec.
	*/
	public void setCsrrec(String value){
		getField("csrrec").setValue(value);
	}
	/**
	* return the csrfld.
	* @return the csrfld.
	*/
	public SimpleScreenField getCsrfldField(){
		return getField("csrfld");
	}

	/**
	* return the csrfld value.
	* @return the csrfld value.
	*/
	public String getCsrfld(){
		return getField("csrfld").getValue(String.class);
	}

	/**
	* sets the value for csrfld.
	* @param value the new csrfld.
	*/
	public void setCsrfld(String value){
		getField("csrfld").setValue(value);
	}
	/**
	* return the csrpos.
	* @return the csrpos.
	*/
	public SimpleScreenField getCsrposField(){
		return getField("csrpos");
	}

	/**
	* return the csrpos value.
	* @return the csrpos value.
	*/
	public Integer getCsrpos(){
		return getField("csrpos").getValue(Integer.class);
	}

	/**
	* sets the value for csrpos.
	* @param value the new csrpos.
	*/
	public void setCsrpos(Integer value){
		getField("csrpos").setValue(value);
	}
	/**
	* return the sflrrn.
	* @return the sflrrn.
	*/
	public SimpleScreenField getSflrrnField(){
		return getField("sflrrn");
	}

	/**
	* return the sflrrn value.
	* @return the sflrrn value.
	*/
	public Integer getSflrrn(){
		return getField("sflrrn").getValue(Integer.class);
	}

	/**
	* sets the value for sflrrn.
	* @param value the new sflrrn.
	*/
	public void setSflrrn(Integer value){
		getField("sflrrn").setValue(value);
	}
	/**
	* return the sfl1.
	* @return the sfl1.
	*/
	public ArrayScreenField getSfl1Field(){
		return getArrayScreenField("sfl1");
	}
}