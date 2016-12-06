/** @Bind #dgShow.onDataRowDoubleClick */
!function(dgShow,tcShow,dsArchiveFirst,ctinfo){
	var dataset =dgShow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		dsArchiveFirst.set('parameter',_id);
		dsArchiveFirst.flushAsync();
	}
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #tbbInsert.onClick */
!function(dgShow,tbbInsert,tcShow,dsArchiveFirst,ctinfo){
	var dataset =dgShow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	dsArchiveFirst.clear();
	dsArchiveFirst.insert({'projectId':_id});
	tcShow.set('currentTab',ctinfo);
};










//子页面想父页面返回一个dataset
window.rvDataset = function(){
	var ds=view.get("#dsArchiveFirst");
	return ds;
};



/**------上传 start---------*/
/** @Bind #btnShowDialog.onClick   */
!function(fileDialog,fileIFrame,dsMaterialImage){
	var data = dsMaterialImage.getData();
	var fileid = "";
	if(data != null){
		fileid = data.get("fileid");
	}
	var _type = "imageShowpath";   //参照config.xml
	var _pathType = "QXSCGL";   //参照FileUtils文件
	var _exec = "jpg";     //限制上传格式
	var _size= "2MB";    //限制上传文件大小
	fileIFrame.set("path","cn.com.oking.upload.upload.d?fileid="+fileid+
			"&type="+ _type+   //showPath类型
			"&pathType="+_pathType+        //保存文件夹
			"&exec="+_exec+        //上传文件格式
			"&size="+_size);       //文件大小
	fileDialog.show();
	fileIFrame.reload();
};

window.setUploadParam = function(fileid,filename){
	if(fileid != null && fileid != "" && fileid != undefined && 
			filename != null && filename != "" && filename != undefined){
		dorado.MessageBox.alert("文件上传成功！  \n \t文件名:"+filename+"\n\t关联ID:"+fileid);
		//将列表刷新
		var ds=view.get("#dssfi");
		ds.flushAsync();
		var data = view.get("#dsMaterialImage").getData();
		data.set("fileid",fileid);
		data.set("title",filename);
		view.get("#fileDialog").hide();
	}
};

/**------上传 end---------*/

/**--根据filedid查询 start--**/
//@Bind #btnDownload.onClick
!function(dsinfoConnectBasic,dgshow,self){
	//dsinfoConnectBasic是数据类型，dgshow是控件DataGrid
	//获取datagird当前选中的数据行并获取列filedid的值
	var datagrid = this.get("#dgshow");
	var dataset =datagrid.get("dataSet");
	var row = dataset.getData("#");
	var resourceid= row.get("id");

	//为ajax设置参数
    var parameter = {
            filedid: resourceid
       
        };
  
    
    $.ajax({
    	type: "POST",
		dataType:"HTML",//json在jquery1.4版本以后对json格式要求非常严格了，要满足json.org网站定义的格式才能执行success回调，否则都会出错，无法解析返回的json数据
		url:"DownloadServlet",
		data:parameter,
		success:function(){
			//若下载同一文件，则会覆盖
			alert("下载成功");
		},
		error:function(){
			alert("下载失败");
		}
	});
    
	
}
/**--根据filedid查询 end--**/
