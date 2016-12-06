var projectId="";
/** @Bind #dgshow.onDataRowDoubleClick */
!function(dgshow,tcShow,projectBasicInfoSet,technicalParamsSet,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		projectBasicInfoSet.set('parameter',_id);
		projectBasicInfoSet.flushAsync();
		technicalParamsSet.set('parameter',_id);
		technicalParamsSet.flushAsync();
	}
	projectId=_id;
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #tbbInsert.onClick */
!function(dgshow,tbbInsert,tcShow,technicalParamsSet,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	technicalParamsSet.clear();
	projectId=_id;
	technicalParamsSet.insert({'projectId':_id});
	tcShow.set('currentTab',ctinfo);
};






/** @Bind #btndzl.onClick */
!function(){
	location.href="cn.com.oking.view.input.dzl.d?projectId="+projectId;
};




//子页面想父页面返回一个dataset
window.rvDataset = function(){
	var ds=view.get("#technicalParamsSet");
	return ds;
};
//子页面想父页面返回一个dataset
window.rvDataset2 = function(){
	var ds=view.get("#projectBasicInfoSet");
	return ds;
};