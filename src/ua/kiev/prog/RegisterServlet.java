package ua.kiev.prog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class RegisterServlet  extends HttpServlet{



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String pass = req.getParameter("password");
        readUsers();
        LoginServlet.cred.put(login,pass);
        writeUsers();
        resp.getWriter().println("Register succed");


    }

    public static void readUsers(){
        try(FileInputStream fis = new FileInputStream("F:\\users.txt"); ) {

            ObjectInputStream ois = new ObjectInputStream(fis);
            LoginServlet.cred = (Map<String, String>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }



    }
    private void writeUsers(){
        try(FileOutputStream fos= new FileOutputStream("F:\\users.txt");){
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(LoginServlet.cred);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}
