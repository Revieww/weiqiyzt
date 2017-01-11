package com.weiwei.weiqi.jdbc.dbmodel.patented;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AnnualFeeMonitor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "annual_fee_monitor", catalog = "dedecmsv57utf8sp1")
public class AnnualFeeMonitor implements java.io.Serializable {

	// Fields

	private Integer id;
	private String patentId;
	private Integer customerId;
	private String title;
	private Timestamp addDate;
	private Timestamp applyDate;
	private Boolean isDeleted;
	private Timestamp deletedDate;
	private String applicant;
	private Double fee2;
	private Double fee3;
	private Double fee4;
	private Double fee5;
	private Double fee6;
	private Double fee7;
	private Double fee8;
	private Double fee9;
	private Double fee10;
	private Double fee11;
	private Double fee12;
	private Double fee13;
	private Double fee14;
	private Double fee15;
	private Double fee16;
	private Double fee17;
	private Double fee18;
	private Double fee19;
	private Double fee20;
	private Double fee21;
	private Double fee22;
	private Double fee23;
	private Double fee24;
	private Double fee25;
	private Double fee26;
	private Double fee27;
	private Double fee28;
	private Double fee29;
	private Double fee30;

	// Constructors

	/** default constructor */
	public AnnualFeeMonitor() {
	}

	/** full constructor */
	public AnnualFeeMonitor(String patentId, Integer customerId, String title, Timestamp addDate, Timestamp applyDate, Boolean isDeleted, Timestamp deletedDate, String applicant, Double fee2,
			Double fee3, Double fee4, Double fee5, Double fee6, Double fee7, Double fee8, Double fee9, Double fee10, Double fee11, Double fee12, Double fee13, Double fee14, Double fee15,
			Double fee16, Double fee17, Double fee18, Double fee19, Double fee20, Double fee21, Double fee22, Double fee23, Double fee24, Double fee25, Double fee26, Double fee27, Double fee28,
			Double fee29, Double fee30) {
		this.patentId = patentId;
		this.customerId = customerId;
		this.title = title;
		this.addDate = addDate;
		this.applyDate = applyDate;
		this.isDeleted = isDeleted;
		this.deletedDate = deletedDate;
		this.applicant = applicant;
		this.fee2 = fee2;
		this.fee3 = fee3;
		this.fee4 = fee4;
		this.fee5 = fee5;
		this.fee6 = fee6;
		this.fee7 = fee7;
		this.fee8 = fee8;
		this.fee9 = fee9;
		this.fee10 = fee10;
		this.fee11 = fee11;
		this.fee12 = fee12;
		this.fee13 = fee13;
		this.fee14 = fee14;
		this.fee15 = fee15;
		this.fee16 = fee16;
		this.fee17 = fee17;
		this.fee18 = fee18;
		this.fee19 = fee19;
		this.fee20 = fee20;
		this.fee21 = fee21;
		this.fee22 = fee22;
		this.fee23 = fee23;
		this.fee24 = fee24;
		this.fee25 = fee25;
		this.fee26 = fee26;
		this.fee27 = fee27;
		this.fee28 = fee28;
		this.fee29 = fee29;
		this.fee30 = fee30;
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

	@Column(name = "add_date", length = 0)
	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

	@Column(name = "apply_date", length = 0)
	public Timestamp getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "deleted_date", length = 0)
	public Timestamp getDeletedDate() {
		return this.deletedDate;
	}

	public void setDeletedDate(Timestamp deletedDate) {
		this.deletedDate = deletedDate;
	}

	@Column(name = "applicant", length = 100)
	public String getApplicant() {
		return this.applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	@Column(name = "Fee2", precision = 22, scale = 0)
	public Double getFee2() {
		return this.fee2;
	}

	public void setFee2(Double fee2) {
		this.fee2 = fee2;
	}

	@Column(name = "Fee3", precision = 22, scale = 0)
	public Double getFee3() {
		return this.fee3;
	}

	public void setFee3(Double fee3) {
		this.fee3 = fee3;
	}

	@Column(name = "Fee4", precision = 22, scale = 0)
	public Double getFee4() {
		return this.fee4;
	}

	public void setFee4(Double fee4) {
		this.fee4 = fee4;
	}

	@Column(name = "Fee5", precision = 22, scale = 0)
	public Double getFee5() {
		return this.fee5;
	}

	public void setFee5(Double fee5) {
		this.fee5 = fee5;
	}

	@Column(name = "Fee6", precision = 22, scale = 0)
	public Double getFee6() {
		return this.fee6;
	}

	public void setFee6(Double fee6) {
		this.fee6 = fee6;
	}

	@Column(name = "Fee7", precision = 22, scale = 0)
	public Double getFee7() {
		return this.fee7;
	}

	public void setFee7(Double fee7) {
		this.fee7 = fee7;
	}

	@Column(name = "Fee8", precision = 22, scale = 0)
	public Double getFee8() {
		return this.fee8;
	}

	public void setFee8(Double fee8) {
		this.fee8 = fee8;
	}

	@Column(name = "Fee9", precision = 22, scale = 0)
	public Double getFee9() {
		return this.fee9;
	}

	public void setFee9(Double fee9) {
		this.fee9 = fee9;
	}

	@Column(name = "Fee10", precision = 22, scale = 0)
	public Double getFee10() {
		return this.fee10;
	}

	public void setFee10(Double fee10) {
		this.fee10 = fee10;
	}

	@Column(name = "Fee11", precision = 22, scale = 0)
	public Double getFee11() {
		return this.fee11;
	}

	public void setFee11(Double fee11) {
		this.fee11 = fee11;
	}

	@Column(name = "Fee12", precision = 22, scale = 0)
	public Double getFee12() {
		return this.fee12;
	}

	public void setFee12(Double fee12) {
		this.fee12 = fee12;
	}

	@Column(name = "Fee13", precision = 22, scale = 0)
	public Double getFee13() {
		return this.fee13;
	}

	public void setFee13(Double fee13) {
		this.fee13 = fee13;
	}

	@Column(name = "Fee14", precision = 22, scale = 0)
	public Double getFee14() {
		return this.fee14;
	}

	public void setFee14(Double fee14) {
		this.fee14 = fee14;
	}

	@Column(name = "Fee15", precision = 22, scale = 0)
	public Double getFee15() {
		return this.fee15;
	}

	public void setFee15(Double fee15) {
		this.fee15 = fee15;
	}

	@Column(name = "Fee16", precision = 22, scale = 0)
	public Double getFee16() {
		return this.fee16;
	}

	public void setFee16(Double fee16) {
		this.fee16 = fee16;
	}

	@Column(name = "Fee17", precision = 22, scale = 0)
	public Double getFee17() {
		return this.fee17;
	}

	public void setFee17(Double fee17) {
		this.fee17 = fee17;
	}

	@Column(name = "Fee18", precision = 22, scale = 0)
	public Double getFee18() {
		return this.fee18;
	}

	public void setFee18(Double fee18) {
		this.fee18 = fee18;
	}

	@Column(name = "Fee19", precision = 22, scale = 0)
	public Double getFee19() {
		return this.fee19;
	}

	public void setFee19(Double fee19) {
		this.fee19 = fee19;
	}

	@Column(name = "Fee20", precision = 22, scale = 0)
	public Double getFee20() {
		return this.fee20;
	}

	public void setFee20(Double fee20) {
		this.fee20 = fee20;
	}

	@Column(name = "Fee21", precision = 22, scale = 0)
	public Double getFee21() {
		return this.fee21;
	}

	public void setFee21(Double fee21) {
		this.fee21 = fee21;
	}

	@Column(name = "Fee22", precision = 22, scale = 0)
	public Double getFee22() {
		return this.fee22;
	}

	public void setFee22(Double fee22) {
		this.fee22 = fee22;
	}

	@Column(name = "Fee23", precision = 22, scale = 0)
	public Double getFee23() {
		return this.fee23;
	}

	public void setFee23(Double fee23) {
		this.fee23 = fee23;
	}

	@Column(name = "Fee24", precision = 22, scale = 0)
	public Double getFee24() {
		return this.fee24;
	}

	public void setFee24(Double fee24) {
		this.fee24 = fee24;
	}

	@Column(name = "Fee25", precision = 22, scale = 0)
	public Double getFee25() {
		return this.fee25;
	}

	public void setFee25(Double fee25) {
		this.fee25 = fee25;
	}

	@Column(name = "Fee26", precision = 22, scale = 0)
	public Double getFee26() {
		return this.fee26;
	}

	public void setFee26(Double fee26) {
		this.fee26 = fee26;
	}

	@Column(name = "Fee27", precision = 22, scale = 0)
	public Double getFee27() {
		return this.fee27;
	}

	public void setFee27(Double fee27) {
		this.fee27 = fee27;
	}

	@Column(name = "Fee28", precision = 22, scale = 0)
	public Double getFee28() {
		return this.fee28;
	}

	public void setFee28(Double fee28) {
		this.fee28 = fee28;
	}

	@Column(name = "Fee29", precision = 22, scale = 0)
	public Double getFee29() {
		return this.fee29;
	}

	public void setFee29(Double fee29) {
		this.fee29 = fee29;
	}

	@Column(name = "Fee30", precision = 22, scale = 0)
	public Double getFee30() {
		return this.fee30;
	}

	public void setFee30(Double fee30) {
		this.fee30 = fee30;
	}

}