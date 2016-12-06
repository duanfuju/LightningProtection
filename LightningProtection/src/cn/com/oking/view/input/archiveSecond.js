var projectId="";
/** @Bind #dgShow.onDataRowDoubleClick */
!function(dgShow,tcShow,dsRemr,ctinfo){
	var dataset =dgShow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		dsRemr.set('parameter',_id);
		dsRemr.flushAsync();
	}
	projectId=_id;
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #tbbInsert.onClick */
!function(dgShow,tbbInsert,tcShow,dsRemr,ctinfo){
	var dataset =dgShow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	dsRemr.clear();
	projectId=_id;
	dsRemr.insert({'projectId':_id});
	tcShow.set('currentTab',ctinfo);
};



/** @Bind #btnPrint.onClick  */
!function(){
	if (projectId) {
		alert("请先添加雷评技术会谈记录的数据");
		return;
	}
	window.open("cn.com.oking.view.input.print.archiveSecond.d?projectId="+projectId);
};

//子页面想父页面返回一个dataset
window.rvDataset = function(){
	var ds=view.get("#dsRemr");
	return ds;
};