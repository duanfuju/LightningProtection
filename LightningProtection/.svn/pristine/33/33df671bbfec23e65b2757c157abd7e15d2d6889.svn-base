package cn.com.oking.services;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.ArchiveFirstDao;
import cn.com.oking.entity.ArchiveFirst;
import cn.com.oking.util.KeyUtil;
import cn.com.oking.util.StringUtil;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;

/**
 * 资料归档一的服务类
 * @author 寻香
 *
 */
@Component
public class ArchiveFirstService {
	@Resource
	private ArchiveFirstDao dao;
	
	@Transactional
	@DataProvider
	public ArchiveFirst findByProjectId(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			try {
				List<Object> pcs=dao.find("from ArchiveFirst where projectId ='"+project_id+"' order by afId desc");

				ArchiveFirst pc=(ArchiveFirst) pcs.get(0);
				return pc;
			} catch (Exception e) {
				return null;
			}
		}
	}
	
	@DataResolver
	@Transactional
	public void save(ArchiveFirst info) {
		//保存
		if(!StringUtil.isNotEmpty(info.getAfId())){
			info.setAfId(KeyUtil.getKey());
		}
		if (info.getProjectId()==null) {
			info.setProjectId((String)ContextHolder.getHttpSession().getAttribute("project_id"));
			if (!StringUtil.isNotEmpty(info.getProjectId())) {
				info.setProjectId(KeyUtil.getKey());
			}
		}
		
		
		dao.save(info);

	}
}
