<%@ page language="java"  pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>menu</title>
<link rel="stylesheet" href="skin/css/base.css" type="text/css" />
<link rel="stylesheet" href="skin/css/menu.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script language='javascript'>
    var curopenItem = '1';
</script>
<script language="javascript" type="text/javascript"
    src="skin/js/frame/menu.js"></script>
<script type="text/javascript" src="js/jquery-1.8.1.js"></script>
<base target="main" />
</head>
<body target="main" bgcolor="royalblue ">
    <table  width='99%' height="100%" border='0' cellspacing='0' cellpadding='0' bgcolor="grey ">
        <tr><td style='padding-left:3px;padding-top:8px' valign='top' id="menuss">

<dl class='bitem'>
<dt onclick=showHide("items1_1")><b>管理</b></dt>

<dd style='display:block' class='sitem' id=items1_1>
<ul class='sitemu' id=0>
<li><a href='${pageContext.request.contextPath}/rl/getSj' target='main'>站点列表</a> </li>
</ul>
</dd>
</dl>

        </td>
        </tr>
    </table>
</body>
</html>