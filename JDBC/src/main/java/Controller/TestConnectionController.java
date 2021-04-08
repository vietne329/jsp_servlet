package Controller;

import DB.DBConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet(name = "TestConnectionController", value = "/TestConnectionController")
public class TestConnectionController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = DBConnection.CreateConnection();
        PrintWriter out = response.getWriter();

        if(conn != null){
            out.println("<h1>Ket noi JDBC thanh cong</h1>");
        }else {
            out.println("<h1>Ket noi JDBC that bai</h1>");
        }
    }
}
