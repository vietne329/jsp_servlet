package Controller;

import Bean.Account;
import DAO.RegisterDAO;
import DB.DBConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "RegisterController", value = "/RegisterController")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = DBConnection.CreateConnection();
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");

        Account acc = new Account();
        acc.setUsername(uname);
        acc.setPassword(pass);

        boolean check = RegisterDAO.insertAccount(conn,acc);
        if(check){
            request.setAttribute("msg","Register Success");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
            rd.forward(request,response);

        }else{
            request.setAttribute("msg2","Register Failed");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
            rd.forward(request,response);
        }
    }
}
