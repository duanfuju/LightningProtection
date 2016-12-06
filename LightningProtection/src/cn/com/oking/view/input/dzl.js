var p="${request.getParameter('projectId')}";


/** @Bind #btnPrint.onClick  */
!function(){
	window.open("cn.com.oking.view.input.print.dzl.d?projectId="+p);
};

/** @Bind #LoadAction.onFailure  */
!function(){
	arg.processDefault = false;
	dorado.MessageBox.alert("我就知道一定会出错！\n错误原因："+arg.error);
};

/** @Bind #LoadAction.onReady */
!function(hcConn){
	p="${request.getParameter('projectId')}";
	 var action = view.get("#LoadAction");
	 action.set("parameter", p).execute(function(info){
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


/** @Bind #btnSubmit.onClick */
!function(){
	
	 var checkDate=view.get("#checkDate").get("text");
	 var correctionFactor=view.get("#correctionFactor").get("text");
	 var weather=view.get("#weather").get("text");
	 var checkPerson=view.get("#checkPerson").get("text");
	 var wd1 = view.get("#wd1").get("text");
     var wd2 = view.get("#wd2").get("text");
     var wd3 = view.get("#wd3").get("text");
     var wd4 = view.get("#wd4").get("text");
     var jd1 = view.get("#jd1").get("text");
     var jd2 = view.get("#jd2").get("text");
     var jd3 = view.get("#jd3").get("text");
     var jd4 = view.get("#jd4").get("text");
     var v11 = view.get("#v11").get("text");
     var v12 = view.get("#v12").get("text");
     var v13 = view.get("#v13").get("text");
     var v14 = view.get("#v14").get("text");
     var v21 = view.get("#v21").get("text");
     var v22 = view.get("#v22").get("text");
     var v23 = view.get("#v23").get("text");
     var v24 = view.get("#v24").get("text");
     var v31 = view.get("#v31").get("text");
     var v32 = view.get("#v32").get("text");
     var v33 = view.get("#v33").get("text");
     var v34 = view.get("#v34").get("text");
     var v41 = view.get("#v41").get("text");
     var v42 = view.get("#v42").get("text");
     var v43 = view.get("#v43").get("text");
     var v44 = view.get("#v44").get("text");
     var v51 = view.get("#v51").get("text");
     var v52 = view.get("#v52").get("text");
     var v53 = view.get("#v53").get("text");
     var v54 = view.get("#v54").get("text");
     var v61 = view.get("#v61").get("text");
     var v62 = view.get("#v62").get("text");
     var v63 = view.get("#v63").get("text");
     var v64 = view.get("#v64").get("text");
     var v71 = view.get("#v71").get("text");
     var v72 = view.get("#v72").get("text");
     var v73 = view.get("#v73").get("text");
     var v74 = view.get("#v74").get("text");
     var v81 = view.get("#v81").get("text");
     var v82 = view.get("#v82").get("text");
     var v83 = view.get("#v83").get("text");
     var v84 = view.get("#v84").get("text");
     var v91 = view.get("#v91").get("text");
     var v92 = view.get("#v92").get("text");
     var v93 = view.get("#v93").get("text");
     var v94 = view.get("#v94").get("text");
     var v101 = view.get("#v101").get("text");
     var v102 = view.get("#v102").get("text");
     var v103 = view.get("#v103").get("text");
     var v104 = view.get("#v104").get("text");
	
	var parameter={
			projectId:p,
			checkDate:checkDate,
			correctionFactor:correctionFactor,
			weather:weather,
			checkPerson:checkPerson,
			wd1:wd1,
			wd2:wd2,
			wd3:wd3,
			wd4:wd4,
			jd1:jd1,
			jd2:jd2,
			jd3:jd3,
			jd4:jd4,
			v11:v11,
			v12:v12,
			v13:v13,
			v14:v14,
			v21:v21,
			v22:v22,
			v23:v23,
			v24:v24,
			v31:v31,
			v32:v32,
			v33:v33,
			v34:v34,
			v41:v41,
			v42:v42,
			v43:v43,
			v44:v44,
			v51:v51,
			v52:v52,
			v53:v53,
			v54:v54,
			v61:v61,
			v62:v62,
			v63:v63,
			v64:v64,
			v71:v71,
			v72:v72,
			v73:v73,
			v74:v74,
			v81:v81,
			v82:v82,
			v83:v83,
			v84:v84,
			v91:v91,
			v92:v92,
			v93:v93,
			v94:v94,
			v101:v101,
			v102:v102,
			v103:v103,
			v104:v104
			
	};
	 $.ajax({
	    	type: "POST",
			dataType:"HTML",
			url:"dzlServlet",
			data:parameter,
			success:function(){
				alert("保存成功");
			},
			error:function(){
				alert("失败,请检查输入是否合法");
			}
		});
};
