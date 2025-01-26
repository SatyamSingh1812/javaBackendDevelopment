package JavaBackendDevelopment.Class.BasicClassObject;

public class Student {
    int age;
    String name;
    void Address(){
        System.out.println("Address is Delhi");
    }
    public static void main(String[] args) {
        //here I will create an object for class Student
        //Syntax -- className ref_variable = new className();
        Student st1 = new Student();
        //we can call any method or state which is present in class
        //by . operator
        st1.age = 18;
        st1.name= "Sam";
        System.out.println(st1.name+" "+st1.age);
        st1.Address();



    }
}
