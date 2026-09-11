package servlets;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/firstcookies")
public class CookiesFirst extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // set content type
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String n = request.getParameter("userName");
        pw.print("Welcome" + n);

        //creating cookies object
        Cookie ck = new Cookie("uname", n);
        //adding cookie in the response
        response.addCookie(ck);

        //creating submit button
        pw.print("<form action = 'secondcookies' method='post'>");
        pw.print("<input type='submit' value='go'>");
        pw.print("</form>");

        pw.close();
    }
}
