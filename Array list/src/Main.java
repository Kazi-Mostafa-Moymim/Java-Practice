import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(20);
        ArrayList<Integer> A2 = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90,100));

        A1.add(1);
        A1.add(1,5);
        A1.addAll(A2);
      System.out.println(  A1.contains(0));
        System.out.println(A1.get(5));
        System.out.println(A1);
        for(var x : A1)
        {
            System.out.println(x);
        }

    }
}