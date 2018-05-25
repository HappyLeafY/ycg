<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>shiro test 登录</title>
</head>
<body>
<h1>欢迎登录！${user.UserName}</h1>
<form action="${pageContext.request.contextPath}/loginUser" method="post">
          账号<input type="text" name="userName"><br>
          密码    <input type="password" name="passWord"><br>
          <input type="submit" value="提交">

</form>

</body>
</html>