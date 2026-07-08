// Generated with Blu Age version 5.7.1
package aws.bluage.carddemo.common.business.database;

import static jakarta.persistence.TemporalType.TIMESTAMP;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Abstract base JPA entity.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractJPAEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDENTIFIER")
	private Long identifier;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

	@CreatedDate
	@Temporal(TIMESTAMP)
	@Column(name="_CREATION_DATE",nullable=false)
	protected java.sql.Timestamp creationDate;

	/**
	 * Gets the creation date.
	 *
	 * @return the creation date
	 */
	public java.sql.Timestamp getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate
	 *            the new creation date
	 */
	public void setCreationDate(Date creationDate) {
		if (creationDate == null) {
			this.creationDate = null;
		} else if (creationDate instanceof java.sql.Timestamp) {
			this.creationDate = (java.sql.Timestamp) creationDate;
		} else {
			this.creationDate = new java.sql.Timestamp(creationDate.getTime());
		}
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate
	 *            the new creation date as Timestamp
	 */
	public void setCreationDate(java.sql.Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	@LastModifiedDate
	@Temporal(TIMESTAMP)
	@Column(name="_LASTUPDATE_TIMESTAMP", nullable=false)
	protected java.sql.Timestamp lastModifiedDate;

	/**
	 * Gets the last modified date.
	 *
	 * @return the last modified date
	 */
	public java.sql.Timestamp getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * Sets the last modified date.
	 *
	 * @param lastModifiedDate
	 *            the new last modified date
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {
		if (lastModifiedDate == null) {
			this.lastModifiedDate = null;
		} else if (lastModifiedDate instanceof java.sql.Timestamp) {
			this.lastModifiedDate = (java.sql.Timestamp) lastModifiedDate;
		} else {
			this.lastModifiedDate = new java.sql.Timestamp(lastModifiedDate.getTime());
		}
	}

	/**
	 * Sets the last modified date.
	 *
	 * @param lastModifiedDate
	 *            the new last modified date as Timestamp
	 */
	public void setLastModifiedDate(java.sql.Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
		/** The member. */
	protected String member;
	
	/**
	 * Gets the member.
	 *
	 * @return the member
	 */
	public String getMember() {
		return member;
	}
	
	/**
	 * Sets the member.
	 *
	 * @param member the new member
	 */
	public void setMember(String member) {
		this.member = member;
	}
	
	/** The src file. */
	protected String srcFile;
	
	/**
	 * Gets the src file.
	 *
	 * @return the src file
	 */
	public String getSrcFile() {
		return srcFile;
	}
	
	/**
	 * Sets the src file.
	 *
	 * @param srcFile the new src file
	 */
	public void setSrcFile(String srcFile) {
		this.srcFile = srcFile;
	}
}