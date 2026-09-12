package servlets;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/httpsession")
public class HttpSessionDemo extends HttpServlet{
    public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
        String username = req.getParameter("username");
        // take session object
        HttpSession session = req.getSession();
        //add data to the session
        session.setAttribute("user",username);

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("Session created for " + username);
        pw.close();
    }
}
