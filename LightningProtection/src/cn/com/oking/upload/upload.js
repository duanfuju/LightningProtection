var _fileName = "";

/** @Bind #autoUploadAction.onReady */
!function(autoUploadAction,labtip){
	var _exec = "${request.getParameter('exec')}";
	var _size = "${request.getParameter('size')}";
	var f = autoUploadAction.get("filters");
	f[0].extensions = _exec;
	autoUploadAction.set("filters",f);  //限制类型
	autoUploadAction.set("maxFileSize",_size);  //限制大小
	labtip.set("text","文件格式:"+_exec+"\t最大:"+_size);
	//alert(fil.extensions);
};

/** @Bind #autoUploadAction.beforeFileUpload */
!function( self, form){
	var _fileid = "${request.getParameter('fileid')}";
	var _pathType = "${request.getParameter('pathType')}";
	var _type = "${request.getParameter('type')}";
	var projectApproval="${request.getParameter('projectApproval')}";
	var paHave="${request.getParameter('paHave')}";
	var geologicalExplorationReport="${request.getParameter('geologicalExplorationReport')}";
	var gerHave="${request.getParameter('gerHave')}";
	var drawings="${request.getParameter('drawings')}";
	var dHave="${request.getParameter('dHave')}";
	var feasibilityReport="${request.getParameter('feasibilityReport')}";
	var frHave="${request.getParameter('frHave')}";
	var otherInformation="${request.getParameter('otherInformation')}";
	var oiHave="${request.getParameter('oiHave')}";
	var associationId="${request.getParameter('associationId')}";
	
	//
	//动态设置参数
	//var entity = form.get("entity");
	self.set("parameter", {
		fileid: _fileid,
		pathType:_pathType,
		type:_type,
		projectApproval:projectApproval,
		paHave:paHave,
		geologicalExplorationReport:geologicalExplorationReport,
		gerHave:gerHave,
		drawings:drawings,
		dHave:dHave,
		feasibilityReport:feasibilityReport,
		frHave:frHave,
		otherInformation:otherInformation,
		oiHave:oiHave,
		associationId:associationId
	});
	//上面代码可以简写为
	//self.set("parameter", entity.toJSON());
};

/** @Bind #autoUploadAction.onFileUploaded */
!function(arg) {
	//获取FileResolver方法返回的信息
	var info = arg.returnValue;
//	var name = java.net.URLDecoder.decode(info.fileName,"UTF-8");
//	dorado.MessageBox.alert(name);
	window.parent.setUploadParam(info.fileid,_fileName);
};


/** @Bind #autoUploadAction.onFilesAdded */
!function(self,arg){
	var file = arg.files[0];
	_fileName = file.name;
};

/** @Bind #autoUploadAction.onUploadProgress */
!function(arg, autoUploadProgressBar) {
	autoUploadProgressBar.set("value", arg.total.percent);
};


