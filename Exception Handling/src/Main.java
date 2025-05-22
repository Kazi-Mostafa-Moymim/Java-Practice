import java.util.*;
public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println(" ENter two numbers");
        a = s.nextInt();
        b = s.nextInt();
        try {
            c = a / b;
            System.out.println(" answer is " + c);
        } catch (Exception e) {
            System.out.println(" Denominator should not be 0, try again" +e);

        }
    }
}