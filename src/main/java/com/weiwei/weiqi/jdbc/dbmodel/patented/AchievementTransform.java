package com.weiwei.weiqi.jdbc.dbmodel.patented;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AchievementTransform entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "achievement_transform", catalog = "dedecmsv57utf8sp1")
public class AchievementTransform implements java.io.Serializable {

	// Fields

	private Integer id;
	private String patentId;
	private Integer customerId;
	private String title;
	private Timestamp applyDate;
	private String type;
	private Double price;
	private Integer transformStatus;
	private Boolean isDeleted;

	// Constructors

	/** default constructor */
	public AchievementTransform() {
	}

	/** full constructor */
	public AchievementTransform(String patentId, Integer customerId, String title, Timestamp applyDate, String type, Double price, Integer transformStatus, Boolean isDeleted) {
		this.patentId = patentId;
		this.customerId = customerId;
		this.title = title;
		this.applyDate = applyDate;
		this.type = type;
		this.price = price;
		this.transformStatus = transformStatus;
		this.isDeleted = isDeleted;
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

	@Column(name = "patent_id", length = 50)
	public String getPatentId() {
		return this.patentId;
	}

	public void setPatentId(String patentId) {
		this.patentId = patentId;
	}

	@Column(name = "customer_id")
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "title", length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "apply_date", length = 0)
	public Timestamp getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}

	@Column(name = "type", length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "price", precision = 22, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "transform_status")
	public Integer getTransformStatus() {
		return this.transformStatus;
	}

	public void setTransformStatus(Integer transformStatus) {
		this.transformStatus = transformStatus;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}