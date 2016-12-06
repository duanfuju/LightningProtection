var projectId="";
/** @Bind #dgshow.onDataRowDoubleClick */
!function(dgshow,tcShow,dsReview,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		dsReview.set('parameter',_id);
		dsReview.flushAsync();
	}
	projectId=_id;
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #tbbInsert.onClick */
!function(dgshow,tbbInsert,tcShow,dsReview,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	dsReview.clear();
	projectId=_id;
	dsReview.insert({'projectId':_id});
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #btnPrint.onClick  */
!function(){
	window.open("cn.com.oking.view.input.print.Review.d?projectId="+projectId);
};