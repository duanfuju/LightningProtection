package cn.com.oking.services;

import java.util.List;


import javax.annotation.Resource;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.PbiDao;
import cn.com.oking.dao.SysFileInformationDao;
import cn.com.oking.entity.ProjectBasicInfo;
import cn.com.oking.entity.SysFileInformation;
import cn.com.oking.util.KeyUtil;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;

/**
 * 项目基本信息服务类
 * @author 寻香
 *
 */
@Component
public class ProjectBasicInfoService {

	@Resource
	private PbiDao dao;
	
	@Resource
	private SysFileInformationDao sdao;
	
	@Transactional
	@DataProvider	
	public SysFileInformation findPgzlzkByProjectId(String projectId){
		SysFileInformation s=null;
		try {
			s = (SysFileInformation) sdao.find("from SysFileInformation where associationId='"+projectId+"'").get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	
	
	@Transactional
	@DataProvider
	@Expose
	public ProjectBasicInfo findByProjectId(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			List<Object> pbs=dao.find("from ProjectBasicInfo where projectId ='"+project_id+"'");
			ProjectBasicInfo pb=(ProjectBasicInfo) pbs.get(0);
			return pb;
		}
	}
	
	
	
	
	@Transactional
	@DataProvider
	public List<ProjectBasicInfo> findAll(){
		//查询所有项目
		List<ProjectBasicInfo> pbs=dao.find("from ProjectBasicInfo order by fileDate desc");
		return pbs;
		
	}
	
	@DataResolver
	@Transactional
	public void save(ProjectBasicInfo info) {
		//保存
		if (info.getProjectId()==null) {
			info.setProjectId(KeyUtil.getKey());
		}
		dao.save(info);
	}
	
	
	
	
	@DataResolver
	@Transactional
	public void dataset1(SysFileInformation list) {
		System.out.println(list);
	}
	
}
