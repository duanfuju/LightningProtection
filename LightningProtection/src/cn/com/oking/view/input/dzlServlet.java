package cn.com.oking.view.input;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.oking.entity.Dzl;
import cn.com.oking.services.DzlService;
import cn.com.oking.util.KeyUtil;

import com.bstek.bdf2.core.context.ContextHolder;


/**
 * Servlet implementation class dzlServlet
 */
public class dzlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dzlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.reset();
		response.setContentType("application/x-download");
		request.setCharacterEncoding("UTF-8");
		//获取服务
		DzlService dao=ContextHolder.getBean("dzlService");
		//获取参数
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String checkDatestr = request.getParameter("checkDate");
		Date checkDate = null;
		try {
			checkDate = sim.parse(checkDatestr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String projectId = request.getParameter("projectId");
		String correctionFactor = request.getParameter("correctionFactor");
		String weather = request.getParameter("weather");
		String checkPerson = request.getParameter("checkPerson");
		String wd1 = request.getParameter("wd1");
		String wd2 = request.getParameter("wd2");
		String wd3 = request.getParameter("wd3");
		String wd4 = request.getParameter("wd4");
		String jd1 = request.getParameter("jd1");
		String jd2 = request.getParameter("jd2");
		String jd3 = request.getParameter("jd3");
		String jd4 = request.getParameter("jd4");
		String v11 = request.getParameter("v11");
		String v12 = request.getParameter("v12");
		String v13 = request.getParameter("v13");
		String v14 = request.getParameter("v14");
		String v21 = request.getParameter("v21");
		String v22 = request.getParameter("v22");
		String v23 = request.getParameter("v23");
		String v24 = request.getParameter("v24");
		String v31 = request.getParameter("v31");
		String v32 = request.getParameter("v32");
		String v33 = request.getParameter("v33");
		String v34 = request.getParameter("v34");
		String v41 = request.getParameter("v41");
		String v42 = request.getParameter("v42");
		String v43 = request.getParameter("v43");
		String v44 = request.getParameter("v44");
		String v51 = request.getParameter("v51");
		String v52 = request.getParameter("v52");
		String v53 = request.getParameter("v53");
		String v54 = request.getParameter("v54");
		String v61 = request.getParameter("v61");
		String v62 = request.getParameter("v62");
		String v63 = request.getParameter("v63");
		String v64 = request.getParameter("v64");
		String v71 = request.getParameter("v71");
		String v72 = request.getParameter("v72");
		String v73 = request.getParameter("v73");
		String v74 = request.getParameter("v74");
		String v81 = request.getParameter("v81");
		String v82 = request.getParameter("v82");
		String v83 = request.getParameter("v83");
		String v84 = request.getParameter("v84");
		String v91 = request.getParameter("v91");
		String v92 = request.getParameter("v92");
		String v93 = request.getParameter("v93");
		String v94 = request.getParameter("v94");
		String v101 = request.getParameter("v101");
		String v102 = request.getParameter("v102");
		String v103 = request.getParameter("v103");
		String v104 = request.getParameter("v104");
		Dzl dzl=new Dzl(KeyUtil.getKey(),projectId,checkDate, correctionFactor, weather, checkPerson, wd1, wd2, wd3, wd4, jd1, jd2, jd3, jd4, v11, v12, v13, v14, v21, v22, v23, v24, v31, v32, v33, v34, v41, v42, v43, v44, v51, v52, v53, v54, v61, v62, v63, v64, v71, v72, v73, v74, v81, v82, v83, v84, v91, v92, v93, v94, v101, v102, v103, v104);
		dao.save(dzl);
	}

}
