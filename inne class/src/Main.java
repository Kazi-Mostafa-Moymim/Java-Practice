class outer
{
    int x = 20;
    class inner
    {
        int y = 30;
        void  innerDisplay ()
        {
            System.out.println( " inner class  " +x+ " "+y);
        }
    }
         void  outerDisplay ()
        {
    inner i = new inner();
    i.innerDisplay();



           }


}

public class Main {
    public static void main(String[] args) {
        outer o = new outer();
        o.outerDisplay();

        outer.inner oi = new outer().new inner();
        oi.innerDisplay();

    }
}