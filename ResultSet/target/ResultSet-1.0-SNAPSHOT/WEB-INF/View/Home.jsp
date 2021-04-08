
<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/3/2021
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<table border="1">
    <tr>
        <th>
            Username:
        </th>

        <th>
            Password:
        </th>
        <c:forEach items="${list_account}" var="l">
    <tr>
        <td>
                ${l.username}
        </td>
        <td>
                ${l.password}
        </td>
    </tr>
    </c:forEach>
    </tr>
</table>
</body>
</html>
