package JavaBackendDevelopment.Class.Encapsulation.DogExample;
/** Encapsulation means binding of data member and method
 together into single unit/class;
 --if it is private then it'll be used within same class's method only.
 --if it is public then it'll be use anywhere like in same class ,other class
 ,package
 --it has full control over data and method because no one else can modify it

 **/


public class Dog {



    /** Here we will understand the concept of Encapsulation **/
    //private String dogColor;
    //getter is used to get/output the data
//    public String getDogColor()
//    {
//        return dogColor;
//    }
//    //setter is used to set the data
//    public void  setDogColor(String Color)
//    {
//        this.dogColor = Color;
//    }
    public static void main(String[] args) {
        Dog buzo = new Dog();
        //buzo.setDogColor("brown");
        //System.out.println(buzo.getDogColor());
//        buzo.dogColor ="Black";
//        System.out.println(buzo.dogColor);

        /*
            creating obj of DogColor class
            and access it in Dog class
        */
        DogColor tommy = new DogColor();

        tommy.setDogColor("grey");
        System.out.println(tommy.getDogColor());

    }


}

