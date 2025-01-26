package JavaBackendDevelopment.Class.Encapsulation.DogExample;
/** Encapsulation means binding of data member and method
 together into single unit/class;
 if it is private then it'll be used within same class only
 if it is public then it'll be use anywhere like in same class ,other class
 ,package

 **/

public class DogColor {
    /**
     --if I'll make dogColor as private , then it'll be accessed within same method
     not outside of it.
     --To make it accessible outside the class then need to made it public
     */
    private String dogColor;
     public String getDogColor()
    {
        return dogColor;
    }
    public void setDogColor(String color)
    {
        this.dogColor= color;
    }

}

