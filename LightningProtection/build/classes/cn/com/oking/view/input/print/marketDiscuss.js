/** @Bind #DiscussSituationSet.onReady */
!function(DiscussSituationSet){
	var project_id="${request.getParameter('projectId')}";
	DiscussSituationSet.set("parameter",project_id);
	DiscussSituationSet.flushAsync();

};
