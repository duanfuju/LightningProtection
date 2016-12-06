/** @Bind #dsDsConditions.onReady */
/** @Bind #dsShow.onReady */
!function(dsDsConditions,dsShow){
	var cur = dsDsConditions.getData();
	var cur1 = dsShow.getData();
	if (cur == null) {
		dsDsConditions.insert();
	}
	if (cur1 == null) {
		dsShow.insert();
	}
};


/** @Bind #btnExport.onClick */
!function(dgBusinessNegotiation){
	view.get("#export2ReportAction1").execute(); 
	
};



/** @Bind #btnSelect.onClick */
!function(dsDsConditions,dsShow){
	var data = dsDsConditions.getData();
	if (data.validate("startDate") == "invalid") {
		return;
	}
	if (data.validate("endDate") == "invalid") {
		return;
	}
	var endDate=data.get("endDate");
	var startDate=data.get("startDate");
	var paramer={
			startDate:startDate,
			endDate:endDate
	};
	dsShow.set("parameter",paramer);
	dsShow.flushAsync();
};