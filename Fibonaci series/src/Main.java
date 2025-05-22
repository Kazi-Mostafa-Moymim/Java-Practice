

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  Scanner s = new Scanner(System.in);
        int n = s.nextInt();*/
         /* System.out.println(" Enter  a,d,n");
          int a = s.nextInt();
          int d = s.nextInt();
          int n = s.nextInt();

           for ( int i = 0 ;i <n;i++)
           {
               System.out.print(a+ " , ");

               a = a +d;




           }*/
           System.out.println(" Fibonaci series ");
            int e = 0;
            int f = 1;
            int n = 10;
            System.out.print(e+ ","+f + " ,");
            for(int j = 0; j < n -2;j++)
            {
                int  g = e+f;
                System.out.print(g+" ,");
                e = f;
                f=g;

            }



    }
}