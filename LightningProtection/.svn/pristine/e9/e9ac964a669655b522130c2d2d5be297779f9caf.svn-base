package cn.com.oking.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;

import cn.com.oking.dao.ProjectOverviewQueryDao;
import cn.com.oking.entity.custom.SQLwhere;


@Component
public class ProjectOverviewQuery {
	@Resource
	private ProjectOverviewQueryDao dao;

	@DataProvider
	@Transactional
	public List<Map<String, Object>> findByWhere(Map<String, Object> params){
		//获取条件参数 
		if (params==null) {
			return null;
		}
		 String region  = (String) params.get("region");
		 Date endDateStr  = (Date) params.get("endDate");
		 Date startDateStr  = (Date) params.get("startDate");
		 String reportPrint  = (String) params.get("reportPrint");
		 String drawingsHas  = (String) params.get("drawingsHas");
		 String reportReceive  = (String) params.get("reportReceive");
		 String costArriveWay  = (String) params.get("costArriveWay");
		 String reportWitePerson  = (String) params.get("reportWitePerson");
		 String reportCheckPersonnel  = (String) params.get("reportCheckPersonnel");
		 String signingPerson  = (String) params.get("signingPerson");
		 String projectHasDiscount  = (String) params.get("projectHasDiscount");
		 String gerHave  = (String) params.get("gerHave");
		 String projectIndustry  = (String) params.get("projectIndustry");
		 String projectIndustryRemark  = (String) params.get("projectIndustryRemark");
		 String	 lightProtectCategory  = (String) params.get("lightProtectCategory");
		 String	 groundFlashDensity  = (String) params.get("groundFlashDensity");
		 String	 buildingHeight  = (String) params.get("buildingHeight");
		 String	 maxLightCurrent  = (String) params.get("maxLightCurrent");
		 String	 avgLightCurrent  = (String) params.get("avgLightCurrent");
		 String	 eveProtectLevel  = (String) params.get("eveProtectLevel");
		 String	 evaluatePartition  = (String) params.get("evaluatePartition");
		 
		 SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		 String endDate=sim.format(endDateStr);
		 String startDate=sim.format(startDateStr);
		 SQLwhere sql=new SQLwhere(endDate, region, startDate, reportPrint, drawingsHas, reportReceive, costArriveWay, reportWitePerson, reportCheckPersonnel, signingPerson, projectHasDiscount, gerHave, projectIndustry, projectIndustryRemark, lightProtectCategory, groundFlashDensity, buildingHeight, maxLightCurrent, avgLightCurrent, eveProtectLevel, evaluatePartition);
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		List<Object> olist= dao.findBySQL(sql);
		for (int i = 0; i < olist.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			Object[] o= (Object[]) olist.get(i);
			map.put("projectId",o[0]);
			map.put("projectName",o[1]);
			map.put("buildCompany",o[2]);
			map.put("contactPerson",o[3]);
			map.put("contactWay",o[4]);
			list.add(map);
		}
		return list;
	}
}
