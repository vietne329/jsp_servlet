<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/3/2021
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h1>Example Session</h1>

<h1><%=request.getAttribute("msg")!= null ? request.getAttribute("msg") : " "%> </h1>

<form action="LoginController" method="post">
    <input type="text" name="username">
    <br>
    <br>
    <input type="password" name="password">
    <br>
    <br>
    <input type="submit" value="Login">
</form>
</body>
</html>
