package Client;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ClientInfo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("Big5");
        response.setContentType("text/html; charset=Big5");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("chkColor");
        String name_enc = new String(name.getBytes("ISO-8859-1"), "Big5");
        String[] values = request.getParameterValues(name_enc);
        if(values!=null){
            for(int i = 0;i<values.length;i++){
                out.println();
            }
        }


    }
}
