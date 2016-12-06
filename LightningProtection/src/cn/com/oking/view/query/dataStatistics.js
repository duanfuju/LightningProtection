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



/** @Bind #ctChart.onClick */
!function(dsShow,chartA,chartB){
	
	var labList = new Array();
	dsShow.getData().each(function(entity){
		var key = entity.get("projectName");
		var aLabel = {
			"$type":"AxisLabel",
			"text":key
			};
		labList.push(aLabel);
	});
	var XAxisLabels = {
			"$type":"ofc.axis.XAxisLabels",
			"rotate":-45,
			"labels": labList
			};
	
	var xAxis = chartA.get("xAxis");
	xAxis.set("labels",XAxisLabels);
	
	var xAxisB = chartB.get("xAxis");
	xAxisB.set("labels",XAxisLabels);
};


















/** @Bind #btnSelect.onClick */
!function(ajaxSelect,dsDsConditions,dsShow){
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
			projectIndustryRemark:projectIndustryRemark
	};
	ajaxSelect.set("parameter",paramer).execute(function(data){
		dsShow.clear();
		dsShow.setData(data);
		//dsShow.flush();
	});
	
		
};
