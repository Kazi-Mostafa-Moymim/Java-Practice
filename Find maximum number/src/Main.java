import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      int m1,m2,m3 ;
      Scanner sc = new Scanner( System.in);
      System.out.println( " Enter the number of three  subjects ");
       m1 = sc.nextInt();
       m2 = sc.nextInt();
       m3 = sc.nextInt();
        float avrg = (m1+m2+m3)/3 ;
        if (avrg >= 80 )
        {
        System.out.println("  A+ ");
        } else if (avrg >=70 && avrg >=79 ) {
            System.out.println(" A");
        } else if (avrg > 59 && avrg <70) {
            System.out.println(" A- ");
        }
else
     System.out.println( " fail");

    }
}