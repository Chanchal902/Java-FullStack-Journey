package servlets;
// Import required java libraries

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

// Extend HttpServlet class
@WebServlet("/ServletUsingURLDemo")
public class ServletUsingURLDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // set the response type
        response.setContentType("text/html");
        // get the stream to write the data
        PrintWriter pw = response.getWriter();

        //write html in the stream
        pw.println("<html> <body>");
        pw.println("Hello! Welcome to servlet ");
        pw.println("</body></html>");

        //close the stream
        pw.close();
    }
}
