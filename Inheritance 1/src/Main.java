 class Parent
 {
     public  Parent()
     {
         System.out.println( " Parent Constructor");
     }
 }
 class Child extends  Parent
 {
     public  Child()
     {
         System.out.println(" CHild Constructor");
     }

 }


public class Main {
    public static void main(String[] args) {

   Parent P = new Parent();
   Child c = new Child();
    }
}