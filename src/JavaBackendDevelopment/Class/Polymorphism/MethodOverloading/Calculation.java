package JavaBackendDevelopment.Class.Polymorphism.MethodOverloading;

import java.util.Scanner;

public class Calculation {
    int doSum(int a, int b)
    {
        return  a+b;
    }
    float doSum(int a, float b)
    {
        return  a+b;
    }
    float doSum(float a, float b)
    {
        return  a+b;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
//        float c = scn.nextFloat();
//        float d = scn.nextFloat();
       // System.out.println(a+b);
        Calculation sum = new Calculation();
        sum.doSum(a,b);

    }
}
