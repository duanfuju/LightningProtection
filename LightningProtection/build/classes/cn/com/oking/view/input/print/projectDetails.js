/** @Bind #dsPrintCost.onReady */
!function(dsPrintCost){
	var project_id="${request.getParameter('projectId')}";
	dsPrintCost.set("parameter",project_id);
	dsPrintCost.flushAsync();
};