import static java.lang.Thread.sleep;

class Atm
{
    synchronized  public  void checkBalance(String name)
    {
     System.out.println(name+" Checking");
     try {
      sleep(1000);
     }
     catch (Exception e){}
        System.out.println(" balance");

    }
    synchronized  public void withdraw( String name,int amount)
    {
        System.out.println(name+" withdrawing");



        try {
            sleep(1000);
        }
        catch (Exception e){}
        System.out.println(amount);
    }


}
class  customer extends  Thread
{
    String  name;
    int amount;
    Atm atm;
    customer( String s,int am,Atm atm )
    {
        name = s;
        amount = am;
        this.atm = atm;
    }
    public void useAtm()
        {
            atm.checkBalance(name);
            atm.withdraw(name ,amount);
        }
    public  void  run()
    {
        useAtm();


    }

}





public class Main {
    public static void main(String[] args) {
        Atm a = new Atm();
        customer c1= new customer("Auntu",5000,a);
        customer c2= new customer("adiba ",10000,a);
        c1.start();
        c2.start();


    }
}