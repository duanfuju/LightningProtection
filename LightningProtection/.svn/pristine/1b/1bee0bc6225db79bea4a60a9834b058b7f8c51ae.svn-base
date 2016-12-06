var p="${request.getParameter('projectId')}";
/** @Bind #LoadAction.onFailure  */
!function(){
	arg.processDefault = false;
	dorado.MessageBox.alert("我就知道一定会出错！\n错误原因："+arg.error);
	
};


/** @Bind #btnPrint.onClick  */
!function(){
	window.open("cn.com.oking.view.input.print.normal.d?projectId="+p);
};
/** @Bind #btngo.onClick  */
!function(){
	history.go(-1);
};
/** @Bind #LoadAction.onReady */
!function(hcConn){
	 p="${request.getParameter('projectId')}";
	 var action = view.get("#LoadAction");
	 action.set("parameter", p).execute(function(info){
		 if (info==null) {
			 view.get("#projectId").set("text",p);
		}
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


/** @Bind #btnSubmit.onClick */
!function(){
	
	 var rpacNumber=view.get("#rpacNumber").get("text");
	 var organizer=view.get("#organizer").get("text");
	 var supervisor=view.get("#supervisor").get("text");
	 var undertake1=view.get("#undertake1").get("text");
	 var signForPeople1 = view.get("#signForPeople1").get("text");
     var date1 = view.get("#date1").get("text");
     var undertake2 = view.get("#undertake2").get("text");
     var signForPeople2 = view.get("#signForPeople2").get("text");
     var date2 = view.get("#date2").get("text");
     var undertake3 = view.get("#undertake3").get("text");
     var signForPeople3 = view.get("#signForPeople3").get("text");
     var date3 = view.get("#date3").get("text");
     var undertake4 = view.get("#undertake4").get("text");
     var signForPeople4 = view.get("#signForPeople4").get("text");
     var date4 = view.get("#date4").get("text");
     var undertake5 = view.get("#undertake5").get("text");
     var signForPeople5 = view.get("#signForPeople5").get("text");
     var date5 = view.get("#date5").get("text");
     var undertake6 = view.get("#undertake6").get("text");
     var signForPeople6 = view.get("#signForPeople6").get("text");
     var date6 = view.get("#date6").get("text");
     var measuresSituation1 = view.get("#measuresSituation1").get("value");
     var implControlMain1 = view.get("#implControlMain1").get("text");
     var implPeople1 = view.get("#implPeople1").get("text");
     var review1 = view.get("#review1").get("text");
     var measuresSituation2 = view.get("#measuresSituation2").get("value");
     var measuresSituation3 = view.get("#measuresSituation3").get("value");
     var implControlMain3 = view.get("#implControlMain3").get("text");
     var implPeople3 = view.get("#implPeople3").get("text");
     var review3 = view.get("#review3").get("text");
     var measuresSituation4 = view.get("#measuresSituation4").get("value");
     var implControlMain4 = view.get("#implControlMain4").get("text");
     var implPeople4 = view.get("#implPeople4").get("text");
     var review4 = view.get("#review4").get("text");
     var checkKey = view.get("#checkKey").get("text");
     var noImpl = view.get("#noImpl").get("text");
     var checkDepartment = view.get("#checkDepartment").get("text");
     var checkPeople = view.get("#checkPeople").get("text");
     var checkDate = view.get("#checkDate").get("text");
     var remark = view.get("#remark").get("text");
	
	var parameter={
			projectId:p,
			rpacNumber:rpacNumber,
			organizer:organizer,
			supervisor:supervisor,
			undertake1:undertake1,
			signForPeople1:signForPeople1,
			date1:date1,
			undertake2:undertake2,
			signForPeople2:signForPeople2,
			date2:date2,
			undertake3:undertake3,
			signForPeople3:signForPeople3,
			date3:date3,
			undertake4:undertake4,
			signForPeople4:signForPeople4,
			date4:date4,
			undertake5:undertake5,
			signForPeople5:signForPeople5,
			date5:date5,
			undertake6:undertake6,
			signForPeople6:signForPeople6,
			date6:date6,
			measuresSituation1:measuresSituation1,
			implControlMain1:implControlMain1,
			implPeople1:implPeople1,
			review1:review1,
			measuresSituation2:measuresSituation2,
			measuresSituation3:measuresSituation3,
			implControlMain3:implControlMain3,
			implPeople3:implPeople3,
			review3:review3,
			measuresSituation4:measuresSituation4,
			implControlMain4:implControlMain4,
			implPeople4:implPeople4,
			review4:review4,
			checkKey:checkKey,
			noImpl:noImpl,
			checkDepartment:checkDepartment,
			checkPeople:checkPeople,
			checkDate:checkDate,
			remark:remark
	};
	 $.ajax({
	    	type: "POST",
			dataType:"HTML",
			url:"normal",
			data:parameter,
			success:function(){
				alert("保存成功");
			},
			error:function(){
				alert("失败,请检查输入是否合法");
			}
		});
};
