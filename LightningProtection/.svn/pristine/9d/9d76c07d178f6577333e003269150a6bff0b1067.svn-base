package cn.com.oking.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * TECHNICAL_PARAMS:技术参数录入表
 */
@Entity
@Table(name = "TECHNICAL_PARAMS")
public class TechnicalParams implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 技术参数ID主键:技术参数ID主键
	 */
	private String technicalParamsId;

	/**
	 * 项目ID:项目ID
	 */
	private String projectId;

	/**
	 * 防雷类别:防雷类别
	 */
	private String lightProtectCategory;

	/**
	 * 地闪密度:地闪密度
	 */
	private String groundFlashDensity;

	/**
	 * 建筑高度:建筑高度
	 */
	private String buildingHeight;

	/**
	 * 最大雷电流:最大雷电流
	 */
	private String maxLightCurrent;

	/**
	 * 平均雷电流:平均雷电流
	 */
	private String avgLightCurrent;

	/**
	 * 电子防护等级:电子防护等级
	 */
	private String eveProtectLevel;

	/**
	 * 防火措施因子:防火措施因子
	 */
	private String fireProtectFactor;

	/**
	 * 评估分区:评估分区
	 */
	private String evaluatePartition;

	/**
	 * 雷电风险值:雷电风险值
	 */
	private String lightRiskValue;

	/**
	 * 有无整改意见:有无整改意见
	 */
	private String hasRectification;

	/**
	 * 备注:备注
	 */
	private String tremarks;

	/**
	 * 电阻率:电阻率
	 */
	private String resistivity;

	/**
	 * 建筑物位置因子:建筑物位置因子
	 */
	private String jzwwzFactor;

	/**
	 * 环境因子:环境因子
	 */
	private String hjFactor;

	/**
	 * 火灾危险:火灾危险
	 */
	private String fireDanger;

	public TechnicalParams() {
		super();
	}

	public TechnicalParams(String technicalParamsId, String projectId,
			String lightProtectCategory, String groundFlashDensity,
			String buildingHeight, String maxLightCurrent,
			String avgLightCurrent, String eveProtectLevel,
			String fireProtectFactor, String evaluatePartition,
			String lightRiskValue, String hasRectification, String tremarks,
			String resistivity, String jzwwzFactor, String hjFactor,
			String fireDanger) {
		super();
		this.technicalParamsId = technicalParamsId;
		this.projectId = projectId;
		this.lightProtectCategory = lightProtectCategory;
		this.groundFlashDensity = groundFlashDensity;
		this.buildingHeight = buildingHeight;
		this.maxLightCurrent = maxLightCurrent;
		this.avgLightCurrent = avgLightCurrent;
		this.eveProtectLevel = eveProtectLevel;
		this.fireProtectFactor = fireProtectFactor;
		this.evaluatePartition = evaluatePartition;
		this.lightRiskValue = lightRiskValue;
		this.hasRectification = hasRectification;
		this.tremarks = tremarks;
		this.resistivity = resistivity;
		this.jzwwzFactor = jzwwzFactor;
		this.hjFactor = hjFactor;
		this.fireDanger = fireDanger;
	}

	public void setTechnicalParamsId(String technicalParamsId) {
		this.technicalParamsId = technicalParamsId;
	}

	@Id
	@Column(name = "TECHNICAL_PARAMS_ID", length = 100, nullable = false)
	public String getTechnicalParamsId() {
		return technicalParamsId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "PROJECT_ID", length = 100, nullable = false)
	public String getProjectId() {
		return projectId;
	}

	public void setLightProtectCategory(String lightProtectCategory) {
		this.lightProtectCategory = lightProtectCategory;
	}

	@Column(name = "LIGHT_PROTECT_CATEGORY", length = 100)
	public String getLightProtectCategory() {
		return lightProtectCategory;
	}

	public void setGroundFlashDensity(String groundFlashDensity) {
		this.groundFlashDensity = groundFlashDensity;
	}

	@Column(name = "GROUND_FLASH_DENSITY", length = 100)
	public String getGroundFlashDensity() {
		return groundFlashDensity;
	}

	public void setBuildingHeight(String buildingHeight) {
		this.buildingHeight = buildingHeight;
	}

	@Column(name = "BUILDING_HEIGHT", length = 100)
	public String getBuildingHeight() {
		return buildingHeight;
	}

	public void setMaxLightCurrent(String maxLightCurrent) {
		this.maxLightCurrent = maxLightCurrent;
	}

	@Column(name = "MAX_LIGHT_CURRENT", length = 100)
	public String getMaxLightCurrent() {
		return maxLightCurrent;
	}

	public void setAvgLightCurrent(String avgLightCurrent) {
		this.avgLightCurrent = avgLightCurrent;
	}

	@Column(name = "AVG_LIGHT_CURRENT", length = 100)
	public String getAvgLightCurrent() {
		return avgLightCurrent;
	}

	public void setEveProtectLevel(String eveProtectLevel) {
		this.eveProtectLevel = eveProtectLevel;
	}

	@Column(name = "EVE_PROTECT_LEVEL", length = 100)
	public String getEveProtectLevel() {
		return eveProtectLevel;
	}

	public void setFireProtectFactor(String fireProtectFactor) {
		this.fireProtectFactor = fireProtectFactor;
	}

	@Column(name = "FIRE_PROTECT_FACTOR", length = 100)
	public String getFireProtectFactor() {
		return fireProtectFactor;
	}

	public void setEvaluatePartition(String evaluatePartition) {
		this.evaluatePartition = evaluatePartition;
	}

	@Column(name = "EVALUATE_PARTITION", length = 100)
	public String getEvaluatePartition() {
		return evaluatePartition;
	}

	public void setLightRiskValue(String lightRiskValue) {
		this.lightRiskValue = lightRiskValue;
	}

	@Column(name = "LIGHT_RISK_VALUE", length = 100)
	public String getLightRiskValue() {
		return lightRiskValue;
	}

	public void setHasRectification(String hasRectification) {
		this.hasRectification = hasRectification;
	}

	@Column(name = "HAS_RECTIFICATION", length = 100)
	public String getHasRectification() {
		return hasRectification;
	}

	public void setTremarks(String tremarks) {
		this.tremarks = tremarks;
	}

	@Column(name = "TREMARKS", length = 1000)
	public String getTremarks() {
		return tremarks;
	}

	public void setResistivity(String resistivity) {
		this.resistivity = resistivity;
	}

	@Column(name = "RESISTIVITY", length = 100)
	public String getResistivity() {
		return resistivity;
	}

	public void setJzwwzFactor(String jzwwzFactor) {
		this.jzwwzFactor = jzwwzFactor;
	}

	@Column(name = "JZWWZ_FACTOR", length = 100)
	public String getJzwwzFactor() {
		return jzwwzFactor;
	}

	public void setHjFactor(String hjFactor) {
		this.hjFactor = hjFactor;
	}

	@Column(name = "HJ_FACTOR", length = 100)
	public String getHjFactor() {
		return hjFactor;
	}

	public void setFireDanger(String fireDanger) {
		this.fireDanger = fireDanger;
	}

	@Column(name = "FIRE_DANGER", length = 100)
	public String getFireDanger() {
		return fireDanger;
	}

	public String toString() {
		return "TechnicalParams [technicalParamsId=" + technicalParamsId
				+ ",projectId=" + projectId + ",lightProtectCategory="
				+ lightProtectCategory + ",groundFlashDensity="
				+ groundFlashDensity + ",buildingHeight=" + buildingHeight
				+ ",maxLightCurrent=" + maxLightCurrent + ",avgLightCurrent="
				+ avgLightCurrent + ",eveProtectLevel=" + eveProtectLevel
				+ ",fireProtectFactor=" + fireProtectFactor
				+ ",evaluatePartition=" + evaluatePartition
				+ ",lightRiskValue=" + lightRiskValue + ",hasRectification="
				+ hasRectification + ",tremarks=" + tremarks + ",resistivity="
				+ resistivity + ",jzwwzFactor=" + jzwwzFactor + ",hjFactor="
				+ hjFactor + ",fireDanger=" + fireDanger + "]";
	}

}
