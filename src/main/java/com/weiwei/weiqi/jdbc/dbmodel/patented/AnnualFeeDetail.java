package com.weiwei.weiqi.jdbc.dbmodel.patented;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AnnualFeeDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "annual_fee_detail", catalog = "dedecmsv57utf8sp1")
public class AnnualFeeDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer annualFeeMonitorId;
	private Timestamp annualFeePaidDate;
	private Integer annualFeePaidYearMonth;
	private Integer annualFeePaidYear;
	private Double annualFee;
	private Double serviceFee;
	private Boolean isTransferedToUs;
	private Timestamp transferedToUsDate;
	private Timestamp customerApplyDate;
	private Integer customerApplyYear;
	private Integer customerApplyYearMonth;
	private String comment;
	private String applicant;

	// Constructors

	/** default constructor */
	public AnnualFeeDetail() {
	}

	/** full constructor */
	public AnnualFeeDetail(Integer annualFeeMonitorId, Timestamp annualFeePaidDate, Integer annualFeePaidYearMonth, Integer annualFeePaidYear, Double annualFee, Double serviceFee,
			Boolean isTransferedToUs, Timestamp transferedToUsDate, Timestamp customerApplyDate, Integer customerApplyYear, Integer customerApplyYearMonth, String comment, String applicant) {
		this.annualFeeMonitorId = annualFeeMonitorId;
		this.annualFeePaidDate = annualFeePaidDate;
		this.annualFeePaidYearMonth = annualFeePaidYearMonth;
		this.annualFeePaidYear = annualFeePaidYear;
		this.annualFee = annualFee;
		this.serviceFee = serviceFee;
		this.isTransferedToUs = isTransferedToUs;
		this.transferedToUsDate = transferedToUsDate;
		this.customerApplyDate = customerApplyDate;
		this.customerApplyYear = customerApplyYear;
		this.customerApplyYearMonth = customerApplyYearMonth;
		this.comment = comment;
		this.applicant = applicant;
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

	@Column(name = "annual_fee_monitor_id")
	public Integer getAnnualFeeMonitorId() {
		return this.annualFeeMonitorId;
	}

	public void setAnnualFeeMonitorId(Integer annualFeeMonitorId) {
		this.annualFeeMonitorId = annualFeeMonitorId;
	}

	@Column(name = "annual_fee_paid_date", length = 0)
	public Timestamp getAnnualFeePaidDate() {
		return this.annualFeePaidDate;
	}

	public void setAnnualFeePaidDate(Timestamp annualFeePaidDate) {
		this.annualFeePaidDate = annualFeePaidDate;
	}

	@Column(name = "annual_fee_paid_year_month")
	public Integer getAnnualFeePaidYearMonth() {
		return this.annualFeePaidYearMonth;
	}

	public void setAnnualFeePaidYearMonth(Integer annualFeePaidYearMonth) {
		this.annualFeePaidYearMonth = annualFeePaidYearMonth;
	}

	@Column(name = "annual_fee_paid_year")
	public Integer getAnnualFeePaidYear() {
		return this.annualFeePaidYear;
	}

	public void setAnnualFeePaidYear(Integer annualFeePaidYear) {
		this.annualFeePaidYear = annualFeePaidYear;
	}

	@Column(name = "annual_fee", precision = 22, scale = 0)
	public Double getAnnualFee() {
		return this.annualFee;
	}

	public void setAnnualFee(Double annualFee) {
		this.annualFee = annualFee;
	}

	@Column(name = "service_fee", precision = 22, scale = 0)
	public Double getServiceFee() {
		return this.serviceFee;
	}

	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
	}

	@Column(name = "is_transfered_to_us")
	public Boolean getIsTransferedToUs() {
		return this.isTransferedToUs;
	}

	public void setIsTransferedToUs(Boolean isTransferedToUs) {
		this.isTransferedToUs = isTransferedToUs;
	}

	@Column(name = "transfered_to_us_date", length = 0)
	public Timestamp getTransferedToUsDate() {
		return this.transferedToUsDate;
	}

	public void setTransferedToUsDate(Timestamp transferedToUsDate) {
		this.transferedToUsDate = transferedToUsDate;
	}

	@Column(name = "customer_apply_date", length = 0)
	public Timestamp getCustomerApplyDate() {
		return this.customerApplyDate;
	}

	public void setCustomerApplyDate(Timestamp customerApplyDate) {
		this.customerApplyDate = customerApplyDate;
	}

	@Column(name = "customer_apply_year")
	public Integer getCustomerApplyYear() {
		return this.customerApplyYear;
	}

	public void setCustomerApplyYear(Integer customerApplyYear) {
		this.customerApplyYear = customerApplyYear;
	}

	@Column(name = "customer_apply_year_month")
	public Integer getCustomerApplyYearMonth() {
		return this.customerApplyYearMonth;
	}

	public void setCustomerApplyYearMonth(Integer customerApplyYearMonth) {
		this.customerApplyYearMonth = customerApplyYearMonth;
	}

	@Column(name = "comment", length = 500)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "applicant", length = 100)
	public String getApplicant() {
		return this.applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

}