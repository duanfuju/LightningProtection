package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * RAY_EVALUATION_MEETING_RECORD:雷评技术会谈记录
 */
@Entity
@Table(name = "RAY_EVALUATION_MEETING_RECORD")
public class RayEvaluationMeetingRecord implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键id:主键id
	 */
	private String remrId;

	/**
	 * 项目ID外键:项目ID外键
	 */
	private String projectId;

	/**
	 * 项目投资:项目投资
	 */
	private String projectInvestment;

	/**
	 * 建筑面积:建筑面积
	 */
	private String constructionArea;

	/**
	 * 项目联系人:项目联系人
	 */
	private String projectContacts;

	/**
	 * 联系方式:联系方式
	 */
	private String contact;

	/**
	 * 会谈时间:会谈时间
	 */
	private Date meetingTime;

	/**
	 * 会谈地点:会谈地点
	 */
	private String venue;

	/**
	 * 项目所属行业:项目所属行业
	 */
	private String projectSector;

	/**
	 * 风险防控编号:风险防控编号
	 */
	private String rpacNumber;

	/**
	 * 主要内容:主要内容
	 */
	private String mainContent;

	/**
	 * 委托方参加人员:委托方参加人员
	 */
	private String participants;

	/**
	 * 初步意见:初步意见
	 */
	private String preliminaryOpinions;

	/**
	 * 经办人:经办人
	 */
	private String agent;

	/**
	 * 初步意见的日期:初步意见的日期
	 */
	private Date poDate;

	/**
	 * 审核意见:审核意见
	 */
	private String auditOpinion;

	/**
	 * 主任:主任
	 */
	private String director;

	/**
	 * 审核意见的日期:审核意见的日期
	 */
	private Date auditDate;

	/**
	 * 监督意见:监督意见
	 */
	private String supervisionAdvice;

	/**
	 * 廉政监督员:廉政监督员
	 */
	private String integritySupervisor;

	/**
	 * 监督意见日期:监督意见日期
	 */
	private Date saDate;

	public RayEvaluationMeetingRecord() {
		super();
	}

	public RayEvaluationMeetingRecord(String remrId, String projectId,
			String projectInvestment, String constructionArea,
			String projectContacts, String contact, Date meetingTime,
			String venue, String projectSector, String rpacNumber,
			String mainContent, String participants,
			String preliminaryOpinions, String agent, Date poDate,
			String auditOpinion, String director, Date auditDate,
			String supervisionAdvice, String integritySupervisor, Date saDate) {
		super();
		this.remrId = remrId;
		this.projectId = projectId;
		this.projectInvestment = projectInvestment;
		this.constructionArea = constructionArea;
		this.projectContacts = projectContacts;
		this.contact = contact;
		this.meetingTime = meetingTime;
		this.venue = venue;
		this.projectSector = projectSector;
		this.rpacNumber = rpacNumber;
		this.mainContent = mainContent;
		this.participants = participants;
		this.preliminaryOpinions = preliminaryOpinions;
		this.agent = agent;
		this.poDate = poDate;
		this.auditOpinion = auditOpinion;
		this.director = director;
		this.auditDate = auditDate;
		this.supervisionAdvice = supervisionAdvice;
		this.integritySupervisor = integritySupervisor;
		this.saDate = saDate;
	}

	public void setRemrId(String remrId) {
		this.remrId = remrId;
	}

	@Id
	@Column(name = "REMR_ID", length = 100, nullable = false)
	public String getRemrId() {
		return remrId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "PROJECT_ID", length = 100, nullable = false)
	public String getProjectId() {
		return projectId;
	}

	public void setProjectInvestment(String projectInvestment) {
		this.projectInvestment = projectInvestment;
	}

	@Column(name = "PROJECT_INVESTMENT", length = 100)
	public String getProjectInvestment() {
		return projectInvestment;
	}

	public void setConstructionArea(String constructionArea) {
		this.constructionArea = constructionArea;
	}

	@Column(name = "CONSTRUCTION_AREA", length = 100)
	public String getConstructionArea() {
		return constructionArea;
	}

	public void setProjectContacts(String projectContacts) {
		this.projectContacts = projectContacts;
	}

	@Column(name = "PROJECT_CONTACTS", length = 100)
	public String getProjectContacts() {
		return projectContacts;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "CONTACT", length = 100)
	public String getContact() {
		return contact;
	}

	public void setMeetingTime(Date meetingTime) {
		this.meetingTime = meetingTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MEETING_TIME")
	public Date getMeetingTime() {
		return meetingTime;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Column(name = "VENUE", length = 100)
	public String getVenue() {
		return venue;
	}

	public void setProjectSector(String projectSector) {
		this.projectSector = projectSector;
	}

	@Column(name = "PROJECT_SECTOR", length = 100)
	public String getProjectSector() {
		return projectSector;
	}

	public void setRpacNumber(String rpacNumber) {
		this.rpacNumber = rpacNumber;
	}

	@Column(name = "RPAC_NUMBER", length = 100)
	public String getRpacNumber() {
		return rpacNumber;
	}

	public void setMainContent(String mainContent) {
		this.mainContent = mainContent;
	}

	@Column(name = "MAIN_CONTENT", length = 100)
	public String getMainContent() {
		return mainContent;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}

	@Column(name = "PARTICIPANTS", length = 100)
	public String getParticipants() {
		return participants;
	}

	public void setPreliminaryOpinions(String preliminaryOpinions) {
		this.preliminaryOpinions = preliminaryOpinions;
	}

	@Column(name = "PRELIMINARY_OPINIONS", length = 100)
	public String getPreliminaryOpinions() {
		return preliminaryOpinions;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	@Column(name = "AGENT", length = 100)
	public String getAgent() {
		return agent;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PO_DATE")
	public Date getPoDate() {
		return poDate;
	}

	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion = auditOpinion;
	}

	@Column(name = "AUDIT_OPINION", length = 100)
	public String getAuditOpinion() {
		return auditOpinion;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Column(name = "DIRECTOR", length = 100)
	public String getDirector() {
		return director;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AUDIT_DATE")
	public Date getAuditDate() {
		return auditDate;
	}

	public void setSupervisionAdvice(String supervisionAdvice) {
		this.supervisionAdvice = supervisionAdvice;
	}

	@Column(name = "SUPERVISION_ADVICE", length = 100)
	public String getSupervisionAdvice() {
		return supervisionAdvice;
	}

	public void setIntegritySupervisor(String integritySupervisor) {
		this.integritySupervisor = integritySupervisor;
	}

	@Column(name = "INTEGRITY_SUPERVISOR", length = 100)
	public String getIntegritySupervisor() {
		return integritySupervisor;
	}

	public void setSaDate(Date saDate) {
		this.saDate = saDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SA_DATE")
	public Date getSaDate() {
		return saDate;
	}

	public String toString() {
		return "RayEvaluationMeetingRecord [remrId=" + remrId + ",projectId="
				+ projectId + ",projectInvestment=" + projectInvestment
				+ ",constructionArea=" + constructionArea + ",projectContacts="
				+ projectContacts + ",contact=" + contact + ",meetingTime="
				+ meetingTime + ",venue=" + venue + ",projectSector="
				+ projectSector + ",rpacNumber=" + rpacNumber + ",mainContent="
				+ mainContent + ",participants=" + participants
				+ ",preliminaryOpinions=" + preliminaryOpinions + ",agent="
				+ agent + ",poDate=" + poDate + ",auditOpinion=" + auditOpinion
				+ ",director=" + director + ",auditDate=" + auditDate
				+ ",supervisionAdvice=" + supervisionAdvice
				+ ",integritySupervisor=" + integritySupervisor + ",saDate="
				+ saDate + "]";
	}

}
