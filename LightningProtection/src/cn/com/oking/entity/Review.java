package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * REVIEW:雷电灾害风险评估送达回执（回访表） 
 */
@Entity
@Table(name = "REVIEW")
public class Review implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	private String reviewId;

	/**
	 * 项目ID外键:项目ID外键
	 */
	private String projectId;

	/**
	 * 会谈地点:会谈地点
	 */
	private String venue;

	/**
	 * 经办人:经办人
	 */
	private String agent;

	/**
	 * 发票是否收到:发票是否收到
	 */
	private String invoice;

	/**
	 * 报告是否收到:报告是否收到
	 */
	private String report;

	/**
	 * 服务是否满意:服务是否满意
	 */
	private String service;

	/**
	 * 吃拿卡要现象:吃拿卡要现象
	 */
	private String eatWithCard;

	/**
	 * 付款情况说明:付款情况说明
	 */
	private String informationPayment;

	/**
	 * 签收人:签收人
	 */
	private String signForPeople;

	/**
	 * 签收日期:签收日期
	 */
	private Date receiptDate;

	/**
	 * 联系方式:联系方式
	 */
	private String contact;

	/**
	 * 回访时间:回访时间
	 */
	private Date visitDate;

	/**
	 * 回访纪检人员:回访纪检人员
	 */
	private String returnPeople;

	/**
	 * 回访记录:回访记录
	 */
	private String returnRecord;

	public Review() {
		super();
	}

	public Review(String reviewId, String projectId, String venue,
			String agent, String invoice, String report, String service,
			String eatWithCard, String informationPayment,
			String signForPeople, Date receiptDate, String contact,
			Date visitDate, String returnPeople, String returnRecord) {
		super();
		this.reviewId = reviewId;
		this.projectId = projectId;
		this.venue = venue;
		this.agent = agent;
		this.invoice = invoice;
		this.report = report;
		this.service = service;
		this.eatWithCard = eatWithCard;
		this.informationPayment = informationPayment;
		this.signForPeople = signForPeople;
		this.receiptDate = receiptDate;
		this.contact = contact;
		this.visitDate = visitDate;
		this.returnPeople = returnPeople;
		this.returnRecord = returnRecord;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	@Id
	@Column(name = "REVIEW_ID", length = 100, nullable = false)
	public String getReviewId() {
		return reviewId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "PROJECT_ID", length = 100, nullable = false)
	public String getProjectId() {
		return projectId;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Column(name = "VENUE", length = 100)
	public String getVenue() {
		return venue;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	@Column(name = "AGENT", length = 100)
	public String getAgent() {
		return agent;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	@Column(name = "INVOICE", length = 100)
	public String getInvoice() {
		return invoice;
	}

	public void setReport(String report) {
		this.report = report;
	}

	@Column(name = "REPORT", length = 100)
	public String getReport() {
		return report;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Column(name = "SERVICE", length = 100)
	public String getService() {
		return service;
	}

	public void setEatWithCard(String eatWithCard) {
		this.eatWithCard = eatWithCard;
	}

	@Column(name = "EAT_WITH_CARD", length = 100)
	public String getEatWithCard() {
		return eatWithCard;
	}

	public void setInformationPayment(String informationPayment) {
		this.informationPayment = informationPayment;
	}

	@Column(name = "INFORMATION_PAYMENT", length = 100)
	public String getInformationPayment() {
		return informationPayment;
	}

	public void setSignForPeople(String signForPeople) {
		this.signForPeople = signForPeople;
	}

	@Column(name = "SIGN_FOR_PEOPLE", length = 100)
	public String getSignForPeople() {
		return signForPeople;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RECEIPT_DATE")
	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "CONTACT", length = 100)
	public String getContact() {
		return contact;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VISIT_DATE")
	public Date getVisitDate() {
		return visitDate;
	}

	public void setReturnPeople(String returnPeople) {
		this.returnPeople = returnPeople;
	}

	@Column(name = "RETURN_PEOPLE", length = 100)
	public String getReturnPeople() {
		return returnPeople;
	}

	public void setReturnRecord(String returnRecord) {
		this.returnRecord = returnRecord;
	}

	@Column(name = "RETURN_RECORD", length = 1000)
	public String getReturnRecord() {
		return returnRecord;
	}

	public String toString() {
		return "Review [reviewId=" + reviewId + ",projectId=" + projectId
				+ ",venue=" + venue + ",agent=" + agent + ",invoice=" + invoice
				+ ",report=" + report + ",service=" + service + ",eatWithCard="
				+ eatWithCard + ",informationPayment=" + informationPayment
				+ ",signForPeople=" + signForPeople + ",receiptDate="
				+ receiptDate + ",contact=" + contact + ",visitDate="
				+ visitDate + ",returnPeople=" + returnPeople
				+ ",returnRecord=" + returnRecord + "]";
	}

}
