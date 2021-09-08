<%--
  Created by IntelliJ IDEA.
  User: LiangYang
  Date: 2021/8/24
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
      // $.post()  ==  jQuery.post() 即 $ 为 jQuery
      function a(){
        jQuery.post({
          url: '${pageContext.request.contextPath}/a1',
          data: {"name": $("#username").val()},
          success: function(data){
            alert(data);
          }
        })
      }
    </script>
  </head>
  <body>
  用户名:<input type="text" id="username" onblur="a()">
  </body>
</html>
