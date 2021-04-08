package com.example.Test;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        List<Users> list = Bean.ExportUsers();

        out.println("<head>");
        out.println("<title>Result</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border = '1'>");



        for (Users tv : list){
            out.println("<tr>");
            out.println("<td>"+tv.getName1()+"</td>");
            out.println("<td>"+tv.getName2()+"</td>");
            out.println("</tr>");
        }


        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}