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
 * PropertyFavoriteSell entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "property_favorite_sell", catalog = "dedecmsv57utf8sp1")
public class PropertyFavoriteSell implements java.io.Serializable {

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
	@JoinColumn(name = "property_sell_id")
	private PropertySell propertySell;

	// Constructors

	/** default constructor */
	public PropertyFavoriteSell() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public PropertySell getPropertySell() {
		return propertySell;
	}

	public void setPropertySell(PropertySell propertySell) {
		this.propertySell = propertySell;
	}

	
	

}