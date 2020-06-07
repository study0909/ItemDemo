<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>对标管理</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/skin/css/base.css">
    <script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="application/javascript" src="${pageContext.request.contextPath}/eacharjs/echarts.common.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/date/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/date/WdatePicker.js"></script>
    <script type="text/javascript">
    	var dateSkin="blue";
    	$(document).ready(function() {
    		$("#st").focus(function(){
                WdatePicker({skin:dateSkin,readOnly:true,dateFmt:'yyyy-MM-dd'})
            });
            $("#et").focus(function(){
                WdatePicker({skin:dateSkin,readOnly:true,dateFmt:'yyyy-MM-dd'})
            });
			
			//获取所有企业
			$.ajax({
				url:"${pageContext.request.contextPath}/db/getQiye",
				type:"post",
				dataType:"json",
				success:function(data){
					$.each(data,function(index,d){
						$("#dname").append("<option value='"+d.dacname+"'>"+d.dacname+"</option>")
					})
				}
			})
		})
		function sear() {
    		// 基于准备好的dom，初始化echarts实例
            var myChart = echarts.init(document.getElementById('box'));
    		var qiye='';
			var year=[];
			var yye=[];
    		$.ajax({
    			url:"${pageContext.request.contextPath}/db/getYye",
    			type:"post",
    			data:{"dname":$("#dname").val(),"st":$("#st").val(),"et":$("#et").val()},
    			dataType:"json",
    			success:function(data){
    				$.each(data,function(index,y){
    					var d=new Date(y.datime);
    					year.push(d.getFullYear());
    					qiye=y.dacname;
    					yye.push(y.daturnover);
    				});
    				// 指定图表的配置项和数据
    	            var option = {
    	                title: {
    	                    text: '营业额分析'
    	                },
    	                tooltip: {},
    	                legend: {
    	                },
    	                xAxis: {
    	                    data: ["2015","2016","2017","2018","2019","2020"]
    	                },
    	                yAxis: {
    	                	type: 'value'
    	                },
    	                series: [{
    	                    name: qiye,
    	                    type: 'line',
    	                    data: yye
    	                }]
    	            };

    	            // 使用刚指定的配置项和数据显示图表。
    	            myChart.setOption(option);
    			}
    		})
		}
    </script>
</head>
<body leftmargin="8" topmargin="8" background='skin/images/allbg.gif'>

<form  method="post">
    <table width='98%' border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center"
           style="margin-top:8px">
        <tr bgcolor='#EEF4EA'>
            <td background='skin/images/wbg.gif' align='center'>
                <table border='0' cellpadding='0' cellspacing='0'>
                    <tr>
                        <td width='90' align='center'>搜索条件：</td>
                        <td width='100'>
                            <input type="hidden" value="1" name="pageNO" id="pn">
                            <select name="dname" id="dname" class="style='width:120px'">
                                <option>选择企业</option>
                            </select>
                        </td>
                        <td width='70'>
                            时间段：
                        </td>
                        <td width='300'>
                            <input type="text" id="st" name="st" style='width:120px'>---
                            <input type="text" id="et" name="et" style='width:120px'>
                        </td>
                        <td>
                            &nbsp;&nbsp;&nbsp;<input type="button" onclick="sear()" value="查询" class="np">
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</form>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
<tr>
 <td height="26" background="skin/images/newlinebg3.gif">
  <table width="58%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  <td >
    当前位置:对标管理>>对标分析
 </td>
 </tr>
</table>
</td>
</tr>
</table>

<div id="box" style="width:800px;height:600px;"></div>

</body>
</html>