package cn.com.oking.view.input.archiveSecond;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.oking.entity.PerformSingle;
import cn.com.oking.services.ArchiveSecondService;
import cn.com.oking.util.KeyUtil;

import com.bstek.bdf2.core.context.ContextHolder;

/**
 * Servlet implementation class normal
 */
public class normal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public normal() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.reset();
		response.setContentType("application/x-download");
		request.setCharacterEncoding("UTF-8");
		//获取服务
		ArchiveSecondService dao=ContextHolder.getBean("archiveSecondService");
		//获取参数
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String projectId = request.getParameter("projectId");
		String rpacNumber = request.getParameter("rpacNumber");
		String organizer = request.getParameter("organizer");
		String supervisor = request.getParameter("supervisor");
		String undertake1 = request.getParameter("undertake1");
		String signForPeople1 = request.getParameter("signForPeople1");
		String date1str = request.getParameter("date1");
		String undertake2 = request.getParameter("undertake2");
		String signForPeople2 = request.getParameter("signForPeople2");
		String date2str = request.getParameter("date2");
		String undertake3 = request.getParameter("undertake3");
		String signForPeople3 = request.getParameter("signForPeople3");
		String date3str = request.getParameter("date2");
		String undertake4 = request.getParameter("undertake4");
		String signForPeople4 = request.getParameter("signForPeople4");
		String date4str = request.getParameter("date2");
		
		String undertake5 = request.getParameter("undertake5");
		String signForPeople5 = request.getParameter("signForPeople5");
		String date5str = request.getParameter("date2");
		
		String undertake6 = request.getParameter("undertake6");
		String signForPeople6 = request.getParameter("signForPeople6");
		String date6str = request.getParameter("date2");
		
		String measuresSituation1 = request.getParameter("measuresSituation1");
		String implControlMain1 = request.getParameter("implControlMain1");
		String implPeople1 = request.getParameter("implPeople1");
		String review1 = request.getParameter("review1");
		String measuresSituation2 = request.getParameter("measuresSituation2");
		String measuresSituation3 = request.getParameter("measuresSituation3");
		String implControlMain3 = request.getParameter("implControlMain3");
		String implPeople3 = request.getParameter("implPeople3");
		String review3 = request.getParameter("review3");
		String measuresSituation4 = request.getParameter("measuresSituation4");
		String implControlMain4 = request.getParameter("implControlMain4");
		String implPeople4 = request.getParameter("implPeople4");
		String review4 = request.getParameter("review4");

		String checkKey = request.getParameter("checkKey");
		String noImpl = request.getParameter("noImpl");
		String checkDepartment = request.getParameter("checkDepartment");
		String checkPeople = request.getParameter("checkPeople");
		String checkDatestr = request.getParameter("checkDate");
		Date checkDate=null;
		Date date1=null;
		Date date2=null;
		Date date3=null;
		Date date4=null;
		Date date5=null;
		Date date6=null;
		try {
			checkDate = sim.parse(checkDatestr);
			date1 = sim.parse(date1str);
			date2 = sim.parse(date1str);
			date3 = sim.parse(date1str);
			date4 = sim.parse(date1str);
			date5 = sim.parse(date1str);
			date6 = sim.parse(date1str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String remark = request.getParameter("remark");
		PerformSingle ps=new PerformSingle(KeyUtil.getKey(),projectId,rpacNumber, organizer, supervisor, undertake1, signForPeople1, date1, undertake2, signForPeople2, date2, undertake3, signForPeople3, date3, undertake4, signForPeople4, date4, undertake5, signForPeople5, date5, undertake6, signForPeople6, date6, measuresSituation1, implControlMain1, implPeople1, review1, measuresSituation2, measuresSituation3, implControlMain3, implPeople3, review3, measuresSituation4, implControlMain4, implPeople4, review4, checkKey, noImpl, checkDepartment, checkPeople, checkDate, remark);
		dao.save1(ps);
	}

}
