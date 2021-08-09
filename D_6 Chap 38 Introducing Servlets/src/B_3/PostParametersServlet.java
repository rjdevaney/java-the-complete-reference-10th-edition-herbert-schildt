/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_3;

/**
 *
 * @author henryubuntu
 */
import java.io.*;
import java.util.*;
import javax.servlet.*;

public class PostParametersServlet
        extends GenericServlet {

    public void service(ServletRequest request,
            ServletResponse response)
            throws ServletException, IOException {

        // Get print writer. 
        PrintWriter pw = response.getWriter();

        // Get enumeration of parameter names. 
        Enumeration e = request.getParameterNames();

        // Display parameter names and values. 
        while (e.hasMoreElements()) {
            String pname = (String) e.nextElement();
            pw.print(pname + " = ");
            String pvalue = request.getParameter(pname);
            pw.println(pvalue);
        }
        pw.close();
    }
}
