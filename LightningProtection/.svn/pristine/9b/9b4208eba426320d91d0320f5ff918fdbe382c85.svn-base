package cn.com.oking.services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.PbiDao;
import cn.com.oking.dao.TechnicalParamsDao;
import cn.com.oking.entity.ProjectBasicInfo;
import cn.com.oking.entity.TechnicalParams;
import cn.com.oking.util.KeyUtil;

import com.bstek.bdf2.core.business.IUser;
import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
/**
 * 技术参数服务类
 * @author 寻香
 *
 */
@Component
public class TechnicalParamsService {
	
	@Resource
	private TechnicalParamsDao dao;
	
	@Resource
	private PbiDao pdao;
	
	@Transactional
	@DataProvider
	public TechnicalParams findByProjectId(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			TechnicalParams tp;
			try {
				List<TechnicalParams> tps=dao.find("from TechnicalParams where projectId ='"+project_id+"' order by technicalParamsId desc");
				tp = tps.get(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			return tp;
		}
	}
	
	@DataResolver
	@Transactional
	public void save(TechnicalParams info) {
		//保存
		if (info.getTechnicalParamsId()==null) {
			info.setTechnicalParamsId(KeyUtil.getKey());
			//更新项目基本信息表
			ProjectBasicInfo pbi=(ProjectBasicInfo) pdao.find("from ProjectBasicInfo where projectId='"+info.getProjectId()+"' order by projectId desc").get(0);
			//获取5天后的时间
			Calendar c = Calendar.getInstance();  
			c.setTimeInMillis(new Date().getTime());
			c.add(Calendar.DATE, 5);//5天后的日期
			Date date= new Date(c.getTimeInMillis()); //将c转换成Date
			//获取登录的人
			IUser user = ContextHolder.getLoginUser();
			pbi.setReportWriteDate(new Date());//设置报告编制日期
			if (pbi.getReportPreFinishDate()==null) {
				pbi.setReportPreFinishDate(date);//设置报告预完成日期
			}
			pbi.setReportFinishDate(date);//设置报告完成日期
			pbi.setReportWitePerson(user.getCname());//设置报告编制人员
			
			pdao.save(pbi);
		}
		dao.save(info);
	}
	
}
