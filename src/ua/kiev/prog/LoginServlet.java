package ua.kiev.prog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet extends HttpServlet {

    static final String TEMPLATE = "<html>" +
            "<head><title>Prog.kiev.ua</title></head>" +
            "<body><h1>%s</h1></body></html>";

    static final Map<String, String> cred = new HashMap<String, String>();

    static {
        // hardcode login credentials
        cred.put("roman", "1111");
        cred.put("andry", "2222");
        cred.put("ivan", "3333");
        cred.put("pit", "4444");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String pass = req.getParameter("password");
        String msg;

        String temp = cred.get(login);
        if (pass.equals(temp))
            msg = "Success";
        else
            msg = "Denied";


        resp.getWriter().println(String.format(TEMPLATE, msg));
        resp.sendRedirect("/ancet.jsp");
    }
}
