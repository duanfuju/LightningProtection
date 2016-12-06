/** @Bind #dgshow.onDataRowDoubleClick */
!function(dgshow,tcShow,DiscussSituationSet,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		DiscussSituationSet.set('parameter',_id);
		DiscussSituationSet.flushAsync();
	}
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #tbbInsert.onClick */
!function(dgshow,tbbInsert,tcShow,DiscussSituationSet,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	DiscussSituationSet.clear();
	DiscussSituationSet.insert({'projectId':_id});
	tcShow.set('currentTab',ctinfo);
};



/** @Bind #btnPrint.onClick  */
!function(DiscussSituationSet){
	var ds=DiscussSituationSet.getData();
	var projectId=ds.get("projectId");
	window.open("cn.com.oking.view.input.print.marketDiscuss.d?projectId="+projectId);
};
