package pck;
import java.util.Scanner;

public class DenemeSinifi {
    public static void main(String[] args) {
        System.out.print("Please sign the KM of ride : ");
        double kmOfRide = new Scanner(System.in).nextDouble();
        double dept = 10+ kmOfRide*(2.20);
        if (dept < 20) dept = 20;
        System.out.println("The dept of the ride is = " + dept);
    }
}
