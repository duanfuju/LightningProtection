package cn.com.oking.services;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.Expose;

import cn.com.oking.dao.ProjectConclusionDao;
import cn.com.oking.entity.custom.SQLwhere;
import cn.com.oking.util.StringUtil;


@Component
public class DataStatistics {
	@Resource
	private ProjectConclusionDao dao;

	@Expose
	@Transactional
	public List<Map<String, Object>> findByWhere(Map<String, Object> params){
		//获取条件参数 
		Date endDateStr  = (Date) params.get("endDate");
		 String region  = (String) params.get("region");
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
		 SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		 String endDate=sim.format(endDateStr);
		 String startDate=sim.format(startDateStr);
		 SQLwhere sql=new SQLwhere(endDate, region, startDate, reportPrint, drawingsHas, reportReceive, costArriveWay, reportWitePerson, reportCheckPersonnel, signingPerson, projectHasDiscount, gerHave, projectIndustry, projectIndustryRemark);
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		List<Object> olist= dao.findBySQL(sql);
		Map<String, Object> mapcount = new HashMap<String, Object>();
		double countPTI=0;
		double countTP=0;
		double countRR=0;
		for (int i = 0; i < olist.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			Object[] o= (Object[]) olist.get(i);
			map.put("projectName",o[0]);
			map.put("reportReceive",1);
			if (o[1]==null) {
				map.put("projectTotalInvestment",0);
			}else{				
				map.put("projectTotalInvestment",o[1]);
			}
			//map.put("totalPrice",o[3]);
			//countRR+=new BigDecimal(o[1].toString()).doubleValue();
			
			//如果本项目的评估费用没有填写默认为零	
			if (o[1]==null) {
				countPTI+=0;
			}else{
				countPTI+=new BigDecimal(o[1].toString()).doubleValue();
			}
			//countTP+=new BigDecimal(o[3].toString()).doubleValue();
			list.add(map);
		}
		mapcount.put("projectName","所有项目");
		//mapcount.put("reportReceive",countRR);
		mapcount.put("reportReceive",olist.size());
		mapcount.put("projectTotalInvestment",countPTI);
		//mapcount.put("totalPrice",countTP);
		list.add(mapcount);
		return list;
	}
}
