/** @Bind #dgshow.onDataRowDoubleClick */
!function(dgshow,tcShow,dsPrintCost,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	if (_id) {
		dsPrintCost.set('parameter',_id);
		dsPrintCost.flushAsync();
	}
	tcShow.set('currentTab',ctinfo);
};
/** @Bind #tbbInsert.onClick */
!function(dgshow,tbbInsert,tcShow,dsPrintCost,ctinfo){
	var dataset =dgshow.get("dataSet");
	var row = dataset.getData("#");
	var _id= row.get("projectId");
	dsPrintCost.clear();
	dsPrintCost.insert({'projectId':_id});
	tcShow.set('currentTab',ctinfo);
};

/** @Bind #btnPrint.onClick  */
!function(dsPrintCost){
	var ds=dsPrintCost.getData();
	var projectId=ds.get("projectId");
	window.open("cn.com.oking.view.input.print.projectDetails.d?projectId="+projectId);
};

//子页面想父页面返回一个dataset
window.rvDataset = function(){
	var ds=view.get("#dsPrintCost");
	return ds;
};






/** @Bind #btnCount.onClick    */
!function(){
	//合计费用的计算
	var allcount=0;
	var printCount = view.get("#printCount").get("value");
	var printPrice = view.get("#printPrice").get("value");
	if (isNotNull(printCount,printPrice)) {
		allcount+=printCount*printPrice;
	}
	var copyCount = view.get("#copyCount").get("value");
	var copyPrice = view.get("#copyPrice").get("value");
	if (isNotNull(copyCount,copyPrice)) {
		allcount+=copyCount*copyPrice;
	}
	var colorPrintCount = view.get("#colorPrintCount").get("value");
	var colorPrintPrice = view.get("#colorPrintPrice").get("value");
	if (isNotNull(colorPrintCount,colorPrintPrice)) {
		allcount+=colorPrintCount*colorPrintPrice;
	}
	var bindCount = view.get("#bindCount").get("value");
	var bindPrice = view.get("#bindPrice").get("value");
	if (isNotNull(bindCount,bindPrice)) {
		allcount+=bindCount*bindPrice;
	}
	view.get("#dsPrintCost").getData().set("totalPrice",allcount);
	//如果总价为0，就禁用保存按钮
	if (allcount==0) {
		view.set("#saveAction.disabled",true);
	}else{
		view.set("#saveAction.disabled",false);
	}
};




//判断传入的两个参数不能为""、null、0,否则返回false
function isNotNull(str1,str2){
	if (str1!=""&&str1!=null&&str1!=0) {
		if (str2!=""&&str2!=null&&str2!=0) {
			return true;
		}else{
			return false;
		}
	}else{
		return false;
	}
}



