package servlets;
// import required java libraries

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/First")
public class MyServletInterfaceDemo implements Servlet {
    ServletConfig config = null;

    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Servlet is initialised!");
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.print("<html><body>");
        pw.print("<b>Successful First Trial!</b>");
        pw.print("</body></html>");
    }

    public void destroy() {
        System.out.println("servlet is destroyed!");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "copyright 2007-1010";
    }
}
