/** @Bind #dgshow.onDataRowDoubleClick */
!function(dgshow,tcShow,dsProjectConclusion,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		dsProjectConclusion.set('parameter',_id);
		dsProjectConclusion.flushAsync();
	}
	projectId=_id;
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #tbbInsert.onClick */
!function(dgshow,tbbInsert,tcShow,dsProjectConclusion,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	dsProjectConclusion.clear();
	projectId=_id;
	dsProjectConclusion.insert({'projectId':_id});
	tcShow.set('currentTab',ctinfo);
};