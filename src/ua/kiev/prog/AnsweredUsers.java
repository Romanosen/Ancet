package ua.kiev.prog;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

public class AnsweredUsers implements Serializable{
public static List<String> ausers=new ArrayList<String>();

public static void readAusers(){
        try(FileInputStream fis = new FileInputStream("F:\\ausers.txt"); ) {

            ObjectInputStream ois = new ObjectInputStream(fis);
            ausers = (List<String>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }



    }
    public static void writeAusers(){
        try(FileOutputStream fos= new FileOutputStream("F:\\ausers.txt");){
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(ausers);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}
