
public class Main {


    static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
     static  int gcd(int m ,int n)
     {
         while(m!=n)
         {
             if(m>n)
                 m=m-n;
             else
                 n=n-m;
         }
         return  n;

     }


    public static void main(String[] args) {

        System.out.println(isPrime(23));
        System.out.println(gcd(25,30));
    }
}