/** @Bind #dgshow.onDataRowDoubleClick */
!function(dgshow,tcShow,projectBasicInfoSet,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		projectBasicInfoSet.set('parameter',_id);
		projectBasicInfoSet.flushAsync();
	}
	tcShow.set('currentTab',ctinfo);
};
