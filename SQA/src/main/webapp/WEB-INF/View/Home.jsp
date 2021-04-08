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
        <div>
            <h5> Xin chào: <%=request.getAttribute("tenGiangVien")%></h5>
        </div>

        <ul class="navbar-nav">
            <a  style="margin-left: 100px; color: white" href="LogoutController"
                   class="nav-link">Đăng xuất</a>
        </ul>
    </nav>
</header>



    <h3 style=" margin-top: 10px;text-align: center;padding-bottom: 5px">QUẢN LÝ LỚP HỌC PHẦN</h3>
<div style="margin-left: 100px">

    <h5 style="margin-top: 40px;">Thông tin giảng dạy</h5>

    <h5 style="margin-top: 10px;">Giáo viên: <%=request.getAttribute("tenGiangVien")%></h5>


</div>
    <a style="font-weight: bold;margin-top: 20px; margin-left: 100px;" href="RegisterForward">Thêm lịch giảng dạy mới</a>


    <table id="main" style="text-align: center;margin-top: 40px; margin-left: 30px;" border="1">
        <tr>

            <th style="padding: 10px" >Lớp</th>
            <th style="padding: 10px">Môn học</th>
            <th style="padding: 10px">Số tín</th>
            <th style="padding: 10px">Số kíp</th>
            <th style="padding: 10px">Số tiết lý thuyết</th>
            <th style="padding: 10px">Số tiết thực hành</th>
            <th style="padding: 10px">Ghi chú</th>
        </tr>

        <c:forEach items="${list_class}" var="l">
            <tr>
                <th>${l.tenlop}</th>
                <th>${l.tenmonhoc}</th>
                <th>${l.sotin}</th>
                <th>${l.sokip}</th>
                <th>${l.sokiplythuyet}</th>
                <th>${l.sokipthuchanh}</th>
                <th> <a href="viewplan?scid=${l.id}">Xem kế hoạch</a> <a href="createplan?scid=${l.id}">Lập kế hoạch</a> <a style="color: orange" href="updateclass?scid=${l.id}">Sửa, </a><a style="color: red" href="deleteclass?scid=${l.id}">Xóa</a></th>
            </tr>
        </c:forEach>

    </table>



</body>

</body>
</html>
