import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int A[] = new int[10];
        int B[] = {1, 2, 3, 4, 5, 6, 7};

        B[3] = 15;
        for (int i = 0; i < B.length; i++) {

            if (1 == B[i]) {

                System.out.println(" found at : " +i);
                System.exit(0);
            }
        }
        System.out.println(" Not found");
    }
}




