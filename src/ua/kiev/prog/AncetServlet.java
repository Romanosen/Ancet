package ua.kiev.prog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

//@WebServlet(name = "AncetServlet")
public class AncetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       //чтение ранее сохраненных анкет в список

        ArrayList<AncetAnswer> list= new ArrayList<AncetAnswer>();
      //  File f=new File("F:\\base.txt");
//        if(f.length()==0){
//            response.getWriter().println("Oops emty file");
//        }
//else{
        try
        {
            FileInputStream fis = new FileInputStream("F:\\base.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
//        }


//создание анкеты текущего пользователя
        AncetAnswer aa=new AncetAnswer();

        aa.setQuestion1(request.getParameter("q1"));
        aa.setQuestion2(  request.getParameter("q2"));
        aa.setQuestion3(  request.getParameter("q3"));
        aa.setQuestion4(  request.getParameter("q4"));

//добавление текущей анкеты в список и запись списка в файл
        list.add(aa);
        try{
            FileOutputStream fos= new FileOutputStream("F:\\base.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }



        //заполнение статистики на основе анкет в списке
        AncetStatistic statistic=new AncetStatistic();
        for(AncetAnswer a:list)
        {
            //Question 1
            if(a.getQuestion1().equals("yes")){
                statistic.setQ1yes(new AtomicInteger( statistic.getQ1yes().intValue()+1));
            }
            else {
                statistic.setQ1no(new AtomicInteger( statistic.getQ1no().intValue()+1));
            }

            //Question 2

            if(a.getQuestion2().equals("yes")){
                statistic.setQ2yes(new AtomicInteger( statistic.getQ2yes().intValue()+1));
            }
            else {
                statistic.setQ2no(new AtomicInteger( statistic.getQ2no().intValue()+1));
            }

            //Question 3
            if(a.getQuestion3().equals("yes")){
                statistic.setQ3yes(new AtomicInteger( statistic.getQ3yes().intValue()+1));
            }
            else {
                statistic.setQ3no(new AtomicInteger( statistic.getQ3no().intValue()+1));
            }

            //Question 4
            if(a.getQuestion4().equals("yes")){
                statistic.setQ4yes(new AtomicInteger( statistic.getQ4yes().intValue()+1));
            }
            else {
                statistic.setQ4no(new AtomicInteger( statistic.getQ4no().intValue()+1));
            }




        }




        response.getWriter().println("<html><h1>" +
                "<br>"+ "Statistic is:"+"<br>"+ "ancets count "+ list.size()+
                "<br>"+statistic.toString()+"</h1></html>");
//        response.sendRedirect("index.html");
    }






    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
