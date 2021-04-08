package Controller;

import Bean.Users;
import DAO.LoginDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");

        Users u = new Users();
        u.setUsername("admin");
        u.setPassword("123456");

        boolean check = LoginDAO.Validate(u.getUsername(), u.getPassword());
        if(check==true){
            String msg1 = "Login Success!";
            request.setAttribute("msg1",msg1);
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/LoginSuccess.jsp");
            rd.forward(request,response);

        }else{
            String msg1 = "Login Failed!";
        }
    }
}
