   class MultiThread  implements Runnable
   {

       @Override
       public void run() {
           int i = 0;
           while(true)
           {
              System.out.println(i+ " hello");
               i++;
             /* try
              {
               Thread.sleep(1);}
              catch (Exception e){}*/

           }
       }
   }

public class Main {
    public static void main(String[] args) {

        MultiThread mt = new MultiThread();
         Thread t = new Thread(mt);
         t.start();


        int i = 0;
        while(true)
        {
            System.out.println(i+ "world");
            i++;

        }
    }
}