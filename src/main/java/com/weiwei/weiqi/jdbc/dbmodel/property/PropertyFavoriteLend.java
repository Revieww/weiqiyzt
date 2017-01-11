package com.weiwei.weiqi.jdbc.dbmodel.property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PropertyFavoriteLend entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "property_favorite_lend", catalog = "dedecmsv57utf8sp1")
public class PropertyFavoriteLend implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer customerId;
	private Integer propertyLendId;
	private Boolean isCancelled;

	// Constructors

	/** default constructor */
	public PropertyFavoriteLend() {
	}

	/** full constructor */
	public PropertyFavoriteLend(Integer customerId, Integer propertyLendId, Boolean isCancelled) {
		this.customerId = customerId;
		this.propertyLendId = propertyLendId;
		this.isCancelled = isCancelled;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "customer_id")
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "property_lend_id")
	public Integer getPropertyLendId() {
		return this.propertyLendId;
	}

	public void setPropertyLendId(Integer propertyLendId) {
		this.propertyLendId = propertyLendId;
	}

	@Column(name = "is_cancelled")
	public Boolean getIsCancelled() {
		return this.isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

}