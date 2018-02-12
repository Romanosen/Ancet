package ua.kiev.prog;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

public class AnsweredUsers implements Serializable{
public  List<String> ausers;

    public List<String> getAusers() {
        return ausers;
    }

    public void setAusers(List<String> ausers) {
        this.ausers = ausers;
    }

    public AnsweredUsers() {
        ausers =new ArrayList<String>();
    }

    public  void readAusers(){
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
    public  void writeAusers(){
        try(FileOutputStream fos= new FileOutputStream("F:\\ausers.txt");){
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject((List<String>)ausers);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}
