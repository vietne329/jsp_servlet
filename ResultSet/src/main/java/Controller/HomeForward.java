package Controller;

import Bean.Account;
import DAO.HomeDAO;
import DB.DBConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(name = "HomeForward", value = "/HomeForward")
public class HomeForward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = DBConnection.CreateConnection();
        List<Account> list = HomeDAO.selectAccount(conn);

        request.setAttribute("list_account",list);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
