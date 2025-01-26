package JavaBackendDevelopment.Class.Inheritance.Car;
/**
    Here I have extends the parent class[vehicle] by using
    keyword extends , so that bike class can get all the property and behaviour of
    it  parent class
 */
/** Here bike is child of Vehicle*/
public class Bike extends Vehicle {
    int mileage;
    int price;

    public static void main(String[] args) {
        Bike bmw = new Bike();
        bmw.price = 1000000;
        bmw.mileage=110;
        bmw.color= "Black";
        System.out.println(bmw.mileage+" "+ bmw.price+" "+bmw.color);

    }
}
