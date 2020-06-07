<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/skin/css/tab.css">
</head>

<body>
<div class="nav">
    <a href="${pageContext.request.contextPath}/views/tab/gongyitu.jsp">工艺图</a>
    <a href="">数据汇总</a>
    <a href="">循环泵</a>
    <a href="">补水泵</a>
    <a href="">电动阀</a>
</div>
&nbsp;
<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
    <td height="24" colspan="2" background="skin/images/tbg.gif">&nbsp;${r.rljk.zhanname }站点信息&nbsp;</td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22" >站号：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">${r.rljk.zhanhao }</td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">站点名称：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">${r.rljk.zhanname }</td>
</tr>
<c:forEach items="${r.sj }" var="sj">
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">温度：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">${sj.wendu }</td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">压力：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">${sj.yali }</td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">热量表：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">${sj.reliang }</td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">阀控：</td>
    <td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">${sj.fakong }</td>
</tr>
</c:forEach>
<tr >
    <td align="right" bgcolor="#FAFAF1" >更新时间：</td>
    <td colspan=3 align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" >
       ${r.rljk.time }
    </td>
</tr>



<tr bgcolor="#FAFAF1">
<td height="28" colspan=4 align=center>
    &nbsp;
    <a href="${pageContext.request.contextPath}/rl/getSj" class="coolbg">返回</a>
</td>
</tr>
</table>

</body>
</html>