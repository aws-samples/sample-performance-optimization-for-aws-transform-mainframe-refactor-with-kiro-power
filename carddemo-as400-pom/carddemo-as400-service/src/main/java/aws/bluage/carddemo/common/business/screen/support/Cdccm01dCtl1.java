// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.screen.support;

import com.netfective.bluage.gapwalk.runtime.screen.*;

/**
 * Screen bean object Cdccm01dCtl1.
 */
public class Cdccm01dCtl1 extends BaseScreenBean {

	public Cdccm01dCtl1() {
		super(new Cdccm01dSfl1(), "row", "col", "sflrrn");
		setDspMode("*DS3");
		addAKeys("03");
		addFKeys("05", "06", "12", "PAGEDOWN", "PAGEUP");

	}

	public String getComponentId() {
		return "cdccm01d-ctl1";
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