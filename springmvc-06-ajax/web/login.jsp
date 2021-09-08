<%--
  Created by IntelliJ IDEA.
  User: LiangYang
  Date: 2021/8/24
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
        function a1() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data: {"name":$("#username").val()},
                success: function (data) {
                    // console.log(data);
                    if(data.toString()=="OK"){
                        $("#userInfo").css("color", "green");
                    }else {
                        $("#userInfo").css("color", "red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data: {"password":$("#password").val()},
                success: function (data) {
                    if(data.toString()=="OK"){
                        $("#pwdInfo").css("color", "green");
                    }else {
                        $("#pwdInfo").css("color", "red");
                    }
                    $("#pwdInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
<div>
    <form method="post" action="">
        <p>
            用户名:<input type="text" id="username" onblur="a1()">
            <span id="userInfo"></span>
        </p>
        <p>
            密码:<input type="password" id="password" onblur="a2()">
            <span id="pwdInfo"></span>
        </p>
        <p>
            <input type="submit" value="登录">
        </p>
    </form>
</div>

</body>
</html>
