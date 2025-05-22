

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println(" Enter the Number");
int n = s.nextInt();
long fact = 1;
for (int i = 1; i <= n; i++) {

    fact  = fact *i ;


        }
        System.out.println(fact);
    }
}