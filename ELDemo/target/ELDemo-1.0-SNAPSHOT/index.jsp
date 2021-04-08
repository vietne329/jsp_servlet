<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%--<form action="login_process.jsp" method="post">--%>
<%--    <input type="text" name="username">--%>
<%--    <input type="submit" value="Login">--%>
<%--</form>--%>

<form action="index_process.jsp" method="post">
    <input type="text" name="username">
    <input type="submit" value="Login2">
</form>

</body>
</html>