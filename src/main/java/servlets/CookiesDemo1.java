// 2. To read the cookie when user sends another request
package servlets;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/cookiedemo1")
public class CookiesDemo1 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        Cookie[] cookies = req.getCookies();

        String username = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    username = c.getValue();
                }
            }
        }

        if (username != null) {
            pw.println("Welcome back " + username);
        } else {
            pw.println("No cookie found");
        }
        pw.close();
    }
}
