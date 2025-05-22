//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int A[] = new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        int n = 6;
        for(int i = 0;i<A.length;i++)
            System.out.print(A[i]+",");
            System.out.println( " ");
            int x = 20;
            int index = 3;
            for( int i = n;i >index;i--)
                A[i]=A[i-1];
              A[index]=x;
        for(int i = 0;i<=A.length;i++)
            System.out.print(A[i]+",");
        System.out.println("");









    }
}