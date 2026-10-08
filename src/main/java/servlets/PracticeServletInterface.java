package servlets;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/practice")
public class PracticeServletInterface implements Servlet {
    ServletConfig config = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet is initialised!");
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>Successful First Trial!</b>");
        out.print("</body></html>");
        out.close();
    }

    public void destroy() {
        System.out.println("Servlet is destroyed!");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "copyright 2007-1010";
    }
}
