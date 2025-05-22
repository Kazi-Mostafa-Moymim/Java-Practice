import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the Number");
        int n = s.nextInt();
        int m = n ;
        int count = 0;
        int reverse = 0;
        while ( n >0)
        {

            int r = n%10;
            reverse = reverse *10 + r;
            n = n/10 ;
            count++;
            System.out.println(r);


        }

        System.out.println("digit count is "+count);
        System.out.println("reverse is  "+reverse);
        if ( reverse == m)
        {
            System.out.println("This is palindrome  ");

        }
        else
            System.out.println("This is  not palindrome  ");

    }
}