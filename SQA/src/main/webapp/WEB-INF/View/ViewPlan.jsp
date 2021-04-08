<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/4/2021
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Quản lý học phần</title>
    <meta charset="UTF-8">
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


</head>
<body>
<header>

    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: #008080">

        <ul class="navbar-nav">
            <a  style="margin-left: 600px; color: white" href="BackHomeForward"
                class="nav-link">Quay lại</a>
        </ul>
    </nav>
</header>



<h3 style=" margin-top: 10px;text-align: center;padding-bottom: 5px">XEM KẾ HOẠCH GIẢNG DẠY</h3>
<div style="margin-left: 100px">


</div>

<table id="main" style="text-align: center;margin-top: 40px; margin-left: 30px;" border="1">
    <tr>
        <th style="padding: 10px">Tên lớp</th>
        <th style="padding: 10px">Kíp</th>
        <th style="padding: 10px">Môn học</th>
        <th style="padding: 10px">Tên bài học</th>
        <th style="padding: 10px">Loại</th>
        <th style="padding: 10px">Ghi chú</th>
    </tr>

    <c:forEach items="${list}" var="l">
        <tr>
            <th>${l.tenlop}</th>
            <th>${l.kip}</th>
            <th>${l.tenmonhoc}</th>
            <th>${l.tenbaihoc}</th>
            <th>${l.loai}</th>
            <th>${l.ghichu}</th>
        </tr>
    </c:forEach>

</table>



</body>

</body>
</html>
