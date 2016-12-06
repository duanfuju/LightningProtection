package cn.com.oking.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.ProjectConclusionDao;
import cn.com.oking.entity.ProjectConclusion;
import cn.com.oking.util.KeyUtil;
import cn.com.oking.util.StringUtil;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;

@Component
public class ProjectConclusionServices {
	@Resource
	private ProjectConclusionDao dao;
	
	@Transactional
	@DataProvider
	public ProjectConclusion findByProjectId(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			ProjectConclusion pc=null;
			try {
				List<Object> pcs=dao.find("from ProjectConclusion where projectId ='"+project_id+"' order by pcId desc");
				pc = (ProjectConclusion) pcs.get(0);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			return pc;
		}
	}
	
	@DataResolver
	@Transactional
	public void save(ProjectConclusion info) {
		//保存
		if(!StringUtil.isNotEmpty(info.getPcId())){
			info.setPcId(KeyUtil.getKey());
		}
		if (info.getProjectId()==null) {
			info.setProjectId((String)ContextHolder.getHttpSession().getAttribute("project_id"));
		}
		dao.save(info);
	}
}
