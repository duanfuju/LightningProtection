package cn.com.oking.services;



import java.util.List;


import javax.annotation.Resource;




import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.DzlDao;
import cn.com.oking.entity.Dzl;
import cn.com.oking.util.KeyUtil;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;

/**
 * 电阻率打印服务类
 * @author 寻香
 *
 */
@Component
public class DzlService {
	@Resource
	private DzlDao dao;

	@Transactional
	@DataProvider
	public Dzl findByProjectId(String project_id){
		//查询
		if(project_id == null || project_id.equals("")){
			return null;
		}else{
			List<Object> pcs=dao.find("from Dzl where projectId ='"+project_id+"' order by dzlId desc");
			Dzl pc=(Dzl) pcs.get(0);
			return pc;
		}
	}
	
	@DataResolver
	@Transactional
	public void save(Dzl info) {
		//保存
		if(info.getDzlId()==null){
			info.setDzlId(KeyUtil.getKey());
		}
		if (info.getProjectId()==null) {//如果当前没有项目
			info.setProjectId((String)ContextHolder.getHttpSession().getAttribute("project_id"));
		}
		dao.save(info);

	}
	@Expose
	@Transactional
	public String  getDzl(String projectId) throws Exception{
		// Properties info = new Properties();
	
			Dzl pc=null;
			try {
			/*	projectId = (String) ContextHolder.getHttpSession().getAttribute(
						"project_id");*/
				List<Object> pcs = dao.find("from Dzl where projectId ='"
						+ projectId + "' order by dzlId desc");
				pc = (Dzl) pcs.get(0);
			} catch (Exception e) {
				throw new Exception("土壤电阻率检测原始记录表不存在，请先添加！！！");
			}
		
		//	    JsonConfig cfg = new JsonConfig();  
//	    cfg.setExcludes(new String[]{"handler","hibernateLazyInitializer"});  
		/*List list = new ArrayList();
		list.add(pc);
		JSONArray json=JSONArray.fromObject(list);
		String j=json.toString();*/
		//拼接成Json格式的功能
		StringBuffer info = new StringBuffer();
		info.append("{"); 
		//DoradoContext.getAttachedRequest().getSession().setAttribute("dzlJson",sb.toString());
		info.append("'checkPerson':'");
		info.append(pc.getCheckPerson()==null?"',":""+pc.getCheckPerson()+"',");
		info.append("'checkDate':'");
		info.append(pc.getCheckDate().toString()==null?"',":pc.getCheckDate().toString()+"',");
		info.append("'correctionFactor':'");
		info.append(pc.getCorrectionFactor()==null?"',":pc.getCorrectionFactor()+"',");
		info.append("'weather':'");
		info.append(pc.getWeather()==null?"',":pc.getWeather()+"',");
		info.append("'wd1':'");
		info.append(pc.getWd1()==null?"',":pc.getWd1()+"',");
		info.append("'wd2':'");
		info.append(pc.getWd2()==null?"',":pc.getWd2()+"',");
		info.append("'wd3':'");
		info.append(pc.getWd3()==null?"',":pc.getWd3()+"',");
		info.append("'wd4':'");
		info.append(pc.getWd4()==null?"',":pc.getWd4()+"',");
		info.append("'jd1':'");
		info.append(pc.getJd1()==null?"',":pc.getJd1()+"',");
		info.append("'jd2':'");
		info.append(pc.getJd2()==null?"',":pc.getJd2()+"',");
		info.append("'jd3':'");
		info.append(pc.getJd3()==null?"',":pc.getJd3()+"',");
		info.append("'jd4':'");
		info.append(pc.getJd4()==null?"',":pc.getJd4()+"',");
		info.append("'v11':'");
		info.append(pc.getV11()==null?"',":pc.getV11()+"',");
		info.append("'v12':'");
		info.append(pc.getV12()==null?"',":pc.getV12()+"',");
		info.append("'v13':'");
		info.append(pc.getV13()==null?"',":pc.getV13()+"',");
		info.append("'v14':'");
		info.append(pc.getV14()==null?"',":pc.getV14()+"',");
		info.append("'v21':'");
		info.append(pc.getV21()==null?"',":pc.getV21()+"',");
		info.append("'v22':'");
		info.append(pc.getV22()==null?"',":pc.getV22()+"',");
		info.append("'v23':'");
		info.append(pc.getV23()==null?"',":pc.getV23()+"',");
		info.append("'v24':'");
		info.append(pc.getV24()==null?"',":pc.getV24()+"',");
		info.append("'v31':'");
		info.append(pc.getV31()==null?"',":pc.getV31()+"',");
		info.append("'v32':'");
		info.append(pc.getV32()==null?"',":pc.getV32()+"',");
		info.append("'v33':'");
		info.append(pc.getV33()==null?"',":pc.getV33()+"',");
		info.append("'v34':'");
		info.append(pc.getV34()==null?"',":pc.getV34()+"',");
		info.append("'v41':'");
		info.append(pc.getV41()==null?"',":pc.getV41()+"',");
		info.append("'v42':'");
		info.append(pc.getV42()==null?"',":pc.getV42()+"',");
		info.append("'v43':'");
		info.append(pc.getV43()==null?"',":pc.getV43()+"',");
		info.append("'v44':'");
		info.append(pc.getV44()==null?"',":pc.getV44()+"',");
		info.append("'v51':'");
		info.append(pc.getV51()==null?"',":pc.getV51()+"',");
		info.append("'v52':'");
		info.append(pc.getV52()==null?"',":pc.getV52()+"',");
		info.append("'v53':'");
		info.append(pc.getV53()==null?"',":pc.getV53()+"',");
		info.append("'v54':'");
		info.append(pc.getV54()==null?"',":pc.getV54()+"',");
		info.append("'v61':'");
		info.append(pc.getV61()==null?"',":pc.getV61()+"',");
		info.append("'v62':'");
		info.append(pc.getV62()==null?"',":pc.getV62()+"',");
		info.append("'v63':'");
		info.append(pc.getV63()==null?"',":pc.getV63()+"',");
		info.append("'v64':'");
		info.append(pc.getV64()==null?"',":pc.getV64()+"',");
		info.append("'v71':'");
		info.append(pc.getV71()==null?"',":pc.getV71()+"',");
		info.append("'v72':'");
		info.append(pc.getV72()==null?"',":pc.getV72()+"',");
		info.append("'v73':'");
		info.append(pc.getV73()==null?"',":pc.getV73()+"',");
		info.append("'v74':'");
		info.append(pc.getV74()==null?"',":pc.getV74()+"',");
		info.append("'v81':'");
		info.append(pc.getV81()==null?"',":pc.getV81()+"',");
		info.append("'v82':'");
		info.append(pc.getV82()==null?"',":pc.getV82()+"',");
		info.append("'v83':'");
		info.append(pc.getV83()==null?"',":pc.getV83()+"',");
		info.append("'v84':'");
		info.append(pc.getV84()==null?"',":pc.getV84()+"',");
		info.append("'v91':'");
		info.append(pc.getV91()==null?"',":pc.getV91()+"',");
		info.append("'v92':'");
		info.append(pc.getV92()==null?"',":pc.getV92()+"',");
		info.append("'v93':'");
		info.append(pc.getV93()==null?"',":pc.getV93()+"',");
		info.append("'v94':'");
		info.append(pc.getV94()==null?"',":pc.getV94()+"',");
		info.append("'v101':'");
		info.append(pc.getV101()==null?"',":pc.getV101()+"',");
		info.append("'v102':'");
		info.append(pc.getV102()==null?"',":pc.getV102()+"',");
		info.append("'v103':'");
		info.append(pc.getV103()==null?"',":pc.getV103()+"',");
		info.append("'v104':'");
		info.append(pc.getV104()==null?"'":pc.getV104()+"'");
		info.append("}");
		return info.toString();

		
		//return j;
	}	
	

}
