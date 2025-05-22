
class  Mydata
{
synchronized public void display( String str)
{
    for( int i = 0;i< str.length();i++)
    {
        System.out.print(str.charAt(i));


    }

}



}
class  Mythread1 extends Thread
{
    Mydata d;
    Mythread1(Mydata d)
    {

    this.d = d;
    }
 public void  run()
 {

     d.display( "hello world");

 }


}
class  Mythread2 extends Thread
{
    Mydata d;
    Mythread2 (Mydata d)
    {

        this.d = d;
    }
    public void  run()
    {

        d.display( "      welcome all");

    }


}



public class Main {
    public static void main(String[] args) {
       Mydata data = new Mydata();
        Mythread1 t1=new Mythread1(data);
        Mythread2 t2=new Mythread2(data);

       t1.start();
       t2.start();
    }
}