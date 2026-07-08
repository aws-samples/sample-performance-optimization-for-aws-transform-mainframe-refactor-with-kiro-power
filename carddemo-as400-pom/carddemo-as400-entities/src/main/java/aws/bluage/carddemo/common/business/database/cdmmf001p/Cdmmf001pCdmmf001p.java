// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database.cdmmf001p;

import aws.bluage.carddemo.common.business.database.AbstractJPAEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * JPA entity Cdmmf001pCdmmf001p 
 * @see AbstractJPAEntity
 * ***************************************************************
 *  File Name       : CDMMF001P (PF)    
 *  Author          : Subu              
 *  Date            : 02/11/2024        
 *  Description     : Multi Member Flat File
 * ***************************************************************
 */
@Entity
@Table(name="cdmmf001p")
public class Cdmmf001pCdmmf001p extends AbstractJPAEntity implements ICdmmf001pCdmmf001p {
	/**
	* fldmmf1
	* 'FIELD 1'
	*/
	@Column(name="fldmmf1",length=200)
	private String fldmmf1;


	/**
	* initialize all the fields' value
	*/
	public void initData(){
		this.fldmmf1 = "                                                                                                                                                                                                        ";
	}

	/**
	* return the fldmmf1.
	* @return the fldmmf1.
	*/
	public String getFldmmf1(){
		return fldmmf1;
	}
	
	/**
	* sets the value for fldmmf1.
	* @param value the new fldmmf1.
	*/
	public void setFldmmf1(String value){
		this.fldmmf1 = value;
	}
	
}