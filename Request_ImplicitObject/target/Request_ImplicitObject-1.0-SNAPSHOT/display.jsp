<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/2/2021
  Time: 11:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Page</title>
</head>
<body>
    <table border="1">
        <c:forEach items="list_user" var ="list">
            <tr>
                <td>
                    ${list.name1}
                </td>

                <td>
                        ${list.name2}
                </td>
             </tr>
        </c:forEach>

    </table>
</body>
</html>
