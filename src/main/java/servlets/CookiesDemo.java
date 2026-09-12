// 1. create cookie and send it in response
package servlets;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/cookiedemo")
public class CookiesDemo extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String username = req.getParameter("username");
        //create cookie object
        Cookie ck = new Cookie("user", username);
        ck.setMaxAge(60 * 60);

        res.addCookie(ck);

        // set content type
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("Cookie is set for " + username);

        pw.close();
    }
}
