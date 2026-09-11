package servlets;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/secondcookies")
public class CookiesSecond extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //set content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie ck[] = request.getCookies();
        out.print("Hello " + ck[0].getValue());

        out.close();
    }
}
