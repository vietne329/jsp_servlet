package Controller;

import Bean.StudyClass;
import DAO.RegisterDAO;
import DB.DBConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(name = "BackHomeForward", value = "/BackHomeForward")
public class BackHomeForward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = DBConnection.CreateConnection();
        List<StudyClass> list = RegisterDAO.listClass(conn);
        request.setAttribute("list_class",list);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
