package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * PRINT_COST:打印费用表
 */
@Entity
@Table(name = "PRINT_COST")
public class PrintCost implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * PRINT_ID:
	 */
	private String printId;

	/**
	 * PROJECT_ID:
	 */
	private String projectId;

	/**
	 * PROJECT_DETAILS:
	 */
	private String projectDetails;

	/**
	 * COST_PRINT_DATE:
	 */
	private Date costPrintDate;

	/**
	 * PRINT_COUNT:
	 */
	private BigDecimal printCount;

	/**
	 * PRINT_PRICE:
	 */
	private BigDecimal printPrice;

	/**
	 * COPY_COUNT:
	 */
	private BigDecimal copyCount;

	/**
	 * COPY_PRICE:
	 */
	private BigDecimal copyPrice;

	/**
	 * COLOR_PRINT_COUNT:
	 */
	private BigDecimal colorPrintCount;

	/**
	 * COLOR_PRINT_PRICE:
	 */
	private BigDecimal colorPrintPrice;

	/**
	 * BIND_COUNT:
	 */
	private BigDecimal bindCount;

	/**
	 * BIND_PRICE:
	 */
	private BigDecimal bindPrice;

	/**
	 * TOTAL_PRICE:
	 */
	private BigDecimal totalPrice;

	/**
	 * REMARK:
	 */
	private String remark;

	public PrintCost() {
		super();
	}

	public PrintCost(String printId, String projectId, String projectDetails,
			Date costPrintDate, BigDecimal printCount, BigDecimal printPrice,
			BigDecimal copyCount, BigDecimal copyPrice,
			BigDecimal colorPrintCount, BigDecimal colorPrintPrice,
			BigDecimal bindCount, BigDecimal bindPrice, BigDecimal totalPrice,
			String remark) {
		super();
		this.printId = printId;
		this.projectId = projectId;
		this.projectDetails = projectDetails;
		this.costPrintDate = costPrintDate;
		this.printCount = printCount;
		this.printPrice = printPrice;
		this.copyCount = copyCount;
		this.copyPrice = copyPrice;
		this.colorPrintCount = colorPrintCount;
		this.colorPrintPrice = colorPrintPrice;
		this.bindCount = bindCount;
		this.bindPrice = bindPrice;
		this.totalPrice = totalPrice;
		this.remark = remark;
	}

	public void setPrintId(String printId) {
		this.printId = printId;
	}

	@Id
	@Column(name = "PRINT_ID", length = 50, nullable = false)
	public String getPrintId() {
		return printId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "PROJECT_ID", length = 100)
	public String getProjectId() {
		return projectId;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}

	@Column(name = "PROJECT_DETAILS", length = 64)
	public String getProjectDetails() {
		return projectDetails;
	}

	public void setCostPrintDate(Date costPrintDate) {
		this.costPrintDate = costPrintDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "COST_PRINT_DATE")
	public Date getCostPrintDate() {
		return costPrintDate;
	}

	public void setPrintCount(BigDecimal printCount) {
		this.printCount = printCount;
	}

	@Column(name = "PRINT_COUNT")
	public BigDecimal getPrintCount() {
		return printCount;
	}

	public void setPrintPrice(BigDecimal printPrice) {
		this.printPrice = printPrice;
	}

	@Column(name = "PRINT_PRICE")
	public BigDecimal getPrintPrice() {
		return printPrice;
	}

	public void setCopyCount(BigDecimal copyCount) {
		this.copyCount = copyCount;
	}

	@Column(name = "COPY_COUNT")
	public BigDecimal getCopyCount() {
		return copyCount;
	}

	public void setCopyPrice(BigDecimal copyPrice) {
		this.copyPrice = copyPrice;
	}

	@Column(name = "COPY_PRICE")
	public BigDecimal getCopyPrice() {
		return copyPrice;
	}

	public void setColorPrintCount(BigDecimal colorPrintCount) {
		this.colorPrintCount = colorPrintCount;
	}

	@Column(name = "COLOR_PRINT_COUNT")
	public BigDecimal getColorPrintCount() {
		return colorPrintCount;
	}

	public void setColorPrintPrice(BigDecimal colorPrintPrice) {
		this.colorPrintPrice = colorPrintPrice;
	}

	@Column(name = "COLOR_PRINT_PRICE")
	public BigDecimal getColorPrintPrice() {
		return colorPrintPrice;
	}

	public void setBindCount(BigDecimal bindCount) {
		this.bindCount = bindCount;
	}

	@Column(name = "BIND_COUNT")
	public BigDecimal getBindCount() {
		return bindCount;
	}

	public void setBindPrice(BigDecimal bindPrice) {
		this.bindPrice = bindPrice;
	}

	@Column(name = "BIND_PRICE")
	public BigDecimal getBindPrice() {
		return bindPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "TOTAL_PRICE")
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "REMARK", length = 1000)
	public String getRemark() {
		return remark;
	}

	public String toString() {
		return "PrintCost [printId=" + printId + ",projectId=" + projectId
				+ ",projectDetails=" + projectDetails + ",costPrintDate="
				+ costPrintDate + ",printCount=" + printCount + ",printPrice="
				+ printPrice + ",copyCount=" + copyCount + ",copyPrice="
				+ copyPrice + ",colorPrintCount=" + colorPrintCount
				+ ",colorPrintPrice=" + colorPrintPrice + ",bindCount="
				+ bindCount + ",bindPrice=" + bindPrice + ",totalPrice="
				+ totalPrice + ",remark=" + remark + "]";
	}

}
