/** @Bind #dgshow.onDataRowDoubleClick */
!function(dgshow,tcShow,projectBasicInfoSet,ctinfo,dataSet1){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		projectBasicInfoSet.set('parameter',_id);
		projectBasicInfoSet.flushAsync();
		dataSet1.set('parameter',_id);
		dataSet1.flushAsync();
	}
	tcShow.set('currentTab',ctinfo);
};



/** @Bind #tbbInsert.onClick */
!function(tbbInsert,tcShow,projectBasicInfoSet,ctinfo,dataSet1){
	var projectId = (new Date()).getTime();
	projectBasicInfoSet.clear();
	var mydate=new Date();
	var mymonth=mydate.getMonth()+1;        
	var day= mydate.getDate(); 
	var myyear= mydate.getYear();
	var year=(myyear > 200) ? myyear : 1900 + myyear;
	var today=year+"-"+mymonth+"-"+day;
	dataSet1.insert({'associationId':projectId});
	projectBasicInfoSet.insert({'fileDate':today,'projectId':projectId});
	tcShow.set('currentTab',ctinfo);
};



/**------上传 start---------*/
/** @Bind #btnShowDialog.onClick   */
!function(fileDialog,fileIFrame,dsMaterialImage,dataSet1){
	
	
	var ds=dataSet1.getData();
	var projectApproval=ds.get("projectApproval");
	var paHave=ds.get("paHave");
	var geologicalExplorationReport=ds.get("geologicalExplorationReport");
	var gerHave=ds.get("gerHave");
	var drawings=ds.get("drawings");
	var dHave=ds.get("dHave");
	var feasibilityReport=ds.get("feasibilityReport");
	var frHave=ds.get("frHave");
	var otherInformation=ds.get("otherInformation");
	var oiHave=ds.get("oiHave");
	var associationId=ds.get("associationId");
	
	
	var data = dsMaterialImage.getData();
	var fileid = "";
	if(data != null){
		fileid = data.get("fileid");
	}
	var _type = "imageShowpath";   //参照config.xml
	var _pathType = "QXSCGL";   //参照FileUtils文件
	var _exec = "*";     //限制上传格式
	var _size= "2MB";    //限制上传文件大小
	fileIFrame.set("path","cn.com.oking.upload.upload.d?fileid="+fileid+
			"&type="+ _type+   //showPath类型
			"&pathType="+_pathType+        //保存文件夹
			"&exec="+_exec+        //上传文件格式
			"&size="+_size+
			"&projectApproval="+projectApproval+
			"&paHave="+paHave+
			"&geologicalExplorationReport="+geologicalExplorationReport+
			"&gerHave="+gerHave+
			"&drawings="+drawings+
			"&dHave="+dHave+
			"&feasibilityReport="+feasibilityReport+
			"&frHave="+frHave+
			"&otherInformation="+otherInformation+
			"&oiHave="+oiHave+
			"&associationId="+associationId);       //文件大小
	fileDialog.show();
	fileIFrame.reload();
};

window.setUploadParam = function(fileid,filename){
	if(fileid != null && fileid != "" && fileid != undefined && 
			filename != null && filename != "" && filename != undefined){
		dorado.MessageBox.alert("文件上传成功！  \n \t文件名:"+filename+"\n\t关联ID:"+fileid);
		var data = view.get("#dsMaterialImage").getData();
		data.set("fileid",fileid);
		data.set("title",filename);
		view.get("#fileDialog").hide();
	}
};