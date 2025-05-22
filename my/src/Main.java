import java.util.Scanner;

public class Main {  // Change class name to match the file name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        int area = length * breadth;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
