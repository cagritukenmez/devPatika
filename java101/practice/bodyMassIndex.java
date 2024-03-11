package pck;
import java.util.Scanner;

public class DenemeSinifi {
    public static void main(String[] args) {
        float height,mass;
        Scanner x= new Scanner(System.in);
        System.out.print("Please enter your height(kind of meter) : ");
        height = x.nextFloat();
        System.out.print("Please enter your mass(kind of kilogram) : ");
        mass = x.nextFloat();

        double heightMassIndex = mass/Math.pow(height,2);
        System.out.print("Your Height Mass Index is = " + heightMassIndex);
    }
}
