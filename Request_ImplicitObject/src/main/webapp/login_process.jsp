<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/2/2021
  Time: 11:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Process</title>
</head>
<body>
    <%
    String name = request.getParameter("username");
    request.setAttribute("user",name);

    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    rd.forward(request,response);
    %>
</body>
</html>
