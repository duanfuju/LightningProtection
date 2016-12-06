package cn.com.oking.services;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.PrintCostDao;
import cn.com.oking.entity.PrintCost;
import cn.com.oking.util.KeyUtil;
import cn.com.oking.util.StringUtil;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;

/**
 * 打印费用服务类
 * @author 寻香
 *
 */
@Component
public class PrintCostService {
	@Resource
	private PrintCostDao dao;
	
	@Transactional
	@DataProvider
	public PrintCost findByProjectId(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			try {
				List<Object> pcs=dao.find("from PrintCost where projectId ='"+project_id+"' order by printId desc");
				PrintCost pc=(PrintCost) pcs.get(0);
				return pc;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	}
	
	@DataResolver
	@Transactional
	public void save(PrintCost info) {
		//保存
		if(!StringUtil.isNotEmpty(info.getPrintId())){
			info.setPrintId(KeyUtil.getKeyBefore("print"));
		}
		if (info.getProjectId()==null) {
			info.setProjectId((String)ContextHolder.getHttpSession().getAttribute("project_id"));
		}
		
		dao.save(info);

	}
}
