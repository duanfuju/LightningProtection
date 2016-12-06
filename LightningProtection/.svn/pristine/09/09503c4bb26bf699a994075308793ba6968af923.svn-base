package cn.com.oking.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import cn.com.oking.dao.PbiDao;
import cn.com.oking.entity.ProjectBasicInfo;

import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.web.DoradoContext;


/**
 * 本类用来做一些共有的基本信息类
 * @author 寻香
 *
 */
@Component
public class BasicInformation {
	@Resource
	private PbiDao pbiDao;//项目基本信息表
	
	@Expose
	@Transactional
	public String deleteByProjectId(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return "{'info':'failure'}";
		}else{
			List<Object> pbs=pbiDao.find("from ProjectBasicInfo where projectId ='"+project_id+"'");
			ProjectBasicInfo pb=(ProjectBasicInfo) pbs.get(0);
			pbiDao.delete(pb);
			return "{'info':'success'}";
		}
	}
	
	@DataResolver
	@Transactional
	public void exit(){
		//退出
		DoradoContext.getAttachedRequest().getSession().setAttribute("project_id", null);
		DoradoContext.getAttachedRequest().getSession().setAttribute("project_name", null);
	}
	
}
