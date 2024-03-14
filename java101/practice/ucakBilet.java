package pck;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class ucakBilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance,normalPrice,discountedPrice,totalPrice;
        int age;
        double ageDiscount=0,typeDiscount=0;
        byte ucmaTipi;

        System.out.print("Please sign the distance(KM) : ");
        distance = input.nextDouble();
        if(distance <=0) System.out.println("You signed wrong data.");

        System.out.print("Please sign your age : ");
        age = input.nextInt();
        if(age <=0) System.out.println("You signed wrong data.");

        System.out.print("Please sign the type of fly : ");
        ucmaTipi = input.nextByte();
        if(!(ucmaTipi == 1 || ucmaTipi == 2 ) ) System.out.println("You signed wrong data.");
        normalPrice = 0.10 * distance;
        if(age<12) ageDiscount = 50;
        else if (age <=24)ageDiscount = 10;
        else if (age >= 65)ageDiscount =30;
        if(ucmaTipi == 2){
            typeDiscount=20;
            normalPrice*=2;
        }
        discountedPrice = normalPrice*(100-ageDiscount)/100;
        discountedPrice*=(100-typeDiscount)/100;
        System.out.println("Total price is : " + discountedPrice);

    }
}
