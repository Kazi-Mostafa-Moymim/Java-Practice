//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String arr[]={"java","python","pascal","smalltalk","ada","basic"};

        java.util.Arrays.sort(arr);

        for(String x:arr)
            System.out.println(x);

        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int[3][3];

        System.out.println( "  Adding two Matrix");
        System.out.println( " =====================");


         for ( int i = 0 ;i<C.length;i++) {
             for (int j = 0; j < C[0].length; j++)
             {
                 C[i][j] = A[i][j] + B[i][j];
                 System.out.print( C[i][j]+" " );
             }
             System.out.println( " ");

         }
        System.out.println( "  Multipliying  two Matrix");
        System.out.println(    "===========================");

        for ( int i = 0 ;i<C.length;i++) {
            for (int j = 0; j < C[0].length; j++)
            {
                C[i][j] = 0;
                for( int k = 0;k <C.length;k++)
                {
                    C[i][j]= C[i][j]+A[i][k]*B[k][j];
                }
                System.out.print( C[i][j]+" " );
            }
            System.out.println( " ");

        }



        /*for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }*/




    }
}