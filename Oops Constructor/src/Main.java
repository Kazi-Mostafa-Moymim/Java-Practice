
class  Rectangle {

    private double length;
    private double breadth;
    public Rectangle()
    {
       length = 1;
       breadth = 1;
    }
    public Rectangle(int l ,int b)
    {
      length = l;
      breadth = b;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth)
            return true;
        else
            return false;
    }


}


public class Main {



    public static void main(String[] args) {

        Rectangle r = new Rectangle( 10,5);


        System.out.println("Area" + r.area());
        System.out.println("perimeter" + r.perimeter());

        System.out.println("Is it a Square" + r.isSquare());

    }
}