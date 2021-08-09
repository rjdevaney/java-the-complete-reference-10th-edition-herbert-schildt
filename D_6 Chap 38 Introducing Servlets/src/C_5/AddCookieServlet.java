/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_5;

/**
 *
 * @author henryubuntu
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddCookieServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Get parameter from HTTP request. 
        String data = request.getParameter("data");

        // Create cookie. 
        Cookie cookie = new Cookie("MyCookie", data);

        // Add cookie to HTTP response. 
        response.addCookie(cookie);

        // Write output to browser. 
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>MyCookie has been set to");
        pw.println(data);
        pw.close();
    }
}
