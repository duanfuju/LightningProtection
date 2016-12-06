var projectId="${request.getParameter('projectId')}";

/** @Bind #LoadAction.onFailure  */
!function(){
	arg.processDefault = false;
	dorado.MessageBox.alert("我就知道一定会出错！\n错误原因："+arg.error);
	
};

/** @Bind #LoadAction.onReady */
!function(hcConn){
	 var action = view.get("#LoadAction");
	 action.set("parameter", projectId).execute(function(info){
		 	var json=eval('(' + info + ')');
		 	view.get("#checkPerson").set("text",json.checkPerson);
			view.get("#checkDate").set("text",json.checkDate);
			view.get("#correctionFactor").set("text",json.correctionFactor);
			view.get("#weather").set("text",json.weather);
		   	view.get("#wd1").set("text",json.wd1);
            view.get("#wd2").set("text",json.wd2);
            view.get("#wd3").set("text",json.wd3);
            view.get("#wd4").set("text",json.wd4);
            view.get("#jd1").set("text",json.jd1);
            view.get("#jd2").set("text",json.jd2);
            view.get("#jd3").set("text",json.jd3);
            view.get("#jd4").set("text",json.jd4);
            view.get("#v11").set("text",json.v11);
            view.get("#v12").set("text",json.v12);
            view.get("#v13").set("text",json.v13);
            view.get("#v14").set("text",json.v14);
            view.get("#v21").set("text",json.v21);
            view.get("#v22").set("text",json.v22);
            view.get("#v23").set("text",json.v23);
            view.get("#v24").set("text",json.v24);
            view.get("#v31").set("text",json.v31);
            view.get("#v32").set("text",json.v32);
            view.get("#v33").set("text",json.v33);
            view.get("#v34").set("text",json.v34);
            view.get("#v41").set("text",json.v41);
            view.get("#v42").set("text",json.v42);
            view.get("#v43").set("text",json.v43);
            view.get("#v44").set("text",json.v44);
            view.get("#v51").set("text",json.v51);
            view.get("#v52").set("text",json.v52);
            view.get("#v53").set("text",json.v53);
            view.get("#v54").set("text",json.v54);
            view.get("#v61").set("text",json.v61);
            view.get("#v62").set("text",json.v62);
            view.get("#v63").set("text",json.v63);
            view.get("#v64").set("text",json.v64);
            view.get("#v71").set("text",json.v71);
            view.get("#v72").set("text",json.v72);
            view.get("#v73").set("text",json.v73);
            view.get("#v74").set("text",json.v74);
            view.get("#v81").set("text",json.v81);
            view.get("#v82").set("text",json.v82);
            view.get("#v83").set("text",json.v83);
            view.get("#v84").set("text",json.v84);
            view.get("#v91").set("text",json.v91);
            view.get("#v92").set("text",json.v92);
            view.get("#v93").set("text",json.v93);
            view.get("#v94").set("text",json.v94);
            view.get("#v101").set("text", json.v101);
            view.get("#v102").set("text", json.v102);
            view.get("#v103").set("text", json.v103);
            view.get("#v104").set("text", json.v104);
			
     });
};