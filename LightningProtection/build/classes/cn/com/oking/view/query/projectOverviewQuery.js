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
		alert("请选择时间");
		return;
	}
	if (data.validate("endDate") == "invalid") {
		alert("请选择时间");
		return;
	}
	
	var endDate=data.get("endDate");
	var region=data.get("region");
	var startDate=data.get("startDate");
	var reportPrint=data.get("reportPrint");
	var drawingsHas=data.get("drawingsHas");
	var reportReceive=data.get("reportReceive");
	var costArriveWay=data.get("costArriveWay");
	var reportWitePerson=data.get("reportWitePerson");
	var reportCheckPersonnel=data.get("reportCheckPersonnel");
	var signingPerson=data.get("signingPerson");
	var projectHasDiscount=data.get("projectHasDiscount");
	var gerHave=data.get("gerHave");
	var projectIndustry=data.get("projectIndustry");
	var projectIndustryRemark=data.get("projectIndustryRemark");
	var	lightProtectCategory=data.get("lightProtectCategory");
	var	groundFlashDensity=data.get("groundFlashDensity");
	var	buildingHeight=data.get("buildingHeight");
	var	maxLightCurrent=data.get("maxLightCurrent");
	var	avgLightCurrent=data.get("avgLightCurrent");
	var	eveProtectLevel=data.get("eveProtectLevel");
	var	evaluatePartition=data.get("evaluatePartition");
	
	var paramer={
			endDate:endDate,
			region:region,
			startDate:startDate,
			reportPrint:reportPrint,
			drawingsHas:drawingsHas,
			reportReceive:reportReceive,
			costArriveWay:costArriveWay,
			reportWitePerson:reportWitePerson,
			reportCheckPersonnel:reportCheckPersonnel,
			signingPerson:signingPerson,
			projectHasDiscount:projectHasDiscount,
			gerHave:gerHave,
			projectIndustry:projectIndustry,
			projectIndustryRemark:projectIndustryRemark,
			lightProtectCategory:lightProtectCategory,
			groundFlashDensity:groundFlashDensity,
			buildingHeight:buildingHeight,
			maxLightCurrent:maxLightCurrent,
			avgLightCurrent:avgLightCurrent,
			eveProtectLevel:eveProtectLevel,
			evaluatePartition:evaluatePartition
	};
	dsShow.set("parameter",paramer);
	dsShow.flushAsync();
};