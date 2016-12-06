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
 * 项目总体概况查询
 * @author 寻香
 *
 */
@Repository
public class ProjectOverviewQueryDao extends HibernateDao<ProjectConclusion, Long>{//继承的类不是错的，只是数据库没有，随便找的一个类，没有使用d7的东西
	public List<Object> findBySQL(SQLwhere where){
		String sql="";
		String s="select pbi.project_id,pbi.project_name,pbi.build_company,pbi.contact_person,pbi.contact_way "
				   +" from project_basic_info pbi ";
		String q="";
		String l="";
		boolean[] flag={false,false,false,false,false};
		

		if (where!=null) {
			l+="where pbi.file_date between date'"+where.getStartDate()+"' and date'"+where.getEndDate()+"' ";
			if (StringUtil.isNotEmpty(where.getRegion())) {
				l+="and pbi.project_area like '%"+where.getRegion()+"%' ";
			}
			if (StringUtil.isNotEmpty(where.getCostArriveWay())) {
				l+=" and pbi.cost_arrive_way like '%"+where.getCostArriveWay()+"%' ";
			}
			if (StringUtil.isNotEmpty(where.getReportWitePerson())) {
				l+=" and pbi.report_wite_person like '%"+where.getReportWitePerson()+"%' ";
			}
			if (StringUtil.isNotEmpty(where.getProjectIndustry())) {
				l+="  and pbi.project_industry like '%"+where.getProjectIndustry()+"%' ";
			}
			if (StringUtil.isNotEmpty(where.getProjectIndustryRemark())) {
				l+=" and pbi.project_industry_remark like '%"+where.getProjectIndustryRemark()+"%' ";
			}
			if (StringUtil.isNotEmpty(where.getReportPrint())) {
				l+=" and pc.report_print like '%"+where.getReportPrint()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getDrawingsHas())) {
				l+=" and pc.drawings_has like '%"+where.getDrawingsHas()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getReportReceive())) {
				l+=" and pc.report_receive like '%"+where.getReportReceive()+"%' ";
				flag[0]=true;
			}
			if (StringUtil.isNotEmpty(where.getSigningPerson())) {
				l+=" and ds.signing_person like '%"+where.getSigningPerson()+"%' ";
				flag[1]=true;
			}
			if (StringUtil.isNotEmpty(where.getProjectHasDiscount())) {
				l+=" and ds.project_has_discount like '%"+where.getProjectHasDiscount()+"%' ";
				flag[1]=true;
			}
			if (StringUtil.isNotEmpty(where.getReportCheckPersonnel())) {
				l+=" and af.report_check_personnel like '%"+where.getReportCheckPersonnel()+"%' ";
				flag[2]=true;
			}
			if (StringUtil.isNotEmpty(where.getGerHave())) {
				//地勘报告有无
				boolean b_flag=false;
				if (where.getGerHave().equals("有")) {
					b_flag=true;
				}
				l+=" and sfi.ger_have = '"+b_flag+"' ";
				flag[3]=true;
			}
			if (StringUtil.isNotEmpty(where.getLightProtectCategory())) {
				l+=" and tp.light_protect_category like '%"+where.getLightProtectCategory()+"%' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getGroundFlashDensity())) {
				l+=" and tp.ground_flash_density like '%"+where.getGroundFlashDensity()+"%' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getBuildingHeight())) {
				l+=" and tp.building_height like '%"+where.getBuildingHeight()+"%' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getMaxLightCurrent())) {
				l+=" and tp.max_light_current like '%"+where.getMaxLightCurrent()+"%' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getAvgLightCurrent())) {
				l+=" and tp.avg_light_current like '%"+where.getAvgLightCurrent()+"%' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getEveProtectLevel())) {
				l+=" and tp.eve_protect_level like '%"+where.getEveProtectLevel()+"%' ";
				flag[4]=true;
			}
			if (StringUtil.isNotEmpty(where.getEvaluatePartition())) {
				l+=" and tp.evaluate_partition like '%"+where.getEvaluatePartition()+"%' ";
				flag[4]=true;
			}				
			for (int i = 0; i < flag.length; i++) {
				if (flag[i]==true) {
					if (i==0) {
						q+="  inner join project_conclusion pc on pbi.project_id=pc.project_id ";
					}else if (i==1) {
						q+="   inner join discuss_situation ds on pbi.project_id=ds.project_id ";
					}else if (i==2) {
						q+="    inner join archive_first af on pbi.project_id=af.project_id ";
					}else if (i==3) {
						q+="     inner join sys_file_information sfi on pbi.project_id=sfi.association_id ";
					}else if (i==4) {
						q+=" inner join print_cost print on pbi.project_id=print.project_id ";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return ls;
	}
}
