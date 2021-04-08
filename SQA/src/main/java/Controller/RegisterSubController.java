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

@WebServlet(name = "RegisterSubController", value = "/RegisterSubController")
public class RegisterSubController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String tenlop = request.getParameter("tenlop");
        String tenmonhoc = request.getParameter("tenmonhoc");
        String sotin = request.getParameter("sotin");
        String sokip = request.getParameter("sokip");
        String lythuyet = request.getParameter("lythuyet");
        String thuchanh = request.getParameter("thuchanh");

        StudyClass sc = new StudyClass();
        sc.setTenlop(tenlop);
        sc.setTenmonhoc(tenmonhoc);
        sc.setSotin(Integer.parseInt(sotin));
        sc.setSokip(Integer.parseInt(sokip));
        sc.setSokiplythuyet(Integer.parseInt(lythuyet));
        sc.setSokipthuchanh(Integer.parseInt(thuchanh));

        Connection conn = DBConnection.CreateConnection();

        boolean check = RegisterDAO.addClassList(conn,sc);
        if(check){
            List<StudyClass> list = RegisterDAO.listClass(conn);
            request.setAttribute("list_class",list);

            request.setAttribute("msg_addClass","Thêm lịch giảng thành công!");
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Home.jsp");
            rd.forward(request,response);
        }
        request.setAttribute("msg_addClass","Thêm lịch giảng lỗi!");

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Home.jsp");
        rd.forward(request,response);
    }
}
