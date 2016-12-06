package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * INFO_CONNECTION_BASIC:
 */
@Entity
@Table(name = "INFO_CONNECTION_BASIC")
public class InfoConnectionBasic implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 基本信息连接表主键:基本信息连接表主键
	 */
	private String icbid;

	/**
	 * 项目编号:项目编号
	 */
	private String projectid;

	/**
	 * 文件编号:文件编号
	 */
	private String filedid;

	/**
	 * 文件类型:文件类型
	 */
	private String doctype;

	/**
	 * 指令:指令
	 */
	private String instructions;

	public InfoConnectionBasic() {
		super();
	}

	public InfoConnectionBasic(String icbid, String projectid, String filedid,
			String doctype, String instructions) {
		super();
		this.icbid = icbid;
		this.projectid = projectid;
		this.filedid = filedid;
		this.doctype = doctype;
		this.instructions = instructions;
	}

	public void setIcbid(String icbid) {
		this.icbid = icbid;
	}

	@Id
	@Column(name = "ICBID", length = 100, nullable = false)
	public String getIcbid() {
		return icbid;
	}

	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

	@Column(name = "PROJECTID", length = 100, nullable = false)
	public String getProjectid() {
		return projectid;
	}

	public void setFiledid(String filedid) {
		this.filedid = filedid;
	}

	@Column(name = "FILEDID", length = 30)
	public String getFiledid() {
		return filedid;
	}

	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}

	@Column(name = "DOCTYPE", length = 50)
	public String getDoctype() {
		return doctype;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Column(name = "INSTRUCTIONS", length = 50)
	public String getInstructions() {
		return instructions;
	}

	public String toString() {
		return "InfoConnectionBasic [icbid=" + icbid + ",projectid="
				+ projectid + ",filedid=" + filedid + ",doctype=" + doctype
				+ ",instructions=" + instructions + "]";
	}

}
