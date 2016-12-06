var project_id="${request.getParameter('projectId')}";
/** @Bind #LoadAction.onFailure  */
!function(){
	arg.processDefault = false;
	dorado.MessageBox.alert("我就知道一定会出错！\n错误原因："+arg.error);	
};

/** @Bind #LoadAction.onReady */
!function(hcConn){
	//project_id="14301020570117225162";
	 var action = view.get("#LoadAction");
	 action.set("parameter", project_id).execute(function(info){
		 	var json=eval('(' + info + ')');
		 	view.get("#rpacNumber").set("text",json.rpacNumber);
			view.get("#organizer").set("text",json.organizer);
			view.get("#supervisor").set("text",json.supervisor);
			view.get("#undertake1").set("text",json.undertake1);
		   	view.get("#signForPeople1").set("text",json.signForPeople1);
            view.get("#date1").set("text",json.date1);
            view.get("#undertake2").set("text",json.undertake2);
            view.get("#signForPeople2").set("text",json.signForPeople2);
            view.get("#date2").set("text",json.date2);
            view.get("#undertake3").set("text",json.undertake3);
            view.get("#signForPeople3").set("text",json.signForPeople3);
            view.get("#date3").set("text",json.date3);
            view.get("#undertake4").set("text",json.undertake4);
            view.get("#signForPeople4").set("text",json.signForPeople4);
            view.get("#date4").set("text",json.date4);
            view.get("#undertake5").set("text",json.undertake5);
            view.get("#signForPeople5").set("text",json.signForPeople5);
            view.get("#date5").set("text",json.date5);
            view.get("#undertake6").set("text",json.undertake6);
            view.get("#signForPeople6").set("text",json.signForPeople6);
            view.get("#date6").set("text",json.date6);
            if (json.measuresSituation1=="true") {
            	view.get("#measuresSituation1").set("checked","true");
			}
            view.get("#implControlMain1").set("text",json.implControlMain1);
            view.get("#implPeople1").set("text",json.implPeople1);
            view.get("#review1").set("text",json.review1);
            if (json.measuresSituation2=="true") {
            	view.get("#measuresSituation2").set("checked","true");
			}
            if (json.measuresSituation3=="true") {
            	view.get("#measuresSituation3").set("checked","true");
			}
            view.get("#implControlMain3").set("text",json.implControlMain3);
            view.get("#implPeople3").set("text",json.implPeople3);
            view.get("#review3").set("text",json.review3);
            if (json.measuresSituation4=="true") {
            	view.get("#measuresSituation4").set("checked","true");
			}
            view.get("#implControlMain4").set("text",json.implControlMain4);
            view.get("#implPeople4").set("text",json.implPeople4);
            view.get("#review4").set("text",json.review4);
            view.get("#checkKey").set("text",json.checkKey);
            view.get("#noImpl").set("text",json.noImpl);
            view.get("#checkDepartment").set("text",json.checkDepartment);
            view.get("#checkPeople").set("text",json.checkPeople);
            view.get("#checkDate").set("text",json.checkDate);
            view.get("#remark").set("text",json.remark);
     });
};
