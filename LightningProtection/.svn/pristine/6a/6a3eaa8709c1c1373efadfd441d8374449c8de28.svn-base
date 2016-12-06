package cn.com.oking.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;

import cn.com.oking.dao.PbiDao;
import cn.com.oking.entity.ProjectBasicInfo;


/**
 * 项目基本信息服务类
 * @author 寻香
 *
 */
@Component
public class pbiService {

	@Resource
	private PbiDao dao;
	
	 @Transactional
	 @DataProvider
	 public List<ProjectBasicInfo> selectByTime(Map<String, Object> params){
		 if (params==null) {
			return null;
		}
		 Date endDateStr  = (Date) params.get("endDate");
		 Date startDateStr  = (Date) params.get("startDate");
		 SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		 String endDate=sim.format(endDateStr);
		 String startDate=sim.format(startDateStr);
		 List<ProjectBasicInfo> list=dao.find("from ProjectBasicInfo where fileDate > to_date('"+startDate+"','yyyy-MM-dd') and fileDate< to_date('"+endDate+"','yyyy-MM-dd') order by fileDate");
		return list;
	 }
	 
	 @DataResolver
     @Transactional
     public void saveAll(List<ProjectBasicInfo> info){
        dao.persistEntities(info);
     }
	
	
	
}
