<%@ page import="java.util.List" %>
<%@ page import="com.example.Request_ImplicitObject.Users" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: vietmd329
  Date: 4/2/2021
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<Users> list = new ArrayList<Users>();
        list.add(new Users("Mai Dac Viet","Malware Analyst"));
        list.add(new Users("Mai Tat Dat","Malware Analyst"));

        request.setAttribute("list_user",list);
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request,response);
    %>
</body>
</html>
