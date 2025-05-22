import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" MENU");
        System.out.println("=====");
        System.out.println(" ADD");
        System.out.println(" SUB");
        System.out.println(" MUL");
        System.out.println(" DIV");
        System.out.println(" Enter Two number");
        int x = s.nextInt();
        int y = s.nextInt();
        s.nextLine();
        System.out.println("Enter the option");
        String option = s.nextLine();
        option = option.toUpperCase();

        switch (option) {
            case "ADD":
                System.out.println("Sum is " + (x + y));
                break;
            case "SUB":
                System.out.println("Difference is " + (x - y));
                break;
            case "MUL":
                System.out.println("Product is " + (x * y));
                break;
            case "DIV":
                System.out.println("Ratio is " + (x / y));
                break;
            default:
                System.out.println("Invalid Option");
                break;


        }
    }
}