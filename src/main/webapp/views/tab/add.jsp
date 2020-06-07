<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="form2" id="addcus" action="${pageContext.request.contextPath}/rl/add" method="post">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
    <td height="24" colspan="2" background="skin/images/tbg.gif">&nbsp;添加信息&nbsp;</td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">站号：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
        <input name="zhanhao"/>
    </td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">站点名称：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">

        <input name="zhanname"/>

    </td>
</tr>
<!-- <tr >
    <td align="right" bgcolor="#FAFAF1" height="22">温度：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">

        <input name="wendu"/></td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">压力：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
        <input name="yali"/></td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">热量表：</td>
    <td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
        <input name="reliang"/>
    </td>
</tr>
<tr >
    <td align="right" bgcolor="#FAFAF1" height="22">阀控信息：</td>
    <td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
        <input name="fakong"/>
    </td>
</tr> -->

<tr >
    <td align="right" bgcolor="#FAFAF1" >更新时间：</td>
    <td colspan=3 align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" >
       <input name="time"/>
    </td>
</tr>


<tr bgcolor="#FAFAF1">
<td height="28" colspan=4 align=center>
    &nbsp;
    <input type="submit" value="保存">
    <a href="${pageContext.request.contextPath}/rl/getSj" class="coolbg">返回</a>
</td>
</tr>
</table>

</form>

</body>
</html>