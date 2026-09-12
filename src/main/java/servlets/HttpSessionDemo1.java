package servlets;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/httpsession1")
public class HttpSessionDemo1 extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("user");

        if (username != null) {
            pw.println("Welcome back " + username);
        } else {
            pw.println("No session found");
        }
        pw.close();


    }
}
