package pck;
import java.util.Scanner;

public class DenemeSinifi {
    public static void main(String[] args) {
        double Armut = 2.14, Elma = 3.67,domates=1.11,muz=0.95,Patlıcan=5;
        double kgOfThing,total=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        kgOfThing = scan.nextDouble();
        total+=kgOfThing*Armut;
        System.out.print("Elma kaç kilo ? : ");
        kgOfThing = scan.nextDouble();
        total+=kgOfThing*Elma;
        System.out.print("Domates kaç kilo ? : ");
        kgOfThing = scan.nextDouble();
        total+=kgOfThing*domates;
        System.out.print("Muz kaç kilo ? : ");
        kgOfThing = scan.nextDouble();
        total+=kgOfThing*muz;
        System.out.print("Patlıcan kaç kilo ? : ");
        kgOfThing = scan.nextDouble();
        total+=kgOfThing*Patlıcan;
        System.out.println("Toplam tutar : " + total);
    }
}
