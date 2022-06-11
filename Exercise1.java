package javaprogramming.lab3;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.*;
public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 rp = new Exercise1();
        rp.readData();

    }

    public void readData() {
        try {
            
            InputStream is = new FileInputStream("Out");

            int c;
            while ((c = is.read()) != -1) {
                c += 3;
                System.out.print((char) c);

            }
            //close
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
