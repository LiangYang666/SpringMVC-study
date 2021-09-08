<%--
  Created by IntelliJ IDEA.
  User: LiangYang
  Date: 2021/8/24
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>主页</h1>

<span>${username}</span>
<p>
    <a href="${pageContext.request.contextPath}/user/logout">注销</a>
</p>

</body>
</html>
