package Controller;

import Bean.StudyClass;
import DAO.RegisterDAO;
import DAO.StudyClassDAO;
import DB.DBConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "DeleteController", value = "/deleteclass")
public class DeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("scid");
        StudyClassDAO studyClassDAO = new StudyClassDAO();
        try {
            studyClassDAO.deleteClass(Integer.parseInt(id));
            Connection conn = DBConnection.CreateConnection();
            List<StudyClass> list = RegisterDAO.listClass(conn);
            request.setAttribute("list_class",list);

            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
            rd.forward(request,response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
