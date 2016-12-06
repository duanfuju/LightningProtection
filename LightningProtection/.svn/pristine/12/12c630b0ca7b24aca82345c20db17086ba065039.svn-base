package cn.com.oking.services;



import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.DiscussSituationDao;
import cn.com.oking.dao.PbiDao;
import cn.com.oking.entity.DiscussSituation;
import cn.com.oking.entity.ProjectBasicInfo;
import cn.com.oking.util.KeyUtil;

import com.bstek.bdf2.core.business.IUser;
import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;

/**
 * 市场洽谈情况服务类
 * @author 寻香
 *
 */
@Component
public class DiscussSituationService {

	@Resource
	private DiscussSituationDao dao;
	
	@Resource
	private PbiDao pdao;

	@Transactional
	@DataProvider
	public DiscussSituation findByProjectId(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			try {
				List<DiscussSituation> pcs=dao.find("from DiscussSituation where projectId ='"+project_id+"' order by situationId desc");
				DiscussSituation pc= pcs.get(0);
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
	public void save(DiscussSituation info) {
		//保存
		if (info.getSituationId()==null) {
			info.setSituationId(KeyUtil.getKey());
			//默认值
			info.setContractDiscussDate(new Date());//合同洽谈人员
			info.setContractSigningDate(new Date());//合同签订人员
			info.setCheckDate(new Date());//检测日期
			IUser user = ContextHolder.getLoginUser();
			info.setSigningPerson(user.getCname());//签订人员
			info.setMarketDiscussPerson(user.getCname());//合同洽谈人员
			//同时修改项目基本信息表中的
			ProjectBasicInfo pbi=(ProjectBasicInfo) pdao.find("from ProjectBasicInfo where projectId='"+info.getProjectId()+"' order by  projectId desc").get(0);
			pbi.setContractSigningDate(info.getContractSigningDate());
			pbi.setContractSigningPerson(info.getSigningPerson());
			pdao.save(pbi);
		}
		dao.save(info);

	}
}
