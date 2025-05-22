//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Rectangle
{
    private double lenght ;
     private double bredght ;
     Rectangle ()
     {
           lenght=bredght=1;
     }
     Rectangle (double l ,double b)
     {

         lenght = l;
         bredght = b ;
     }
     double getLenght(){ return  lenght;}
     double getBredght(){ return  bredght;}

    public void setLenght(double lenght) {
        this.lenght = lenght;

    }

    public void setBredght(double bredght) {
        this.bredght = bredght;
    }

    double area ()
    {
        return  lenght * bredght;

    }
    double perimeter ()
    {

        return  2*(lenght+bredght);

    }


}
class Cuboid extends  Rectangle
{
    private  double height ;
    public  Cuboid ()
    {
        height = 1;

    }
    Cuboid( double h)
    {
      height = h;

    }
Cuboid (double l,double b, double h)
{

    super( l,b);
    height = h;
}

   double volume ()
   {
       return  area()* height;
   }



}
\

public class Main {
    public static void main(String[] args) {
        Cuboid R = new Cuboid(5,6,20);

        System.out.println(R.getLenght());
        System.out.println(R.getBredght());
        System.out.println(R.area());
        System.out.println(R.perimeter());
        System.out.println(R.volume());
    }
}