package com.weiwei.weiqi.request.property;

import java.sql.Timestamp;

public class LendSaveEnter {
	private int regionId;
	private int categoryId;
	private int area;
	private int levels;
	private int ask_price;
	private String description;
	private Timestamp submitTime;
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getLevels() {
		return levels;
	}
	public void setLevels(int levels) {
		this.levels = levels;
	}
	public int getAsk_price() {
		return ask_price;
	}
	public void setAsk_price(int ask_price) {
		this.ask_price = ask_price;
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
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
