package Controller;

import Bean.Province;
import Bean.Student;
import DAO.HomeDAO;
import DB.DBConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "HomeController", value = "/HomeController")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = DBConnection.CreateConnection();

        String stu_name = request.getParameter("student_name");
        String province_str = request.getParameter("dropdownprovince");

        int province_id = Integer.parseInt(province_str);

        Student stu = new Student();
        stu.setName(stu_name);
        stu.setProvince_id(province_id);

        boolean check = HomeDAO.addStudent(conn , stu);
        if(check){
            request.setAttribute("msg_student","Add student success!");

            List<Province> list = HomeDAO.getProvincesList(conn);

            request.setAttribute("list_province",list);

            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Home.jsp");
            rd.forward(request,response);
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }else {
            request.setAttribute("msg_student","Add student failed!");

            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Home.jsp");
            rd.forward(request,response);
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
