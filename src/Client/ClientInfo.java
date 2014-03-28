package Client;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ClientInfo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("Big5");
        response.setContentType("text/html; charset=Big5");
        PrintWriter out = response.getWriter();

        String name[] = request.getParameterValues("chkColor");
        //String name2 = new String(name.getBytes("ISO-8859-1"), "Big5");
        // String values[] = request.getParameterValues(name2);

        if (name != null) {
            out.println("<HTML>");
            out.println("<BODY>");

            for (int i = 0; i < name.length && name.length >= 3; i++) {
                String name2 = new String(name[i].getBytes("ISO-8859-1"), "Big5");
                out.println("[" + i + "]" + name2 + "<br/>");
            }
            out.println("</BODY>");
            out.println("</HTML>");
        } else if (name.length < 3 && name.length > 0) {
            out.print("至少選三項!");
        } else if (name==null) {
            out.print("空值!");
        }


    }
}
