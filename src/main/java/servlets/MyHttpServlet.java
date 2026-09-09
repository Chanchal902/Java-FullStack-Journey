package servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/SecondDemo")
public class MyHttpServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("<html><body>");
        pw.print("<h2>Servlet</h2>");
        pw.print("<p>Everything is working fine! amazing job ! Well done!</p>");
        pw.print("</body></html>");

        pw.close();
    }
}
