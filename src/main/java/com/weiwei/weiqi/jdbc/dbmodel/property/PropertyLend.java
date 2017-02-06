package com.weiwei.weiqi.jdbc.dbmodel.property;

import java.sql.Timestamp;

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
 * PropertyLend entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "property_lend", catalog = "dedecmsv57utf8sp1")
public class PropertyLend implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "region_id")
	private Integer regionId;
	
//	@Column(name = "category_id")
//	private Integer categoryId;
	
	@Column(name = "area")
	private Integer area;
	
	@Column(name = "levels")
	private Integer levels;
	
	@Column(name = "ask_price")
	private Integer askPrice;
	
	@Column(name = "description", length = 500)
	private String description;
	
	@Column(name = "submit_time", length = 0)
	private Timestamp submitTime;
	
	@Column(name = "customer_id")
	private Integer customerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="category_id")
	private PropertyCategory category;
	
	// Constructors

	/** default constructor */
	public PropertyLend() {
	}


	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public Integer getArea() {
		return this.area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	
	public Integer getLevels() {
		return this.levels;
	}

	public void setLevels(Integer levels) {
		this.levels = levels;
	}

	
	public Integer getAskPrice() {
		return this.askPrice;
	}

	public void setAskPrice(Integer askPrice) {
		this.askPrice = askPrice;
	}

	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public Timestamp getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

	
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public PropertyCategory getCategory() {
		return category;
	}


	public void setCategory(PropertyCategory category) {
		this.category = category;
	}
	
}