package servlets;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/helloo") // Maps this filter to requests hitting "/helloo"
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
        // Called once when the filter is loaded by the container
        System.out.println("HelloFilter initialised!");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        // Runs before the request reaches the servlet
        System.out.println("Request received at: " + System.currentTimeMillis());
        // Passes control to the next filter/servlet in the chain
        chain.doFilter(req, res);
        // Runs after the servlet has finished processing, before response goes to client
        System.out.println("Response sent back");
    }

    @Override
    public void destroy() {
        // Called once when the filter is being taken out of service
        System.out.println("HelloFilter destroyed!");
    }

}
