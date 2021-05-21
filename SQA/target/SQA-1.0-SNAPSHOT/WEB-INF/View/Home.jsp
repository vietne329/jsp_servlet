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

        <ul class="navbar-nav">
            <a  style="margin-left: 100px; color: white" href="LogoutController"
                   class="nav-link">Đăng xuất</a>
        </ul>
    </nav>
</header>



    <h3 style=" margin-top: 10px;text-align: center;padding-bottom: 5px">QUẢN LÝ LỚP HỌC PHẦN</h3>
<div style="margin-left: 100px">


    <h5 style="margin-top: 10px;">Giáo viên: <%=request.getAttribute("tenGiangVien")%></h5>


</div>
    <a style="font-weight: bold;margin-top: 20px; margin-left: 100px;" href="RegisterForward">Thêm lịch giảng dạy mới</a>


    <h5 style="margin-left: 30px;margin-top: 30px">DANH SÁCH LỚP HỌC PHẦN</h5>

    <table id="main" style="text-align: center;margin-top: 20px; margin-left: 30px;" border="1">
        <tr>

            <th style="padding: 20px" >Lớp</th>
            <th style="padding: 20px">Môn học</th>
            <th style="padding: 20px">Số tín</th>
            <th style="padding: 20px">Số kíp</th>
            <th style="padding: 20px">Số tiết lý thuyết</th>
            <th style="padding: 20px">Số tiết thực hành</th>
            <th style="padding: 20px">Thời gian</th>
            <th style="padding: 20px">Ghi chú</th>
        </tr>

        <c:forEach items="${list_class}" var="l">
            <tr>
                <th style="padding: 10px">${l.tenlop}</th>
                <th style="padding: 10px">${l.tenmonhoc}</th>
                <th style="padding: 10px">${l.sotin}</th>
                <th style="padding: 10px">${l.sokip}</th>
                <th style="padding: 10px">${l.sokiplythuyet}</th>
                <th style="padding: 10px">${l.sokipthuchanh}</th>
                <th style="padding: 10px">${l.thoigian}</th>
                <th style="padding: 10px"> <a href="viewplan?scid=${l.id}">Đăng ký</a> </th>
            </tr>
        </c:forEach>

    </table>

    <h5 style="margin-left: 30px;margin-top: 30px">DANH SÁCH LỚP HỌC PHẦN ĐÃ ĐĂNG KÝ</h5>

<table id="main2" style="text-align: center;margin-top: 20px; margin-left: 30px; margin-bottom: 50px" border="1">
    <tr>

        <th style="padding: 20px" >Lớp</th>
        <th style="padding: 20px">Môn học</th>
        <th style="padding: 20px">Số tín</th>
        <th style="padding: 20px">Số kíp</th>
        <th style="padding: 20px">Số tiết lý thuyết</th>
        <th style="padding: 20px">Số tiết thực hành</th>
        <th style="padding: 20px">Thời gian</th>
        <th style="padding: 20px">Chức năng</th>
    </tr>

    <c:forEach items="${list_class}" var="l">
        <tr>
            <th style="padding: 10px">${l.tenlop}</th>
            <th style="padding: 10px">${l.tenmonhoc}</th>
            <th style="padding: 10px">${l.sotin}</th>
            <th style="padding: 10px">${l.sokip}</th>
            <th style="padding: 10px">${l.sokiplythuyet}</th>
            <th style="padding: 10px">${l.sokipthuchanh}</th>
            <th style="padding: 10px">${l.thoigian}</th>
            <th style="padding: 10px"> <a style="color: #28a745" href="viewplan?scid=${l.id}">Xem kế hoạch</a> <br> <a href="viewplan?scid=${l.id}">Lập kế hoạch</a>
                <br> <a style="color: red" href="viewplan?scid=${l.id}">Xóa</a> </th>
        </tr>
    </c:forEach>



</table>
</body>

</body>
</html>
