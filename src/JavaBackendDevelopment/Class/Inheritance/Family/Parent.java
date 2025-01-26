package JavaBackendDevelopment.Class.Inheritance.Family;

public class Parent {
    void height()
    {
        System.out.println("The height is : 6.3 ft.");
    }
    void color()
    {
        System.out.println("fair color.");
    }
}
class  child extends Parent
{
    public static void main(String[] args) {
        /** Here child is inhering the property of
          its parent class ;

         */
        child c1 = new child();
        c1.height();
        c1.color();
    }

}
