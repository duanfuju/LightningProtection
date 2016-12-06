package cn.com.oking.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.com.oking.entity.ProjectConclusion;
import cn.com.oking.entity.custom.SQLwhere;
import cn.com.oking.util.StringUtil;

import com.bstek.dorado.hibernate.HibernateDao;

/**
 * 项目总结
 * @author 寻香
 *
 */
@Repository
public class ProjectConclusionDao extends HibernateDao<ProjectConclusion, Long>{
	public List<Object> findBySQL(SQLwhere where){
		String sql="";
		String s="select pbi.project_name,pbi.contract_price "
				   +" from project_basic_info pbi ";
		String q="";
		String l="";
		//pbi:0		sfi:1		af=2		ds:3		pc:4
		boolean[] flag={true,false,false,true,false};
		
		if (where!=null) {
			l+="where pbi.file_date between date'"+where.getStartDate()+"' and date'"+where.getEndDate()+"' ";
			if (StringUtil.isNotEmpty(where.getRegion())) {
				l+="and pbi.project_area like '%"+where.getRegion()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getProjectIndustry())) {
				l+="  and pbi.project_industry like '%"+where.getProjectIndustry()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getProjectIndustryRemark())) {
				l+=" and pbi.project_industry_remark like '%"+where.getProjectIndustryRemark()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getCostArriveWay())) {
				l+=" and pbi.cost_arrive_way like '%"+where.getCostArriveWay()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getReportWitePerson())) {
				l+=" and pbi.report_wite_person like '%"+where.getReportWitePerson()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getGerHave())) {
				//地勘报告有无
				boolean b_flag=false;
				if (where.getGerHave().equals("有")) {
					b_flag=true;
				}
				l+=" and sfi.ger_have = '"+b_flag+"' ";
				flag[1]=true;
			}
			if (StringUtil.isNotEmpty(where.getReportCheckPersonnel())) {
				l+=" and af.report_check_personnel like '%"+where.getReportCheckPersonnel()+"%' ";
				flag[2]=true;
			}
			if (StringUtil.isNotEmpty(where.getSigningPerson())) {
				l+=" and ds.signing_person like '%"+where.getSigningPerson()+"%' ";
				flag[3]=true;
			}
			if (StringUtil.isNotEmpty(where.getProjectHasDiscount())) {
				//项目减免与否....
				l+=" and ds.project_has_discount = '"+where.getProjectHasDiscount()+"' ";
				flag[3]=true;
			}
			if (StringUtil.isNotEmpty(where.getReportPrint())) {
				//打印与否
				boolean b_flag=false;
				if (where.getReportPrint().equals("是")) {
					b_flag=true;
				}
				l+=" and pc.report_print = '"+b_flag+"' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getDrawingsHas())) {
				//图纸齐全与否
				boolean b_flag=false;
				if (where.getDrawingsHas().equals("是")) {
					b_flag=true;
				}
				l+=" and pc.drawings_has = '"+b_flag+"' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getReportReceive())) {
				//按报告领取否
				boolean b_flag=false;
				if (where.getReportReceive().equals("是")) {
					b_flag=true;
				}
				l+=" and pc.report_receive = '"+b_flag+"' ";
				flag[4]=true;
			}
			for (int i = 0; i < flag.length; i++) {
				if (flag[i]==true) {
					if (i==1) {
						q+=" inner join sys_file_information sfi on pbi.project_id=sfi.association_id ";
					}else if (i==2) {
						q+=" inner join archive_first af on pbi.project_id=af.project_id ";
					}else if (i==3) {
						q+=" inner join discuss_situation ds on pbi.project_id=ds.project_id ";
					}else if (i==4) {
						q+=" inner join project_conclusion pc on pbi.project_id=pc.project_id ";
					}
				}
			}
			sql=s+q+l;
		}
		Session session = super.getSession();
		SQLQuery query=session.createSQLQuery(sql);   
		
		List<Object> ls=null;
		try {
			ls = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
		return ls;
	}
}
