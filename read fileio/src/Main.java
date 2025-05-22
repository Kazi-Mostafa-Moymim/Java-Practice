import java.io.*;

public class Main {
    public static void main(String[] args) throws  Exception
    {
        FileInputStream fl = new FileInputStream("E:/Java code practice basic to advance/Test.txt");
       byte b[] = new byte[fl.available()];

        fl.read(b);
        String str = new String(b);
        System.out.println(str);

    }
}