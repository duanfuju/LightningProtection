package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * DISCUSS_SITUATION:市场洽谈情况表
 */
@Entity
@Table(name = "DISCUSS_SITUATION")
public class DiscussSituation implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 情况ID主键:情况ID主键
	 */
	private String situationId;

	/**
	 * 项目ID:项目ID
	 */
	private String projectId;

	/**
	 * 合同签订日期:合同签订日期
	 */
	private Date contractSigningDate;

	/**
	 * 合同签订状况:合同签订状况
	 */
	private String contractSigningCondition;

	/**
	 * 合同洽谈日期:合同洽谈日期
	 */
	private Date contractDiscussDate;

	/**
	 * 天气情况:天气情况
	 */
	private String weatherCondition;

	/**
	 * 签订人员:签订人员
	 */
	private String signingPerson;

	/**
	 * 合同洽谈人员:合同洽谈人员
	 */
	private String marketDiscussPerson;

	/**
	 * 检测日期:检测日期
	 */
	private Date checkDate;

	/**
	 * 图纸资料状况:图纸资料状况
	 */
	private String drawingCondition;

	/**
	 * 项目所在地经度:项目所在地经度
	 */
	private BigDecimal projectLat;

	/**
	 * 项目所在地纬度:项目所在地纬度
	 */
	private BigDecimal projectLongitude;

	/**
	 * 报告状况:报告状况
	 */
	private String reportCondition;

	/**
	 * 会谈记录:会谈记录
	 */
	private String msessionRecord;

	/**
	 * 会谈备注:会谈备注
	 */
	private String msessionRemarks;

	/**
	 * 项目总投资:项目总投资
	 */
	private BigDecimal projectTotalInvestment;

	/**
	 * 项目建筑面积:项目建筑面积
	 */
	private BigDecimal projectConstructionArea;

	/**
	 * 项目是否减免:项目是否减免
	 */
	private String projectHasDiscount;

	/**
	 * 项目减免折扣:项目减免折扣
	 */
	private String projectDiscount;

	/**
	 * 项目减免原由:项目减免原由
	 */
	private String projectDiscountReason;

	/**
	 * 待评项目面积:待评项目面积
	 */
	private BigDecimal projectConstructionAreaEval;

	/**
	 * 项目全刊/补刊:项目全刊/补刊
	 */
	private String projectIssue;

	/**
	 * 扣除费用类型:扣除费用类型
	 */
	private String deductePriceType;

	/**
	 * 项目收费报价:项目收费报价
	 */
	private BigDecimal projectFeesQuotation;

	public DiscussSituation() {
		super();
	}

	public DiscussSituation(String situationId, String projectId,
			Date contractSigningDate, String contractSigningCondition,
			Date contractDiscussDate, String weatherCondition,
			String signingPerson, String marketDiscussPerson, Date checkDate,
			String drawingCondition, BigDecimal projectLat,
			BigDecimal projectLongitude, String reportCondition,
			String msessionRecord, String msessionRemarks,
			BigDecimal projectTotalInvestment,
			BigDecimal projectConstructionArea, String projectHasDiscount,
			String projectDiscount, String projectDiscountReason,
			BigDecimal projectConstructionAreaEval, String projectIssue,
			String deductePriceType, BigDecimal projectFeesQuotation) {
		super();
		this.situationId = situationId;
		this.projectId = projectId;
		this.contractSigningDate = contractSigningDate;
		this.contractSigningCondition = contractSigningCondition;
		this.contractDiscussDate = contractDiscussDate;
		this.weatherCondition = weatherCondition;
		this.signingPerson = signingPerson;
		this.marketDiscussPerson = marketDiscussPerson;
		this.checkDate = checkDate;
		this.drawingCondition = drawingCondition;
		this.projectLat = projectLat;
		this.projectLongitude = projectLongitude;
		this.reportCondition = reportCondition;
		this.msessionRecord = msessionRecord;
		this.msessionRemarks = msessionRemarks;
		this.projectTotalInvestment = projectTotalInvestment;
		this.projectConstructionArea = projectConstructionArea;
		this.projectHasDiscount = projectHasDiscount;
		this.projectDiscount = projectDiscount;
		this.projectDiscountReason = projectDiscountReason;
		this.projectConstructionAreaEval = projectConstructionAreaEval;
		this.projectIssue = projectIssue;
		this.deductePriceType = deductePriceType;
		this.projectFeesQuotation = projectFeesQuotation;
	}

	public void setSituationId(String situationId) {
		this.situationId = situationId;
	}

	@Id
	@Column(name = "SITUATION_ID", length = 100, nullable = false)
	public String getSituationId() {
		return situationId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "PROJECT_ID", length = 100, nullable = false)
	public String getProjectId() {
		return projectId;
	}

	public void setContractSigningDate(Date contractSigningDate) {
		this.contractSigningDate = contractSigningDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CONTRACT_SIGNING_DATE")
	public Date getContractSigningDate() {
		return contractSigningDate;
	}

	public void setContractSigningCondition(String contractSigningCondition) {
		this.contractSigningCondition = contractSigningCondition;
	}

	@Column(name = "CONTRACT_SIGNING_CONDITION", length = 100)
	public String getContractSigningCondition() {
		return contractSigningCondition;
	}

	public void setContractDiscussDate(Date contractDiscussDate) {
		this.contractDiscussDate = contractDiscussDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CONTRACT_DISCUSS_DATE")
	public Date getContractDiscussDate() {
		return contractDiscussDate;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	@Column(name = "WEATHER_CONDITION", length = 100)
	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setSigningPerson(String signingPerson) {
		this.signingPerson = signingPerson;
	}

	@Column(name = "SIGNING_PERSON", length = 100)
	public String getSigningPerson() {
		return signingPerson;
	}

	public void setMarketDiscussPerson(String marketDiscussPerson) {
		this.marketDiscussPerson = marketDiscussPerson;
	}

	@Column(name = "MARKET_DISCUSS_PERSON", length = 100)
	public String getMarketDiscussPerson() {
		return marketDiscussPerson;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CHECK_DATE")
	public Date getCheckDate() {
		return checkDate;
	}

	public void setDrawingCondition(String drawingCondition) {
		this.drawingCondition = drawingCondition;
	}

	@Column(name = "DRAWING_CONDITION", length = 100)
	public String getDrawingCondition() {
		return drawingCondition;
	}

	public void setProjectLat(BigDecimal projectLat) {
		this.projectLat = projectLat;
	}

	@Column(name = "PROJECT_LAT")
	public BigDecimal getProjectLat() {
		return projectLat;
	}

	public void setProjectLongitude(BigDecimal projectLongitude) {
		this.projectLongitude = projectLongitude;
	}

	@Column(name = "PROJECT_LONGITUDE")
	public BigDecimal getProjectLongitude() {
		return projectLongitude;
	}

	public void setReportCondition(String reportCondition) {
		this.reportCondition = reportCondition;
	}

	@Column(name = "REPORT_CONDITION", length = 100)
	public String getReportCondition() {
		return reportCondition;
	}

	public void setMsessionRecord(String msessionRecord) {
		this.msessionRecord = msessionRecord;
	}

	@Column(name = "MSESSION_RECORD", length = 1000)
	public String getMsessionRecord() {
		return msessionRecord;
	}

	public void setMsessionRemarks(String msessionRemarks) {
		this.msessionRemarks = msessionRemarks;
	}

	@Column(name = "MSESSION_REMARKS", length = 500)
	public String getMsessionRemarks() {
		return msessionRemarks;
	}

	public void setProjectTotalInvestment(BigDecimal projectTotalInvestment) {
		this.projectTotalInvestment = projectTotalInvestment;
	}

	@Column(name = "PROJECT_TOTAL_INVESTMENT")
	public BigDecimal getProjectTotalInvestment() {
		return projectTotalInvestment;
	}

	public void setProjectConstructionArea(BigDecimal projectConstructionArea) {
		this.projectConstructionArea = projectConstructionArea;
	}

	@Column(name = "PROJECT_CONSTRUCTION_AREA")
	public BigDecimal getProjectConstructionArea() {
		return projectConstructionArea;
	}

	public void setProjectHasDiscount(String projectHasDiscount) {
		this.projectHasDiscount = projectHasDiscount;
	}

	@Column(name = "PROJECT_HAS_DISCOUNT", length = 4)
	public String getProjectHasDiscount() {
		return projectHasDiscount;
	}

	public void setProjectDiscount(String projectDiscount) {
		this.projectDiscount = projectDiscount;
	}

	@Column(name = "PROJECT_DISCOUNT", length = 16)
	public String getProjectDiscount() {
		return projectDiscount;
	}

	public void setProjectDiscountReason(String projectDiscountReason) {
		this.projectDiscountReason = projectDiscountReason;
	}

	@Column(name = "PROJECT_DISCOUNT_REASON", length = 100)
	public String getProjectDiscountReason() {
		return projectDiscountReason;
	}

	public void setProjectConstructionAreaEval(
			BigDecimal projectConstructionAreaEval) {
		this.projectConstructionAreaEval = projectConstructionAreaEval;
	}

	@Column(name = "PROJECT_CONSTRUCTION_AREA_EVAL")
	public BigDecimal getProjectConstructionAreaEval() {
		return projectConstructionAreaEval;
	}

	public void setProjectIssue(String projectIssue) {
		this.projectIssue = projectIssue;
	}

	@Column(name = "PROJECT_ISSUE", length = 100)
	public String getProjectIssue() {
		return projectIssue;
	}

	public void setDeductePriceType(String deductePriceType) {
		this.deductePriceType = deductePriceType;
	}

	@Column(name = "DEDUCTE_PRICE_TYPE", length = 100)
	public String getDeductePriceType() {
		return deductePriceType;
	}

	public void setProjectFeesQuotation(BigDecimal projectFeesQuotation) {
		this.projectFeesQuotation = projectFeesQuotation;
	}

	@Column(name = "PROJECT_FEES_QUOTATION")
	public BigDecimal getProjectFeesQuotation() {
		return projectFeesQuotation;
	}

	public String toString() {
		return "DiscussSituation [situationId=" + situationId + ",projectId="
				+ projectId + ",contractSigningDate=" + contractSigningDate
				+ ",contractSigningCondition=" + contractSigningCondition
				+ ",contractDiscussDate=" + contractDiscussDate
				+ ",weatherCondition=" + weatherCondition + ",signingPerson="
				+ signingPerson + ",marketDiscussPerson=" + marketDiscussPerson
				+ ",checkDate=" + checkDate + ",drawingCondition="
				+ drawingCondition + ",projectLat=" + projectLat
				+ ",projectLongitude=" + projectLongitude + ",reportCondition="
				+ reportCondition + ",msessionRecord=" + msessionRecord
				+ ",msessionRemarks=" + msessionRemarks
				+ ",projectTotalInvestment=" + projectTotalInvestment
				+ ",projectConstructionArea=" + projectConstructionArea
				+ ",projectHasDiscount=" + projectHasDiscount
				+ ",projectDiscount=" + projectDiscount
				+ ",projectDiscountReason=" + projectDiscountReason
				+ ",projectConstructionAreaEval=" + projectConstructionAreaEval
				+ ",projectIssue=" + projectIssue + ",deductePriceType="
				+ deductePriceType + ",projectFeesQuotation="
				+ projectFeesQuotation + "]";
	}

}
