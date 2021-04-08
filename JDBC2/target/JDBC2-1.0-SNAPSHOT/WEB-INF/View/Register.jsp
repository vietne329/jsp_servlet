<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/3/2021
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Account</title>
</head>
<body>
    <h1>Register Account</h1>

    <h2><%=request.getAttribute("msg") != null ? request.getAttribute("msg") : " " %></h2>

    <form action="RegisterController" method="post">
        Username: <input type="text" name="username">
        <br>
        <br>
        Password: <input type="password" name="password">
        <br>
        <br>
        <input type="submit" value="Sign up">
    </form>
</body>
</html>
