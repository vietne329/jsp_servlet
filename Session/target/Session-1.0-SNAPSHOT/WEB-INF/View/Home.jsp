<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/3/2021
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>
        Welcome: <%=session.getAttribute("sess")%>
        <br>

        <form action="LogoutController" method="post">
            <input type="submit" value="Logout">

        </form>


    </h1>
</body>
</html>
