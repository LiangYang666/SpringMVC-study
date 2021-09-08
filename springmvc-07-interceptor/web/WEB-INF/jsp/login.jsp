<%--
  Created by IntelliJ IDEA.
  User: LiangYang
  Date: 2021/8/24
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>
<form method="post" action="${pageContext.request.contextPath}/user/login">
    用户名:<input type="text" name="username">
    密 码:<input type="text" name="password">
    <input type="submit" value="登录">
</form>

</body>
</html>
