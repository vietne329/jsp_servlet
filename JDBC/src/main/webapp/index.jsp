<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
    <%
    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/TestConnection.jsp");
    rd.forward(request,response);
    %>

</body>
</html>