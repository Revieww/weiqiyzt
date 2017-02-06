package com.weiwei.weiqi.jdbc.dbmodel.property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "is_cancelled")
	private Boolean isCancelled;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="property_lend_id")
	private PropertyLend propertyLend;

	// Constructors

	/** default constructor */
	public PropertyFavoriteLend() {
	}



	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	
	public Boolean getIsCancelled() {
		return this.isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}



	public PropertyLend getPropertyLend() {
		return propertyLend;
	}



	public void setPropertyLend(PropertyLend propertyLend) {
		this.propertyLend = propertyLend;
	}
	
}