package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * DATA_STATISTICS:数据统计表
 */
@Entity
@Table(name = "DATA_STATISTICS")
public class DataStatistics implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * DS_ID:
	 */
	private String dsId;

	/**
	 * 起始日期:起始日期
	 */
	private Date startDate;

	/**
	 * 地区:地区
	 */
	private String region;

	/**
	 * 终止日期:终止日期
	 */
	private Date endDate;

	/**
	 * 按费用到账方式:按费用到账方式
	 */
	private String costArriveWay;

	/**
	 * 按报告编制人员:按报告编制人员
	 */
	private String reportWitePerson;

	/**
	 * 按报告校核人员:按报告校核人员
	 */
	private String reportCheckPersonnel;

	/**
	 * 按协议签订人员:按协议签订人员
	 */
	private String signingPerson;

	/**
	 * 按项目减免与否:按项目减免与否
	 */
	private String projectHasDiscount;

	/**
	 * 按地勘报告有无:按地勘报告有无
	 */
	private String gerHave;

	/**
	 * 按所属行业:按所属行业
	 */
	private String projectIndustry;

	/**
	 * 按行业备注:按行业备注
	 */
	private String projectIndustryRemark;

	public DataStatistics() {
		super();
	}

	public DataStatistics(String dsId, Date startDate, String region,
			Date endDate, String costArriveWay, String reportWitePerson,
			String reportCheckPersonnel, String signingPerson,
			String projectHasDiscount, String gerHave, String projectIndustry,
			String projectIndustryRemark) {
		super();
		this.dsId = dsId;
		this.startDate = startDate;
		this.region = region;
		this.endDate = endDate;
		this.costArriveWay = costArriveWay;
		this.reportWitePerson = reportWitePerson;
		this.reportCheckPersonnel = reportCheckPersonnel;
		this.signingPerson = signingPerson;
		this.projectHasDiscount = projectHasDiscount;
		this.gerHave = gerHave;
		this.projectIndustry = projectIndustry;
		this.projectIndustryRemark = projectIndustryRemark;
	}

	public void setDsId(String dsId) {
		this.dsId = dsId;
	}

	@Id
	@Column(name = "DS_ID", length = 50, nullable = false)
	public String getDsId() {
		return dsId;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE")
	public Date getStartDate() {
		return startDate;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Column(name = "REGION", length = 50)
	public String getRegion() {
		return region;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE")
	public Date getEndDate() {
		return endDate;
	}

	public void setCostArriveWay(String costArriveWay) {
		this.costArriveWay = costArriveWay;
	}

	@Column(name = "COST_ARRIVE_WAY", length = 50)
	public String getCostArriveWay() {
		return costArriveWay;
	}

	public void setReportWitePerson(String reportWitePerson) {
		this.reportWitePerson = reportWitePerson;
	}

	@Column(name = "REPORT_WITE_PERSON", length = 50)
	public String getReportWitePerson() {
		return reportWitePerson;
	}

	public void setReportCheckPersonnel(String reportCheckPersonnel) {
		this.reportCheckPersonnel = reportCheckPersonnel;
	}

	@Column(name = "REPORT_CHECK_PERSONNEL", length = 50)
	public String getReportCheckPersonnel() {
		return reportCheckPersonnel;
	}

	public void setSigningPerson(String signingPerson) {
		this.signingPerson = signingPerson;
	}

	@Column(name = "SIGNING_PERSON", length = 50)
	public String getSigningPerson() {
		return signingPerson;
	}

	public void setProjectHasDiscount(String projectHasDiscount) {
		this.projectHasDiscount = projectHasDiscount;
	}

	@Column(name = "PROJECT_HAS_DISCOUNT", length = 50)
	public String getProjectHasDiscount() {
		return projectHasDiscount;
	}

	public void setGerHave(String gerHave) {
		this.gerHave = gerHave;
	}

	@Column(name = "GER_HAVE", length = 50)
	public String getGerHave() {
		return gerHave;
	}

	public void setProjectIndustry(String projectIndustry) {
		this.projectIndustry = projectIndustry;
	}

	@Column(name = "PROJECT_INDUSTRY", length = 50)
	public String getProjectIndustry() {
		return projectIndustry;
	}

	public void setProjectIndustryRemark(String projectIndustryRemark) {
		this.projectIndustryRemark = projectIndustryRemark;
	}

	@Column(name = "PROJECT_INDUSTRY_REMARK", length = 50)
	public String getProjectIndustryRemark() {
		return projectIndustryRemark;
	}

	public String toString() {
		return "DataStatistics [dsId=" + dsId + ",startDate=" + startDate
				+ ",region=" + region + ",endDate=" + endDate
				+ ",costArriveWay=" + costArriveWay + ",reportWitePerson="
				+ reportWitePerson + ",reportCheckPersonnel="
				+ reportCheckPersonnel + ",signingPerson=" + signingPerson
				+ ",projectHasDiscount=" + projectHasDiscount + ",gerHave="
				+ gerHave + ",projectIndustry=" + projectIndustry
				+ ",projectIndustryRemark=" + projectIndustryRemark + "]";
	}

}
