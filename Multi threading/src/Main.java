
class Mythread  extends  Thread
{
    public void  run()
    {
        int i = 0;
        while (true) {
            System.out.println(i + " hello");
            i++;
        }
    }


}






public class Main {
    public static void main(String[] args) {



        Mythread My = new Mythread();
        My.start();
        int i = 0;
        while (true)
        {
            System.out.println(i+" world");
            i++;

        }

    }
}