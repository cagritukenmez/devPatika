package pck;
import java.util.Scanner;

public class DenemeSinifi {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanDouble = new Scanner(System.in);

        System.out.print("Please sign a side of triangle : ");
        a = scanDouble.nextDouble();

        System.out.print("Please sign the other side of triangle : ");
        b = scanDouble.nextDouble();

        System.out.print("Please sign the last side of the triangle : ");
        c = scanDouble.nextDouble();

        double halfPerimeter =  (a+b+c)/2;
        double areaOfTriangle = Math.sqrt(halfPerimeter * (halfPerimeter-a) * (halfPerimeter-b) * (halfPerimeter-c));
        System.out.println("The are of the triangle is : " + areaOfTriangle);
    }
}
