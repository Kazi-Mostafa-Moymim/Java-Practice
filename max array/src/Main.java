//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int findMax(int[] arr) {
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

    public static void main(String[] args) {


        
            int[] numbers = {50, 34, 122, 78, 99, 90};
            System.out.println("Maximum element: " + findMax(numbers));

    }
}