package com.weiwei.weiqi.response.patented;

import java.sql.Timestamp;

public class AchievementTransformResult {
	private Integer id;
	private String patentId;
	private String title;
	private Timestamp applyDate;
	private String type;
	private Double price;
	private Integer transformStatus;
	private Boolean isDeleted;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPatentId() {
		return patentId;
	}
	public void setPatentId(String patentId) {
		this.patentId = patentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Timestamp getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getTransformStatus() {
		return transformStatus;
	}
	public void setTransformStatus(Integer transformStatus) {
		this.transformStatus = transformStatus;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
}
