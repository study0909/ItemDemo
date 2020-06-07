<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div><a href="${pageContext.request.contextPath}/views/tab/add.jsp"><button>添加</button></a></div>
<body>
    <%-- <form action="${pageContext.request.contextPath}/rl/getOne" method="post"> --%>
    <table width="98%" border="0" cellpadding="1" cellspacing="1" bgcolor="lightcyan" align="center" style="margin-top:8px">
                <tr align="center" bgcolor="lightcyan   " height="22" id="tr2">
                    <th >序号</th>
                    <th >站号</th>
                    <th >站点名称</th>
                    <th >温度</th>
                    <th >压力</th>
                    <th >热量表</th>
                    <th >阀控信息</th>
                    <th >更新时间</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${sj }" var="r">
                <tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
                    <td>${r.id }</td>
                    <td>${r.zhanhao }</td>
                    <td><a href="${pageContext.request.contextPath}/rl/getOne?id=${r.id }">${r.zhanname }</a></td>
                    <td>${r.sj.wendu }</td>
                    <td>${r.sj.yali }</td>
                    <td>${r.sj.reliang }</td>
                    <td>${r.sj.fakong }</td>
                    <td>${r.time }</td>
                    <td><a href="${pageContext.request.contextPath}/rl/delete?id=${r.id }">删除</a></td>
                </tr>
                </c:forEach>
        </table>
        <!-- </form> -->
</body>
</html>