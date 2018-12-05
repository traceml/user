<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/4
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
  </head>
  <body>
  这是一个用户登录<<br>
  <form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username"><br>
    密  码：<input type="password" name="password"><br>
    <input type="submit" value="登录">
  </form>
  </body>
</html>
