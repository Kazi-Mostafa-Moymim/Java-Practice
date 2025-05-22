import java.io.*;
public class Main {
    public static void main(String[] args) throws  Exception
    {


            FileOutputStream fl = new FileOutputStream("E:/Java code practice basic to advance/Test.txt");

         String str = " Learn java Programming";
        byte b[] = str.getBytes();
        fl.write(b);
        fl.close();



    }
}