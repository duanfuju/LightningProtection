package cn.com.oking.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.util.Streams;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.oking.dao.InfoConnectionBasicDAO;
import cn.com.oking.dao.SysFileInformationDao;
import cn.com.oking.entity.InfoConnectionBasic;
import cn.com.oking.entity.SysFileInformation;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
/**
 * 基本信息连接
 * @author 寻香
 *
 */
@Component
public class InfoConnectBasicServices {
		@Resource
		private InfoConnectionBasicDAO dao;
		
		@Resource 
		private SysFileInformationDao sysdao;
		
		@DataProvider
		@Transactional
		public Collection<InfoConnectionBasic> getAll() {
			//查询所有
			List<InfoConnectionBasic> list=dao.find("from InfoConnectionBasic");
		    return list;
		}
		@DataProvider
		@Transactional
		public Collection<SysFileInformation> getupAll() {
			//查询所有
			List<SysFileInformation> list=sysdao.find("from SysFileInformation");
		    return list;
		}
		@DataResolver
	    @Transactional
	    public void saveAll(Collection<InfoConnectionBasic> entity){
			//保存
	        dao.persistEntities(entity);
	    }
		
		@Transactional
		public List<SysFileInformation> dealWhithSession(String filedid){
			return sysdao.find("from SysFileInformation where id ='"+ filedid.toLowerCase()+"'");
		}
		
		
		@Expose
		public String downLoad(String filedid) throws IOException{
			//下载
			SysFileInformation info = null;
			List<SysFileInformation> sl = sysdao.find("from SysFileInformation where id ='"+ filedid.toLowerCase()+"'");
			if(sl.size()>0){
				info = sl.get(0);
				
			}
			InputStream inStream =null;
			//  下载本地文件 
			try  {
				HttpServletResponse response=  ContextHolder.getResponse();
				String fileName  = info.getRealName();  //  文件的默认保存名
		         //  读到流中 
		         inStream  =   new  FileInputStream("D:\\upload\\oking\\QXSCGL\\"+fileName); //  文件的存放路径
		         //  设置输出的格式 
		        response.reset();
		        response.setContentType("bin");
		        response.addHeader("Content-Disposition","attachment;filename=\'" + fileName + "\'" );
		         //  循环取出流中的数据 
		         /*byte [] b  =   new   byte [ 100 ];
		         int  len;
	            while  ((len  =  inStream.read(b))  >   0 )
	            	response.getOutputStream().write(b,  0 , len);*/
	            
	          //1.获取指定地址的输入流.
				//URL url = new URL("D:\\upload\\oking\\QXSCGL\\"+fileName);
				//InputStream in = url.openStream();

				//2.在指定文件夹下创建文件。
				File dir = new File("D:\\upload\\oking\\");
				File file = new File(dir,fileName);

				//3.将下载保存到文件。
				FileOutputStream out = new FileOutputStream(file);
				Streams.copy(inStream, out, true);
	        }  catch  (Exception e) {
	            e.printStackTrace();
	        	return "{\"msg\":\"上传失败\"}";
	        }finally{
	        	inStream.close();
	        }
			return "{\"msg\":\"上传成功\"}";
		}
}
