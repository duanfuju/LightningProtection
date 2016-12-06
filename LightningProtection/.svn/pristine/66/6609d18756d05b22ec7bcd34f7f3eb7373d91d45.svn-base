package cn.com.oking.services;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.PerformSingleDao;
import cn.com.oking.dao.RayEvaluationMeetingRecordDao;
import cn.com.oking.dao.ReviewDao;
import cn.com.oking.entity.PerformSingle;
import cn.com.oking.entity.RayEvaluationMeetingRecord;
import cn.com.oking.entity.Review;
import cn.com.oking.util.KeyUtil;
import cn.com.oking.util.StringUtil;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;

/**
 * 资料归档二的服务类
 * @author 寻香
 *
 */
@Component
public class ArchiveSecondService {
	@Resource
	private PerformSingleDao psdao;//（普通）合同管理风险防控措施执行单
	@Resource
	private RayEvaluationMeetingRecordDao remrdao;//雷评技术会谈记录
	@Resource
	private ReviewDao rdao;//雷电灾害风险评估送达回执（回访表） 
	
	
	
	/** 
	 * 雷电灾害风险评估送达回执（回访表）   		查询
	 * @param project_id
	 * @return
	 */
	@Transactional
	@DataProvider
	public Review findByProjectId3(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			try {
				List<Object> pcs=rdao.find("from Review where projectId ='"+project_id+"' order by reviewId desc");

				Review pc=(Review) pcs.get(0);
				return pc;
			} catch (Exception e) {
				return null;
			}
		}
	}
	/** 
	 * 雷评技术会谈记录  		查询
	 * @param project_id
	 * @return
	 */
	@Transactional
	@DataProvider
	public RayEvaluationMeetingRecord findByProjectId2(String project_id){
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			try {
				List<Object> pcs=remrdao.find("from RayEvaluationMeetingRecord where projectId ='"+project_id+"' order by remrId desc");

				RayEvaluationMeetingRecord pc=(RayEvaluationMeetingRecord) pcs.get(0);
				return pc;
			} catch (Exception e) {
				return null;
			}
		}
	}
	/** 
	 * （普通）合同管理风险防控措施执行单  		查询
	 * @param project_id
	 * @return
	 * @throws Exception 
	 */
	@Expose
	@Transactional
	public String findByProjectId1(String project_id) throws Exception{
		PerformSingle pc=null;
		//根据项目的编号查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			try {
				List<Object> pcs=psdao.find("from PerformSingle where projectId ='"+project_id+"' order by psId desc");
				if (pcs.size()>0) {
					pc=(PerformSingle) pcs.get(0);
				}else{
					return null;
				}
			} catch (Exception e) {
				throw new Exception("（普通）合同管理风险防控措施执行单不存在，请先添加！！！");
			}
		}
		StringBuffer info = new StringBuffer();
		info.append("{"); 
		info.append("'rpacNumber':'");
		info.append(pc.getRpacNumber()==null?"',":""+pc.getRpacNumber()+"',");
		info.append("'organizer':'");
		info.append(pc.getOrganizer()==null?"',":pc.getOrganizer()+"',");
		info.append("'supervisor':'");
		info.append(pc.getSupervisor()==null?"',":pc.getSupervisor()+"',");
		info.append("'undertake1':'");
		info.append(pc.getUndertake1()==null?"',":pc.getUndertake1()+"',");
		info.append("'signForPeople1':'");
		info.append(pc.getSignForPeople1()==null?"',":pc.getSignForPeople1()+"',");
		info.append("'date1':'");
		info.append(pc.getDate1()==null?"',":pc.getDate1().toString()+"',");
		info.append("'undertake2':'");
		info.append(pc.getUndertake1()==null?"',":pc.getUndertake1()+"',");
		info.append("'signForPeople2':'");
		info.append(pc.getSignForPeople2()==null?"',":pc.getSignForPeople2()+"',");
		info.append("'date2':'");
		info.append(pc.getDate2()==null?"',":pc.getDate2().toString()+"',");
		info.append("'undertake3':'");
		info.append(pc.getUndertake3()==null?"',":pc.getUndertake3()+"',");
		info.append("'signForPeople3':'");
		info.append(pc.getSignForPeople3()==null?"',":pc.getSignForPeople3()+"',");
		info.append("'date3':'");
		info.append(pc.getDate3()==null?"',":pc.getDate3()+"',");
		info.append("'undertake4':'");
		info.append(pc.getUndertake4()==null?"',":pc.getUndertake4()+"',");
		info.append("'signForPeople4':'");
		info.append(pc.getSignForPeople4()==null?"',":pc.getSignForPeople4()+"',");
		info.append("'date4':'");
		info.append(pc.getDate4()==null?"',":pc.getDate4()+"',");
		info.append("'undertake5':'");
		info.append(pc.getUndertake5()==null?"',":pc.getUndertake5()+"',");
		info.append("'signForPeople5':'");
		info.append(pc.getSignForPeople5()==null?"',":pc.getSignForPeople5()+"',");
		info.append("'date5':'");
		info.append(pc.getDate5()==null?"',":pc.getDate5().toString()+"',");
		info.append("'undertake6':'");
		info.append(pc.getUndertake6()==null?"',":pc.getUndertake6()+"',");
		info.append("'signForPeople6':'");
		info.append(pc.getSignForPeople6()==null?"',":pc.getSignForPeople6()+"',");
		info.append("'date6':'");
		info.append(pc.getDate6()==null?"',":pc.getDate6().toString()+"',");
		info.append("'measuresSituation1':'");
		info.append(pc.getMeasuresSituation1()==null?"',":pc.getMeasuresSituation1()+"',");
		info.append("'implControlMain1':'");
		info.append(pc.getImplControlMain1()==null?"',":pc.getImplControlMain1()+"',");
		info.append("'implPeople1':'");
		info.append(pc.getImplPeople1()==null?"',":pc.getImplPeople1()+"',");
		info.append("'review1':'");
		info.append(pc.getReview1()==null?"',":pc.getReview1()+"',");
		info.append("'measuresSituation2':'");
		info.append(pc.getMeasuresSituation2()==null?"',":pc.getMeasuresSituation2()+"',");
		info.append("'measuresSituation3':'");
		info.append(pc.getMeasuresSituation3()==null?"',":pc.getMeasuresSituation3()+"',");
		info.append("'implControlMain3':'");
		info.append(pc.getImplControlMain3()==null?"',":pc.getImplControlMain3()+"',");
		info.append("'implPeople3':'");
		info.append(pc.getImplPeople3()==null?"',":pc.getImplPeople3()+"',");
		info.append("'review3':'");
		info.append(pc.getReview3()==null?"',":pc.getReview3()+"',");
		info.append("'measuresSituation4':'");
		info.append(pc.getMeasuresSituation4()==null?"',":pc.getMeasuresSituation4()+"',");
		info.append("'implControlMain4':'");
		info.append(pc.getImplControlMain4()==null?"',":pc.getImplControlMain4()+"',");
		info.append("'implPeople4':'");
		info.append(pc.getImplPeople4()==null?"',":pc.getImplPeople4()+"',");
		info.append("'review4':'");
		info.append(pc.getReview4()==null?"',":pc.getReview4()+"',");
		info.append("'checkKey':'");
		info.append(pc.getCheckKey()==null?"',":pc.getCheckKey()+"',");
		info.append("'noImpl':'");
		info.append(pc.getNoImpl()==null?"',":pc.getNoImpl()+"',");
		info.append("'checkDepartment':'");
		info.append(pc.getCheckDepartment()==null?"',":pc.getCheckDepartment()+"',");
		info.append("'checkPeople':'");
		info.append(pc.getCheckPeople()==null?"',":pc.getCheckPeople()+"',");
		info.append("'checkDate':'");
		info.append(pc.getCheckDate()==null?"',":pc.getCheckDate()+"',");
		info.append("'remark':'");
		info.append(pc.getRemark()==null?"',":pc.getRemark()+"'");
		info.append("}");
		return info.toString();

	}
	
	
	
	
	/**
	 * 雷电灾害风险评估送达回执（回访表） 		保存
	 * @param info
	 */
	@DataResolver
	@Transactional
	public void save3(Review info) {
		//保存
		if(!StringUtil.isNotEmpty(info.getReviewId())){
			info.setReviewId(KeyUtil.getKey());
		}
		if (info.getProjectId()==null) {
			info.setProjectId((String)ContextHolder.getHttpSession().getAttribute("project_id"));
			if (!StringUtil.isNotEmpty(info.getProjectId())) {
				info.setProjectId(KeyUtil.getKey());
			}
		}
		rdao.save(info);
	}
	
	/**
	 * 雷评技术会谈记录		保存
	 * @param info
	 */
	@DataResolver
	@Transactional
	public void save2(RayEvaluationMeetingRecord info) {
		//保存
		if(info.getRemrId()==""||info.getRemrId()==null){
			info.setRemrId(KeyUtil.getKey());
		}
		if (info.getProjectId()==null) {
			info.setProjectId((String)ContextHolder.getHttpSession().getAttribute("project_id"));
			if (!StringUtil.isNotEmpty(info.getProjectId())) {
				info.setProjectId(KeyUtil.getKey());
			}
		}
		remrdao.save(info);
	}

	/**
	 * （普通）合同管理风险防控措施执行单		保存
	 * @param info
	 */
	@DataResolver
	@Transactional
	public void save1(PerformSingle info) {
		//保存
		if(!StringUtil.isNotEmpty(info.getPsId())){
			info.setPsId(KeyUtil.getKey());
		}
		if (info.getProjectId()==null) {
			info.setProjectId((String)ContextHolder.getHttpSession().getAttribute("project_id"));
			if (!StringUtil.isNotEmpty(info.getProjectId())) {
				info.setProjectId(KeyUtil.getKey());
			}
		}
		psdao.save(info);
	}
}
