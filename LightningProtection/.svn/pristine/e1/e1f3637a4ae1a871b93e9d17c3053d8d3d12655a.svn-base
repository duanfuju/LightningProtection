package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * ARCHIVE_FIRST:资料归档一表
 */
@Entity
@Table(name = "ARCHIVE_FIRST")
public class ArchiveFirst implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 资料归档编号:资料归档编号
	 */
	private String afId;

	/**
	 * 项目ID外键:项目ID外键
	 */
	private String projectId;

	/**
	 * 建档日期:建档日期
	 */
	private Date documentDate;

	/**
	 * 防控编号:防控编号
	 */
	private String controlNumber;

	/**
	 * 项目名称:项目名称
	 */
	private String projectName;

	/**
	 * 分类编号:分类编号
	 */
	private String classificationNumber;

	/**
	 * 建设单位:建设单位
	 */
	private String constructionUnit;

	/**
	 * 合同洽谈人员:合同洽谈人员
	 */
	private String cnPersonnel;

	/**
	 * 报告编制人员:报告编制人员
	 */
	private String reportStaff;

	/**
	 * 报告校核人员:报告校核人员
	 */
	private String reportCheckPersonnel;

	public ArchiveFirst() {
		super();
	}

	public ArchiveFirst(String afId, String projectId, Date documentDate,
			String controlNumber, String projectName,
			String classificationNumber, String constructionUnit,
			String cnPersonnel, String reportStaff, String reportCheckPersonnel) {
		super();
		this.afId = afId;
		this.projectId = projectId;
		this.documentDate = documentDate;
		this.controlNumber = controlNumber;
		this.projectName = projectName;
		this.classificationNumber = classificationNumber;
		this.constructionUnit = constructionUnit;
		this.cnPersonnel = cnPersonnel;
		this.reportStaff = reportStaff;
		this.reportCheckPersonnel = reportCheckPersonnel;
	}

	public void setAfId(String afId) {
		this.afId = afId;
	}

	@Id
	@Column(name = "AF_ID", length = 50, nullable = false)
	public String getAfId() {
		return afId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "PROJECT_ID", length = 100, nullable = false)
	public String getProjectId() {
		return projectId;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DOCUMENT_DATE")
	public Date getDocumentDate() {
		return documentDate;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	@Column(name = "CONTROL_NUMBER", length = 50)
	public String getControlNumber() {
		return controlNumber;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Column(name = "PROJECT_NAME", length = 50)
	public String getProjectName() {
		return projectName;
	}

	public void setClassificationNumber(String classificationNumber) {
		this.classificationNumber = classificationNumber;
	}

	@Column(name = "CLASSIFICATION_NUMBER", length = 50)
	public String getClassificationNumber() {
		return classificationNumber;
	}

	public void setConstructionUnit(String constructionUnit) {
		this.constructionUnit = constructionUnit;
	}

	@Column(name = "CONSTRUCTION_UNIT", length = 50)
	public String getConstructionUnit() {
		return constructionUnit;
	}

	public void setCnPersonnel(String cnPersonnel) {
		this.cnPersonnel = cnPersonnel;
	}

	@Column(name = "CN_PERSONNEL", length = 50)
	public String getCnPersonnel() {
		return cnPersonnel;
	}

	public void setReportStaff(String reportStaff) {
		this.reportStaff = reportStaff;
	}

	@Column(name = "REPORT_STAFF", length = 50)
	public String getReportStaff() {
		return reportStaff;
	}

	public void setReportCheckPersonnel(String reportCheckPersonnel) {
		this.reportCheckPersonnel = reportCheckPersonnel;
	}

	@Column(name = "REPORT_CHECK_PERSONNEL", length = 50)
	public String getReportCheckPersonnel() {
		return reportCheckPersonnel;
	}

	public String toString() {
		return "ArchiveFirst [afId=" + afId + ",projectId=" + projectId
				+ ",documentDate=" + documentDate + ",controlNumber="
				+ controlNumber + ",projectName=" + projectName
				+ ",classificationNumber=" + classificationNumber
				+ ",constructionUnit=" + constructionUnit + ",cnPersonnel="
				+ cnPersonnel + ",reportStaff=" + reportStaff
				+ ",reportCheckPersonnel=" + reportCheckPersonnel + "]";
	}

}
