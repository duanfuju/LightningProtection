package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * PROJECT_CONCLUSION:项目总结
 */
@Entity
@Table(name = "PROJECT_CONCLUSION")
public class ProjectConclusion implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	private String pcId;

	/**
	 * 项目ID:项目ID
	 */
	private String projectId;

	/**
	 * 报告打印与否:报告打印与否
	 */
	private String reportPrint;

	/**
	 * 项目收费状态:项目收费状态
	 */
	private String projectStateCharge;

	/**
	 * 图纸齐全与否:图纸齐全与否
	 */
	private String drawingsHas;

	/**
	 * 报告领取与否:报告领取与否
	 */
	private String reportReceive;

	/**
	 * 项目状态:项目状态
	 */
	private String projectStatus;

	public ProjectConclusion() {
		super();
	}

	public ProjectConclusion(String pcId, String projectId, String reportPrint,
			String projectStateCharge, String drawingsHas,
			String reportReceive, String projectStatus) {
		super();
		this.pcId = pcId;
		this.projectId = projectId;
		this.reportPrint = reportPrint;
		this.projectStateCharge = projectStateCharge;
		this.drawingsHas = drawingsHas;
		this.reportReceive = reportReceive;
		this.projectStatus = projectStatus;
	}

	public void setPcId(String pcId) {
		this.pcId = pcId;
	}

	@Id
	@Column(name = "PC_ID", length = 100, nullable = false)
	public String getPcId() {
		return pcId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "PROJECT_ID", length = 100)
	public String getProjectId() {
		return projectId;
	}

	public void setReportPrint(String reportPrint) {
		this.reportPrint = reportPrint;
	}

	@Column(name = "REPORT_PRINT", length = 100)
	public String getReportPrint() {
		return reportPrint;
	}

	public void setProjectStateCharge(String projectStateCharge) {
		this.projectStateCharge = projectStateCharge;
	}

	@Column(name = "PROJECT_STATE_CHARGE", length = 100)
	public String getProjectStateCharge() {
		return projectStateCharge;
	}

	public void setDrawingsHas(String drawingsHas) {
		this.drawingsHas = drawingsHas;
	}

	@Column(name = "DRAWINGS_HAS", length = 100)
	public String getDrawingsHas() {
		return drawingsHas;
	}

	public void setReportReceive(String reportReceive) {
		this.reportReceive = reportReceive;
	}

	@Column(name = "REPORT_RECEIVE", length = 100)
	public String getReportReceive() {
		return reportReceive;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	@Column(name = "PROJECT_STATUS", length = 100)
	public String getProjectStatus() {
		return projectStatus;
	}

	public String toString() {
		return "ProjectConclusion [pcId=" + pcId + ",projectId=" + projectId
				+ ",reportPrint=" + reportPrint + ",projectStateCharge="
				+ projectStateCharge + ",drawingsHas=" + drawingsHas
				+ ",reportReceive=" + reportReceive + ",projectStatus="
				+ projectStatus + "]";
	}

}
