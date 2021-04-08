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
        u.setUsername(name);
        u.setPassword(pass);

        boolean check = LoginDAO.Validate(u.getUsername(), u.getPassword());
        if(check==true){

            HttpSession session = request.getSession(true);
            session.setAttribute("sess",name);

            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
            rd.forward(request,response);

        }else{
            request.setAttribute("msg","LOGIN FAILED");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
            rd.forward(request,response);

        }
    }

}
