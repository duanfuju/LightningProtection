/** @Bind #dsRemr.onReady */
!function(dsRemr){
	var project_id="${request.getParameter('projectId')}";
	dsRemr.set("parameter",project_id);
	dsRemr.flushAsync();
};
