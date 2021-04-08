<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/4/2021
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

    <h2><%=request.getAttribute("msg_student") != null ? request.getAttribute("msg_student") : " " %></h2>

    <h3>Form Personel</h3>
    <form action="HomeController" method="post">
        <input type="text" name="student_name">

           <br>
           <br>
           <h3>Provinces selection:</h3>
        <select name="dropdownprovince">
        <c:forEach items="${list_province}" var="l">

                <option value="${l.id}"> ${l.name}</option>

        </c:forEach>
        </select>

           <input type="submit" value="Register">
    </form>
</body>
</html>
