package com.weiwei.weiqi.jdbc.dbmodel.property;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PropertySell entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "property_sell", catalog = "dedecmsv57utf8sp1")
public class PropertySell implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer regionId;
	private Integer categoryId;
	private Integer area;
	private Integer levels;
	private Integer askPrice;
	private String description;
	private Timestamp submitTime;
	private Integer customerId;

	// Constructors

	/** default constructor */
	public PropertySell() {
	}

	/** full constructor */
	public PropertySell(Integer regionId, Integer categoryId, Integer area, Integer levels, Integer askPrice, String description, Timestamp submitTime, Integer customerId) {
		this.regionId = regionId;
		this.categoryId = categoryId;
		this.area = area;
		this.levels = levels;
		this.askPrice = askPrice;
		this.description = description;
		this.submitTime = submitTime;
		this.customerId = customerId;
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

	@Column(name = "region_id")
	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	@Column(name = "category_id")
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "area")
	public Integer getArea() {
		return this.area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	@Column(name = "levels")
	public Integer getLevels() {
		return this.levels;
	}

	public void setLevels(Integer levels) {
		this.levels = levels;
	}

	@Column(name = "ask_price")
	public Integer getAskPrice() {
		return this.askPrice;
	}

	public void setAskPrice(Integer askPrice) {
		this.askPrice = askPrice;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "submit_time", length = 0)
	public Timestamp getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

	@Column(name = "customer_id")
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

}