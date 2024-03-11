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

        c = Math.hypot(a,b);

        System.out.print("The hypotenuse of the triangle : ");
        System.out.println(c);
    }
}
