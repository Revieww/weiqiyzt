package com.weiwei.weiqi.response.property;

import java.sql.Timestamp;

import javax.persistence.Column;

public class LendlistResult {
	private Integer id;
	private Integer area;
	private Integer levels;
	private Integer askPrice;
	private String description;
	private Timestamp submitTime;
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getLevels() {
		return levels;
	}
	public void setLevels(Integer levels) {
		this.levels = levels;
	}
	public Integer getAskPrice() {
		return askPrice;
	}
	public void setAskPrice(Integer askPrice) {
		this.askPrice = askPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
