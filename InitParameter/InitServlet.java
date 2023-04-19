import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InitServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Init parameters are");
        Enumeration enumeration = getServletConfig().getInitParameterNames();
        while (enumeration.hasMoreElements()) {
            out.println(enumeration.nextElement());
        }
        out.println("The email address is : " + getServletConfig().getInitParameter("email"));
        out.println("The address is :c" + getServletConfig().getInitParameter("Address"));
        out.println("The phone number is : " + getServletConfig().getInitParameter("Phone"));
    }
}
