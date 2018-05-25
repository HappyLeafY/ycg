<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>shiro test 首页</title>
</head>
<body>

	<h1>欢迎${user.userName}光临！请选择你的操作：</h1>
	<br>
	<ul>
	  <%-- alert(<%=session.getAttribute("user")%>); --%>
	
		<shiro:hasPermission name="add">
			<li>增加</li>
		</shiro:hasPermission>
		<shiro:hasPermission name="delete">
			<li>删除</li>
		</shiro:hasPermission>
		<shiro:hasPermission name="update">
			<li>修改</li>
		</shiro:hasPermission>
		<shiro:hasPermission name="query">
			<li>查询</li>
		</shiro:hasPermission>


	</ul>

      <a href="${pageContext.request.contextPath}/logOut">点我注销</a>
</body>
</html>