package pck;
import java.util.Scanner;

public class DenemeSinifi {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.print("Please enter the value of radius :");
        double radius = new Scanner(System.in).nextDouble();
        if(radius < 0) System.out.println("The radius cannot smaller than 0");
        System.out.print("Please enter the angle of sector :");
        double angle = new Scanner(System.in).nextDouble();
        if(angle == 0)System.out.println("if the angle of circle is 0 then the circle is just a dot.");
        else if(angle > 0){
            System.out.println("Circumference of the circle is = "+ 2*PI*radius);
            System.out.println("Area of sector is =  " + PI*(radius*radius)*angle/360);
        }
        else System.out.println("The angle is cannot smaller than 0!!!!");
    }
}
