var projectId="${request.getParameter('projectId')}";
/** @Bind #dsReview.onReady */
!function(dsReview){
	dsReview.set("parameter",projectId);
	dsReview.flushAsync();
};
