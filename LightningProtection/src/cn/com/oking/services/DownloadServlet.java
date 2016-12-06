package cn.com.oking.services;


import java.io.FileInputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.util.Streams;

import cn.com.oking.entity.SysFileInformation;
import cn.com.oking.util.ConfigUtil;

import com.bstek.bdf2.core.context.ContextHolder;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
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
		
		//获取文件id参数
		String filedid = request.getParameter("filedid");
		//获取服务
		InfoConnectBasicServices sysdao=ContextHolder.getBean("infoConnectBasicServices");
		//根据文件的id查询文件字啊数据库中的所有数据
		SysFileInformation info = null;
		List<SysFileInformation> sl = sysdao.dealWhithSession(filedid);
		if(sl.size()>0){
			info = sl.get(0);
		}
		//准备下载的文件的存放路径
		String filedownloadpath=null;
		String fileName  = info.getFileName(); 
		//  文件的路径和默认保存名(真实名字)
		filedownloadpath=info.getSavaPath()+"\\"+info.getRealName();
        fileName = URLEncoder.encode(fileName,"UTF-8");
        response.addHeader("Content-Disposition","attachment;filename="+ fileName );
	    FileInputStream inStream = new FileInputStream(filedownloadpath);
		//2.在指定文件夹下创建文件。
		File dir = new File(ConfigUtil.getValue("fileSavePath"));
		File file = new File(dir,fileName);
		//3.将下载保存到文件。
		FileOutputStream out = new FileOutputStream(file);
		Streams.copy(inStream, out, true);
		out.close();
		inStream.close();
	}
}
