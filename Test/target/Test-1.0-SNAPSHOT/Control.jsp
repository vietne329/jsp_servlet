<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/2/2021
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        // use getParameter
        String name = request.getParameter("username");
        out.println(name);

    %>
</body>
</html>
